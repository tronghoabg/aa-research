package androidx.biometric.internal;

import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Api36MinorImpl {
    public static final Api36MinorImpl INSTANCE = new Api36MinorImpl();

    private Api36MinorImpl() {
    }

    public final void addFallbackOption(BiometricPrompt.Builder builder, CharSequence charSequence, int i2, Executor executor, DialogInterface.OnClickListener onClickListener) {
        x.f(builder, "builder");
        x.f(charSequence, "text");
        x.f(executor, "executor");
        x.f(onClickListener, "listener");
        builder.addFallbackOption(charSequence, i2, executor, onClickListener);
    }
}
