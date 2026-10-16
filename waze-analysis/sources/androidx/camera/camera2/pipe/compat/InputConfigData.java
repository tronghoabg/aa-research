package androidx.camera.camera2.pipe.compat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InputConfigData {
    private final int format;
    private final int height;
    private final int width;

    public InputConfigData(int i2, int i3, int i4) {
        this.width = i2;
        this.height = i3;
        this.format = i4;
    }

    public static /* synthetic */ InputConfigData copy$default(InputConfigData inputConfigData, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = inputConfigData.width;
        }
        if ((i5 & 2) != 0) {
            i3 = inputConfigData.height;
        }
        if ((i5 & 4) != 0) {
            i4 = inputConfigData.format;
        }
        return inputConfigData.copy(i2, i3, i4);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final int component3() {
        return this.format;
    }

    public final InputConfigData copy(int i2, int i3, int i4) {
        return new InputConfigData(i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputConfigData)) {
            return false;
        }
        InputConfigData inputConfigData = (InputConfigData) obj;
        return this.width == inputConfigData.width && this.height == inputConfigData.height && this.format == inputConfigData.format;
    }

    public final int getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.width * 31) + this.height) * 31) + this.format;
    }

    public String toString() {
        return "InputConfigData(width=" + this.width + ", height=" + this.height + ", format=" + this.format + ")";
    }
}
