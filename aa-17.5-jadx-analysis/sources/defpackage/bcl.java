package defpackage;

import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class bcl extends ajk {
    public boolean i;
    public afec j;
    public final afdr k;

    public bcl(boolean z, asf asfVar, akm akmVar, boolean z2, afec afecVar) {
        super(asfVar, akmVar, false, z2, null, null, new bck(afecVar, z, 0));
        this.i = z;
        this.j = afecVar;
        this.k = new bap(this, 8);
    }

    @Override // defpackage.air
    public final void f(dec decVar) {
        decVar.a(ddx.M, vs.j(this.i));
        decVar.a(ddx.s, cgk.c);
        decVar.a(ddx.t, new cgh(AutofillValue.forToggle(this.i)));
        decVar.a(ddq.h, new ddf(null, new bbn(decVar, 4)));
    }
}
