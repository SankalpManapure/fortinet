# fortinet
With Singleton Enum we dont have to worry about multiple instances being created using Reflection, 
Serialization and deserialization, because of multiple threads
 
There is no support for lazy initialization in enum
If for some reason we dont want our instance to be singleton anymore enums wont support that either.

EnumInstantiator instantiates SingletonEnum object.
