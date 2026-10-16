package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class tov extends tod {
    private static final yob b = yob.c("com/google/android/libraries/geo/mapcore/api/model/ScreenPixelGeometryUnpacker");

    @Override // defpackage.tod
    public final int a() {
        return 8;
    }

    @Override // defpackage.tof
    public final void h(abms abmsVar, int i, float[] fArr) {
        ByteBuffer byteBufferJ = abmsVar.j();
        byteBufferJ.order(ByteOrder.LITTLE_ENDIAN);
        int i2 = i + i;
        int iMin = Math.min(abmsVar.d() / 8, (fArr.length >> 1) - i);
        for (int i3 = 0; i3 < iMin; i3++) {
            int i4 = i2 + 1;
            fArr[i2] = byteBufferJ.getFloat();
            i2 += 2;
            fArr[i4] = byteBufferJ.getFloat();
        }
    }

    @Override // defpackage.tof
    public final void j(abms abmsVar, int i, int[] iArr) {
        throw new UnsupportedOperationException("Float-precision would be lost.");
    }

    @Override // defpackage.tof
    public final boolean l() {
        return false;
    }

    @Override // defpackage.tof
    public final int[] n(abms abmsVar, int i) {
        ((ynz) ((ynz) b.h()).ai((char) 9097)).u("ScreenPixelGeometryUnpacker int[] getVertices not supported; float-precision would be lost.");
        return new int[0];
    }
}
