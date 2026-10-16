package androidx.credentials.webauthn;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import h.n.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AuthenticatorAssertionResponse implements AuthenticatorResponse {
    private byte[] authenticatorData;
    private final boolean be;
    private final boolean bs;
    private final byte[] clientDataHash;
    private JSONObject clientJson;
    private final byte[] credentialId;
    private final String origin;
    private final String packageName;
    private final PublicKeyCredentialRequestOptions requestOptions;
    private byte[] signature;
    private final boolean up;
    private byte[] userHandle;
    private final boolean uv;

    public AuthenticatorAssertionResponse(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr, String str, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr2, String str2, byte[] bArr3) throws JSONException {
        x.f(publicKeyCredentialRequestOptions, "requestOptions");
        x.f(bArr, "credentialId");
        x.f(str, TtmlNode.ATTR_TTS_ORIGIN);
        x.f(bArr2, "userHandle");
        this.requestOptions = publicKeyCredentialRequestOptions;
        this.credentialId = bArr;
        this.origin = str;
        this.up = z;
        this.uv = z2;
        this.be = z3;
        this.bs = z4;
        this.userHandle = bArr2;
        this.packageName = str2;
        this.clientDataHash = bArr3;
        this.clientJson = new JSONObject();
        this.signature = new byte[0];
        getClientJson().put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "webauthn.get");
        getClientJson().put("challenge", WebAuthnUtils.Companion.b64Encode(publicKeyCredentialRequestOptions.getChallenge()));
        getClientJson().put(TtmlNode.ATTR_TTS_ORIGIN, str);
        if (str2 != null) {
            getClientJson().put("androidPackageName", str2);
        }
        this.authenticatorData = defaultAuthenticatorData();
    }

    public final byte[] dataToSign() throws NoSuchAlgorithmException {
        byte[] bArrDigest = this.clientDataHash;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        if (bArrDigest == null) {
            String string = getClientJson().toString();
            x.e(string, "toString(...)");
            byte[] bytes = string.getBytes(a.f48221b);
            x.e(bytes, "getBytes(...)");
            bArrDigest = messageDigest.digest(bytes);
            x.e(bArrDigest, "digest(...)");
        }
        return c.m(this.authenticatorData, bArrDigest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] defaultAuthenticatorData() throws NoSuchAlgorithmException {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.requestOptions;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = publicKeyCredentialRequestOptions.getRpId().getBytes(a.f48221b);
        x.e(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        boolean z = this.up;
        boolean z2 = z;
        if (this.uv) {
            z2 = (z ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (this.be) {
            z3 = (z2 ? 1 : 0) | '\b';
        }
        int i2 = z3;
        if (this.bs) {
            i2 = (z3 ? 1 : 0) | 16;
        }
        x.c(bArrDigest);
        return c.m(c.m(bArrDigest, new byte[]{(byte) i2}), new byte[]{0, 0, 0, 0});
    }

    public final byte[] getAuthenticatorData() {
        return this.authenticatorData;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject getClientJson() {
        return this.clientJson;
    }

    public final byte[] getSignature() {
        return this.signature;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject json() throws JSONException {
        String string = getClientJson().toString();
        x.e(string, "toString(...)");
        byte[] bytes = string.getBytes(a.f48221b);
        x.e(bytes, "getBytes(...)");
        JSONObject jSONObject = new JSONObject();
        if (this.clientDataHash == null) {
            jSONObject.put("clientDataJSON", WebAuthnUtils.Companion.b64Encode(bytes));
        }
        jSONObject.put("authenticatorData", WebAuthnUtils.Companion.b64Encode(this.authenticatorData));
        jSONObject.put("signature", WebAuthnUtils.Companion.b64Encode(this.signature));
        jSONObject.put("userHandle", WebAuthnUtils.Companion.b64Encode(this.userHandle));
        return jSONObject;
    }

    public final void setAuthenticatorData(byte[] bArr) {
        x.f(bArr, "<set-?>");
        this.authenticatorData = bArr;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public void setClientJson(JSONObject jSONObject) {
        x.f(jSONObject, "<set-?>");
        this.clientJson = jSONObject;
    }

    public final void setSignature(byte[] bArr) {
        x.f(bArr, "<set-?>");
        this.signature = bArr;
    }

    public /* synthetic */ AuthenticatorAssertionResponse(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr, String str, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr2, String str2, byte[] bArr3, int i2, o oVar) {
        this(publicKeyCredentialRequestOptions, bArr, str, z, z2, z3, z4, bArr2, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : bArr3);
    }
}
