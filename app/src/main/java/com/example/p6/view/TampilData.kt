enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,

            modifier = Modifier.padding(paddingValues = isiRuang)){
            composable(route = Navigasi.FormulirSaya.name){
                FormIsian (
                    //pilihanJK = JenisK.map { id -> konteks.resources.getString(id) },
                    OnSubmitBtnClick = {
                        navController.navigate( route = Navigasi.Detail.name)
                    }
                )
            }
            