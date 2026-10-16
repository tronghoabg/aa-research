package androidx.biometric.internal.viewmodel;

import androidx.biometric.internal.FingerprintManagerCompat;
import androidx.biometric.internal.ui.FingerprintDialogState;
import androidx.lifecycle.ViewModel;
import com.waze.R;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;
import h.g.b.o;
import h.g.b.u;
import h.g.b.x;
import h.k;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FingerprintDialogViewModel extends ViewModel {
    private final bn<Integer> _drawableResId;
    private final bn<k<CharSequence, Boolean>> _helpMessage;
    private final bn<Boolean> _isCancelPending;
    private FingerprintDialogState _previousState;
    private final bn<Boolean> _shouldAnimateIcon;
    private final bn<FingerprintDialogState> _state;
    private final ch<Integer> drawableResId;
    private final l<FingerprintManagerCompat, Integer> fingerprintPreAuthChecker;
    private final ch<k<CharSequence, Boolean>> helpMessageInfo;
    private final kotlinx.coroutines.b.k<Boolean> isCancelPending;
    private boolean isDismissedInstantly;
    private final ch<Boolean> shouldAnimateIcon;
    private final ch<FingerprintDialogState> state;

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends u implements l<FingerprintManagerCompat, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, FingerprintDialogViewModelKt.class, "checkForFingerprintPreAuthenticationErrors", "checkForFingerprintPreAuthenticationErrors(Landroidx/biometric/internal/FingerprintManagerCompat;)I", 1);
        }

        @Override // h.g.a.l
        public final Integer invoke(FingerprintManagerCompat fingerprintManagerCompat) {
            x.f(fingerprintManagerCompat, "p0");
            return Integer.valueOf(FingerprintDialogViewModelKt.checkForFingerprintPreAuthenticationErrors(fingerprintManagerCompat));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FingerprintDialogViewModel(l<? super FingerprintManagerCompat, Integer> lVar) {
        x.f(lVar, "fingerprintPreAuthChecker");
        this.fingerprintPreAuthChecker = lVar;
        this.isDismissedInstantly = true;
        bn<Boolean> bnVarB = ck.b(false);
        this._isCancelPending = bnVarB;
        final bn<Boolean> bnVar = bnVarB;
        this.isCancelPending = new kotlinx.coroutines.b.k<Boolean>() { // from class: androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements kotlinx.coroutines.b.l {
                final /* synthetic */ kotlinx.coroutines.b.l $this_unsafeFlow;

                /* compiled from: WazeSource */
                /* renamed from: androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.b.l lVar) {
                    this.$this_unsafeFlow = lVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1$2$1 r0 = (androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1$2$1 r0 = new androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        e.b.c.b(r6)
                        goto L49
                    L27:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L2f:
                        e.b.c.b(r6)
                        kotlinx.coroutines.b.l r4 = r4.$this_unsafeFlow
                        r6 = r0
                        h.c.e r6 = (h.c.e) r6
                        r6 = r5
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        if (r6 == 0) goto L49
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L49
                        return r1
                    L49:
                        h.ab r4 = h.ab.f48028a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.internal.viewmodel.FingerprintDialogViewModel$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(kotlinx.coroutines.b.l<? super Boolean> lVar2, e eVar) {
                Object objCollect = bnVar.collect(new AnonymousClass2(lVar2), eVar);
                return objCollect == a.f48038a ? objCollect : ab.f48028a;
            }
        };
        FingerprintDialogState fingerprintDialogState = FingerprintDialogState.NONE;
        this._previousState = fingerprintDialogState;
        bn<FingerprintDialogState> bnVarB2 = ck.b(fingerprintDialogState);
        this._state = bnVarB2;
        this.state = bnVarB2;
        bn<k<CharSequence, Boolean>> bnVarB3 = ck.b(new k("", false));
        this._helpMessage = bnVarB3;
        this.helpMessageInfo = bnVarB3;
        bn<Integer> bnVarB4 = ck.b(0);
        this._drawableResId = bnVarB4;
        this.drawableResId = bnVarB4;
        bn<Boolean> bnVarB5 = ck.b(false);
        this._shouldAnimateIcon = bnVarB5;
        this.shouldAnimateIcon = bnVarB5;
    }

    private final int getAssetForTransition(FingerprintDialogState fingerprintDialogState, FingerprintDialogState fingerprintDialogState2) {
        if (fingerprintDialogState == FingerprintDialogState.NONE && fingerprintDialogState2 == FingerprintDialogState.FINGERPRINT) {
            return R.drawable.fingerprint_dialog_fp_icon;
        }
        FingerprintDialogState fingerprintDialogState3 = FingerprintDialogState.FINGERPRINT;
        if (fingerprintDialogState == fingerprintDialogState3 && fingerprintDialogState2 == FingerprintDialogState.FINGERPRINT_ERROR) {
            return R.drawable.fingerprint_dialog_error;
        }
        if (fingerprintDialogState == FingerprintDialogState.FINGERPRINT_ERROR && fingerprintDialogState2 == fingerprintDialogState3) {
            return R.drawable.fingerprint_dialog_fp_icon;
        }
        if (fingerprintDialogState == fingerprintDialogState3 && fingerprintDialogState2 == FingerprintDialogState.FINGERPRINT_AUTHENTICATED) {
            return R.drawable.fingerprint_dialog_fp_icon;
        }
        return 0;
    }

    private final boolean shouldAnimateForTransition(FingerprintDialogState fingerprintDialogState, FingerprintDialogState fingerprintDialogState2) {
        if (fingerprintDialogState == FingerprintDialogState.NONE && fingerprintDialogState2 == FingerprintDialogState.FINGERPRINT) {
            return false;
        }
        FingerprintDialogState fingerprintDialogState3 = FingerprintDialogState.FINGERPRINT;
        if (fingerprintDialogState == fingerprintDialogState3 && fingerprintDialogState2 == FingerprintDialogState.FINGERPRINT_ERROR) {
            return true;
        }
        if (fingerprintDialogState == FingerprintDialogState.FINGERPRINT_ERROR && fingerprintDialogState2 == fingerprintDialogState3) {
            return true;
        }
        if (fingerprintDialogState == fingerprintDialogState3) {
            FingerprintDialogState fingerprintDialogState4 = FingerprintDialogState.FINGERPRINT_AUTHENTICATED;
        }
        return false;
    }

    public final ch<Integer> getDrawableResId() {
        return this.drawableResId;
    }

    public final l<FingerprintManagerCompat, Integer> getFingerprintPreAuthChecker() {
        return this.fingerprintPreAuthChecker;
    }

    public final ch<k<CharSequence, Boolean>> getHelpMessageInfo() {
        return this.helpMessageInfo;
    }

    public final FingerprintDialogState getPreviousState() {
        return this._previousState;
    }

    public final ch<Boolean> getShouldAnimateIcon() {
        return this.shouldAnimateIcon;
    }

    public final ch<FingerprintDialogState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.b.k<Boolean> isCancelPending() {
        return this.isCancelPending;
    }

    public final boolean isDismissedInstantly() {
        return this.isDismissedInstantly;
    }

    public final void resetState(CharSequence charSequence) {
        x.f(charSequence, "defaultHelpMessage");
        this._previousState = FingerprintDialogState.NONE;
        setState(FingerprintDialogState.FINGERPRINT, charSequence);
    }

    public final void setCancelPending(boolean z) {
        this._isCancelPending.e(Boolean.valueOf(z));
    }

    public final void setDismissedInstantly(boolean z) {
        this.isDismissedInstantly = z;
    }

    public final void setState(FingerprintDialogState fingerprintDialogState, CharSequence charSequence) {
        x.f(fingerprintDialogState, "newState");
        x.f(charSequence, "newHelpMessage");
        this._state.e(fingerprintDialogState);
        this._helpMessage.e(new k(charSequence, Boolean.valueOf(fingerprintDialogState == FingerprintDialogState.FINGERPRINT_ERROR)));
        this._drawableResId.e(Integer.valueOf(getAssetForTransition(getPreviousState(), fingerprintDialogState)));
        this._shouldAnimateIcon.e(Boolean.valueOf(shouldAnimateForTransition(getPreviousState(), fingerprintDialogState)));
        this._previousState = fingerprintDialogState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FingerprintDialogViewModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FingerprintDialogViewModel(AnonymousClass1 anonymousClass1, int i2, o oVar) {
        this((i2 & 1) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }
}
