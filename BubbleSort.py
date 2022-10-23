# Utility function to swap values at two indices in the list
def swap(A, i, j):
 
    temp = A[i]
    A[i] = A[j]
    A[j] = temp
 
 
# Function to perform bubble sort on a list
def bubbleSort(A):
 
    # `len(A)-1` passes
    for k in range(len(A) - 1):
 
        # last `k` items are already sorted, so the inner loop can
        # avoid looking at the last `k` items
        for i in range(len(A) - 1 - k):
            if A[i] > A[i + 1]:
                swap(A, i, i + 1)
 
    # the algorithm can be terminated if the inner loop didn't do any swap
 
 
if __name__ == '__main__':
 
    A = [3, 5, 8, 4, 1, 9, -2]
 
    bubbleSort(A)
 
    # print the sorted list
    print(A)
