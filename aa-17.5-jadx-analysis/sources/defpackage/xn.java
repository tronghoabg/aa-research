package defpackage;

/* loaded from: classes2.dex */
final class xn {
    public final Object a;
    public final String b;

    public xn(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    final String a() {
        return "[" + this.b + ", " + xq.e(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
