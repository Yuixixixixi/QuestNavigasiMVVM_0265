package com.example.p6.view

import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composablefun FormIsian(jenisK)
fun FormIsian(
    jenisKl: List<String> = listOf("Laki - Laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit){
    Scaffold (modifier=Modifier,
        topBar = {
            TopAppBar(title = {Text(stringResource(id=R.string.home), color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.teal_700))
            )
        }
        )
    isiRuang ->
    Column(modifier = Modifier.padding(paddingValues = isiRuang),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = "",
            singleLine = true,
            modifier = Modifier
                .padding(top = 20.dp)
}

