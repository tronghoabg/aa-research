package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class eg implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28246a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28247b;

    public /* synthetic */ eg(Object obj, int i2) {
        this.f28247b = i2;
        this.f28246a = obj;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f28247b;
        if (i2 == 0) {
            return fd.G((fd) this.f28246a, (dj) obj);
        }
        if (i2 == 1) {
            return bd.G((bd) this.f28246a, (com.waze.install.ah) obj);
        }
        if (i2 == 2) {
            return fd.H((fd) this.f28246a, (dx) obj);
        }
        if (i2 == 3) {
            return fd.I((fd) this.f28246a, (dk) obj);
        }
        if (i2 == 4) {
            return fd.J((fd) this.f28246a, (dm) obj);
        }
        if (i2 != 5) {
            return fd.L((fd) this.f28246a, (Cdo) obj);
        }
        return fd.K((fd) this.f28246a, (cs) obj);
    }
}
