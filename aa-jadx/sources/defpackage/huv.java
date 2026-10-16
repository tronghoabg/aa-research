package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class huv {
    public static final defpackage.huu a = new defpackage.hut();
    public final java.lang.Object b;
    public final defpackage.huu c;
    public final java.lang.String d;
    public volatile byte[] e;

    public huv(java.lang.String str, java.lang.Object obj, defpackage.huu huuVar) {
        defpackage.fyh.g(str);
        this.d = str;
        this.b = obj;
        this.c = huuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.huv) {
            return this.d.equals(((defpackage.huv) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
