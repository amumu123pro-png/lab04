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
        // Cambio en rama-compañero
        Text(
            text = "Hello from rama-compañero!",
            fontSize = 24.sp,
            color = Color.Gray
        )
    }
}
