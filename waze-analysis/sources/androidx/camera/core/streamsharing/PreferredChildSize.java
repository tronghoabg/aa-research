package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.util.Size;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreferredChildSize {
    private final Size childSizeToScale;
    private final Rect cropRectBeforeScaling;
    private final Size originalSelectedChildSize;

    public PreferredChildSize(Rect rect, Size size, Size size2) {
        x.f(rect, "cropRectBeforeScaling");
        x.f(size, "childSizeToScale");
        x.f(size2, "originalSelectedChildSize");
        this.cropRectBeforeScaling = rect;
        this.childSizeToScale = size;
        this.originalSelectedChildSize = size2;
    }

    public static /* synthetic */ PreferredChildSize copy$default(PreferredChildSize preferredChildSize, Rect rect, Size size, Size size2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            rect = preferredChildSize.cropRectBeforeScaling;
        }
        if ((i2 & 2) != 0) {
            size = preferredChildSize.childSizeToScale;
        }
        if ((i2 & 4) != 0) {
            size2 = preferredChildSize.originalSelectedChildSize;
        }
        return preferredChildSize.copy(rect, size, size2);
    }

    public final Rect component1() {
        return this.cropRectBeforeScaling;
    }

    public final Size component2() {
        return this.childSizeToScale;
    }

    public final Size component3() {
        return this.originalSelectedChildSize;
    }

    public final PreferredChildSize copy(Rect rect, Size size, Size size2) {
        x.f(rect, "cropRectBeforeScaling");
        x.f(size, "childSizeToScale");
        x.f(size2, "originalSelectedChildSize");
        return new PreferredChildSize(rect, size, size2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferredChildSize)) {
            return false;
        }
        PreferredChildSize preferredChildSize = (PreferredChildSize) obj;
        return x.n(this.cropRectBeforeScaling, preferredChildSize.cropRectBeforeScaling) && x.n(this.childSizeToScale, preferredChildSize.childSizeToScale) && x.n(this.originalSelectedChildSize, preferredChildSize.originalSelectedChildSize);
    }

    public final Size getChildSizeToScale() {
        return this.childSizeToScale;
    }

    public final Rect getCropRectBeforeScaling() {
        return this.cropRectBeforeScaling;
    }

    public final Size getOriginalSelectedChildSize() {
        return this.originalSelectedChildSize;
    }

    public int hashCode() {
        return (((this.cropRectBeforeScaling.hashCode() * 31) + this.childSizeToScale.hashCode()) * 31) + this.originalSelectedChildSize.hashCode();
    }

    public String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.cropRectBeforeScaling + ", childSizeToScale=" + this.childSizeToScale + ", originalSelectedChildSize=" + this.originalSelectedChildSize + ")";
    }
}
