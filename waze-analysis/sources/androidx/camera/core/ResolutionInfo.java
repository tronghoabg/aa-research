package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ResolutionInfo {
    private final ResolutionInfoInternal mResolutionInfoInternal;

    /* compiled from: WazeSource */
    abstract class ResolutionInfoInternal {

        /* compiled from: WazeSource */
        abstract class Builder {
            Builder() {
            }

            abstract ResolutionInfoInternal build();

            abstract Builder setCropRect(Rect rect);

            abstract Builder setResolution(Size size);

            abstract Builder setRotationDegrees(int i2);
        }

        ResolutionInfoInternal() {
        }

        abstract Rect getCropRect();

        abstract Size getResolution();

        abstract int getRotationDegrees();
    }

    public ResolutionInfo(Size size, Rect rect, int i2) {
        AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder builder = new AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder();
        builder.setResolution(size);
        builder.setCropRect(rect);
        builder.setRotationDegrees(i2);
        this.mResolutionInfoInternal = builder.build();
    }

    public boolean equals(Object obj) {
        return this.mResolutionInfoInternal.equals(obj);
    }

    public Rect getCropRect() {
        return this.mResolutionInfoInternal.getCropRect();
    }

    public Size getResolution() {
        return this.mResolutionInfoInternal.getResolution();
    }

    public int getRotationDegrees() {
        return this.mResolutionInfoInternal.getRotationDegrees();
    }

    public int hashCode() {
        return this.mResolutionInfoInternal.hashCode();
    }

    public String toString() {
        return this.mResolutionInfoInternal.toString();
    }
}
