package com.google.d.f.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final a f7830a;

    private b(com.google.d.f.b.c cVar, int i2, a aVar) {
        super(cVar, i2);
        this.f7830a = aVar;
        StringBuilder sb = new StringBuilder("%");
        cVar.k(sb);
        sb.append(true != cVar.i() ? 't' : 'T');
        sb.append(aVar.a());
    }

    public static c a(a aVar, com.google.d.f.b.c cVar, int i2) {
        return new b(cVar, i2, aVar);
    }

    @Override // com.google.d.f.d.c
    protected final void b(com.google.d.f.b.a aVar, Object obj) {
        aVar.d(obj, this.f7830a, d());
    }
}
