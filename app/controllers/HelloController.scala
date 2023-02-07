package controllers

import javax.inject.Inject
import play.api.mvc._

class HelloController @Inject() (cc: ControllerComponents)
  extends BaseControllerHelpers {

  override protected def controllerComponents: ControllerComponents = cc

  def hello(): Action[AnyContent] = {
    val actionBuilder: ActionBuilder[Request, AnyContent] =
      controllerComponents.actionBuilder

    actionBuilder.apply(new Status(200))
  }
}