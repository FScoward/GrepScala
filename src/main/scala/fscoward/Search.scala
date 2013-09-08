package fscoward

import java.nio.file.Paths
import scala.io.Source

class Search(filename: String) {

	/**
	 * 検索の実行
	 * @param word 検索対象文字列
	 * @return 行番号, 該当行テキスト
	 */
	def search(word: String) = {
		val bs = openFile

		val max_size = bs.size
		

		for(a <- openFile.getLines){

		}
	}

	/**
	 * ファイルを開く
	 * @param filename 対象ファイル名
	 * @return scala.io.BufferdSource
	 */
	def openFile = {
		Source.fromFile(filename)
	}

	def countup(count: Int) = {
		count + 1
	}
}