package androidx.biometric;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.support.v4.app.ar;
import android.support.v4.app.av;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.AuthenticationRequest;
import androidx.biometric.internal.AuthenticationHandler;
import androidx.biometric.internal.BiometricFragment;
import androidx.biometric.internal.BiometricViewModel;
import androidx.biometric.internal.data.CanceledFrom;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.biometric.internal.viewmodel.AuthenticationViewModelFactory;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.CryptoObjectUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import h.g.b.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class BiometricPrompt implements BiometricConstants {
    static final String BIOMETRIC_FRAGMENT_TAG = "androidx.biometric.internal.BiometricFragment";
    private static final String TAG = "BiometricPromptCompat";
    private bv mClientFragmentManager;
    private AuthenticationHandler mHelper;
    private boolean mHostedInActivity;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthenticationError {
    }

    /* compiled from: WazeSource */
    public class AuthenticationResult {
        private final int mAuthenticationType;
        private final CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject cryptoObject, int i2) {
            this.mCryptoObject = cryptoObject;
            this.mAuthenticationType = i2;
        }

        public int getAuthenticationType() {
            return this.mAuthenticationType;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthenticationResultType {
    }

    /* compiled from: WazeSource */
    public class LifecycleContainer {
        private final Lifecycle mLifecycle;
        private final List<LifecycleEventObserver> mObservers = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            this.mLifecycle = lifecycle;
        }

        public void addObserver(LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle.addObserver(lifecycleEventObserver);
            this.mObservers.add(lifecycleEventObserver);
        }

        public void clearObservers() {
            Iterator<LifecycleEventObserver> it = this.mObservers.iterator();
            while (it.hasNext()) {
                this.mLifecycle.removeObserver(it.next());
            }
            this.mObservers.clear();
        }
    }

    /* compiled from: WazeSource */
    public class PromptInfo {
        private final int mAllowedAuthenticators;
        private final CharSequence mDescription;
        private final List<AuthenticationRequest.Biometric.Fallback> mFallbackOptionList;
        private final boolean mIsConfirmationRequired;
        private final boolean mIsDeviceCredentialAllowed;
        private final Bitmap mLogoBitmap;
        private final String mLogoDescription;
        private int mLogoRes;
        private final CharSequence mNegativeButtonText;
        private final PromptContentView mPromptContentView;
        private final CharSequence mSubtitle;
        private final CharSequence mTitle;

        /* compiled from: WazeSource */
        public class Builder {
            private int mLogoRes = -1;
            private Bitmap mLogoBitmap = null;
            private String mLogoDescription = null;
            private CharSequence mTitle = null;
            private CharSequence mSubtitle = null;
            private CharSequence mDescription = null;
            private PromptContentView mPromptContentView = null;
            private CharSequence mNegativeButtonText = null;
            private List<AuthenticationRequest.Biometric.Fallback> mFallbackOptionList = null;
            private boolean mIsConfirmationRequired = true;
            private boolean mIsDeviceCredentialAllowed = false;
            private int mAllowedAuthenticators = 0;

            public Builder addFallbackOption(AuthenticationRequest.Biometric.Fallback fallback) {
                if (this.mFallbackOptionList == null) {
                    this.mFallbackOptionList = new ArrayList();
                }
                this.mFallbackOptionList.add(fallback);
                return this;
            }

            public PromptInfo build() {
                if (TextUtils.isEmpty(this.mTitle)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                int i2 = this.mAllowedAuthenticators;
                if (AuthenticatorUtils.isSupportedCombination(i2)) {
                    return new PromptInfo(this.mLogoRes, this.mLogoBitmap, this.mLogoDescription, this.mTitle, this.mSubtitle, this.mDescription, this.mPromptContentView, this.mNegativeButtonText, this.mFallbackOptionList, this.mIsConfirmationRequired, this.mIsDeviceCredentialAllowed, i2);
                }
                throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + AuthenticatorUtils.convertToString(this.mAllowedAuthenticators));
            }

            public Builder setAllowedAuthenticators(int i2) {
                this.mAllowedAuthenticators = i2;
                return this;
            }

            public Builder setConfirmationRequired(boolean z) {
                this.mIsConfirmationRequired = z;
                return this;
            }

            public Builder setContentView(PromptContentView promptContentView) {
                this.mPromptContentView = promptContentView;
                return this;
            }

            public Builder setDescription(CharSequence charSequence) {
                this.mDescription = charSequence;
                return this;
            }

            @Deprecated
            public Builder setDeviceCredentialAllowed(boolean z) {
                this.mIsDeviceCredentialAllowed = z;
                return this;
            }

            public Builder setLogoBitmap(Bitmap bitmap) {
                this.mLogoBitmap = bitmap;
                return this;
            }

            public Builder setLogoDescription(String str) {
                this.mLogoDescription = str;
                return this;
            }

            public Builder setLogoRes(int i2) {
                this.mLogoRes = i2;
                return this;
            }

            public Builder setNegativeButtonText(CharSequence charSequence) {
                this.mNegativeButtonText = charSequence;
                return this;
            }

            public Builder setSubtitle(CharSequence charSequence) {
                this.mSubtitle = charSequence;
                return this;
            }

            public Builder setTitle(CharSequence charSequence) {
                this.mTitle = charSequence;
                return this;
            }
        }

        PromptInfo(int i2, Bitmap bitmap, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PromptContentView promptContentView, CharSequence charSequence4, List<AuthenticationRequest.Biometric.Fallback> list, boolean z, boolean z2, int i3) {
            this.mLogoRes = i2;
            this.mLogoBitmap = bitmap;
            this.mLogoDescription = str;
            this.mTitle = charSequence;
            this.mSubtitle = charSequence2;
            this.mDescription = charSequence3;
            this.mPromptContentView = promptContentView;
            this.mNegativeButtonText = charSequence4;
            this.mFallbackOptionList = list;
            this.mIsConfirmationRequired = z;
            this.mIsDeviceCredentialAllowed = z2;
            this.mAllowedAuthenticators = i3;
        }

        public int getAllowedAuthenticators() {
            return this.mAllowedAuthenticators;
        }

        public PromptContentView getContentView() {
            return this.mPromptContentView;
        }

        public CharSequence getDescription() {
            return this.mDescription;
        }

        public List<AuthenticationRequest.Biometric.Fallback> getFallbackOptionList() {
            List<AuthenticationRequest.Biometric.Fallback> list = this.mFallbackOptionList;
            if (list != null) {
                return new ArrayList(list);
            }
            return null;
        }

        public Bitmap getLogoBitmap() {
            return this.mLogoBitmap;
        }

        public String getLogoDescription() {
            return this.mLogoDescription;
        }

        public int getLogoRes() {
            return this.mLogoRes;
        }

        public CharSequence getNegativeButtonText() {
            CharSequence charSequence = this.mNegativeButtonText;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence getSubtitle() {
            return this.mSubtitle;
        }

        public CharSequence getTitle() {
            return this.mTitle;
        }

        public boolean isConfirmationRequired() {
            return this.mIsConfirmationRequired;
        }

        @Deprecated
        public boolean isDeviceCredentialAllowed() {
            return this.mIsDeviceCredentialAllowed;
        }
    }

    /* compiled from: WazeSource */
    class ResetCallbackObserver implements DefaultLifecycleObserver {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        ResetCallbackObserver(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            x.f(lifecycleOwner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().resetClientCallback();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            x.f(lifecycleOwner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            x.f(lifecycleOwner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            x.f(lifecycleOwner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            x.f(lifecycleOwner, "owner");
        }
    }

    public BiometricPrompt(ar arVar, Executor executor, AuthenticationCallback authenticationCallback) {
        if (arVar == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        bv childFragmentManager = arVar.getChildFragmentManager();
        addObservers(arVar, (BiometricViewModel) new ViewModelProvider(arVar).get(BiometricViewModel.class));
        init(false, childFragmentManager, arVar, authenticationCallback, executor);
    }

    private static void addObservers(ar arVar, BiometricViewModel biometricViewModel) {
        arVar.getLifecycle().addObserver(new ResetCallbackObserver(biometricViewModel));
    }

    private void authenticateInternal(PromptInfo promptInfo, CryptoObject cryptoObject) {
        AuthenticationHandler authenticationHandler = this.mHelper;
        if (authenticationHandler != null) {
            authenticationHandler.authenticate(promptInfo, cryptoObject);
            return;
        }
        bv bvVar = this.mClientFragmentManager;
        if (bvVar == null) {
            Log.e(TAG, "Unable to start authentication. Client fragment manager was null.");
        } else if (bvVar.aO()) {
            Log.e(TAG, "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            findOrAddBiometricFragment().authenticate(promptInfo, cryptoObject);
        }
    }

    private static BiometricFragment findBiometricFragment(bv bvVar) {
        return (BiometricFragment) bvVar.h(BIOMETRIC_FRAGMENT_TAG);
    }

    private BiometricFragment findOrAddBiometricFragment() {
        BiometricFragment biometricFragmentFindBiometricFragment = findBiometricFragment(this.mClientFragmentManager);
        if (biometricFragmentFindBiometricFragment != null) {
            return biometricFragmentFindBiometricFragment;
        }
        BiometricFragment biometricFragmentNewInstance = BiometricFragment.newInstance(this.mHostedInActivity);
        ch chVarU = this.mClientFragmentManager.u();
        chVarU.s(biometricFragmentNewInstance, BIOMETRIC_FRAGMENT_TAG);
        chVarU.l();
        this.mClientFragmentManager.aV();
        return biometricFragmentNewInstance;
    }

    public static BiometricViewModel getViewModel(ar arVar, boolean z) {
        ViewModelStoreOwner activity = z ? arVar.getActivity() : null;
        if (activity == null) {
            activity = arVar.getParentFragment();
        }
        if (activity != null) {
            return (BiometricViewModel) new ViewModelProvider(activity).get(BiometricViewModel.class);
        }
        throw new IllegalStateException("view model not found");
    }

    private void init(Context context, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, Runnable runnable, Executor executor, AuthenticationCallback authenticationCallback) {
        this.mHelper = AuthenticationHandler.CC.create(context, lifecycleOwner, (AuthenticationViewModel) new ViewModelProvider(viewModelStoreOwner, new AuthenticationViewModelFactory()).get(AuthenticationViewModel.class), runnable, executor, authenticationCallback);
    }

    public void authenticate(PromptInfo promptInfo, CryptoObject cryptoObject) {
        if (promptInfo == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cryptoObject == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject, false);
        if (AuthenticatorUtils.isWeakBiometricAllowed(consolidatedAuthenticators)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && AuthenticatorUtils.isDeviceCredentialAllowed(consolidatedAuthenticators)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        authenticateInternal(promptInfo, cryptoObject);
    }

    public void cancelAuthentication() {
        AuthenticationHandler authenticationHandler = this.mHelper;
        if (authenticationHandler != null) {
            authenticationHandler.cancelAuthentication(CanceledFrom.CLIENT);
            return;
        }
        bv bvVar = this.mClientFragmentManager;
        if (bvVar == null) {
            Log.e(TAG, "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        BiometricFragment biometricFragmentFindBiometricFragment = findBiometricFragment(bvVar);
        if (biometricFragmentFindBiometricFragment == null) {
            Log.e(TAG, "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            biometricFragmentFindBiometricFragment.cancelAuthentication(3);
        }
    }

    void destroy() {
        this.mClientFragmentManager = null;
    }

    /* compiled from: WazeSource */
    public abstract class AuthenticationCallback {
        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }

        public void onFallbackSelected(AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
        }

        public void onAuthenticationError(int i2, CharSequence charSequence) {
        }
    }

    /* compiled from: WazeSource */
    public class CryptoObject {
        private final Cipher mCipher;
        private final IdentityCredential mIdentityCredential;
        private final KeyAgreement mKeyAgreement;
        private final Mac mMac;
        private final long mOperationHandle;
        private final PresentationSession mPresentationSession;
        private final Signature mSignature;

        @Deprecated
        public CryptoObject(IdentityCredential identityCredential) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = null;
            this.mKeyAgreement = null;
            this.mIdentityCredential = identityCredential;
            this.mPresentationSession = null;
            this.mOperationHandle = 0L;
        }

        public Cipher getCipher() {
            return this.mCipher;
        }

        @Deprecated
        public IdentityCredential getIdentityCredential() {
            return this.mIdentityCredential;
        }

        public KeyAgreement getKeyAgreement() {
            return this.mKeyAgreement;
        }

        public Mac getMac() {
            return this.mMac;
        }

        public long getOperationHandle() {
            return CryptoObjectUtils.getOperationHandle(this);
        }

        public long getOperationHandleCryptoObject() {
            return this.mOperationHandle;
        }

        public PresentationSession getPresentationSession() {
            return this.mPresentationSession;
        }

        public Signature getSignature() {
            return this.mSignature;
        }

        public CryptoObject(long j2) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = null;
            this.mKeyAgreement = null;
            this.mIdentityCredential = null;
            this.mPresentationSession = null;
            this.mOperationHandle = j2;
        }

        public CryptoObject(PresentationSession presentationSession) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = null;
            this.mKeyAgreement = null;
            this.mIdentityCredential = null;
            this.mPresentationSession = presentationSession;
            this.mOperationHandle = 0L;
        }

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
            this.mKeyAgreement = null;
            this.mIdentityCredential = null;
            this.mPresentationSession = null;
            this.mOperationHandle = 0L;
        }

        public CryptoObject(Cipher cipher) {
            this.mSignature = null;
            this.mCipher = cipher;
            this.mMac = null;
            this.mKeyAgreement = null;
            this.mIdentityCredential = null;
            this.mPresentationSession = null;
            this.mOperationHandle = 0L;
        }

        public CryptoObject(KeyAgreement keyAgreement) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = null;
            this.mKeyAgreement = keyAgreement;
            this.mIdentityCredential = null;
            this.mPresentationSession = null;
            this.mOperationHandle = 0L;
        }

        public CryptoObject(Mac mac) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = mac;
            this.mKeyAgreement = null;
            this.mIdentityCredential = null;
            this.mPresentationSession = null;
            this.mOperationHandle = 0L;
        }
    }

    private void init(boolean z, bv bvVar, ViewModelStoreOwner viewModelStoreOwner, AuthenticationCallback authenticationCallback, Executor executor) {
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(viewModelStoreOwner).get(BiometricViewModel.class);
        this.mHostedInActivity = z;
        this.mClientFragmentManager = bvVar;
        if (executor != null) {
            biometricViewModel.setClientExecutor(executor);
        }
        biometricViewModel.setClientCallback(authenticationCallback);
    }

    public BiometricPrompt(ar arVar, AuthenticationCallback authenticationCallback) {
        if (arVar == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (authenticationCallback != null) {
            bv childFragmentManager = arVar.getChildFragmentManager();
            addObservers(arVar, (BiometricViewModel) new ViewModelProvider(arVar).get(BiometricViewModel.class));
            init(false, childFragmentManager, arVar, authenticationCallback, null);
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
    }

    public void authenticate(PromptInfo promptInfo) {
        if (promptInfo != null) {
            authenticateInternal(promptInfo, null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo cannot be null.");
    }

    public BiometricPrompt(Context context, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, Runnable runnable, Executor executor, AuthenticationCallback authenticationCallback) {
        init(context, lifecycleOwner, viewModelStoreOwner, runnable, executor, authenticationCallback);
    }

    public BiometricPrompt(av avVar, AuthenticationCallback authenticationCallback) {
        if (avVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (authenticationCallback != null) {
            init(true, avVar.bv(), avVar, authenticationCallback, null);
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
    }

    public BiometricPrompt(av avVar, Executor executor, AuthenticationCallback authenticationCallback) {
        if (avVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback != null) {
            init(true, avVar.bv(), avVar, authenticationCallback, executor);
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
    }
}
