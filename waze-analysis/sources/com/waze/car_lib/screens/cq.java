package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapTemplate;
import com.waze.car_lib.f.id;
import com.waze.car_lib.r.en;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cq extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final id f21974a;

    /* renamed from: b, reason: collision with root package name */
    private final en f21975b;

    /* renamed from: c, reason: collision with root package name */
    private final MapTemplate f21976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(id idVar, CarContext carContext) {
        super(carContext, "SoundSettingsScreen", new com.waze.car_lib.l.d(new o(20), new cp(1)));
        h.g.b.x.f(idVar, "controller");
        h.g.b.x.f(carContext, "carContext");
        this.f21974a = idVar;
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        en enVar = (en) bVarL.a(new h.g.b.m(en.class), null, null);
        this.f21975b = enVar;
        this.f21976c = com.waze.authentication.ax.h(carContext, enVar.a(), new cp(0), new am(this, 2));
    }

    public static /* synthetic */ h.ab b(cq cqVar, String str) {
        cqVar.f21975b.b(cqVar.f21974a, str);
        return h.ab.f48028a;
    }

    static final h.ab c(cq cqVar, String str) {
        h.g.b.x.f(str, "it");
        cqVar.n().a(new com.waze.app_nav.hub.n(cqVar, str, 4));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21976c;
    }
}
