package androidx.biometric.internal.data;

import android.os.Build;
import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.CryptoObjectUtils;
import h.a.i;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PromptConfigRepositoryImpl implements PromptConfigRepository {
    private int _allowedAuthenticators;
    private CharSequence _negativeButtonTextOverride;
    private BiometricPrompt.CryptoObject cryptoObject;
    private int currentAuthenticationKey;
    private boolean isConfirmingDeviceCredential;
    private boolean isDelayingPrompt;
    private boolean isIdentityCheckAvailable;
    private boolean isPromptShowing;
    private boolean isUsingKeyguardManagerForBiometricAndCredential;
    private BiometricPrompt.PromptInfo promptInfo;

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.data.PromptConfigRepositoryImpl$setDelayedDelayingPrompt$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PromptConfigRepositoryImpl.this.setDelayedDelayingPrompt(false, 0L, this);
        }
    }

    private final void updateConsolidatedAuthenticators() {
        if (getPromptInfo() == null) {
            return;
        }
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        x.c(promptInfo);
        this._allowedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, getCryptoObject(), isIdentityCheckAvailable());
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public int getAllowedAuthenticators() {
        return this._allowedAuthenticators;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public BiometricPrompt.CryptoObject getCryptoObject() {
        return this.cryptoObject;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public int getCurrentAuthenticationKey() {
        return this.currentAuthenticationKey;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public List<AuthenticationRequest.Biometric.Fallback> getFallbackOptionList() {
        CharSequence negativeButtonText;
        List<AuthenticationRequest.Biometric.Fallback> listD;
        CharSequence charSequence = this._negativeButtonTextOverride;
        if (charSequence != null && (listD = i.d(new AuthenticationRequest.Biometric.Fallback.OverriddenDeviceCredential(charSequence.toString()))) != null) {
            return listD;
        }
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null && (negativeButtonText = promptInfo.getNegativeButtonText()) != null) {
            if (negativeButtonText.length() == 0) {
                negativeButtonText = null;
            }
            if (negativeButtonText != null) {
                return i.d(new AuthenticationRequest.Biometric.Fallback.CustomOption(negativeButtonText.toString(), 0, 2, null));
            }
        }
        BiometricPrompt.PromptInfo promptInfo2 = getPromptInfo();
        List<AuthenticationRequest.Biometric.Fallback> fallbackOptionList = promptInfo2 != null ? promptInfo2.getFallbackOptionList() : null;
        return fallbackOptionList == null ? i.h() : fallbackOptionList;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public BiometricPrompt.PromptInfo getPromptInfo() {
        return this.promptInfo;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public boolean isConfirmingDeviceCredential() {
        return this.isConfirmingDeviceCredential;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public boolean isDelayingPrompt() {
        return this.isDelayingPrompt;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public boolean isIdentityCheckAvailable() {
        return this.isIdentityCheckAvailable;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public boolean isPromptShowing() {
        return this.isPromptShowing;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public boolean isUsingKeyguardManagerForBiometricAndCredential() {
        return this.isUsingKeyguardManagerForBiometricAndCredential;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setConfirmingDeviceCredential(boolean z) {
        this.isConfirmingDeviceCredential = z;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setCryptoObject(BiometricPrompt.CryptoObject cryptoObject) {
        this.cryptoObject = cryptoObject;
        if (Build.VERSION.SDK_INT < 30 && getPromptInfo() != null) {
            BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
            x.c(promptInfo);
            if (AuthenticatorUtils.isAtLeastStrength(promptInfo.getAllowedAuthenticators(), 15) && cryptoObject == null) {
                this.cryptoObject = CryptoObjectUtils.createFakeCryptoObject();
            }
        }
        updateConsolidatedAuthenticators();
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setCurrentAuthenticationKey(int i2) {
        this.currentAuthenticationKey = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.biometric.internal.data.PromptConfigRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setDelayedDelayingPrompt(boolean r5, long r6, h.c.e<? super h.ab> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.biometric.internal.data.PromptConfigRepositoryImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.biometric.internal.data.PromptConfigRepositoryImpl$setDelayedDelayingPrompt$1 r0 = (androidx.biometric.internal.data.PromptConfigRepositoryImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.biometric.internal.data.PromptConfigRepositoryImpl$setDelayedDelayingPrompt$1 r0 = new androidx.biometric.internal.data.PromptConfigRepositoryImpl$setDelayedDelayingPrompt$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r5 = r0.Z$0
            e.b.c.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            e.b.c.b(r8)
            r0.Z$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.aj.q(r6, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            r4.setDelayingPrompt(r5)
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.internal.data.PromptConfigRepositoryImpl.setDelayedDelayingPrompt(boolean, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setDelayingPrompt(boolean z) {
        this.isDelayingPrompt = z;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setIdentityCheckAvailable(boolean z) {
        this.isIdentityCheckAvailable = z;
        updateConsolidatedAuthenticators();
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setNegativeButtonTextOverride(CharSequence charSequence) {
        this._negativeButtonTextOverride = charSequence;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setPromptInfo(BiometricPrompt.PromptInfo promptInfo) {
        this.promptInfo = promptInfo;
        updateConsolidatedAuthenticators();
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setPromptShowing(boolean z) {
        this.isPromptShowing = z;
    }

    @Override // androidx.biometric.internal.data.PromptConfigRepository
    public void setUsingKeyguardManagerForBiometricAndCredential(boolean z) {
        this.isUsingKeyguardManagerForBiometricAndCredential = z;
    }
}
