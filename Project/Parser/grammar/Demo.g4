grammar Demo;

addition: left=addition SIGN_ADD right=NUMBER #Plus
        |   number=NUMBER #Number
        ;

NUMBER: [0-9]+;
SIGN_ADD: '+';