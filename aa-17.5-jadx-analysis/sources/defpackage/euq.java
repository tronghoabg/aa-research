package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class euq implements eqa, eru, epo, fbg {
    public euz a;
    public eps b;
    public final String c;
    public final Bundle d;
    public boolean f;
    public eps i;
    public final evn j;
    public final erb k;
    private final Bundle l;
    public final fbf e = ebi.l(this);
    private final aezr m = woy.dG(new eup(0));
    public final eqc g = new eqc(this, true);
    public final aezr h = woy.dG(new eup(2));

    public euq(erb erbVar, euz euzVar, Bundle bundle, eps epsVar, evn evnVar, String str, Bundle bundle2) {
        this.k = erbVar;
        this.a = euzVar;
        this.l = bundle;
        this.b = epsVar;
        this.j = evnVar;
        this.c = str;
        this.d = bundle2;
        woy.dG(new epp(this, 3));
        this.i = eps.b;
    }

    public final Bundle a() {
        Bundle bundle = this.l;
        if (bundle == null) {
            return null;
        }
        Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        bundleZ.putAll(bundle);
        return bundleZ;
    }

    public final void b(eps epsVar) {
        epsVar.getClass();
        this.i = epsVar;
        c();
    }

    public final void c() {
        if (!this.f) {
            fbf fbfVar = this.e;
            fbfVar.a();
            this.f = true;
            if (this.j != null) {
                erg.b(this);
            }
            fbfVar.b(this.d);
        }
        int iOrdinal = this.b.ordinal();
        int iOrdinal2 = this.i.ordinal();
        eqc eqcVar = this.g;
        if (iOrdinal < iOrdinal2) {
            eqcVar.f(this.b);
        } else {
            eqcVar.f(this.i);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof euq)) {
            Bundle bundle = this.l;
            euq euqVar = (euq) obj;
            Bundle bundle2 = euqVar.l;
            boolean zN = affa.f(bundle, bundle2) ? true : (bundle == null || bundle2 == null) ? false : dan.n(bundle, bundle2);
            if (affa.f(this.c, euqVar.c) && affa.f(this.a, euqVar.a) && affa.f(this.g, euqVar.g) && affa.f(getSavedStateRegistry(), euqVar.getSavedStateRegistry()) && zN) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // defpackage.epo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.esc getDefaultViewModelCreationExtras() {
        /*
            r4 = this;
            ese r0 = new ese
            r1 = 0
            r0.<init>(r1)
            esb r2 = defpackage.erg.a
            r0.b(r2, r4)
            esb r2 = defpackage.erg.b
            r0.b(r2, r4)
            android.os.Bundle r2 = r4.a()
            if (r2 == 0) goto L1b
            esb r3 = defpackage.erg.c
            r0.b(r3, r2)
        L1b:
            erb r4 = r4.k
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r4.a
            android.content.Context r4 = (android.content.Context) r4
            android.content.Context r4 = r4.getApplicationContext()
            boolean r2 = r4 instanceof android.app.Application
            if (r2 == 0) goto L2e
            android.app.Application r4 = (android.app.Application) r4
            goto L2f
        L2e:
            r4 = r1
        L2f:
            r2 = 1
            boolean r3 = r4 instanceof android.app.Application
            if (r2 == r3) goto L35
            goto L36
        L35:
            r1 = r4
        L36:
            if (r1 == 0) goto L3d
            esb r4 = defpackage.erp.b
            r0.b(r4, r1)
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euq.getDefaultViewModelCreationExtras():esc");
    }

    @Override // defpackage.epo
    public final erq getDefaultViewModelProviderFactory() {
        return (erh) this.m.a();
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.g;
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return (fbe) this.e.b;
    }

    @Override // defpackage.eru
    public final ert getViewModelStore() {
        if (!this.f) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.g.e == eps.a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        evn evnVar = this.j;
        if (evnVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.c;
        aan aanVar = evnVar.a.B().a;
        Object objA = aanVar.a(str);
        if (objA == null) {
            objA = new esf(str, new ert());
            aanVar.m(str, objA);
        }
        return ((esf) objA).b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        Bundle bundle = this.l;
        if (bundle != null) {
            iHashCode = (iHashCode * 31) + dan.m(bundle);
        }
        return (((iHashCode * 31) + this.g.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(affw.b(sb.getClass()).getSimpleName());
        sb.append("(" + this.c + ")");
        sb.append(" destination=");
        sb.append(this.a);
        return sb.toString();
    }
}
