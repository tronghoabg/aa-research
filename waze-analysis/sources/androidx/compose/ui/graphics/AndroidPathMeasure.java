package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidPathMeasure implements PathMeasure {
    public static final int $stable = 8;
    private final android.graphics.PathMeasure internalPathMeasure;
    private float[] positionArray;
    private float[] tangentArray;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo8123getPositiontuRUvjQ(float f2) {
        float[] fArr = this.positionArray;
        if (fArr == null) {
            fArr = new float[2];
            this.positionArray = fArr;
        }
        float[] fArr2 = this.tangentArray;
        if (fArr2 == null) {
            fArr2 = new float[2];
            this.tangentArray = fArr2;
        }
        if (!this.internalPathMeasure.getPosTan(f2, fArr, fArr2)) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        float[] fArr3 = this.positionArray;
        if (fArr3 == null) {
            x.g();
        }
        float f3 = fArr3[0];
        float[] fArr4 = this.positionArray;
        if (fArr4 == null) {
            x.g();
        }
        float f4 = fArr4[1];
        return (Float.floatToRawIntBits(f4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f3) << 32);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f2, float f3, Path path, boolean z) {
        if (path instanceof AndroidPath) {
            return this.internalPathMeasure.getSegment(f2, f3, ((AndroidPath) path).getInternalPath(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo8124getTangenttuRUvjQ(float f2) {
        float[] fArr = this.positionArray;
        if (fArr == null) {
            fArr = new float[2];
            this.positionArray = fArr;
        }
        float[] fArr2 = this.tangentArray;
        if (fArr2 == null) {
            fArr2 = new float[2];
            this.tangentArray = fArr2;
        }
        if (!this.internalPathMeasure.getPosTan(f2, fArr, fArr2)) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        float[] fArr3 = this.tangentArray;
        if (fArr3 == null) {
            x.g();
        }
        float f3 = fArr3[0];
        float[] fArr4 = this.tangentArray;
        if (fArr4 == null) {
            x.g();
        }
        float f4 = fArr4[1];
        return (Float.floatToRawIntBits(f4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f3) << 32);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(Path path, boolean z) {
        android.graphics.Path internalPath;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((AndroidPath) path).getInternalPath();
        }
        this.internalPathMeasure.setPath(internalPath, z);
    }
}
