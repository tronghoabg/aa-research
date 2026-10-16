package com.bytedance.sdk.openadsdk.core.wk.lw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.uef.uef.uef.lw.uef;
import com.bykv.vk.openvk.uef.uef.uef.yo.yo;
import com.bytedance.sdk.component.oa.uef.xs;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.moa.lw.oa.cz;
import com.bytedance.sdk.openadsdk.moa.lw.oa.dj;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wrv;
import com.bytedance.sdk.openadsdk.moa.lw.oa.zjm;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class uef {
    public static final com.bykv.vk.openvk.uef.uef.uef.lw.uef uef = new com.bykv.vk.openvk.uef.uef.oa.uef.oa.uef();

    private static void oa(yo yoVar, gzw gzwVar, AdSlot adSlot) {
        if (uef(yoVar)) {
            long jWrv = yoVar.cq() ? yoVar.wrv() : yoVar.ivm();
            com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(gzwVar, (String) null, -1, yoVar);
            uefVarUef.uef(new dj(yoVar.ab(), jWrv));
            moa.uef("load_video_start", uefVarUef);
        }
    }

    private static boolean uef(yo yoVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yo(yo yoVar, gzw gzwVar, AdSlot adSlot) {
        if (uef(yoVar)) {
            com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(gzwVar, (String) null, -1, yoVar);
            uefVarUef.uef(new cz(yoVar.ab(), yoVar.ivm()));
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.oa(uefVarUef);
        }
    }

    public static void uef(final yo yoVar, final uef.InterfaceC0032uef interfaceC0032uef) {
        gzw gzwVar;
        AdSlot adSlot;
        if ((yoVar.ivm() > 0 || yoVar.cq()) && yoVar.sy() != -2) {
            if (yoVar.sy() != 1) {
                yoVar.lw(6000);
                yoVar.ivm(6000);
                yoVar.xs(6000);
                boolean z2 = yoVar.lw("material_meta") != null && (yoVar.lw("material_meta") instanceof gzw);
                boolean z10 = yoVar.lw("ad_slot") != null && (yoVar.lw("ad_slot") instanceof AdSlot);
                if (z2 && z10) {
                    gzw gzwVar2 = (gzw) yoVar.lw("material_meta");
                    AdSlot adSlot2 = (AdSlot) yoVar.lw("ad_slot");
                    oa(yoVar, gzwVar2, adSlot2);
                    gzwVar = gzwVar2;
                    adSlot = adSlot2;
                } else {
                    gzwVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final gzw gzwVar3 = gzwVar;
                final uef.InterfaceC0032uef interfaceC0032uef2 = new uef.InterfaceC0032uef() { // from class: com.bytedance.sdk.openadsdk.core.wk.lw.uef.1
                    @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                    public void oa(yo yoVar2, int i5) {
                        AdSlot adSlot4;
                        uef.InterfaceC0032uef interfaceC0032uef3 = interfaceC0032uef;
                        if (interfaceC0032uef3 != null) {
                            interfaceC0032uef3.uef(yoVar2, i5);
                        }
                        gzw gzwVar4 = gzwVar3;
                        if (gzwVar4 != null && (adSlot4 = adSlot3) != null) {
                            uef.yo(yoVar, gzwVar4, adSlot4);
                        }
                        yoVar.bs();
                    }

                    @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                    public void uef(yo yoVar2, int i5) {
                        uef.InterfaceC0032uef interfaceC0032uef3 = interfaceC0032uef;
                        if (interfaceC0032uef3 != null) {
                            interfaceC0032uef3.uef(yoVar2, i5);
                        }
                        if (gzwVar3 == null || adSlot3 == null) {
                            return;
                        }
                        uef.oa(yoVar, gzwVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                    public void uef(yo yoVar2, int i5, String str) {
                        uef.InterfaceC0032uef interfaceC0032uef3 = interfaceC0032uef;
                        if (interfaceC0032uef3 != null) {
                            interfaceC0032uef3.uef(yoVar2, i5, str);
                        }
                        if (gzwVar3 == null || adSlot3 == null) {
                            return;
                        }
                        uef.oa(yoVar, gzwVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i5, str);
                    }
                };
                if (!uef(yoVar.ab())) {
                    if (interfaceC0032uef != null) {
                        interfaceC0032uef.uef(yoVar, TTAdConstant.DEEPLINK_FALLBACK_CODE, "unexpected url: " + yoVar.ab());
                    }
                    oa(yoVar, gzwVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                com.bytedance.sdk.component.bcc.oa.yo yoVar2 = new com.bytedance.sdk.component.bcc.oa.yo("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.wk.lw.uef.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            uef.uef.uef(sy.uef(), yoVar, interfaceC0032uef2);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                };
                if (km.ivm()) {
                    km.yo((Runnable) yoVar2);
                    return;
                } else {
                    yoVar2.run();
                    return;
                }
            }
        }
        if (interfaceC0032uef != null) {
            interfaceC0032uef.uef(yoVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(yo yoVar, gzw gzwVar, AdSlot adSlot, long j8, int i5, String str) {
        if (uef(yoVar)) {
            com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(gzwVar, (String) null, -1, yoVar);
            zjm zjmVar = new zjm();
            zjmVar.uef(yoVar.ab());
            zjmVar.uef(yoVar.ivm());
            zjmVar.oa(j8);
            zjmVar.uef(i5);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            zjmVar.oa(str);
            zjmVar.yo("");
            uefVarUef.uef(zjmVar);
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(uefVarUef);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(yo yoVar, gzw gzwVar, AdSlot adSlot, long j8) {
        if (uef(yoVar)) {
            com.bytedance.sdk.openadsdk.moa.lw.oa.uef uefVarUef = com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(gzwVar, (String) null, -1, yoVar);
            wrv wrvVar = new wrv();
            wrvVar.uef(yoVar.ab());
            wrvVar.uef(yoVar.ivm());
            wrvVar.oa(j8);
            if (yoVar.orq() == 1) {
                wrvVar.yo(1L);
            } else {
                wrvVar.yo(0L);
            }
            uefVarUef.uef(wrvVar);
            moa.uef("load_video_success", uefVarUef);
        }
    }

    public static boolean uef(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        return xs.yo(str2) != null;
    }
}
