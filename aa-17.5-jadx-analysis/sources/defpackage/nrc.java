package defpackage;

/* loaded from: classes2.dex */
public final class nrc {
    private static final yph a = yph.c("GH.InitialFocusMngr");
    private eqm b;

    public static nrc b() {
        return (nrc) mki.a.b(nrc.class, new may(13));
    }

    public static final jez d(qrn qrnVar) {
        try {
            mki.a.g();
            jez jezVarA = jez.a(ols.y(qrnVar, "initial_focus_mode", jez.LET_HU_DECIDE.e));
            ((ype) a.l().ai(5325)).y("Initial focus mode is %s", jezVarA);
            return jezVarA;
        } catch (qrz unused) {
            return (jez) tss.q("GH.InitialFocusMngr", "Couldn't get car service settings", new Object[0]);
        }
    }

    public final eqj a(qrn qrnVar) {
        eqm eqmVar = this.b;
        if (eqmVar != null) {
            return eqmVar;
        }
        eqm eqmVar2 = new eqm(d(qrnVar));
        this.b = eqmVar2;
        return eqmVar2;
    }

    public final void c(jez jezVar, yzz yzzVar, qrn qrnVar) {
        ((ype) a.l().ai((char) 5326)).y("Updating initial focus mode to %s", jezVar);
        try {
            mki.a.g();
            ols.D(qrnVar, "initial_focus_mode", jezVar.e);
        } catch (qrz unused) {
            tss.q("GH.InitialFocusMngr", "Couldn't set car service settings", new Object[0]);
        }
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, jezVar.f).l());
        eqm eqmVar = this.b;
        if (eqmVar != null) {
            eqmVar.m(jezVar);
        }
    }
}
