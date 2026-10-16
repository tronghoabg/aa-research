package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hxs implements defpackage.hxx {
    int a;
    public java.lang.Class b;
    private final defpackage.hxt c;

    public hxs(defpackage.hxt hxtVar) {
        this.c = hxtVar;
    }

    @Override // defpackage.hxx
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.hxs) {
            defpackage.hxs hxsVar = (defpackage.hxs) obj;
            if (this.a == hxsVar.a && this.b == hxsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        java.lang.Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Key{size=" + this.a + "array=" + java.lang.String.valueOf(this.b) + "}";
    }
}
