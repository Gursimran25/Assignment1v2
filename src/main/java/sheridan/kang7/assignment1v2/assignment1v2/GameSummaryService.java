package sheridan.kang7.assignment1v2.assignment1v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameSummaryService {
    @Autowired
    private GameSummaryRepository gameSummaryRepository;
}
