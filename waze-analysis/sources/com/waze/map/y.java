package com.waze.map;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class y {
    public static final int $stable = 0;

    static final void onRouteColorsChangedJNI$lambda$0(y yVar, int i2, int i3) {
        h.g.b.x.d(yVar, "null cannot be cast to non-null type com.waze.map.MapColorNativeManager");
        ((MapColorNativeManager) yVar).onRouteColorsChanged(i2, i3);
    }

    public abstract void onRouteColorsChanged(int i2, int i3);

    protected final void onRouteColorsChangedJNI(final int i2, final int i3) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.map.x
            @Override // java.lang.Runnable
            public final void run() {
                y.onRouteColorsChangedJNI$lambda$0(this.f29602a, i2, i3);
            }
        });
    }
}
