package androidx.credentials.provider;

import android.util.Log;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import j$.util.Objects;
import java.util.LinkedHashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AuthenticationError {
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_CODE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK = "BIOMETRIC_AUTH_ERROR_CODE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_MESSAGE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK = "BIOMETRIC_AUTH_ERROR_MESSAGE";
    private final int errorCode;
    private final CharSequence errorMsg;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AuthenticationError";
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackErrorMap = r.i(new k(5, 5), new k(12, 12), new k(1, 1), new k(7, 7), new k(9, 9), new k(11, 11), new k(14, 14), new k(4, 4), new k(15, 15), new k(3, 3), new k(2, 2), new k(10, 10), new k(8, 8));

    public /* synthetic */ AuthenticationError(int i2, CharSequence charSequence, int i3, o oVar) {
        this(i2, (i3 & 2) != 0 ? null : charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationError) {
            AuthenticationError authenticationError = (AuthenticationError) obj;
            if (this.errorCode == authenticationError.errorCode && x.n(this.errorMsg, authenticationError.errorMsg)) {
                return true;
            }
        }
        return false;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final CharSequence getErrorMsg() {
        return this.errorMsg;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.errorCode), this.errorMsg);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AuthenticationError createFrom$credentials$default(Companion companion, int i2, CharSequence charSequence, boolean z, int i3, Object obj) {
            return companion.createFrom$credentials(i2, charSequence, z | (!((i3 & 4) == 0)));
        }

        public static /* synthetic */ void getBiometricFrameworkToJetpackErrorMap$credentials$annotations() {
        }

        public final int convertFrameworkBiometricErrorToJetpack$credentials(int i2) {
            LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackErrorMap$credentials = getBiometricFrameworkToJetpackErrorMap$credentials();
            Integer numValueOf = Integer.valueOf(i2);
            if (biometricFrameworkToJetpackErrorMap$credentials.containsKey(numValueOf)) {
                Integer num = getBiometricFrameworkToJetpackErrorMap$credentials().get(numValueOf);
                x.c(num);
                return num.intValue();
            }
            Log.i(getTAG$credentials(), "Unexpected error code, " + i2 + ", ");
            return i2;
        }

        public final AuthenticationError createFrom$credentials(int i2, CharSequence charSequence, boolean z) {
            x.f(charSequence, "uiErrorMessage");
            if (z) {
                i2 = convertFrameworkBiometricErrorToJetpack$credentials(i2);
            }
            return new AuthenticationError(i2, charSequence);
        }

        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackErrorMap$credentials() {
            return AuthenticationError.biometricFrameworkToJetpackErrorMap;
        }

        public final String getTAG$credentials() {
            return AuthenticationError.TAG;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final AuthenticationError createFrom$credentials(int i2, CharSequence charSequence) {
            x.f(charSequence, "uiErrorMessage");
            return createFrom$credentials$default(this, i2, charSequence, false, 4, null);
        }
    }

    public AuthenticationError(int i2, CharSequence charSequence) {
        this.errorCode = i2;
        this.errorMsg = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationError(int i2) {
        this(i2, null, 2, 0 == true ? 1 : 0);
    }
}
