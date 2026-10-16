package androidx.biometric.internal;

import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.data.CanceledFrom;
import h.ab;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationHandlerKeyguardManager implements AuthenticationHandler {
    private final AuthenticationManager authenticationManager;

    public AuthenticationHandlerKeyguardManager(AuthenticationManager authenticationManager) {
        x.f(authenticationManager, "authenticationManager");
        this.authenticationManager = authenticationManager;
        AuthenticationManager.initialize$default(authenticationManager, null, null, 3, null);
    }

    static final ab authenticate$lambda$0(AuthenticationHandlerKeyguardManager authenticationHandlerKeyguardManager) {
        authenticationHandlerKeyguardManager.getConfirmCredentialActivityLauncher().run();
        return ab.f48028a;
    }

    @Override // androidx.biometric.internal.AuthenticationHandler
    public void authenticate(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        x.f(promptInfo, "info");
        this.authenticationManager.authenticate(promptInfo, cryptoObject, new a() { // from class: androidx.biometric.internal.AuthenticationHandlerKeyguardManager$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationHandlerKeyguardManager.authenticate$lambda$0(this.f$0);
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
}
