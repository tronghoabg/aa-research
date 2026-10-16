package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xb {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;

    public xb(ulm ulmVar) {
        this.e = ulmVar.k;
        this.c = ulmVar.m;
        this.b = ulmVar.n;
        this.a = ulmVar.o;
        this.d = ulmVar.q;
    }

    public final defpackage.kfm a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = this.e;
        if (obj3 == null || (obj = this.d) == null || (obj2 = this.c) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.e == null) {
                sb.append(" uri");
            }
            if (this.d == null) {
                sb.append(" projection");
            }
            if (this.c == null) {
                sb.append(" selectionArgs");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        android.net.Uri uri = (android.net.Uri) obj3;
        defpackage.kfm kfmVar = new defpackage.kfm(uri, (defpackage.ygw) obj, (java.lang.String) this.b, (defpackage.ygw) obj2, (java.lang.String) this.a);
        boolean z = true;
        if (kfmVar.c == null && !kfmVar.d.isEmpty()) {
            z = false;
        }
        defpackage.ysr.aY(z, "If selection is null, args must be empty");
        return kfmVar;
    }

    public final void b(java.util.List list) {
        this.d = defpackage.ygw.o(list);
    }

    public final void c(java.util.List list) {
        this.c = defpackage.ygw.o(list);
    }

    public final void d(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null uri");
        }
        this.e = uri;
    }

    public final ulm e() {
        if (this.e == null) {
            int i = defpackage.ygw.d;
            this.e = defpackage.ymx.a;
        }
        if (this.d == null) {
            throw new java.lang.IllegalStateException();
        }
        java.lang.Object obj = this.e;
        java.lang.Object obj2 = this.c;
        java.lang.Object obj3 = this.b;
        java.lang.String str = (java.lang.String) obj3;
        java.lang.String str2 = (java.lang.String) obj2;
        return new ujl((defpackage.ygw) obj, str2, str, (java.lang.String) this.a, (defpackage.yhx) this.d);
    }
}
