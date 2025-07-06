package internal;

import api.FaceData;
import api.MeshData;

import java.util.ArrayList;
import java.util.List;

public class MeshObject implements MeshData {
	public final List<float[]> vertices = new ArrayList<>();
	public final List<float[]> uvs = new ArrayList<>();
	public final List<float[]> normals = new ArrayList<>();
	public final List<FaceData> faces = new ArrayList<>();
	public String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public List<float[]> getVertices() {
		return vertices;
	}

	@Override
	public List<float[]> getUV() {
		return uvs;
	}

	@Override
	public List<float[]> getNormal() {
		return normals;
	}

	@Override
	public List<FaceData> getFaces() {
		return faces;
	}

	
}
