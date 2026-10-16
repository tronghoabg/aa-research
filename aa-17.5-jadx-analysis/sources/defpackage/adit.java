package defpackage;

/* loaded from: classes3.dex */
public final class adit {
    public final adsk a;
    public final admf b;
    public final admc c;
    public final adiw d;
    public final adjb[] f;
    public adsh h;
    public boolean i;
    public adti j;
    private final ajmd k;
    public final Object g = new Object();
    public final adjq e = adjq.k();

    public adit(adsk adskVar, admf admfVar, admc admcVar, adiw adiwVar, ajmd ajmdVar, adjb[] adjbVarArr) {
        this.a = adskVar;
        this.b = admfVar;
        this.c = admcVar;
        this.d = adiwVar;
        this.k = ajmdVar;
        this.f = adjbVarArr;
    }

    public final void a(adnq adnqVar) {
        woy.O(!adnqVar.g(), "Cannot fail with OK status");
        woy.aa(!this.i, "apply() or fail() already called");
        b(new adtq(adue.b(adnqVar), this.f));
    }

    public final void b(adsh adshVar) {
        boolean z;
        woy.aa(!this.i, "already finalized");
        this.i = true;
        synchronized (this.g) {
            if (this.h == null) {
                this.h = adshVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.k.b();
            return;
        }
        woy.aa(this.j != null, "delayedStream is null");
        Runnable runnableS = this.j.s(adshVar);
        if (runnableS != null) {
            runnableS.run();
        }
        this.k.b();
    }
}
