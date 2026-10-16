package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final g f9585a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9586b = com.google.firebase.d.e.b("identifier");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9587c = com.google.firebase.d.e.b("version");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9588d = com.google.firebase.d.e.b("displayVersion");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f9589e = com.google.firebase.d.e.b("organization");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f9590f = com.google.firebase.d.e.b("installationUuid");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f9591g = com.google.firebase.d.e.b("developmentPlatform");

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.d.e f9592h = com.google.firebase.d.e.b("developmentPlatformVersion");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        bl blVar = (bl) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f9586b, blVar.d());
        gVar.d(f9587c, blVar.f());
        gVar.d(f9588d, blVar.c());
        com.google.firebase.d.e eVar = f9589e;
        blVar.g();
        gVar.d(eVar, null);
        gVar.d(f9590f, blVar.e());
        gVar.d(f9591g, blVar.a());
        gVar.d(f9592h, blVar.b());
    }
}
