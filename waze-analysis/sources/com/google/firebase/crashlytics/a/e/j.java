package com.google.firebase.crashlytics.a.e;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final j f9605a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9606b = com.google.firebase.d.e.b("generator");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9607c = com.google.firebase.d.e.b("identifier");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9608d = com.google.firebase.d.e.b("appQualitySessionId");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f9609e = com.google.firebase.d.e.b("startedAt");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f9610f = com.google.firebase.d.e.b("endedAt");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f9611g = com.google.firebase.d.e.b("crashed");

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.d.e f9612h = com.google.firebase.d.e.b(CarContext.APP_SERVICE);

    /* renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.d.e f9613i = com.google.firebase.d.e.b("user");

    /* renamed from: j, reason: collision with root package name */
    private static final com.google.firebase.d.e f9614j = com.google.firebase.d.e.b("os");

    /* renamed from: k, reason: collision with root package name */
    private static final com.google.firebase.d.e f9615k = com.google.firebase.d.e.b("device");

    /* renamed from: l, reason: collision with root package name */
    private static final com.google.firebase.d.e f9616l = com.google.firebase.d.e.b("events");
    private static final com.google.firebase.d.e m = com.google.firebase.d.e.b("generatorType");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ct ctVar = (ct) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f9606b, ctVar.i());
        gVar.d(f9607c, ctVar.j().getBytes(cu.f9545b));
        gVar.d(f9608d, ctVar.h());
        gVar.c(f9609e, ctVar.b());
        gVar.d(f9610f, ctVar.g());
        gVar.e(f9611g, ctVar.l());
        gVar.d(f9612h, ctVar.c());
        gVar.d(f9613i, ctVar.f());
        gVar.d(f9614j, ctVar.e());
        gVar.d(f9615k, ctVar.d());
        gVar.d(f9616l, ctVar.k());
        gVar.b(m, ctVar.a());
    }
}
