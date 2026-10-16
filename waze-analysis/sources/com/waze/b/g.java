package com.waze.b;

import android.content.Context;
import androidx.car.app.Screen;
import com.waze.car_lib.b.ap;
import com.waze.car_lib.f.bv;
import com.waze.car_lib.f.bx;
import com.waze.car_lib.p.dd;
import com.waze.car_lib.r.at;
import com.waze.car_lib.screens.ae;
import com.waze.jp;
import com.waze.jz;
import com.waze.trip_overview.by;
import h.ab;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16140a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f16141b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f16141b = i2;
        this.f16140a = obj;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f16141b) {
            case 0:
                return l.c((l) this.f16140a);
            case 1:
                return l.b((l) this.f16140a);
            case 2:
                return w.b((w) this.f16140a);
            case 3:
                return w.c((w) this.f16140a);
            case 4:
                ((jz) this.f16140a).b().a(2);
                return ab.f48028a;
            case 5:
                ((jp) this.f16140a).b().invoke(com.waze.modules.navigation.w.f30499a);
                return ab.f48028a;
            case 6:
                ((jp) this.f16140a).b().invoke(com.waze.modules.navigation.w.f30500b);
                return ab.f48028a;
            case 7:
                ((jp) this.f16140a).b().invoke(com.waze.modules.navigation.w.f30501c);
                return ab.f48028a;
            case 8:
                ((ap) this.f16140a).v.c(null);
                return ab.f48028a;
            case 9:
                ((com.waze.car_lib.c.f) this.f16140a).d().a();
                return ab.f48028a;
            case 10:
                ((com.waze.shared_infra.coordinators.o) this.f16140a).D(by.f41143a);
                return ab.f48028a;
            case 11:
                ((bv) this.f16140a).f().H(bx.f19441a);
                return ab.f48028a;
            case 12:
                return (Context) ((WeakReference) this.f16140a).get();
            case 13:
                return (Context) ((WeakReference) this.f16140a).get();
            case 14:
                ((com.waze.car_lib.r.d) this.f16140a).w();
                return ab.f48028a;
            case 15:
                ((Screen) this.f16140a).finish();
                return ab.f48028a;
            case 16:
                return com.waze.car_lib.screens.p.b((com.waze.car_lib.screens.p) this.f16140a);
            case 17:
                dd ddVar = (dd) this.f16140a;
                ddVar.a().invoke();
                ddVar.c().invoke();
                return ab.f48028a;
            case 18:
                return com.waze.car_lib.screens.v.c((com.waze.car_lib.screens.v) this.f16140a);
            case 19:
                return ae.c((ae) this.f16140a);
            default:
                ((at) this.f16140a).f();
                return ab.f48028a;
        }
    }
}
