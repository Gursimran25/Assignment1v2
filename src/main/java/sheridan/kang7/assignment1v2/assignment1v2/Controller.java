package sheridan.kang7.assignment1v2.assignment1v2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Controller

public class Controller {
    @GetMapping("/playtime")
    public String playSimran(@RequestParam(name = "choice", required=false) String choice, Model model) {
        System.out.println("In play");
        if (choice == null) {
            return "index";
        }
        System.out.println("Choice: " + choice);

        GameSummary gameSummary = new GameSummary();
        gameSummary.clientGesture = Gesture.valueOf(choice.toUpperCase());
        gameSummary.serverGesture = Gesture.ROCK;

        String result = "tie";
        if (gameSummary.clientGesture.equals(Gesture.PAPER)) {
            result = "win";
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForObject("http://localhost:63342/score/wins", "", Object.class);
        }
        if (gameSummary.clientGesture.equals(Gesture.SCISSORS)) {
            result = "lose";
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForObject("http://localhost:63342/score/losses", "", Object.class);
        }
        if (result == "tie") {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForObject("http://localhost:63342/score/ties", "", Object.class);
        }
        gameSummary.setResult(result);

        RestTemplate restTemplate = new RestTemplate();
        Score score = restTemplate.getForObject("http://localhost:63342/score", Score.class);

        model.addAttribute("gameSummary", gameSummary);
        model.addAttribute("score", score);
        // request.getRequestDispatcher("index.jsp").forward(request, response);

        return "results";
    }

    @GetMapping("/input")
    public String index(@RequestParam(name = "choice", required=false) String choice, Model model) {
        return "index";
    }

}
