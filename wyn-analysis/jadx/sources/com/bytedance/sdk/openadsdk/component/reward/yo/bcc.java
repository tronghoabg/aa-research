package com.bytedance.sdk.openadsdk.component.reward.yo;

import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bcc {

    /* renamed from: oa, reason: collision with root package name */
    private static Integer f25458oa;
    private static Boolean uef;
    private static Integer yo;

    public static int lw() {
        if (f25458oa == null) {
            int iUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("unify_web_close_backup_config", "interval", 10000);
            f25458oa = Integer.valueOf(iUef > 1000 ? iUef : 10000);
        }
        return f25458oa.intValue();
    }

    public static boolean moa() {
        if (uef == null) {
            uef = Boolean.valueOf(com.bytedance.sdk.openadsdk.gzw.lw.uef("unify_web_close_backup_config", "enable", 1) == 1);
        }
        return uef.booleanValue();
    }

    public static boolean oa() {
        return uef() == 1 || uef() == 2;
    }

    public static int uef() {
        if (yo == null) {
            int i5 = 1;
            int iUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("unify_web_config", "video_preload_type", 1);
            if (iUef >= 0 && iUef <= 2) {
                i5 = iUef;
            }
            yo = Integer.valueOf(i5);
        }
        return yo.intValue();
    }

    public static boolean yo() {
        return uef() == 1;
    }

    public static boolean uef(gzw gzwVar) {
        if (gzwVar == null) {
            return false;
        }
        return (gzwVar.ggp() == 2) && (gzwVar.ix() == 11) && !gzwVar.ebe() && !gzwVar.tv();
    }

    public static void uef(final int i5, final String str, final gzw gzwVar, final Map<String, String> map) {
        com.bytedance.sdk.openadsdk.ab.moa.uef("unify_web_preload_video", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.bcc.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", i5);
                jSONObject.put("video_url", str);
                gzw gzwVar2 = gzwVar;
                if (gzwVar2 != null) {
                    jSONObject.put("req_id", gzwVar2.ofp());
                }
                Map map2 = map;
                if (map2 != null && !map2.isEmpty()) {
                    jSONObject.put("range", map.get("Range"));
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("unify_web_preload_video").oa(jSONObject.toString());
            }
        });
    }
}
