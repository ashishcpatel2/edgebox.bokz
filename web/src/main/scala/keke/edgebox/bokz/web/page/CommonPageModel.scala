package keke.edgebox.bokz.web.page

import keke.edgebox.restlet.velocity.TemplateSupport
import org.restlet.Request

/**
 * Created by IntelliJ IDEA.
 * User: qiqiqiqk
 * Date: Nov 28, 2010
 * Time: 4:55:29 PM
 * To change this template use File | Settings | File Templates.
 */

trait CommonPageModel {
  self: TemplateSupport =>
  import scala.collection.mutable.Map
  override def getModel: Map[String, Object] = {
    Map("ctxPath" -> Request.getCurrent.getRootRef.toString)
  }
}