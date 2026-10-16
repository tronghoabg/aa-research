package defpackage;

/* loaded from: classes2.dex */
public final class hky implements hju {
    public final hju a;
    public final hju b;
    public final hju c;

    public hky(hju hjuVar, hju hjuVar2, hju hjuVar3) {
        this.a = hjuVar;
        this.b = hjuVar2;
        this.c = hjuVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hky)) {
            return false;
        }
        hky hkyVar = (hky) obj;
        return affa.f(this.a, hkyVar.a) && affa.f(this.b, hkyVar.b) && affa.f(this.c, hkyVar.c);
    }

    public final int hashCode() {
        hju hjuVar = this.a;
        int iHashCode = ((hjuVar == null ? 0 : hjuVar.hashCode()) * 31) + this.b.hashCode();
        hju hjuVar2 = this.c;
        return (iHashCode * 31) + (hjuVar2 != null ? hjuVar2.hashCode() : 0);
    }

    public final String toString() {
        return "StickyActionsLayoutUiModel(header=" + this.a + ", content=" + this.b + ", contentActions=" + this.c + ")";
    }
}
