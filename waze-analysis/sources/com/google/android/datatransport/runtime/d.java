package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final d f4184a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f4185b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f4186c;

    static {
        com.google.firebase.d.d dVarA = com.google.firebase.d.e.a("logSource");
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b();
        bVar.b(1);
        dVarA.b(bVar.a());
        f4185b = dVarA.a();
        com.google.firebase.d.d dVarA2 = com.google.firebase.d.e.a("logEventDropped");
        com.google.firebase.d.c.b bVar2 = new com.google.firebase.d.c.b();
        bVar2.b(2);
        dVarA2.b(bVar2.a());
        f4186c = dVarA2.a();
    }

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.a.a.i iVar = (com.google.android.datatransport.runtime.a.a.i) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f4185b, iVar.b());
        gVar.d(f4186c, iVar.c());
    }
}
