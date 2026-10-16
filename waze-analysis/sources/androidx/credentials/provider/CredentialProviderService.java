package androidx.credentials.provider;

import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.GetCredentialException;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.ClearCredentialStateRequest;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.credentials.provider.utils.ClearCredentialUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {
    private boolean isTestMode;
    private ProviderClearCredentialStateRequest lastClearRequest;
    private BeginCreateCredentialRequest lastCreateRequest;
    private BeginGetCredentialRequest lastGetRequest;

    public final ProviderClearCredentialStateRequest getLastClearRequest() {
        return this.lastClearRequest;
    }

    public final BeginCreateCredentialRequest getLastCreateRequest() {
        return this.lastCreateRequest;
    }

    public final BeginGetCredentialRequest getLastGetRequest() {
        return this.lastGetRequest;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    public final void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest, CancellationSignal cancellationSignal, final OutcomeReceiver<android.service.credentials.BeginCreateCredentialResponse, CreateCredentialException> outcomeReceiver) {
        x.f(beginCreateCredentialRequest, "request");
        x.f(cancellationSignal, "cancellationSignal");
        x.f(outcomeReceiver, "callback");
        OutcomeReceiver<BeginCreateCredentialResponse, androidx.credentials.exceptions.CreateCredentialException> outcomeReceiver2 = new OutcomeReceiver<BeginCreateCredentialResponse, androidx.credentials.exceptions.CreateCredentialException>() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginCreateCredential$outcome$1
            public void onError(androidx.credentials.exceptions.CreateCredentialException createCredentialException) {
                x.f(createCredentialException, "error");
                outcomeReceiver.onError(new CreateCredentialException(createCredentialException.getType(), createCredentialException.getMessage()));
            }

            public void onResult(BeginCreateCredentialResponse beginCreateCredentialResponse) {
                x.f(beginCreateCredentialResponse, "response");
                outcomeReceiver.onResult(BeginCreateCredentialUtil.Companion.convertToFrameworkResponse(beginCreateCredentialResponse));
            }
        };
        BeginCreateCredentialRequest beginCreateCredentialRequestConvertToJetpackRequest$credentials = BeginCreateCredentialUtil.Companion.convertToJetpackRequest$credentials(beginCreateCredentialRequest);
        if (this.isTestMode) {
            this.lastCreateRequest = beginCreateCredentialRequestConvertToJetpackRequest$credentials;
        }
        onBeginCreateCredentialRequest(beginCreateCredentialRequestConvertToJetpackRequest$credentials, cancellationSignal, bi$$ExternalSyntheticApiModelOutline0.m128m((Object) outcomeReceiver2));
    }

    public abstract void onBeginCreateCredentialRequest(BeginCreateCredentialRequest beginCreateCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver<BeginCreateCredentialResponse, androidx.credentials.exceptions.CreateCredentialException> outcomeReceiver);

    public final void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest, CancellationSignal cancellationSignal, final OutcomeReceiver<android.service.credentials.BeginGetCredentialResponse, GetCredentialException> outcomeReceiver) {
        x.f(beginGetCredentialRequest, "request");
        x.f(cancellationSignal, "cancellationSignal");
        x.f(outcomeReceiver, "callback");
        BeginGetCredentialRequest beginGetCredentialRequestConvertToJetpackRequest$credentials = BeginGetCredentialUtil.Companion.convertToJetpackRequest$credentials(beginGetCredentialRequest);
        OutcomeReceiver<BeginGetCredentialResponse, androidx.credentials.exceptions.GetCredentialException> outcomeReceiver2 = new OutcomeReceiver<BeginGetCredentialResponse, androidx.credentials.exceptions.GetCredentialException>() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginGetCredential$outcome$1
            public void onError(androidx.credentials.exceptions.GetCredentialException getCredentialException) {
                x.f(getCredentialException, "error");
                outcomeReceiver.onError(new GetCredentialException(getCredentialException.getType(), getCredentialException.getMessage()));
            }

            public void onResult(BeginGetCredentialResponse beginGetCredentialResponse) {
                x.f(beginGetCredentialResponse, "response");
                outcomeReceiver.onResult(BeginGetCredentialUtil.Companion.convertToFrameworkResponse(beginGetCredentialResponse));
            }
        };
        if (this.isTestMode) {
            this.lastGetRequest = beginGetCredentialRequestConvertToJetpackRequest$credentials;
        }
        onBeginGetCredentialRequest(beginGetCredentialRequestConvertToJetpackRequest$credentials, cancellationSignal, bi$$ExternalSyntheticApiModelOutline0.m128m((Object) outcomeReceiver2));
    }

    public abstract void onBeginGetCredentialRequest(BeginGetCredentialRequest beginGetCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver<BeginGetCredentialResponse, androidx.credentials.exceptions.GetCredentialException> outcomeReceiver);

    public final void onClearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, final OutcomeReceiver<Void, ClearCredentialStateException> outcomeReceiver) {
        x.f(clearCredentialStateRequest, "request");
        x.f(cancellationSignal, "cancellationSignal");
        x.f(outcomeReceiver, "callback");
        OutcomeReceiver<Void, ClearCredentialException> outcomeReceiver2 = new OutcomeReceiver<Void, ClearCredentialException>() { // from class: androidx.credentials.provider.CredentialProviderService$onClearCredentialState$outcome$1
            public void onError(ClearCredentialException clearCredentialException) {
                x.f(clearCredentialException, "error");
                outcomeReceiver.onError(new ClearCredentialStateException(clearCredentialException.getType(), clearCredentialException.getMessage()));
            }

            public void onResult(Void r1) {
                outcomeReceiver.onResult(r1);
            }
        };
        ProviderClearCredentialStateRequest providerClearCredentialStateRequestConvertToJetpackRequest$credentials = ClearCredentialUtil.Companion.convertToJetpackRequest$credentials(clearCredentialStateRequest);
        if (this.isTestMode) {
            this.lastClearRequest = providerClearCredentialStateRequestConvertToJetpackRequest$credentials;
        }
        onClearCredentialStateRequest(providerClearCredentialStateRequestConvertToJetpackRequest$credentials, cancellationSignal, bi$$ExternalSyntheticApiModelOutline0.m128m((Object) outcomeReceiver2));
    }

    public abstract void onClearCredentialStateRequest(ProviderClearCredentialStateRequest providerClearCredentialStateRequest, CancellationSignal cancellationSignal, OutcomeReceiver<Void, ClearCredentialException> outcomeReceiver);

    public final void setLastClearRequest(ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        this.lastClearRequest = providerClearCredentialStateRequest;
    }

    public final void setLastCreateRequest(BeginCreateCredentialRequest beginCreateCredentialRequest) {
        this.lastCreateRequest = beginCreateCredentialRequest;
    }

    public final void setLastGetRequest(BeginGetCredentialRequest beginGetCredentialRequest) {
        this.lastGetRequest = beginGetCredentialRequest;
    }

    public final void setTestMode(boolean z) {
        this.isTestMode = z;
    }
}
