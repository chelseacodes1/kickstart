# Logic
# Read in the input for a single clase
# Loop through candy counts list to get the total 
# Use % to find the amount of candy remaining
# Iterate to process each case

# Things to keep in mind  
# Output indexing starts at 0, cases start at 1 -> need to add 1 to the case num
# Check output format carefully and format string accordingly 

def processcase(case_num):
    # Read in input for a singly case 
    (num_candy_bags, num_kids) = tuple(map(int, input().split()))
    candy_counts = list(map(int, input().split()))
    
    # Calculate the amount of candy remaining 
    total_candy = 0 
    for i in range(num_candy_bags):
        total_candy += candy_counts[i]
    amount_remaining = total_candy % num_kids
    
    # Print out the formatted string 
    print(f"Case #{case_num}: {amount_remaining}")

# Take in input and iterate for each case 
num_cases = int(input())
for i in range(num_cases):
    processcase(i + 1)