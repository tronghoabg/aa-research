package androidx.credentials.webauthn;

import androidx.autofill.HintConstants;
import androidx.credentials.webauthn.WebAuthnUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialCreationOptions {
    private String attestation;
    private AuthenticatorSelectionCriteria authenticatorSelection;
    private final byte[] challenge;
    private List<PublicKeyCredentialDescriptor> excludeCredentials;
    private final JSONObject json;
    private final List<PublicKeyCredentialParameters> pubKeyCredParams;
    private final PublicKeyCredentialRpEntity rp;
    private long timeout;
    private final PublicKeyCredentialUserEntity user;

    public PublicKeyCredentialCreationOptions(String str) throws JSONException {
        x.f(str, "requestJson");
        JSONObject jSONObject = new JSONObject(str);
        this.json = jSONObject;
        String string = jSONObject.getString("challenge");
        WebAuthnUtils.Companion companion = WebAuthnUtils.Companion;
        x.c(string);
        this.challenge = companion.b64Decode(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String string2 = jSONObject2.getString(HintConstants.AUTOFILL_HINT_NAME);
        x.e(string2, "getString(...)");
        String string3 = jSONObject2.getString(TtmlNode.ATTR_ID);
        x.e(string3, "getString(...)");
        this.rp = new PublicKeyCredentialRpEntity(string2, string3);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        WebAuthnUtils.Companion companion2 = WebAuthnUtils.Companion;
        String string4 = jSONObject3.getString(TtmlNode.ATTR_ID);
        x.e(string4, "getString(...)");
        byte[] bArrB64Decode = companion2.b64Decode(string4);
        String string5 = jSONObject3.getString(HintConstants.AUTOFILL_HINT_NAME);
        x.e(string5, "getString(...)");
        String string6 = jSONObject3.getString("displayName");
        x.e(string6, "getString(...)");
        this.user = new PublicKeyCredentialUserEntity(string5, bArrB64Decode, string6);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
            String string7 = jSONObject4.getString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.e(string7, "getString(...)");
            arrayList.add(new PublicKeyCredentialParameters(string7, jSONObject4.getLong("alg")));
        }
        this.pubKeyCredParams = i.ao(arrayList);
        this.timeout = this.json.optLong("timeout", 0L);
        this.excludeCredentials = i.h();
        this.authenticatorSelection = new AuthenticatorSelectionCriteria("platform", "required", false, null, 12, null);
        String strOptString = this.json.optString("attestation", "none");
        x.e(strOptString, "optString(...)");
        this.attestation = strOptString;
    }

    public final String getAttestation() {
        return this.attestation;
    }

    public final AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.authenticatorSelection;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final List<PublicKeyCredentialDescriptor> getExcludeCredentials() {
        return this.excludeCredentials;
    }

    public final JSONObject getJson() {
        return this.json;
    }

    public final List<PublicKeyCredentialParameters> getPubKeyCredParams() {
        return this.pubKeyCredParams;
    }

    public final PublicKeyCredentialRpEntity getRp() {
        return this.rp;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final PublicKeyCredentialUserEntity getUser() {
        return this.user;
    }

    public final void setAttestation(String str) {
        x.f(str, "<set-?>");
        this.attestation = str;
    }

    public final void setAuthenticatorSelection(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
        x.f(authenticatorSelectionCriteria, "<set-?>");
        this.authenticatorSelection = authenticatorSelectionCriteria;
    }

    public final void setExcludeCredentials(List<PublicKeyCredentialDescriptor> list) {
        x.f(list, "<set-?>");
        this.excludeCredentials = list;
    }

    public final void setTimeout(long j2) {
        this.timeout = j2;
    }
}
