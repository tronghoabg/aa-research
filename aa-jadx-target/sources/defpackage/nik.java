package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class nik extends defpackage.kmn {
    public static final /* synthetic */ defpackage.afja[] a = {new defpackage.afgn(defpackage.nik.class, "fragmentHost", "getFragmentHost()Lcom/google/android/apps/auto/components/system/fragment/CarFragmentHost;", 0)};
    public static final defpackage.yqm b = defpackage.yqm.c("GH.CompRailBaseFrag");
    public odl c;
    public final defpackage.afhl d;
    public boolean e;
    private boolean f;
    private final defpackage.lhe g;
    private final defpackage.lhe h;
    private final defpackage.lhe i;
    private final defpackage.lhe j;

    public nik() {
        getLifecycle().c(new defpackage.nii(this));
        this.d = new defpackage.nij(this);
        this.g = new defpackage.lhe((byte[]) null);
        this.h = new defpackage.lhe((byte[]) null);
        this.i = new defpackage.lhe((byte[]) null);
        this.j = new defpackage.lhe((byte[]) null);
    }

    public static final void b(ngx ngxVar, defpackage.zbd zbdVar, java.lang.String str, java.lang.Object... objArr) {
        defpackage.ypu ypuVarL = b.l();
        int length = objArr.length;
        java.lang.String strD = ngxVar.d();
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        ypuVarL.R("Not showing tooltip for display %s/%s: %s", ngxVar.c(), strD, str2);
        defpackage.nef nefVar = new defpackage.nef(17);
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL, zbdVar);
        nefVar.invoke(rrvVarH);
        oimVarU.F(rrvVarH.l());
    }

    public final defpackage.lhe c(defpackage.nmu nmuVar) {
        int iOrdinal = nmuVar.ordinal();
        if (iOrdinal == 0) {
            return this.g;
        }
        if (iOrdinal == 1) {
            return this.j;
        }
        if (iOrdinal == 2) {
            return this.h;
        }
        if (iOrdinal == 3) {
            return null;
        }
        if (iOrdinal == 4) {
            return this.i;
        }
        throw new defpackage.afas();
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onCreate */
    public final void m6lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        super.m6lambda$performCreate$3$androidsupportv4appFragment(bundle);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("OnFirstResumeEventPublishedKey", false)) {
            z = true;
        }
        this.f = z;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f) {
            defpackage.omv.g(getContext(), "com.google.android.gms.car.STARTUP_LATENCY_MEASUREMENT_EVENT", defpackage.rss.b.ordinal(), null);
            this.f = true;
        }
        if (this.e) {
            return;
        }
        ((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).fW(new defpackage.nih(this), true);
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m16x22bc4f96(android.os.Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("OnFirstResumeEventPublishedKey", this.f);
    }
}
