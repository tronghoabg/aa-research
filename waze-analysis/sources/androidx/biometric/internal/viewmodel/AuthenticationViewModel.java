package androidx.biometric.internal.viewmodel;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.PromptContentView;
import androidx.biometric.internal.data.AuthenticationStateRepository;
import androidx.biometric.internal.data.CanceledFrom;
import androidx.biometric.internal.data.PromptConfigRepository;
import androidx.biometric.utils.AuthenticationCallbackProvider;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.BiometricErrorData;
import androidx.biometric.utils.CancellationSignalProvider;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.f;
import h.g.a.p;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationViewModel extends ViewModel {
    private final AtomicInteger authHandlerKey;
    private final f authenticationCallbackProvider$delegate;
    private final AuthenticationStateRepository authenticationStateRepository;
    private final f moreOptionsButtonListener$delegate;
    private final f negativeButtonListener$delegate;
    private final PromptConfigRepository promptConfigRepository;

    /* compiled from: WazeSource */
    final class CallbackListener extends AuthenticationCallbackProvider.Listener {
        private final WeakReference<AuthenticationViewModel> viewModelRef;

        public CallbackListener(AuthenticationViewModel authenticationViewModel) {
            this.viewModelRef = new WeakReference<>(authenticationViewModel);
        }

        @Override // androidx.biometric.utils.AuthenticationCallbackProvider.Listener
        public void onError(int i2, CharSequence charSequence) {
            AuthenticationViewModel authenticationViewModel = this.viewModelRef.get();
            if (authenticationViewModel == null || authenticationViewModel.isConfirmingDeviceCredential() || !authenticationViewModel.isAwaitingResult()) {
                return;
            }
            authenticationViewModel.setAuthenticationError(new BiometricErrorData(i2, charSequence));
        }

        @Override // androidx.biometric.utils.AuthenticationCallbackProvider.Listener
        public void onFailure() {
            AuthenticationViewModel authenticationViewModel = this.viewModelRef.get();
            if (authenticationViewModel == null || !authenticationViewModel.isAwaitingResult()) {
                return;
            }
            authenticationViewModel.setAuthenticationFailurePending();
        }

        @Override // androidx.biometric.utils.AuthenticationCallbackProvider.Listener
        public void onHelp(CharSequence charSequence) {
            AuthenticationViewModel authenticationViewModel = this.viewModelRef.get();
            if (authenticationViewModel != null) {
                authenticationViewModel.setAuthenticationHelpMessage(charSequence);
            }
        }

        @Override // androidx.biometric.utils.AuthenticationCallbackProvider.Listener
        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
            x.f(authenticationResult, "result");
            AuthenticationViewModel authenticationViewModel = this.viewModelRef.get();
            if (authenticationViewModel == null || !authenticationViewModel.isAwaitingResult()) {
                return;
            }
            if (authenticationResult.getAuthenticationType() == -1) {
                authenticationResult = new BiometricPrompt.AuthenticationResult(authenticationResult.getCryptoObject(), authenticationViewModel.getInferredAuthenticationResultType());
            }
            authenticationViewModel.setAuthenticationResult(authenticationResult);
        }
    }

    /* compiled from: WazeSource */
    final class FallbackOptionListener implements DialogInterface.OnClickListener {
        private final AuthenticationRequest.Biometric.Fallback.CustomOption fallbackOption;
        private final WeakReference<AuthenticationViewModel> viewModelRef;

        public FallbackOptionListener(AuthenticationViewModel authenticationViewModel, AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
            x.f(customOption, "fallbackOption");
            this.fallbackOption = customOption;
            this.viewModelRef = new WeakReference<>(authenticationViewModel);
        }

        public final AuthenticationRequest.Biometric.Fallback.CustomOption getFallbackOption() {
            return this.fallbackOption;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AuthenticationViewModel authenticationViewModel = this.viewModelRef.get();
            if (authenticationViewModel != null) {
                authenticationViewModel.setFallbackOptionPressPending(this.fallbackOption);
            }
        }
    }

    /* compiled from: WazeSource */
    final class MoreOptionsButtonListener implements DialogInterface.OnClickListener {
        private final WeakReference<AuthenticationViewModel> viewModelRef;

        public MoreOptionsButtonListener(AuthenticationViewModel authenticationViewModel) {
            this.viewModelRef = new WeakReference<>(authenticationViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AuthenticationViewModel authenticationViewModel = this.viewModelRef.get();
            if (authenticationViewModel != null) {
                authenticationViewModel.setMoreOptionsButtonPressPending();
            }
        }
    }

    /* compiled from: WazeSource */
    final class NegativeButtonListener implements DialogInterface.OnClickListener {
        private final WeakReference<AuthenticationViewModel> viewModelRef;

        public NegativeButtonListener(AuthenticationViewModel authenticationViewModel) {
            this.viewModelRef = new WeakReference<>(authenticationViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AuthenticationViewModel authenticationViewModel = this.viewModelRef.get();
            if (authenticationViewModel != null) {
                authenticationViewModel.setNegativeButtonPressPending();
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setAuthenticationError$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ BiometricErrorData $authenticationError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BiometricErrorData biometricErrorData, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$authenticationError = biometricErrorData;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new AnonymousClass1(this.$authenticationError, eVar);
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
                AuthenticationViewModel authenticationViewModel = AuthenticationViewModel.this;
                BiometricErrorData biometricErrorData = this.$authenticationError;
                this.label = 1;
                if (authenticationViewModel.authenticationStateRepository.setAuthenticationError(biometricErrorData, this) == aVar) {
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
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setAuthenticationFailurePending$1, reason: invalid class name and case insensitive filesystem */
    final class C01191 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C01191(e<? super C01191> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new C01191(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01191) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (AuthenticationViewModel.this.authenticationStateRepository.setAuthenticationFailurePending(this) == aVar) {
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
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setAuthenticationHelpMessage$1, reason: invalid class name and case insensitive filesystem */
    final class C01201 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ CharSequence $authenticationHelpMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01201(CharSequence charSequence, e<? super C01201> eVar) {
            super(2, eVar);
            this.$authenticationHelpMessage = charSequence;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new C01201(this.$authenticationHelpMessage, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01201) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                AuthenticationViewModel authenticationViewModel = AuthenticationViewModel.this;
                CharSequence charSequence = this.$authenticationHelpMessage;
                this.label = 1;
                if (authenticationViewModel.authenticationStateRepository.setAuthenticationHelpMessage(charSequence, this) == aVar) {
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
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setAuthenticationResult$1, reason: invalid class name and case insensitive filesystem */
    final class C01211 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ BiometricPrompt.AuthenticationResult $authenticationResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01211(BiometricPrompt.AuthenticationResult authenticationResult, e<? super C01211> eVar) {
            super(2, eVar);
            this.$authenticationResult = authenticationResult;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new C01211(this.$authenticationResult, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01211) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                AuthenticationViewModel authenticationViewModel = AuthenticationViewModel.this;
                BiometricPrompt.AuthenticationResult authenticationResult = this.$authenticationResult;
                this.label = 1;
                if (authenticationViewModel.authenticationStateRepository.setAuthenticationResult(authenticationResult, this) == aVar) {
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
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setDelayedDelayingPrompt$1, reason: invalid class name and case insensitive filesystem */
    final class C01221 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ long $delayedTime;
        final /* synthetic */ boolean $delayingPrompt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01221(boolean z, long j2, e<? super C01221> eVar) {
            super(2, eVar);
            this.$delayingPrompt = z;
            this.$delayedTime = j2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new C01221(this.$delayingPrompt, this.$delayedTime, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01221) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                AuthenticationViewModel authenticationViewModel = AuthenticationViewModel.this;
                boolean z = this.$delayingPrompt;
                long j2 = this.$delayedTime;
                this.label = 1;
                if (authenticationViewModel.promptConfigRepository.setDelayedDelayingPrompt(z, j2, this) == aVar) {
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
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setDelayedIgnoringCancel$1, reason: invalid class name and case insensitive filesystem */
    final class C01231 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ long $delayedTime;
        final /* synthetic */ boolean $ignoringCancel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01231(boolean z, long j2, e<? super C01231> eVar) {
            super(2, eVar);
            this.$ignoringCancel = z;
            this.$delayedTime = j2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new C01231(this.$ignoringCancel, this.$delayedTime, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01231) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                AuthenticationViewModel authenticationViewModel = AuthenticationViewModel.this;
                boolean z = this.$ignoringCancel;
                long j2 = this.$delayedTime;
                this.label = 1;
                if (authenticationViewModel.authenticationStateRepository.setDelayedIgnoringCancel(z, j2, this) == aVar) {
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
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setFallbackOptionPressPending$1, reason: invalid class name and case insensitive filesystem */
    final class C01241 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ AuthenticationRequest.Biometric.Fallback.CustomOption $fallbackOption;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01241(AuthenticationRequest.Biometric.Fallback.CustomOption customOption, e<? super C01241> eVar) {
            super(2, eVar);
            this.$fallbackOption = customOption;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new C01241(this.$fallbackOption, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01241) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                AuthenticationViewModel authenticationViewModel = AuthenticationViewModel.this;
                AuthenticationRequest.Biometric.Fallback.CustomOption customOption = this.$fallbackOption;
                this.label = 1;
                if (authenticationViewModel.authenticationStateRepository.setFallbackOptionPressPending(customOption, this) == aVar) {
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
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setMoreOptionsButtonPressPending$1, reason: invalid class name and case insensitive filesystem */
    final class C01251 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C01251(e<? super C01251> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new C01251(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01251) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (AuthenticationViewModel.this.authenticationStateRepository.setMoreOptionsButtonPressPending(this) == aVar) {
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
    /* renamed from: androidx.biometric.internal.viewmodel.AuthenticationViewModel$setNegativeButtonPressPending$1, reason: invalid class name and case insensitive filesystem */
    final class C01261 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C01261(e<? super C01261> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return AuthenticationViewModel.this.new C01261(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C01261) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (AuthenticationViewModel.this.authenticationStateRepository.setNegativeButtonPressPending(this) == aVar) {
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

    public AuthenticationViewModel(PromptConfigRepository promptConfigRepository, AuthenticationStateRepository authenticationStateRepository) {
        x.f(promptConfigRepository, "promptConfigRepository");
        x.f(authenticationStateRepository, "authenticationStateRepository");
        this.promptConfigRepository = promptConfigRepository;
        this.authenticationStateRepository = authenticationStateRepository;
        this.authenticationCallbackProvider$delegate = h.g.a(new h.g.a.a() { // from class: androidx.biometric.internal.viewmodel.AuthenticationViewModel$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationViewModel.authenticationCallbackProvider_delegate$lambda$0(this.f$0);
            }
        });
        this.negativeButtonListener$delegate = h.g.a(new h.g.a.a() { // from class: androidx.biometric.internal.viewmodel.AuthenticationViewModel$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationViewModel.negativeButtonListener_delegate$lambda$0(this.f$0);
            }
        });
        this.moreOptionsButtonListener$delegate = h.g.a(new h.g.a.a() { // from class: androidx.biometric.internal.viewmodel.AuthenticationViewModel$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationViewModel.moreOptionsButtonListener_delegate$lambda$0(this.f$0);
            }
        });
        this.authHandlerKey = new AtomicInteger();
    }

    static final AuthenticationCallbackProvider authenticationCallbackProvider_delegate$lambda$0(AuthenticationViewModel authenticationViewModel) {
        return new AuthenticationCallbackProvider(new CallbackListener(authenticationViewModel));
    }

    private final List<AuthenticationRequest.Biometric.Fallback> getFallbackOptions() {
        return this.promptConfigRepository.getFallbackOptionList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getInferredAuthenticationResultType() {
        return (!AuthenticatorUtils.isSomeBiometricAllowed(getAllowedAuthenticators()) || AuthenticatorUtils.isDeviceCredentialAllowed(getAllowedAuthenticators())) ? -1 : 2;
    }

    private final BiometricPrompt.PromptInfo getPromptInfo() {
        return this.promptConfigRepository.getPromptInfo();
    }

    static final MoreOptionsButtonListener moreOptionsButtonListener_delegate$lambda$0(AuthenticationViewModel authenticationViewModel) {
        return new MoreOptionsButtonListener(authenticationViewModel);
    }

    static final NegativeButtonListener negativeButtonListener_delegate$lambda$0(AuthenticationViewModel authenticationViewModel) {
        return new NegativeButtonListener(authenticationViewModel);
    }

    public final DialogInterface.OnClickListener fallbackOptionListener(AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
        x.f(customOption, "fallback");
        return new FallbackOptionListener(this, customOption);
    }

    public final int generateNextHandlerKey() {
        return this.authHandlerKey.incrementAndGet();
    }

    public final int getAllowedAuthenticators() {
        return this.promptConfigRepository.getAllowedAuthenticators();
    }

    public final AuthenticationCallbackProvider getAuthenticationCallbackProvider() {
        return (AuthenticationCallbackProvider) this.authenticationCallbackProvider$delegate.getValue();
    }

    public final k<BiometricErrorData> getAuthenticationError() {
        return this.authenticationStateRepository.getAuthenticationError();
    }

    public final k<CharSequence> getAuthenticationHelpMessage() {
        return this.authenticationStateRepository.getAuthenticationHelpMessage();
    }

    public final k<BiometricPrompt.AuthenticationResult> getAuthenticationResult() {
        return this.authenticationStateRepository.getAuthenticationResult();
    }

    public final CanceledFrom getCanceledFrom() {
        return this.authenticationStateRepository.getCanceledFrom();
    }

    public final CancellationSignalProvider getCancellationSignalProvider() {
        return this.authenticationStateRepository.getCancellationSignalProvider();
    }

    public final PromptContentView getContentView() {
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null) {
            return promptInfo.getContentView();
        }
        return null;
    }

    public final BiometricPrompt.CryptoObject getCryptoObject() {
        return this.promptConfigRepository.getCryptoObject();
    }

    public final int getCurrentAuthenticationKey() {
        return this.promptConfigRepository.getCurrentAuthenticationKey();
    }

    public final CharSequence getDescription() {
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null) {
            return promptInfo.getDescription();
        }
        return null;
    }

    public final Bitmap getLogoBitmap() {
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null) {
            return promptInfo.getLogoBitmap();
        }
        return null;
    }

    public final String getLogoDescription() {
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null) {
            return promptInfo.getLogoDescription();
        }
        return null;
    }

    public final int getLogoRes() {
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null) {
            return promptInfo.getLogoRes();
        }
        return -1;
    }

    public final DialogInterface.OnClickListener getMoreOptionsButtonListener() {
        return (DialogInterface.OnClickListener) this.moreOptionsButtonListener$delegate.getValue();
    }

    public final List<AuthenticationRequest.Biometric.Fallback> getMultipleFallbackOptionList() {
        List<AuthenticationRequest.Biometric.Fallback> fallbackOptions = getFallbackOptions();
        if (fallbackOptions.size() > 1) {
            return fallbackOptions;
        }
        return null;
    }

    public final DialogInterface.OnClickListener getNegativeButtonListener() {
        return (DialogInterface.OnClickListener) this.negativeButtonListener$delegate.getValue();
    }

    public final AuthenticationRequest.Biometric.Fallback getSingleFallbackOption() {
        return (AuthenticationRequest.Biometric.Fallback) i.Y(getFallbackOptions());
    }

    public final CharSequence getSingleFallbackOptionText() {
        AuthenticationRequest.Biometric.Fallback singleFallbackOption = getSingleFallbackOption();
        if (singleFallbackOption instanceof AuthenticationRequest.Biometric.Fallback.OverriddenDeviceCredential) {
            return ((AuthenticationRequest.Biometric.Fallback.OverriddenDeviceCredential) singleFallbackOption).getText();
        }
        if (singleFallbackOption instanceof AuthenticationRequest.Biometric.Fallback.CustomOption) {
            return ((AuthenticationRequest.Biometric.Fallback.CustomOption) singleFallbackOption).getText();
        }
        if (singleFallbackOption instanceof AuthenticationRequest.Biometric.Fallback.DefaultCancel) {
            return ((AuthenticationRequest.Biometric.Fallback.DefaultCancel) singleFallbackOption).getText();
        }
        return null;
    }

    public final CharSequence getSubtitle() {
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null) {
            return promptInfo.getSubtitle();
        }
        return null;
    }

    public final CharSequence getTitle() {
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null) {
            return promptInfo.getTitle();
        }
        return null;
    }

    public final k<ab> isAuthenticationFailurePending() {
        return this.authenticationStateRepository.isAuthenticationFailurePending();
    }

    public final boolean isAwaitingResult() {
        return this.authenticationStateRepository.isAwaitingResult();
    }

    public final boolean isConfirmationRequired() {
        BiometricPrompt.PromptInfo promptInfo = getPromptInfo();
        if (promptInfo != null) {
            return promptInfo.isConfirmationRequired();
        }
        return true;
    }

    public final boolean isConfirmingDeviceCredential() {
        return this.promptConfigRepository.isConfirmingDeviceCredential();
    }

    public final boolean isDelayingPrompt() {
        return this.promptConfigRepository.isDelayingPrompt();
    }

    public final k<AuthenticationRequest.Biometric.Fallback.CustomOption> isFallbackOptionPressPending() {
        return this.authenticationStateRepository.isFallbackOptionPressPending();
    }

    public final boolean isIdentityCheckAvailable() {
        return this.promptConfigRepository.isIdentityCheckAvailable();
    }

    public final boolean isIgnoringCancel() {
        return this.authenticationStateRepository.isIgnoringCancel();
    }

    public final k<ab> isMoreOptionsButtonPressPending() {
        return this.authenticationStateRepository.isMoreOptionsButtonPressPending();
    }

    public final k<ab> isNegativeButtonPressPending() {
        return this.authenticationStateRepository.isNegativeButtonPressPending();
    }

    public final boolean isOverriddenDeviceCredential() {
        return getSingleFallbackOption() instanceof AuthenticationRequest.Biometric.Fallback.OverriddenDeviceCredential;
    }

    public final boolean isPromptShowing() {
        return this.promptConfigRepository.isPromptShowing();
    }

    public final boolean isUsingKeyguardManagerForBiometricAndCredential() {
        return this.promptConfigRepository.isUsingKeyguardManagerForBiometricAndCredential();
    }

    public final void resetHandlerKey() {
        this.authHandlerKey.set(0);
    }

    public final void setAuthenticationError(BiometricErrorData biometricErrorData) {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(biometricErrorData, null), 3);
    }

    public final void setAuthenticationFailurePending() {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new C01191(null), 3);
    }

    public final void setAuthenticationHelpMessage(CharSequence charSequence) {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new C01201(charSequence, null), 3);
    }

    public final void setAuthenticationResult(BiometricPrompt.AuthenticationResult authenticationResult) {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new C01211(authenticationResult, null), 3);
    }

    public final void setAwaitingResult(boolean z) {
        this.authenticationStateRepository.setAwaitingResult(z);
    }

    public final void setCanceledFrom(CanceledFrom canceledFrom) {
        x.f(canceledFrom, "value");
        this.authenticationStateRepository.setCanceledFrom(canceledFrom);
    }

    public final void setConfirmingDeviceCredential(boolean z) {
        this.promptConfigRepository.setConfirmingDeviceCredential(z);
    }

    public final void setCryptoObject(BiometricPrompt.CryptoObject cryptoObject) {
        this.promptConfigRepository.setCryptoObject(cryptoObject);
    }

    public final void setCurrentAuthenticationKey(int i2) {
        this.promptConfigRepository.setCurrentAuthenticationKey(i2);
    }

    public final void setDelayedDelayingPrompt(boolean z, long j2) {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new C01221(z, j2, null), 3);
    }

    public final void setDelayedIgnoringCancel(boolean z, long j2) {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new C01231(z, j2, null), 3);
    }

    public final void setDelayingPrompt(boolean z) {
        this.promptConfigRepository.setDelayingPrompt(z);
    }

    public final void setFallbackOptionPressPending(AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
        x.f(customOption, "fallbackOption");
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new C01241(customOption, null), 3);
    }

    public final void setIdentityCheckAvailable(boolean z) {
        this.promptConfigRepository.setIdentityCheckAvailable(z);
    }

    public final void setIgnoringCancel(boolean z) {
        this.authenticationStateRepository.setIgnoringCancel(z);
    }

    public final void setMoreOptionsButtonPressPending() {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new C01251(null), 3);
    }

    public final void setNegativeButtonPressPending() {
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new C01261(null), 3);
    }

    public final void setNegativeButtonTextOverride(CharSequence charSequence) {
        this.promptConfigRepository.setNegativeButtonTextOverride(charSequence);
    }

    public final void setPromptInfo(BiometricPrompt.PromptInfo promptInfo) {
        this.promptConfigRepository.setPromptInfo(promptInfo);
    }

    public final void setPromptShowing(boolean z) {
        this.promptConfigRepository.setPromptShowing(z);
    }

    public final void setUsingKeyguardManagerForBiometricAndCredential(boolean z) {
        this.promptConfigRepository.setUsingKeyguardManagerForBiometricAndCredential(z);
    }

    public static /* synthetic */ void getLogoBitmap$annotations() {
    }

    public static /* synthetic */ void getLogoDescription$annotations() {
    }

    public static /* synthetic */ void getLogoRes$annotations() {
    }
}
