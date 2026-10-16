package androidx.credentials.playservices.controllers.blockstore.getrestorecredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetRestoreCredentialOption;
import androidx.credentials.RestoreCredential;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.a.b.d;
import com.google.android.gms.auth.a.b.e;
import com.google.android.gms.common.ad;
import com.google.android.gms.common.api.i;
import com.google.android.gms.o.m;
import com.google.android.gms.o.o;
import com.google.android.gms.o.t;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.x;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<GetCredentialRequest, d, e, GetCredentialResponse, GetCredentialException> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(Context context) {
        super(context);
        x.f(context, "context");
        this.context = context;
    }

    static final ab invokePlayServices$lambda$0(CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, e eVar) {
        try {
            x.c(eVar);
            final GetCredentialResponse getCredentialResponseConvertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(eVar);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda5
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$0(executor, credentialManagerCallback, getCredentialResponseConvertResponseToCredentialManager);
                }
            });
        } catch (Exception e2) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda6
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1(executor, credentialManagerCallback, e2);
                }
            });
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final GetCredentialResponse getCredentialResponse) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(getCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$1(Executor executor, final CredentialManagerCallback credentialManagerCallback, final Exception exc) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1$0(credentialManagerCallback, exc);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(CredentialManagerCallback credentialManagerCallback, Exception exc) {
        credentialManagerCallback.onError(exc instanceof NoCredentialException ? (GetCredentialException) exc : (GetCredentialException) new GetCredentialUnknownException(exc.getMessage()));
    }

    static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Exception exc) {
        x.f(exc, "e");
        final aq aqVar = new aq();
        aqVar.f48105a = new GetCredentialUnknownException("Get restore credential failed for unknown reason, failure: ".concat(String.valueOf(exc.getMessage())));
        if (exc instanceof i) {
            i iVar = (i) exc;
            if (iVar.a() == 40201) {
                aqVar.f48105a = new GetCredentialUnknownException("The restore credential internal service had a failure, failure: ".concat(String.valueOf(exc.getMessage())));
            } else {
                aqVar.f48105a = new GetCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + iVar.a());
            }
        }
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda7
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, aqVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$2$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final aq aqVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0$0(credentialManagerCallback, aqVar);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialManagerCallback credentialManagerCallback, aq aqVar) {
        credentialManagerCallback.onError(aqVar.f48105a);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public d convertRequestToPlayServices(GetCredentialRequest getCredentialRequest) {
        GetRestoreCredentialOption getRestoreCredentialOption;
        GetRestoreCredentialOption getRestoreCredentialOption2;
        x.f(getCredentialRequest, "request");
        Iterator<CredentialOption> it = getCredentialRequest.getCredentialOptions().iterator();
        while (true) {
            getRestoreCredentialOption = null;
            if (!it.hasNext()) {
                getRestoreCredentialOption2 = null;
                break;
            }
            CredentialOption next = it.next();
            if (next instanceof GetRestoreCredentialOption) {
                getRestoreCredentialOption2 = (GetRestoreCredentialOption) next;
                break;
            }
        }
        if (getRestoreCredentialOption2 == null) {
            x.j("credentialOption");
        } else {
            getRestoreCredentialOption = getRestoreCredentialOption2;
        }
        return new d(getRestoreCredentialOption.getRequestData());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialResponse convertResponseToCredentialManager(e eVar) {
        x.f(eVar, "response");
        return new GetCredentialResponse(Credential.Companion.createFrom(RestoreCredential.TYPE_RESTORE_CREDENTIAL, eVar.a()));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(GetCredentialRequest getCredentialRequest, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        x.f(getCredentialRequest, "request");
        x.f(credentialManagerCallback, "callback");
        x.f(executor, "executor");
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        t tVarC = ad.c(this.context).c(convertRequestToPlayServices(getCredentialRequest));
        final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0(this.f$0, cancellationSignal, executor, credentialManagerCallback, (e) obj);
            }
        };
        tVarC.r(new o() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarC.o(new m() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }
}
