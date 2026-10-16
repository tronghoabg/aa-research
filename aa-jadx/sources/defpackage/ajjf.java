package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajjf implements java.io.Closeable {
    public final defpackage.ajjc a;
    public final defpackage.ajja b;
    public final java.lang.String c;
    public final int d;
    public final defpackage.ajit e;
    public final defpackage.ajiu f;
    public final defpackage.ajjh g;
    public final defpackage.ajpb h;
    public final defpackage.ajjf i;
    public final defpackage.ajjf j;
    public final long k;
    public final long l;
    public final defpackage.ajjk m;
    public defpackage.ajif n;
    public final boolean o;
    public final defpackage.sdv p;

    public ajjf(defpackage.ajjc ajjcVar, defpackage.ajja ajjaVar, java.lang.String str, int i, defpackage.ajit ajitVar, defpackage.ajiu ajiuVar, defpackage.ajjh ajjhVar, defpackage.ajpb ajpbVar, defpackage.ajjf ajjfVar, defpackage.ajjf ajjfVar2, long j, long j2, defpackage.sdv sdvVar, defpackage.ajjk ajjkVar) {
        ajjhVar.getClass();
        ajjkVar.getClass();
        this.a = ajjcVar;
        this.b = ajjaVar;
        this.c = str;
        this.d = i;
        this.e = ajitVar;
        this.f = ajiuVar;
        this.g = ajjhVar;
        this.h = ajpbVar;
        this.i = ajjfVar;
        this.j = ajjfVar2;
        this.k = j;
        this.l = j2;
        this.p = sdvVar;
        this.m = ajjkVar;
        boolean z = false;
        if (i >= 200 && i < 300) {
            z = true;
        }
        this.o = z;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String strB = this.f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final java.lang.String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + "}";
    }
}
