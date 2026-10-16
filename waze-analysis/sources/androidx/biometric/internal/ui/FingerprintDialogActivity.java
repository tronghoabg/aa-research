package androidx.biometric.internal.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.FingerprintManagerCompat;
import androidx.biometric.internal.data.CanceledFrom;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.biometric.internal.viewmodel.AuthenticationViewModelFactory;
import androidx.biometric.internal.viewmodel.FingerprintDialogViewModel;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.BiometricErrorData;
import androidx.biometric.utils.CryptoObjectUtils;
import androidx.biometric.utils.ErrorUtils;
import androidx.core.content.ContextCompat;
import androidx.core.os.CancellationSignal;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import com.waze.R;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.f;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FingerprintDialogActivity extends ComponentActivity {
    public static final Companion Companion = new Companion(null);
    public static final long DISMISS_INSTANTLY_DELAY_MS = 500;
    public static final int HIDE_DIALOG_DELAY_MS = 2000;
    private static final long MESSAGE_DISPLAY_TIME_MS = 2000;
    private static final String TAG = "FingerprintDialogController";
    private static ViewModelProvider.Factory fingerprintDialogViewModelFactory;
    private final f authenticationViewModel$delegate;
    private int errorTextColor;
    private AlertDialog fingerprintDialog;
    private final f fingerprintDialogViewModel$delegate;
    private ImageView fingerprintIcon;
    private TextView helpMessageView;
    private int normalTextColor;
    private br resetDialogJob;

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                k<Boolean> kVarIsCancelPending = FingerprintDialogActivity.this.getFingerprintDialogViewModel().isCancelPending();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (kVarIsCancelPending.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.1.1
                    public final Object emit(boolean z, e<? super ab> eVar) {
                        if (z) {
                            fingerprintDialogActivity.cancelAuthentication(CanceledFrom.USER);
                            fingerprintDialogActivity.finish();
                        }
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit(((Boolean) obj2).booleanValue(), (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                ch<FingerprintDialogState> state = FingerprintDialogActivity.this.getFingerprintDialogViewModel().getState();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (state.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.2.1

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$2$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00071 extends g implements p<af, e<? super ab>, Object> {
                        int label;
                        final /* synthetic */ FingerprintDialogActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00071(FingerprintDialogActivity fingerprintDialogActivity, e<? super C00071> eVar) {
                            super(2, eVar);
                            this.this$0 = fingerprintDialogActivity;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new C00071(this.this$0, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((C00071) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            a aVar = a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (aj.q(2000L, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c.b(obj);
                            }
                            this.this$0.resetDialog();
                            this.this$0.resetDialogJob = null;
                            return ab.f48028a;
                        }
                    }

                    public final Object emit(FingerprintDialogState fingerprintDialogState, e<? super ab> eVar) {
                        if (fingerprintDialogActivity.getFingerprintDialogViewModel().getPreviousState() != FingerprintDialogState.NONE || fingerprintDialogState != FingerprintDialogState.FINGERPRINT) {
                            br brVar = fingerprintDialogActivity.resetDialogJob;
                            if (brVar != null) {
                                brVar.s(null);
                            }
                            FingerprintDialogActivity fingerprintDialogActivity2 = fingerprintDialogActivity;
                            fingerprintDialogActivity2.resetDialogJob = aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity2), null, null, new C00071(fingerprintDialogActivity, null), 3);
                        }
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((FingerprintDialogState) obj2, (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            throw new h.e();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass3(e<? super AnonymousClass3> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass3(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                ch<Integer> drawableResId = FingerprintDialogActivity.this.getFingerprintDialogViewModel().getDrawableResId();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (drawableResId.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.3.1
                    public final Object emit(int i3, e<? super ab> eVar) {
                        if (i3 != 0) {
                            Drawable drawable = ContextCompat.getDrawable(fingerprintDialogActivity, i3);
                            ImageView imageView = fingerprintDialogActivity.fingerprintIcon;
                            if (imageView != null) {
                                imageView.setImageDrawable(drawable);
                            }
                            if (((Boolean) fingerprintDialogActivity.getFingerprintDialogViewModel().getShouldAnimateIcon().d()).booleanValue() && drawable != null) {
                                Api21ImplForFm.INSTANCE.startAnimation(drawable);
                            }
                        }
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit(((Number) obj2).intValue(), (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            throw new h.e();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass4(e<? super AnonymousClass4> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass4(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                ch<h.k<CharSequence, Boolean>> helpMessageInfo = FingerprintDialogActivity.this.getFingerprintDialogViewModel().getHelpMessageInfo();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (helpMessageInfo.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.4.1
                    public final Object emit(h.k<? extends CharSequence, Boolean> kVar, e<? super ab> eVar) {
                        CharSequence charSequence = (CharSequence) kVar.a();
                        boolean zBooleanValue = ((Boolean) kVar.b()).booleanValue();
                        TextView textView = fingerprintDialogActivity.helpMessageView;
                        if (!x.n(textView != null ? textView.getText() : null, charSequence)) {
                            TextView textView2 = fingerprintDialogActivity.helpMessageView;
                            if (textView2 != null) {
                                textView2.setText(charSequence);
                            }
                            TextView textView3 = fingerprintDialogActivity.helpMessageView;
                            if (textView3 != null) {
                                FingerprintDialogActivity fingerprintDialogActivity2 = fingerprintDialogActivity;
                                textView3.setTextColor(zBooleanValue ? fingerprintDialogActivity2.errorTextColor : fingerprintDialogActivity2.normalTextColor);
                            }
                        }
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((h.k<? extends CharSequence, Boolean>) obj2, (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            throw new h.e();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$5, reason: invalid class name */
    final class AnonymousClass5 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass5(e<? super AnonymousClass5> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass5(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass5) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                k<CharSequence> authenticationHelpMessage = FingerprintDialogActivity.this.getAuthenticationViewModel().getAuthenticationHelpMessage();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (authenticationHelpMessage.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.5.1
                    public final Object emit(CharSequence charSequence, e<? super ab> eVar) {
                        if (charSequence != null) {
                            fingerprintDialogActivity.showFingerprintErrorMessage(charSequence);
                        }
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((CharSequence) obj2, (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$6, reason: invalid class name */
    final class AnonymousClass6 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass6(e<? super AnonymousClass6> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass6(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass6) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                k<ab> kVarIsNegativeButtonPressPending = FingerprintDialogActivity.this.getAuthenticationViewModel().isNegativeButtonPressPending();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (kVarIsNegativeButtonPressPending.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.6.1
                    public final Object emit(ab abVar, e<? super ab> eVar) {
                        fingerprintDialogActivity.finish();
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((ab) obj2, (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$7, reason: invalid class name */
    final class AnonymousClass7 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass7(e<? super AnonymousClass7> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass7(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass7) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                k<BiometricPrompt.AuthenticationResult> authenticationResult = FingerprintDialogActivity.this.getAuthenticationViewModel().getAuthenticationResult();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (authenticationResult.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.7.1
                    public final Object emit(BiometricPrompt.AuthenticationResult authenticationResult2, e<? super ab> eVar) {
                        fingerprintDialogActivity.finish();
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((BiometricPrompt.AuthenticationResult) obj2, (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$8, reason: invalid class name */
    final class AnonymousClass8 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass8(e<? super AnonymousClass8> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass8(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass8) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                k<BiometricErrorData> authenticationError = FingerprintDialogActivity.this.getAuthenticationViewModel().getAuthenticationError();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (authenticationError.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.8.1

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$8$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00081 extends g implements p<af, e<? super ab>, Object> {
                        int label;
                        final /* synthetic */ FingerprintDialogActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00081(FingerprintDialogActivity fingerprintDialogActivity, e<? super C00081> eVar) {
                            super(2, eVar);
                            this.this$0 = fingerprintDialogActivity;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new C00081(this.this$0, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((C00081) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            a aVar = a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                FingerprintDialogActivity fingerprintDialogActivity = this.this$0;
                                this.label = 1;
                                if (aj.q(2000L, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c.b(obj);
                            }
                            this.this$0.finish();
                            return ab.f48028a;
                        }
                    }

                    public final Object emit(BiometricErrorData biometricErrorData, e<? super ab> eVar) {
                        int knownErrorCodeForAuthenticate = ErrorUtils.toKnownErrorCodeForAuthenticate(biometricErrorData.getErrorCode());
                        if ((ErrorUtils.isLockoutError(knownErrorCodeForAuthenticate) && fingerprintDialogActivity.getAuthenticationViewModel().isOverriddenDeviceCredential()) || knownErrorCodeForAuthenticate == 5 || fingerprintDialogActivity.getFingerprintDialogViewModel().isDismissedInstantly()) {
                            fingerprintDialogActivity.finish();
                        } else {
                            fingerprintDialogActivity.showFingerprintErrorMessage(biometricErrorData.getErrorMessage());
                            aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new C00081(fingerprintDialogActivity, null), 3);
                        }
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((BiometricErrorData) obj2, (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$connectObservers$9, reason: invalid class name */
    final class AnonymousClass9 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass9(e<? super AnonymousClass9> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new AnonymousClass9(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass9) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                k<ab> kVarIsAuthenticationFailurePending = FingerprintDialogActivity.this.getAuthenticationViewModel().isAuthenticationFailurePending();
                final FingerprintDialogActivity fingerprintDialogActivity = FingerprintDialogActivity.this;
                this.label = 1;
                if (kVarIsAuthenticationFailurePending.collect(new l() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity.connectObservers.9.1
                    public final Object emit(ab abVar, e<? super ab> eVar) {
                        fingerprintDialogActivity.showFingerprintErrorMessage(fingerprintDialogActivity.getString(R.string.fingerprint_not_recognized));
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((ab) obj2, (e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.ui.FingerprintDialogActivity$showAlertDialog$1, reason: invalid class name and case insensitive filesystem */
    final class C01181 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C01181(e<? super C01181> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FingerprintDialogActivity.this.new C01181(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01181) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            FingerprintDialogActivity.this.getFingerprintDialogViewModel().setDismissedInstantly(false);
            return ab.f48028a;
        }
    }

    public FingerprintDialogActivity() {
        FingerprintDialogActivity fingerprintDialogActivity = this;
        h.g.a.a aVar = new h.g.a.a() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return FingerprintDialogActivity.fingerprintDialogViewModel_delegate$lambda$0(this.f$0);
            }
        };
        int i2 = ar.f48106a;
        this.fingerprintDialogViewModel$delegate = new ViewModelLazy(new m(FingerprintDialogViewModel.class), new FingerprintDialogActivity$special$$inlined$viewModels$default$2(fingerprintDialogActivity), aVar, new FingerprintDialogActivity$special$$inlined$viewModels$default$3(null, fingerprintDialogActivity));
        this.authenticationViewModel$delegate = new ViewModelLazy(new m(AuthenticationViewModel.class), new FingerprintDialogActivity$special$$inlined$viewModels$default$5(fingerprintDialogActivity), new h.g.a.a() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return FingerprintDialogActivity.authenticationViewModel_delegate$lambda$0();
            }
        }, new FingerprintDialogActivity$special$$inlined$viewModels$default$6(null, fingerprintDialogActivity));
    }

    private final void authenticateWithFingerprint(FingerprintManagerCompat fingerprintManagerCompat, Context context) {
        FingerprintManagerCompat.CryptoObject cryptoObjectWrapForFingerprintManager = CryptoObjectUtils.wrapForFingerprintManager(getAuthenticationViewModel().getCryptoObject());
        CancellationSignal fingerprintCancellationSignal = getAuthenticationViewModel().getCancellationSignalProvider().getFingerprintCancellationSignal();
        x.e(fingerprintCancellationSignal, "getFingerprintCancellationSignal(...)");
        try {
            fingerprintManagerCompat.authenticate(cryptoObjectWrapForFingerprintManager, 0, fingerprintCancellationSignal, getAuthenticationViewModel().getAuthenticationCallbackProvider().getFingerprintCallback(), (Handler) null);
        } catch (NullPointerException e2) {
            Log.e(TAG, "Got NPE while authenticating with fingerprint.", e2);
            getAuthenticationViewModel().setAuthenticationError(new BiometricErrorData(1, ErrorUtils.getFingerprintErrorString(this, 1)));
        }
    }

    static final ViewModelProvider.Factory authenticationViewModel_delegate$lambda$0() {
        return new AuthenticationViewModelFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAuthentication(CanceledFrom canceledFrom) {
        if (canceledFrom == CanceledFrom.USER) {
            getAuthenticationViewModel().setAuthenticationError(new BiometricErrorData(10, ErrorUtils.getFingerprintErrorString(this, 10)));
        }
        getAuthenticationViewModel().getCancellationSignalProvider().cancel();
    }

    private final void connectObservers() {
        FingerprintDialogActivity fingerprintDialogActivity = this;
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass1(null), 3);
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass2(null), 3);
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass3(null), 3);
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass4(null), 3);
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass5(null), 3);
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass6(null), 3);
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass7(null), 3);
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass8(null), 3);
        aj.z(LifecycleOwnerKt.getLifecycleScope(fingerprintDialogActivity), null, null, new AnonymousClass9(null), 3);
    }

    private final void destroyAlertDialog() {
        AlertDialog alertDialog = this.fingerprintDialog;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Exception e2) {
                Log.e(TAG, "Error dismissing fingerprint dialog", e2);
            } finally {
                this.fingerprintDialog = null;
            }
        }
        getFingerprintDialogViewModel().setDismissedInstantly(true);
    }

    static final ViewModelProvider.Factory fingerprintDialogViewModel_delegate$lambda$0(FingerprintDialogActivity fingerprintDialogActivity) {
        ViewModelProvider.Factory factory = fingerprintDialogViewModelFactory;
        return factory == null ? fingerprintDialogActivity.getDefaultViewModelProviderFactory() : factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthenticationViewModel getAuthenticationViewModel() {
        return (AuthenticationViewModel) this.authenticationViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FingerprintDialogViewModel getFingerprintDialogViewModel() {
        return (FingerprintDialogViewModel) this.fingerprintDialogViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetDialog() {
        FingerprintDialogViewModel fingerprintDialogViewModel = getFingerprintDialogViewModel();
        String string = getString(R.string.fingerprint_dialog_touch_sensor);
        x.e(string, "getString(...)");
        fingerprintDialogViewModel.resetState(string);
    }

    private final AlertDialog showAlertDialog() {
        aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01181(null), 3);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getAuthenticationViewModel().getTitle());
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence subtitle = getAuthenticationViewModel().getSubtitle();
            if (TextUtils.isEmpty(subtitle)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(subtitle);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            CharSequence description = getAuthenticationViewModel().getDescription();
            if (TextUtils.isEmpty(description)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(description);
            }
        }
        this.fingerprintIcon = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.helpMessageView = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        builder.setNegativeButton(AuthenticatorUtils.isDeviceCredentialAllowed(getAuthenticationViewModel().getAllowedAuthenticators()) ? getString(R.string.confirm_device_credential_password) : getAuthenticationViewModel().getSingleFallbackOptionText(), new DialogInterface.OnClickListener() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f$0.getAuthenticationViewModel().setNegativeButtonPressPending();
            }
        });
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        this.fingerprintDialog = alertDialogCreate;
        if (alertDialogCreate != null) {
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: androidx.biometric.internal.ui.FingerprintDialogActivity$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    FingerprintDialogActivity.showAlertDialog$lambda$1$0(this.f$0, dialogInterface);
                }
            });
            alertDialogCreate.show();
        }
        resetDialog();
        return this.fingerprintDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialog$lambda$1$0(FingerprintDialogActivity fingerprintDialogActivity, DialogInterface dialogInterface) {
        fingerprintDialogActivity.getFingerprintDialogViewModel().setCancelPending(true);
    }

    private final void showAuthentication() {
        FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(getApplicationContext());
        x.e(fingerprintManagerCompatFrom, "from(...)");
        int iIntValue = getFingerprintDialogViewModel().getFingerprintPreAuthChecker().invoke(fingerprintManagerCompatFrom).intValue();
        if (iIntValue != 0) {
            getAuthenticationViewModel().setAuthenticationError(new BiometricErrorData(iIntValue, ErrorUtils.getFingerprintErrorString(getApplicationContext(), iIntValue)));
            return;
        }
        getFingerprintDialogViewModel().setDismissedInstantly(true);
        Context applicationContext = getApplicationContext();
        x.e(applicationContext, "getApplicationContext(...)");
        authenticateWithFingerprint(fingerprintManagerCompatFrom, applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFingerprintErrorMessage(CharSequence charSequence) {
        if (charSequence == null) {
            String string = getString(R.string.default_error_msg);
            x.e(string, "getString(...)");
            charSequence = string;
        }
        getFingerprintDialogViewModel().setState(FingerprintDialogState.FINGERPRINT_ERROR, charSequence);
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FingerprintDialogActivity fingerprintDialogActivity = this;
        Api26Impl.INSTANCE.getColorErrorAttr();
        this.errorTextColor = FingerprintDialogActivityKt.getThemedColorFor(fingerprintDialogActivity, R.attr.colorError);
        this.normalTextColor = FingerprintDialogActivityKt.getThemedColorFor(fingerprintDialogActivity, android.R.attr.textColorSecondary);
        showAlertDialog();
        connectObservers();
        if (bundle == null) {
            showAuthentication();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        destroyAlertDialog();
        if (isChangingConfigurations()) {
            return;
        }
        cancelAuthentication(CanceledFrom.INTERNAL);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ViewModelProvider.Factory getFingerprintDialogViewModelFactory() {
            return FingerprintDialogActivity.fingerprintDialogViewModelFactory;
        }

        public final void setFingerprintDialogViewModelFactory(ViewModelProvider.Factory factory) {
            FingerprintDialogActivity.fingerprintDialogViewModelFactory = factory;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getFingerprintDialogViewModelFactory$annotations() {
        }
    }
}
