package defpackage;

/* loaded from: classes2.dex */
public final class nnq {
    public final boolean a;
    public final int b;

    public nnq(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnq)) {
            return false;
        }
        nnq nnqVar = (nnq) obj;
        return this.a == nnqVar.a && this.b == nnqVar.b;
    }

    public final int hashCode() {
        return (a.f(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "MediaHunState(inHunMode=" + this.a + ", focusBehavior=" + ((Object) nsh.d(this.b)) + ")";
    }
}
