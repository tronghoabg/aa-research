package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.media.ImageWrapper;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InputRequest {
    private final FrameInfo frameInfo;
    private final ImageWrapper image;

    public InputRequest(ImageWrapper imageWrapper, FrameInfo frameInfo) {
        x.f(imageWrapper, "image");
        x.f(frameInfo, "frameInfo");
        this.image = imageWrapper;
        this.frameInfo = frameInfo;
    }

    public static /* synthetic */ InputRequest copy$default(InputRequest inputRequest, ImageWrapper imageWrapper, FrameInfo frameInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            imageWrapper = inputRequest.image;
        }
        if ((i2 & 2) != 0) {
            frameInfo = inputRequest.frameInfo;
        }
        return inputRequest.copy(imageWrapper, frameInfo);
    }

    public final ImageWrapper component1() {
        return this.image;
    }

    public final FrameInfo component2() {
        return this.frameInfo;
    }

    public final InputRequest copy(ImageWrapper imageWrapper, FrameInfo frameInfo) {
        x.f(imageWrapper, "image");
        x.f(frameInfo, "frameInfo");
        return new InputRequest(imageWrapper, frameInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputRequest)) {
            return false;
        }
        InputRequest inputRequest = (InputRequest) obj;
        return x.n(this.image, inputRequest.image) && x.n(this.frameInfo, inputRequest.frameInfo);
    }

    public final FrameInfo getFrameInfo() {
        return this.frameInfo;
    }

    public final ImageWrapper getImage() {
        return this.image;
    }

    public int hashCode() {
        return (this.image.hashCode() * 31) + this.frameInfo.hashCode();
    }

    public String toString() {
        return "InputRequest(image=" + this.image + ", frameInfo=" + this.frameInfo + ")";
    }
}
