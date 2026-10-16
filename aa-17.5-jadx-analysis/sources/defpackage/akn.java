package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class akn extends cxt<ako> {
    private final afec a;
    private final afec c;
    private final ala f;
    private final afec b = null;
    private final float d = Float.NaN;

    public akn(afec afecVar, afec afecVar2, ala alaVar) {
        this.a = afecVar;
        this.c = afecVar2;
        this.f = alaVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ako(this.a, this.c, this.f);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ako akoVar = (ako) cfxVar;
        float f = akoVar.c;
        long j = akoVar.e;
        float f2 = akoVar.f;
        boolean z = akoVar.d;
        float f3 = akoVar.g;
        boolean z2 = akoVar.h;
        ala alaVar = akoVar.i;
        View view = akoVar.j;
        dlg dlgVar = akoVar.k;
        akoVar.a = this.a;
        akoVar.c = Float.NaN;
        akoVar.d = true;
        akoVar.e = 9205357640488583168L;
        akoVar.f = Float.NaN;
        akoVar.g = Float.NaN;
        akoVar.h = true;
        akoVar.b = this.c;
        ala alaVar2 = this.f;
        akoVar.i = alaVar2;
        View viewC = tt.c(akoVar);
        dlg dlgVarT = bzi.t(akoVar);
        if (akoVar.o != null && (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && f != Float.NaN && !alaVar2.a()) || !a.j(9205357640488583168L, j) || !dlj.c(Float.NaN, f2) || !dlj.c(Float.NaN, f3) || !z || !z2 || !affa.f(alaVar2, alaVar) || !affa.f(viewC, view) || !affa.f(dlgVarT, dlgVar))) {
            akoVar.f();
        }
        akoVar.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akn)) {
            return false;
        }
        akn aknVar = (akn) obj;
        if (this.a != aknVar.a) {
            return false;
        }
        afec afecVar = aknVar.b;
        float f = aknVar.d;
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 961) + Float.floatToIntBits(Float.NaN)) * 31) + 1231) * 31) + a.g(9205357640488583168L)) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + 1231) * 31) + this.c.hashCode()) * 31) + this.f.hashCode();
    }
}
