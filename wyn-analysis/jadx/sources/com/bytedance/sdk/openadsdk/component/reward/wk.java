package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class wk {
    private static final ConcurrentHashMap<uef, wk> uef = new ConcurrentHashMap<>();

    /* renamed from: oa, reason: collision with root package name */
    private final Context f25455oa;
    private final uef yo;

    public enum uef {
        REWARD_VIDEO("sp_reward_video", "sp_reward_video_new", "reward_video_cache"),
        FULL_SCREEN_VIDEO("sp_full_screen_video", "sp_full_screen_video_new", "full_screen_video_cache");

        final String lw;
        final String moa;
        final String yo;

        uef(String str, String str2, String str3) {
            this.yo = str;
            this.moa = str2;
            this.lw = str3;
        }
    }

    private wk(Context context, uef uefVar) {
        this.f25455oa = context == null ? com.bytedance.sdk.openadsdk.core.sy.uef() : context.getApplicationContext();
        this.yo = uefVar;
    }

    public static wk uef(Context context, uef uefVar) {
        ConcurrentHashMap<uef, wk> concurrentHashMap = uef;
        if (!concurrentHashMap.containsKey(uefVar)) {
            synchronized (wk.class) {
                try {
                    if (!concurrentHashMap.containsKey(uefVar)) {
                        concurrentHashMap.put(uefVar, new wk(context, uefVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return concurrentHashMap.get(uefVar);
    }

    public void uef(String str, gzw gzwVar) {
        com.bytedance.sdk.openadsdk.common.oa.uef(this.yo.moa).uef(str, gzwVar);
    }

    public void uef() {
        com.bytedance.sdk.openadsdk.common.oa.uef(this.yo.moa).uef();
    }

    public void uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        if (uefVar == null || uefVar.xs() == null || !uefVar.xs().tpq()) {
            com.bytedance.sdk.openadsdk.common.oa.uef(this.yo.moa).uef(adSlot, uefVar);
        }
    }

    public String uef(String str, boolean z2) {
        com.bytedance.sdk.openadsdk.common.oa oaVarUef = com.bytedance.sdk.openadsdk.common.oa.uef(this.yo.moa);
        String strUef = oaVarUef.uef(str, 10500000L);
        if (z2 && !TextUtils.isEmpty(strUef) && oaVarUef.moa(str)) {
            return null;
        }
        return strUef;
    }

    public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        return com.bytedance.sdk.openadsdk.common.oa.uef(this.yo.moa).uef(uefVar, true);
    }

    public void uef(String str) {
        com.bytedance.sdk.openadsdk.common.oa.uef(this.yo.moa).yo(str);
    }
}
