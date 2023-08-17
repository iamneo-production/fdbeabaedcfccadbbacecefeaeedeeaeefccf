public class ApiControllers {
    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome String Boot! ";
    }
}
