package androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.SignalCredentialStateRequest;
import androidx.credentials.SignalCredentialStateResponse;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialRateLimitExceededException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.util.g;
import com.google.android.gms.identitycredentials.w;
import com.google.android.gms.identitycredentials.x;
import com.google.android.gms.o.m;
import com.google.android.gms.o.t;
import h.ab;
import h.g.a.l;
import h.g.b.aq;
import h.n.f;
import h.n.o;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SignalCredentialStateController extends CredentialProviderController<SignalCredentialStateRequest, w, x, SignalCredentialStateResponse, SignalCredentialStateException> {
    public static final Companion Companion = new Companion(null);
    public static final long MAX_RETRY_TIME = 600000;
    public static final String RATE_LIMIT_EXCEPTION_MESSAGE_MATCHER = "called too frequently";
    public static final String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateController(Context context) {
        super(context);
        h.g.b.x.f(context, "context");
        this.context = context;
    }

    public static final SignalCredentialStateController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    static final ab invokePlayServices$lambda$0(Executor executor, SignalCredentialStateController signalCredentialStateController, final CredentialManagerCallback credentialManagerCallback, x xVar) {
        if (xVar == null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    SignalCredentialStateController.invokePlayServices$lambda$0$0(credentialManagerCallback);
                }
            });
            return ab.f48028a;
        }
        final SignalCredentialStateResponse signalCredentialStateResponseConvertResponseToCredentialManager = signalCredentialStateController.convertResponseToCredentialManager(xVar);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(signalCredentialStateResponseConvertResponseToCredentialManager);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(SignalCredentialStateException.Companion.createFrom("No SignalCredentialStateResponse received"));
    }

    static final void invokePlayServices$lambda$2(Executor executor, final CredentialManagerCallback credentialManagerCallback, Exception exc) {
        String message;
        h.g.b.x.f(exc, "e");
        final aq aqVar = new aq();
        aqVar.f48105a = SignalCredentialStateException.Companion.createFrom(exc.getMessage());
        if ((exc instanceof i) && ((i) exc).a() == 16 && (message = exc.getMessage()) != null && o.F(message, RATE_LIMIT_EXCEPTION_MESSAGE_MATCHER, false)) {
            aqVar.f48105a = new SignalCredentialRateLimitExceededException(Companion.parseRefillMinutesRegex(exc.getMessage()), exc.getMessage());
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SignalCredentialStateController.invokePlayServices$lambda$2$0(credentialManagerCallback, aqVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0(CredentialManagerCallback credentialManagerCallback, aq aqVar) {
        credentialManagerCallback.onError(aqVar.f48105a);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public w convertRequestToPlayServices(SignalCredentialStateRequest signalCredentialStateRequest) {
        h.g.b.x.f(signalCredentialStateRequest, "request");
        return new w(signalCredentialStateRequest.getType(), signalCredentialStateRequest.getOrigin(), signalCredentialStateRequest.getRequestData());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public SignalCredentialStateResponse convertResponseToCredentialManager(x xVar) {
        h.g.b.x.f(xVar, "response");
        return new SignalCredentialStateResponse();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(SignalCredentialStateRequest signalCredentialStateRequest, final CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException> credentialManagerCallback, final Executor executor, CancellationSignal cancellationSignal) {
        h.g.b.x.f(signalCredentialStateRequest, "request");
        h.g.b.x.f(credentialManagerCallback, "callback");
        h.g.b.x.f(executor, "executor");
        Context context = this.context;
        t tVarD = g.c(context).d(convertRequestToPlayServices(signalCredentialStateRequest));
        final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SignalCredentialStateController.invokePlayServices$lambda$0(executor, this, credentialManagerCallback, (x) obj);
            }
        };
        tVarD.r(new com.google.android.gms.o.o() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarD.o(new m() { // from class: androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                SignalCredentialStateController.invokePlayServices$lambda$2(executor, credentialManagerCallback, exc);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SignalCredentialStateController getInstance(Context context) {
            h.g.b.x.f(context, "context");
            return new SignalCredentialStateController(context);
        }

        public final long parseRefillMinutesRegex(String str) {
            h.n.g gVarH;
            h.n.i iVarE;
            f fVarA;
            String strA;
            Integer numF;
            if (str == null || (gVarH = h.n.l.h(new h.n.l("^SignalCredentialState has been called too frequently\\. Please retry later after (\\d+) minutes\\.$"), str)) == null || (iVarE = gVarH.e()) == null || (fVarA = iVarE.a(1)) == null || (strA = fVarA.a()) == null || (numF = o.f(strA)) == null) {
                return 600000L;
            }
            return numF.intValue();
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
