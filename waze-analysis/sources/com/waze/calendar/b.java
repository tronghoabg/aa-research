package com.waze.calendar;

import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.copilot.presentation.CopilotOperationResponse;
import com.waze.copilot.presentation.CopilotSelectionResponse;
import com.waze.copilot.presentation.CopilotTypeResponse;
import com.waze.copilot.presentation.LogRequest;
import com.waze.copilot.presentation.UpdateCoPilotSelectionRequest;
import com.waze.copilot.presentation.UpdateWebviewHeaderRequest;
import com.waze.gas.GasNativeManager;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b {
    public b() {
    }

    private static boolean a(com.waze.shared_infra.f.a aVar, String str) {
        return aVar.b(str) != null;
    }

    public static LogRequest b(JSONObject jSONObject) {
        x.f(jSONObject, "json");
        String strOptString = jSONObject.optString("level");
        x.e(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        x.e(strOptString2, "optString(...)");
        return new LogRequest(strOptString, strOptString2);
    }

    public static UpdateCoPilotSelectionRequest c(JSONObject jSONObject) throws JSONException {
        CopilotTypeResponse next;
        CopilotOperationResponse next2;
        x.f(jSONObject, "json");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
        ArrayList arrayList = null;
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    arrayList = arrayList2;
                    break;
                }
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                String strOptString = jSONObject2.optString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                x.e(strOptString, "optString(...)");
                Iterator<CopilotTypeResponse> it = CopilotTypeResponse.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (h.n.o.m(next.name(), strOptString, true)) {
                        break;
                    }
                }
                CopilotTypeResponse copilotTypeResponse = next;
                String strOptString2 = jSONObject2.optString("operation");
                x.e(strOptString2, "optString(...)");
                Iterator<CopilotOperationResponse> it2 = CopilotOperationResponse.getEntries().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (h.n.o.m(next2.name(), strOptString2, true)) {
                        break;
                    }
                }
                CopilotOperationResponse copilotOperationResponse = next2;
                if (copilotTypeResponse == null || copilotOperationResponse == null) {
                    break;
                }
                String strOptString3 = jSONObject2.optString("assetId");
                x.e(strOptString3, "optString(...)");
                String strOptString4 = jSONObject2.optString("campaignId");
                x.e(strOptString4, "optString(...)");
                arrayList2.add(new CopilotSelectionResponse(copilotTypeResponse, strOptString3, strOptString4, copilotOperationResponse));
                i2++;
            }
        }
        return new UpdateCoPilotSelectionRequest(arrayList);
    }

    public static UpdateWebviewHeaderRequest d(JSONObject jSONObject) {
        x.f(jSONObject, "json");
        return new UpdateWebviewHeaderRequest(h(jSONObject, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE), h(jSONObject, "shareUrl"), h(jSONObject, "shareTitle"), h(jSONObject, "shareBody"), g(jSONObject, "backButton"), g(jSONObject, "closeButton"));
    }

    public static com.waze.z.a.b.n e(com.waze.shared_infra.f.a aVar) {
        x.f(aVar, "deepLink");
        if (a(aVar, "bundle_campaign")) {
            return new com.waze.y.d(f(aVar, "bundle_campaign"));
        }
        if (x.n(aVar.a(), "customize_drive")) {
            return com.waze.y.f.f45550a;
        }
        if (a(aVar, "car_campaign")) {
            return new com.waze.y.e(f(aVar, "car_campaign"));
        }
        if (a(aVar, "car_id")) {
            return new com.waze.y.c(f(aVar, "car_id"));
        }
        return null;
    }

    private static String f(com.waze.shared_infra.f.a aVar, String str) {
        String strB = aVar.b(str);
        if (strB != null) {
            return strB;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private static Boolean g(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Boolean.valueOf(jSONObject.optBoolean(str));
    }

    private static String h(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public /* synthetic */ b(byte[] bArr, byte[] bArr2) {
    }
}
