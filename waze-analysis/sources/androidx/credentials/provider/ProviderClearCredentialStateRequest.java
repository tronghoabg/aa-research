package androidx.credentials.provider;

import android.os.Bundle;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ProviderClearCredentialStateRequest {
    public static final Companion Companion = new Companion(null);
    private final CallingAppInfo callingAppInfo;

    public ProviderClearCredentialStateRequest(CallingAppInfo callingAppInfo) {
        x.f(callingAppInfo, "callingAppInfo");
        this.callingAppInfo = callingAppInfo;
    }

    public static final Bundle asBundle(ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        return Companion.asBundle(providerClearCredentialStateRequest);
    }

    public static final ProviderClearCredentialStateRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bundle asBundle(ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
            x.f(providerClearCredentialStateRequest, "request");
            Bundle bundle = new Bundle();
            CallingAppInfo.Companion.setCallingAppInfo$credentials(bundle, providerClearCredentialStateRequest.getCallingAppInfo());
            return bundle;
        }

        public final ProviderClearCredentialStateRequest fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            CallingAppInfo callingAppInfoExtractCallingAppInfo = CallingAppInfo.Companion.extractCallingAppInfo(bundle);
            if (callingAppInfoExtractCallingAppInfo != null) {
                return new ProviderClearCredentialStateRequest(callingAppInfoExtractCallingAppInfo);
            }
            throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
