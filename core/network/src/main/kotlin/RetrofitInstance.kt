//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory

//object RetrofitInstance {
//
//    private const val BASE_URL = "https://opentdb.com/"
//
//    private val retrofit by lazy {
//        Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    val api: api.TriviaApiService by lazy {
//        retrofit.create(api.TriviaApiService::class.java)
//    }
//}