package echobothitss;

import com.microsoft.bot.builder.TurnContext;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import retrofit2.http.Query;

@RestController
public class botController {
    private EchoBot echoBot;

    public botController(EchoBot echoBot){
        this.echoBot = echoBot;
    }

    @PostMapping("/echoBot/teste")
    public ResponseEntity get(TurnContext turnContext) throws Exception{
        echoBot.SendProactiveMessage(turnContext);
        return ResponseEntity.accepted().build();
    
    }
}
