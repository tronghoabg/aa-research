package defpackage;

/* loaded from: classes2.dex */
public final class evn {
    public final ncp a;

    public evn(ncp ncpVar) {
        this.a = ncpVar;
    }

    public final void a(String str) {
        ncp ncpVar = this.a;
        ((aan) ncpVar.b).i(str);
        esg esgVarB = ncpVar.B();
        esf esfVar = (esf) esgVarB.a.a(str);
        if (esfVar == null) {
            return;
        }
        esfVar.a();
        if (esfVar.c) {
            esgVarB.a(str);
        }
    }

    public final String toString() {
        return "NavControllerViewModel(provider=" + this.a + ")";
    }
}
