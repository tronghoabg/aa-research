package com.waze.car_lib.i.a;

import android.util.DisplayMetrics;
import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f19932a;

    public z(NativeManager nativeManager) {
        h.g.b.x.f(nativeManager, "nativeManager");
        this.f19932a = nativeManager;
    }

    static final void a(z zVar, DisplayMetrics displayMetrics, h.g.a.a aVar) {
        zVar.f19932a.ResetDisplay(displayMetrics.densityDpi, new com.google.android.material.internal.o(aVar, 13));
    }
}
