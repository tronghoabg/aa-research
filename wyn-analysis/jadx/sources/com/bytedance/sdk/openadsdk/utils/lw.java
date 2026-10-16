package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw {

    /* renamed from: oa, reason: collision with root package name */
    private static long f26156oa;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.gzw> uef;
    private static boolean yo;

    private static void oa(final long j8) {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.gzw> weakReference = uef;
        if (weakReference == null || j8 <= 0 || (gzwVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, gzwVar.lw(), "store_duration", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.utils.lw.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j8);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        uef = null;
        yo = false;
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        com.bytedance.sdk.openadsdk.core.model.ivm ivmVarNo = gzwVar.no();
        if (ivmVarNo == null || TextUtils.isEmpty(ivmVarNo.uef())) {
            return;
        }
        uef = new WeakReference<>(gzwVar);
    }

    public static boolean yo() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.gzw> weakReference = uef;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        yo = true;
        return true;
    }

    public static void uef(long j8) {
        oa(j8);
    }

    public static void oa() {
        if (uef == null || yo) {
            return;
        }
        f26156oa = SystemClock.elapsedRealtime();
    }

    public static void uef() {
        if (uef == null || yo) {
            return;
        }
        if (f26156oa > 0) {
            oa(SystemClock.elapsedRealtime() - f26156oa);
        }
        uef = null;
        f26156oa = 0L;
    }
}
