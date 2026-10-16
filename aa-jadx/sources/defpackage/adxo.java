package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adxo extends java.io.OutputStream {
    public final java.util.List a = new java.util.ArrayList();
    final /* synthetic */ defpackage.adxr b;
    private defpackage.aebg c;

    public adxo(defpackage.adxr adxrVar) {
        this.b = adxrVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            defpackage.adxr adxrVar = this.b;
            defpackage.aebg aebgVarA = adxrVar.g.a(java.lang.Math.max(4096, i2));
            this.c = aebgVarA;
            this.a.add(aebgVarA);
        }
        while (i2 > 0) {
            int iMin = java.lang.Math.min(i2, this.c.b());
            defpackage.aebg aebgVar = this.c;
            if (iMin == 0) {
                int iA = aebgVar.a();
                defpackage.aebg aebgVarA2 = this.b.g.a(java.lang.Math.max(i2, iA + iA));
                this.c = aebgVarA2;
                this.a.add(aebgVarA2);
            } else {
                aebgVar.d(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        defpackage.aebg aebgVar = this.c;
        if (aebgVar != null && aebgVar.b() > 0) {
            this.c.c(b);
        } else {
            write(new byte[]{b}, 0, 1);
        }
    }
}
