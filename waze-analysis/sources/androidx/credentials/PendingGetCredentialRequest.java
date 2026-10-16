package androidx.credentials;

import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PendingGetCredentialRequest {
    private final l<GetCredentialResponse, ab> callback;
    private final GetCredentialRequest request;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingGetCredentialRequest(GetCredentialRequest getCredentialRequest, l<? super GetCredentialResponse, ab> lVar) {
        x.f(getCredentialRequest, "request");
        x.f(lVar, "callback");
        this.request = getCredentialRequest;
        this.callback = lVar;
    }

    public final l<GetCredentialResponse, ab> getCallback() {
        return this.callback;
    }

    public final GetCredentialRequest getRequest() {
        return this.request;
    }
}
