package defpackage;

/* loaded from: classes2.dex */
final class gom {
    public final int a;
    public final Object b;

    public gom(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gom)) {
            return false;
        }
        gom gomVar = (gom) obj;
        return this.a == gomVar.a && affa.f(this.b, gomVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UiState(selectedIndex=" + this.a + ", delegateState=" + this.b + ")";
    }
}
