package androidx.biometric.internal;

import android.content.Context;
import android.content.Intent;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.data.CanceledFrom;
import androidx.biometric.internal.ui.FingerprintDialogActivity;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.biometric.utils.ErrorUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationHandlerFingerprintManager implements AuthenticationHandler {
    private final AuthenticationManager authenticationManager;
    private final AuthenticationHandlerFingerprintManager$resultDispatcher$1 resultDispatcher;
    private final AuthenticationHandlerFingerprintManager$uiStateObserver$1 uiStateObserver;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.biometric.internal.AuthenticationHandlerFingerprintManager$resultDispatcher$1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.biometric.internal.AuthenticationHandlerFingerprintManager$uiStateObserver$1] */
    public AuthenticationHandlerFingerprintManager(AuthenticationManager authenticationManager) {
        x.f(authenticationManager, "authenticationManager");
        this.authenticationManager = authenticationManager;
        final Context context = getContext();
        final AuthenticationViewModel viewModel = getViewModel();
        final Executor clientExecutor = authenticationManager.getClientExecutor();
        final BiometricPrompt.AuthenticationCallback clientAuthenticationCallback = authenticationManager.getClientAuthenticationCallback();
        final Runnable confirmCredentialActivityLauncher = getConfirmCredentialActivityLauncher();
        final a aVar = new a() { // from class: androidx.biometric.internal.AuthenticationHandlerFingerprintManager$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationHandlerFingerprintManager.resultDispatcher$lambda$0(this.f$0);
            }
        };
        ?? r1 = new AuthenticationResultDispatcher(context, viewModel, clientExecutor, clientAuthenticationCallback, confirmCredentialActivityLauncher, aVar) { // from class: androidx.biometric.internal.AuthenticationHandlerFingerprintManager$resultDispatcher$1
            @Override // androidx.biometric.internal.AuthenticationResultDispatcher
            public void onAuthenticationError(int i2, CharSequence charSequence) {
                this.this$0.onAuthenticationError(i2, charSequence);
            }

            @Override // androidx.biometric.internal.AuthenticationResultDispatcher
            public void showKMAsFallback() {
                this.this$0.showKMAsFallback();
            }
        };
        this.resultDispatcher = r1;
        ?? r9 = new AuthenticationUiStateObserver() { // from class: androidx.biometric.internal.AuthenticationHandlerFingerprintManager$uiStateObserver$1
            @Override // androidx.biometric.internal.AuthenticationUiStateObserver
            protected br createObserverJob() {
                return aj.z(LifecycleOwnerKt.getLifecycleScope(this.this$0.getLifecycleOwner()), null, null, new AuthenticationHandlerFingerprintManager$uiStateObserver$1$createObserverJob$1(this.this$0, null), 3);
            }
        };
        this.uiStateObserver = r9;
        authenticationManager.initialize((AuthenticationResultDispatcher) r1, (AuthenticationUiStateObserver) r9);
    }

    static final ab authenticate$lambda$0(AuthenticationHandlerFingerprintManager authenticationHandlerFingerprintManager) {
        authenticationHandlerFingerprintManager.showAuthentication();
        return ab.f48028a;
    }

    private final void dismiss() {
        this.authenticationManager.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAuthenticationError(int i2, CharSequence charSequence) {
        int knownErrorCodeForAuthenticate = ErrorUtils.toKnownErrorCodeForAuthenticate(i2);
        if (ErrorUtils.isLockoutError(knownErrorCodeForAuthenticate) && getViewModel().isOverriddenDeviceCredential()) {
            showKMAsFallback();
            return;
        }
        if (charSequence == null) {
            String fingerprintErrorString = ErrorUtils.getFingerprintErrorString(getContext(), knownErrorCodeForAuthenticate);
            x.e(fingerprintErrorString, "getFingerprintErrorString(...)");
            charSequence = fingerprintErrorString;
        }
        if (knownErrorCodeForAuthenticate != 5) {
            sendErrorAndDismiss(knownErrorCodeForAuthenticate, charSequence);
            return;
        }
        if (getViewModel().getCanceledFrom().isNotUserInitiated()) {
            sendErrorToClient(5, charSequence);
        }
        dismiss();
    }

    static final ab resultDispatcher$lambda$0(AuthenticationHandlerFingerprintManager authenticationHandlerFingerprintManager) {
        authenticationHandlerFingerprintManager.dismiss();
        return ab.f48028a;
    }

    private final void showAuthentication() {
        Intent intent = new Intent(getContext(), (Class<?>) FingerprintDialogActivity.class);
        intent.addFlags(268435456);
        getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showKMAsFallback() {
        getConfirmCredentialActivityLauncher().run();
    }

    @Override // androidx.biometric.internal.AuthenticationHandler
    public void authenticate(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        x.f(promptInfo, "info");
        this.authenticationManager.authenticate(promptInfo, cryptoObject, new a() { // from class: androidx.biometric.internal.AuthenticationHandlerFingerprintManager$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationHandlerFingerprintManager.authenticate$lambda$0(this.f$0);
            }
        });
    }

    @Override // androidx.biometric.internal.AuthenticationHandler
    public void cancelAuthentication(CanceledFrom canceledFrom) {
        x.f(canceledFrom, "canceledFrom");
        this.authenticationManager.cancelAuthentication(canceledFrom);
    }

    public final Runnable getConfirmCredentialActivityLauncher() {
        return this.authenticationManager.getConfirmCredentialActivityLauncher();
    }

    public final Context getContext() {
        return this.authenticationManager.getContext();
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.authenticationManager.getLifecycleOwner();
    }

    public final AuthenticationViewModel getViewModel() {
        return this.authenticationManager.getViewModel();
    }
}
