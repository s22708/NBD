db.people.count({"location.city" : "Moscow"})
db.people.count({"location.city" : "Moskwa"})
db.people.update({"location.city" : "Moskwa"}, {$set : {"location.city" : "Moskwa"}}, false, true)
db.people.count({"location.city" : "Moscow"})
db.people.count({"location.city" : "Moskwa"})