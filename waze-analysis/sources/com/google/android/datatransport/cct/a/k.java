package com.google.android.datatransport.cct.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final k f4024a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f4025b = com.google.firebase.d.e.b("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f4026c = com.google.firebase.d.e.b("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f4027d = com.google.firebase.d.e.b("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f4028e = com.google.firebase.d.e.b("logSource");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f4029f = com.google.firebase.d.e.b("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f4030g = com.google.firebase.d.e.b("logEvent");

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.d.e f4031h = com.google.firebase.d.e.b("qosTier");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        aj ajVar = (aj) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.c(f4025b, ajVar.a());
        gVar.c(f4026c, ajVar.b());
        gVar.d(f4027d, ajVar.c());
        gVar.d(f4028e, ajVar.e());
        gVar.d(f4029f, ajVar.f());
        gVar.d(f4030g, ajVar.g());
        gVar.d(f4031h, ajVar.d());
    }
}
