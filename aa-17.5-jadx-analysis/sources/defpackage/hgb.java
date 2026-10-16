package defpackage;

/* loaded from: classes2.dex */
final class hgb {
    public final afec a;
    public final afec b;

    public hgb() {
        this(new hao(20), new hkh(1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgb)) {
            return false;
        }
        hgb hgbVar = (hgb) obj;
        return affa.f(this.a, hgbVar.a) && affa.f(this.b, hgbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OnAreaChangedCallbacks(onVisibleAreaChanged=" + this.a + ", onStableAreaChanged=" + this.b + ")";
    }

    public hgb(afec afecVar, afec afecVar2) {
        this.a = afecVar;
        this.b = afecVar2;
    }
}
