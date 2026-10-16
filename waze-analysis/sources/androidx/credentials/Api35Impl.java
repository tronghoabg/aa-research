package androidx.credentials;

import android.credentials.GetCredentialException;
import android.os.OutcomeReceiver;
import android.util.Log;
import android.view.View;
import androidx.credentials.internal.FrameworkImplHelper;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Api35Impl {
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public final void clearPendingGetCredentialRequest(View view) {
        x.f(view, "view");
        view.clearPendingCredentialRequest();
    }

    public final void setPendingGetCredentialRequest(View view, GetCredentialRequest getCredentialRequest, final l<? super GetCredentialResponse, ab> lVar) {
        x.f(view, "view");
        x.f(getCredentialRequest, "request");
        x.f(lVar, "callback");
        view.setPendingCredentialRequest(FrameworkImplHelper.Companion.convertGetRequestToFrameworkClass(getCredentialRequest), new OutcomeReceiver<android.credentials.GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1
            public void onError(GetCredentialException getCredentialException) {
                x.f(getCredentialException, "error");
                Log.w("ViewHandler", "Error: " + getCredentialException.getType() + " , " + getCredentialException.getMessage());
            }

            public void onResult(android.credentials.GetCredentialResponse getCredentialResponse) {
                x.f(getCredentialResponse, "response");
                lVar.invoke(FrameworkImplHelper.Companion.convertGetResponseToJetpackClass(getCredentialResponse));
            }
        });
    }
}
