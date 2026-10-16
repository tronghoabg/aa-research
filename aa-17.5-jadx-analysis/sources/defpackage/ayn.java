package defpackage;

/* loaded from: classes.dex */
public final class ayn extends cxt<ayo> {
    private final aew a;
    private final aew b;
    private final aew c;

    public ayn(aew aewVar, aew aewVar2, aew aewVar3) {
        this.a = aewVar;
        this.b = aewVar2;
        this.c = aewVar3;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ayo(this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ayo ayoVar = (ayo) cfxVar;
        ayoVar.a = this.a;
        ayoVar.b = this.b;
        ayoVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayn)) {
            return false;
        }
        ayn aynVar = (ayn) obj;
        return affa.f(this.a, aynVar.a) && affa.f(this.b, aynVar.b) && affa.f(this.c, aynVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ")";
    }
}
