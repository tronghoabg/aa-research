package com.bytedance.sdk.openadsdk.ab;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.gzw.lw;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    private static volatile boolean lw;
    private static volatile boolean yo;
    private static final HashMap<String, Integer> uef = new HashMap<>();

    /* renamed from: oa, reason: collision with root package name */
    private static volatile int f25155oa = 10000;
    private static volatile boolean moa = true;

    public static boolean oa() {
        return yo;
    }

    public static void uef() {
        String strUef = lw.uef("stats_control", "");
        if (!TextUtils.isEmpty(strUef)) {
            try {
                JSONObject jSONObject = new JSONObject(strUef);
                f25155oa = jSONObject.optInt("sampling_def", 10000);
                String strOptString = jSONObject.optString("sampling");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        uef.put(next, Integer.valueOf(jSONObject2.optInt(next, f25155oa)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        moa = false;
        yo = false;
        if (f25155oa == 10000 && uef.isEmpty()) {
            moa = true;
        } else if (f25155oa == 0 && uef.isEmpty()) {
            yo = true;
        }
        lw = true;
    }

    public static int oa(String str, int i5) {
        if (yo) {
            return 0;
        }
        if (!lw) {
            return i5;
        }
        Integer numValueOf = uef.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i5);
        }
        return numValueOf.intValue();
    }

    public static boolean uef(String str, int i5) {
        if (moa || !lw) {
            return true;
        }
        if (yo) {
            return false;
        }
        if (i5 < 0) {
            i5 = f25155oa;
        }
        Integer numValueOf = uef.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i5);
        }
        if (numValueOf.intValue() <= 0) {
            return false;
        }
        return numValueOf.intValue() >= 10000 || ((int) ((Math.random() * 10000.0d) + 1.0d)) <= numValueOf.intValue();
    }
}
