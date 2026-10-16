package com.waze.alerters.b;

import androidx.car.app.Screen;
import com.waze.car_lib.f.ax;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.r.bc;
import com.waze.car_lib.r.bk;
import com.waze.car_lib.r.el;
import h.ab;
import l.a.ye;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14232a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f14233b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f14233b = i2;
        this.f14232a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [com.waze.uid.stats.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [com.waze.uid.stats.s, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f14233b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((bc) this.f14232a).k();
                break;
            case 4:
                ((bc) this.f14232a).m();
                break;
            case 5:
                ((ax) this.f14232a).t();
                break;
            case 6:
                ((ax) this.f14232a).v();
                break;
            case 7:
                ((bk) this.f14232a).x().o(com.waze.bw.a.b.e.f17573a);
                break;
            case 8:
                ((bk) this.f14232a).x().o(com.waze.bw.a.b.i.f17577a);
                break;
            case 9:
                ((Screen) this.f14232a).finish();
                break;
            case 10:
                this.f14232a.r(ye.BACK);
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                ((gw) this.f14232a).e(null);
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                ((el) this.f14232a).n();
                break;
            case 19:
                this.f14232a.r(ye.BACK);
                break;
            default:
                ((Screen) this.f14232a).finish();
                break;
        }
        return ab.f48028a;
    }
}
