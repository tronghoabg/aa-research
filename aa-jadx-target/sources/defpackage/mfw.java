package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mfw {
    public final defpackage.qsh a;
    public final boolean b;
    public final int c;
    public final defpackage.mfq d;
    public final com.google.android.gms.carsetup.CarInfoInternal e;
    public final defpackage.mgc f = new defpackage.mgc();
    public defpackage.mhm g;
    public final defpackage.mho h;
    final defpackage.mgu i;
    public final /* synthetic */ defpackage.mfx j;
    public final defpackage.ldx k;
    public final defpackage.wyz l;
    private final defpackage.ntl m;
    private final defpackage.wyz n;

    public mfw(defpackage.mfx mfxVar, defpackage.ntl ntlVar, defpackage.qsh qshVar, defpackage.ldx ldxVar, boolean z, int i, com.google.android.gms.carsetup.CarInfoInternal carInfoInternal) {
        this.j = mfxVar;
        defpackage.wyz wyzVar = new defpackage.wyz(this, null);
        this.n = wyzVar;
        this.l = new defpackage.wyz(this);
        this.i = new defpackage.mgk(this, 1);
        this.m = ntlVar;
        this.a = qshVar;
        this.b = z;
        this.c = i;
        this.d = new defpackage.mfq();
        this.k = ldxVar;
        this.e = carInfoInternal;
        this.h = new defpackage.mho(wyzVar, ldxVar);
    }

    public final void a(boolean z) {
        this.m.c(z);
        defpackage.mfx mfxVar = this.j;
        defpackage.ysr.bj(mfxVar.c != null);
        mfxVar.d();
    }
}
