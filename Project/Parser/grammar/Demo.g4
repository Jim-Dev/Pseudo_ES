grammar Demo;

addition: addition SIGN_ADD NUMBER
        |   NUMBER;

NUMBER: [0-9]+;
SIGN_ADD: '+';