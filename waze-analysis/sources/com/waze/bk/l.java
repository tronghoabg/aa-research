package com.waze.bk;

import android.util.Size;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Size f16867a;

    public l(Size size) {
        x.f(size, "surfaceSize");
        this.f16867a = size;
    }

    public final Size a() {
        return this.f16867a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && x.n(this.f16867a, ((l) obj).f16867a);
    }

    public final int hashCode() {
        return this.f16867a.hashCode();
    }

    public final String toString() {
        return "FrameRenderedInfo(surfaceSize=" + this.f16867a + ")";
    }
}
