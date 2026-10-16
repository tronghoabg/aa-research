package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class bd extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f28582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(Object obj, int i2) {
        super(1, obj, bq.class, "getCanvasViewBounds", "getCanvasViewBounds(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f28582a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f28582a == 0) {
            return ((bq) this.receiver).b((h.c.e) obj);
        }
        String str = (String) obj;
        h.g.b.x.f(str, "p0");
        ((ClosureCanvasDelegatorImpl) this.receiver).nativeClearClosureObject(str);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(Object obj, int i2, byte[] bArr) {
        super(1, obj, ClosureCanvasDelegatorImpl.class, "nativeClearClosureObject", "nativeClearClosureObject(Ljava/lang/String;)V", 0);
        this.f28582a = i2;
    }
}
