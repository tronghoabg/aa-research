package androidx.credentials.playservices.controllers.blockstore.createrestorecredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreateRestoreCredentialRequest;
import androidx.credentials.CreateRestoreCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException;
import androidx.credentials.exceptions.restorecredential.E2eeUnavailableException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.a.b.b;
import com.google.android.gms.auth.a.b.c;
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
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<CreateRestoreCredentialRequest, b, c, CreateCredentialResponse, CreateCredentialException> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(Context context) {
        super(context);
        x.f(context, "context");
        this.context = context;
    }

    static final ab invokePlayServices$lambda$0(CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, c cVar) {
        try {
            x.c(cVar);
            final CreateCredentialResponse createCredentialResponseConvertResponseToCredentialManager = credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(cVar);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda7
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$0(executor, credentialManagerCallback, createCredentialResponseConvertResponseToCredentialManager);
                }
            });
        } catch (Exception e2) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda8
                @Override // h.g.a.a
                public final Object invoke() {
                    return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1(executor, credentialManagerCallback, e2);
                }
            });
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final CreateCredentialResponse createCredentialResponse) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(createCredentialResponse);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$0$1(Executor executor, final CredentialManagerCallback credentialManagerCallback, final Exception exc) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1$0(credentialManagerCallback, exc);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(CredentialManagerCallback credentialManagerCallback, Exception exc) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException(exc.getMessage()));
    }

    static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Exception exc) {
        x.f(exc, "e");
        final aq aqVar = new aq();
        aqVar.f48105a = new CreateCredentialUnknownException("Create restore credential failed for unknown reason, failure: ".concat(String.valueOf(exc.getMessage())));
        if (exc instanceof i) {
            i iVar = (i) exc;
            switch (iVar.a()) {
                case 40201:
                    aqVar.f48105a = new CreateCredentialUnknownException("The restore credential internal service had a failure, failure: ".concat(String.valueOf(exc.getMessage())));
                    break;
                case 40202:
                    aqVar.f48105a = new CreateRestoreCredentialDomException(new DataError(), "The request did not match the fido spec, failure: ".concat(String.valueOf(exc.getMessage())));
                    break;
                case 40203:
                    aqVar.f48105a = new E2eeUnavailableException("E2ee is not available on the device. Check whether the backup and screen lock are enabled.");
                    break;
                default:
                    aqVar.f48105a = new CreateCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + iVar.a());
                    break;
            }
        }
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, aqVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab invokePlayServices$lambda$2$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final aq aqVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0$0(credentialManagerCallback, aqVar);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialManagerCallback credentialManagerCallback, aq aqVar) {
        credentialManagerCallback.onError(aqVar.f48105a);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public b convertRequestToPlayServices(CreateRestoreCredentialRequest createRestoreCredentialRequest) {
        x.f(createRestoreCredentialRequest, "request");
        return new b(createRestoreCredentialRequest.getCredentialData());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public CreateCredentialResponse convertResponseToCredentialManager(c cVar) {
        x.f(cVar, "response");
        return CreateRestoreCredentialResponse.Companion.createFrom(cVar.a());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(CreateRestoreCredentialRequest createRestoreCredentialRequest, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        x.f(createRestoreCredentialRequest, "request");
        x.f(credentialManagerCallback, "callback");
        x.f(executor, "executor");
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        t tVarB = ad.c(this.context).b(convertRequestToPlayServices(createRestoreCredentialRequest));
        final l lVar = new l() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0(this.f$0, cancellationSignal, executor, credentialManagerCallback, (c) obj);
            }
        };
        tVarB.r(new o() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        tVarB.o(new m() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }
}
