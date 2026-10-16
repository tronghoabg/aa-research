package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final g f4194a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f4195b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f4196c;

    static {
        com.google.firebase.d.d dVarA = com.google.firebase.d.e.a("startMs");
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b();
        bVar.b(1);
        dVarA.b(bVar.a());
        f4195b = dVarA.a();
        com.google.firebase.d.d dVarA2 = com.google.firebase.d.e.a("endMs");
        com.google.firebase.d.c.b bVar2 = new com.google.firebase.d.c.b();
        bVar2.b(2);
        dVarA2.b(bVar2.a());
        f4196c = dVarA2.a();
    }

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.a.a.l lVar = (com.google.android.datatransport.runtime.a.a.l) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.c(f4195b, lVar.b());
        gVar.c(f4196c, lVar.a());
    }
}
