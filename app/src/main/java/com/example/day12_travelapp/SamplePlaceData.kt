package com.example.day12_travelapp

class SamplePlaceData (
    val placeName: String,
    val country: String,
    val imageId: Int,
    val placeDescription : String,
    val attraction: String,
    val tripCost: Int
)


val placesList = listOf(
    SamplePlaceData(
        placeName = "Bora Bora",
        country = "French",
        imageId = R.drawable.img_1,
        placeDescription = "Bora Bora is a paradise island located in French Polynesia. Known for its crystal-clear turquoise waters, white sandy beaches, and overwater bungalows, Bora Bora offers a luxurious tropical escape. Immerse yourself in the beauty of the coral reefs, indulge in water activities like snorkeling and diving, and relax under the swaying palm trees.",
        attraction = "Matira Beach",
        tripCost = 995
    ),
    SamplePlaceData(
        placeName = "Maldives",
        country = "Maldives",
        imageId = R.drawable.img_2,
        placeDescription = "The Maldives is a tropical paradise in the Indian Ocean, known for its pristine beaches, abundant marine life, and luxury resorts. With its turquoise lagoons, vibrant coral reefs, and secluded private islands, the Maldives offers a tranquil escape. Relax on the white sandy beaches, go snorkeling or diving to explore the colorful underwater world, and unwind in the lap of luxury.",
        attraction = "Veligandu Island Beach",
        tripCost = 595

    ),
    SamplePlaceData(
        placeName = "Whitehaven Beach",
        country = "Australia",
        imageId = R.drawable.img_3,
        placeDescription = "Located in the Whitsunday Islands of Australia, Whitehaven Beach is renowned for its stunning white silica sand and clear turquoise waters. This pristine beach stretches over seven kilometers, offering a breathtaking landscape that is perfect for sunbathing, swimming, and taking leisurely walks. Experience the beauty of Whitehaven Beach and marvel at its untouched natural splendor.",
        attraction = "Hill Inlet",
        tripCost = 695
    ),
    SamplePlaceData(
        placeName = "Anse d'Argent",
        country = "Seychelles",
        imageId = R.drawable.img_4,
        placeDescription = "Anse Source d'Argent is a picture-perfect beach located on La Digue Island in the Seychelles. With its unique granite rock formations, powdery white sand, and crystal-clear waters, this beach is a true tropical paradise. Take a stroll along the shoreline, relax under the shade of palm trees, and enjoy the breathtaking views of the turquoise ocean.",
        attraction = "Granite Boulders",
        tripCost = 1195
    ),
    SamplePlaceData(
        placeName = "Navagio Beach",
        country = "Greece",
        imageId = R.drawable.img_5,
        placeDescription = "Navagio Beach, also known as Shipwreck Beach, is located on the Greek island of Zakynthos. It is famous for its dramatic limestone cliffs, crystal-clear turquoise waters, and the wreckage of a smuggler's ship that washed ashore. Accessible only by boat, Navagio Beach offers a unique and secluded beach experience surrounded by stunning natural beauty.",
        attraction = "Shipwreck (MV Panagiotis)",
        tripCost = 1995
    ),
    SamplePlaceData(
        placeName = "Waikiki Beach",
        country = "Hawaii",
        imageId = R.drawable.img_6,
        placeDescription = "Waikiki Beach is a world-renowned beach located in Honolulu, Hawaii. With its golden sand, warm turquoise waters, and iconic Diamond Head backdrop, Waikiki Beach offers a perfect blend of natural beauty and vibrant city life. Enjoy surfing, sunbathing, and the lively atmosphere of this popular beach destination.",
        attraction = "Diamond Head",
        tripCost = 605
    ),
    SamplePlaceData(
        placeName = "Cabo San Lucas",
        country = "Mexico",
        imageId = R.drawable.img_7,
        placeDescription = "Cabo San Lucas is a popular beach resort city located at the southern tip of the Baja California Peninsula in Mexico. With its stunning beaches, vibrant nightlife, and magnificent rock formations, Cabo San Lucas attracts visitors from around the world. Enjoy water sports, explore the famous Arch of Cabo San Lucas, and indulge in the delicious Mexican cuisine.",
        attraction = "El Arco (The Arch)",
        tripCost = 295
    ),
    SamplePlaceData(
        placeName = "Ipanema Beach",
        country = "Brazil",
        imageId = R.drawable.img_8,
        placeDescription = "Ipanema Beach is a legendary beach in Rio de Janeiro, Brazil. Known for its lively atmosphere, beautiful stretch of sand, and stunning sunset views, Ipanema Beach is a popular destination for locals and tourists alike. Relax on the beach, soak up the vibrant beach culture, and enjoy the breathtaking views of the surrounding mountains.",
        attraction = "Dois Irmãos (Two Brothers) Mountains",
        tripCost = 2195

    ),
    SamplePlaceData(
        placeName = "Railay Beach",
        country = "Thailand",
        imageId = R.drawable.img_9,
        placeDescription = "Railay Beach, located in Krabi, Thailand, is renowned for its stunning limestone cliffs, crystal-clear waters, and peaceful atmosphere. Accessible only by boat, Railay Beach offers a secluded paradise for beach lovers and adventure enthusiasts. Enjoy rock climbing, kayaking, or simply unwind on the soft sand while taking in the beauty of this tropical oasis.",
        attraction = "Phra Nang Cave Beach",
        tripCost = 295
    ),
    SamplePlaceData(
        placeName = "Matapouri Bay",
        country = "New Zealand",
        imageId = R.drawable.img_10,
        placeDescription = "Matapouri Bay is a hidden gem on the North Island of New Zealand. With its pristine white sand, crystal-clear waters, and surrounding lush greenery, Matapouri Bay is a tranquil and secluded beach getaway. Take a swim in the clear waters, explore the nearby Mermaid Pools, and enjoy the serenity of this beautiful coastal paradise.",
        attraction = "Mermaid Pools",
        tripCost = 1000
    )
)
