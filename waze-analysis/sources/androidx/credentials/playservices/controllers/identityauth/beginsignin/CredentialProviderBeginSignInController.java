package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.a.n;
import com.google.android.gms.auth.api.identity.m;
import com.google.android.gms.auth.api.identity.o;
import com.google.android.gms.auth.api.identity.w;
import com.google.android.gms.common.api.i;
import com.google.android.gms.o.t;
import com.google.android.libraries.c.a.d;
import com.google.e.a.d.a.a;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderBeginSignInController extends CredentialProviderController<GetCredentialRequest, m, w, GetCredentialResponse, GetCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignIn";
    public CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final WeakReference<Context> contextReference;
    public Executor executor;
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        x.f(context, "context");
        this.contextReference = new WeakReference<>(context);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
                x.f(bundle, "resultData");
                CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback = this.this$0.getCallback();
                CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 credentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
                if (!credentialProviderBeginSignInController.maybeReportErrorFromResultReceiver(bundle, credentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1, credentialProviderBeginSignInController.getExecutor(), callback, credentialProviderBeginSignInController.cancellationSignal)) {
                    this.this$0.handleResponse$credentials_play_services_auth(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i2, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG), callback);
                }
                this.this$0.setCallback(CredentialProviderBaseController.Companion.emptyCallback$credentials_play_services_auth());
            }
        };
    }

    private final d createGoogleIdCredential(w wVar) {
        a aVar = new a(null);
        String strG = wVar.g();
        x.e(strG, "getId(...)");
        aVar.l(strG);
        String strF = wVar.f();
        x.c(strF);
        aVar.m(strF);
        if (wVar.c() != null) {
            aVar.i(wVar.c());
        }
        if (wVar.e() != null) {
            aVar.k(wVar.e());
        }
        if (wVar.d() != null) {
            aVar.j(wVar.d());
        }
        if (wVar.i() != null) {
            aVar.n(wVar.i());
        }
        if (wVar.a() != null) {
            aVar.o(wVar.a());
        }
        return aVar.h();
    }

    private final GetCredentialException fromGmsException(Throwable th) {
        return CredentialProviderBaseController.Companion.getCredentialExceptionTypeToException$credentials_play_services_auth(((th instanceof i) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((i) th).a()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS, "During begin sign in, failure response from one tap: ".concat(String.valueOf(th.getMessage())));
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    static final ab handleResponse$lambda$0(CancellationSignal cancellationSignal, h.g.a.a aVar) {
        x.f(aVar, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, aVar);
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$1(CredentialProviderBeginSignInController credentialProviderBeginSignInController, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException getCredentialException) {
        x.f(getCredentialException, "e");
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(getCredentialException);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController, final CredentialManagerCallback credentialManagerCallback, final GetCredentialResponse getCredentialResponse) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(getCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, final CredentialManagerCallback credentialManagerCallback, final aq aqVar) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$3$0(credentialManagerCallback, aqVar);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CredentialManagerCallback credentialManagerCallback, aq aqVar) {
        credentialManagerCallback.onError(aqVar.f48105a);
    }

    static final ab handleResponse$lambda$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(getCredentialException);
            }
        });
        return ab.f48028a;
    }

    static final ab handleResponse$lambda$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, final CredentialManagerCallback credentialManagerCallback, final GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onError(getCredentialUnknownException);
            }
        });
        return ab.f48028a;
    }

    static final ab invokePlayServices$lambda$0(CancellationSignal cancellationSignal, Context context, final CredentialProviderBeginSignInController credentialProviderBeginSignInController, o oVar) {
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            credentialProviderBeginSignInController.generateHiddenActivityIntent(credentialProviderBeginSignInController.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, oVar.a());
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new h.g.a.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda5
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderBeginSignInController.invokePlayServices$lambda$0$0(this.f$0);
                    }
                });
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$0(final CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$0$0$0(this.f$0);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getCallback().onError(new GetCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    static final void invokePlayServices$lambda$2(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, CancellationSignal cancellationSignal, Exception exc) {
        x.f(exc, "e");
        final GetCredentialException getCredentialExceptionFromGmsException = credentialProviderBeginSignInController.fromGmsException(exc);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new h.g.a.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$2$0(this.f$0, getCredentialExceptionFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$2$0(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2$0$0(this.f$0, getCredentialException);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getCallback().onError(getCredentialException);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public m convertRequestToPlayServices(GetCredentialRequest getCredentialRequest) throws GetCredentialUnknownException {
        x.f(getCredentialRequest, "request");
        Context context = this.contextReference.get();
        if (context != null) {
            return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth(getCredentialRequest, context);
        }
        throw new GetCredentialUnknownException("A valid context is required to convert the request to play services, but the context reference is null.");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialResponse convertResponseToCredentialManager(w wVar) throws GetCredentialUnknownException {
        PublicKeyCredential publicKeyCredential;
        x.f(wVar, "response");
        if (wVar.h() != null) {
            String strG = wVar.g();
            x.e(strG, "getId(...)");
            String strH = wVar.h();
            x.c(strH);
            publicKeyCredential = new PasswordCredential(strG, strH);
        } else if (wVar.f() != null) {
            publicKeyCredential = createGoogleIdCredential(wVar);
        } else if (wVar.b() != null) {
            publicKeyCredential = new PublicKeyCredential(PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(wVar));
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            publicKeyCredential = null;
        }
        if (publicKeyCredential != null) {
            return new GetCredentialResponse(publicKeyCredential);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> getCallback() {
        CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback = this.callback;
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

    public final void handleResponse$credentials_play_services_auth(int i2, int i3, Intent intent, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "callback");
        if (i2 != CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + i2);
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeGet$credentials_play_services_auth(i3, new p() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda12
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return CredentialProviderBeginSignInController.handleResponse$lambda$0((CancellationSignal) obj, (h.g.a.a) obj2);
            }
        }, new l() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda13
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CredentialProviderBeginSignInController.handleResponse$lambda$1(this.f$0, credentialManagerCallback, (GetCredentialException) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        try {
            Context context = this.contextReference.get();
            if (context != null) {
                com.bumptech.glide.g.p.h(context);
                w wVarD = n.d(intent);
                x.e(wVarD, "getSignInCredentialFromIntent(...)");
                final GetCredentialResponse getCredentialResponseConvertResponseToCredentialManager = convertResponseToCredentialManager(wVarD);
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new h.g.a.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda14
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return CredentialProviderBeginSignInController.handleResponse$lambda$2(this.f$0, credentialManagerCallback, getCredentialResponseConvertResponseToCredentialManager);
                    }
                });
            }
        } catch (GetCredentialException e2) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new h.g.a.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda16
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$4(this.f$0, credentialManagerCallback, e2);
                }
            });
        } catch (i e3) {
            final aq aqVar = new aq();
            aqVar.f48105a = new GetCredentialUnknownException(e3.getMessage());
            if (e3.a() == 16) {
                aqVar.f48105a = new GetCredentialCancellationException(e3.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e3.a()))) {
                aqVar.f48105a = new GetCredentialInterruptedException(e3.getMessage());
            }
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new h.g.a.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda15
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$3(this.f$0, credentialManagerCallback, aqVar);
                }
            });
        } catch (Throwable th) {
            final GetCredentialUnknownException getCredentialUnknownException = new GetCredentialUnknownException(th.getMessage());
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new h.g.a.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda17
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$5(this.f$0, credentialManagerCallback, getCredentialUnknownException);
                }
            });
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(GetCredentialRequest getCredentialRequest, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, Executor executor, final CancellationSignal cancellationSignal) {
        final Context context;
        x.f(getCredentialRequest, "request");
        x.f(credentialManagerCallback, "callback");
        x.f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(credentialManagerCallback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal) || (context = this.contextReference.get()) == null) {
            return;
        }
        t tVarA = com.bumptech.glide.g.p.h(context).a(convertRequestToPlayServices(getCredentialRequest));
        final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$0(cancellationSignal, context, this, (o) obj);
            }
        };
        tVarA.r(new com.google.android.gms.o.o() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarA.o(new com.google.android.gms.o.m() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2(this.f$0, cancellationSignal, exc);
            }
        });
    }

    public final void setCallback(CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        x.f(credentialManagerCallback, "<set-?>");
        this.callback = credentialManagerCallback;
    }

    public final void setExecutor(Executor executor) {
        x.f(executor, "<set-?>");
        this.executor = executor;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            x.f(context, "context");
            return new CredentialProviderBeginSignInController(context);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
