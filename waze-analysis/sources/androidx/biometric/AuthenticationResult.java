package androidx.biometric;

import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricPrompt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AuthenticationResult {

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.AuthenticationResult$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CustomFallbackSelected $default$customFallbackSelected(AuthenticationResult authenticationResult) {
            return null;
        }

        public static Error $default$error(AuthenticationResult authenticationResult) {
            return null;
        }

        public static boolean $default$isCustomFallbackSelected(AuthenticationResult authenticationResult) {
            return authenticationResult instanceof CustomFallbackSelected;
        }

        public static boolean $default$isError(AuthenticationResult authenticationResult) {
            return authenticationResult instanceof Error;
        }

        public static boolean $default$isSuccess(AuthenticationResult authenticationResult) {
            return authenticationResult instanceof Success;
        }

        public static Success $default$success(AuthenticationResult authenticationResult) {
            return null;
        }
    }

    CustomFallbackSelected customFallbackSelected();

    Error error();

    boolean isCustomFallbackSelected();

    boolean isError();

    boolean isSuccess();

    Success success();

    /* compiled from: WazeSource */
    public final class CustomFallbackSelected implements AuthenticationResult {
        private final AuthenticationRequest.Biometric.Fallback.CustomOption fallback;

        public CustomFallbackSelected(AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
            x.f(customOption, "fallback");
            this.fallback = customOption;
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ Error error() {
            return null;
        }

        public final AuthenticationRequest.Biometric.Fallback.CustomOption getFallback() {
            return this.fallback;
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isCustomFallbackSelected() {
            return CC.$default$isCustomFallbackSelected(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isError() {
            return CC.$default$isError(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isSuccess() {
            return CC.$default$isSuccess(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ Success success() {
            return null;
        }

        @Override // androidx.biometric.AuthenticationResult
        public CustomFallbackSelected customFallbackSelected() {
            return this;
        }
    }

    /* compiled from: WazeSource */
    public final class Error implements AuthenticationResult {
        private final CharSequence errString;
        private final int errorCode;

        public Error(int i2, CharSequence charSequence) {
            x.f(charSequence, "errString");
            this.errorCode = i2;
            this.errString = charSequence;
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ CustomFallbackSelected customFallbackSelected() {
            return null;
        }

        public final CharSequence getErrString() {
            return this.errString;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isCustomFallbackSelected() {
            return CC.$default$isCustomFallbackSelected(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isError() {
            return CC.$default$isError(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isSuccess() {
            return CC.$default$isSuccess(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ Success success() {
            return null;
        }

        @Override // androidx.biometric.AuthenticationResult
        public Error error() {
            return this;
        }
    }

    /* compiled from: WazeSource */
    public final class Success implements AuthenticationResult {
        private final int authType;
        private final BiometricPrompt.CryptoObject crypto;

        public Success(BiometricPrompt.CryptoObject cryptoObject, int i2) {
            this.crypto = cryptoObject;
            this.authType = i2;
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ CustomFallbackSelected customFallbackSelected() {
            return null;
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ Error error() {
            return null;
        }

        public final int getAuthType() {
            return this.authType;
        }

        public final BiometricPrompt.CryptoObject getCrypto() {
            return this.crypto;
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isCustomFallbackSelected() {
            return CC.$default$isCustomFallbackSelected(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isError() {
            return CC.$default$isError(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public /* synthetic */ boolean isSuccess() {
            return CC.$default$isSuccess(this);
        }

        @Override // androidx.biometric.AuthenticationResult
        public Success success() {
            return this;
        }
    }
}
