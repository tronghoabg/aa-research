package androidx.credentials.webauthn;

import android.util.Base64;
import androidx.credentials.provider.CallingAppInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WebAuthnUtils {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final String appInfoToOrigin(CallingAppInfo callingAppInfo) {
            x.f(callingAppInfo, "info");
            return WebAuthnUtilsApi28.Companion.appInfoToOrigin(callingAppInfo);
        }

        public final byte[] b64Decode(String str) {
            x.f(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            x.e(bArrDecode, "decode(...)");
            return bArrDecode;
        }

        public final String b64Encode(byte[] bArr) {
            x.f(bArr, "data");
            String strEncodeToString = Base64.encodeToString(bArr, 11);
            x.e(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
