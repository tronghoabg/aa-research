package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hxp {
    final java.lang.Object a;
    public java.util.List b;
    defpackage.hxp c;
    defpackage.hxp d;

    public hxp(java.lang.Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        java.util.List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final java.lang.Object b() {
        int iA = a();
        if (iA > 0) {
            return this.b.remove(iA - 1);
        }
        return null;
    }

    hxp() {
        throw null;
    }
}
