#1
car='subaru'
print(car=='subaru')

car='subaru'
print(car=='bmw')


car='subaru'
print(car!='subaru')

car='subaru'
print(car!='bmw')  


#2
car='Subaru'
print(car.lower()=='subaru')

car='Subaru'
print(car.lower()=='SUBARU')      

print('\n')


#3
age_1=18

print(age_1 != 20)

print(age_1 == 18)    

print(age_1 < 20)

print(age_1 > 18)    

print(age_1 <= 18)

print(age_1 >= 20)

print('\n')


#4
age_1=18
age_2=20

print(age_1>15 and age_2<25)
print(age_1>25 and age_2<25)

print(age_1>25 or age_2<25)
print(age_1>25 or age_2<15)

print('\n')


#5
items = ['audi', 'subaru', 'honda', 'opel']

print('audi' in items)
print('porshe' in items)

print('\n')


#6
items = ['audi', 'subaru', 'honda', 'opel']

print('audi' not in items)
print('porshe' not in items)