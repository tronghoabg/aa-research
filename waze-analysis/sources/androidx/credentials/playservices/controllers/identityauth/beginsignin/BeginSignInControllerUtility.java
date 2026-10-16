package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.e;
import com.google.android.gms.auth.api.identity.f;
import com.google.android.gms.auth.api.identity.k;
import com.google.android.gms.auth.api.identity.m;
import com.google.android.libraries.c.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final f convertToGoogleIdTokenOption(a aVar) {
            throw null;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            x.e(context.getPackageManager(), "getPackageManager(...)");
            return r1.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long j2) {
            return j2 < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final m constructBeginSignInRequest$credentials_play_services_auth(GetCredentialRequest getCredentialRequest, Context context) {
            x.f(getCredentialRequest, "request");
            x.f(context, "context");
            e eVar = new e();
            long jDetermineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            boolean z = false;
            boolean z2 = false;
            for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
                if (credentialOption instanceof GetPasswordOption) {
                    k kVar = new k();
                    kVar.b(true);
                    eVar.f(kVar.a());
                    z = z || credentialOption.isAutoSelectAllowed();
                } else if ((credentialOption instanceof GetPublicKeyCredentialOption) && !z2) {
                    if (needsBackwardsCompatibleRequest(jDetermineDeviceGMSVersionCode)) {
                        eVar.e(PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyRequest((GetPublicKeyCredentialOption) credentialOption));
                    } else {
                        eVar.d(PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyJsonRequest((GetPublicKeyCredentialOption) credentialOption));
                    }
                    z2 = true;
                } else if (credentialOption instanceof a) {
                    eVar.c(convertToGoogleIdTokenOption((a) credentialOption));
                    if (!z) {
                        throw null;
                    }
                } else {
                    continue;
                }
            }
            if (jDetermineDeviceGMSVersionCode > BeginSignInControllerUtility.AUTH_MIN_VERSION_PREFER_IMME_CRED) {
                eVar.g(getCredentialRequest.preferImmediatelyAvailableCredentials());
            }
            eVar.b(z);
            m mVarA = eVar.a();
            x.e(mVarA, "build(...)");
            return mVarA;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
