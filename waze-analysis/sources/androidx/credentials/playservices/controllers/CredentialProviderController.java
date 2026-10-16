package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        x.f(context, "context");
    }

    public static /* synthetic */ void invokePlayServices$default(CredentialProviderController credentialProviderController, Object obj, CredentialManagerCallback credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokePlayServices");
        }
        if ((i2 & 8) != 0) {
            cancellationSignal = null;
        }
        credentialProviderController.invokePlayServices(obj, credentialManagerCallback, executor, cancellationSignal);
    }

    static final ab maybeReportErrorFromResultReceiver$lambda$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(obj);
            }
        });
        return ab.f48028a;
    }

    protected static final boolean maybeReportErrorResultCodeCreate(int i2, p<? super CancellationSignal, ? super a<ab>, ab> pVar, l<? super CreateCredentialException, ab> lVar, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i2, pVar, lVar, cancellationSignal);
    }

    protected abstract T2 convertRequestToPlayServices(T1 t1);

    protected abstract R1 convertResponseToCredentialManager(R2 r2);

    public abstract void invokePlayServices(T1 t1, CredentialManagerCallback<R1, E1> credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal);

    protected final boolean maybeReportErrorFromResultReceiver(Bundle bundle, p<? super String, ? super String, ? extends E1> pVar, final Executor executor, final CredentialManagerCallback<R1, E1> credentialManagerCallback, CancellationSignal cancellationSignal) {
        x.f(bundle, "resultData");
        x.f(pVar, "conversionFn");
        x.f(executor, "executor");
        x.f(credentialManagerCallback, "callback");
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        final E1 e1Invoke = pVar.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG));
        Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderController.maybeReportErrorFromResultReceiver$lambda$0(executor, credentialManagerCallback, e1Invoke);
            }
        });
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final ab maybeReportErrorResultCodeCreate$lambda$0(l lVar, aq aqVar) {
            lVar.invoke(aqVar.f48105a);
            return ab.f48028a;
        }

        static final ab maybeReportErrorResultCodeGet$lambda$0(l lVar, aq aqVar) {
            lVar.invoke(aqVar.f48105a);
            return ab.f48028a;
        }

        public final void cancelOrCallbackExceptionOrResult$credentials_play_services_auth(CancellationSignal cancellationSignal, a<ab> aVar) {
            x.f(aVar, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            aVar.invoke();
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth(int i2) {
            return "activity with result code: " + i2 + " indicating not RESULT_OK";
        }

        protected final boolean maybeReportErrorResultCodeCreate(int i2, p<? super CancellationSignal, ? super a<ab>, ab> pVar, final l<? super CreateCredentialException, ab> lVar, CancellationSignal cancellationSignal) {
            x.f(pVar, "cancelOnError");
            x.f(lVar, "onError");
            if (i2 == -1) {
                return false;
            }
            final aq aqVar = new aq();
            aqVar.f48105a = new CreateCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth(i2));
            if (i2 == 0) {
                aqVar.f48105a = new CreateCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth());
            }
            pVar.invoke(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderController.Companion.maybeReportErrorResultCodeCreate$lambda$0(lVar, aqVar);
                }
            });
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet$credentials_play_services_auth(int i2, p<? super CancellationSignal, ? super a<ab>, ab> pVar, final l<? super GetCredentialException, ab> lVar, CancellationSignal cancellationSignal) {
            x.f(pVar, "cancelOnError");
            x.f(lVar, "onError");
            if (i2 == -1) {
                return false;
            }
            final aq aqVar = new aq();
            aqVar.f48105a = new GetCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth(i2));
            if (i2 == 0) {
                aqVar.f48105a = new GetCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth());
            }
            pVar.invoke(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderController.Companion.maybeReportErrorResultCodeGet$lambda$0(lVar, aqVar);
                }
            });
            return true;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
