package K8;

import a.AbstractC1304a;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f6576a;

    static {
        HashMap map = new HashMap();
        f6576a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(PglCryptUtils.KEY_MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap map = f6576a;
                if (map.containsKey(string)) {
                    return AbstractC1304a.i0(((String) map.get(string)) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + string2);
                }
            }
            return AbstractC1304a.i0("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e7) {
            return AbstractC1304a.i0("WEB_INTERNAL_ERROR:" + str + "[ " + e7.getLocalizedMessage() + " ]");
        }
    }
}
