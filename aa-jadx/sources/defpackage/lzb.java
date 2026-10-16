package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lzb {
    public java.lang.CharSequence a;
    public java.lang.CharSequence b;
    public java.lang.CharSequence c;
    public java.lang.CharSequence d;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public android.graphics.Bitmap g;
    public android.net.Uri h;
    public java.lang.CharSequence i;
    private defpackage.ygw j;
    private defpackage.ygw k;
    private long l;
    private byte m;

    public final defpackage.lzc a() {
        defpackage.ygw ygwVar;
        defpackage.ygw ygwVar2;
        if (this.m == 1 && (ygwVar = this.j) != null && (ygwVar2 = this.k) != null) {
            return new defpackage.lzc(this.a, this.b, this.c, this.d, this.e, this.f, ygwVar, ygwVar2, this.g, this.h, this.l, this.i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.j == null) {
            sb.append(" icons");
        }
        if (this.k == null) {
            sb.append(" tertiaryIcons");
        }
        if (this.m == 0) {
            sb.append(" imageLoadTimeoutMs");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.util.List list) {
        this.j = defpackage.ygw.o(list);
    }

    public final void c(long j) {
        this.l = j;
        this.m = (byte) 1;
    }

    public final void d(java.util.List list) {
        this.k = defpackage.ygw.o(list);
    }
}
