package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final a f4093a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f4094b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f4095c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f4096d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f4097e;

    static {
        com.google.firebase.d.d dVarA = com.google.firebase.d.e.a("window");
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b();
        bVar.b(1);
        dVarA.b(bVar.a());
        f4094b = dVarA.a();
        com.google.firebase.d.d dVarA2 = com.google.firebase.d.e.a("logSourceMetrics");
        com.google.firebase.d.c.b bVar2 = new com.google.firebase.d.c.b();
        bVar2.b(2);
        dVarA2.b(bVar2.a());
        f4095c = dVarA2.a();
        com.google.firebase.d.d dVarA3 = com.google.firebase.d.e.a("globalMetrics");
        com.google.firebase.d.c.b bVar3 = new com.google.firebase.d.c.b();
        bVar3.b(3);
        dVarA3.b(bVar3.a());
        f4096d = dVarA3.a();
        com.google.firebase.d.d dVarA4 = com.google.firebase.d.e.a("appNamespace");
        com.google.firebase.d.c.b bVar4 = new com.google.firebase.d.c.b();
        bVar4.b(4);
        dVarA4.b(bVar4.a());
        f4097e = dVarA4.a();
    }

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.a.a.b bVar = (com.google.android.datatransport.runtime.a.a.b) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f4094b, bVar.c());
        gVar.d(f4095c, bVar.e());
        gVar.d(f4096d, bVar.b());
        gVar.d(f4097e, bVar.d());
    }
}
