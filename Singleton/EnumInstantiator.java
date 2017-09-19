package com.fortinet;
public class EnumInstantiator {

	public static void main(String[] args) {
		/*With Singleton Enum we dont have to worry about multiple instances being created using Reflection, 
		*Serialization and deserialization, because of multiple threads
		 * 
		 * There is no support for lazy initialization in enum
		 * If for some reason we dont want our instance to be singleton anymore enums wont support that either
		 */
		SingletonEnum singletonInstance = SingletonEnum.INSTANCE;
		System.out.println(singletonInstance.getValue());
		singletonInstance.setValue("ValueAssigned");
		System.out.println(singletonInstance.getValue());
		
		//Now even if we try to create a new instance it will return the value that was assigned when the instance was first created
		SingletonEnum singletonInstance2 = SingletonEnum.INSTANCE;
		System.out.println(singletonInstance2.getValue());
	}
	
}
