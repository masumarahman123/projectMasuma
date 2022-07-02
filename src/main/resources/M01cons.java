package MasumaCons;
public class M01cons {

/* constructor is a special type of method whose name is like class name
	 * main purpose is initialized object
	 * all java class has a constructor(default)
	 * a Constructor is automatically called at the time of object creation
	 * no return-type
	 *  we use constructor is eliminate null values.
	 */

		
		int a;                                    // constructor instant value ka initilized kore
		int b;                                    //instant variable is a part of obj value
			
		M01cons()
		{                                // same name as class name method--- Constructor(){}
			a=2;                            //line 14,15,16,17,18--default constructor
			b=5;
			c=a+b;
			System.out.println(c);
		}
		
		void add() {
			System.out.println(a);
		}                                             //another method
	}
	 
		public static void main(String[] args) {                              //create another class to call obj under main method

			M01cons obj=new M01cons();                          //we don't need to wright obj.Constructor() to call line 14
		      obj.add();                                                           //but line20 we need to wright obj.show()
	}}

}
