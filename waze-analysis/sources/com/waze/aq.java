package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15447a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15448b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15449c;

    public aq(ao aoVar, NativeManager nativeManager) {
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(nativeManager, "nativeManager");
        this.f15447a = aoVar;
        this.f15448b = nativeManager;
        this.f15449c = kotlinx.coroutines.aj.e(kotlinx.coroutines.av.c().plus(kotlinx.coroutines.aj.Q()));
    }

    public static final /* synthetic */ NativeManager a(aq aqVar) {
        return (NativeManager) aqVar.f15448b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.ao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlinx.coroutines.af] */
    public final void b() {
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new dn(this.f15447a.a(), 1)), new ej(this, (h.c.e) null, 1)), this.f15449c);
    }

    public final com.airbnb.lottie.d.e c() {
        return (com.airbnb.lottie.d.e) this.f15447a;
    }

    public final Object d() {
        return this.f15448b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l e() {
        return this.f15449c;
    }

    public aq(Object obj, com.airbnb.lottie.d.e eVar, Object obj2) {
        h.g.b.x.f(eVar, "keyPath");
        com.airbnb.lottie.b.q qVar = new com.airbnb.lottie.b.q(obj2, 2);
        h.g.b.x.f(eVar, "keyPath");
        h.g.b.x.f(qVar, "callback");
        this.f15448b = obj;
        this.f15447a = eVar;
        this.f15449c = qVar;
    }
}
