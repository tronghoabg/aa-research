package androidx.window.core;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class BuildConfig {
    public static final BuildConfig INSTANCE = new BuildConfig();
    private static final VerificationMode verificationMode = VerificationMode.QUIET;

    private BuildConfig() {
    }

    public final VerificationMode getVerificationMode() {
        return verificationMode;
    }
}
