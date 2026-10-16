package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.core.os.BundleCompat;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.provider.PendingIntentHandler;
import com.google.android.gms.common.api.ac;
import com.google.android.gms.common.api.i;
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
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialController extends CredentialProviderController<CreatePublicKeyCredentialRequest, g, h, CreateCredentialResponse, CreateCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final WeakReference<Context> contextReference;
    private Executor executor;
    private final CreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1] */
    public CreatePublicKeyCredentialController(Context context) {
        super(context);
        x.f(context, "context");
        this.contextReference = new WeakReference<>(context);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
                CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback;
                Executor executor;
                x.f(bundle, "resultData");
                CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback2 = this.this$0.callback;
                if (credentialManagerCallback2 == null) {
                    x.j("callback");
                    credentialManagerCallback = null;
                } else {
                    credentialManagerCallback = credentialManagerCallback2;
                }
                CreatePublicKeyCredentialController createPublicKeyCredentialController = this.this$0;
                CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor2 = createPublicKeyCredentialController.executor;
                if (executor2 == null) {
                    x.j("executor");
                    executor = null;
                } else {
                    executor = executor2;
                }
                if (!createPublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle, createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, credentialManagerCallback, this.this$0.cancellationSignal)) {
                    this.this$0.handleResponse$credentials_play_services_auth(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i2, (Intent) BundleCompat.getParcelable(bundle, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class), credentialManagerCallback);
                }
                this.this$0.callback = CredentialProviderBaseController.Companion.emptyCallback$credentials_play_services_auth();
            }
        };
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CreatePublicKeyCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    static final ab handleResponse$lambda$0(CancellationSignal cancellationSignal, a aVar) {
        x.f(aVar, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, aVar);
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$1(CreatePublicKeyCredentialController createPublicKeyCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialException createCredentialException) {
        x.f(createCredentialException, "e");
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(createCredentialException);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$2(CreatePublicKeyCredentialController createPublicKeyCredentialController, final CredentialManagerCallback credentialManagerCallback) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$2$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException("No provider data returned."));
    }

    static final ab handleResponse$lambda$3(CreatePublicKeyCredentialController createPublicKeyCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialResponse createCredentialResponse) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(createCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$4(CreatePublicKeyCredentialController createPublicKeyCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialException createCredentialException) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$4$0(credentialManagerCallback, createCredentialException);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CredentialManagerCallback credentialManagerCallback, CreateCredentialException createCredentialException) {
        if (createCredentialException == null) {
            createCredentialException = new CreateCredentialUnknownException("No provider data returned");
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    static final ab invokePlayServices$lambda$0(CancellationSignal cancellationSignal, Context context, final CreatePublicKeyCredentialController createPublicKeyCredentialController, final Executor executor, final CredentialManagerCallback credentialManagerCallback, f fVar) {
        PendingIntent pendingIntentA = fVar.a();
        h hVarB = fVar.b();
        if (pendingIntentA == null && hVarB == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$0(executor, credentialManagerCallback);
                }
            });
            return ab.f48028a;
        }
        if (pendingIntentA != null) {
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            createPublicKeyCredentialController.generateHiddenActivityIntent(createPublicKeyCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntentA);
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1(this.f$0);
                    }
                });
            }
        }
        if (hVarB != null) {
            final CreateCredentialResponse createCredentialResponseConvertResponseToCredentialManager = createPublicKeyCredentialController.convertResponseToCredentialManager(hVarB);
            if (createCredentialResponseConvertResponseToCredentialManager instanceof CreatePublicKeyCredentialResponse) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda4
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$2(executor, credentialManagerCallback, createCredentialResponseConvertResponseToCredentialManager);
                    }
                });
                return ab.f48028a;
            }
        }
        if (pendingIntentA == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda5
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3(executor, credentialManagerCallback);
                }
            });
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$0$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$1(final CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1$0(this.f$0);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = createPublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            x.j("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$2(Executor executor, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialResponse createCredentialResponse) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(createCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$3(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$3$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException(null, 1, null));
    }

    static final void invokePlayServices$lambda$2(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, Context context, final CredentialManagerCallback credentialManagerCallback, final Executor executor, CancellationSignal cancellationSignal, final CreatePublicKeyCredentialController createPublicKeyCredentialController, final Exception exc) {
        x.f(exc, "e");
        if (createPublicKeyCredentialRequest.isConditional()) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda16
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.invokePlayServices$lambda$2$0(this.f$0, exc, executor, credentialManagerCallback);
                }
            });
            return;
        }
        Log.w(TAG, "Pre-u credman PK create flow failed " + exc + "; retrying with gis flow");
        CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices(createPublicKeyCredentialRequest, (CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException>) credentialManagerCallback, executor, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$2$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, Exception exc, Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        x.c(exc);
        final CreateCredentialException createCredentialExceptionFromGmsException = createPublicKeyCredentialController.fromGmsException(exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(createCredentialExceptionFromGmsException);
            }
        });
        return ab.f48028a;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public g convertRequestToPlayServices(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest) {
        x.f(createPublicKeyCredentialRequest, "request");
        return new g(createPublicKeyCredentialRequest.getType(), createPublicKeyCredentialRequest.getCredentialData(), createPublicKeyCredentialRequest.getCandidateQueryData(), createPublicKeyCredentialRequest.getOrigin(), createPublicKeyCredentialRequest.getRequestJson(), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public CreateCredentialResponse convertResponseToCredentialManager(h hVar) {
        x.f(hVar, "response");
        return CreateCredentialResponse.Companion.createFrom(hVar.b(), hVar.a());
    }

    public final CreateCredentialException fromGmsException(Throwable th) {
        x.f(th, "e");
        if (th instanceof i) {
            int iA = ((i) th).a();
            return iA == 16 ? new CreateCredentialCancellationException(th.getMessage()) : iA == 17 ? new CreateCredentialUnsupportedException("API is not supported: ".concat(String.valueOf(th.getMessage()))) : iA == 8 ? new CreateCredentialNoCreateOptionException(th.getMessage()) : CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(iA)) ? new CreateCredentialInterruptedException(th.getMessage()) : new CreateCredentialUnknownException("Conditional create failed, failure: ".concat(String.valueOf(th.getMessage())));
        }
        if (th instanceof ac) {
            return new CreateCredentialUnsupportedException("API is unsupported");
        }
        Objects.toString(th);
        return new CreateCredentialUnknownException("Conditional create failed, failure: ".concat(String.valueOf(th)));
    }

    public final void handleResponse$credentials_play_services_auth(int i2, int i3, Intent intent, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "callback");
        if (i2 != CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " does not match what was given " + i2);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i3, new p() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda7
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return CreatePublicKeyCredentialController.handleResponse$lambda$0((CancellationSignal) obj, (a) obj2);
            }
        }, new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda8
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CreatePublicKeyCredentialController.handleResponse$lambda$1(this.f$0, credentialManagerCallback, (CreateCredentialException) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda9
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.handleResponse$lambda$2(this.f$0, credentialManagerCallback);
                }
            });
            return;
        }
        final CreateCredentialResponse createCredentialResponseRetrieveCreateCredentialResponse = PendingIntentHandler.Companion.retrieveCreateCredentialResponse(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, intent);
        if (createCredentialResponseRetrieveCreateCredentialResponse != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda10
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.handleResponse$lambda$3(this.f$0, credentialManagerCallback, createCredentialResponseRetrieveCreateCredentialResponse);
                }
            });
        } else {
            final CreateCredentialException createCredentialExceptionRetrieveCreateCredentialException = PendingIntentHandler.Companion.retrieveCreateCredentialException(intent);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda11
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePublicKeyCredentialController.handleResponse$lambda$4(this.f$0, credentialManagerCallback, createCredentialExceptionRetrieveCreateCredentialException);
                }
            });
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(final CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        x.f(createPublicKeyCredentialRequest, "request");
        x.f(credentialManagerCallback, "callback");
        x.f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = credentialManagerCallback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        g gVarConvertRequestToPlayServices = convertRequestToPlayServices(createPublicKeyCredentialRequest);
        final Context context = this.contextReference.get();
        if (context != null) {
            t tVarB = com.google.android.gms.common.util.g.c(context).b(gVarConvertRequestToPlayServices);
            final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda17
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CreatePublicKeyCredentialController.invokePlayServices$lambda$0(cancellationSignal, context, this, executor, credentialManagerCallback, (f) obj);
                }
            };
            tVarB.r(new o() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda18
                @Override // com.google.android.gms.o.o
                public final void onSuccess(Object obj) {
                    lVar.invoke(obj);
                }
            });
            tVarB.o(new m() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda19
                @Override // com.google.android.gms.o.m
                public final void onFailure(Exception exc) {
                    CreatePublicKeyCredentialController.invokePlayServices$lambda$2(createPublicKeyCredentialRequest, context, credentialManagerCallback, executor, cancellationSignal, this, exc);
                }
            });
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CreatePublicKeyCredentialController getInstance(Context context) {
            x.f(context, "context");
            return new CreatePublicKeyCredentialController(context);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
