package defpackage;

/* JADX INFO: loaded from: classes.dex */
class mqb implements defpackage.mpz {
    private final boolean a;

    public mqb(boolean z) {
        this.a = z;
    }

    @Override // defpackage.mpz
    public final android.content.ComponentName a() {
        if (!this.a) {
            return null;
        }
        defpackage.ntj ntjVar = (defpackage.ntj) defpackage.mkp.a.i(defpackage.ntj.class);
        com.google.android.gms.car.display.CarDisplayId carDisplayId = com.google.android.gms.car.display.CarDisplayId.a;
        defpackage.nti ntiVarD = ntjVar.d(carDisplayId);
        if ((ntiVarD == defpackage.nti.a || ntiVarD == defpackage.nti.g || ntiVarD == defpackage.nti.h) && !((defpackage.ntj) defpackage.mkp.a.i(defpackage.ntj.class)).i(carDisplayId)) {
            return null;
        }
        return defpackage.mkt.B;
    }

    @Override // defpackage.mpz
    public final android.content.Intent b(defpackage.qsh qshVar) {
        android.content.Intent intentA;
        android.content.ComponentName componentNameA = defpackage.maw.a(qshVar, false);
        if (componentNameA == null) {
            intentA = new android.content.Intent().setComponent(a());
        } else {
            intentA = defpackage.maw.d(componentNameA) ? ((defpackage.jwm) defpackage.mkp.a.i(defpackage.jwm.class)).a(componentNameA) : new android.content.Intent().setComponent(componentNameA);
        }
        android.content.ComponentName component = intentA.getComponent();
        boolean z = this.a;
        if (component == null) {
            if (z) {
                intentA.setComponent(defpackage.mkt.B);
                return intentA;
            }
        } else if (z != ((defpackage.lhd) defpackage.mkp.a.i(defpackage.lhd.class)).i(new defpackage.mqi(component))) {
            return new android.content.Intent();
        }
        return intentA;
    }

    @Override // defpackage.mpz
    public final /* synthetic */ defpackage.ygw c() {
        int i = defpackage.ygw.d;
        return defpackage.ymx.a;
    }
}
