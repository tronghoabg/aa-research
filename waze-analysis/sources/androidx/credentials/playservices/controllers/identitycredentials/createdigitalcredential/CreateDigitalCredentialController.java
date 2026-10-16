package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreateDigitalCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.DigitalCredential;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import androidx.credentials.provider.PendingIntentHandler;
import com.google.android.gms.identitycredentials.f;
import com.google.android.gms.identitycredentials.g;
import com.google.android.gms.identitycredentials.h;
import com.google.android.gms.o.m;
import com.google.android.gms.o.o;
import com.google.android.gms.o.t;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreateDigitalCredentialController extends CredentialProviderController<CreateDigitalCredentialRequest, g, h, CreateCredentialResponse, CreateCredentialException> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DigitalCredentialClient";
    public CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final WeakReference<Context> contextReference;
    public Executor executor;
    private final CreateDigitalCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$resultReceiver$1] */
    public CreateDigitalCredentialController(Context context) {
        super(context);
        x.f(context, "context");
        this.contextReference = new WeakReference<>(context);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
                x.f(bundle, "resultData");
                CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback = this.this$0.getCallback();
                CreateDigitalCredentialController$resultReceiver$1$onReceiveResult$1 createDigitalCredentialController$resultReceiver$1$onReceiveResult$1 = new CreateDigitalCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                CreateDigitalCredentialController createDigitalCredentialController = this.this$0;
                if (!createDigitalCredentialController.maybeReportErrorFromResultReceiver(bundle, createDigitalCredentialController$resultReceiver$1$onReceiveResult$1, createDigitalCredentialController.getExecutor(), callback, createDigitalCredentialController.cancellationSignal)) {
                    this.this$0.handleResponse$credentials_play_services_auth(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i2, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG), callback);
                }
                this.this$0.setCallback(CredentialProviderBaseController.Companion.emptyCallback$credentials_play_services_auth());
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    private static /* synthetic */ void getResultReceiver$annotations() {
    }

    static final ab handleResponse$lambda$0(CancellationSignal cancellationSignal, a aVar) {
        x.f(aVar, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, aVar);
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$1(CreateDigitalCredentialController createDigitalCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialException createCredentialException) {
        x.f(createCredentialException, "e");
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(createCredentialException);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$2(CreateDigitalCredentialController createDigitalCredentialController, final CredentialManagerCallback credentialManagerCallback) {
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$2$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException("No provider data returned."));
    }

    static final ab handleResponse$lambda$3(CreateDigitalCredentialController createDigitalCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialException createCredentialException) {
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$3$0(credentialManagerCallback, createCredentialException);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CredentialManagerCallback credentialManagerCallback, CreateCredentialException createCredentialException) {
        if (createCredentialException == null) {
            createCredentialException = new CreateCredentialUnknownException("Unexpected configuration error");
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    static final ab handleResponse$lambda$4(CreateDigitalCredentialController createDigitalCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialResponse createCredentialResponse) {
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(createCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    static final ab invokePlayServices$lambda$0(CancellationSignal cancellationSignal, Context context, CreateDigitalCredentialController createDigitalCredentialController, f fVar) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return ab.f48028a;
        }
        Intent intent = new Intent(context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
        intent.setFlags(65536);
        intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, createDigitalCredentialController.toIpcFriendlyResultReceiver(createDigitalCredentialController.resultReceiver));
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, fVar.a());
        intent.putExtra(CredentialProviderBaseController.EXTRA_ERROR_NAME, CredentialProviderBaseController.CREATE_UNKNOWN);
        context.startActivity(intent);
        return ab.f48028a;
    }

    static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, final Exception exc) {
        x.f(exc, "e");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return CreateDigitalCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$2$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final Exception exc) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.invokePlayServices$lambda$2$0$0(credentialManagerCallback, exc);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialManagerCallback credentialManagerCallback, Exception exc) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException(exc.getMessage()));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public g convertRequestToPlayServices(CreateDigitalCredentialRequest createDigitalCredentialRequest) {
        x.f(createDigitalCredentialRequest, "request");
        return new g(createDigitalCredentialRequest.getType(), createDigitalCredentialRequest.getCredentialData(), createDigitalCredentialRequest.getCandidateQueryData(), createDigitalCredentialRequest.getOrigin(), createDigitalCredentialRequest.getRequestJson(), this.resultReceiver);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public CreateCredentialResponse convertResponseToCredentialManager(h hVar) {
        x.f(hVar, "response");
        return CreateCredentialResponse.Companion.createFrom(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, hVar.a());
    }

    public final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> getCallback() {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = this.callback;
        if (credentialManagerCallback != null) {
            return credentialManagerCallback;
        }
        x.j("callback");
        return null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        x.j("executor");
        return null;
    }

    public final void handleResponse$credentials_play_services_auth(int i2, int i3, Intent intent, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "callback");
        if (i2 != CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + i2);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i3, new p() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return CreateDigitalCredentialController.handleResponse$lambda$0((CancellationSignal) obj, (a) obj2);
            }
        }, new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CreateDigitalCredentialController.handleResponse$lambda$1(this.f$0, credentialManagerCallback, (CreateCredentialException) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreateDigitalCredentialController.handleResponse$lambda$2(this.f$0, credentialManagerCallback);
                }
            });
            return;
        }
        final CreateCredentialResponse createCredentialResponseRetrieveCreateCredentialResponse = PendingIntentHandler.Companion.retrieveCreateCredentialResponse(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, intent);
        if (createCredentialResponseRetrieveCreateCredentialResponse != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda4
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreateDigitalCredentialController.handleResponse$lambda$4(this.f$0, credentialManagerCallback, createCredentialResponseRetrieveCreateCredentialResponse);
                }
            });
        } else {
            final CreateCredentialException createCredentialExceptionRetrieveCreateCredentialException = PendingIntentHandler.Companion.retrieveCreateCredentialException(intent);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreateDigitalCredentialController.handleResponse$lambda$3(this.f$0, credentialManagerCallback, createCredentialExceptionRetrieveCreateCredentialException);
                }
            });
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(CreateDigitalCredentialRequest createDigitalCredentialRequest, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        final Context context;
        x.f(createDigitalCredentialRequest, "request");
        x.f(credentialManagerCallback, "callback");
        x.f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(credentialManagerCallback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal) || (context = this.contextReference.get()) == null) {
            return;
        }
        t tVarB = com.google.android.gms.common.util.g.c(context).b(convertRequestToPlayServices(createDigitalCredentialRequest));
        final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CreateDigitalCredentialController.invokePlayServices$lambda$0(cancellationSignal, context, this, (f) obj);
            }
        };
        tVarB.r(new o() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarB.o(new m() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$$ExternalSyntheticLambda8
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                CreateDigitalCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }

    public final void setCallback(CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "<set-?>");
        this.callback = credentialManagerCallback;
    }

    public final void setExecutor(Executor executor) {
        x.f(executor, "<set-?>");
        this.executor = executor;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
