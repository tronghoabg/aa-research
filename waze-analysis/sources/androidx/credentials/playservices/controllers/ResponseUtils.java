package androidx.credentials.playservices.controllers;

import android.content.Intent;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.provider.PendingIntentHandler;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ResponseUtils {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GetCredentialController";

    public static final void handleGetCredentialResponse(int i2, int i3, Intent intent, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, CancellationSignal cancellationSignal) {
        Companion.handleGetCredentialResponse(i2, i3, intent, executor, credentialManagerCallback, cancellationSignal);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final ab handleGetCredentialResponse$lambda$0(CancellationSignal cancellationSignal, a aVar) {
            x.f(aVar, "f");
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, aVar);
            return ab.f48028a;
        }

        static final ab handleGetCredentialResponse$lambda$1(Executor executor, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException getCredentialException) {
            x.f(getCredentialException, "e");
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    credentialManagerCallback.onError(getCredentialException);
                }
            });
            return ab.f48028a;
        }

        static final ab handleGetCredentialResponse$lambda$2(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ResponseUtils.Companion.handleGetCredentialResponse$lambda$2$0(credentialManagerCallback);
                }
            });
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$2$0(CredentialManagerCallback credentialManagerCallback) {
            credentialManagerCallback.onError(new GetCredentialUnknownException("No provider data returned."));
        }

        static final ab handleGetCredentialResponse$lambda$3(Executor executor, final CredentialManagerCallback credentialManagerCallback, final GetCredentialResponse getCredentialResponse) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    credentialManagerCallback.onResult(getCredentialResponse);
                }
            });
            return ab.f48028a;
        }

        static final ab handleGetCredentialResponse$lambda$4(Executor executor, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException getCredentialException) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ResponseUtils.Companion.handleGetCredentialResponse$lambda$4$0(credentialManagerCallback, getCredentialException);
                }
            });
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$4$0(CredentialManagerCallback credentialManagerCallback, GetCredentialException getCredentialException) {
            if (getCredentialException == null) {
                getCredentialException = new GetCredentialUnknownException("No provider data returned");
            }
            credentialManagerCallback.onError(getCredentialException);
        }

        public final void handleGetCredentialResponse(int i2, int i3, Intent intent, final Executor executor, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, CancellationSignal cancellationSignal) {
            x.f(executor, "executor");
            x.f(credentialManagerCallback, "callback");
            if (i2 != CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
                Log.w(ResponseUtils.TAG, "Returned request code " + CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + i2);
                return;
            }
            if (CredentialProviderController.Companion.maybeReportErrorResultCodeGet$credentials_play_services_auth(i3, new p() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ResponseUtils.Companion.handleGetCredentialResponse$lambda$0((CancellationSignal) obj, (a) obj2);
                }
            }, new l() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ResponseUtils.Companion.handleGetCredentialResponse$lambda$1(executor, credentialManagerCallback, (GetCredentialException) obj);
                }
            }, cancellationSignal)) {
                return;
            }
            if (intent == null) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda5
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$2(executor, credentialManagerCallback);
                    }
                });
                return;
            }
            final GetCredentialResponse getCredentialResponseRetrieveGetCredentialResponse = PendingIntentHandler.Companion.retrieveGetCredentialResponse(intent);
            if (getCredentialResponseRetrieveGetCredentialResponse != null) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda6
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$3(executor, credentialManagerCallback, getCredentialResponseRetrieveGetCredentialResponse);
                    }
                });
            } else {
                final GetCredentialException getCredentialExceptionRetrieveGetCredentialException = PendingIntentHandler.Companion.retrieveGetCredentialException(intent);
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda7
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$4(executor, credentialManagerCallback, getCredentialExceptionRetrieveGetCredentialException);
                    }
                });
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
