package com.bytedance.adsdk.oa;

import java.util.Map;

/* loaded from: classes.dex */
public class dhk {

    /* renamed from: oa, reason: collision with root package name */
    private boolean f24547oa;
    private final Map<String, String> uef;

    public final String oa(String str, String str2) {
        if (this.f24547oa && this.uef.containsKey(str2)) {
            return this.uef.get(str2);
        }
        String strUef = uef(str, str2);
        if (this.f24547oa) {
            this.uef.put(str2, strUef);
        }
        return strUef;
    }

    public String uef(String str) {
        return str;
    }

    public String uef(String str, String str2) {
        return uef(str2);
    }
}
