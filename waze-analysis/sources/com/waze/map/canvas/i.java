package com.waze.map.canvas;

import com.waze.jni.protos.map.MapOrientationModeChanged;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28641c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f28642d;

    public /* synthetic */ i(CanvasDelegatorImpl canvasDelegatorImpl, String str, h.g.a.l lVar, int i2) {
        this.f28642d = i2;
        this.f28639a = canvasDelegatorImpl;
        this.f28640b = str;
        this.f28641c = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.l, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28642d;
        if (i2 == 0) {
            CanvasDelegatorImpl.r((CanvasDelegatorImpl) this.f28639a, (String) this.f28640b, this.f28641c);
        } else if (i2 != 1) {
            Object obj = this.f28639a;
            p.onMainCanvasOrientationModeChangedJNI$lambda$0((p) this.f28640b, (String) this.f28641c, (MapOrientationModeChanged) obj);
        } else {
            CanvasDelegatorImpl.p((CanvasDelegatorImpl) this.f28639a, (String) this.f28640b, this.f28641c);
        }
    }

    public /* synthetic */ i(p pVar, String str, MapOrientationModeChanged mapOrientationModeChanged, int i2) {
        this.f28642d = i2;
        this.f28640b = pVar;
        this.f28641c = str;
        this.f28639a = mapOrientationModeChanged;
    }
}
