package defpackage;

/* loaded from: classes.dex */
public final class aof extends cxt<aol> {
    private static final afec a = new ajc(14);
    private final api b;
    private final boolean c;
    private final asf d;
    private final boolean f;
    private final afeh g;
    private final afeh h;
    private final boolean i;
    private final bqj j;

    public aof(bqj bqjVar, api apiVar, boolean z, asf asfVar, boolean z2, afeh afehVar, afeh afehVar2, boolean z3) {
        this.j = bqjVar;
        this.b = apiVar;
        this.c = z;
        this.d = asfVar;
        this.f = z2;
        this.g = afehVar;
        this.h = afehVar2;
        this.i = z3;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new aol(this.j, a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        boolean z;
        boolean z2;
        aol aolVar = (aol) cfxVar;
        afec afecVar = a;
        bqj bqjVar = aolVar.j;
        bqj bqjVar2 = this.j;
        if (affa.f(bqjVar, bqjVar2)) {
            z = false;
        } else {
            aolVar.j = bqjVar2;
            z = true;
        }
        boolean z3 = this.i;
        if (aolVar.i != z3) {
            aolVar.i = z3;
            z2 = true;
        } else {
            z2 = z;
        }
        afeh afehVar = this.h;
        afeh afehVar2 = this.g;
        boolean z4 = this.f;
        asf asfVar = this.d;
        boolean z5 = this.c;
        api apiVar = this.b;
        aolVar.b = afehVar2;
        aolVar.c = afehVar;
        aolVar.a = z4;
        aolVar.G(afecVar, z5, asfVar, apiVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aof aofVar = (aof) obj;
        return affa.f(this.j, aofVar.j) && this.b == aofVar.b && this.c == aofVar.c && affa.f(this.d, aofVar.d) && this.f == aofVar.f && affa.f(this.g, aofVar.g) && affa.f(this.h, aofVar.h) && this.i == aofVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() * 31) + this.b.hashCode();
        asf asfVar = this.d;
        return (((((((((((iHashCode * 31) + (true != this.c ? 1237 : 1231)) * 31) + (asfVar != null ? asfVar.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + (true == this.i ? 1231 : 1237);
    }
}
