package com.google.firebase.appcheck.a.a;

import android.text.TextUtils;
import android.util.Base64;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.av;
import com.google.firebase.appcheck.d;
import com.google.firebase.e;
import h.g.b.x;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {
    public static Map a(String str) {
        av.k(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            a.f8838a.b("Invalid token (too few subsections):\n".concat(String.valueOf(str)));
            return Collections.EMPTY_MAP;
        }
        try {
            String str2 = new String(Base64.decode(strArrSplit[1], 11), "UTF-8");
            Map mapD = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject != JSONObject.NULL) {
                        mapD = d(jSONObject);
                    }
                } catch (Exception e2) {
                    a.f8838a.a("Failed to parse JSONObject into Map:\n".concat(e2.toString()));
                    mapD = Collections.EMPTY_MAP;
                }
            }
            return mapD == null ? Collections.EMPTY_MAP : mapD;
        } catch (UnsupportedEncodingException e3) {
            a.f8838a.b("Unable to decode token (charset unknown):\n".concat(e3.toString()));
            return Collections.EMPTY_MAP;
        }
    }

    public static final d b(com.google.firebase.b bVar) {
        x.f(bVar, "<this>");
        d dVarC = d.c(e.b());
        x.e(dVarC, "getInstance(...)");
        return dVarC;
    }

    private static List c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object objD = jSONArray.get(i2);
            if (objD instanceof JSONArray) {
                objD = c((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            }
            arrayList.add(objD);
        }
        return arrayList;
    }

    private static Map d(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objD = jSONObject.get(next);
            if (objD instanceof JSONArray) {
                objD = c((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            } else if (objD.equals(JSONObject.NULL)) {
                objD = null;
            }
            arrayMap.put(next, objD);
        }
        return arrayMap;
    }
}
