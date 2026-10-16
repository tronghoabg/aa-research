package com.waze.car_lib.i.b;

import com.waze.car_lib.f.gh;
import com.waze.map.opengl.WazeMapRenderer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends gh {

    /* renamed from: a, reason: collision with root package name */
    private final WazeMapRenderer f20024a;

    public q(WazeMapRenderer wazeMapRenderer) {
        h.g.b.x.f(wazeMapRenderer, "renderer");
        this.f20024a = wazeMapRenderer;
    }

    public final WazeMapRenderer a() {
        return this.f20024a;
    }
}
