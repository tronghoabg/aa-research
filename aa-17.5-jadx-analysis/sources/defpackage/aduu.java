package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class aduu implements adwh {
    public final adss a;
    boolean b = false;
    public final /* synthetic */ aduw c;

    public aduu(aduw aduwVar, adss adssVar) {
        this.c = aduwVar;
        this.a = adssVar;
    }

    public static final String e(adne adneVar) {
        int iOrdinal;
        if (adneVar == null || (iOrdinal = adneVar.ordinal()) == 0) {
            return "none";
        }
        if (iOrdinal == 1) {
            return "integrity_only";
        }
        if (iOrdinal == 2) {
            return "privacy_and_integrity";
        }
        throw new IllegalArgumentException("Unknown SecurityLevel: ".concat(adneVar.toString()));
    }

    public static final String f(adis adisVar, adir adirVar) {
        String str = (String) adisVar.a(adirVar);
        return str == null ? "" : str;
    }

    public static final String g(adis adisVar) {
        String str = (String) adisVar.a(adkl.b);
        if (str == null) {
            str = (String) adisVar.a(admr.a);
        }
        return str == null ? "" : str;
    }

    @Override // defpackage.adwh
    public final void a(boolean z) {
        this.c.f(this.a, z);
    }

    @Override // defpackage.adwh
    public final void b() {
        aduw aduwVar = this.c;
        aduwVar.d.a(2, "READY");
        aduwVar.g.execute(new adpo(this, 20, null));
    }

    @Override // defpackage.adwh
    public final void c(adnq adnqVar, adtj adtjVar) {
        Object[] objArr = {this.a.e(), aduw.k(adnqVar)};
        aduw aduwVar = this.c;
        aduwVar.d.b(2, "{0} SHUTDOWN with {1}", objArr);
        this.b = true;
        aduwVar.g.execute(new uze(this, adtjVar, adnqVar, 13, (int[]) null));
    }

    @Override // defpackage.adwh
    public final void d() {
        woy.aa(this.b, "transportShutdown() must be called before transportTerminated().");
        adss adssVar = this.a;
        Object[] objArr = {adssVar.e()};
        aduw aduwVar = this.c;
        aduwVar.d.b(2, "{0} Terminated", objArr);
        adkj.c(aduwVar.c.f, adssVar);
        aduwVar.f(adssVar, false);
        Iterator it = aduwVar.f.iterator();
        if (!it.hasNext()) {
            aduwVar.g.execute(new aduy(this, 1));
        } else {
            adssVar.s();
            throw null;
        }
    }

    @Override // defpackage.adwh
    public final void h() {
        Iterator it = this.c.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
