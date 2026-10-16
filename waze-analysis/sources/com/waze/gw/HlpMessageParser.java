package com.waze.gw;

import com.waze.gw.HlpProtocol;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class HlpMessageParser {
    private HlpMessageParser() {
    }

    static String type(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.optInt("v", -1) != 1) {
            throw new JSONException("unsupported HLP version");
        }
        String strOptString = jSONObject.optString("t", "");
        if (strOptString.length() == 0) {
            throw new JSONException("missing message type");
        }
        return strOptString;
    }

    static HlpProtocol.DevRequest parseDev(JSONObject jSONObject) throws JSONException {
        type(jSONObject);
        return HlpProtocol.parseDev(jSONObject);
    }
}
