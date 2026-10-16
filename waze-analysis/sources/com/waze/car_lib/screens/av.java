package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import com.waze.car_lib.f.gg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class av implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21803c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f21804d;

    public /* synthetic */ av(ak akVar, com.waze.car_lib.r.bc bcVar, com.waze.map.b.n nVar, int i2) {
        this.f21804d = i2;
        this.f21802b = akVar;
        this.f21801a = bcVar;
        this.f21803c = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.waze.map.b.n, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f21804d;
        if (i2 == 0) {
            Object obj2 = this.f21803c;
            Object obj3 = this.f21802b;
            return aw.b((aw) this.f21801a, (CarContext) obj3, (com.waze.car_lib.r.by) obj2, (com.waze.car_lib.p.an) obj);
        }
        if (i2 == 1) {
            ?? r0 = this.f21803c;
            Object obj4 = this.f21801a;
            return ak.d((ak) this.f21802b, (com.waze.car_lib.r.bc) obj4, r0, (com.waze.car_lib.p.am) obj);
        }
        if (i2 != 2) {
            Object obj5 = this.f21803c;
            Object obj6 = this.f21802b;
            return cb.c((cb) this.f21801a, (gg) obj6, (com.waze.reports_v2.b.ag) obj5, (com.waze.car_lib.p.t) obj);
        }
        Object obj7 = this.f21803c;
        Object obj8 = this.f21802b;
        return ca.c((ca) this.f21801a, (gg) obj8, (com.waze.reports_v2.b.ag) obj7, (com.waze.car_lib.p.t) obj);
    }

    public /* synthetic */ av(com.waze.car_lib.screens.core.n nVar, Object obj, Object obj2, int i2) {
        this.f21804d = i2;
        this.f21801a = nVar;
        this.f21802b = obj;
        this.f21803c = obj2;
    }
}
