
package fscoward

import java.nio.file._

object GrepScala {
	def main(args: Array[String]): Unit = {


		val search = new Search("""C:\Users\FScoward\Documents\Programming\Scala\GrepScala\src\test\scala\fscoward\testdata\search.txt""")
		search.search("fscoward")
	}

	/**
	 * 引数チェック
	 * @param args 引数
	 * @return Exception
	 */
	def checkArgs(args: Array[String]) = {
		if (args.length < 1) {
			throw new Exception("引数異常")
		}
	}

	/**
	 * パスのチェック
	 * @param path 引数に与えられたパス文字列
	 * @return Boolean
	 */
	def isFullPath(path: String): Boolean = {
		// InvalidPathException - パス文字列を Path に変換できない場合
		try {
			if (!Files.isDirectory(Paths.get(path))) {
				throw new Exception("ディレクトリを指定してください")
			} else {
				true
			}
		} catch {
			case e: InvalidPathException => {
				false
			}
		}
	}

}