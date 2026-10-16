package androidx.biometric.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.CancellationSignal;
import com.waze.gas.GasNativeManager;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    public final void authenticate(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        x.f(biometricPrompt, "biometricPrompt");
        x.f(cryptoObject, "crypto");
        x.f(cancellationSignal, "cancellationSignal");
        x.f(executor, "executor");
        x.f(biometricPrompt$AuthenticationCallback, "callback");
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    public final BiometricPrompt buildPrompt(BiometricPrompt.Builder builder) {
        x.f(builder, "builder");
        BiometricPrompt biometricPromptBuild = builder.build();
        x.e(biometricPromptBuild, "build(...)");
        return biometricPromptBuild;
    }

    public final BiometricPrompt.Builder createPromptBuilder(Context context) {
        x.f(context, "context");
        return new BiometricPrompt.Builder(context);
    }

    public final void setDescription(BiometricPrompt.Builder builder, CharSequence charSequence) {
        x.f(builder, "builder");
        x.f(charSequence, "description");
        builder.setDescription(charSequence);
    }

    public final void setNegativeButton(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        x.f(builder, "builder");
        x.f(charSequence, "text");
        x.f(executor, "executor");
        x.f(onClickListener, "listener");
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    public final void setSubtitle(BiometricPrompt.Builder builder, CharSequence charSequence) {
        x.f(builder, "builder");
        x.f(charSequence, "subtitle");
        builder.setSubtitle(charSequence);
    }

    public final void setTitle(BiometricPrompt.Builder builder, CharSequence charSequence) {
        x.f(builder, "builder");
        x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        builder.setTitle(charSequence);
    }

    public final void authenticate(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        x.f(biometricPrompt, "biometricPrompt");
        x.f(cancellationSignal, "cancellationSignal");
        x.f(executor, "executor");
        x.f(biometricPrompt$AuthenticationCallback, "callback");
        biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }
}
