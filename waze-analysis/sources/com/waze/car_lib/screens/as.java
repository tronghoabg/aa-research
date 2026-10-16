package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import com.waze.car_lib.f.gg;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.f.iv;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class as implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21791b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21792c;

    public /* synthetic */ as(com.waze.car_lib.screens.core.n nVar, Object obj, int i2) {
        this.f21792c = i2;
        this.f21790a = nVar;
        this.f21791b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f21792c) {
            case 0:
                return au.f((au) this.f21790a, this.f21791b);
            case 1:
                return au.e((au) this.f21790a, this.f21791b);
            case 2:
                return au.b((au) this.f21790a, this.f21791b);
            case 3:
                return aw.d((aw) this.f21790a, (com.waze.car_lib.r.by) this.f21791b);
            case 4:
                return bb.b((bb) this.f21790a, (com.waze.car_lib.p.aj) this.f21791b);
            case 5:
                return bb.d((bb) this.f21790a, (com.waze.car_lib.p.aj) this.f21791b);
            case 6:
                return bb.f((bb) this.f21790a, (com.waze.car_lib.p.aj) this.f21791b);
            case 7:
                return bb.c((com.waze.car_lib.p.aj) this.f21791b, (bb) this.f21790a);
            case 8:
                return bb.e((com.waze.car_lib.p.aj) this.f21791b, (bb) this.f21790a);
            case 9:
                return bf.c((bf) this.f21791b, (com.waze.car_lib.f.cw) this.f21790a);
            case 10:
                return bq.c((bq) this.f21791b, (CarContext) this.f21790a);
            case 11:
                ((bu) this.f21791b).n().a(new an(this.f21790a, 18, (float[][][]) null));
                return h.ab.f48028a;
            case 12:
                bw bwVar = (bw) this.f21791b;
                bwVar.f21905b.n();
                bwVar.n().a(new an(this.f21790a, 19, (float[][][]) null));
                return h.ab.f48028a;
            case 13:
                return ca.b((ca) this.f21791b, (gg) this.f21790a);
            case 14:
                return cb.b((cb) this.f21791b, (gg) this.f21790a);
            case 15:
                return cd.c((cd) this.f21791b, (CarContext) this.f21790a);
            case 16:
                return ch.b((ch) this.f21791b, (gw) this.f21790a);
            case 17:
                return ch.c((ch) this.f21791b, (gw) this.f21790a);
            case 18:
                return cs.e((cs) this.f21791b, (iv) this.f21790a);
            case 19:
                return cs.f((cs) this.f21791b, (iv) this.f21790a);
            default:
                return ct.c((ct) this.f21791b, (com.waze.car_lib.f.cw) this.f21790a);
        }
    }

    public /* synthetic */ as(Object obj, Object obj2, int i2) {
        this.f21792c = i2;
        this.f21791b = obj;
        this.f21790a = obj2;
    }
}
