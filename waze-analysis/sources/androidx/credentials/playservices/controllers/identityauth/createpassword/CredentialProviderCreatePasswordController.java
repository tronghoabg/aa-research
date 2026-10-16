package androidx.credentials.playservices.controllers.identityauth.createpassword;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePasswordResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.a.k;
import com.google.android.gms.auth.api.identity.q;
import com.google.android.gms.auth.api.identity.t;
import com.google.android.gms.auth.api.identity.u;
import com.google.android.gms.auth.api.identity.v;
import com.google.android.gms.auth.api.identity.y;
import com.google.android.gms.common.api.i;
import com.google.android.gms.o.m;
import com.google.android.gms.o.o;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<CreatePasswordRequest, u, ab, CreateCredentialResponse, CreateCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePassword";
    private CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final WeakReference<Context> contextReference;
    private Executor executor;
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        x.f(context, "context");
        this.contextReference = new WeakReference<>(context);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1
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
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor2 = credentialProviderCreatePasswordController.executor;
                if (executor2 == null) {
                    x.j("executor");
                    executor = null;
                } else {
                    executor = executor2;
                }
                if (!credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(bundle, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, credentialManagerCallback, this.this$0.cancellationSignal)) {
                    this.this$0.handleResponse$credentials_play_services_auth(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i2, credentialManagerCallback);
                }
                this.this$0.callback = CredentialProviderBaseController.Companion.emptyCallback$credentials_play_services_auth();
            }
        };
    }

    private final CreateCredentialException fromGmsException(Throwable th) {
        return CredentialProviderBaseController.Companion.createCredentialExceptionTypeToException$credentials_play_services_auth(((th instanceof i) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((i) th).a()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN, "During save password, found password failure response from one tap ".concat(String.valueOf(th.getMessage())));
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    static final ab handleResponse$lambda$0(CancellationSignal cancellationSignal, a aVar) {
        x.f(aVar, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, aVar);
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialException createCredentialException) {
        x.f(createCredentialException, "e");
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(createCredentialException);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialResponse createCredentialResponse) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(createCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    static final ab invokePlayServices$lambda$0(CancellationSignal cancellationSignal, Context context, final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, v vVar) {
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            credentialProviderCreatePasswordController.generateHiddenActivityIntent(credentialProviderCreatePasswordController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, vVar.a());
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0(this.f$0);
                    }
                });
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$0(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0$0(this.f$0);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.callback;
        if (credentialManagerCallback == null) {
            x.j("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    static final void invokePlayServices$lambda$2(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CancellationSignal cancellationSignal, Exception exc) {
        x.f(exc, "e");
        final CreateCredentialException createCredentialExceptionFromGmsException = credentialProviderCreatePasswordController.fromGmsException(exc);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda11
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0(this.f$0, createCredentialExceptionFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$2$0(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final CreateCredentialException createCredentialException) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            x.j("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0$0(this.f$0, createCredentialException);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.callback;
        if (credentialManagerCallback == null) {
            x.j("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public u convertRequestToPlayServices(CreatePasswordRequest createPasswordRequest) {
        x.f(createPasswordRequest, "request");
        t tVar = new t();
        tVar.c(new y(createPasswordRequest.getId(), createPasswordRequest.getPassword()));
        u uVarA = tVar.a();
        x.e(uVarA, "build(...)");
        return uVarA;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public CreateCredentialResponse convertResponseToCredentialManager(ab abVar) {
        x.f(abVar, "response");
        return new CreatePasswordResponse();
    }

    public final void handleResponse$credentials_play_services_auth(int i2, int i3, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "callback");
        if (i2 == CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            if (CredentialProviderController.maybeReportErrorResultCodeCreate(i3, new p() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$0((CancellationSignal) obj, (a) obj2);
                }
            }, new l() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$1(this.f$0, credentialManagerCallback, (CreateCredentialException) obj);
                }
            }, this.cancellationSignal)) {
                return;
            }
            final CreateCredentialResponse createCredentialResponseConvertResponseToCredentialManager = convertResponseToCredentialManager(ab.f48028a);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda4
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$2(this.f$0, credentialManagerCallback, createCredentialResponseConvertResponseToCredentialManager);
                }
            });
            return;
        }
        Log.w(TAG, "Returned request code " + CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which does not match what was given " + i2);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(CreatePasswordRequest createPasswordRequest, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, Executor executor, final CancellationSignal cancellationSignal) {
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
        com.google.android.gms.o.t tVarA = new k(context, new q()).a(convertRequestToPlayServices(createPasswordRequest));
        final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$0(cancellationSignal, context, this, (v) obj);
            }
        };
        tVarA.r(new o() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarA.o(new m() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$$ExternalSyntheticLambda8
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2(this.f$0, cancellationSignal, exc);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            x.f(context, "context");
            return new CredentialProviderCreatePasswordController(context);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
