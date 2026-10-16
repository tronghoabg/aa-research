package com.bytedance.sdk.openadsdk.core.dz;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dz.oa.oa;
import com.bytedance.sdk.openadsdk.core.dz.oa.uef;
import com.bytedance.sdk.openadsdk.core.dz.oa.yo;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa {

    /* renamed from: ab, reason: collision with root package name */
    private long f25582ab;
    private gzw bs;
    private boolean dhk;
    private boolean oib;
    private String orq;
    private boolean sy;
    private String tpx;
    private boolean wk;
    private final AtomicBoolean cq = new AtomicBoolean(false);
    private final AtomicBoolean dz = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> uef = new ArrayList();

    /* renamed from: oa, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> f25583oa = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> yo = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> moa = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> lw = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> ivm = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> xs = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> bcc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> cz = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> zjm = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.oa> dj = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.dz.oa.uef> wrv = new ArrayList();

    public void bcc(long j8) {
        if (!uef(j8, this.cz, null, this.wk ? null : new yo.oa("mute", this.bs, j8)) || this.wk) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_mute", (JSONObject) null);
    }

    public void cz(long j8) {
        if (!uef(j8, this.zjm, null, this.wk ? null : new yo.oa("unmute", this.bs, j8)) || this.wk) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_unmute", (JSONObject) null);
    }

    public void dj(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.cz.addAll(list);
    }

    public void ivm(long j8) {
        if (!uef(j8, this.xs, null, this.wk ? null : new yo.oa("skip", this.bs)) || this.wk) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_skip", (JSONObject) null);
    }

    public void lw(long j8) {
        if (this.dz.compareAndSet(false, true)) {
            uef(j8, this.ivm, (com.bytedance.sdk.openadsdk.core.dz.uef.uef) null);
        }
    }

    public void moa(long j8) {
        if (!uef(j8, this.lw, null, new yo.oa(this.wk ? "video_progress" : "complete", this.bs, 1.0f)) || this.wk) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_complete", (JSONObject) null);
    }

    public void oa(long j8) {
        if (!uef(j8, this.yo, null, this.wk ? null : new yo.oa("pause", this.bs, j8)) || this.wk) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_pause", (JSONObject) null);
    }

    public void uef(com.bytedance.sdk.openadsdk.core.dz.uef.uef uefVar) {
        if (!uef(-1L, this.uef, uefVar, this.wk ? null : new yo.oa("error", this.bs, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) || this.wk) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_error", (JSONObject) null);
    }

    public void wrv(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.zjm.addAll(list);
    }

    public void xs(long j8) {
        if (!uef(j8, this.bcc, null, new yo.oa(this.wk ? "click" : "clickTracking", this.bs)) || this.wk) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_video_click", (JSONObject) null);
    }

    public void yo(long j8) {
        if (!uef(j8, this.moa, null, this.wk ? null : new yo.oa("resume", this.bs, j8)) || this.wk) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_resume", (JSONObject) null);
    }

    public void zjm(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.uef.addAll(list);
    }

    public void lw(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.ivm.addAll(list);
    }

    public void bcc(List<com.bytedance.sdk.openadsdk.core.dz.oa.oa> list) {
        this.dj.addAll(list);
        Collections.sort(this.dj);
    }

    public void cz(List<com.bytedance.sdk.openadsdk.core.dz.oa.uef> list) {
        this.wrv.addAll(list);
        Collections.sort(this.wrv);
    }

    public void ivm(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.xs.addAll(list);
    }

    public void moa(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.lw.addAll(list);
    }

    public void oa(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.yo.addAll(list);
    }

    public void uef(long j8) {
        if (this.cq.compareAndSet(false, true)) {
            if (!uef(j8, this.f25583oa, null, new yo.oa(this.wk ? "show_impression" : "impression", this.bs)) || this.wk) {
                return;
            }
            com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_impression", (JSONObject) null);
        }
    }

    public void xs(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.bcc.addAll(list);
    }

    public void yo(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.moa.addAll(list);
    }

    public void uef(long j8, long j10, ivm ivmVar) {
        yo.oa oaVar;
        if (System.currentTimeMillis() - this.f25582ab >= 1000 && j8 >= 0 && j10 > 0) {
            this.f25582ab = System.currentTimeMillis();
            float f10 = j8 / j10;
            List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> listUef = uef(j8, f10);
            float f11 = 0.25f;
            if (f10 >= 0.25f && !this.sy) {
                uef("firstQuartile");
                this.sy = true;
                if (ivmVar != null) {
                    uef(ivmVar, 6);
                }
                if (!this.wk) {
                    oaVar = new yo.oa("firstQuartile", this.bs, 0.25f);
                    f10 = f11;
                }
                f10 = f11;
                oaVar = null;
            } else {
                f11 = 0.5f;
                if (f10 >= 0.5f && !this.oib) {
                    uef("midpoint");
                    this.oib = true;
                    if (ivmVar != null) {
                        uef(ivmVar, 7);
                    }
                    if (!this.wk) {
                        oaVar = new yo.oa("midpoint", this.bs, 0.5f);
                        f10 = f11;
                    }
                    f10 = f11;
                    oaVar = null;
                } else {
                    f11 = 0.75f;
                    if (f10 >= 0.75f && !this.dhk) {
                        uef("thirdQuartile");
                        this.dhk = true;
                        if (ivmVar != null) {
                            uef(ivmVar, 8);
                        }
                        if (!this.wk) {
                            oaVar = new yo.oa("thirdQuartile", this.bs, 0.75f);
                            f10 = f11;
                        }
                        f10 = f11;
                    }
                    oaVar = null;
                }
            }
            if (f10 < 0.03f) {
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (!this.wk && !listUef.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.dz.oa.yo yoVar = listUef.get(0);
                if ((yoVar instanceof com.bytedance.sdk.openadsdk.core.dz.oa.uef) && ((com.bytedance.sdk.openadsdk.core.dz.oa.uef) yoVar).uef() == 0) {
                    com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_start", (JSONObject) null);
                    oaVar = new yo.oa("start", this.bs, f10);
                }
            }
            if (listUef.isEmpty()) {
                return;
            }
            if (oaVar == null) {
                oaVar = new yo.oa("video_progress", this.bs, f10);
            }
            uef(j8, listUef, null, oaVar);
        }
    }

    public void uef(int i5, long j8, long j10) {
        if (System.currentTimeMillis() - this.f25582ab < 1000) {
            return;
        }
        this.f25582ab = System.currentTimeMillis();
        float f10 = j8 / j10;
        List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> listUef = uef(j8, f10);
        yo.oa oaVar = null;
        if (i5 != 6) {
            if (i5 == 7) {
                uef("midpoint");
                this.oib = true;
                f10 = 0.5f;
                if (!this.wk) {
                    oaVar = new yo.oa("midpoint", this.bs, 0.5f);
                }
            } else if (i5 != 8) {
                if (i5 == 15 && (listUef.get(0) instanceof com.bytedance.sdk.openadsdk.core.dz.oa.uef)) {
                    com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_start", (JSONObject) null);
                    oaVar = new yo.oa("start", this.bs, f10);
                }
            } else {
                uef("thirdQuartile");
                this.dhk = true;
                f10 = 0.75f;
                if (!this.wk) {
                    oaVar = new yo.oa("thirdQuartile", this.bs, 0.75f);
                }
            }
        } else if (!this.sy) {
            uef("firstQuartile");
            this.sy = true;
            f10 = 0.25f;
            if (!this.wk) {
                oaVar = new yo.oa("firstQuartile", this.bs, 0.25f);
            }
        }
        if (listUef.isEmpty()) {
            return;
        }
        if (oaVar == null) {
            oaVar = new yo.oa("video_progress", this.bs, f10);
        }
        uef(j8, listUef, null, oaVar);
    }

    private void uef(final ivm ivmVar, final int i5) {
        com.bytedance.sdk.component.utils.cz.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dz.moa.1
            @Override // java.lang.Runnable
            public void run() {
                ivm ivmVar2 = ivmVar;
                if (ivmVar2 != null) {
                    ivmVar2.uef(i5);
                }
            }
        });
    }

    private void uef(String str) {
        try {
            if (this.wk) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", str);
                com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_first_quartile", (JSONObject) null);
            } else if ("midpoint".equals(str)) {
                com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.moa.yo.oa(this.bs, this.tpx, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean uef(long j8, List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list, com.bytedance.sdk.openadsdk.core.dz.uef.uef uefVar, yo.oa oaVar) {
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj;
        gzw gzwVar = this.bs;
        String strDj = null;
        if (gzwVar != null && (oaVarNj = gzwVar.nj()) != null) {
            strDj = oaVarNj.dj();
        }
        return com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(this.bs, list, uefVar, j8, strDj, oaVar, uef());
    }

    private String uef() {
        if (this.orq == null) {
            this.orq = UUID.randomUUID().toString();
        }
        return this.orq;
    }

    private boolean uef(long j8, List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list, com.bytedance.sdk.openadsdk.core.dz.uef.uef uefVar) {
        return uef(j8, list, uefVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> uef(long j8, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.dj.size(); i5++) {
            com.bytedance.sdk.openadsdk.core.dz.oa.oa oaVar = this.dj.get(i5);
            if (oaVar.uef(f10)) {
                arrayList.add(oaVar);
            }
        }
        for (int i10 = 0; i10 < this.wrv.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.dz.oa.uef uefVar = this.wrv.get(i10);
            if (uefVar.uef(j8)) {
                arrayList.add(uefVar);
            }
        }
        return arrayList;
    }

    public void uef(List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) {
        this.f25583oa.addAll(list);
    }

    public void uef(JSONObject jSONObject) {
        zjm(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("errorTrackers")));
        uef(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("impressionTrackers")));
        oa(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("pauseTrackers"), true));
        yo(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("resumeTrackers"), true));
        moa(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("completeTrackers")));
        lw(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("closeTrackers")));
        ivm(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("skipTrackers")));
        xs(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("clickTrackers")));
        dj(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("muteTrackers"), true));
        wrv(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(jSONObject.optJSONArray("unMuteTrackers"), true));
        bcc(com.bytedance.sdk.openadsdk.core.dz.oa.yo.oa(jSONObject.optJSONArray("fractionalTrackers")));
        cz(com.bytedance.sdk.openadsdk.core.dz.oa.yo.yo(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void uef(gzw gzwVar) {
        this.bs = gzwVar;
        this.tpx = gzwVar.lw();
        this.wk = gzwVar.ebe();
    }

    public void uef(String str, long j8) {
        if (TextUtils.isEmpty(str) || j8 < 0) {
            return;
        }
        cz(Collections.singletonList(new uef.C0095uef(str, j8).uef()));
    }

    public void uef(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        bcc(Collections.singletonList(new oa.uef(str, f10).uef()));
    }

    public void uef(moa moaVar) {
        zjm(moaVar.uef);
        uef(moaVar.f25583oa);
        oa(moaVar.yo);
        yo(moaVar.moa);
        moa(moaVar.lw);
        lw(moaVar.ivm);
        ivm(moaVar.xs);
        xs(moaVar.bcc);
        dj(moaVar.cz);
        wrv(moaVar.zjm);
        bcc(moaVar.dj);
        cz(moaVar.wrv);
    }
}
