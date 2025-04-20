import dev.junction.lab.*
import dev.junction.lab.http.ExpenseController
import org.scalatra.*
import jakarta.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext): Unit = {
    context.mount(new ExpenseController, "/*")
  }
}
