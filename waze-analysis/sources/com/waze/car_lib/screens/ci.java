package com.waze.car_lib.screens;

import com.waze.car_lib.f.ej;
import com.waze.car_lib.f.hm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ci implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21934c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f21935d;

    public /* synthetic */ ci(com.waze.car_lib.screens.core.n nVar, Object obj, Object obj2, int i2) {
        this.f21935d = i2;
        this.f21932a = nVar;
        this.f21933b = obj;
        this.f21934c = obj2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f21935d;
        if (i2 == 0) {
            Object obj = this.f21934c;
            return cj.c((cj) this.f21932a, (com.waze.car_lib.c.n) this.f21933b, (com.waze.car_lib.o.x) obj);
        }
        if (i2 == 1) {
            Object obj2 = this.f21934c;
            return m.c((m) this.f21932a, (hm) this.f21933b, (com.waze.av.b.aa) obj2);
        }
        if (i2 == 2) {
            return cj.e((cj) this.f21932a);
        }
        if (i2 == 3) {
            Object obj3 = this.f21934c;
            return ck.c((ck) this.f21932a, (com.waze.car_lib.c.n) this.f21933b, (com.waze.car_lib.o.x) obj3);
        }
        if (i2 == 4) {
            return ck.e((ck) this.f21932a);
        }
        return db.c((db) this.f21934c, (ej) this.f21933b);
    }

    public /* synthetic */ ci(db dbVar, com.waze.car_lib.j.x xVar, ej ejVar, int i2) {
        this.f21935d = i2;
        this.f21934c = dbVar;
        this.f21932a = xVar;
        this.f21933b = ejVar;
    }
}
