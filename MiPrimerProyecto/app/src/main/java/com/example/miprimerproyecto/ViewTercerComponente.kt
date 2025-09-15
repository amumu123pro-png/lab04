fun ViewTercerComponente() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tercer Componente",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6200EE)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Contenido del tercer componente",
            fontSize = 18.sp,
            color = Color.DarkGray
        )
    }
}
#%%
