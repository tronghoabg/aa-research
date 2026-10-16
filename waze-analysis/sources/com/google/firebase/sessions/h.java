package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final h f10947a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f10948b = com.google.firebase.d.e.b("sessionId");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f10949c = com.google.firebase.d.e.b("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f10950d = com.google.firebase.d.e.b("sessionIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f10951e = com.google.firebase.d.e.b("eventTimestampUs");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f10952f = com.google.firebase.d.e.b("dataCollectionStatus");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f10953g = com.google.firebase.d.e.b("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.d.e f10954h = com.google.firebase.d.e.b("firebaseAuthenticationToken");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        aq aqVar = (aq) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f10948b, aqVar.g());
        gVar.d(f10949c, aqVar.f());
        gVar.b(f10950d, aqVar.a());
        gVar.c(f10951e, aqVar.b());
        gVar.d(f10952f, aqVar.c());
        gVar.d(f10953g, aqVar.e());
        gVar.d(f10954h, aqVar.d());
    }
}
