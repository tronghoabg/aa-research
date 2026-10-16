package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpk extends defpackage.tpb {
    @Override // defpackage.tpb
    public final int a() {
        return 8;
    }

    @Override // defpackage.tpd
    public final void h(defpackage.abnv abnvVar, int i, float[] fArr) {
        java.nio.ByteBuffer byteBufferJ = abnvVar.j();
        byteBufferJ.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        defpackage.tpm tpmVar = new defpackage.tpm();
        int i2 = i + i;
        int iMin = java.lang.Math.min(abnvVar.d() / 8, (fArr.length >> 1) - i);
        for (int i3 = 0; i3 < iMin; i3++) {
            tpmVar.u(byteBufferJ.getInt(), byteBufferJ.getInt());
            int i4 = i2 + 1;
            fArr[i2] = tpmVar.a;
            i2 += 2;
            fArr[i4] = tpmVar.b;
        }
    }

    @Override // defpackage.tpd
    public final void j(defpackage.abnv abnvVar, int i, int[] iArr) {
        java.nio.ByteBuffer byteBufferJ = abnvVar.j();
        byteBufferJ.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        defpackage.tpm tpmVar = new defpackage.tpm();
        int i2 = i + i;
        int iMin = java.lang.Math.min(abnvVar.d() / 8, (iArr.length >> 1) - i);
        for (int i3 = 0; i3 < iMin; i3++) {
            tpmVar.u(byteBufferJ.getInt(), byteBufferJ.getInt());
            int i4 = i2 + 1;
            iArr[i2] = tpmVar.a;
            i2 += 2;
            iArr[i4] = tpmVar.b;
        }
    }
}
