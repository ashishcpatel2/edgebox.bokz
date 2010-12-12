package keke.edgebox.bokz.web.page

import keke.edgebox.restlet.velocity.VelocityPage
import org.apache.velocity.app.VelocityEngine
import org.restlet.data.CacheDirective

class HomePage(val velocityEngine: VelocityEngine) extends VelocityPage with CommonPageModel {
  private val MaxAge = 60 * 60 * 24 * 7
  val templateName = "home.vt"
  override val useTemplateLastModified = true

  override protected def getCacheDirectives = List(CacheDirective.maxAge(MaxAge))
}