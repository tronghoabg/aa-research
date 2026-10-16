package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajyl implements defpackage.akau, defpackage.akas {
    private final defpackage.akau a;
    private final defpackage.akas b;
    private final defpackage.ajyo c;
    private final java.lang.String d;

    /* JADX WARN: Multi-variable type inference failed */
    public ajyl(defpackage.akau akauVar, defpackage.ajyo ajyoVar, java.lang.String str) {
        this.a = akauVar;
        this.b = akauVar;
        this.c = ajyoVar;
        this.d = str == null ? defpackage.ajpx.b.name() : str;
    }

    @Override // defpackage.akau
    public final int a() throws java.io.IOException {
        defpackage.ajyo ajyoVar = this.c;
        int iA = this.a.a();
        if (ajyoVar.d() && iA != -1) {
            ajyoVar.a(new byte[]{(byte) iA});
        }
        return iA;
    }

    @Override // defpackage.akau
    public final int b(byte[] bArr, int i, int i2) throws java.io.IOException {
        defpackage.ajyo ajyoVar = this.c;
        int iB = this.a.b(bArr, i, i2);
        if (ajyoVar.d() && iB > 0) {
            defpackage.aguw.e(bArr, "Input");
            ajyoVar.c("<< ", new java.io.ByteArrayInputStream(bArr, i, iB));
        }
        return iB;
    }

    @Override // defpackage.akau
    public final int c(defpackage.akch akchVar) throws java.io.IOException {
        int iC = this.a.c(akchVar);
        defpackage.ajyo ajyoVar = this.c;
        if (ajyoVar.d() && iC >= 0) {
            java.lang.String str = new java.lang.String(akchVar.a, akchVar.b - iC, iC);
            ajyoVar.a(str.concat("\r\n").getBytes(this.d));
        }
        return iC;
    }

    @Override // defpackage.akau
    public final boolean d(int i) throws java.io.IOException {
        return this.a.d(i);
    }

    @Override // defpackage.akas
    public final boolean e() {
        return ((defpackage.akaq) this.b).n;
    }
}
