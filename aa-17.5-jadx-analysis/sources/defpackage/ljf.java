package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ljf extends liy {
    public static final yph d = yph.c("GH.FusedLocationProvide");
    public lje e;
    public final str f;

    public ljf(Context context) {
        if (context == null || !lgv.c().s()) {
            throw new IllegalStateException("Can't create unsupported FusedLocationProvider.");
        }
        str strVar = new str(context);
        this.f = strVar;
        svz svzVarA = strVar.a();
        svzVarA.m(new ljd(this, 0));
        svzVarA.j(new kmq(2));
    }

    @Override // defpackage.liy
    protected final yyv b(Float f) {
        return f == null ? yyv.FUSED_LOCATION_PROVIDER_NULL_SPEED : yyv.FUSED_LOCATION_PROVIDER_HAS_SPEED;
    }

    @Override // defpackage.liz
    public final void i() {
        super.i();
        lje ljeVar = this.e;
        if (ljeVar != null) {
            this.f.v(uqw.G(ljeVar, ste.class.getSimpleName()), 2418).a(new oyd(2), new stm(0));
        }
    }
}
