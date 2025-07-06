package api;

import java.util.List;

public interface MeshData {

	String getName();

	List<float[]> getVertices();

	List<float[]> getUV();

	List<float[]> getNormal();
	
	List<FaceData> getFaces();
}
