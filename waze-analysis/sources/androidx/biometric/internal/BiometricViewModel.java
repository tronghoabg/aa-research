package androidx.biometric.internal;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.PromptContentView;
import androidx.biometric.utils.AuthenticationCallbackProvider;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.BiometricErrorData;
import androidx.biometric.utils.CancellationSignalProvider;
import androidx.biometric.utils.CryptoObjectUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class BiometricViewModel extends ViewModel {
    private int mAllowedAuthenticators;
    private AuthenticationCallbackProvider mAuthenticationCallbackProvider;
    private MutableLiveData<BiometricErrorData> mAuthenticationError;
    private MutableLiveData<CharSequence> mAuthenticationHelpMessage;
    private MutableLiveData<BiometricPrompt.AuthenticationResult> mAuthenticationResult;
    private CancellationSignalProvider mCancellationSignalProvider;
    private BiometricPrompt.AuthenticationCallback mClientCallback;
    private Executor mClientExecutor;
    private BiometricPrompt.CryptoObject mCryptoObject;
    private MutableLiveData<CharSequence> mFingerprintDialogHelpMessage;
    private MutableLiveData<Integer> mFingerprintDialogState;
    private MutableLiveData<Boolean> mIsAuthenticationFailurePending;
    private boolean mIsAwaitingResult;
    private boolean mIsConfirmingDeviceCredential;
    private boolean mIsDelayingPrompt;
    private MutableLiveData<Boolean> mIsFingerprintDialogCancelPending;
    private boolean mIsIdentityCheckAvailable;
    private boolean mIsIgnoringCancel;
    private MutableLiveData<Boolean> mIsMoreOptionsButtonPressPending;
    private MutableLiveData<Boolean> mIsNegativeButtonPressPending;
    private boolean mIsPromptShowing;
    private boolean mIsUsingKeyguardManagerForBiometricAndCredential;
    private DialogInterface.OnClickListener mMoreOptionsButtonListener;
    private DialogInterface.OnClickListener mNegativeButtonListener;
    private CharSequence mNegativeButtonTextOverride;
    private BiometricPrompt.PromptInfo mPromptInfo;
    private int mCanceledFrom = 0;
    private boolean mIsFingerprintDialogDismissedInstantly = true;
    private int mFingerprintDialogPreviousState = 0;

    /* compiled from: WazeSource */
    final class CallbackListener extends AuthenticationCallbackProvider.Listener {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        CallbackListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.biometric.utils.AuthenticationCallbackProvider.Listener
        public void onError(int i2, CharSequence charSequence) {
            if (this.mViewModelRef.get() == null || this.mViewModelRef.get().isConfirmingDeviceCredential() || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            this.mViewModelRef.get().setAuthenticationError(new BiometricErrorData(i2, charSequence));
        }

        @Override // androidx.biometric.utils.AuthenticationCallbackProvider.Listener
        public void onFailure() {
            if (this.mViewModelRef.get() == null || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            this.mViewModelRef.get().setAuthenticationFailurePending(true);
        }

        @Override // androidx.biometric.utils.AuthenticationCallbackProvider.Listener
        public void onHelp(CharSequence charSequence) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setAuthenticationHelpMessage(charSequence);
            }
        }

        @Override // androidx.biometric.utils.AuthenticationCallbackProvider.Listener
        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
            if (this.mViewModelRef.get() == null || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            if (authenticationResult.getAuthenticationType() == -1) {
                authenticationResult = new BiometricPrompt.AuthenticationResult(authenticationResult.getCryptoObject(), this.mViewModelRef.get().getInferredAuthenticationResultType());
            }
            this.mViewModelRef.get().setAuthenticationResult(authenticationResult);
        }
    }

    /* compiled from: WazeSource */
    class DefaultExecutor implements Executor {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        DefaultExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    /* compiled from: WazeSource */
    class MoreOptionsButtonListener implements DialogInterface.OnClickListener {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        MoreOptionsButtonListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setMoreOptionsButtonPressPending(true);
            }
        }
    }

    /* compiled from: WazeSource */
    class NegativeButtonListener implements DialogInterface.OnClickListener {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        NegativeButtonListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setNegativeButtonPressPending(true);
            }
        }
    }

    private void updateConsolidatedAuthenticators() {
        this.mAllowedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(this.mPromptInfo, this.mCryptoObject, this.mIsIdentityCheckAvailable);
    }

    private static <T> void updateValue(MutableLiveData<T> mutableLiveData, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }

    int getAllowedAuthenticators() {
        return this.mAllowedAuthenticators;
    }

    AuthenticationCallbackProvider getAuthenticationCallbackProvider() {
        AuthenticationCallbackProvider authenticationCallbackProvider = this.mAuthenticationCallbackProvider;
        if (authenticationCallbackProvider != null) {
            return authenticationCallbackProvider;
        }
        AuthenticationCallbackProvider authenticationCallbackProvider2 = new AuthenticationCallbackProvider(new CallbackListener(this));
        this.mAuthenticationCallbackProvider = authenticationCallbackProvider2;
        return authenticationCallbackProvider2;
    }

    MutableLiveData<BiometricErrorData> getAuthenticationError() {
        MutableLiveData<BiometricErrorData> mutableLiveData = this.mAuthenticationError;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<BiometricErrorData> mutableLiveData2 = new MutableLiveData<>();
        this.mAuthenticationError = mutableLiveData2;
        return mutableLiveData2;
    }

    LiveData<CharSequence> getAuthenticationHelpMessage() {
        MutableLiveData<CharSequence> mutableLiveData = this.mAuthenticationHelpMessage;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<CharSequence> mutableLiveData2 = new MutableLiveData<>();
        this.mAuthenticationHelpMessage = mutableLiveData2;
        return mutableLiveData2;
    }

    LiveData<BiometricPrompt.AuthenticationResult> getAuthenticationResult() {
        MutableLiveData<BiometricPrompt.AuthenticationResult> mutableLiveData = this.mAuthenticationResult;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<BiometricPrompt.AuthenticationResult> mutableLiveData2 = new MutableLiveData<>();
        this.mAuthenticationResult = mutableLiveData2;
        return mutableLiveData2;
    }

    int getCanceledFrom() {
        return this.mCanceledFrom;
    }

    CancellationSignalProvider getCancellationSignalProvider() {
        CancellationSignalProvider cancellationSignalProvider = this.mCancellationSignalProvider;
        if (cancellationSignalProvider != null) {
            return cancellationSignalProvider;
        }
        CancellationSignalProvider cancellationSignalProvider2 = new CancellationSignalProvider();
        this.mCancellationSignalProvider = cancellationSignalProvider2;
        return cancellationSignalProvider2;
    }

    public BiometricPrompt.AuthenticationCallback getClientCallback() {
        if (this.mClientCallback == null) {
            this.mClientCallback = new BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.internal.BiometricViewModel.1
            };
        }
        return this.mClientCallback;
    }

    public Executor getClientExecutor() {
        Executor executor = this.mClientExecutor;
        return executor != null ? executor : new DefaultExecutor();
    }

    PromptContentView getContentView() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getContentView();
        }
        return null;
    }

    BiometricPrompt.CryptoObject getCryptoObject() {
        return this.mCryptoObject;
    }

    CharSequence getDescription() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getDescription();
        }
        return null;
    }

    LiveData<CharSequence> getFingerprintDialogHelpMessage() {
        MutableLiveData<CharSequence> mutableLiveData = this.mFingerprintDialogHelpMessage;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<CharSequence> mutableLiveData2 = new MutableLiveData<>();
        this.mFingerprintDialogHelpMessage = mutableLiveData2;
        return mutableLiveData2;
    }

    int getFingerprintDialogPreviousState() {
        return this.mFingerprintDialogPreviousState;
    }

    LiveData<Integer> getFingerprintDialogState() {
        MutableLiveData<Integer> mutableLiveData = this.mFingerprintDialogState;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.mFingerprintDialogState = mutableLiveData2;
        return mutableLiveData2;
    }

    int getInferredAuthenticationResultType() {
        int allowedAuthenticators = getAllowedAuthenticators();
        return (!AuthenticatorUtils.isSomeBiometricAllowed(allowedAuthenticators) || AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators)) ? -1 : 2;
    }

    Bitmap getLogoBitmap() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getLogoBitmap();
        }
        return null;
    }

    String getLogoDescription() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getLogoDescription();
        }
        return null;
    }

    int getLogoRes() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getLogoRes();
        }
        return -1;
    }

    DialogInterface.OnClickListener getMoreOptionsButtonListener() {
        if (this.mMoreOptionsButtonListener == null) {
            this.mMoreOptionsButtonListener = new MoreOptionsButtonListener(this);
        }
        return this.mMoreOptionsButtonListener;
    }

    DialogInterface.OnClickListener getNegativeButtonListener() {
        if (this.mNegativeButtonListener == null) {
            this.mNegativeButtonListener = new NegativeButtonListener(this);
        }
        return this.mNegativeButtonListener;
    }

    CharSequence getNegativeButtonText() {
        CharSequence charSequence = this.mNegativeButtonTextOverride;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getNegativeButtonText();
        }
        return null;
    }

    CharSequence getSubtitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getSubtitle();
        }
        return null;
    }

    CharSequence getTitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getTitle();
        }
        return null;
    }

    LiveData<Boolean> isAuthenticationFailurePending() {
        MutableLiveData<Boolean> mutableLiveData = this.mIsAuthenticationFailurePending;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.mIsAuthenticationFailurePending = mutableLiveData2;
        return mutableLiveData2;
    }

    boolean isAwaitingResult() {
        return this.mIsAwaitingResult;
    }

    boolean isConfirmationRequired() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        return promptInfo == null || promptInfo.isConfirmationRequired();
    }

    boolean isConfirmingDeviceCredential() {
        return this.mIsConfirmingDeviceCredential;
    }

    boolean isDelayingPrompt() {
        return this.mIsDelayingPrompt;
    }

    LiveData<Boolean> isFingerprintDialogCancelPending() {
        MutableLiveData<Boolean> mutableLiveData = this.mIsFingerprintDialogCancelPending;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.mIsFingerprintDialogCancelPending = mutableLiveData2;
        return mutableLiveData2;
    }

    boolean isFingerprintDialogDismissedInstantly() {
        return this.mIsFingerprintDialogDismissedInstantly;
    }

    boolean isIgnoringCancel() {
        return this.mIsIgnoringCancel;
    }

    LiveData<Boolean> isMoreOptionsButtonPressPending() {
        MutableLiveData<Boolean> mutableLiveData = this.mIsMoreOptionsButtonPressPending;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.mIsMoreOptionsButtonPressPending = mutableLiveData2;
        return mutableLiveData2;
    }

    LiveData<Boolean> isNegativeButtonPressPending() {
        MutableLiveData<Boolean> mutableLiveData = this.mIsNegativeButtonPressPending;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.mIsNegativeButtonPressPending = mutableLiveData2;
        return mutableLiveData2;
    }

    boolean isPromptShowing() {
        return this.mIsPromptShowing;
    }

    boolean isUsingKeyguardManagerForBiometricAndCredential() {
        return this.mIsUsingKeyguardManagerForBiometricAndCredential;
    }

    public void resetClientCallback() {
        this.mClientCallback = null;
    }

    void setAuthenticationError(BiometricErrorData biometricErrorData) {
        MutableLiveData<BiometricErrorData> mutableLiveData = this.mAuthenticationError;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mAuthenticationError = mutableLiveData;
        }
        updateValue(mutableLiveData, biometricErrorData);
    }

    void setAuthenticationFailurePending(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.mIsAuthenticationFailurePending;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mIsAuthenticationFailurePending = mutableLiveData;
        }
        updateValue(mutableLiveData, Boolean.valueOf(z));
    }

    void setAuthenticationHelpMessage(CharSequence charSequence) {
        MutableLiveData<CharSequence> mutableLiveData = this.mAuthenticationHelpMessage;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mAuthenticationHelpMessage = mutableLiveData;
        }
        updateValue(mutableLiveData, charSequence);
    }

    void setAuthenticationResult(BiometricPrompt.AuthenticationResult authenticationResult) {
        MutableLiveData<BiometricPrompt.AuthenticationResult> mutableLiveData = this.mAuthenticationResult;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mAuthenticationResult = mutableLiveData;
        }
        updateValue(mutableLiveData, authenticationResult);
    }

    void setAwaitingResult(boolean z) {
        this.mIsAwaitingResult = z;
    }

    void setCanceledFrom(int i2) {
        this.mCanceledFrom = i2;
    }

    public void setClientCallback(BiometricPrompt.AuthenticationCallback authenticationCallback) {
        this.mClientCallback = authenticationCallback;
    }

    public void setClientExecutor(Executor executor) {
        this.mClientExecutor = executor;
    }

    void setConfirmingDeviceCredential(boolean z) {
        this.mIsConfirmingDeviceCredential = z;
    }

    void setCryptoObject(BiometricPrompt.CryptoObject cryptoObject) {
        this.mCryptoObject = cryptoObject;
        if (Build.VERSION.SDK_INT < 30 && AuthenticatorUtils.isAtLeastStrength(this.mPromptInfo.getAllowedAuthenticators(), 15) && cryptoObject == null) {
            this.mCryptoObject = CryptoObjectUtils.createFakeCryptoObject();
        }
        updateConsolidatedAuthenticators();
    }

    void setDelayingPrompt(boolean z) {
        this.mIsDelayingPrompt = z;
    }

    void setFingerprintDialogCancelPending(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.mIsFingerprintDialogCancelPending;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mIsFingerprintDialogCancelPending = mutableLiveData;
        }
        updateValue(mutableLiveData, Boolean.valueOf(z));
    }

    void setFingerprintDialogDismissedInstantly(boolean z) {
        this.mIsFingerprintDialogDismissedInstantly = z;
    }

    void setFingerprintDialogHelpMessage(CharSequence charSequence) {
        MutableLiveData<CharSequence> mutableLiveData = this.mFingerprintDialogHelpMessage;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mFingerprintDialogHelpMessage = mutableLiveData;
        }
        updateValue(mutableLiveData, charSequence);
    }

    void setFingerprintDialogPreviousState(int i2) {
        this.mFingerprintDialogPreviousState = i2;
    }

    void setFingerprintDialogState(int i2) {
        MutableLiveData<Integer> mutableLiveData = this.mFingerprintDialogState;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mFingerprintDialogState = mutableLiveData;
        }
        updateValue(mutableLiveData, Integer.valueOf(i2));
    }

    void setIgnoringCancel(boolean z) {
        this.mIsIgnoringCancel = z;
    }

    void setIsIdentityCheckAvailable(boolean z) {
        this.mIsIdentityCheckAvailable = z;
        updateConsolidatedAuthenticators();
    }

    void setMoreOptionsButtonPressPending(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.mIsMoreOptionsButtonPressPending;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mIsMoreOptionsButtonPressPending = mutableLiveData;
        }
        updateValue(mutableLiveData, Boolean.valueOf(z));
    }

    void setNegativeButtonPressPending(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.mIsNegativeButtonPressPending;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mIsNegativeButtonPressPending = mutableLiveData;
        }
        updateValue(mutableLiveData, Boolean.valueOf(z));
    }

    void setNegativeButtonTextOverride(CharSequence charSequence) {
        this.mNegativeButtonTextOverride = charSequence;
    }

    void setPromptInfo(BiometricPrompt.PromptInfo promptInfo) {
        this.mPromptInfo = promptInfo;
        updateConsolidatedAuthenticators();
    }

    void setPromptShowing(boolean z) {
        this.mIsPromptShowing = z;
    }

    void setUsingKeyguardManagerForBiometricAndCredential(boolean z) {
        this.mIsUsingKeyguardManagerForBiometricAndCredential = z;
    }
}
