package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CanvasDelegatorImpl f28637a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28638b;

    public /* synthetic */ h(CanvasDelegatorImpl canvasDelegatorImpl, int i2) {
        this.f28638b = i2;
        this.f28637a = canvasDelegatorImpl;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f28638b) {
            case 0:
                return CanvasDelegatorImpl.c(this.f28637a, (String) obj);
            case 1:
                return CanvasDelegatorImpl.l(this.f28637a, (String) obj);
            case 2:
                return CanvasDelegatorImpl.e(this.f28637a, (String) obj);
            case 3:
                return CanvasDelegatorImpl.f(this.f28637a, (String) obj);
            case 4:
                return CanvasDelegatorImpl.d(this.f28637a, (String) obj);
            case 5:
                return CanvasDelegatorImpl.m(this.f28637a, (String) obj);
            case 6:
                return CanvasDelegatorImpl.b(this.f28637a, (String) obj);
            case 7:
                return MainCanvasDelegatorImpl.A((MainCanvasDelegatorImpl) this.f28637a, (String) obj);
            case 8:
                return MainCanvasDelegatorImpl.x((MainCanvasDelegatorImpl) this.f28637a, (String) obj);
            case 9:
                return MainCanvasDelegatorImpl.W((MainCanvasDelegatorImpl) this.f28637a);
            case 10:
                return MainCanvasDelegatorImpl.U((MainCanvasDelegatorImpl) this.f28637a);
            default:
                return MainCanvasDelegatorImpl.X((MainCanvasDelegatorImpl) this.f28637a);
        }
    }
}
