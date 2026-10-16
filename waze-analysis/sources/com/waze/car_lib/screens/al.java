package com.waze.car_lib.screens;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class al implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21771b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21772c;

    public /* synthetic */ al(ap apVar, com.waze.car_lib.f.ax axVar, int i2) {
        this.f21772c = i2;
        this.f21770a = apVar;
        this.f21771b = axVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f21772c;
        if (i2 == 0) {
            Object obj2 = this.f21771b;
            return ap.c((ap) this.f21770a, (com.waze.car_lib.f.ax) obj2, (com.waze.car_lib.p.ao) obj);
        }
        if (i2 == 1) {
            Object obj3 = this.f21770a;
            return h.b((h) this.f21771b, (com.waze.car_lib.r.e) obj3, (com.waze.car_lib.p.t) obj);
        }
        if (i2 != 2) {
            Object obj4 = this.f21770a;
            return dc.b((dc) this.f21771b, (com.waze.car_lib.r.a) obj4, (String) obj);
        }
        Object obj5 = this.f21770a;
        return ay.b((ay) this.f21771b, (com.waze.car_lib.r.ae) obj5, (String) obj);
    }

    public /* synthetic */ al(com.waze.car_lib.screens.core.n nVar, Object obj, int i2) {
        this.f21772c = i2;
        this.f21771b = nVar;
        this.f21770a = obj;
    }
}
