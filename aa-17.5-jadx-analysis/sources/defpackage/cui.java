package defpackage;

/* loaded from: classes.dex */
public final class cui extends cxt<cuj> {
    private final long a;
    private final afec b;

    public cui(long j, afec afecVar) {
        this.a = j;
        this.b = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cuj(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        cuj cujVar = (cuj) cfxVar;
        cujVar.a = this.a;
        cujVar.b = 1.0f;
        cujVar.c = this.b;
        dej dejVar = cujVar.d;
        if (dejVar != null) {
            cujVar.g(1.0f, dejVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cui cuiVar = (cui) obj;
        return this.a == cuiVar.a && this.b == cuiVar.b;
    }

    public final int hashCode() {
        return (((((int) this.a) * 31) + Float.floatToIntBits(1.0f)) * 961) + this.b.hashCode();
    }
}
