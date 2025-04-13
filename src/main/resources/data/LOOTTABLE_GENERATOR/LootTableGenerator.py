import os

# File paths
block_ids_path = "block_ids.txt"
template_path = "template.json"
output_dir = "outputs"

# Create the output directory if it doesn't exist
os.makedirs(output_dir, exist_ok=True)

# Read the template content
with open(template_path, "r") as template_file:
    template_content = template_file.read()

# Read block IDs
with open(block_ids_path, "r") as f:
    block_ids = [line.strip() for line in f.readlines() if line.strip()]

# Generate JSON files
for block_id in block_ids:
    json_content = template_content.replace("INSTANCE", block_id)
    output_path = os.path.join(output_dir, f"{block_id}.json")
    with open(output_path, "w") as json_file:
        json_file.write(json_content)

print(f"Generated {len(block_ids)} JSON files in the '{output_dir}' folder.")
