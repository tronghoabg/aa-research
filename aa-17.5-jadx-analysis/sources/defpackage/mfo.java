package defpackage;

import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes.dex */
public final class mfo {
    public final qrn a;
    public final boolean b;
    public final int c;
    public final mfi d;
    public final CarInfoInternal e;
    public final mfu f = new mfu();
    public mhf g;
    public final mhh h;
    final mgm i;
    public final /* synthetic */ mfp j;
    public final lgx k;
    public final wyd l;
    private final kgx m;
    private final wyd n;

    public mfo(mfp mfpVar, kgx kgxVar, qrn qrnVar, lgx lgxVar, boolean z, int i, CarInfoInternal carInfoInternal) {
        this.j = mfpVar;
        wyd wydVar = new wyd(this, null);
        this.n = wydVar;
        this.l = new wyd(this);
        this.i = new mgc(this, 1);
        this.m = kgxVar;
        this.a = qrnVar;
        this.b = z;
        this.c = i;
        this.d = new mfi();
        this.k = lgxVar;
        this.e = carInfoInternal;
        this.h = new mhh(wydVar, lgxVar);
    }

    public final void a(boolean z) {
        this.m.f(z);
        mfp mfpVar = this.j;
        if (mfpVar.c == null) {
            throw new IllegalStateException();
        }
        mfpVar.d();
    }
}
