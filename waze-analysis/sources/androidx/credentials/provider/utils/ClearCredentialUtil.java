package androidx.credentials.provider.utils;

import android.content.pm.SigningInfo;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.ProviderClearCredentialStateRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ClearCredentialUtil {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ProviderClearCredentialStateRequest convertToJetpackRequest$credentials(ClearCredentialStateRequest clearCredentialStateRequest) {
            x.f(clearCredentialStateRequest, "request");
            CallingAppInfo.Companion companion = CallingAppInfo.Companion;
            String packageName = clearCredentialStateRequest.getCallingAppInfo().getPackageName();
            x.e(packageName, "getPackageName(...)");
            SigningInfo signingInfo = clearCredentialStateRequest.getCallingAppInfo().getSigningInfo();
            x.e(signingInfo, "getSigningInfo(...)");
            return new ProviderClearCredentialStateRequest(companion.create(packageName, signingInfo, clearCredentialStateRequest.getCallingAppInfo().getOrigin()));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
