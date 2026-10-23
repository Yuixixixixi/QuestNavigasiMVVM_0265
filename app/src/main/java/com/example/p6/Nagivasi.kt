package com.example.p6

class Nagivasi {
}enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {
            composable(route = Navigasi.FormulirSaya.name) {
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onBackBtnClick = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki - Laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.home), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.teal_700))
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        )