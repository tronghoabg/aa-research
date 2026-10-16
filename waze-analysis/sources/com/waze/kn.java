package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class kn implements df {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25059a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25060b;

    public /* synthetic */ kn(Object obj, int i2) {
        this.f25060b = i2;
        this.f25059a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.b.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.uid.d.b, java.lang.Object] */
    @Override // com.waze.df
    public final void a(MainActivity mainActivity) {
        if (this.f25060b == 0) {
            ix.z(this.f25059a);
            return;
        }
        com.waze.shared_infra.i.h.k("UidEventsController", "MainActivity resumed");
        this.f25059a.a(mainActivity);
    }
}
