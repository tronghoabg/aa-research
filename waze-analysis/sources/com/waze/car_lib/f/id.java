package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class id extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.eb f19695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id(com.waze.settings.eb ebVar, kotlinx.coroutines.af afVar) {
        super(Cif.f19697a, afVar);
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(afVar, "scope");
        this.f19695a = ebVar;
    }

    public final void a(String str) {
        h.g.b.x.f(str, "option");
        H(ie.f19696a);
        this.f19695a.h(h.g.b.x.n(str, "yes") ? com.waze.settings.ea.f37159a : h.g.b.x.n(str, "no") ? com.waze.settings.ea.f37160b : h.g.b.x.n(str, "alerts") ? com.waze.settings.ea.f37161c : h.g.b.x.n(str, com.waze.sound.bp.f39555b.a()) ? com.waze.settings.ea.f37165g : null);
    }
}
