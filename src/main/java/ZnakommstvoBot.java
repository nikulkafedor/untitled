import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ZnakommstvoBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
      // System.out.println(update.getMessage().getText());
      // System.out.println(update.getMessage().getFrom().getFirstName());
        Message message = update.getMessage();
        SendMessage sendMessage = new SendMessage(message.getChatId(),message.getText());
        try{
            execute(sendMessage);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "ZnakommstvoBot";
    }

    public String getBotToken() {
        return "1143599166:AAEQ7eeovLcGMTm79f1XrrMRHmhJY77SuUg";
    }
}
