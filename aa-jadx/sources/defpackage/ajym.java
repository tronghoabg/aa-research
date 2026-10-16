package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajym implements defpackage.akav {
    private final defpackage.akav a;
    private final defpackage.ajyo b;
    private final java.lang.String c;

    public ajym(defpackage.akav akavVar, defpackage.ajyo ajyoVar, java.lang.String str) {
        this.a = akavVar;
        this.b = ajyoVar;
        this.c = str == null ? defpackage.ajpx.b.name() : str;
    }

    @Override // defpackage.akav
    public final void a() throws java.io.IOException {
        this.a.a();
    }

    @Override // defpackage.akav
    public final void b(int i) throws java.io.IOException {
        this.a.b(i);
        defpackage.ajyo ajyoVar = this.b;
        if (ajyoVar.d()) {
            ajyoVar.b(new byte[]{(byte) i});
        }
    }

    @Override // defpackage.akav
    public final void c(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.a.c(bArr, i, i2);
        defpackage.ajyo ajyoVar = this.b;
        if (ajyoVar.d()) {
            defpackage.aguw.e(bArr, "Output");
            ajyoVar.c(">> ", new java.io.ByteArrayInputStream(bArr, i, i2));
        }
    }

    @Override // defpackage.akav
    public final void d(java.lang.String str) throws java.io.IOException {
        this.a.d(str);
        defpackage.ajyo ajyoVar = this.b;
        if (ajyoVar.d()) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            ajyoVar.b(strValueOf.concat("\r\n").getBytes(this.c));
        }
    }

    @Override // defpackage.akav
    public final void e(defpackage.akch akchVar) throws java.io.IOException {
        this.a.e(akchVar);
        defpackage.ajyo ajyoVar = this.b;
        if (ajyoVar.d()) {
            java.lang.String str = new java.lang.String(akchVar.a, 0, akchVar.b);
            ajyoVar.b(str.concat("\r\n").getBytes(this.c));
        }
    }
}
