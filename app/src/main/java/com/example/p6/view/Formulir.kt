package com.example.p6.view

import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composablefun FormIsian(jenisK)
fun FormIsian(
    jenisK: List<String> = listOf("Laki - Laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit){
    Scaffold (modifier=Modifier,
        topBar = {
            TopAppBar(title = {Text(stringResource(id=R.string.home), color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.teal_700))
            )
        }
        )
    isiRuang ->
    Column(
        modifier = Modifier.padding(paddingValues = isiRuang),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = textNama,
            onValueChange = { textNama = it },
            label = { Text("Nama") },
            singleLine = true,
            modifier = Modifier.padding(top = 20.dp)
        )

        HorizontalDivider(
            modifier = Modifier
                .padding(all = 20.dp)
                .width(250.dp),
            thickness = 2.dp,
            color = Color.Red
        )
        OutlinedTextField(
            value = textAlamat,
            onValueChange = { textAlamat = it },
            label = { Text("Alamat") },
            singleLine = true,
            modifier = Modifier.padding(top = 20.dp)

        Row {
            jenisK.forEach { item ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = (selectedGender == item),
                        onClick = { selectedGender = item }
                    )
                    Text(text = item)
                }
            }
        }

