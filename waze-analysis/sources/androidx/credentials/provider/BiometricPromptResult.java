package androidx.credentials.provider;

import h.g.b.o;
import h.g.b.x;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BiometricPromptResult {
    private final AuthenticationError authenticationError;
    private final AuthenticationResult authenticationResult;
    private final boolean isSuccessful;

    public /* synthetic */ BiometricPromptResult(AuthenticationResult authenticationResult, AuthenticationError authenticationError, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : authenticationResult, (i2 & 2) != 0 ? null : authenticationError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BiometricPromptResult) {
            BiometricPromptResult biometricPromptResult = (BiometricPromptResult) obj;
            if (this.isSuccessful == biometricPromptResult.isSuccessful && x.n(this.authenticationResult, biometricPromptResult.authenticationResult) && x.n(this.authenticationError, biometricPromptResult.authenticationError)) {
                return true;
            }
        }
        return false;
    }

    public final AuthenticationError getAuthenticationError() {
        return this.authenticationError;
    }

    public final AuthenticationResult getAuthenticationResult() {
        return this.authenticationResult;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSuccessful), this.authenticationResult, this.authenticationError);
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public BiometricPromptResult(AuthenticationResult authenticationResult, AuthenticationError authenticationError) {
        this.authenticationResult = authenticationResult;
        this.authenticationError = authenticationError;
        this.isSuccessful = authenticationResult != null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricPromptResult(AuthenticationError authenticationError) {
        this(null, authenticationError);
        x.f(authenticationError, "authenticationError");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BiometricPromptResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricPromptResult(AuthenticationResult authenticationResult) {
        this(authenticationResult, null);
        x.f(authenticationResult, "authenticationResult");
    }
}
