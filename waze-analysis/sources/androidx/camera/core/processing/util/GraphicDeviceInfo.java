package androidx.camera.core.processing.util;

import androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class GraphicDeviceInfo {

    /* compiled from: WazeSource */
    public abstract class Builder {
        public abstract GraphicDeviceInfo build();

        public abstract Builder setEglExtensions(String str);

        public abstract Builder setEglVersion(String str);

        public abstract Builder setGlExtensions(String str);

        public abstract Builder setGlVersion(String str);
    }

    GraphicDeviceInfo() {
    }

    public static Builder builder() {
        AutoValue_GraphicDeviceInfo.Builder builder = new AutoValue_GraphicDeviceInfo.Builder();
        builder.setGlVersion(GLUtils.VERSION_UNKNOWN);
        builder.setEglVersion(GLUtils.VERSION_UNKNOWN);
        builder.setGlExtensions("");
        builder.setEglExtensions("");
        return builder;
    }

    public abstract String getEglExtensions();

    public abstract String getEglVersion();

    public abstract String getGlExtensions();

    public abstract String getGlVersion();
}
