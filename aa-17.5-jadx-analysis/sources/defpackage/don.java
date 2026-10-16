package defpackage;

/* loaded from: classes2.dex */
final class don implements csx {
    public final doj a;
    public final afec b;
    private final Object c;

    public don(doj dojVar, afec afecVar) {
        this.a = dojVar;
        this.b = afecVar;
        this.c = dojVar.a;
    }

    @Override // defpackage.csx
    public final Object d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof don)) {
            return false;
        }
        don donVar = (don) obj;
        return affa.f(this.a.a, donVar.a.a) && this.b == donVar.b;
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + this.b.hashCode();
    }
}
