package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class tol extends tod {
    @Override // defpackage.tod
    public final int a() {
        return 16;
    }

    @Override // defpackage.tof
    public final void h(abms abmsVar, int i, float[] fArr) {
        throw new UnsupportedOperationException("Floats do not have enough precision to represent LatLng data.");
    }

    @Override // defpackage.tof
    public final void j(abms abmsVar, int i, int[] iArr) {
        ByteBuffer byteBufferJ = abmsVar.j();
        byteBufferJ.order(ByteOrder.LITTLE_ENDIAN);
        too tooVar = new too();
        int i2 = i + i;
        int iMin = Math.min(abmsVar.d() / 16, (iArr.length >> 1) - i);
        for (int i3 = 0; i3 < iMin; i3++) {
            tooVar.t(byteBufferJ.getDouble(), byteBufferJ.getDouble());
            int i4 = i2 + 1;
            iArr[i2] = tooVar.a;
            i2 += 2;
            iArr[i4] = too.f(tooVar.b);
        }
    }
}
