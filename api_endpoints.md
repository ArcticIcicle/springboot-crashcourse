# Zoo API Resource Endpoints
| **Resource** | **HTTP Verb** | **Resource URL** | **Use Case** |
|--------------|---------------|------------------|--------------|
| Visitors     | POST          | `/tickets`                            | Creating a ticket |
| Ticket       | POST          | `/visitors/1/tickets`                 | Visitor buying a ticket |
| Shop         | GET           | `/visitors/1/tickets`                 | View all of visitor's tickets |
| Enclosures   | GET           | `/visitors/1/tickets/1`              | View visitor's ticket 1 |
| Animals      | GET           | `/zoos/1/visitors/1/tasks`           | Viewing all tasks a visitor can do |
| Hospital     | GET           | `/zoos/1/visitors/1/enclosures`      | See all enclosures |
| Feed         | GET           | `/zoos/1/visitors/1/enclosures/1/animals` | See all animals in enclosure number 1 |
| Tasks        | POST          | `/zoos/1/visitors/1/enclosures/1/animals/1/feeds` | Feed animal 1 in enclosure 1 |
| Zoo          | GET           | `/zoos/1/visitors/1/shop`            | View all shops |
| Purchase     | GET           | `/zoos/1/visitors/1/shop/1/products` | View all products from shop 1 |
| Lecture      | POST          | `/zoos/1/visitors/1/shop/1/products/1/purchases` | Purchase product 1 from shop 1 |
| Exit         | GET           | `/zoos/1/visitors/1/hospital`        | Visit hospital |
| Product      | GET           | `/zoos/1/visitors/1/hospital/lectures` | Listen to a science lecture |
|              | POST          | `/zoos/1/visitors/1/exits`           | Exit zoo |
