package com.waze.ui.r.a.a;

import androidx.compose.ui.graphics.painter.Painter;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Painter f43269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Painter painter) {
        super(null);
        x.f(painter, "painter");
        this.f43269a = painter;
    }

    public final Painter a() {
        return this.f43269a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f43269a, ((d) obj).f43269a);
    }

    public final int hashCode() {
        return this.f43269a.hashCode();
    }

    public final String toString() {
        return "Complete(painter=" + this.f43269a + ")";
    }
}
