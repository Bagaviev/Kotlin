fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    client ?: return
    message ?: return

    val personalInfo: PersonalInfo? = client.personalInfo ?: return
    val email: String = personalInfo?.email ?: return;
    // если хня email null, то не падаем с ошибкой, а возвращаем null
    // если получили null в ебало, то делаем возврат

    mailer.sendMessage(email, message)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}