package androidx.credentials.webauthn;

import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.webauthn.WebAuthnUtils;
import h.g.b.o;
import h.g.b.x;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WebAuthnUtilsApi28 {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final String appInfoToOrigin(CallingAppInfo callingAppInfo) {
            x.f(callingAppInfo, "info");
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(callingAppInfo.getSigningInfo().getApkContentsSigners()[0].toByteArray());
            WebAuthnUtils.Companion companion = WebAuthnUtils.Companion;
            x.c(bArrDigest);
            return "android:apk-key-hash:".concat(String.valueOf(companion.b64Encode(bArrDigest)));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
