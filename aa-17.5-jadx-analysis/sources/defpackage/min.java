package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class min {
    public static final yph a = yph.c("GH.Radio.BTS");
    static final etf b = new etf("AAPRadioRoot", null);
    public yfy c;
    public yfy d;
    public yfy e;
    public final Context f;
    private final eqa g;

    public min(Context context, mil milVar, eqa eqaVar) {
        yfy yfyVar = ylx.a;
        this.c = yfyVar;
        this.d = yfyVar;
        this.e = yfyVar;
        this.f = context;
        this.g = eqaVar;
        milVar.g.fE(eqaVar, new lsh(this, 8));
        milVar.i.fE(eqaVar, new lsh(this, 9));
        milVar.f.fE(eqaVar, new lsh(this, 10));
    }

    public final boolean a() {
        return this.g.getLifecycle().a().a(eps.d);
    }
}
