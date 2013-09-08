package fscoward

import org.specs2.specification.script.Specification
import org.specs2.specification.Grouped

class SearchSpec extends Specification with Grouped {

	def is = s2"""
			o Search クラス
				+ openFile(@"CC:\Users\FScoward\Documents\Programming\Scala\GrepScala\src\test\scala\fscoward\testdata\search.txt") で BufferedSource を返す
				+ search("fscoward") で (13, fscoward), (15, fasdfd---fscowardfwaf;), (18, fscowardafweajiojejp:454)
	"""
	val search = new Search("""C:\Users\FScoward\Documents\Programming\Scala\GrepScala\src\test\scala\fscoward\testdata\search.txt""")

	"Search クラス" - new group {
		eg := search.openFile must beAnInstanceOf[scala.io.BufferedSource]
		eg := search.search("fscoward") === Map(13 -> "fscoward", 15 -> "fasdfd---fscowardfwaf;", 18 -> "fscowardafweajiojejp:454")
	}
}