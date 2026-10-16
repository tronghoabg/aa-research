package androidx.biometric.internal;

import android.content.Context;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.data.CanceledFrom;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.biometric.utils.DeviceUtils;
import androidx.lifecycle.LifecycleOwner;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DefaultAuthenticationHandler implements AuthenticationHandler {
    private final BiometricPrompt.AuthenticationCallback clientAuthenticationCallback;
    private final Executor clientExecutor;
    private final Runnable confirmCredentialActivityLauncher;
    private final Context context;
    private AuthenticationHandler internalHandler;
    private final int key;
    private final LifecycleOwner lifecycleOwner;
    private final AuthenticationViewModel viewModel;

    public DefaultAuthenticationHandler(Context context, LifecycleOwner lifecycleOwner, AuthenticationViewModel authenticationViewModel, Runnable runnable, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        x.f(context, "context");
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(authenticationViewModel, "viewModel");
        x.f(runnable, "confirmCredentialActivityLauncher");
        x.f(executor, "clientExecutor");
        x.f(authenticationCallback, "clientAuthenticationCallback");
        this.context = context;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = authenticationViewModel;
        this.confirmCredentialActivityLauncher = runnable;
        this.clientExecutor = executor;
        this.clientAuthenticationCallback = authenticationCallback;
        int iGenerateNextHandlerKey = authenticationViewModel.generateNextHandlerKey();
        this.key = iGenerateNextHandlerKey;
        if (authenticationViewModel.isPromptShowing() && iGenerateNextHandlerKey == authenticationViewModel.getCurrentAuthenticationKey()) {
            this.internalHandler = createHandler();
        }
    }

    private final AuthenticationHandler createHandler() {
        int allowedAuthenticators = this.viewModel.getAllowedAuthenticators();
        this.viewModel.setUsingKeyguardManagerForBiometricAndCredential(DefaultAuthenticationHandlerKt.isKeyguardManagerNeededForBiometricAndCredential(allowedAuthenticators));
        boolean z = true;
        if (!DeviceUtils.isWearOS(this.context) && !this.viewModel.isUsingKeyguardManagerForBiometricAndCredential() && !DefaultAuthenticationHandlerKt.isKeyguardManagerNeededForNoBiometric(this.context, allowedAuthenticators)) {
            z = false;
        }
        if (!z) {
            DefaultAuthenticationHandlerKt.isUsingFingerprintDialog(this.context, this.viewModel.getCryptoObject());
        }
        AuthenticationManager authenticationManager = new AuthenticationManager(this.context, this.lifecycleOwner, this.viewModel, this.confirmCredentialActivityLauncher, this.clientExecutor, this.clientAuthenticationCallback, new a() { // from class: androidx.biometric.internal.DefaultAuthenticationHandler$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return DefaultAuthenticationHandler.createHandler$lambda$0(this.f$0);
            }
        });
        return z ? new AuthenticationHandlerKeyguardManager(authenticationManager) : new AuthenticationHandlerBiometricPrompt(authenticationManager);
    }

    static final ab createHandler$lambda$0(DefaultAuthenticationHandler defaultAuthenticationHandler) {
        defaultAuthenticationHandler.internalHandler = null;
        defaultAuthenticationHandler.viewModel.setCurrentAuthenticationKey(0);
        defaultAuthenticationHandler.viewModel.setPromptShowing(false);
        defaultAuthenticationHandler.viewModel.setConfirmingDeviceCredential(false);
        return ab.f48028a;
    }

    @Override // androidx.biometric.internal.AuthenticationHandler
    public void authenticate(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        x.f(promptInfo, "info");
        this.viewModel.setCurrentAuthenticationKey(this.key);
        this.viewModel.setPromptShowing(true);
        this.viewModel.setAwaitingResult(true);
        this.viewModel.setPromptInfo(promptInfo);
        this.viewModel.setIdentityCheckAvailable(BiometricManager.from(this.context).isIdentityCheckAvailable());
        this.viewModel.setCryptoObject(cryptoObject);
        AuthenticationHandler authenticationHandlerCreateHandler = createHandler();
        this.internalHandler = authenticationHandlerCreateHandler;
        if (authenticationHandlerCreateHandler != null) {
            authenticationHandlerCreateHandler.authenticate(promptInfo, cryptoObject);
        }
    }

    @Override // androidx.biometric.internal.AuthenticationHandler
    public void cancelAuthentication(CanceledFrom canceledFrom) {
        x.f(canceledFrom, "canceledFrom");
        AuthenticationHandler authenticationHandler = this.internalHandler;
        if (authenticationHandler != null) {
            authenticationHandler.cancelAuthentication(canceledFrom);
        }
        this.internalHandler = null;
    }

    public final AuthenticationHandler getInternalHandler() {
        return this.internalHandler;
    }

    public final int getKey() {
        return this.key;
    }

    public final void setInternalHandler(AuthenticationHandler authenticationHandler) {
        this.internalHandler = authenticationHandler;
    }

    public static /* synthetic */ void getInternalHandler$annotations() {
    }
}
