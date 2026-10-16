package com.bytedance.sdk.openadsdk.moa.lw.uef;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.uef.uef.uef.yo.yo;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.ku;
import com.bytedance.sdk.openadsdk.moa.lw.oa.bcc;
import com.bytedance.sdk.openadsdk.moa.lw.oa.cq;
import com.bytedance.sdk.openadsdk.moa.lw.oa.dz;
import com.bytedance.sdk.openadsdk.moa.lw.oa.ivm;
import com.bytedance.sdk.openadsdk.moa.lw.oa.lw;
import com.bytedance.sdk.openadsdk.moa.lw.oa.oa;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;
import com.bytedance.sdk.openadsdk.moa.xs;
import com.bytedance.sdk.openadsdk.utils.gb;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private static final Map<com.bykv.vk.openvk.uef.uef.uef.oa.uef, wk> uef = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static void lw(com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, wk.uef uefVar2) {
        wk wkVar;
        if (uefVar == null || uefVar2 == null || uefVar2.zjm() <= 0 || (wkVar = uef.get(uefVar)) == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        long jMoa = uefVar2.moa();
        cq cqVar = new cq();
        cqVar.uef(uefVar2.yo());
        cqVar.oa(jMoa);
        cqVar.uef(uefVar2.zjm());
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, uefVar2);
        uefVarUef.uef(cqVar);
        uefVarUef.uef(uefVar2.dj());
        uef(uefVarUef, "play_buffer");
    }

    public static void moa(com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, wk.uef uefVar2) throws JSONException {
        wk wkVar;
        if (uefVar == null || uefVar2 == null || (wkVar = uef.get(uefVar)) == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        long jOa = uefVar2.oa();
        long jMoa = uefVar2.moa();
        oa oaVar = new oa();
        oaVar.uef(uefVar2.yo());
        oaVar.oa(jMoa);
        oaVar.uef(uefVar2.lw());
        oaVar.oa(uefVar2.ivm());
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, uefVar2);
        uefVarUef.uef(oaVar);
        uefVarUef.uef(uefVar2.dj());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jOa);
            jSONObject.put("percent", uefVar2.xs());
            uef(uefVarUef, "endcard_skip", jSONObject);
        } catch (JSONException e7) {
            dhk.uef("TTAD.VideoEventManager", "", e7);
        }
        uef.remove(uefVar);
    }

    public static void yo(com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, wk.uef uefVar2) throws JSONException {
        wk wkVar;
        if (uefVar == null || uefVar2 == null || (wkVar = uef.get(uefVar)) == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        long jOa = uefVar2.oa();
        long jMoa = uefVar2.moa();
        dz dzVar = new dz(uefVar2.cq());
        dzVar.uef(uefVar2.yo());
        dzVar.oa(jMoa);
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, uefVar2);
        uefVarUef.uef(dzVar);
        uefVarUef.uef(uefVar2.dj());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jOa);
            jSONObject.put("percent", uefVar2.xs());
            uef(uefVarUef, "play_error", jSONObject);
        } catch (JSONException e7) {
            dhk.uef("TTAD.VideoEventManager", "", e7);
        }
    }

    public static void oa(com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVar) {
        moa.uef("load_video_cancel", uefVar);
    }

    public static com.bytedance.sdk.openadsdk.moa.lw.oa.uef uef(gzw gzwVar, String str, int i5, yo yoVar) {
        return uef(gzwVar, str, i5, yoVar, null);
    }

    public static void oa(com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, wk.uef uefVar2) throws JSONException {
        wk wkVar;
        if (uefVar == null || uefVar2 == null || (wkVar = uef.get(uefVar)) == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        long jOa = uefVar2.oa();
        long jMoa = uefVar2.moa();
        if (jMoa <= 0 || jOa <= 0) {
            return;
        }
        lw lwVar = new lw();
        lwVar.uef(uefVar2.yo());
        lwVar.oa(jMoa);
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, uefVar2);
        uefVarUef.uef(lwVar);
        uefVarUef.uef(uefVar2.dj());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jOa);
            jSONObject.put("percent", uefVar2.xs());
            uef(uefVarUef, "feed_continue", jSONObject);
        } catch (JSONException e7) {
            dhk.uef("TTAD.VideoEventManager", "", e7);
        }
    }

    public static com.bytedance.sdk.openadsdk.moa.lw.oa.uef uef(gzw gzwVar, String str, int i5, yo yoVar, wk.uef uefVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (i5 > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i5));
            } catch (JSONException e7) {
                dhk.uef("TTAD.VideoEventManager", "", e7);
            }
        }
        if (gzwVar != null) {
            com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
            if (oaVarNj != null) {
                jSONObject.put("video_resolution", oaVarNj.cz());
                jSONObject.put("video_size", Long.valueOf(oaVarNj.lw()));
                jSONObject.put("video_url", oaVarNj.dj());
                jSONObject.put("player_type", yoVar.sy());
                jSONObject.put("video_encode_type", yoVar.dz() ? 1 : 0);
            }
            jSONObject.put("play_time", yoVar.lw);
            jSONObject = yoVar.uef() ? new JSONObject(yoVar.yo().toString()) : null;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            jSONObject.put("dp_creative_type", gzwVar.orw());
        }
        return new com.bytedance.sdk.openadsdk.moa.lw.oa.uef(gzwVar, gb.uef(gzwVar), jSONObject, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long yo(yo yoVar) {
        if (yoVar == null) {
            return 0L;
        }
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarGsd = yoVar.dz() ? yoVar.gsd() : yoVar.gzw();
        if (oaVarGsd != null) {
            return Double.valueOf(oaVarGsd.ivm() * 1000.0d).longValue();
        }
        return 0L;
    }

    public static void oa(com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, wk.uef uefVar2, xs xsVar) throws JSONException {
        if (uefVar == null || uefVar2 == null) {
            return;
        }
        lw(uefVar, uefVar2);
        wk wkVar = uef.get(uefVar);
        if (wkVar == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        long jOa = uefVar2.oa();
        long jMoa = uefVar2.moa();
        ivm ivmVar = new ivm(yoVarMoa);
        ivmVar.oa(uefVar2.yo());
        ivmVar.uef(jMoa);
        ivmVar.uef(uefVar2.cz());
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, uefVar2);
        uefVarUef.uef(ivmVar);
        JSONObject jSONObjectMoa = uefVarUef.moa();
        uef(uefVar2, gzwVarLw, jSONObjectMoa);
        uefVarUef.uef(uefVar2.dj());
        try {
            jSONObjectMoa.put("surface_texture_updated", uefVar2.wk() ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jOa);
            jSONObject.put("percent", uefVar2.xs());
            uef(uefVarUef, "feed_over", jSONObject, xsVar);
        } catch (JSONException e7) {
            dhk.uef("TTAD.VideoEventManager", "", e7);
        }
        uef.remove(uefVar);
    }

    public static void uef(com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVar) {
        moa.uef("load_video_error", uefVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String moa(yo yoVar) {
        return new File(yoVar.lw(), yoVar.bs()).getAbsolutePath();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(1:8)(2:10|(8:12|14|25|15|19|(1:22)|23|24)(1:13))|9|14|25|15|19|(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        com.bytedance.sdk.component.utils.dhk.uef("TTAD.VideoEventManager", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw r8, com.bykv.vk.openvk.uef.uef.uef.oa.uef r9, com.bykv.vk.openvk.uef.uef.uef.yo.yo r10) throws org.json.JSONException {
        /*
            if (r8 == 0) goto L65
            if (r9 == 0) goto L65
            if (r10 != 0) goto L7
            goto L65
        L7:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.ue.uef()
            boolean r0 = r10.rt()
            r7 = 1
            if (r0 == 0) goto L15
            r0 = 3
        L13:
            r4 = r0
            goto L27
        L15:
            int r0 = r8.wg()
            com.bykv.vk.openvk.uef.uef.uef.uef.oa r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            boolean r0 = r0.uef(r10)
            if (r0 == 0) goto L25
            r4 = r7
            goto L27
        L25:
            r0 = 2
            goto L13
        L27:
            com.bytedance.sdk.openadsdk.moa.lw.oa.wk r0 = new com.bytedance.sdk.openadsdk.moa.lw.oa.wk
            long r1 = android.os.SystemClock.elapsedRealtime()
            r6 = r8
            r5 = r10
            r0.<init>(r1, r3, r4, r5, r6)
            java.util.Map<com.bykv.vk.openvk.uef.uef.uef.oa.uef, com.bytedance.sdk.openadsdk.moa.lw.oa.wk> r8 = com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef
            r8.put(r9, r0)
            r8 = 0
            com.bytedance.sdk.openadsdk.moa.lw.oa.uef r8 = uef(r6, r3, r4, r5, r8)
            org.json.JSONObject r9 = r8.yo()
            r10 = 0
            java.lang.String r0 = "is_mute"
            boolean r1 = r5.dj()     // Catch: org.json.JSONException -> L4b
            r9.put(r0, r1)     // Catch: org.json.JSONException -> L4b
            goto L54
        L4b:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "TTAD.VideoEventManager"
            java.lang.String r1 = ""
            com.bytedance.sdk.component.utils.dhk.uef(r0, r1, r9)
        L54:
            int r9 = r5.sy()
            r0 = -1
            if (r9 != r0) goto L5c
            goto L5d
        L5c:
            r7 = r10
        L5d:
            r8.uef(r7)
            java.lang.String r9 = "play_start"
            uef(r8, r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(com.bytedance.sdk.openadsdk.core.model.gzw, com.bykv.vk.openvk.uef.uef.uef.oa.uef, com.bykv.vk.openvk.uef.uef.uef.yo.yo):void");
    }

    public static void uef(Context context, com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, wk.uef uefVar2, xs xsVar) throws JSONException {
        wk wkVar;
        if (context == null || uefVar == null || uefVar2 == null || (wkVar = uef.get(uefVar)) == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        if (!uefVar2.dj()) {
            uef(gzwVarLw, yoVarMoa, uefVar2);
        }
        bcc bccVar = new bcc(yoVarMoa);
        bccVar.uef(uefVar2.wrv() ? 1 : 0);
        bccVar.oa(CacheDirFactory.getICacheDir(gzwVarLw.wg()).oa(yoVarMoa));
        bccVar.uef(SystemClock.elapsedRealtime() - wkVar.uef());
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, uefVar2);
        uefVarUef.uef(bccVar);
        JSONObject jSONObjectMoa = uefVarUef.moa();
        try {
            jSONObjectMoa.put("is_received_video_not_playing_info", uefVar2.dz() ? 1 : 0);
            jSONObjectMoa.put("new_media_source", com.bykv.vk.openvk.uef.uef.oa.uef.ivm());
        } catch (JSONException e7) {
            dhk.uef("TTAD.VideoEventManager", "", e7);
        }
        uefVarUef.uef(uefVar2.dj());
        uef(uefVarUef, "feed_play", xsVar);
    }

    public static void uef(com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, wk.uef uefVar2) {
        wk wkVar;
        if (uefVar == null || uefVar2 == null || (wkVar = uef.get(uefVar)) == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        long jOa = uefVar2.oa();
        long jMoa = uefVar2.moa();
        if (jMoa <= 0 || jOa <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.lw.oa.xs xsVar = new com.bytedance.sdk.openadsdk.moa.lw.oa.xs();
        xsVar.uef(uefVar2.yo());
        xsVar.oa(jMoa);
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, uefVar2);
        uefVarUef.uef(xsVar);
        uef(uefVar2, gzwVarLw, uefVarUef.moa());
        uefVarUef.uef(uefVar2.dj());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jOa);
            jSONObject.put("percent", uefVar2.xs());
            uef(uefVarUef, "feed_pause", jSONObject);
        } catch (JSONException e7) {
            dhk.uef("TTAD.VideoEventManager", "", e7);
        }
    }

    private static void uef(wk.uef uefVar, gzw gzwVar, JSONObject jSONObject) {
        if (gzwVar != null) {
            try {
                ku kuVarBbb = gzwVar.bbb();
                if (kuVarBbb != null) {
                    jSONObject.put("speed_type", kuVarBbb.oa());
                    jSONObject.put("speed", kuVarBbb.uef());
                    jSONObject.put("speed_duration", uefVar.uef());
                }
            } catch (Throwable th) {
                dhk.uef("TTAD.VideoEventManager", "", th);
            }
        }
    }

    public static void uef(com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, wk.uef uefVar2, xs xsVar) {
        if (uefVar == null || uefVar2 == null) {
            return;
        }
        lw(uefVar, uefVar2);
        wk wkVar = uef.get(uefVar);
        if (wkVar == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        long jOa = uefVar2.oa();
        long jMoa = uefVar2.moa();
        com.bytedance.sdk.openadsdk.moa.lw.oa.moa moaVar = new com.bytedance.sdk.openadsdk.moa.lw.oa.moa();
        moaVar.oa(uefVar2.yo());
        moaVar.uef(jMoa);
        moaVar.uef(uefVar2.bcc());
        moaVar.oa(uefVar2.cz());
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, uefVar2);
        uefVarUef.uef(moaVar);
        uef(uefVar2, gzwVarLw, uefVarUef.moa());
        uefVarUef.uef(uefVar2.dj());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jOa);
            jSONObject.put("percent", uefVar2.xs());
            uef(uefVarUef, "feed_break", jSONObject, xsVar);
        } catch (JSONException e7) {
            dhk.uef("TTAD.VideoEventManager", "", e7);
        }
    }

    public static void uef(com.bykv.vk.openvk.uef.uef.uef.oa.uef uefVar, boolean z2, String str) {
        wk wkVar;
        if (uefVar == null || (wkVar = uef.get(uefVar)) == null) {
            return;
        }
        yo yoVarMoa = wkVar.moa();
        gzw gzwVarLw = wkVar.lw();
        if (yoVarMoa == null || gzwVarLw == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = uef(gzwVarLw, wkVar.oa(), wkVar.yo(), yoVarMoa, null);
        try {
            uefVarUef.yo().put("is_mute", z2 ? 1 : 0);
            uefVarUef.moa().put("from", str);
        } catch (JSONException e7) {
            dhk.uef("TTAD.VideoEventManager", "", e7);
        }
        uef(uefVarUef, "mute_state_change");
    }

    private static void uef(com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVar, String str) {
        uef(uefVar, str, (JSONObject) null, (xs) null);
    }

    private static void uef(com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVar, String str, JSONObject jSONObject) {
        uef(uefVar, str, jSONObject, (xs) null);
    }

    private static void uef(com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVar, String str, xs xsVar) {
        uef(uefVar, str, (JSONObject) null, xsVar);
    }

    private static void uef(final com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVar, String str, final JSONObject jSONObject, final xs xsVar) {
        if (uefVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (uefVar.ivm() && !TextUtils.isEmpty(uefVar.oa())) {
            String strOa = uefVar.oa();
            strOa.getClass();
            if (strOa.equals("stream") || strOa.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), uefVar.uef(), uefVar.oa(), str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.lw.uef.uef.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                uefVar.xs();
                return uefVar.moa();
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject yo() {
                xs xsVar2;
                try {
                    JSONObject jSONObjectYo = uefVar.yo();
                    if (uefVar.lw() != null) {
                        uefVar.lw().uef(jSONObjectYo);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (xsVar2 = xsVar) != null) {
                        xsVar2.uef(jSONObjectYo);
                    }
                    return jSONObjectYo;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    private static void uef(final gzw gzwVar, final yo yoVar, final wk.uef uefVar) {
        moa.uef();
        moa.uef("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.moa.lw.uef.uef.2
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", uef.yo(yoVar));
                jSONObject.put("player_duration", uefVar.moa());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", yoVar.ab());
                jSONObject.put("path", uef.moa(yoVar));
                jSONObject.put("player_type", yoVar.sy());
                com.bytedance.sdk.openadsdk.ab.uef.moa moaVarUef = com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("pangle_video_play_state");
                gzw gzwVar2 = gzwVar;
                return moaVarUef.uef(gzwVar2 != null ? gzwVar2.dqw() : 0).oa(jSONObject.toString());
            }
        });
    }
}
