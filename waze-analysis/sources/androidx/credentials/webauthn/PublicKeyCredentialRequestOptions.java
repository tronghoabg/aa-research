package androidx.credentials.webauthn;

import androidx.credentials.webauthn.WebAuthnUtils;
import h.g.b.x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialRequestOptions {
    private final byte[] challenge;
    private final JSONObject json;
    private final String rpId;
    private final long timeout;
    private final String userVerification;

    public PublicKeyCredentialRequestOptions(String str) throws JSONException {
        x.f(str, "requestJson");
        JSONObject jSONObject = new JSONObject(str);
        this.json = jSONObject;
        String string = jSONObject.getString("challenge");
        WebAuthnUtils.Companion companion = WebAuthnUtils.Companion;
        x.c(string);
        this.challenge = companion.b64Decode(string);
        this.timeout = jSONObject.optLong("timeout", 0L);
        String strOptString = jSONObject.optString("rpId", "");
        x.e(strOptString, "optString(...)");
        this.rpId = strOptString;
        String strOptString2 = jSONObject.optString("userVerification", "preferred");
        x.e(strOptString2, "optString(...)");
        this.userVerification = strOptString2;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final JSONObject getJson() {
        return this.json;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }
}
