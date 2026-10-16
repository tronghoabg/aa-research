package com.waze.map.b;

import com.waze.jni.protos.map.DisplayRects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayRects f28164a;

    public cs(DisplayRects displayRects) {
        h.g.b.x.f(displayRects, "displayRects");
        this.f28164a = displayRects;
    }

    public final DisplayRects a() {
        return this.f28164a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs) && h.g.b.x.n(this.f28164a, ((cs) obj).f28164a);
    }

    public final int hashCode() {
        return this.f28164a.hashCode();
    }

    public final String toString() {
        return "MapDataShowing(displayRects=" + this.f28164a + ")";
    }
}
