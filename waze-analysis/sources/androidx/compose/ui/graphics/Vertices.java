package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Vertices {
    public static final int $stable = 8;
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    private Vertices(int i2, List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        this.vertexMode = i2;
        if (list2.size() != list.size()) {
            InlineClassHelperKt.throwIllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            InlineClassHelperKt.throwIllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = list4.get(i3).intValue();
            if (iIntValue < 0 || iIntValue >= list.size()) {
                InlineClassHelperKt.throwIllegalArgumentException("indices values must be valid indices in the positions list.");
                break;
            }
        }
        this.positions = encodePointList(list);
        this.textureCoordinates = encodePointList(list2);
        this.colors = encodeColorList(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            sArr[i4] = (short) list4.get(i4).intValue();
        }
        this.indices = sArr;
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ColorKt.m8282toArgb8_81llA(list.get(i2).m8238unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        int size = list.size();
        int i2 = size + size;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jM7990unboximpl = list.get(i3 / 2).m7990unboximpl();
            fArr[i3] = i3 % 2 == 0 ? Float.intBitsToFloat((int) (jM7990unboximpl >> 32)) : Float.intBitsToFloat((int) (jM7990unboximpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        return fArr;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m8683getVertexModec2xauaI() {
        return this.vertexMode;
    }

    public /* synthetic */ Vertices(int i2, List list, List list2, List list3, List list4, o oVar) {
        this(i2, list, list2, list3, list4);
    }
}
