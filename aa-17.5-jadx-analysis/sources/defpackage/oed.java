package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class oed implements nma {
    private final odd a;
    private final String b = "MULTI_SIM_TOOLTIP";

    public oed(boolean z, acai acaiVar, yzz yzzVar) {
        this.a = new odd(R.string.multi_sim_tooltip, 2131232517, z, acaiVar, yzzVar);
    }

    @Override // defpackage.nma
    public final nlz a() {
        return nlz.a;
    }

    @Override // defpackage.nge
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return this.a.a((oco) obj, this);
    }

    @Override // defpackage.nge
    public final String c() {
        return "dialer";
    }

    @Override // defpackage.nge
    public final String d() {
        return this.b;
    }
}
