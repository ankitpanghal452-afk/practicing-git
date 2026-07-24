# import numpy as np
# arr1=np.arange(10,25)
# print(arr1)

# arr2=arr1.reshape(3,5)
# print("new shape of array is :", arr2)

# print(arr2.ndim)
# print(arr2.dtype)
# print(arr2.size)


# import numpy as np
# arr1=np.arange(10,25)
# arr2=arr1.reshape(3,5)
# print(arr2)
# print(arr2[1::2,])
# print(arr2[::,3::])
# print(arr2[1,1:4])



import numpy as np
arr1=np.arange(10,25)
arr2=arr1.reshape(3,5)
# for row in arr2:
#     for i in row:
#         if i>=18:
#             print(i)
for row in arr2:
    for i in row:
        if i%2==0:
            i=-1
            print(arr2)        