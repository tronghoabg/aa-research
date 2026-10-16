package com.bytedance.sdk.openadsdk.utils;

import j$.util.Objects;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    private static volatile com.bytedance.sdk.component.xs.yo.lw lw;
    private static Boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private static Boolean f26159oa;
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.gzw> uef;
    private static Boolean yo;

    public static com.bytedance.sdk.component.xs.yo.lw lw() {
        if (lw != null) {
            return lw;
        }
        com.bytedance.sdk.component.xs.yo.lw lwVar = new com.bytedance.sdk.component.xs.yo.lw();
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.gzw.lw.uef("net_multi_domain_config", (Object) null, com.bytedance.sdk.openadsdk.gzw.oa.uef);
            if (jSONObject != null) {
                lwVar.uef = jSONObject.optInt("enable", 0) == 1;
                lwVar.f25116oa = jSONObject.optInt("fail_count", 10);
                lwVar.yo = jSONObject.optLong("interval", 1800000L);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        lw = lwVar;
        Objects.toString(lw);
        return lw;
    }

    public static com.bytedance.sdk.openadsdk.core.model.gzw moa() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.gzw> softReference = uef;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static boolean oa() {
        try {
            if (yo == null) {
                boolean z2 = true;
                if (com.bytedance.sdk.openadsdk.gzw.lw.uef("net_opt_multiple_domain_retry", 0) != 1) {
                    z2 = false;
                }
                yo = Boolean.valueOf(z2);
            }
            return yo.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean uef() {
        if (f26159oa == null) {
            try {
                f26159oa = Boolean.valueOf(com.bytedance.sdk.openadsdk.gzw.lw.uef("stability_sinking", 0) == 1);
            } catch (Throwable unused) {
                f26159oa = Boolean.FALSE;
            }
        }
        return f26159oa.booleanValue();
    }

    public static boolean yo() {
        try {
            if (moa == null) {
                boolean z2 = true;
                if (com.bytedance.sdk.openadsdk.gzw.lw.uef("iv_rv_load_show_new", 0) != 1) {
                    z2 = false;
                }
                moa = Boolean.valueOf(z2);
            }
            return moa.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar == null) {
            return;
        }
        uef = new SoftReference<>(gzwVar);
    }
}
