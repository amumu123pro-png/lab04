fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF6200EE)
        )
        Text(
            text = "Hello from both!",
            fontSize = 24.sp,
            color = Color.Gray
        )

    }
