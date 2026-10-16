package com.bytedance.adsdk.oa.yo;

import com.bytedance.adsdk.oa.dz;

/* loaded from: classes.dex */
public class lw {
    private static final lw uef = new lw();

    /* renamed from: oa, reason: collision with root package name */
    private final dz<String, com.bytedance.adsdk.oa.xs> f24609oa = new dz<>(20);

    public static lw uef() {
        return uef;
    }

    public com.bytedance.adsdk.oa.xs uef(String str) {
        if (str == null) {
            return null;
        }
        return this.f24609oa.uef((dz<String, com.bytedance.adsdk.oa.xs>) str);
    }

    public void uef(String str, com.bytedance.adsdk.oa.xs xsVar) {
        if (str == null) {
            return;
        }
        this.f24609oa.uef(str, xsVar);
    }
}
