import os

# File paths
block_ids_path = "block_ids.txt"
template_path = "template.json"
output_dir = "outputs"

# Reference keywords and wood types to detect
reference_keywords = [
    "timber_frame",
    "timber_brace",
    "timber_cross_brace",
    "daub_frame",
    "daub_brace",
    "daub_cross_brace",
]

woodtypes = [
    "oak", "spruce", "birch", "jungle", "acacia", "dark_oak",
    "mangrove", "cherry", "bamboo", "crimson", "warped", "pale_oak"
]

# Ensure output directory exists
os.makedirs(output_dir, exist_ok=True)

# Load the template content
with open(template_path, "r") as template_file:
    template_content = template_file.read()

# Load block IDs
with open(block_ids_path, "r") as f:
    block_ids = [line.strip() for line in f.readlines() if line.strip()]

# Generate recipe JSONs
for block_id in block_ids:
    # Detect reference type
    reference = next((ref for ref in reference_keywords if ref in block_id), None)
    if not reference:
        print(f"Skipped {block_id}: no matching reference keyword found.")
        continue

    # Detect wood type
    woodtype = next((wt for wt in woodtypes if wt in block_id), None)
    if not woodtype:
        print(f"Skipped {block_id}: no matching wood type found.")
        continue

    # Replace placeholders
    json_content = (
        template_content
        .replace("INSTANCE", block_id)
        .replace("REFERENCE", reference)
        .replace("WOODTYPE", woodtype)
    )

    # Write to file
    output_path = os.path.join(output_dir, f"{block_id}.json")
    with open(output_path, "w") as json_file:
        json_file.write(json_content)

print(f"Generated recipe JSONs for {len(block_ids)} blocks (skipped any with missing data).")