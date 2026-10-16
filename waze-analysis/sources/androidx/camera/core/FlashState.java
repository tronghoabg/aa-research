package androidx.camera.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FlashState {
    public static final int FIRED = 1;
    public static final FlashState INSTANCE = new FlashState();
    public static final int NOT_FIRED = 3;
    public static final int UNAVAILABLE = 2;
    public static final int UNKNOWN = 0;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.FlashState$FlashState, reason: collision with other inner class name */
    public @interface InterfaceC0014FlashState {
    }

    private FlashState() {
    }
}
