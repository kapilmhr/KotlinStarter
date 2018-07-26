package app.frantic.kotlinstarter.retrofit.model.data

class Flower {
    var category: String
    var price: Double
    var instructions: String
    var photo: String
    var name: String
    var productId: Int

    constructor(category: String, price: Double, instructions: String, photo: String, name: String, productId: Int) {
        this.category = category
        this.price = price
        this.instructions = instructions
        this.photo = photo
        this.name = name
        this.productId = productId
    }
}