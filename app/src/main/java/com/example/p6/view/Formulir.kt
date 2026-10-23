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
}

