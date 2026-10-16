package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbl {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    public final boolean e;

    public wbl(android.net.Uri uri, java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final defpackage.wbl a() {
        return new defpackage.wbl(this.a, this.b, this.c, this.d, true);
    }

    public final defpackage.wbl b() {
        java.lang.String str = this.b;
        if (str.isEmpty()) {
            return new defpackage.wbl(this.a, str, this.c, true, this.e);
        }
        throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final defpackage.wbn c(java.lang.String str, long j) {
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        boolean z = defpackage.wbn.b;
        return new defpackage.wbd(this, str, lValueOf);
    }

    public final defpackage.wbn d(java.lang.String str, java.lang.String str2) {
        boolean z = defpackage.wbn.b;
        return new defpackage.wbh(this, str, str2, true);
    }

    public final defpackage.wbn e(java.lang.String str, boolean z) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        boolean z2 = defpackage.wbn.b;
        return new defpackage.wbf(this, str, boolValueOf, true);
    }

    public final defpackage.wbn f(java.lang.String str, defpackage.wbk wbkVar, java.lang.String str2) {
        boolean z = defpackage.wbn.b;
        return new defpackage.wbj(this, str, str2, wbkVar);
    }
}
