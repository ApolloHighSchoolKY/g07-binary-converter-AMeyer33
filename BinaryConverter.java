public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;

	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public String getBinary()
    {
    	return binaryValue;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public void setBinary(String binary)
    {
    	binaryValue = binary;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary
        int valuetemporary = value;
        String binaryoutput = "";
        for(int i = 7; i > 0; i--)
            if(valuetemporary >= Math.pow(2, i))
            {
                valuetemporary -= Math.pow(2, i);
                binaryoutput += "1";
            }
            else
            {
                binaryoutput += "0";
            }
            
    	return "" + binaryoutput;
    }

    public int toDecimal()
    {
    	//Convert the binary value to decimal
        int valuetemp = 0;
        for(int i = 0; i < 8; i++)
            if(binaryValue.charAt(i) == '1')
            {
                valuetemp += Math.pow(2,7-i);
            }

    	return valuetemp;
    }

    public String toString()
    {
        //return the information needed when the converter runs
        return "" +"\n" + "The entered integer was " + value + "\n"
                        + "The integer converted to binary is " + toBinary() + "\n"
                        + "The entered binary number was " + binaryValue + "\n"
                        + "The binary number converted to decimal is " + toDecimal() + "\n";
    }


}