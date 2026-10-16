package com.waze.o.d.a;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.p.dh;
import h.ab;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f32851a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f32852b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32853c;

    /* renamed from: d, reason: collision with root package name */
    private final MapWithContentTemplate f32854d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.r.f f32855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h.g.a.a aVar, com.waze.car_lib.r.f fVar, com.waze.shared_infra.o.a aVar2, com.waze.shared_infra.i.e eVar, CarContext carContext) {
        super(carContext, "CompaninioScreen");
        x.f(aVar, "onClose");
        x.f(fVar, "viewModel");
        x.f(aVar2, "stringProvider");
        x.f(eVar, "logger");
        x.f(carContext, "carContext");
        this.f32851a = aVar;
        this.f32855e = fVar;
        this.f32852b = aVar2;
        this.f32853c = eVar;
        this.f32854d = dh.H();
        fVar.e();
        addBackPressedCallback(new e(this, 1));
        ch chVarB = fVar.b();
        Lifecycle lifecycle = getLifecycle();
        x.e(lifecycle, "<get-lifecycle>(...)");
        ai.m(ai.K(FlowExtKt.flowWithLifecycle(chVarB, lifecycle, Lifecycle.State.RESUMED), new h(this, carContext, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    static final ab c(i iVar) {
        iVar.f32855e.c();
        return ab.f48028a;
    }

    static final ab d(i iVar) {
        iVar.f32855e.d();
        return ab.f48028a;
    }

    public static final /* synthetic */ void e(i iVar) {
        iVar.f32855e.c();
        iVar.n().a(iVar.f32851a);
    }

    public static final /* synthetic */ void f(i iVar, com.waze.car_lib.p.t tVar) {
        if (x.n(tVar.b(), "COMPANINIO_MAIN_ITEM_ID")) {
            iVar.n().a(new e(iVar, 0));
            return;
        }
        com.waze.shared_infra.i.e eVar = iVar.f32853c;
        Objects.toString(tVar);
        eVar.b("You must specify a callback for this item: ".concat(String.valueOf(tVar)));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f32854d;
    }
}
