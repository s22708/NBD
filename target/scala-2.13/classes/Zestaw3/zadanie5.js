printjson(db.people.find(
    {
        "birth_date" : {
            $gto : "2001-01-01",
            $lt : "2100-01-01"
        }
    },
    {
        first_name: 1,
        last_name: 1,


    })
)