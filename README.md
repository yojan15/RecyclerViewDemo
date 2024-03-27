data class MediaItem(val name: String, val type: String)
data class ListItem(val id: Int, val title: String, val description: String, val date: String, val mediaItems: List<MediaItem>)




class MainViewModel : ViewModel() {
    private val _listItems = MutableLiveData<List<ListItem>>()
    val listItems: LiveData<List<ListItem>>
        get() = _listItems

    // Method to fetch data from API
    fun fetchData() {
        // Call API and parse response
        // Assuming you have a function to parse the API response into List<ListItem>
        val parsedData = parseApiResponse(apiResponse)
        _listItems.value = parsedData
    }

    // Mock API response
    private val apiResponse = """
        {
            "data": [
                {
                    "id": 2,
                    "title": "Test",
                    "description": "Test One",
                    "date": "2024-03-26 11:35:32",
                    "media_name": [
                        {
                            "name": "http://210.212.165.119/SPEROEMS2024/api/vehicleDocuments/Training_Education_Material/01376_2024_03_22_18_16_49.png",
                            "type": "png"
                        },
                        {
                            "name": "http://210.212.165.119/SPEROEMS2024/api/vehicleDocuments/Training_Education_Material/67390_2024_03_22_12_49_38.pdf",
                            "type": "pdf"
                        },
                        {
                            "name": "http://210.212.165.119/SPEROEMS2024/api/vehicleDocuments/Training_Education_Material/file_example_MP4_480_1_5MG.mp4",
                            "type": "mp4"
                        }
                    ]
                }
            ],
            "error": null
        }
    """.trimIndent()

    // Method to parse API response into List<ListItem>
    private fun parseApiResponse(response: String): List<ListItem> {
        // Implement parsing logic here
    }
}




class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: MediaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Set up RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        adapter = MediaAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Observe LiveData from ViewModel
        viewModel.listItems.observe(this, { listItems ->
            adapter.submitList(listItems)
        })

        // Fetch data
        viewModel.fetchData()
    }
}



