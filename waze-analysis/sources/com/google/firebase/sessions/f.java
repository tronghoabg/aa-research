package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final f f10938a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f10939b = com.google.firebase.d.e.b("processName");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f10940c = com.google.firebase.d.e.b("pid");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f10941d = com.google.firebase.d.e.b("importance");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f10942e = com.google.firebase.d.e.b("defaultProcess");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        u uVar = (u) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f10939b, uVar.c());
        gVar.b(f10940c, uVar.b());
        gVar.b(f10941d, uVar.a());
        gVar.e(f10942e, uVar.d());
    }
}
