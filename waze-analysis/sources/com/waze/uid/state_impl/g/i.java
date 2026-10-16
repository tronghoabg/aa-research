package com.waze.uid.state_impl.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class i implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.waze.uid.e.f f44681a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44682b;

    public /* synthetic */ i(com.waze.uid.e.f fVar, int i2) {
        this.f44682b = i2;
        this.f44681a = fVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f44682b;
        if (i2 == 0) {
            return m.b((m) this.f44681a);
        }
        if (i2 == 1) {
            return m.a((m) this.f44681a);
        }
        com.waze.uid.e.f fVar = this.f44681a;
        return i2 != 2 ? p.b((p) fVar) : p.a((p) fVar);
    }
}
