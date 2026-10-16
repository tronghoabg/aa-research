package com.bytedance.sdk.openadsdk.yo;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    private static volatile oa uef;

    /* renamed from: oa, reason: collision with root package name */
    private final gzw<com.bytedance.sdk.openadsdk.moa.uef> f26200oa = sy.yo();

    private oa() {
    }

    public static oa uef() {
        if (uef == null) {
            synchronized (oa.class) {
                try {
                    if (uef == null) {
                        uef = new oa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public void uef(String str, List<FilterWord> list, String str2) {
        uef(str, list, null, null, str2);
    }

    public void uef(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.f26200oa.uef(str, list, jSONObject, str2, str3);
    }
}
