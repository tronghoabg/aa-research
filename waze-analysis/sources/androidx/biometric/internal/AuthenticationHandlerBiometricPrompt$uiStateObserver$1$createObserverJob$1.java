package androidx.biometric.internal;

import androidx.biometric.AuthenticationRequest;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1 extends g implements p<af, e<? super ab>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AuthenticationHandlerBiometricPrompt this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;
        final /* synthetic */ AuthenticationHandlerBiometricPrompt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = authenticationHandlerBiometricPrompt;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
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
                k<ab> kVarIsNegativeButtonPressPending = this.this$0.getViewModel().isNegativeButtonPressPending();
                final AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt = this.this$0;
                this.label = 1;
                if (kVarIsNegativeButtonPressPending.collect(new l() { // from class: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt.uiStateObserver.1.createObserverJob.1.1.1
                    public final Object emit(ab abVar, e<? super ab> eVar) {
                        authenticationHandlerBiometricPrompt.authenticationManager.isNegativeButtonPressPendingObserver().invoke();
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
    /* renamed from: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        int label;
        final /* synthetic */ AuthenticationHandlerBiometricPrompt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.this$0 = authenticationHandlerBiometricPrompt;
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
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                k<AuthenticationRequest.Biometric.Fallback.CustomOption> kVarIsFallbackOptionPressPending = this.this$0.getViewModel().isFallbackOptionPressPending();
                final AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt = this.this$0;
                this.label = 1;
                if (kVarIsFallbackOptionPressPending.collect(new l() { // from class: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt.uiStateObserver.1.createObserverJob.1.2.1
                    public final Object emit(AuthenticationRequest.Biometric.Fallback.CustomOption customOption, e<? super ab> eVar) {
                        authenticationHandlerBiometricPrompt.onFallbackOptionPressed(customOption);
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((AuthenticationRequest.Biometric.Fallback.CustomOption) obj2, (e<? super ab>) eVar);
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
    /* renamed from: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
        int label;
        final /* synthetic */ AuthenticationHandlerBiometricPrompt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.this$0 = authenticationHandlerBiometricPrompt;
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
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                k<ab> kVarIsMoreOptionsButtonPressPending = this.this$0.getViewModel().isMoreOptionsButtonPressPending();
                final AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt = this.this$0;
                this.label = 1;
                if (kVarIsMoreOptionsButtonPressPending.collect(new l() { // from class: androidx.biometric.internal.AuthenticationHandlerBiometricPrompt.uiStateObserver.1.createObserverJob.1.3.1
                    public final Object emit(ab abVar, e<? super ab> eVar) {
                        authenticationHandlerBiometricPrompt.onMoreOptionsButtonPressed();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1(AuthenticationHandlerBiometricPrompt authenticationHandlerBiometricPrompt, e<? super AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1> eVar) {
        super(2, eVar);
        this.this$0 = authenticationHandlerBiometricPrompt;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1 authenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1 = new AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1(this.this$0, eVar);
        authenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1.L$0 = obj;
        return authenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AuthenticationHandlerBiometricPrompt$uiStateObserver$1$createObserverJob$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        af afVar = (af) this.L$0;
        aj.z(afVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        aj.z(afVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        aj.z(afVar, null, null, new AnonymousClass3(this.this$0, null), 3);
        return ab.f48028a;
    }
}
