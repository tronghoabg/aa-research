package defpackage;

/* loaded from: classes3.dex */
final class abni {
    private final Object a;
    private final int b;

    public abni(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abni)) {
            return false;
        }
        abni abniVar = (abni) obj;
        return this.a == abniVar.a && this.b == abniVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
