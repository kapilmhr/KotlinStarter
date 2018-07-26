package app.frantic.kotlinstarter.retrofit.presenter

import app.frantic.kotlinstarter.retrofit.FlowerContract
import app.frantic.kotlinstarter.retrofit.model.data.Flower

class FlowerPresenter(val flowerView:FlowerContract.FlowerView,val flowerModel:FlowerContract.FlowerModel) : FlowerContract.FlowerPresenter,FlowerContract.ModelListener{

    override fun onSuccess(list: List<Flower>) {
        flowerView.onSuccessFlower(list)
    }

    override fun onError(error: String) {
        flowerView.onErrorFlower(error)
    }

    override fun getFlowers() {
        flowerModel.getFlowersFromApi(this)
    }
}