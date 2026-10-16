package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.pu;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bcc {
    private com.bytedance.sdk.openadsdk.core.model.gzw bcc;
    private PAGBannerAdLoadListener moa;
    private AdSlot uef;
    private final Context yo;
    private final AtomicBoolean lw = new AtomicBoolean(false);
    private int ivm = 5;
    private final pu xs = pu.yo();

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.gzw f25841oa = com.bytedance.sdk.openadsdk.core.sy.yo();

    private bcc(Context context) {
        if (context != null) {
            this.yo = context.getApplicationContext();
        } else {
            this.yo = com.bytedance.sdk.openadsdk.core.sy.uef();
        }
    }

    public static bcc uef(Context context) {
        return new bcc(context);
    }

    public void uef(AdSlot adSlot, int i5, com.bytedance.sdk.openadsdk.common.xs xsVar) {
        this.xs.lw();
        if (this.lw.get()) {
            return;
        }
        this.ivm = i5;
        this.lw.set(true);
        this.uef = adSlot;
        if (xsVar instanceof PAGBannerAdLoadListener) {
            this.moa = (PAGBannerAdLoadListener) xsVar;
        }
        uef(adSlot);
    }

    private void uef(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ue ueVar = new com.bytedance.sdk.openadsdk.core.model.ue();
        ueVar.cz = 2;
        this.f25841oa.uef(adSlot, ueVar, this.ivm, new com.bytedance.sdk.openadsdk.core.orq() { // from class: com.bytedance.sdk.openadsdk.core.zjm.bcc.1
            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
                bcc.this.uef(i5, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                bcc.this.uef(uefVar, yoVar, adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar, AdSlot adSlot) {
        if (uefVar.lw() != null && !uefVar.lw().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVarZjm = uefVar.zjm();
            this.bcc = gzwVarZjm;
            uef(gzwVarZjm, adSlot);
            if (com.bytedance.sdk.component.utils.wk.yo()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.xs.moa() + "run in  " + Thread.currentThread().getName());
            }
            if (this.lw.getAndSet(false)) {
                km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.bcc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (bcc.this.bcc != null) {
                            bcc bccVar = bcc.this;
                            bccVar.uef(bccVar.bcc, jElapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        uef(-3, com.bytedance.sdk.openadsdk.core.cz.uef(-3));
        yoVar.uef(-3);
        yoVar.yo(8);
        com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
    }

    private void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 : gzwVar.at()) {
            if (com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVar2) && gzwVar2.nj() != null && gzwVar2.nj().dj() != null) {
                if (com.bytedance.sdk.openadsdk.core.sy.moa().lw(String.valueOf(gzwVar2.jnk())) && com.bytedance.sdk.openadsdk.core.sy.moa().hg()) {
                    com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = com.bytedance.sdk.openadsdk.core.model.gzw.uef(CacheDirFactory.getICacheDir(gzwVar2.wg()).yo(), gzwVar2);
                    oaVarUef.uef("material_meta", gzwVar2);
                    oaVarUef.uef("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, null);
                }
            }
        }
    }

    private PAGBannerAd uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        int width;
        int height;
        PAGBannerSize pAGBannerSizeIk = gzwVar.ik();
        float fMin = Math.min(this.uef.getExpressViewAcceptedHeight(), 250.0f);
        if (pAGBannerSizeIk != null) {
            width = pAGBannerSizeIk.getWidth();
            height = pAGBannerSizeIk.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float expressViewAcceptedWidth = width > 0 ? width : this.uef.getExpressViewAcceptedWidth();
        if (height > 0) {
            fMin = height;
        }
        this.uef.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
        return new com.bytedance.sdk.openadsdk.core.moa.xs(this.yo, gzwVar, this.uef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, long j8) {
        if (this.moa != null) {
            PAGBannerAd pAGBannerAdUef = uef(gzwVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMoa = this.xs.moa();
            if (!TextUtils.isEmpty(this.uef.getBidAdm())) {
                com.bytedance.sdk.openadsdk.ab.moa.uef(gzwVar, jMoa);
            }
            this.moa.onAdLoaded(pAGBannerAdUef);
            uef(gzwVar, jMoa, j8, jElapsedRealtime);
        }
    }

    private void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, final long j8, final long j10, final long j11) {
        try {
            if (!com.bytedance.sdk.openadsdk.core.sy.moa().wxf() || !com.bytedance.sdk.openadsdk.gzw.lw.moa() || this.ivm != 1 || gzwVar == null || gzwVar.at() == null || gzwVar.at().isEmpty() || gzwVar.moa().uef() == null) {
                return;
            }
            final JSONObject jSONObjectUef = gzwVar.moa().uef();
            com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, jSONObjectUef.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.zjm.bcc.3
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject oa() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", jSONObjectUef.optLong("duration", 0L));
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject yo() {
                    try {
                        long jOptLong = jSONObjectUef.optLong("callback_start", 0L);
                        long j12 = j10;
                        long j13 = j12 - jOptLong;
                        long j14 = j11 - j12;
                        JSONObject jSONObjectOptJSONObject = jSONObjectUef.optJSONObject("extra_data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put("thread_dispatch_duration", j13);
                        jSONObjectOptJSONObject.put("build_banner_ad_duration", j14);
                        jSONObjectOptJSONObject.put("ad_load_duration_full", j8);
                        return jSONObjectOptJSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.lw.getAndSet(false) || (pAGBannerAdLoadListener = this.moa) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i5, str);
    }
}
