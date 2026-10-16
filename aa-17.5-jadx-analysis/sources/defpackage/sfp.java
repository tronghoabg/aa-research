package defpackage;

import com.google.android.gms.carsetup.frx.SetupFsm;

/* loaded from: classes2.dex */
public final /* synthetic */ class sfp implements shk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public sfp(SetupFsm.AutoIntroState autoIntroState, int i) {
        this.b = i;
        this.a = autoIntroState;
    }

    @Override // defpackage.shk
    public final void a(yzz yzzVar, yzy yzyVar) {
        if (this.b == 0) {
            ((erb) this.a).L(yzzVar, yzyVar);
            return;
        }
        abnp abnpVarN = zab.a.n();
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = yzzVar.he;
        int iA = yzyVar.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        ((sej) this.a).b.g((zab) abnpVarN.q());
    }

    public /* synthetic */ sfp(erb erbVar, int i) {
        this.b = i;
        this.a = erbVar;
    }
}
