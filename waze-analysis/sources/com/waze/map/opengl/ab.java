package com.waze.map.opengl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ab implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WazeRenderer f29524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29525b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29526c;

    public /* synthetic */ ab(WazeRenderer wazeRenderer, Object obj, int i2) {
        this.f29526c = i2;
        this.f29524a = wazeRenderer;
        this.f29525b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlinx.coroutines.h.a] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlinx.coroutines.h.a] */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f29526c;
        if (i2 == 0) {
            WazeRenderer.j(this.f29524a, (String) this.f29525b);
            return;
        }
        if (i2 == 1) {
            WazeRenderer.n(this.f29524a, this.f29525b);
        } else {
            if (i2 == 2) {
                WazeRenderer.q(this.f29524a, this.f29525b);
                return;
            }
            Object obj = this.f29525b;
            if (i2 != 3) {
                WazeRenderer.k(this.f29524a, (String) obj);
            } else {
                WazeRenderer.e(this.f29524a, (String) obj);
            }
        }
    }
}
