package objcc.internal;

import objcc.api.FaceData;

public class Face implements FaceData {
	public final int[] verticesIndex;
	public final int[] UVIndex;
	public final int[] normalIndex;

	public Face(int[] verticesIndex, int[] UVIndex, int[] normalIndex) {
		this.verticesIndex = verticesIndex;
		this.UVIndex = UVIndex;
		this.normalIndex = normalIndex;
	}

	@Override
	public int[] getVerticesIndex() {
		return verticesIndex;
	}

	@Override
	public int[] getUVIndex() {
		return UVIndex;
	}

	@Override
	public int[] getNormalIndex() {
		return normalIndex;
	}
}
