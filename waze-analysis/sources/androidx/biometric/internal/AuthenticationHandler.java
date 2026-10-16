package androidx.biometric.internal;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.data.CanceledFrom;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.lifecycle.LifecycleOwner;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AuthenticationHandler {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.AuthenticationHandler$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static AuthenticationHandler create(Context context, LifecycleOwner lifecycleOwner, AuthenticationViewModel authenticationViewModel, Runnable runnable, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            return AuthenticationHandler.Companion.create(context, lifecycleOwner, authenticationViewModel, runnable, executor, authenticationCallback);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AuthenticationHandler create(Context context, LifecycleOwner lifecycleOwner, AuthenticationViewModel authenticationViewModel, Runnable runnable, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            x.f(context, "context");
            x.f(lifecycleOwner, "lifecycleOwner");
            x.f(authenticationViewModel, "viewModel");
            x.f(runnable, "confirmCredentialActivityLauncher");
            if (executor == null) {
                executor = new PromptExecutor();
            }
            Executor executor2 = executor;
            if (authenticationCallback == null) {
                authenticationCallback = new DefaultClientAuthenticationCallback();
            }
            return new DefaultAuthenticationHandler(context, lifecycleOwner, authenticationViewModel, runnable, executor2, authenticationCallback);
        }
    }

    void authenticate(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject);

    void cancelAuthentication(CanceledFrom canceledFrom);
}
