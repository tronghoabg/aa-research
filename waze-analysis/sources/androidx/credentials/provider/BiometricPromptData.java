package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BiometricPromptData {
    public static final String BUNDLE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS";
    public static final String BUNDLE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.BUNDLE_HINT_CRYPTO_OP_ID";
    private static final String TAG = "BiometricPromptData";
    private final int allowedAuthenticators;
    private final BiometricPrompt.CryptoObject cryptoObject;
    private boolean isCreatedFromBundle;
    public static final Companion Companion = new Companion(null);
    private static final Set<Integer> ALLOWED_AUTHENTICATOR_VALUES = e.c.d.a.r(15, 255, 32768, 32783, 33023);

    /* compiled from: WazeSource */
    final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        public static final BiometricPromptData fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            return new BiometricPromptData(null, bundle.getInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true);
        }

        public static final Bundle toBundle(BiometricPromptData biometricPromptData) {
            x.f(biometricPromptData, "biometricPromptData");
            Bundle bundle = new Bundle();
            bundle.putInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, biometricPromptData.getAllowedAuthenticators());
            if (biometricPromptData.getCryptoObject() != null) {
                bundle.putLong(BiometricPromptData.BUNDLE_HINT_CRYPTO_OP_ID, CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()));
            }
            return bundle;
        }
    }

    /* compiled from: WazeSource */
    final class ApiMinImpl {
        public static final ApiMinImpl INSTANCE = new ApiMinImpl();

        private ApiMinImpl() {
        }

        public static final BiometricPromptData fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            return new BiometricPromptData(null, bundle.getInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true, 1, null);
        }

        public static final Bundle toBundle(BiometricPromptData biometricPromptData) {
            x.f(biometricPromptData, "biometricPromptData");
            Bundle bundle = new Bundle();
            bundle.putInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, biometricPromptData.getAllowedAuthenticators());
            return bundle;
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private Integer allowedAuthenticators;
        private BiometricPrompt.CryptoObject cryptoObject;

        public final BiometricPromptData build() {
            Integer num = this.allowedAuthenticators;
            return new BiometricPromptData(this.cryptoObject, num != null ? num.intValue() : 255);
        }

        public final Builder setAllowedAuthenticators(int i2) {
            this.allowedAuthenticators = Integer.valueOf(i2);
            return this;
        }

        public final Builder setCryptoObject(BiometricPrompt.CryptoObject cryptoObject) {
            this.cryptoObject = cryptoObject;
            return this;
        }
    }

    public BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject, int i2, boolean z) {
        this.cryptoObject = cryptoObject;
        this.allowedAuthenticators = i2;
        this.isCreatedFromBundle = z;
        if (!z && !ALLOWED_AUTHENTICATOR_VALUES.contains(Integer.valueOf(i2))) {
            throw new IllegalArgumentException("The allowed authenticator must be specified according to the BiometricPrompt spec.");
        }
        if (cryptoObject != null && !Companion.isStrongAuthenticationType(Integer.valueOf(i2))) {
            throw new IllegalArgumentException("If the cryptoObject is non-null, the allowedAuthenticator value must be Authenticators.BIOMETRIC_STRONG.");
        }
    }

    public static final BiometricPromptData fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public static final Bundle toBundle(BiometricPromptData biometricPromptData) {
        return Companion.toBundle(biometricPromptData);
    }

    public final int getAllowedAuthenticators() {
        return this.allowedAuthenticators;
    }

    public final BiometricPrompt.CryptoObject getCryptoObject() {
        return this.cryptoObject;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isStrongAuthenticationType(Integer num) {
            return num != null && (num.intValue() & 240) == 0;
        }

        public final BiometricPromptData fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            try {
                if (bundle.containsKey(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS)) {
                    return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromBundle(bundle) : ApiMinImpl.fromBundle(bundle);
                }
                throw new IllegalArgumentException("Bundle lacks allowed authenticator key.");
            } catch (Exception e2) {
                Log.i(BiometricPromptData.TAG, "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public final Bundle toBundle(BiometricPromptData biometricPromptData) {
            x.f(biometricPromptData, "biometricPromptData");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toBundle(biometricPromptData) : ApiMinImpl.toBundle(biometricPromptData);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject) {
        this(cryptoObject, 0, 2, null);
    }

    public BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject, int i2) {
        this(cryptoObject, i2, false);
    }

    public /* synthetic */ BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject, int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? null : cryptoObject, (i3 & 2) != 0 ? 255 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BiometricPromptData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject, int i2, boolean z, int i3, o oVar) {
        this(1 == (i3 & 1) ? null : cryptoObject, (i3 & 2) != 0 ? 255 : i2, z & ((i3 & 4) == 0));
    }
}
