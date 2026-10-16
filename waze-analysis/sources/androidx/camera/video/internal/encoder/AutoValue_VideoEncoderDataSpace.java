package androidx.camera.video.internal.encoder;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AutoValue_VideoEncoderDataSpace extends VideoEncoderDataSpace {
    private final int range;
    private final int standard;
    private final int transfer;

    AutoValue_VideoEncoderDataSpace(int i2, int i3, int i4) {
        this.standard = i2;
        this.transfer = i3;
        this.range = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoEncoderDataSpace) {
            VideoEncoderDataSpace videoEncoderDataSpace = (VideoEncoderDataSpace) obj;
            if (this.standard == videoEncoderDataSpace.getStandard() && this.transfer == videoEncoderDataSpace.getTransfer() && this.range == videoEncoderDataSpace.getRange()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getRange() {
        return this.range;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getStandard() {
        return this.standard;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getTransfer() {
        return this.transfer;
    }

    public int hashCode() {
        return this.range ^ ((((this.standard ^ 1000003) * 1000003) ^ this.transfer) * 1000003);
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.standard + ", transfer=" + this.transfer + ", range=" + this.range + "}";
    }
}
