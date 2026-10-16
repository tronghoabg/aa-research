package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
class lw {
    private static volatile lw uef;

    /* renamed from: oa, reason: collision with root package name */
    private final Context f25378oa;

    private lw(Context context) {
        this.f25378oa = context == null ? com.bytedance.sdk.openadsdk.core.sy.uef() : context.getApplicationContext();
    }

    public void uef(String str, gzw gzwVar) {
        com.bytedance.sdk.openadsdk.common.oa.uef("sp_full_screen_video_new").uef(str, gzwVar);
    }

    public void uef() {
        com.bytedance.sdk.openadsdk.common.oa.uef("sp_full_screen_video_new").uef();
    }

    public void uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        if (uefVar == null || uefVar.xs() == null || !uefVar.xs().tpq()) {
            com.bytedance.sdk.openadsdk.common.oa.uef("sp_full_screen_video_new").uef(adSlot, uefVar);
        }
    }

    public static lw uef(Context context) {
        if (uef == null) {
            synchronized (lw.class) {
                try {
                    if (uef == null) {
                        uef = new lw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public String uef(String str, boolean z2) {
        com.bytedance.sdk.openadsdk.common.oa oaVarUef = com.bytedance.sdk.openadsdk.common.oa.uef("sp_full_screen_video_new");
        String strUef = oaVarUef.uef(str, 10500000L);
        if (z2 && !TextUtils.isEmpty(strUef) && oaVarUef.moa(str)) {
            return null;
        }
        return strUef;
    }

    public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        return com.bytedance.sdk.openadsdk.common.oa.uef("sp_full_screen_video_new").uef(uefVar, true);
    }

    public void uef(String str) {
        com.bytedance.sdk.openadsdk.common.oa.uef("sp_full_screen_video_new").yo(str);
    }
}
