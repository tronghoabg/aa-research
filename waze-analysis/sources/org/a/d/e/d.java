package org.a.d.e;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final /* synthetic */ class d implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f56390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.waze.shared_infra.n.c f56391b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f56392c;

    public /* synthetic */ d(b bVar, com.waze.shared_infra.n.c cVar, int i2) {
        this.f56392c = i2;
        this.f56390a = bVar;
        this.f56391b = cVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f56392c;
        com.waze.shared_infra.n.c cVar = this.f56391b;
        return i2 != 0 ? c.f((c) this.f56390a, cVar) : e.d((e) this.f56390a, cVar);
    }
}
