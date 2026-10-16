package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f28521b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28522c = i2;
        this.f28521b = mainCanvasDelegatorImpl;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f28522c;
        return i2 != 0 ? i2 != 1 ? new aj(this.f28521b, eVar, 2, (char[]) null) : new aj(this.f28521b, eVar, 1, (byte[]) null) : new aj(this.f28521b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f28522c;
        return i2 != 0 ? i2 != 1 ? ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f28522c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f28520a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                MainCanvasDelegatorImpl mainCanvasDelegatorImpl = this.f28521b;
                this.f28520a = 1;
                if (kotlinx.coroutines.b.ai.e(new ai(mainCanvasDelegatorImpl.f28481b, 0), new af(mainCanvasDelegatorImpl, null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f28520a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                MainCanvasDelegatorImpl mainCanvasDelegatorImpl2 = this.f28521b;
                this.f28520a = 1;
                if (mainCanvasDelegatorImpl2.f28482c.collect(new ak(mainCanvasDelegatorImpl2, 0), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f28520a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            MainCanvasDelegatorImpl mainCanvasDelegatorImpl3 = this.f28521b;
            this.f28520a = 1;
            if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.D(kotlinx.coroutines.b.ai.q(new ai(mainCanvasDelegatorImpl3.f28481b, 1), mainCanvasDelegatorImpl3.f28487h.getMainCanvasStateMapping(), new z(null)))), new aa(mainCanvasDelegatorImpl3, null), this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f28522c = i2;
        this.f28521b = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f28522c = i2;
        this.f28521b = mainCanvasDelegatorImpl;
    }
}
