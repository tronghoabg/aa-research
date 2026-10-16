package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final d f10927a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f10928b = com.google.firebase.d.e.b("appId");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f10929c = com.google.firebase.d.e.b("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f10930d = com.google.firebase.d.e.b("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f10931e = com.google.firebase.d.e.b("osVersion");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f10932f = com.google.firebase.d.e.b("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f10933g = com.google.firebase.d.e.b("androidAppInfo");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f10928b, bVar.c());
        gVar.d(f10929c, bVar.d());
        gVar.d(f10930d, bVar.f());
        gVar.d(f10931e, bVar.e());
        gVar.d(f10932f, bVar.b());
        gVar.d(f10933g, bVar.a());
    }
}
