package androidx.camera.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class LowLightBoostState {
    public static final int ACTIVE = 1;
    public static final int INACTIVE = 0;
    public static final int OFF = -1;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    private LowLightBoostState() {
    }
}
