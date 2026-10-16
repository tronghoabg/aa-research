package org.a.b.c.b;

import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f56363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f56364b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f56365c;

    public /* synthetic */ a(b bVar, c cVar, int i2) {
        this.f56365c = i2;
        this.f56363a = bVar;
        this.f56364b = cVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f56365c;
        c cVar = this.f56364b;
        b bVar = this.f56363a;
        return i2 != 0 ? b.b(bVar, cVar) : b.d(bVar, cVar);
    }
}
