package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

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
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePasswordResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.PasswordCredential;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.provider.PendingIntentHandler;
import com.google.android.gms.identitycredentials.f;
import com.google.android.gms.identitycredentials.g;
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
public final class CreatePasswordCredentialController extends CredentialProviderController<CreatePasswordRequest, g, ab, CreateCredentialResponse, CreateCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePassword";
    private CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final WeakReference<Context> contextReference;
    private Executor executor;
    private final CreatePasswordCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1] */
    public CreatePasswordCredentialController(Context context) {
        super(context);
        x.f(context, "context");
        this.contextReference = new WeakReference<>(context);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1
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
                CreatePasswordCredentialController createPasswordCredentialController = this.this$0;
                CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1 createPasswordCredentialController$resultReceiver$1$onReceiveResult$1 = new CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor2 = createPasswordCredentialController.executor;
                if (executor2 == null) {
                    x.j("executor");
                    executor = null;
                } else {
                    executor = executor2;
                }
                if (!createPasswordCredentialController.maybeReportErrorFromResultReceiver(bundle, createPasswordCredentialController$resultReceiver$1$onReceiveResult$1, executor, credentialManagerCallback, this.this$0.cancellationSignal)) {
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

    public static final CreatePasswordCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    static final ab handleResponse$lambda$0(CancellationSignal cancellationSignal, a aVar) {
        x.f(aVar, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, aVar);
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$1(CreatePasswordCredentialController createPasswordCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialException createCredentialException) {
        x.f(createCredentialException, "e");
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(createCredentialException);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$2(CreatePasswordCredentialController createPasswordCredentialController, final CredentialManagerCallback credentialManagerCallback) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CreatePasswordCredentialController.handleResponse$lambda$2$0(credentialManagerCallback);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException("No provider data returned."));
    }

    static final ab handleResponse$lambda$3(CreatePasswordCredentialController createPasswordCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialResponse createCredentialResponse) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(createCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$4(CreatePasswordCredentialController createPasswordCredentialController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialException createCredentialException) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CreatePasswordCredentialController.handleResponse$lambda$4$0(credentialManagerCallback, createCredentialException);
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

    static final ab invokePlayServices$lambda$0(CancellationSignal cancellationSignal, Context context, final CreatePasswordCredentialController createPasswordCredentialController, f fVar) {
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            createPasswordCredentialController.generateHiddenActivityIntent(createPasswordCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, fVar.a());
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda12
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CreatePasswordCredentialController.invokePlayServices$lambda$0$0(this.f$0);
                    }
                });
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$0(final CreatePasswordCredentialController createPasswordCredentialController) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CreatePasswordCredentialController.invokePlayServices$lambda$0$0$0(this.f$0);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CreatePasswordCredentialController createPasswordCredentialController) {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = createPasswordCredentialController.callback;
        if (credentialManagerCallback == null) {
            x.j("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    static final void invokePlayServices$lambda$2(CreatePasswordCredentialController createPasswordCredentialController, CreatePasswordRequest createPasswordRequest, CredentialManagerCallback credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal, Exception exc) {
        x.f(exc, "e");
        Log.w(TAG, "Pre-u credman create flow failed " + exc + "; retrying with gis flow");
        Context context = createPasswordCredentialController.contextReference.get();
        if (context == null) {
            return;
        }
        new CredentialProviderCreatePasswordController(context).invokePlayServices(createPasswordRequest, (CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException>) credentialManagerCallback, executor, cancellationSignal);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public g convertRequestToPlayServices(CreatePasswordRequest createPasswordRequest) {
        x.f(createPasswordRequest, "request");
        return new g(createPasswordRequest.getType(), createPasswordRequest.getCredentialData(), createPasswordRequest.getCandidateQueryData(), createPasswordRequest.getOrigin(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public CreateCredentialResponse convertResponseToCredentialManager(ab abVar) {
        x.f(abVar, "response");
        return new CreatePasswordResponse();
    }

    public final void handleResponse$credentials_play_services_auth(int i2, int i3, Intent intent, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "callback");
        if (i2 != CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which does not match what was given " + i2);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i3, new p() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda6
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return CreatePasswordCredentialController.handleResponse$lambda$0((CancellationSignal) obj, (a) obj2);
            }
        }, new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CreatePasswordCredentialController.handleResponse$lambda$1(this.f$0, credentialManagerCallback, (CreateCredentialException) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda8
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$2(this.f$0, credentialManagerCallback);
                }
            });
            return;
        }
        final CreateCredentialResponse createCredentialResponseRetrieveCreateCredentialResponse = PendingIntentHandler.Companion.retrieveCreateCredentialResponse(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, intent);
        if (createCredentialResponseRetrieveCreateCredentialResponse != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda9
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$3(this.f$0, credentialManagerCallback, createCredentialResponseRetrieveCreateCredentialResponse);
                }
            });
        } else {
            final CreateCredentialException createCredentialExceptionRetrieveCreateCredentialException = PendingIntentHandler.Companion.retrieveCreateCredentialException(intent);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda10
                @Override // h.g.a.a
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$4(this.f$0, credentialManagerCallback, createCredentialExceptionRetrieveCreateCredentialException);
                }
            });
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(final CreatePasswordRequest createPasswordRequest, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        final Context context;
        x.f(createPasswordRequest, "request");
        x.f(credentialManagerCallback, "callback");
        x.f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = credentialManagerCallback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal) || (context = this.contextReference.get()) == null) {
            return;
        }
        t tVarB = com.google.android.gms.common.util.g.c(context).b(convertRequestToPlayServices(createPasswordRequest));
        final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CreatePasswordCredentialController.invokePlayServices$lambda$0(cancellationSignal, context, this, (f) obj);
            }
        };
        tVarB.r(new o() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarB.o(new m() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                CreatePasswordCredentialController.invokePlayServices$lambda$2(this.f$0, createPasswordRequest, credentialManagerCallback, executor, cancellationSignal, exc);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CreatePasswordCredentialController getInstance(Context context) {
            x.f(context, "context");
            return new CreatePasswordCredentialController(context);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
