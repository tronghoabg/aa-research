package androidx.credentials;

import android.app.PendingIntent;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.e;
import h.d.b;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface CredentialManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CredentialManager create(Context context) {
            x.f(context, "context");
            return new CredentialManagerImpl(context);
        }
    }

    Object clearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest, e<? super ab> eVar);

    void clearCredentialStateAsync(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback);

    Object createCredential(Context context, CreateCredentialRequest createCredentialRequest, e<? super CreateCredentialResponse> eVar);

    void createCredentialAsync(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback);

    PendingIntent createSettingsPendingIntent();

    Object getCredential(Context context, GetCredentialRequest getCredentialRequest, e<? super GetCredentialResponse> eVar);

    Object getCredential(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, e<? super GetCredentialResponse> eVar);

    void getCredentialAsync(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback);

    void getCredentialAsync(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback);

    Object prepareGetCredential(GetCredentialRequest getCredentialRequest, e<? super PrepareGetCredentialResponse> eVar);

    void prepareGetCredentialAsync(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> credentialManagerCallback);

    Object signalCredentialState(SignalCredentialStateRequest signalCredentialStateRequest, e<? super SignalCredentialStateResponse> eVar);

    void signalCredentialStateAsync(SignalCredentialStateRequest signalCredentialStateRequest, Executor executor, CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException> credentialManagerCallback);

    /* compiled from: WazeSource */
    /* renamed from: androidx.credentials.CredentialManager$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$signalCredentialStateAsync(CredentialManager credentialManager, SignalCredentialStateRequest signalCredentialStateRequest, Executor executor, CredentialManagerCallback credentialManagerCallback) {
            x.f(signalCredentialStateRequest, "request");
            x.f(executor, "executor");
            x.f(credentialManagerCallback, "callback");
        }

        public static /* synthetic */ Object clearCredentialState$suspendImpl(CredentialManager credentialManager, ClearCredentialStateRequest clearCredentialStateRequest, e<? super ab> eVar) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            final l lVar2 = lVar;
            final CancellationSignal cancellationSignal = new CancellationSignal();
            lVar2.c(new h.g.a.l<Throwable, ab>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                    invoke2(th);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    cancellationSignal.cancel();
                }
            });
            credentialManager.clearCredentialStateAsync(clearCredentialStateRequest, cancellationSignal, new CredentialManager$$ExternalSyntheticLambda0(), new CredentialManagerCallback<Void, ClearCredentialException>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$callback$1
                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(ClearCredentialException clearCredentialException) {
                    x.f(clearCredentialException, "e");
                    if (lVar2.g()) {
                        lVar2.resumeWith(c.a(clearCredentialException));
                    }
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(Void r1) {
                    if (lVar2.g()) {
                        lVar2.resumeWith(ab.f48028a);
                    }
                }
            });
            Object objJ = lVar.j();
            a aVar = a.f48038a;
            if (objJ == aVar) {
                b.c(eVar);
            }
            return objJ == aVar ? objJ : ab.f48028a;
        }

        public static CredentialManager create(Context context) {
            return CredentialManager.Companion.create(context);
        }

        public static /* synthetic */ Object createCredential$suspendImpl(CredentialManager credentialManager, Context context, CreateCredentialRequest createCredentialRequest, e<? super CreateCredentialResponse> eVar) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            final l lVar2 = lVar;
            final CancellationSignal cancellationSignal = new CancellationSignal();
            lVar2.c(new h.g.a.l<Throwable, ab>() { // from class: androidx.credentials.CredentialManager$createCredential$2$1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                    invoke2(th);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    cancellationSignal.cancel();
                }
            });
            credentialManager.createCredentialAsync(context, createCredentialRequest, cancellationSignal, new CredentialManager$$ExternalSyntheticLambda0(), new CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException>() { // from class: androidx.credentials.CredentialManager$createCredential$2$callback$1
                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(CreateCredentialException createCredentialException) {
                    x.f(createCredentialException, "e");
                    if (lVar2.g()) {
                        lVar2.resumeWith(c.a(createCredentialException));
                    }
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(CreateCredentialResponse createCredentialResponse) {
                    x.f(createCredentialResponse, "result");
                    if (lVar2.g()) {
                        lVar2.resumeWith(createCredentialResponse);
                    }
                }
            });
            Object objJ = lVar.j();
            if (objJ == a.f48038a) {
                b.c(eVar);
            }
            return objJ;
        }

        public static /* synthetic */ Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, GetCredentialRequest getCredentialRequest, e<? super GetCredentialResponse> eVar) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            final l lVar2 = lVar;
            final CancellationSignal cancellationSignal = new CancellationSignal();
            lVar2.c(new h.g.a.l<Throwable, ab>() { // from class: androidx.credentials.CredentialManager$getCredential$2$1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                    invoke2(th);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    cancellationSignal.cancel();
                }
            });
            credentialManager.getCredentialAsync(context, getCredentialRequest, cancellationSignal, new CredentialManager$$ExternalSyntheticLambda0(), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$2$callback$1
                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(GetCredentialException getCredentialException) {
                    x.f(getCredentialException, "e");
                    if (lVar2.g()) {
                        lVar2.resumeWith(c.a(getCredentialException));
                    }
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(GetCredentialResponse getCredentialResponse) {
                    x.f(getCredentialResponse, "result");
                    if (lVar2.g()) {
                        lVar2.resumeWith(getCredentialResponse);
                    }
                }
            });
            Object objJ = lVar.j();
            if (objJ == a.f48038a) {
                b.c(eVar);
            }
            return objJ;
        }

        public static /* synthetic */ Object prepareGetCredential$suspendImpl(CredentialManager credentialManager, GetCredentialRequest getCredentialRequest, e<? super PrepareGetCredentialResponse> eVar) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            final l lVar2 = lVar;
            final CancellationSignal cancellationSignal = new CancellationSignal();
            lVar2.c(new h.g.a.l<Throwable, ab>() { // from class: androidx.credentials.CredentialManager$prepareGetCredential$2$1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                    invoke2(th);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    cancellationSignal.cancel();
                }
            });
            credentialManager.prepareGetCredentialAsync(getCredentialRequest, cancellationSignal, new CredentialManager$$ExternalSyntheticLambda0(), new CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$prepareGetCredential$2$callback$1
                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(GetCredentialException getCredentialException) {
                    x.f(getCredentialException, "e");
                    if (lVar2.g()) {
                        lVar2.resumeWith(c.a(getCredentialException));
                    }
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(PrepareGetCredentialResponse prepareGetCredentialResponse) {
                    x.f(prepareGetCredentialResponse, "result");
                    if (lVar2.g()) {
                        lVar2.resumeWith(prepareGetCredentialResponse);
                    }
                }
            });
            Object objJ = lVar.j();
            if (objJ == a.f48038a) {
                b.c(eVar);
            }
            return objJ;
        }

        public static /* synthetic */ Object signalCredentialState$suspendImpl(CredentialManager credentialManager, SignalCredentialStateRequest signalCredentialStateRequest, e<? super SignalCredentialStateResponse> eVar) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            final l lVar2 = lVar;
            credentialManager.signalCredentialStateAsync(signalCredentialStateRequest, new CredentialManager$$ExternalSyntheticLambda0(), new CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException>() { // from class: androidx.credentials.CredentialManager$signalCredentialState$2$callback$1
                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(SignalCredentialStateException signalCredentialStateException) {
                    x.f(signalCredentialStateException, "e");
                    if (lVar2.g()) {
                        lVar2.resumeWith(c.a(signalCredentialStateException));
                    }
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(SignalCredentialStateResponse signalCredentialStateResponse) {
                    x.f(signalCredentialStateResponse, "result");
                    if (lVar2.g()) {
                        lVar2.resumeWith(signalCredentialStateResponse);
                    }
                }
            });
            Object objJ = lVar.j();
            if (objJ == a.f48038a) {
                b.c(eVar);
            }
            return objJ;
        }

        public static /* synthetic */ Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, e<? super GetCredentialResponse> eVar) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            final l lVar2 = lVar;
            final CancellationSignal cancellationSignal = new CancellationSignal();
            lVar2.c(new h.g.a.l<Throwable, ab>() { // from class: androidx.credentials.CredentialManager$getCredential$4$1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                    invoke2(th);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    cancellationSignal.cancel();
                }
            });
            credentialManager.getCredentialAsync(context, pendingGetCredentialHandle, cancellationSignal, new CredentialManager$$ExternalSyntheticLambda0(), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$4$callback$1
                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(GetCredentialException getCredentialException) {
                    x.f(getCredentialException, "e");
                    if (lVar2.g()) {
                        lVar2.resumeWith(c.a(getCredentialException));
                    }
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(GetCredentialResponse getCredentialResponse) {
                    x.f(getCredentialResponse, "result");
                    if (lVar2.g()) {
                        lVar2.resumeWith(getCredentialResponse);
                    }
                }
            });
            Object objJ = lVar.j();
            if (objJ == a.f48038a) {
                b.c(eVar);
            }
            return objJ;
        }
    }
}
