package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.AbortError;
import androidx.credentials.exceptions.domerrors.ConstraintError;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NetworkError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.domerrors.NotReadableError;
import androidx.credentials.exceptions.domerrors.NotSupportedError;
import androidx.credentials.exceptions.domerrors.SecurityError;
import androidx.credentials.exceptions.domerrors.TimeoutError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.auth.api.identity.g;
import com.google.android.gms.auth.api.identity.i;
import com.google.android.gms.auth.api.identity.j;
import com.google.android.gms.auth.api.identity.w;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.fido.a.a.a.aa;
import com.google.android.gms.fido.a.a.a.ae;
import com.google.android.gms.fido.a.a.a.aj;
import com.google.android.gms.fido.a.a.a.ak;
import com.google.android.gms.fido.a.a.a.al;
import com.google.android.gms.fido.a.a.a.an;
import com.google.android.gms.fido.a.a.a.ap;
import com.google.android.gms.fido.a.a.a.aq;
import com.google.android.gms.fido.a.a.a.at;
import com.google.android.gms.fido.a.a.a.aw;
import com.google.android.gms.fido.a.a.a.bb;
import com.google.android.gms.fido.a.a.a.d;
import com.google.android.gms.fido.a.a.a.n;
import com.google.android.gms.fido.a.a.a.p;
import com.google.android.gms.fido.a.a.a.q;
import com.google.android.gms.fido.a.a.a.t;
import com.google.android.gms.fido.a.a.a.z;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.common.b;
import h.a.r;
import h.g.b.x;
import h.k;
import h.n.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    public static final Companion Companion = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = TtmlNode.ATTR_ID;
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY;
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = "appid";
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = HintConstants.AUTOFILL_HINT_NAME;
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = "alg";
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";
    private static final LinkedHashMap<z, DomError> orderedErrorCodeToExceptions = r.i(new k(z.UNKNOWN_ERR, new UnknownError()), new k(z.ABORT_ERR, new AbortError()), new k(z.ATTESTATION_NOT_PRIVATE_ERR, new NotReadableError()), new k(z.CONSTRAINT_ERR, new ConstraintError()), new k(z.DATA_ERR, new DataError()), new k(z.INVALID_STATE_ERR, new InvalidStateError()), new k(z.ENCODING_ERR, new EncodingError()), new k(z.NETWORK_ERR, new NetworkError()), new k(z.NOT_ALLOWED_ERR, new NotAllowedError()), new k(z.NOT_SUPPORTED_ERR, new NotSupportedError()), new k(z.SECURITY_ERR, new SecurityError()), new k(z.TIMEOUT_ERR, new TimeoutError()));

    /* compiled from: WazeSource */
    final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(PackageInfo packageInfo) {
            x.f(packageInfo, "info");
            return packageInfo.getLongVersionCode();
        }
    }

    public static final al convert(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, Context context) {
        return Companion.convert(createPublicKeyCredentialRequest, context);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final byte[] getChallenge(JSONObject jSONObject) throws JSONException {
            String strOptString = jSONObject.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth(), "");
            x.c(strOptString);
            if (strOptString.length() != 0) {
                return b64Decode(strOptString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long j2) throws PackageManager.NameNotFoundException {
            if (h.b().l(context) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            x.e(packageManager, "getPackageManager(...)");
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
            x.e(packageInfo, "getPackageInfo(...)");
            return GetGMSVersion.getVersionLong(packageInfo) > j2;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) throws JSONException {
            x.f(bArr, "clientDataJSON");
            x.f(bArr2, "attestationObject");
            x.f(strArr, "transportArray");
            x.f(jSONObject, "json");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth(), b64Encode(bArr));
            jSONObject2.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth(), b64Encode(bArr2));
            jSONObject2.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth(), new JSONArray(strArr));
            jSONObject.put(getJSON_KEY_RESPONSE$credentials_play_services_auth(), jSONObject2);
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

        public final GetCredentialException beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth(z zVar, String str) {
            x.f(zVar, "code");
            DomError domError = getOrderedErrorCodeToExceptions$credentials_play_services_auth().get(zVar);
            return domError == null ? new GetPublicKeyCredentialDomException(new UnknownError(), "unknown fido gms exception - ".concat(String.valueOf(str))) : (zVar == z.NOT_ALLOWED_ERR && str != null && o.F(str, "Unable to get sync account", false)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(domError, str);
        }

        public final boolean checkAlgSupported(int i2) {
            try {
                t.b(i2);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final al convert(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, Context context) {
            x.f(createPublicKeyCredentialRequest, "request");
            x.f(context, "context");
            return isDeviceGMSVersionOlderThan(context, PublicKeyCredentialControllerUtility.AUTH_MIN_VERSION_JSON_CREATE) ? new al(createPublicKeyCredentialRequest.getRequestJson()) : convertJSON$credentials_play_services_auth(new JSONObject(createPublicKeyCredentialRequest.getRequestJson()));
        }

        public final al convertJSON$credentials_play_services_auth(JSONObject jSONObject) throws JSONException, CreatePublicKeyCredentialDomException {
            x.f(jSONObject, "json");
            ak akVar = new ak();
            parseRequiredChallengeAndUser$credentials_play_services_auth(jSONObject, akVar);
            parseRequiredRpAndParams$credentials_play_services_auth(jSONObject, akVar);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth(jSONObject, akVar);
            parseOptionalTimeout$credentials_play_services_auth(jSONObject, akVar);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth(jSONObject, akVar);
            parseOptionalExtensions$credentials_play_services_auth(jSONObject, akVar);
            al alVarA = akVar.a();
            x.e(alVarA, "build(...)");
            return alVarA;
        }

        public final com.google.android.gms.auth.api.identity.h convertToPlayAuthPasskeyJsonRequest(GetPublicKeyCredentialOption getPublicKeyCredentialOption) {
            x.f(getPublicKeyCredentialOption, "option");
            g gVar = new g();
            gVar.c(true);
            gVar.b(getPublicKeyCredentialOption.getRequestJson());
            com.google.android.gms.auth.api.identity.h hVarA = gVar.a();
            x.e(hVarA, "build(...)");
            return hVarA;
        }

        public final j convertToPlayAuthPasskeyRequest(GetPublicKeyCredentialOption getPublicKeyCredentialOption) throws JSONException {
            x.f(getPublicKeyCredentialOption, "option");
            JSONObject jSONObject = new JSONObject(getPublicKeyCredentialOption.getRequestJson());
            String strOptString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth(), "");
            x.c(strOptString);
            if (strOptString.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            byte[] challenge = getChallenge(jSONObject);
            i iVar = new i();
            iVar.d(true);
            iVar.c(strOptString);
            iVar.b(challenge);
            j jVarA = iVar.a();
            x.e(jVarA, "build(...)");
            return jVarA;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap<z, DomError> getOrderedErrorCodeToExceptions$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth(JSONObject jSONObject, ak akVar) throws JSONException {
            x.f(jSONObject, "json");
            x.f(akVar, "builder");
            if (jSONObject.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth())) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth());
                q qVar = new q();
                boolean zOptBoolean = jSONObject2.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth(), false);
                String strOptString = jSONObject2.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth(), "");
                x.c(strOptString);
                aw awVarA = strOptString.length() > 0 ? aw.a(strOptString) : null;
                qVar.c(Boolean.valueOf(zOptBoolean));
                qVar.d(awVarA);
                String strOptString2 = jSONObject2.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth(), "");
                x.c(strOptString2);
                if (strOptString2.length() > 0) {
                    qVar.b(d.a(strOptString2));
                }
                akVar.e(qVar.a());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth(JSONObject jSONObject, ak akVar) throws JSONException {
            x.f(jSONObject, "json");
            x.f(akVar, "builder");
            if (jSONObject.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth())) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth());
                com.google.android.gms.fido.a.a.a.h hVar = new com.google.android.gms.fido.a.a.a.h();
                String strOptString = jSONObject2.optString(getJSON_KEY_APPID$credentials_play_services_auth(), "");
                x.c(strOptString);
                if (strOptString.length() > 0) {
                    hVar.d(new aa(strOptString));
                }
                if (jSONObject2.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth(), false)) {
                    hVar.h(new ae(true));
                }
                if (jSONObject2.optBoolean("uvm", false)) {
                    hVar.m(new bb(true));
                }
                akVar.d(hVar.a());
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth(JSONObject jSONObject, ak akVar) {
            x.f(jSONObject, "json");
            x.f(akVar, "builder");
            if (jSONObject.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth())) {
                akVar.l(Double.valueOf(jSONObject.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth()) / 1000.0d));
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth(JSONObject jSONObject, ak akVar) throws JSONException, CreatePublicKeyCredentialDomException {
            ArrayList arrayList;
            x.f(jSONObject, "json");
            x.f(akVar, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth())) {
                JSONArray jSONArray = jSONObject.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth());
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    String string = jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth());
                    x.e(string, "getString(...)");
                    byte[] bArrB64Decode = b64Decode(string);
                    String string2 = jSONObject2.getString(getJSON_KEY_TYPE$credentials_play_services_auth());
                    x.c(string2);
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject2.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject2.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth());
                        int length2 = jSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            try {
                                arrayList.add(Transport.a(jSONArray2.getString(i3)));
                            } catch (b e2) {
                                throw new CreatePublicKeyCredentialDomException(new EncodingError(), e2.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new an(string2, bArrB64Decode, arrayList));
                }
            }
            akVar.g(arrayList2);
            String strOptString = jSONObject.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth(), "none");
            x.c(strOptString);
            akVar.b(com.google.android.gms.fido.a.a.a.g.a(strOptString.length() != 0 ? strOptString : "none"));
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth(JSONObject jSONObject, ak akVar) throws JSONException {
            x.f(jSONObject, "json");
            x.f(akVar, "builder");
            akVar.f(getChallenge(jSONObject));
            JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth());
            String string = jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth());
            x.e(string, "getString(...)");
            byte[] bArrB64Decode = b64Decode(string);
            String string2 = jSONObject2.getString(getJSON_KEY_NAME$credentials_play_services_auth());
            String string3 = jSONObject2.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth());
            String strOptString = jSONObject2.optString(getJSON_KEY_ICON$credentials_play_services_auth(), "");
            x.c(string3);
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            x.c(string2);
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            akVar.m(new at(bArrB64Decode, string2, strOptString, string3));
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth(JSONObject jSONObject, ak akVar) throws JSONException {
            x.f(jSONObject, "json");
            x.f(akVar, "builder");
            JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth());
            String string = jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth());
            String strOptString = jSONObject2.optString(getJSON_KEY_NAME$credentials_play_services_auth(), "");
            String strOptString2 = jSONObject2.optString(getJSON_KEY_ICON$credentials_play_services_auth(), "");
            x.c(strOptString2);
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            x.c(strOptString);
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            x.c(string);
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            akVar.k(new aq(string, strOptString, strOptString2));
            JSONArray jSONArray = jSONObject.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                int i3 = (int) jSONObject3.getLong(getJSON_KEY_ALG$credentials_play_services_auth());
                String strOptString3 = jSONObject3.optString(getJSON_KEY_TYPE$credentials_play_services_auth(), "");
                x.c(strOptString3);
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i3)) {
                    arrayList.add(new ap(strOptString3, i3));
                }
            }
            akVar.i(arrayList);
        }

        public final CreateCredentialException publicKeyCredentialResponseContainsError(aj ajVar) {
            x.f(ajVar, "cred");
            a aVarC = ajVar.c();
            x.e(aVarC, "getResponse(...)");
            if (!(aVarC instanceof p)) {
                return null;
            }
            p pVar = (p) aVarC;
            z zVarA = pVar.a();
            x.e(zVarA, "getErrorCode(...)");
            DomError domError = getOrderedErrorCodeToExceptions$credentials_play_services_auth().get(zVarA);
            String strB = pVar.b();
            return domError == null ? new CreatePublicKeyCredentialDomException(new UnknownError(), "unknown fido gms exception - ".concat(String.valueOf(strB))) : (zVarA == z.NOT_ALLOWED_ERR && strB != null && o.F(strB, "Unable to get sync account", false)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(domError, strB);
        }

        public final String toAssertPasskeyResponse(w wVar) throws GetCredentialException {
            x.f(wVar, "cred");
            JSONObject jSONObject = new JSONObject();
            aj ajVarB = wVar.b();
            a aVarC = ajVarB != null ? ajVarB.c() : null;
            x.c(aVarC);
            if (aVarC instanceof p) {
                p pVar = (p) aVarC;
                z zVarA = pVar.a();
                x.e(zVarA, "getErrorCode(...)");
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth(zVarA, pVar.b());
            }
            if (!(aVarC instanceof n)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(String.valueOf(aVarC.getClass().getName())));
                String string = jSONObject.toString();
                x.e(string, "toString(...)");
                return string;
            }
            try {
                String strA = ajVarB.a();
                x.e(strA, "toJson(...)");
                return strA;
            } catch (Throwable th) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: ".concat(String.valueOf(th.getMessage())));
            }
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
