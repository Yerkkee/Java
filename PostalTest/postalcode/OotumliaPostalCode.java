package postalcode;

public class OotumliaPostalCode extends PostalCode{

    public OotumliaPostalCode(String code) throws PostalCodeException
    {
        super(code);
    }

    public String getCountry()
    {
        return "Ootumlia";
    }
    protected void validate() throws PostalCodeException {
        String postCode = getCode();

        switch(postCode.length())
        {
            // If the code is 5 or 10 characters long
            case 4:
                if ((postCode.length()== 0)
                        || (!Character.isLetter(postCode.charAt(0)))
                        || (!Character.isWhitespace(postCode.charAt(1)))
                        || (!Character.isDigit(postCode.charAt(2)))
                        || (!Character.isDigit(postCode.charAt(3))))
                    {
                        // Checks both 5 and 10 characters
                        // If all the characters except the 6th are not numbers
                        // If the 6th character (in 10 characters) is not a dash
                        throwException("Sequence of characters not like A 99 or AB 44");
                        break;
                    }
                break;
            case 5:
                if ((postCode.length()== 0)
                        || (!Character.isLetter(postCode.charAt(0)))
                        || (!Character.isLetter(postCode.charAt(1)))
                        || (!Character.isWhitespace(postCode.charAt(2)))
                        || (!Character.isDigit(postCode.charAt(3)))
                        || (!Character.isDigit(postCode.charAt(4))))
                {
                    // Checks both 5 and 10 characters
                    // If all the characters except the 6th are not numbers
                    // If the 6th character (in 10 characters) is not a dash
                    throwException("Sequence of characters not like A 99 or AB 44");
                    break;
                }
                break;

            default:
                //Any other case, the code is invalid.
                throwException("Invalid code length.");
        }
        setDestination(computeDestination());
    }
    private String computeDestination()
    {
        return "Ootumlia city.";
    }
}
