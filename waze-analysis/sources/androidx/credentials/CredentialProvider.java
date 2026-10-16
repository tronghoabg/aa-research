package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface CredentialProvider {

    /* compiled from: WazeSource */
    /* renamed from: androidx.credentials.CredentialProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onGetCredential(CredentialProvider credentialProvider, Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
            x.f(context, "context");
            x.f(pendingGetCredentialHandle, "pendingGetCredentialHandle");
            x.f(executor, "executor");
            x.f(credentialManagerCallback, "callback");
        }

        public static void $default$onPrepareCredential(CredentialProvider credentialProvider, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
            x.f(getCredentialRequest, "request");
            x.f(executor, "executor");
            x.f(credentialManagerCallback, "callback");
        }

        public static void $default$onSignalCredentialState(CredentialProvider credentialProvider, SignalCredentialStateRequest signalCredentialStateRequest, Executor executor, CredentialManagerCallback credentialManagerCallback) {
            x.f(signalCredentialStateRequest, "request");
            x.f(executor, "executor");
            x.f(credentialManagerCallback, "callback");
        }
    }

    boolean isAvailableOnDevice();

    void onClearCredential(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback);

    void onCreateCredential(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback);

    void onGetCredential(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback);

    void onGetCredential(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback);

    void onPrepareCredential(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> credentialManagerCallback);

    void onSignalCredentialState(SignalCredentialStateRequest signalCredentialStateRequest, Executor executor, CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException> credentialManagerCallback);
}
