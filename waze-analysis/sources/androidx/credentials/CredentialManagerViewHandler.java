package androidx.credentials;

import android.os.Build;
import android.view.View;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialManagerViewHandler {
    private static final String TAG = "ViewHandler";

    public static final PendingGetCredentialRequest getPendingGetCredentialRequest(View view) {
        x.f(view, "<this>");
        Object tag = view.getTag(com.waze.R.id.androidx_credential_pendingCredentialRequest);
        if (tag instanceof PendingGetCredentialRequest) {
            return (PendingGetCredentialRequest) tag;
        }
        return null;
    }

    public static /* synthetic */ void getPendingGetCredentialRequest$annotations(View view) {
    }

    public static final void setPendingGetCredentialRequest(View view, PendingGetCredentialRequest pendingGetCredentialRequest) {
        x.f(view, "<this>");
        view.setTag(com.waze.R.id.androidx_credential_pendingCredentialRequest, pendingGetCredentialRequest);
        if (pendingGetCredentialRequest != null) {
            if (Build.VERSION.SDK_INT >= 35 || (Build.VERSION.SDK_INT == 34 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                Api35Impl.INSTANCE.setPendingGetCredentialRequest(view, pendingGetCredentialRequest.getRequest(), pendingGetCredentialRequest.getCallback());
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 35 || (Build.VERSION.SDK_INT == 34 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            Api35Impl.INSTANCE.clearPendingGetCredentialRequest(view);
        }
    }
}
