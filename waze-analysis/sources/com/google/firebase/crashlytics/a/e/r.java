package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final r f9656a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9657b = com.google.firebase.d.e.b("processName");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9658c = com.google.firebase.d.e.b("pid");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9659d = com.google.firebase.d.e.b("importance");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f9660e = com.google.firebase.d.e.b("defaultProcess");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        cd cdVar = (cd) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f9657b, cdVar.c());
        gVar.b(f9658c, cdVar.b());
        gVar.b(f9659d, cdVar.a());
        gVar.e(f9660e, cdVar.d());
    }
}
