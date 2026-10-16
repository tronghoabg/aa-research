package androidx.credentials.webauthn;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.c;
import h.a.i;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.n.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AuthenticatorAttestationResponse implements AuthenticatorResponse {
    private byte[] attestationObject;
    private final boolean be;
    private final boolean bs;
    private final byte[] clientDataHash;
    private JSONObject clientJson;
    private final byte[] credentialId;
    private final byte[] credentialPublicKey;
    private final String origin;
    private final String packageName;
    private final PublicKeyCredentialCreationOptions requestOptions;
    private final boolean up;
    private final boolean uv;

    public AuthenticatorAttestationResponse(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, byte[] bArr, byte[] bArr2, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, byte[] bArr3) throws JSONException {
        x.f(publicKeyCredentialCreationOptions, "requestOptions");
        x.f(bArr, "credentialId");
        x.f(bArr2, "credentialPublicKey");
        x.f(str, TtmlNode.ATTR_TTS_ORIGIN);
        this.requestOptions = publicKeyCredentialCreationOptions;
        this.credentialId = bArr;
        this.credentialPublicKey = bArr2;
        this.origin = str;
        this.up = z;
        this.uv = z2;
        this.be = z3;
        this.bs = z4;
        this.packageName = str2;
        this.clientDataHash = bArr3;
        this.clientJson = new JSONObject();
        getClientJson().put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "webauthn.create");
        getClientJson().put("challenge", WebAuthnUtils.Companion.b64Encode(publicKeyCredentialCreationOptions.getChallenge()));
        getClientJson().put(TtmlNode.ATTR_TTS_ORIGIN, str);
        if (str2 != null) {
            getClientJson().put("androidPackageName", str2);
        }
        this.attestationObject = defaultAttestationObject$credentials();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v5 */
    private final byte[] authData() throws NoSuchAlgorithmException {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.requestOptions;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = publicKeyCredentialCreationOptions.getRp().getId().getBytes(a.f48221b);
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
        ?? r1 = z3;
        if (this.bs) {
            r1 = (z3 ? 1 : 0) | 16;
        }
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = 0;
        }
        int length = this.credentialId.length;
        byte[] bArr2 = {(byte) (length >> 8), (byte) length};
        x.c(bArrDigest);
        return c.m(c.m(c.m(c.m(c.m(c.m(bArrDigest, new byte[]{(byte) (r1 | 64)}), new byte[]{0, 0, 0, 0}), bArr), bArr2), this.credentialId), this.credentialPublicKey);
    }

    public final byte[] defaultAttestationObject$credentials() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fmt", "none");
        linkedHashMap.put("attStmt", r.j());
        linkedHashMap.put("authData", authData());
        return new Cbor().encode(linkedHashMap);
    }

    public final byte[] getAttestationObject() {
        return this.attestationObject;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject getClientJson() {
        return this.clientJson;
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
        jSONObject.put("attestationObject", WebAuthnUtils.Companion.b64Encode(this.attestationObject));
        jSONObject.put("transports", new JSONArray((Collection) i.i("internal", "hybrid")));
        return jSONObject;
    }

    public final void setAttestationObject(byte[] bArr) {
        x.f(bArr, "<set-?>");
        this.attestationObject = bArr;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public void setClientJson(JSONObject jSONObject) {
        x.f(jSONObject, "<set-?>");
        this.clientJson = jSONObject;
    }

    public /* synthetic */ AuthenticatorAttestationResponse(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, byte[] bArr, byte[] bArr2, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, byte[] bArr3, int i2, o oVar) {
        this(publicKeyCredentialCreationOptions, bArr, bArr2, str, z, z2, z3, z4, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : bArr3);
    }
}
