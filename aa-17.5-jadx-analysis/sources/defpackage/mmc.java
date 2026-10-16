package defpackage;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
public final class mmc {
    public final Object a;
    public final Object b;

    public mmc() {
        this.a = new eqm();
        this.b = new eqm();
    }

    public static mmc c() {
        return (mmc) mki.a.b(mmc.class, new lfu(7));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    public static final mma f() {
        mko mkoVarA = ((mkq) mki.a.i(mkq.class)).a();
        return mma.a((acxa.a.gu().aU() && mkoVarA.d.contains("key_settings_driver_aligned_dashboard")) ? mkoVarA.c.getString("key_settings_driver_aligned_dashboard", mma.c.name()) : mkoVarA.b.getString("key_settings_driver_aligned_dashboard", mma.c.name()));
    }

    public static final jey g(qrn qrnVar) {
        String strName = jey.d.name();
        return jey.a((String) kgq.c(new mmb(qrnVar, strName, 0), "GH.LayoutSetMan", yzz.SETTINGS_COMMON, yzy.dN, true, "Non-recoverable error during reading setting. Bailing.", new Object[0]));
    }

    public static final boolean h() {
        return f() == mma.DRIVER_ALIGNED;
    }

    public final eqj a() {
        eqj eqjVar = (eqj) this.a;
        if (eqjVar.e() == null) {
            eqjVar.m(f());
        }
        return eqjVar;
    }

    public final eqj b(qrn qrnVar) {
        eqj eqjVar = (eqj) this.b;
        if (eqjVar.e() == null) {
            eqjVar.m(g(qrnVar));
        }
        return eqjVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void d(mma mmaVar) {
        mko mkoVarA = mpl.f().a();
        String strName = mmaVar.name();
        if (acxa.aW() && mkoVarA.d.contains("key_settings_driver_aligned_dashboard")) {
            mkoVarA.c.edit().putString("key_settings_driver_aligned_dashboard", strName).apply();
        } else {
            mkoVarA.b.edit().putString("key_settings_driver_aligned_dashboard", strName).apply();
        }
        ((eqj) this.a).m(mmaVar);
    }

    public final void e(qrn qrnVar, jey jeyVar) {
        String strName = jeyVar.name();
        kgq.d(new mja(qrnVar, strName, 2), "GH.LayoutSetMan", yzz.SETTINGS_COMMON, yzy.dM, "Non-recoverable error during writing setting. Bailing.", new Object[0]);
        ((eqj) this.b).m(jeyVar);
    }

    public final void i() {
        ((BroadcastReceiver.PendingResult) this.a).finish();
        rpp rppVar = (rpp) this.b;
        mdd mddVar = (mdd) rppVar.a;
        if (mddVar.g) {
            Object obj = rppVar.c;
            vla.a().f((vky) rppVar.b);
            mddVar.h.c((rqy) obj);
        }
    }

    public mmc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public mmc(byte[] bArr) {
        this.b = new rtw();
        this.a = new rtw();
    }
}
