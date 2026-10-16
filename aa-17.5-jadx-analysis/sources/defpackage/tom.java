package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class tom extends tod {
    @Override // defpackage.tod
    public final int a() {
        return 8;
    }

    @Override // defpackage.tof
    public final void h(abms abmsVar, int i, float[] fArr) {
        ByteBuffer byteBufferJ = abmsVar.j();
        byteBufferJ.order(ByteOrder.LITTLE_ENDIAN);
        too tooVar = new too();
        int i2 = i + i;
        int iMin = Math.min(abmsVar.d() / 8, (fArr.length >> 1) - i);
        for (int i3 = 0; i3 < iMin; i3++) {
            tooVar.u(byteBufferJ.getInt(), byteBufferJ.getInt());
            int i4 = i2 + 1;
            fArr[i2] = tooVar.a;
            i2 += 2;
            fArr[i4] = tooVar.b;
        }
    }

    @Override // defpackage.tof
    public final void j(abms abmsVar, int i, int[] iArr) {
        ByteBuffer byteBufferJ = abmsVar.j();
        byteBufferJ.order(ByteOrder.LITTLE_ENDIAN);
        too tooVar = new too();
        int i2 = i + i;
        int iMin = Math.min(abmsVar.d() / 8, (iArr.length >> 1) - i);
        for (int i3 = 0; i3 < iMin; i3++) {
            tooVar.u(byteBufferJ.getInt(), byteBufferJ.getInt());
            int i4 = i2 + 1;
            iArr[i2] = tooVar.a;
            i2 += 2;
            iArr[i4] = tooVar.b;
        }
    }
}
