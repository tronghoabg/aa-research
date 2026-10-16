package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class an implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19375a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19376b;

    public /* synthetic */ an(Object obj, int i2) {
        this.f19376b = i2;
        this.f19375a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f19376b;
        if (i2 == 0) {
            return ax.o((ax) this.f19375a);
        }
        if (i2 == 1) {
            this.f19375a.a(com.waze.sharedrive.e.bg.f38424b);
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            this.f19375a.a(com.waze.sharedrive.e.bg.f38425c);
            return h.ab.f48028a;
        }
        ?? r2 = this.f19375a;
        if (i2 != 3) {
            r2.a(com.waze.sharedrive.e.bg.f38425c);
            return h.ab.f48028a;
        }
        r2.a(com.waze.sharedrive.e.bg.f38423a);
        return h.ab.f48028a;
    }
}
