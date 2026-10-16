package androidx.camera.core.imagecapture;

import android.util.Size;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class PostviewSettings {
    public static PostviewSettings create(Size size, int i2) {
        return new AutoValue_PostviewSettings(size, i2);
    }

    public abstract int getInputFormat();

    public abstract Size getResolution();
}
