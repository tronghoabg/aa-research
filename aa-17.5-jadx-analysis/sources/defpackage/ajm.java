package defpackage;

/* loaded from: classes.dex */
public final class ajm extends cxt<ajn> {
    private final asf a;
    private final afdr b;

    public ajm(asf asfVar, afdr afdrVar) {
        this.a = asfVar;
        this.b = afdrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ajn(this.b, this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ajn ajnVar = (ajn) cfxVar;
        boolean z = ajnVar.b;
        ajnVar.w(this.a, null, false, true, null, null, this.b);
        if (z) {
            return;
        }
        ajnVar.J(false);
        ajnVar.J(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ajm ajmVar = (ajm) obj;
        return affa.f(this.a, ajmVar.a) && this.b == ajmVar.b;
    }

    public final int hashCode() {
        asf asfVar = this.a;
        return ((((((((asfVar != null ? asfVar.hashCode() : 0) * 961) + 1237) * 31) + 1231) * 29791) + this.b.hashCode()) * 923521) + 1231;
    }
}
