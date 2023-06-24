car='subaru'
print("Is car == 'subaru'? I predict True.")
print(car=='subaru')

car='Subaru'
print("Is car == 'subaru'? I predict False.")
print(car=='subaru')

car='subaru'
print("Is car.title() == 'Subaru'? I predict True.")
print(car.title()=='Subaru')

car = 'subaru'
print("Is car == 'audi'? I predict False.")
print(car == 'audi')

car = 'SUBARU'
print("Is car == 'subaru'? I predict False.")
print(car == 'subaru')

car = 'SUBARU'
print("Is car.lower() == 'subaru'? I predict True.")
print(car.lower() == 'subaru')

car = 'Subaru'
print("Is car.upper() == 'Subaru'? I predict False.")
print(car.upper() == 'Subaru')

car = 'Subaru'
print("Is car.upper() == 'SUBARU'? I predict True.")
print(car.upper() == 'SUBARU')

car = 'volvo'
print("Is car.title() == 'Volvo'? I predict True.")
print(car.title() == 'Volvo')