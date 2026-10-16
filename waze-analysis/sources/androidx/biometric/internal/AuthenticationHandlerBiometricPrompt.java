package androidx.biometric.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.biometrics.PromptContentView;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.data.CanceledFrom;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.CryptoObjectUtils;
import androidx.biometric.utils.ErrorUtils;
import androidx.biometric.utils.PromptContentViewUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationHandlerBiometricPrompt implements AuthenticationHandler {
    private final AuthenticationManager authenticationManager;

    public AuthenticationHandlerBiometricPrompt(AuthenticationManager authenticationManager) {
        x.f(authenticationManager, "authenticationManager");
        this.authenticationManager = authenticationManager;
        final Context context = getContext();
        final AuthenticationViewModel viewModel = getViewModel();
        final Executor clientExecutor = getClientExecutor();
        final BiometricPrompt.AuthenticationCallback clientAuthenticationCallback = authenticationManager.getClientAuthenticationCallback();
        final Runnable confirmCredentialActivityLauncher = authenticationManager.getConfirmCredentialActivityLauncher();
        final a aVar = new a() { // from class: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationHandlerBiometricPrompt._init_$lambda$0(this.f$0);
            }
        };
        authenticationManager.initialize(new AuthenticationResultDispatcher(context, viewModel, clientExecutor, clientAuthenticationCallback, confirmCredentialActivityLauncher, aVar) { // from class: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt$resultDispatcher$1
            @Override // androidx.biometric.internal.AuthenticationResultDispatcher
            public void onAuthenticationError(int i2, CharSequence charSequence) {
                int knownErrorCodeForAuthenticate = ErrorUtils.toKnownErrorCodeForAuthenticate(i2);
                if (ErrorUtils.isLockoutError(knownErrorCodeForAuthenticate) && getViewModel().isOverriddenDeviceCredential()) {
                    showKMAsFallback();
                    return;
                }
                if (charSequence == null) {
                    String string = getContext().getString(R.string.default_error_msg);
                    x.e(string, "getString(...)");
                    charSequence = string;
                }
                sendErrorAndDismiss(knownErrorCodeForAuthenticate, charSequence);
            }
        }, new AuthenticationUiStateObserver() { // from class: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt$uiStateObserver$1
            @Override // androidx.biometric.internal.AuthenticationUiStateObserver
            protected br createObserverJob() {
                return aj.z(LifecycleOwnerKt.getLifecycleScope(this.this$0.getLifecycleOwner()), null, null, new AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1(this.this$0, null), 3);
            }
        });
    }

    static final ab _init_$lambda$0(AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt) {
        authenticationHandlerBiometricPrompt.authenticationManager.dismiss();
        return ab.f48028a;
    }

    static final ab authenticate$lambda$0(AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt) {
        authenticationHandlerBiometricPrompt.showAuthentication();
        return ab.f48028a;
    }

    private final void authenticateWithBiometricPrompt(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(getViewModel().getCryptoObject());
        CancellationSignal biometricCancellationSignal = getViewModel().getCancellationSignalProvider().getBiometricCancellationSignal();
        x.e(biometricCancellationSignal, "getBiometricCancellationSignal(...)");
        PromptExecutor promptExecutor = new PromptExecutor();
        BiometricPrompt$AuthenticationCallback biometricCallback = getViewModel().getAuthenticationCallbackProvider().getBiometricCallback();
        x.e(biometricCallback, "getBiometricCallback(...)");
        try {
            if (cryptoObjectWrapForBiometricPrompt != null) {
                Api28Impl.INSTANCE.authenticate(biometricPrompt, cryptoObjectWrapForBiometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            } else {
                Api28Impl.INSTANCE.authenticate(biometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            }
        } catch (NullPointerException e2) {
            Log.e("AuthHandlerBP", "Got NPE while authenticating with biometric prompt.", e2);
            String string = context.getString(R.string.default_error_msg);
            x.e(string, "getString(...)");
            this.authenticationManager.getResultDispatcher().sendErrorAndDismiss(1, string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFallbackOptionPressed(AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
        this.authenticationManager.getResultDispatcher().sendFallbackOptionAndDismiss(customOption);
        cancelAuthentication(CanceledFrom.FALLBACK_OPTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMoreOptionsButtonPressed() {
        AuthenticationResultDispatcher resultDispatcher = this.authenticationManager.getResultDispatcher();
        String string = getContext().getString(R.string.content_view_more_options_button_clicked);
        x.e(string, "getString(...)");
        resultDispatcher.sendErrorAndDismiss(22, string);
        cancelAuthentication(CanceledFrom.MORE_OPTIONS_BUTTON);
    }

    private final void showAuthentication() {
        Api28Impl api28Impl = Api28Impl.INSTANCE;
        Context applicationContext = getContext().getApplicationContext();
        x.e(applicationContext, "getApplicationContext(...)");
        BiometricPrompt.Builder builderCreatePromptBuilder = api28Impl.createPromptBuilder(applicationContext);
        CharSequence title = getViewModel().getTitle();
        CharSequence subtitle = getViewModel().getSubtitle();
        CharSequence description = getViewModel().getDescription();
        if (title != null) {
            Api28Impl.INSTANCE.setTitle(builderCreatePromptBuilder, title);
        }
        if (subtitle != null) {
            Api28Impl.INSTANCE.setSubtitle(builderCreatePromptBuilder, subtitle);
        }
        if (description != null) {
            Api28Impl.INSTANCE.setDescription(builderCreatePromptBuilder, description);
        }
        CharSequence singleFallbackOptionText = getViewModel().getSingleFallbackOptionText();
        if (singleFallbackOptionText != null && !TextUtils.isEmpty(singleFallbackOptionText)) {
            Api28Impl.INSTANCE.setNegativeButton(builderCreatePromptBuilder, singleFallbackOptionText, getClientExecutor(), getViewModel().getNegativeButtonListener());
        }
        List<AuthenticationRequest.Biometric.Fallback> multipleFallbackOptionList = getViewModel().getMultipleFallbackOptionList();
        if (multipleFallbackOptionList != null) {
            ArrayList<AuthenticationRequest.Biometric.Fallback.CustomOption> arrayList = new ArrayList();
            for (Object obj : multipleFallbackOptionList) {
                if (obj instanceof AuthenticationRequest.Biometric.Fallback.CustomOption) {
                    arrayList.add(obj);
                }
            }
            for (AuthenticationRequest.Biometric.Fallback.CustomOption customOption : arrayList) {
                Api36MinorImpl.INSTANCE.addFallbackOption(builderCreatePromptBuilder, customOption.getText(), customOption.getIconType(), getClientExecutor(), getViewModel().fallbackOptionListener(customOption));
            }
        }
        Api29Impl.INSTANCE.setConfirmationRequired(builderCreatePromptBuilder, getViewModel().isConfirmationRequired());
        int allowedAuthenticators = getViewModel().getAllowedAuthenticators();
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.INSTANCE.setAllowedAuthenticators(builderCreatePromptBuilder, allowedAuthenticators);
        } else {
            Api29Impl.INSTANCE.setDeviceCredentialAllowed(builderCreatePromptBuilder, AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators));
        }
        if (Build.VERSION.SDK_INT >= 35) {
            int logoRes = getViewModel().getLogoRes();
            Bitmap logoBitmap = getViewModel().getLogoBitmap();
            String logoDescription = getViewModel().getLogoDescription();
            PromptContentView promptContentViewWrapForBiometricPrompt = PromptContentViewUtils.wrapForBiometricPrompt(getViewModel().getContentView(), getClientExecutor(), getViewModel().getMoreOptionsButtonListener());
            if (logoRes != -1) {
                Api35Impl.INSTANCE.setLogoRes(builderCreatePromptBuilder, logoRes);
            }
            if (logoBitmap != null) {
                Api35Impl.INSTANCE.setLogoBitmap(builderCreatePromptBuilder, logoBitmap);
            }
            String str = logoDescription;
            if (str != null && str.length() != 0) {
                Api35Impl.INSTANCE.setLogoDescription(builderCreatePromptBuilder, logoDescription);
            }
            if (promptContentViewWrapForBiometricPrompt != null) {
                Api35Impl.INSTANCE.setContentView(builderCreatePromptBuilder, promptContentViewWrapForBiometricPrompt);
            }
        }
        authenticateWithBiometricPrompt(Api28Impl.INSTANCE.buildPrompt(builderCreatePromptBuilder), getContext());
    }

    @Override // androidx.biometric.internal.AuthenticationHandler
    public void authenticate(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        x.f(promptInfo, "info");
        this.authenticationManager.authenticate(promptInfo, cryptoObject, new a() { // from class: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationHandlerBiometricPrompt.authenticate$lambda$0(this.f$0);
            }
        });
    }

    @Override // androidx.biometric.internal.AuthenticationHandler
    public void cancelAuthentication(CanceledFrom canceledFrom) {
        x.f(canceledFrom, "canceledFrom");
        this.authenticationManager.cancelAuthentication(canceledFrom);
    }

    public final Executor getClientExecutor() {
        return this.authenticationManager.getClientExecutor();
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
