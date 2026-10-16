package K8;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzx;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import h7.C2793a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x.C4412e;

/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final C2793a f6680a = new C2793a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            Object objC = jSONArray.get(i5);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map b(String str) {
        AbstractC1732v.f(str);
        List<String> listZza = zzx.zza('.').zza((CharSequence) str);
        int size = listZza.size();
        C2793a c2793a = f6680a;
        if (size < 2) {
            c2793a.c(R8.v.f("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = listZza.get(1);
        try {
            C4412e c4412eD = d(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return c4412eD == null ? new HashMap() : c4412eD;
        } catch (UnsupportedEncodingException e7) {
            c2793a.b("Unable to decode token", e7, new Object[0]);
            return new HashMap();
        }
    }

    public static C4412e c(JSONObject jSONObject) throws JSONException {
        C4412e c4412e = new C4412e(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            c4412e.put(next, objC);
        }
        return c4412e;
    }

    public static C4412e d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e7) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzzh(e7);
        }
    }
}
