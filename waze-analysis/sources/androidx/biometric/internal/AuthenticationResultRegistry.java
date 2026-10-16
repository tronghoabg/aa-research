package androidx.biometric.internal;

import android.content.Context;
import androidx.biometric.AuthenticationRequest;
import androidx.biometric.AuthenticationResultCallback;
import androidx.biometric.AuthenticationResultLauncher;
import androidx.biometric.BiometricPrompt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import h.ab;
import h.g.a.a;
import h.g.b.aq;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationResultRegistry {
    public static /* synthetic */ AuthenticationResultLauncher register$default(AuthenticationResultRegistry authenticationResultRegistry, Context context, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, Runnable runnable, AuthenticationResultCallback authenticationResultCallback, Executor executor, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            executor = null;
        }
        return authenticationResultRegistry.register(context, lifecycleOwner, viewModelStoreOwner, runnable, authenticationResultCallback, executor);
    }

    static final ab register$lambda$0(aq aqVar, Context context, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, Runnable runnable, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        if (aqVar.f48105a == null) {
            aqVar.f48105a = new BiometricPrompt(context, lifecycleOwner, viewModelStoreOwner, runnable, executor, authenticationCallback);
        }
        return ab.f48028a;
    }

    static final void register$lambda$1(a aVar, BiometricPrompt.LifecycleContainer lifecycleContainer, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        x.f(lifecycleOwner, "<unused var>");
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_START) {
            aVar.invoke();
            lifecycleContainer.clearObservers();
        }
    }

    public final AuthenticationResultLauncher register(final Context context, final LifecycleOwner lifecycleOwner, final ViewModelStoreOwner viewModelStoreOwner, final Runnable runnable, AuthenticationResultCallback authenticationResultCallback, final Executor executor) {
        x.f(context, "context");
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(viewModelStoreOwner, "viewModelStoreOwner");
        x.f(runnable, "confirmCredentialActivityLauncher");
        x.f(authenticationResultCallback, "resultCallback");
        final BiometricPrompt.AuthenticationCallback authenticationCallbackCreateAuthenticationCallback = AuthenticationResultRegistryKt.createAuthenticationCallback(authenticationResultCallback);
        final aq aqVar = new aq();
        final BiometricPrompt.LifecycleContainer lifecycleContainer = new BiometricPrompt.LifecycleContainer(lifecycleOwner.getLifecycle());
        final a aVar = new a() { // from class: androidx.biometric.internal.AuthenticationResultRegistry$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationResultRegistry.register$lambda$0(aqVar, context, lifecycleOwner, viewModelStoreOwner, runnable, executor, authenticationCallbackCreateAuthenticationCallback);
            }
        };
        lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.biometric.internal.AuthenticationResultRegistry$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                AuthenticationResultRegistry.register$lambda$1(aVar, lifecycleContainer, lifecycleOwner2, event);
            }
        });
        return new AuthenticationResultLauncher() { // from class: androidx.biometric.internal.AuthenticationResultRegistry.register.1
            @Override // androidx.biometric.AuthenticationResultLauncher
            public void cancel() {
                BiometricPrompt biometricPrompt = (BiometricPrompt) aqVar.f48105a;
                if (biometricPrompt != null) {
                    biometricPrompt.cancelAuthentication();
                }
            }

            @Override // androidx.biometric.AuthenticationResultLauncher
            public void launch(AuthenticationRequest authenticationRequest) {
                x.f(authenticationRequest, "input");
                BiometricPrompt biometricPrompt = (BiometricPrompt) aqVar.f48105a;
                if (biometricPrompt != null) {
                    AuthenticationResultRegistryKt.onLaunch(biometricPrompt, context, authenticationRequest);
                }
            }
        };
    }
}
