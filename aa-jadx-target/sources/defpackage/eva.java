package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eva {
    public final android.content.Context a;
    public final ewv b = new ewv(this, new defpackage.eig(this, 5));
    public android.app.Activity c;
    public boolean d;
    public final defpackage.op e;
    public boolean f;
    public final defpackage.erh g;
    private final defpackage.afar h;

    public eva(android.content.Context context) {
        java.lang.Object next;
        this.a = context;
        this.g = new defpackage.erh(context);
        java.util.Iterator itA = afsg.f(context, new dne(14)).a();
        while (itA.hasNext()) {
            next = itA.next();
            if (((android.content.Context) next) instanceof android.app.Activity) {
                this.c = (android.app.Activity) next;
                this.e = new defpackage.euz(this);
                this.f = true;
                defpackage.evw evwVar = this.b.k;
                evwVar.c(new defpackage.evh(evwVar));
                this.b.k.c(new defpackage.eue(this.a));
                this.h = new defpackage.afay(new defpackage.eig(this, 6));
            }
        }
        next = null;
        this.c = (android.app.Activity) next;
        this.e = new defpackage.euz(this);
        this.f = true;
        defpackage.evw evwVar2 = this.b.k;
        evwVar2.c(new defpackage.evh(evwVar2));
        this.b.k.c(new defpackage.eue(this.a));
        this.h = new defpackage.afay(new defpackage.eig(this, 6));
    }

    public final defpackage.eux a(defpackage.evv evvVar) {
        evvVar.getClass();
        return new defpackage.eux(this, evvVar);
    }

    public final defpackage.evf b() {
        return this.b.e();
    }

    public final defpackage.evi c() {
        return (defpackage.evi) this.h.a();
    }

    public final defpackage.evw d() {
        return this.b.k;
    }

    public final defpackage.evf e(int i) {
        return this.b.d(i, (defpackage.evf) null);
    }

    public final void f(int i, android.os.Bundle bundle) {
        int i2;
        defpackage.evk evkVar;
        int i3;
        ewv ewvVar = this.b;
        defpackage.afbz afbzVar = ewvVar.e;
        defpackage.evf evfVar = afbzVar.isEmpty() ? ewvVar.b : ((defpackage.euw) afbzVar.e()).a;
        if (evfVar == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(this, "No current destination found. Ensure a navigation graph has been set for NavController ", "."));
        }
        defpackage.eut eutVarE = evfVar.e(i);
        android.os.Bundle bundleU = null;
        int i4 = 0;
        if (eutVarE != null) {
            evkVar = eutVarE.b;
            android.os.Bundle bundle2 = eutVarE.c;
            i2 = eutVarE.a;
            if (bundle2 != null) {
                bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
                bundleU.putAll(bundle2);
            }
        } else {
            i2 = i;
            evkVar = null;
        }
        if (bundle != null) {
            if (bundleU == null) {
                bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
            }
            bundleU.putAll(bundle);
        }
        if (i2 != 0) {
            i4 = i2;
        } else if (evkVar != null && (i3 = evkVar.c) != -1) {
            if (i3 != -1) {
                ewvVar.t(i3, evkVar.d);
                return;
            }
            return;
        }
        if (i4 == 0) {
            throw new java.lang.IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        defpackage.evf evfVarE = e(i4);
        if (evfVarE != null) {
            g(evfVarE, bundleU, evkVar);
            return;
        }
        defpackage.erh erhVar = this.g;
        java.lang.String strG = defpackage.ebm.g(erhVar, i4);
        if (eutVarE == null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bx(evfVar, strG, "Navigation action/destination ", " cannot be found from the current destination "));
        }
        throw new java.lang.IllegalArgumentException("Navigation destination " + strG + " referenced from action " + defpackage.ebm.g(erhVar, i) + " cannot be found from the current destination " + evfVar);
    }

    public final void g(defpackage.evf evfVar, android.os.Bundle bundle, defpackage.evk evkVar) {
        this.b.p(evfVar, bundle, evkVar);
    }
}
