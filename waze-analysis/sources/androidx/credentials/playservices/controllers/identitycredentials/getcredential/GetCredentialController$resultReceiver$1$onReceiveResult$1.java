package androidx.credentials.playservices.controllers.identitycredentials.getcredential;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import h.g.a.p;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class GetCredentialController$resultReceiver$1$onReceiveResult$1 extends u implements p<String, String, GetCredentialException> {
    GetCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // h.g.a.p
    public final GetCredentialException invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).getCredentialExceptionTypeToException$credentials_play_services_auth(str, str2);
    }
}
