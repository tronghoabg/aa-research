package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import com.waze.strings.DisplayStrings;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AutoValue_OutConfig extends OutConfig {
    private final Rect getCropRect;
    private final int getFormat;
    private final int getRotationDegrees;
    private final Size getSize;
    private final int getTargets;
    private final UUID getUuid;
    private final boolean isMirroring;
    private final boolean shouldRespectInputCropRect;

    AutoValue_OutConfig(UUID uuid, int i2, int i3, Rect rect, Size size, int i4, boolean z, boolean z2) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.getUuid = uuid;
        this.getTargets = i2;
        this.getFormat = i3;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.getCropRect = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.getSize = size;
        this.getRotationDegrees = i4;
        this.isMirroring = z;
        this.shouldRespectInputCropRect = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutConfig) {
            OutConfig outConfig = (OutConfig) obj;
            if (this.getUuid.equals(outConfig.getUuid()) && this.getTargets == outConfig.getTargets() && this.getFormat == outConfig.getFormat() && this.getCropRect.equals(outConfig.getCropRect()) && this.getSize.equals(outConfig.getSize()) && this.getRotationDegrees == outConfig.getRotationDegrees() && this.isMirroring == outConfig.isMirroring() && this.shouldRespectInputCropRect == outConfig.shouldRespectInputCropRect()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public Rect getCropRect() {
        return this.getCropRect;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getFormat() {
        return this.getFormat;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getRotationDegrees() {
        return this.getRotationDegrees;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public Size getSize() {
        return this.getSize;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getTargets() {
        return this.getTargets;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    UUID getUuid() {
        return this.getUuid;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.getUuid.hashCode() ^ 1000003) * 1000003) ^ this.getTargets) * 1000003) ^ this.getFormat) * 1000003) ^ this.getCropRect.hashCode()) * 1000003) ^ this.getSize.hashCode();
        boolean z = this.isMirroring;
        int i2 = DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER;
        int i3 = ((((iHashCode * 1000003) ^ this.getRotationDegrees) * 1000003) ^ (true != z ? 1237 : 1231)) * 1000003;
        if (true == this.shouldRespectInputCropRect) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public boolean isMirroring() {
        return this.isMirroring;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public boolean shouldRespectInputCropRect() {
        return this.shouldRespectInputCropRect;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.getUuid + ", getTargets=" + this.getTargets + ", getFormat=" + this.getFormat + ", getCropRect=" + this.getCropRect + ", getSize=" + this.getSize + ", getRotationDegrees=" + this.getRotationDegrees + ", isMirroring=" + this.isMirroring + ", shouldRespectInputCropRect=" + this.shouldRespectInputCropRect + "}";
    }
}
