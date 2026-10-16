package com.google.android.datatransport.cct.a;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final c f3987a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f3988b = com.google.firebase.d.e.b("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f3989c = com.google.firebase.d.e.b("model");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f3990d = com.google.firebase.d.e.b(CarContext.HARDWARE_SERVICE);

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f3991e = com.google.firebase.d.e.b("device");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f3992f = com.google.firebase.d.e.b("product");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f3993g = com.google.firebase.d.e.b("osBuild");

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.d.e f3994h = com.google.firebase.d.e.b("manufacturer");

    /* renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.d.e f3995i = com.google.firebase.d.e.b("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    private static final com.google.firebase.d.e f3996j = com.google.firebase.d.e.b("locale");

    /* renamed from: k, reason: collision with root package name */
    private static final com.google.firebase.d.e f3997k = com.google.firebase.d.e.b("country");

    /* renamed from: l, reason: collision with root package name */
    private static final com.google.firebase.d.e f3998l = com.google.firebase.d.e.b("mccMnc");
    private static final com.google.firebase.d.e m = com.google.firebase.d.e.b("applicationBuild");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f3988b, bVar.a());
        gVar.d(f3989c, bVar.j());
        gVar.d(f3990d, bVar.f());
        gVar.d(f3991e, bVar.d());
        gVar.d(f3992f, bVar.l());
        gVar.d(f3993g, bVar.k());
        gVar.d(f3994h, bVar.h());
        gVar.d(f3995i, bVar.e());
        gVar.d(f3996j, bVar.g());
        gVar.d(f3997k, bVar.c());
        gVar.d(f3998l, bVar.i());
        gVar.d(m, bVar.b());
    }
}
