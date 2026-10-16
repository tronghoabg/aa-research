package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class exh implements android.window.OnBackAnimationCallback {
    final /* synthetic */ defpackage.exi a;

    public exh(defpackage.exi exiVar) {
        this.a = exiVar;
    }

    public final void onBackCancelled() {
        defpackage.exi exiVar = this.a;
        defpackage.mku mkuVar = exiVar.d;
        if (mkuVar == null) {
            return;
        }
        if (!exiVar.c) {
            mkuVar.v(exiVar, null);
        }
        defpackage.exd exdVar = (defpackage.exd) mkuVar.b;
        if (defpackage.afga.f(exiVar, exdVar.e) && exdVar.d == -1) {
            defpackage.ewz ewzVarA = exdVar.c;
            if (ewzVarA == null) {
                ewzVarA = exdVar.a(-1);
            }
            exdVar.c = null;
            exdVar.d = 0;
            exdVar.e = null;
            if (ewzVarA != null) {
                ewzVarA.a();
            }
            exdVar.f.d(defpackage.exe.a);
        }
        exiVar.c = false;
    }

    public final void onBackInvoked() {
        this.a.b();
    }

    public final void onBackProgressed(android.window.BackEvent backEvent) {
        backEvent.getClass();
        defpackage.ewy ewyVarB = defpackage.ede.b(backEvent);
        defpackage.exi exiVar = this.a;
        defpackage.mku mkuVar = exiVar.d;
        if (mkuVar != null && exiVar.c) {
            defpackage.exd exdVar = (defpackage.exd) mkuVar.b;
            if (defpackage.afga.f(exiVar, exdVar.e) && exdVar.d == -1) {
                defpackage.ewz ewzVarA = exdVar.c;
                if (ewzVarA == null) {
                    ewzVarA = exdVar.a(-1);
                }
                if (ewzVarA != null) {
                    ewzVarA.c(ewyVarB);
                }
                exdVar.f.d(new defpackage.exf(ewyVarB));
            }
        }
    }

    public final void onBackStarted(android.window.BackEvent backEvent) {
        backEvent.getClass();
        defpackage.exi exiVar = this.a;
        defpackage.ewy ewyVarB = defpackage.ede.b(backEvent);
        defpackage.mku mkuVar = exiVar.d;
        if (mkuVar == null || exiVar.c) {
            return;
        }
        mkuVar.v(exiVar, ewyVarB);
        exiVar.c = true;
    }
}
