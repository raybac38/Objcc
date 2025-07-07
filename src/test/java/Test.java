import objcc.api.MeshData;
import parser.ObjectParser;
import parser.ParseException;

import java.io.File;
import java.io.FileInputStream;

public class Test {

	public static void main(String[] args) throws Exception, ParseException {
		File file = new File("src/test/resources/cube.obj");

		MeshData meshData = ObjectParser.parse(new FileInputStream(file));
	}
}
