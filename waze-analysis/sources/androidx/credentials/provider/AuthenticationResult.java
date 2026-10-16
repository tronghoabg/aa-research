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
public final class AuthenticationResult {
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE = "androidx.credentials.provider.BIOMETRIC_AUTH_RESULT";
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK = "BIOMETRIC_AUTH_RESULT";
    private final int authenticationType;
    public static final Companion Companion = new Companion(null);
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackResultMap = r.i(new k(2, 2), new k(1, 1));

    public AuthenticationResult(int i2) {
        this.authenticationType = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthenticationResult) && this.authenticationType == ((AuthenticationResult) obj).authenticationType;
    }

    public final int getAuthenticationType() {
        return this.authenticationType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.authenticationType));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AuthenticationResult createFrom$credentials$default(Companion companion, int i2, boolean z, int i3, Object obj) {
            return companion.createFrom$credentials(i2, z | (!((i3 & 2) == 0)));
        }

        public final int convertFrameworkBiometricResultToJetpack$credentials(int i2) {
            LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackResultMap$credentials = getBiometricFrameworkToJetpackResultMap$credentials();
            Integer numValueOf = Integer.valueOf(i2);
            if (biometricFrameworkToJetpackResultMap$credentials.containsKey(numValueOf)) {
                Integer num = getBiometricFrameworkToJetpackResultMap$credentials().get(numValueOf);
                x.c(num);
                return num.intValue();
            }
            Log.i(AuthenticationError.Companion.getTAG$credentials(), "Non framework result code, " + i2 + ", ");
            return i2;
        }

        public final AuthenticationResult createFrom$credentials(int i2, boolean z) {
            if (z) {
                i2 = convertFrameworkBiometricResultToJetpack$credentials(i2);
            }
            return new AuthenticationResult(i2);
        }

        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackResultMap$credentials() {
            return AuthenticationResult.biometricFrameworkToJetpackResultMap;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final AuthenticationResult createFrom$credentials(int i2) {
            return createFrom$credentials$default(this, i2, false, 2, null);
        }
    }
}
