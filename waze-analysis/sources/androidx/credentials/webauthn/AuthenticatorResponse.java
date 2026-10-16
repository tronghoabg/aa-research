package androidx.credentials.webauthn;

import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AuthenticatorResponse {
    JSONObject getClientJson();

    JSONObject json();

    void setClientJson(JSONObject jSONObject);
}
