package com.waze.main_screen.p.a.b.a;

import android.content.Context;
import androidx.car.app.CarContext;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.Ref;
import com.waze.car_lib.f.dn;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.at;
import com.waze.car_lib.r.cq;
import com.waze.car_lib.screens.ag;
import com.waze.n.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class z implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26862e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f26863f;

    public /* synthetic */ z(ag agVar, CarContext carContext, at atVar, dn dnVar, boolean z, int i2) {
        this.f26863f = i2;
        this.f26859b = agVar;
        this.f26862e = carContext;
        this.f26860c = atVar;
        this.f26861d = dnVar;
        this.f26858a = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f26863f == 0) {
            Context context = (Context) obj;
            ?? r4 = this.f26862e;
            boolean z = this.f26858a;
            Object obj2 = this.f26861d;
            return ab.a(this.f26859b, this.f26860c, (Ref) obj2, z, r4, context);
        }
        Context context2 = (Context) this.f26862e;
        cq cqVarH = ((aq) obj).h();
        Object obj3 = this.f26860c;
        Object obj4 = this.f26859b;
        com.waze.car_lib.screens.core.n nVar = (com.waze.car_lib.screens.core.n) obj4;
        com.waze.car_lib.screens.q qVar = new com.waze.car_lib.screens.q(nVar, obj3, 7);
        final boolean z2 = this.f26858a;
        final dn dnVar = (dn) this.f26861d;
        final ag agVar = (ag) obj4;
        final at atVar = (at) obj3;
        nVar.q(dh.v(context2, cqVarH, qVar, new h.g.a.a() { // from class: com.waze.car_lib.screens.af
            @Override // h.g.a.a
            public final Object invoke() {
                return ag.c(agVar, atVar, dnVar, z2);
            }
        }));
        return h.ab.f48028a;
    }

    public /* synthetic */ z(h.g.a.a aVar, h.g.a.a aVar2, Ref ref, boolean z, State state, int i2) {
        this.f26863f = i2;
        this.f26859b = aVar;
        this.f26860c = aVar2;
        this.f26861d = ref;
        this.f26858a = z;
        this.f26862e = state;
    }
}
