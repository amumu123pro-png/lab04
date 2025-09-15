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
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Hello, Student!",
            fontSize = 22.sp,
            color = Color.Gray
        )
    }
}

