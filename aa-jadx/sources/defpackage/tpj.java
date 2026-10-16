package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpj extends defpackage.tpb {
    @Override // defpackage.tpb
    public final int a() {
        return 16;
    }

    @Override // defpackage.tpd
    public final void h(defpackage.abnv abnvVar, int i, float[] fArr) {
        throw new java.lang.UnsupportedOperationException("Floats do not have enough precision to represent LatLng data.");
    }

    @Override // defpackage.tpd
    public final void j(defpackage.abnv abnvVar, int i, int[] iArr) {
        java.nio.ByteBuffer byteBufferJ = abnvVar.j();
        byteBufferJ.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        defpackage.tpm tpmVar = new defpackage.tpm();
        int i2 = i + i;
        int iMin = java.lang.Math.min(abnvVar.d() / 16, (iArr.length >> 1) - i);
        for (int i3 = 0; i3 < iMin; i3++) {
            tpmVar.t(byteBufferJ.getDouble(), byteBufferJ.getDouble());
            int i4 = i2 + 1;
            iArr[i2] = tpmVar.a;
            i2 += 2;
            iArr[i4] = defpackage.tpm.f(tpmVar.b);
        }
    }
}
