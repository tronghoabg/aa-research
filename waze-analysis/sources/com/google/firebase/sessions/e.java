package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final e f10934a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f10935b = com.google.firebase.d.e.b("performance");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f10936c = com.google.firebase.d.e.b("crashlytics");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f10937d = com.google.firebase.d.e.b("sessionSamplingRate");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        k kVar = (k) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f10935b, kVar.c());
        gVar.d(f10936c, kVar.b());
        gVar.a(f10937d, kVar.a());
    }
}
