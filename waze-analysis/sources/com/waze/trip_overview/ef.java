package com.waze.trip_overview;

import com.waze.jni.protos.map.DisplayRects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ef extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayRects f41429a;

    public ef(DisplayRects displayRects) {
        super(null);
        this.f41429a = displayRects;
    }

    public final DisplayRects a() {
        return this.f41429a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef) && h.g.b.x.n(this.f41429a, ((ef) obj).f41429a);
    }

    public final int hashCode() {
        DisplayRects displayRects = this.f41429a;
        if (displayRects == null) {
            return 0;
        }
        return displayRects.hashCode();
    }

    public final String toString() {
        return "MapDataShown(displayRects=" + this.f41429a + ")";
    }
}
