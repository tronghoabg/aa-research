package androidx.biometric.internal;

import android.content.Context;
import android.os.Build;
import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.data.CanceledFrom;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.BiometricErrorData;
import androidx.biometric.utils.DeviceUtils;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationManager {
    private static final Companion Companion = new Companion(null);
    private static final int SHOW_PROMPT_DELAY_MS = 600;
    private br callbackObserverJob;
    private final BiometricPrompt.AuthenticationCallback clientAuthenticationCallback;
    private final Executor clientExecutor;
    private final Runnable confirmCredentialActivityLauncher;
    private final Context context;
    private boolean isAuthenticationPrepared;
    private boolean isInitialized;
    private final a<ab> isNegativeButtonPressPendingObserver;
    private final BiometricPrompt.LifecycleContainer lifecycleContainer;
    private final LifecycleOwner lifecycleOwner;
    private final a<ab> onDismissed;
    private AuthenticationResultDispatcher resultDispatcher;
    private AuthenticationUiStateObserver uiStateObserver;
    private final AuthenticationViewModel viewModel;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.AuthenticationManager$authenticate$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ a<ab> $showAuthentication;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a<ab> aVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$showAuthentication = aVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationManager.this.new AnonymousClass1(this.$showAuthentication, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(600L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            AuthenticationManager.this.showPromptForAuthentication(this.$showAuthentication);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.AuthenticationManager$connectCallbackObservers$1, reason: invalid class name and case insensitive filesystem */
    final class C01171 extends g implements p<af, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.biometric.internal.AuthenticationManager$connectCallbackObservers$1$1, reason: invalid class name and collision with other inner class name */
        final class C00021 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ AuthenticationManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00021(AuthenticationManager authenticationManager, e<? super C00021> eVar) {
                super(2, eVar);
                this.this$0 = authenticationManager;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00021(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00021) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    k<BiometricPrompt.AuthenticationResult> authenticationResult = this.this$0.getViewModel().getAuthenticationResult();
                    final AuthenticationManager authenticationManager = this.this$0;
                    this.label = 1;
                    if (authenticationResult.collect(new l() { // from class: androidx.biometric.internal.AuthenticationManager.connectCallbackObservers.1.1.1
                        public final Object emit(BiometricPrompt.AuthenticationResult authenticationResult2, e<? super ab> eVar) {
                            authenticationManager.getResultDispatcher().onAuthenticationSucceeded(authenticationResult2);
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
        /* renamed from: androidx.biometric.internal.AuthenticationManager$connectCallbackObservers$1$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ AuthenticationManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AuthenticationManager authenticationManager, e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.this$0 = authenticationManager;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass2(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    k<BiometricErrorData> authenticationError = this.this$0.getViewModel().getAuthenticationError();
                    final AuthenticationManager authenticationManager = this.this$0;
                    this.label = 1;
                    if (authenticationError.collect(new l() { // from class: androidx.biometric.internal.AuthenticationManager.connectCallbackObservers.1.2.1
                        public final Object emit(BiometricErrorData biometricErrorData, e<? super ab> eVar) {
                            authenticationManager.getResultDispatcher().onAuthenticationError(biometricErrorData.getErrorCode(), biometricErrorData.getErrorMessage());
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
        /* renamed from: androidx.biometric.internal.AuthenticationManager$connectCallbackObservers$1$3, reason: invalid class name */
        final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ AuthenticationManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AuthenticationManager authenticationManager, e<? super AnonymousClass3> eVar) {
                super(2, eVar);
                this.this$0 = authenticationManager;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass3(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    k<ab> kVarIsAuthenticationFailurePending = this.this$0.getViewModel().isAuthenticationFailurePending();
                    final AuthenticationManager authenticationManager = this.this$0;
                    this.label = 1;
                    if (kVarIsAuthenticationFailurePending.collect(new l() { // from class: androidx.biometric.internal.AuthenticationManager.connectCallbackObservers.1.3.1
                        public final Object emit(ab abVar, e<? super ab> eVar) {
                            authenticationManager.getResultDispatcher().onAuthenticationFailed();
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

        C01171(e<? super C01171> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C01171 c01171 = AuthenticationManager.this.new C01171(eVar);
            c01171.L$0 = obj;
            return c01171;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01171) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            aj.z(afVar, null, null, new C00021(AuthenticationManager.this, null), 3);
            aj.z(afVar, null, null, new AnonymousClass2(AuthenticationManager.this, null), 3);
            aj.z(afVar, null, null, new AnonymousClass3(AuthenticationManager.this, null), 3);
            return ab.f48028a;
        }
    }

    public AuthenticationManager(final Context context, LifecycleOwner lifecycleOwner, final AuthenticationViewModel authenticationViewModel, final Runnable runnable, final Executor executor, final BiometricPrompt.AuthenticationCallback authenticationCallback, a<ab> aVar) {
        x.f(context, "context");
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(authenticationViewModel, "viewModel");
        x.f(runnable, "confirmCredentialActivityLauncher");
        x.f(executor, "clientExecutor");
        x.f(authenticationCallback, "clientAuthenticationCallback");
        this.context = context;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = authenticationViewModel;
        this.confirmCredentialActivityLauncher = runnable;
        this.clientExecutor = executor;
        this.clientAuthenticationCallback = authenticationCallback;
        this.onDismissed = aVar;
        final a aVar2 = new a() { // from class: androidx.biometric.internal.AuthenticationManager$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationManager.resultDispatcher$lambda$0(this.f$0);
            }
        };
        this.resultDispatcher = new AuthenticationResultDispatcher(context, authenticationViewModel, executor, authenticationCallback, runnable, aVar2) { // from class: androidx.biometric.internal.AuthenticationManager$resultDispatcher$1
        };
        this.lifecycleContainer = new BiometricPrompt.LifecycleContainer(lifecycleOwner.getLifecycle());
        this.isNegativeButtonPressPendingObserver = new a() { // from class: androidx.biometric.internal.AuthenticationManager$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationManager.isNegativeButtonPressPendingObserver$lambda$0(this.f$0);
            }
        };
    }

    private final void connectCallbackObservers() {
        this.callbackObserverJob = aj.z(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new C01171(null), 3);
    }

    private final void disconnectCallbackObservers() {
        br brVar = this.callbackObserverJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.callbackObserverJob = null;
    }

    public static /* synthetic */ void initialize$default(AuthenticationManager authenticationManager, AuthenticationResultDispatcher authenticationResultDispatcher, AuthenticationUiStateObserver authenticationUiStateObserver, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            authenticationResultDispatcher = authenticationManager.resultDispatcher;
        }
        if ((i2 & 2) != 0) {
            authenticationUiStateObserver = authenticationManager.uiStateObserver;
        }
        authenticationManager.initialize(authenticationResultDispatcher, authenticationUiStateObserver);
    }

    static final void initialize$lambda$2(AuthenticationManager authenticationManager, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        x.f(lifecycleOwner, "owner");
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 1) {
            authenticationManager.startObservingAuth();
            return;
        }
        if (iOrdinal == 4) {
            if (!AuthenticationManagerKt.isPermanentlyRemoved(lifecycleOwner, event) || authenticationManager.viewModel.isConfirmingDeviceCredential()) {
                return;
            }
            authenticationManager.cancelAuthentication(CanceledFrom.INTERNAL);
            return;
        }
        if (iOrdinal != 5) {
            return;
        }
        authenticationManager.stopObservingAuth();
        authenticationManager.viewModel.resetHandlerKey();
        authenticationManager.lifecycleContainer.clearObservers();
    }

    static final ab isNegativeButtonPressPendingObserver$lambda$0(AuthenticationManager authenticationManager) {
        AuthenticationRequest.Biometric.Fallback singleFallbackOption = authenticationManager.viewModel.getSingleFallbackOption();
        if (singleFallbackOption instanceof AuthenticationRequest.Biometric.Fallback.OverriddenDeviceCredential) {
            authenticationManager.resultDispatcher.showKMAsFallback();
        } else if (singleFallbackOption instanceof AuthenticationRequest.Biometric.Fallback.DefaultCancel) {
            authenticationManager.resultDispatcher.onAuthenticationError(5, authenticationManager.context.getString(R.string.generic_error_user_canceled));
            authenticationManager.cancelAuthentication(CanceledFrom.USER);
        } else if (singleFallbackOption instanceof AuthenticationRequest.Biometric.Fallback.CustomOption) {
            AuthenticationResultDispatcher authenticationResultDispatcher = authenticationManager.resultDispatcher;
            AuthenticationRequest.Biometric.Fallback singleFallbackOption2 = authenticationManager.viewModel.getSingleFallbackOption();
            x.d(singleFallbackOption2, "null cannot be cast to non-null type androidx.biometric.AuthenticationRequest.Biometric.Fallback.CustomOption");
            authenticationResultDispatcher.sendFallbackOptionAndDismiss((AuthenticationRequest.Biometric.Fallback.CustomOption) singleFallbackOption2);
            authenticationManager.cancelAuthentication(CanceledFrom.NEGATIVE_BUTTON);
        }
        return ab.f48028a;
    }

    static final ab resultDispatcher$lambda$0(AuthenticationManager authenticationManager) {
        authenticationManager.dismiss();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPromptForAuthentication(a<ab> aVar) {
        aVar.invoke();
        this.viewModel.setPromptShowing(true);
        this.viewModel.setAwaitingResult(true);
    }

    private final void startObservingAuth() {
        if (this.isAuthenticationPrepared) {
            return;
        }
        this.isAuthenticationPrepared = true;
        connectCallbackObservers();
        AuthenticationUiStateObserver authenticationUiStateObserver = this.uiStateObserver;
        if (authenticationUiStateObserver != null) {
            authenticationUiStateObserver.connectObservers();
        }
        if (Build.VERSION.SDK_INT == 29 && AuthenticatorUtils.isDeviceCredentialAllowed(this.viewModel.getAllowedAuthenticators())) {
            this.viewModel.setIgnoringCancel(true);
            this.viewModel.setDelayedIgnoringCancel(false, 250L);
        }
    }

    private final void stopObservingAuth() {
        this.isAuthenticationPrepared = false;
        disconnectCallbackObservers();
        AuthenticationUiStateObserver authenticationUiStateObserver = this.uiStateObserver;
        if (authenticationUiStateObserver != null) {
            authenticationUiStateObserver.disconnectObservers();
        }
    }

    public final void authenticate(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject, a<ab> aVar) {
        x.f(promptInfo, "info");
        x.f(aVar, "showAuthentication");
        startObservingAuth();
        this.viewModel.setPromptInfo(promptInfo);
        this.viewModel.setIdentityCheckAvailable(BiometricManager.from(this.context).isIdentityCheckAvailable());
        this.viewModel.setCryptoObject(cryptoObject);
        this.viewModel.setCanceledFrom(CanceledFrom.INTERNAL);
        DefaultAuthenticationHandlerKt.isManagingDeviceCredentialButton(this.context, this.viewModel.getAllowedAuthenticators());
        this.viewModel.setNegativeButtonTextOverride(null);
        if (DefaultAuthenticationHandlerKt.isKeyguardManagerNeededForNoBiometric(this.context, this.viewModel.getAllowedAuthenticators())) {
            this.viewModel.setDelayingPrompt(false);
        }
        if (this.viewModel.isDelayingPrompt()) {
            aj.z(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass1(aVar, null), 3);
        } else {
            showPromptForAuthentication(aVar);
        }
    }

    public final void cancelAuthentication(CanceledFrom canceledFrom) {
        x.f(canceledFrom, "canceledFrom");
        if (canceledFrom == CanceledFrom.CLIENT || !this.viewModel.isIgnoringCancel()) {
            this.viewModel.setCanceledFrom(canceledFrom);
            this.viewModel.getCancellationSignalProvider().cancel();
        }
    }

    public final void dismiss() {
        this.viewModel.setPromptShowing(false);
        this.viewModel.setConfirmingDeviceCredential(false);
        if (DeviceUtils.shouldDelayShowingPrompt(this.context, Build.MODEL)) {
            this.viewModel.setDelayingPrompt(true);
            this.viewModel.setDelayedDelayingPrompt(false, 600L);
        }
        stopObservingAuth();
        a<ab> aVar = this.onDismissed;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final BiometricPrompt.AuthenticationCallback getClientAuthenticationCallback() {
        return this.clientAuthenticationCallback;
    }

    public final Executor getClientExecutor() {
        return this.clientExecutor;
    }

    public final Runnable getConfirmCredentialActivityLauncher() {
        return this.confirmCredentialActivityLauncher;
    }

    public final Context getContext() {
        return this.context;
    }

    public final BiometricPrompt.LifecycleContainer getLifecycleContainer() {
        return this.lifecycleContainer;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final AuthenticationResultDispatcher getResultDispatcher() {
        return this.resultDispatcher;
    }

    public final AuthenticationUiStateObserver getUiStateObserver() {
        return this.uiStateObserver;
    }

    public final AuthenticationViewModel getViewModel() {
        return this.viewModel;
    }

    public final void initialize(AuthenticationResultDispatcher authenticationResultDispatcher, AuthenticationUiStateObserver authenticationUiStateObserver) {
        if (authenticationResultDispatcher != null) {
            this.resultDispatcher = authenticationResultDispatcher;
        }
        if (authenticationUiStateObserver != null) {
            this.uiStateObserver = authenticationUiStateObserver;
        }
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.biometric.internal.AuthenticationManager$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                AuthenticationManager.initialize$lambda$2(this.f$0, lifecycleOwner, event);
            }
        });
    }

    public final a<ab> isNegativeButtonPressPendingObserver() {
        return this.isNegativeButtonPressPendingObserver;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ AuthenticationManager(Context context, LifecycleOwner lifecycleOwner, AuthenticationViewModel authenticationViewModel, Runnable runnable, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback, a aVar, int i2, o oVar) {
        this(context, lifecycleOwner, authenticationViewModel, runnable, executor, authenticationCallback, (i2 & 64) != 0 ? null : aVar);
    }
}
