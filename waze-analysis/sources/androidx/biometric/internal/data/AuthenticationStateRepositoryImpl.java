package androidx.biometric.internal.data;

import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.utils.BiometricErrorData;
import androidx.biometric.utils.CancellationSignalProvider;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationStateRepositoryImpl implements AuthenticationStateRepository {
    private final bm<BiometricErrorData> _authenticationError;
    private final bm<CharSequence> _authenticationHelpMessage;
    private final bm<BiometricPrompt.AuthenticationResult> _authenticationResult;
    private final bm<ab> _isAuthenticationFailurePending;
    private final bm<AuthenticationRequest.Biometric.Fallback.CustomOption> _isFallbackOptionPressPending;
    private final bm<ab> _isMoreOptionsButtonPressPending;
    private final bm<ab> _isNegativeButtonPressPending;
    private final k<BiometricErrorData> authenticationError;
    private final bq<CharSequence> authenticationHelpMessage;
    private final k<BiometricPrompt.AuthenticationResult> authenticationResult;
    private CanceledFrom canceledFrom = CanceledFrom.INTERNAL;
    private final f cancellationSignalProvider$delegate = g.a(new a() { // from class: androidx.biometric.internal.data.AuthenticationStateRepositoryImpl$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return AuthenticationStateRepositoryImpl.cancellationSignalProvider_delegate$lambda$0();
        }
    });
    private final bq<ab> isAuthenticationFailurePending;
    private boolean isAwaitingResult;
    private final bq<AuthenticationRequest.Biometric.Fallback.CustomOption> isFallbackOptionPressPending;
    private boolean isIgnoringCancel;
    private final bq<ab> isMoreOptionsButtonPressPending;
    private final bq<ab> isNegativeButtonPressPending;

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.data.AuthenticationStateRepositoryImpl$setDelayedIgnoringCancel$1, reason: invalid class name */
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
            return AuthenticationStateRepositoryImpl.this.setDelayedIgnoringCancel(false, 0L, this);
        }
    }

    public AuthenticationStateRepositoryImpl() {
        bm<BiometricPrompt.AuthenticationResult> bmVarE = bu.e(0, 0, null, 7);
        this._authenticationResult = bmVarE;
        this.authenticationResult = ai.D(ai.S(bmVarE));
        bm<BiometricErrorData> bmVarE2 = bu.e(0, 0, null, 7);
        this._authenticationError = bmVarE2;
        this.authenticationError = ai.D(ai.S(bmVarE2));
        bm<CharSequence> bmVarE3 = bu.e(0, 0, null, 7);
        this._authenticationHelpMessage = bmVarE3;
        this.authenticationHelpMessage = ai.S(bmVarE3);
        bm<ab> bmVarE4 = bu.e(0, 0, null, 7);
        this._isAuthenticationFailurePending = bmVarE4;
        this.isAuthenticationFailurePending = ai.S(bmVarE4);
        bm<ab> bmVarE5 = bu.e(0, 0, null, 7);
        this._isNegativeButtonPressPending = bmVarE5;
        this.isNegativeButtonPressPending = ai.S(bmVarE5);
        bm<AuthenticationRequest.Biometric.Fallback.CustomOption> bmVarE6 = bu.e(0, 0, null, 7);
        this._isFallbackOptionPressPending = bmVarE6;
        this.isFallbackOptionPressPending = ai.S(bmVarE6);
        bm<ab> bmVarE7 = bu.e(0, 0, null, 7);
        this._isMoreOptionsButtonPressPending = bmVarE7;
        this.isMoreOptionsButtonPressPending = ai.S(bmVarE7);
    }

    static final CancellationSignalProvider cancellationSignalProvider_delegate$lambda$0() {
        return new CancellationSignalProvider();
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public k<BiometricErrorData> getAuthenticationError() {
        return this.authenticationError;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public k<BiometricPrompt.AuthenticationResult> getAuthenticationResult() {
        return this.authenticationResult;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public CanceledFrom getCanceledFrom() {
        return this.canceledFrom;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public CancellationSignalProvider getCancellationSignalProvider() {
        return (CancellationSignalProvider) this.cancellationSignalProvider$delegate.getValue();
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public boolean isAwaitingResult() {
        return this.isAwaitingResult;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public boolean isIgnoringCancel() {
        return this.isIgnoringCancel;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public Object setAuthenticationError(BiometricErrorData biometricErrorData, e<? super ab> eVar) {
        Object objEmit = this._authenticationError.emit(biometricErrorData, eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : ab.f48028a;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public Object setAuthenticationFailurePending(e<? super ab> eVar) {
        bm<ab> bmVar = this._isAuthenticationFailurePending;
        ab abVar = ab.f48028a;
        Object objEmit = bmVar.emit(abVar, eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : abVar;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public Object setAuthenticationHelpMessage(CharSequence charSequence, e<? super ab> eVar) {
        Object objEmit = this._authenticationHelpMessage.emit(charSequence, eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : ab.f48028a;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public Object setAuthenticationResult(BiometricPrompt.AuthenticationResult authenticationResult, e<? super ab> eVar) {
        Object objEmit = this._authenticationResult.emit(authenticationResult, eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : ab.f48028a;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public void setAwaitingResult(boolean z) {
        this.isAwaitingResult = z;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public void setCanceledFrom(CanceledFrom canceledFrom) {
        x.f(canceledFrom, "<set-?>");
        this.canceledFrom = canceledFrom;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setDelayedIgnoringCancel(boolean r5, long r6, h.c.e<? super h.ab> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.biometric.internal.data.AuthenticationStateRepositoryImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.biometric.internal.data.AuthenticationStateRepositoryImpl$setDelayedIgnoringCancel$1 r0 = (androidx.biometric.internal.data.AuthenticationStateRepositoryImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.biometric.internal.data.AuthenticationStateRepositoryImpl$setDelayedIgnoringCancel$1 r0 = new androidx.biometric.internal.data.AuthenticationStateRepositoryImpl$setDelayedIgnoringCancel$1
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
            r4.setIgnoringCancel(r5)
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.internal.data.AuthenticationStateRepositoryImpl.setDelayedIgnoringCancel(boolean, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public Object setFallbackOptionPressPending(AuthenticationRequest.Biometric.Fallback.CustomOption customOption, e<? super ab> eVar) {
        Object objEmit = this._isFallbackOptionPressPending.emit(customOption, eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : ab.f48028a;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public void setIgnoringCancel(boolean z) {
        this.isIgnoringCancel = z;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public Object setMoreOptionsButtonPressPending(e<? super ab> eVar) {
        bm<ab> bmVar = this._isMoreOptionsButtonPressPending;
        ab abVar = ab.f48028a;
        Object objEmit = bmVar.emit(abVar, eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : abVar;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public Object setNegativeButtonPressPending(e<? super ab> eVar) {
        bm<ab> bmVar = this._isNegativeButtonPressPending;
        ab abVar = ab.f48028a;
        Object objEmit = bmVar.emit(abVar, eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : abVar;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public bq<CharSequence> getAuthenticationHelpMessage() {
        return this.authenticationHelpMessage;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public bq<ab> isAuthenticationFailurePending() {
        return this.isAuthenticationFailurePending;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public bq<AuthenticationRequest.Biometric.Fallback.CustomOption> isFallbackOptionPressPending() {
        return this.isFallbackOptionPressPending;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public bq<ab> isMoreOptionsButtonPressPending() {
        return this.isMoreOptionsButtonPressPending;
    }

    @Override // androidx.biometric.internal.data.AuthenticationStateRepository
    public bq<ab> isNegativeButtonPressPending() {
        return this.isNegativeButtonPressPending;
    }
}
