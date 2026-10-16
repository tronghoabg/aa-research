package defpackage;

/* loaded from: classes3.dex */
public final class uaz {
    public int a;
    public abeg b;

    public uaz(int i, abeg abegVar) {
        this.a = i;
        this.b = abegVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uaz) {
            uaz uazVar = (uaz) obj;
            if (this.a == uazVar.a && this.b == uazVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 37) + System.identityHashCode(this.b);
    }
}
