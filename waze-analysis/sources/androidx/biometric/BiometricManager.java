package androidx.biometric;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.biometric.internal.FingerprintManagerCompat;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.CryptoObjectUtils;
import androidx.biometric.utils.DeviceUtils;
import androidx.biometric.utils.ErrorUtils;
import androidx.biometric.utils.KeyguardUtils;
import androidx.biometric.utils.PackageUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class BiometricManager {
    private static final int AUTH_MODALITY_CREDENTIAL = 1;
    private static final int AUTH_MODALITY_FACE = 8;
    private static final int AUTH_MODALITY_FINGERPRINT = 4;
    private static final int AUTH_MODALITY_NONE = 0;
    private static final int AUTH_MODALITY_UNKNOWN_BIOMETRIC = 2;
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_IDENTITY_CHECK_NOT_ACTIVE = 20;
    public static final int BIOMETRIC_ERROR_LOCKOUT = 7;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NOT_ENABLED_FOR_APPS = 21;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_ERROR_UNSUPPORTED = -2;
    public static final int BIOMETRIC_STATUS_UNKNOWN = -1;
    public static final int BIOMETRIC_SUCCESS = 0;
    private static final String TAG = "BiometricManager";
    private final android.hardware.biometrics.BiometricManager mBiometricManager;
    private final FingerprintManagerCompat mFingerprintManager;
    private final Injector mInjector;
    private Boolean mIsIdentityCheckAvailable = null;

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static int canAuthenticate(android.hardware.biometrics.BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static android.hardware.biometrics.BiometricManager create(Context context) {
            return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
        }

        static Method getCanAuthenticateWithCryptoMethod() {
            try {
                return android.hardware.biometrics.BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* compiled from: WazeSource */
    class Api30Impl {
        private Api30Impl() {
        }

        static int canAuthenticate(android.hardware.biometrics.BiometricManager biometricManager, int i2) {
            return biometricManager.canAuthenticate(i2);
        }
    }

    /* compiled from: WazeSource */
    class Api31Impl {
        private Api31Impl() {
        }

        static CharSequence getButtonLabel(BiometricManager.Strings strings) {
            return strings.getButtonLabel();
        }

        static CharSequence getPromptMessage(BiometricManager.Strings strings) {
            return strings.getPromptMessage();
        }

        static CharSequence getSettingName(BiometricManager.Strings strings) {
            return strings.getSettingName();
        }

        static BiometricManager.Strings getStrings(android.hardware.biometrics.BiometricManager biometricManager, int i2) {
            return biometricManager.getStrings(i2);
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthenticationStatus {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthenticatorTypes {
    }

    /* compiled from: WazeSource */
    public interface Authenticators {
        public static final int BIOMETRIC_MAX_STRENGTH = 1;
        public static final int BIOMETRIC_MIN_STRENGTH = 32767;
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
        public static final int IDENTITY_CHECK = 65536;
    }

    /* compiled from: WazeSource */
    class DefaultInjector implements Injector {
        private final Context mContext;

        DefaultInjector(Context context) {
            this.mContext = context.getApplicationContext();
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public android.hardware.biometrics.BiometricManager getBiometricManager() {
            return Api29Impl.create(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public FingerprintManagerCompat getFingerprintManager() {
            return FingerprintManagerCompat.from(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public Resources getResources() {
            return this.mContext.getResources();
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecurable() {
            return KeyguardUtils.getKeyguardManager(this.mContext) != null;
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecuredWithCredential() {
            return KeyguardUtils.isDeviceSecuredWithCredential(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isFaceHardwarePresent() {
            return PackageUtils.hasSystemFeatureFace(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isFingerprintHardwarePresent() {
            return PackageUtils.hasSystemFeatureFingerprint(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isIrisHardwarePresent() {
            return PackageUtils.hasSystemFeatureIris(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isStrongBiometricGuaranteed() {
            return DeviceUtils.canAssumeStrongBiometrics(this.mContext, Build.MODEL);
        }
    }

    /* compiled from: WazeSource */
    interface Injector {
        android.hardware.biometrics.BiometricManager getBiometricManager();

        FingerprintManagerCompat getFingerprintManager();

        Resources getResources();

        boolean isDeviceSecurable();

        boolean isDeviceSecuredWithCredential();

        boolean isFaceHardwarePresent();

        boolean isFingerprintHardwarePresent();

        boolean isIrisHardwarePresent();

        boolean isStrongBiometricGuaranteed();
    }

    /* compiled from: WazeSource */
    class StringsCompat {
        private final int mAuthenticators;
        private final int mPossibleModalities;
        private final Resources mResources;

        StringsCompat(Resources resources, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
            this.mResources = resources;
            this.mAuthenticators = i2;
            int i3 = 0;
            if (z4 && AuthenticatorUtils.isDeviceCredentialAllowed(i2)) {
                i3 = 1;
            }
            if (AuthenticatorUtils.isSomeBiometricAllowed(i2)) {
                i3 = z ? i3 | 4 : i3;
                i3 = z2 ? i3 | 8 : i3;
                if (z3) {
                    i3 |= 2;
                }
            }
            this.mPossibleModalities = i3;
        }

        CharSequence getButtonLabel() {
            int iCanAuthenticate = BiometricManager.this.canAuthenticate(AuthenticatorUtils.getBiometricAuthenticators(this.mAuthenticators));
            int i2 = this.mPossibleModalities;
            if (iCanAuthenticate != 0) {
                if ((i2 & 1) != 0) {
                    return this.mResources.getString(com.waze.R.string.use_screen_lock_label);
                }
                return null;
            }
            int i3 = i2 & (-2);
            if (i3 == 4) {
                return this.mResources.getString(com.waze.R.string.use_fingerprint_label);
            }
            Resources resources = this.mResources;
            return i3 != 8 ? resources.getString(com.waze.R.string.use_biometric_label) : resources.getString(com.waze.R.string.use_face_label);
        }

        CharSequence getPromptMessage() {
            int i2;
            int i3;
            int iCanAuthenticate = BiometricManager.this.canAuthenticate(AuthenticatorUtils.getBiometricAuthenticators(this.mAuthenticators));
            int i4 = this.mPossibleModalities;
            if (iCanAuthenticate != 0) {
                if ((i4 & 1) != 0) {
                    return this.mResources.getString(com.waze.R.string.screen_lock_prompt_message);
                }
                return null;
            }
            int i5 = i4 & (-2);
            if (i5 == 4) {
                i2 = com.waze.R.string.fingerprint_prompt_message;
                i3 = com.waze.R.string.fingerprint_or_screen_lock_prompt_message;
            } else if (i5 != 8) {
                i2 = com.waze.R.string.biometric_prompt_message;
                i3 = com.waze.R.string.biometric_or_screen_lock_prompt_message;
            } else {
                i2 = com.waze.R.string.face_prompt_message;
                i3 = com.waze.R.string.face_or_screen_lock_prompt_message;
            }
            int i6 = this.mAuthenticators;
            Resources resources = this.mResources;
            if (true == AuthenticatorUtils.isDeviceCredentialAllowed(i6)) {
                i2 = i3;
            }
            return resources.getString(i2);
        }

        CharSequence getSettingName() {
            int i2 = this.mPossibleModalities;
            if (i2 == 0) {
                return null;
            }
            if (i2 == 1) {
                return this.mResources.getString(com.waze.R.string.use_screen_lock_label);
            }
            if (i2 == 2) {
                return this.mResources.getString(com.waze.R.string.use_biometric_label);
            }
            if (i2 == 4) {
                return this.mResources.getString(com.waze.R.string.use_fingerprint_label);
            }
            if (i2 == 8) {
                return this.mResources.getString(com.waze.R.string.use_face_label);
            }
            if ((i2 & 1) == 0) {
                return this.mResources.getString(com.waze.R.string.use_biometric_label);
            }
            int i3 = i2 & (-2);
            if (i3 == 4) {
                return this.mResources.getString(com.waze.R.string.use_fingerprint_or_screen_lock_label);
            }
            Resources resources = this.mResources;
            return i3 != 8 ? resources.getString(com.waze.R.string.use_biometric_or_screen_lock_label) : resources.getString(com.waze.R.string.use_face_or_screen_lock_label);
        }
    }

    BiometricManager(Injector injector) {
        this.mInjector = injector;
        this.mBiometricManager = injector.getBiometricManager();
        this.mFingerprintManager = Build.VERSION.SDK_INT <= 29 ? injector.getFingerprintManager() : null;
    }

    private int canAuthenticateCompat(int i2) {
        if (!AuthenticatorUtils.isSupportedCombination(i2)) {
            return -2;
        }
        if (i2 != 0 && this.mInjector.isDeviceSecurable()) {
            return AuthenticatorUtils.isDeviceCredentialAllowed(i2) ? this.mInjector.isDeviceSecuredWithCredential() ? 0 : 11 : Build.VERSION.SDK_INT == 29 ? AuthenticatorUtils.isWeakBiometricAllowed(i2) ? canAuthenticateWithWeakBiometricOnApi29() : canAuthenticateWithStrongBiometricOnApi29() : canAuthenticateWithFingerprint();
        }
        return 12;
    }

    private int canAuthenticateWithFingerprint() {
        FingerprintManagerCompat fingerprintManagerCompat = this.mFingerprintManager;
        if (fingerprintManagerCompat == null) {
            Log.e(TAG, "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !this.mFingerprintManager.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    private int canAuthenticateWithFingerprintOrUnknownBiometric() {
        return !this.mInjector.isDeviceSecuredWithCredential() ? canAuthenticateWithFingerprint() : canAuthenticateWithFingerprint() == 0 ? 0 : -1;
    }

    private int canAuthenticateWithStrongBiometricOnApi29() {
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt;
        Method canAuthenticateWithCryptoMethod = Api29Impl.getCanAuthenticateWithCryptoMethod();
        if (canAuthenticateWithCryptoMethod != null && (cryptoObjectWrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(CryptoObjectUtils.createFakeCryptoObject())) != null) {
            try {
                Object objInvoke = Build.VERSION.SDK_INT == 29 ? canAuthenticateWithCryptoMethod.invoke(this.mBiometricManager, cryptoObjectWrapForBiometricPrompt) : null;
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w(TAG, "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.w(TAG, "Failed to invoke canAuthenticate(CryptoObject).", e2);
            }
        }
        int iCanAuthenticateWithWeakBiometricOnApi29 = canAuthenticateWithWeakBiometricOnApi29();
        return (this.mInjector.isStrongBiometricGuaranteed() || iCanAuthenticateWithWeakBiometricOnApi29 != 0) ? iCanAuthenticateWithWeakBiometricOnApi29 : canAuthenticateWithFingerprintOrUnknownBiometric();
    }

    private int canAuthenticateWithWeakBiometricOnApi29() {
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager != null) {
            return Api29Impl.canAuthenticate(biometricManager);
        }
        Log.e(TAG, "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static BiometricManager from(Context context) {
        return new BiometricManager(new DefaultInjector(context));
    }

    public int canAuthenticate(int i2) {
        if (!isIdentityCheckAvailable()) {
            if (i2 == 65536) {
                return 20;
            }
            if ((i2 & 65536) == 65536) {
                i2 &= -65537;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return canAuthenticateCompat(i2);
        }
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager != null) {
            return ErrorUtils.toKnownStatusCodeForCanAuthenticate(Api30Impl.canAuthenticate(biometricManager, i2));
        }
        Log.e(TAG, "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public Strings getStrings(int i2) {
        if (Build.VERSION.SDK_INT < 31) {
            Injector injector = this.mInjector;
            return new Strings(new StringsCompat(injector.getResources(), i2, injector.isFingerprintHardwarePresent(), injector.isFaceHardwarePresent(), injector.isIrisHardwarePresent(), injector.isDeviceSecuredWithCredential()));
        }
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager != null) {
            return new Strings(Api31Impl.getStrings(biometricManager, i2));
        }
        Log.e(TAG, "Failure in getStrings(). BiometricManager was null.");
        return null;
    }

    public boolean isIdentityCheckAvailable() {
        Boolean bool;
        android.hardware.biometrics.BiometricManager biometricManager;
        Boolean bool2 = this.mIsIdentityCheckAvailable;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (Build.VERSION.SDK_INT < 35 || (biometricManager = this.mBiometricManager) == null) {
            bool = false;
            this.mIsIdentityCheckAvailable = bool;
        } else {
            try {
                Api30Impl.canAuthenticate(biometricManager, 65536);
                bool = true;
                this.mIsIdentityCheckAvailable = bool;
            } catch (SecurityException unused) {
                bool = false;
                this.mIsIdentityCheckAvailable = bool;
            }
        }
        return bool.booleanValue();
    }

    /* compiled from: WazeSource */
    public class Strings {
        private final BiometricManager.Strings mStrings;
        private final StringsCompat mStringsCompat;

        Strings(BiometricManager.Strings strings) {
            this.mStrings = strings;
            this.mStringsCompat = null;
        }

        public CharSequence getButtonLabel() {
            BiometricManager.Strings strings;
            if (Build.VERSION.SDK_INT >= 31 && (strings = this.mStrings) != null) {
                return Api31Impl.getButtonLabel(strings);
            }
            StringsCompat stringsCompat = this.mStringsCompat;
            if (stringsCompat != null) {
                return stringsCompat.getButtonLabel();
            }
            Log.e(BiometricManager.TAG, "Failure in Strings.getButtonLabel(). No available string provider.");
            return null;
        }

        public CharSequence getPromptMessage() {
            BiometricManager.Strings strings;
            if (Build.VERSION.SDK_INT >= 31 && (strings = this.mStrings) != null) {
                return Api31Impl.getPromptMessage(strings);
            }
            StringsCompat stringsCompat = this.mStringsCompat;
            if (stringsCompat != null) {
                return stringsCompat.getPromptMessage();
            }
            Log.e(BiometricManager.TAG, "Failure in Strings.getPromptMessage(). No available string provider.");
            return null;
        }

        public CharSequence getSettingName() {
            BiometricManager.Strings strings;
            if (Build.VERSION.SDK_INT >= 31 && (strings = this.mStrings) != null) {
                return Api31Impl.getSettingName(strings);
            }
            StringsCompat stringsCompat = this.mStringsCompat;
            if (stringsCompat != null) {
                return stringsCompat.getSettingName();
            }
            Log.e(BiometricManager.TAG, "Failure in Strings.getSettingName(). No available string provider.");
            return null;
        }

        Strings(StringsCompat stringsCompat) {
            this.mStrings = null;
            this.mStringsCompat = stringsCompat;
        }
    }

    @Deprecated
    public int canAuthenticate() {
        return canAuthenticate(255);
    }
}
