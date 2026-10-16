package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kom implements defpackage.rlv {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ kom(java.lang.Object obj, byte[] bArr, int i, int i2, int i3) {
        this.e = i3;
        this.d = obj;
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.rlv
    public final java.lang.Object a(defpackage.pbr pbrVar) throws java.io.IOException {
        if (this.e != 0) {
            if (pbrVar == defpackage.pbr.IO_EXCEPTION) {
                throw new java.io.IOException("Failed to read due to failure injection");
            }
            int i = this.c;
            int i2 = this.b;
            return java.lang.Integer.valueOf(((defpackage.kok) this.d).a.read(this.a, i2, i));
        }
        if (pbrVar == defpackage.pbr.IO_EXCEPTION) {
            throw new java.io.IOException("Failed to write due to failure injection");
        }
        int i3 = this.c;
        int i4 = this.b;
        ((defpackage.kon) this.d).a.write(this.a, i4, i3);
        return null;
    }
}
