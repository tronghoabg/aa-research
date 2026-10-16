package defpackage;

/* loaded from: classes2.dex */
final class hxj implements hxo {
    int a;
    public Class b;
    private final hxk c;

    public hxj(hxk hxkVar) {
        this.c = hxkVar;
    }

    @Override // defpackage.hxo
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hxj) {
            hxj hxjVar = (hxj) obj;
            if (this.a == hxjVar.a && this.b == hxjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.a + "array=" + String.valueOf(this.b) + "}";
    }
}
