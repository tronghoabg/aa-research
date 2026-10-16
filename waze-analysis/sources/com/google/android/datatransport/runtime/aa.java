package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa implements com.google.android.datatransport.g {

    /* renamed from: a, reason: collision with root package name */
    private final x f4131a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4132b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.a f4133c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.f f4134d;

    /* renamed from: e, reason: collision with root package name */
    private final ab f4135e;

    aa(x xVar, String str, com.google.android.datatransport.a aVar, com.google.android.datatransport.f fVar, ab abVar) {
        this.f4131a = xVar;
        this.f4132b = str;
        this.f4133c = aVar;
        this.f4134d = fVar;
        this.f4135e = abVar;
    }

    @Override // com.google.android.datatransport.g
    public final void a(com.google.android.datatransport.b bVar, com.google.android.datatransport.i iVar) {
        u uVar = new u();
        uVar.e(this.f4131a);
        uVar.c(bVar);
        uVar.f(this.f4132b);
        uVar.d(this.f4134d);
        uVar.b(this.f4133c);
        this.f4135e.a(uVar.a(), iVar);
    }

    @Override // com.google.android.datatransport.g
    public final void b(com.google.android.datatransport.b bVar) {
        a(bVar, new z());
    }

    final x c() {
        return this.f4131a;
    }
}
