package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowMetrics {
    private final Bounds _bounds;
    private final float density;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect rect, float f2) {
        this(new Bounds(rect), f2);
        x.f(rect, "bounds");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        return x.n(this._bounds, windowMetrics._bounds) && this.density == windowMetrics.density;
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public final float getDensity() {
        return this.density;
    }

    public final float getHeightDp() {
        return getBounds().height() / this.density;
    }

    public final float getWidthDp() {
        return getBounds().width() / this.density;
    }

    public int hashCode() {
        return (this._bounds.hashCode() * 31) + Float.floatToIntBits(this.density);
    }

    public String toString() {
        return "WindowMetrics(_bounds=" + this._bounds + ", density=" + this.density + ")";
    }

    public WindowMetrics(Bounds bounds, float f2) {
        x.f(bounds, "_bounds");
        this._bounds = bounds;
        this.density = f2;
    }
}
