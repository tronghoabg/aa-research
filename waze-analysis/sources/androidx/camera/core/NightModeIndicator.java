package androidx.camera.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NightModeIndicator {
    public static final int NOT_RECOMMENDED = 1;
    public static final int RECOMMENDED = 2;
    public static final int UNKNOWN = 0;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    private NightModeIndicator() {
    }
}
