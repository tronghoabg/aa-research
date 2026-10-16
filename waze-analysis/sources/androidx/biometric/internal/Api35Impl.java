package androidx.biometric.internal;

import android.graphics.Bitmap;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.PromptContentView;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Api35Impl {
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public final void setContentView(BiometricPrompt.Builder builder, PromptContentView promptContentView) {
        x.f(builder, "builder");
        x.f(promptContentView, "contentView");
        builder.setContentView(promptContentView);
    }

    public final void setLogoBitmap(BiometricPrompt.Builder builder, Bitmap bitmap) {
        x.f(builder, "builder");
        x.f(bitmap, "logoBitmap");
        builder.setLogoBitmap(bitmap);
    }

    public final void setLogoDescription(BiometricPrompt.Builder builder, String str) {
        x.f(builder, "builder");
        x.c(str);
        builder.setLogoDescription(str);
    }

    public final void setLogoRes(BiometricPrompt.Builder builder, int i2) {
        x.f(builder, "builder");
        builder.setLogoRes(i2);
    }
}
