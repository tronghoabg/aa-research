package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class xu {
    public final java.lang.Object a;
    public final java.lang.String b;

    public xu(java.lang.Object obj, java.lang.String str) {
        this.a = obj;
        this.b = str;
    }

    final java.lang.String a() {
        return "[" + this.b + ", " + defpackage.xx.e(this.a.getClass()) + "]";
    }

    public final java.lang.String toString() {
        return a();
    }
}
