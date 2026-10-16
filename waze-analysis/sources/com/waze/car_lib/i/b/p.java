package com.waze.car_lib.i.b;

import com.waze.car_lib.f.gh;
import com.waze.map.opengl.WazeRenderer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends gh {

    /* renamed from: a, reason: collision with root package name */
    private final WazeRenderer f20023a;

    public p(WazeRenderer wazeRenderer) {
        h.g.b.x.f(wazeRenderer, "renderer");
        this.f20023a = wazeRenderer;
    }

    public final WazeRenderer a() {
        return this.f20023a;
    }
}
