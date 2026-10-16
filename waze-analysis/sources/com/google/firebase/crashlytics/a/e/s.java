package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final s f9661a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9662b = com.google.firebase.d.e.b("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9663c = com.google.firebase.d.e.b("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9664d = com.google.firebase.d.e.b("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f9665e = com.google.firebase.d.e.b("orientation");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f9666f = com.google.firebase.d.e.b("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f9667g = com.google.firebase.d.e.b("diskUsed");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ch chVar = (ch) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f9662b, chVar.e());
        gVar.b(f9663c, chVar.a());
        gVar.e(f9664d, chVar.f());
        gVar.b(f9665e, chVar.b());
        gVar.c(f9666f, chVar.d());
        gVar.c(f9667g, chVar.c());
    }
}
