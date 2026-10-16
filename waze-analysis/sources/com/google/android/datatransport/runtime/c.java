package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final c f4180a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f4181b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f4182c;

    static {
        com.google.firebase.d.d dVarA = com.google.firebase.d.e.a("eventsDroppedCount");
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b();
        bVar.b(1);
        dVarA.b(bVar.a());
        f4181b = dVarA.a();
        com.google.firebase.d.d dVarA2 = com.google.firebase.d.e.a("reason");
        com.google.firebase.d.c.b bVar2 = new com.google.firebase.d.c.b();
        bVar2.b(3);
        dVarA2.b(bVar2.a());
        f4182c = dVarA2.a();
    }

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.a.a.g gVar = (com.google.android.datatransport.runtime.a.a.g) obj;
        com.google.firebase.d.g gVar2 = (com.google.firebase.d.g) obj2;
        gVar2.c(f4181b, gVar.a());
        gVar2.d(f4182c, gVar.c());
    }
}
