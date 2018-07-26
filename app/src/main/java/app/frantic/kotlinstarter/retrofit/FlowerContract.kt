package app.frantic.kotlinstarter.retrofit

import app.frantic.kotlinstarter.retrofit.model.data.Flower

interface FlowerContract {
    interface FlowerPresenter{
        fun getFlowers()
    }

    interface FlowerView{
        fun onSuccessFlower( list: List<Flower>)
        fun onErrorFlower( error: String)

    }

    interface FlowerModel{
        fun getFlowersFromApi( listener:ModelListener)
    }

    interface ModelListener{
        fun onSuccess( list: List<Flower>)
        fun onError( error: String)
    }
}