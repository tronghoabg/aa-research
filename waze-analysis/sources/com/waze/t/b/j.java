package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40774b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40775c;

    public /* synthetic */ j(Object obj, Object obj2, int i2) {
        this.f40775c = i2;
        this.f40773a = obj;
        this.f40774b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f40775c;
        if (i2 == 0) {
            return ag.o((ag) this.f40773a, (String) this.f40774b);
        }
        if (i2 == 1) {
            return ag.n((ag) this.f40773a, (String) this.f40774b);
        }
        ?? r1 = this.f40774b;
        return i2 != 2 ? o.b((o) this.f40773a, r1) : ag.p((ag) this.f40773a, (String) r1);
    }
}
