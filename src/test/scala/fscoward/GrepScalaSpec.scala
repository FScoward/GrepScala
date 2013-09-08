package fscoward

import org.specs2.specification.Grouped
import org.specs2.specification.script.Specification
import java.nio.file.InvalidPathException

class GrepScalaSpec extends Specification with Grouped {

	val zeroArgs: Array[String] = Array.empty

	def is = s2"""
  	o GrepScala オブジェクト
  		+ GrepScala.isFullPath('C:\\') で true を返す
  		+ GrepScala.isFullPath('aaaa') で Exception("ディレクトリを指定してください") を返す
  """

	"GrepScala オブジェクト" - new group {
		eg := GrepScala.isFullPath("C:\\") === true
		eg := GrepScala.isFullPath("aaa") must throwA[Exception]("ディレクトリを指定してください")
	}

}