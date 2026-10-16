package com.waze.map.canvas;

import com.waze.jni.protos.map.canvas.MainCanvasStateChanged;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28575b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28576c;

    public /* synthetic */ b(p pVar, MainCanvasStateChanged mainCanvasStateChanged, int i2) {
        this.f28576c = i2;
        this.f28575b = pVar;
        this.f28574a = mainCanvasStateChanged;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28576c;
        if (i2 == 0) {
            c.onCanvasRemovedJNI$lambda$0((c) this.f28574a, (String) this.f28575b);
            return;
        }
        if (i2 == 1) {
            c.onCanvasCreatedJNI$lambda$0((c) this.f28574a, (String) this.f28575b);
            return;
        }
        if (i2 == 2) {
            p.onMainCanvasFallthroughClickEventJNI$lambda$0((p) this.f28574a, (String) this.f28575b);
            return;
        }
        if (i2 == 3) {
            p.onCanvasRemovedJNI$lambda$0((p) this.f28574a, (String) this.f28575b);
        } else {
            if (i2 == 4) {
                p.onMainCanvasStateChangedJNI$lambda$0((p) this.f28575b, (MainCanvasStateChanged) this.f28574a);
                return;
            }
            Object obj = this.f28575b;
            if (i2 != 5) {
                bb.onMainCanvasSwappedJNI$lambda$0((bb) this.f28574a, (String) obj);
            } else {
                bb.onMainCanvasRestoredJNI$lambda$0((bb) this.f28574a, (String) obj);
            }
        }
    }

    public /* synthetic */ b(Object obj, String str, int i2) {
        this.f28576c = i2;
        this.f28574a = obj;
        this.f28575b = str;
    }
}
