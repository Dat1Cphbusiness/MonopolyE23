plantuml:UC3sekvensdiagram
```
@startuml
Main -> Game: setup
Game -> FileIO: String[] data = readBoardData("fields.csv")

Game -> Board : new(data)
Board -> Board : createFields(data)

loop data.length
Board -> Field : new (id, label, cost, income)
end
Game -> FileIO: String[] data = readBoardData("cards.csv")

Game -> CardDeck : new(data)
CardDeck -> CardDeck : createCards(data)

loop data.length
CardDeck -> Card : new (message, income, cost, event)
end
@enduml
```

![](UC3sekvensdiagram.svg)
