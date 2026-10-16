package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final f f4191a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f4192b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f4193c;

    static {
        com.google.firebase.d.d dVarA = com.google.firebase.d.e.a("currentCacheSizeBytes");
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b();
        bVar.b(1);
        dVarA.b(bVar.a());
        f4192b = dVarA.a();
        com.google.firebase.d.d dVarA2 = com.google.firebase.d.e.a("maxCacheSizeBytes");
        com.google.firebase.d.c.b bVar2 = new com.google.firebase.d.c.b();
        bVar2.b(2);
        dVarA2.b(bVar2.a());
        f4193c = dVarA2.a();
    }

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.a.a.j jVar = (com.google.android.datatransport.runtime.a.a.j) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.c(f4192b, jVar.a());
        gVar.c(f4193c, jVar.b());
    }
}
