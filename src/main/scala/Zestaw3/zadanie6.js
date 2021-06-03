db.people.insert(
    {
        "sex" : "Male",
        "first_name" : "Szymon",
        "last_name" : "Kazuła",
        "job" : "Test Engineer",
        "email" : "s22708@pjwstk.edu.pl",
        "location" : {
            "city" : "Warsaw",
            "address" : {
                "streetname" : "xyz",
                "streetnumber" : "999"
            }
        },
        "description" : "test",
        "height" : "186.2",
        "weight" : "71.1",
        "birth_date" : "1993-06-15T00:00:01",
        "nationality" : "Poland",
        "credit" : [
            {
                "type" : "mastercard",
                "number" : "0987654321098765",
                "currency" : "EUR",
                "balance" : "999999999"
            }
        ]
    }
)