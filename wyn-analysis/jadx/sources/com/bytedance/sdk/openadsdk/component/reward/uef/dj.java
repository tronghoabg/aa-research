package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.R;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.component.reward.uef.lw;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.wrv;
import com.bytedance.sdk.openadsdk.core.yo.uef;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.bytedance.sdk.openadsdk.utils.af;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dj {

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.yo.oa f25399oa;
    private final oa uef;
    private final com.bytedance.sdk.openadsdk.core.yo.lw yo;

    public dj(oa oaVar) {
        this.uef = oaVar;
        this.yo = uef(oaVar, oaVar.f25412oa);
        this.f25399oa = new com.bytedance.sdk.openadsdk.core.yo.oa(oaVar.pu, oaVar.f25412oa, oaVar.lw, oaVar.moa ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dj.1
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
                try {
                    dj.this.uef(view, f10, f11, f12, f13, sparseArray, this.pz, this.gr, this.f25836ue);
                } catch (Exception e7) {
                    dhk.yo("TTAD.RFReportManager", "onClickReport error :" + e7.getMessage());
                }
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(dj.this.uef.f25412oa, 9);
                dj.this.uef.tpx.swd();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject bcc() {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        oa oaVar = this.uef;
        if (!oaVar.vjj || (bccVar = oaVar.sw) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.moa.yo.uef(bccVar.dj + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean cz() {
        gzw gzwVar = this.uef.f25412oa;
        return gzwVar != null && gzwVar.uf() == 1;
    }

    private boolean xs() {
        oa oaVar = this.uef;
        if (oaVar == null) {
            return true;
        }
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = oaVar.sw;
        boolean z2 = bccVar != null && bccVar.sk().gr();
        oa oaVar2 = this.uef;
        boolean z10 = oaVar2.cop;
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar2 = oaVar2.sw;
        return z2 && !z10 && (bccVar2 != null && !bccVar2.dv());
    }

    private JSONObject zjm() {
        try {
            long jGzw = this.uef.tpx.gzw();
            int iGsd = this.uef.tpx.gsd();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jGzw);
                jSONObject.put("percent", iGsd);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void ivm() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.uef.cz.get()) {
                jSONObject.put("endcard_content", this.uef.ku.yo() ? 1 : this.uef.fz.moa() ? 3 : this.uef.ku.moa() ? 2 : 0);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        oa oaVar = this.uef;
        com.bytedance.sdk.openadsdk.moa.yo.oa(oaVar.f25412oa, oaVar.lw, "click_close", jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.yo.lw lw() {
        return this.yo;
    }

    public com.bytedance.sdk.openadsdk.core.yo.oa moa() {
        return this.f25399oa;
    }

    public com.bytedance.sdk.openadsdk.core.yo.lw yo() {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        this.yo.oa(this.uef.pu.findViewById(R.id.content));
        if (this.uef.orq.yo() != null) {
            this.yo.uef(this.uef.orq.yo());
        }
        this.uef.gzw.uef(this.yo);
        this.yo.uef(new uef.InterfaceC0112uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dj.3
            @Override // com.bytedance.sdk.openadsdk.core.yo.uef.InterfaceC0112uef
            public long getVideoProgress() {
                return dj.this.uef.tpx.cq();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.dj djVar = this.uef.oyt;
        com.bytedance.sdk.openadsdk.core.yo.lw lwVar = this.yo;
        djVar.uef(lwVar, lwVar, this.f25399oa);
        this.uef.lz.uef(this.yo);
        if (com.bytedance.sdk.openadsdk.core.model.dhk.wrv(this.uef.f25412oa) && (yoVar = this.uef.dxx.uef) != null && yoVar.getITopLayout() != null) {
            af.uef(this.uef.dxx.uef.getITopLayout(), (View.OnClickListener) this.f25399oa, "LandPage#TopLayoutEmptyClick");
        }
        return this.yo;
    }

    public void oa() {
        if (xs()) {
            return;
        }
        gzw gzwVar = this.uef.f25412oa;
        if (gzwVar == null || !gzwVar.swd()) {
            JSONObject jSONObject = new JSONObject();
            boolean z2 = false;
            int iDj = -1;
            try {
                if (this.uef.f25412oa.ivm()) {
                    oa oaVar = this.uef;
                    if (oaVar.gsd != null && oaVar.f25412oa.ggp() == 2) {
                        jSONObject.put("dynamic_show_type", this.uef.gsd.dj());
                        this.uef.gsd.uef(jSONObject);
                        iDj = this.uef.gsd.dj();
                        z2 = true;
                    }
                }
                View viewFindViewById = this.uef.pu.findViewById(R.id.content);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
                jSONObject.put("root_view", jSONObject2.toString());
            } catch (Throwable th) {
                dhk.uef("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th);
            }
            uef(jSONObject, bcc(), z2, iDj, false);
        }
    }

    public void uef() {
        gzw gzwVar;
        if (xs() || (gzwVar = this.uef.f25412oa) == null || gzwVar.swd()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectBcc = bcc();
        boolean z2 = false;
        int iDj = -1;
        try {
            if (this.uef.yo()) {
                if (jSONObjectBcc == null) {
                    jSONObjectBcc = new JSONObject();
                }
                int iUef = this.uef.uef();
                if (1001 == iUef) {
                    jSONObject.put("dynamic_show_type", iUef + this.uef.oa());
                } else {
                    jSONObject.put("dynamic_show_type", iUef);
                }
            } else if (this.uef.f25412oa.ivm()) {
                oa oaVar = this.uef;
                if (oaVar.gsd != null && oaVar.f25412oa.ggp() == 2) {
                    jSONObject.put("dynamic_show_type", this.uef.gsd.dj());
                    this.uef.gsd.uef(jSONObject);
                    iDj = this.uef.gsd.dj();
                    z2 = true;
                }
            }
        } catch (JSONException e7) {
            Log.e("TTAD.RFReportManager", "Inject render fail info to pagJsonData failed", e7);
        }
        uef(jSONObject, jSONObjectBcc, z2, iDj, true);
    }

    public void yo(boolean z2) {
        oa oaVar = this.uef;
        if (oaVar != null && z2 && oaVar.f25412oa.vxo() && !this.uef.f25412oa.ue()) {
            this.uef.f25412oa.xs(true);
            oa oaVar2 = this.uef;
            gzw gzwVar = oaVar2.f25412oa;
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, oaVar2.lw, gzwVar.lu());
        }
    }

    public void oa(boolean z2) {
        gzw gzwVar;
        oa oaVar = this.uef;
        if (oaVar == null) {
            return;
        }
        if (!z2 && oaVar.hts > 0 && (gzwVar = oaVar.f25412oa) != null && gzwVar.swd()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.uef.hts);
            oa oaVar2 = this.uef;
            com.bytedance.sdk.openadsdk.moa.yo.uef(strValueOf, oaVar2.f25412oa, oaVar2.lw, oaVar2.tpx.lw());
            this.uef.hts = 0L;
        } else {
            this.uef.hts = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.uef.f25412oa, z2 ? 4 : 8);
        com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(this.uef.f25412oa, z2 ? 4 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(JSONObject jSONObject, JSONObject jSONObject2, boolean z2, int i5, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        oa oaVar = this.uef;
        gzw gzwVar = oaVar.f25412oa;
        com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, oaVar.lw, jSONObject, jSONObject2);
        this.uef.gb.zjm();
        if (!z2) {
            i5 = -1;
        }
        lw.uef uefVar = new lw.uef(i5);
        uef(uefVar);
        com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.uef.pu.findViewById(R.id.content), gzwVar, uefVar);
        com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(gzwVar);
        if (!z10 || (moaVarOdd = gzwVar.odd()) == null) {
            return;
        }
        moaVarOdd.uef().uef(0L);
    }

    private void oa(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, int i5, int i10, int i11) {
        gzw gzwVar;
        if (!cz() || (gzwVar = this.uef.f25412oa) == null || view == null) {
            return;
        }
        boolean z2 = com.bytedance.sdk.openadsdk.core.model.dhk.wrv(gzwVar) && (view instanceof TopLayoutDislike2) && this.uef.dxx.uef.getITopLayout() == view;
        int id2 = view.getId();
        if (z2 || id2 == com.bytedance.sdk.openadsdk.utils.bs.xs || id2 == com.bytedance.sdk.openadsdk.utils.bs.ivm || id2 == com.bytedance.sdk.openadsdk.utils.bs.lw || id2 == com.bytedance.sdk.openadsdk.utils.bs.moa || id2 == com.bytedance.sdk.openadsdk.utils.bs.dz || id2 == com.bytedance.sdk.openadsdk.utils.bs.aje || id2 == com.bytedance.sdk.openadsdk.utils.bs.sy || id2 == 520093705 || id2 == com.bytedance.sdk.openadsdk.utils.bs.cq || id2 == 520093707 || id2 == com.bytedance.sdk.openadsdk.utils.bs.cz) {
            int iZjm = af.zjm(com.bytedance.sdk.openadsdk.core.sy.uef());
            com.bytedance.sdk.openadsdk.core.model.wrv wrvVarUef = new wrv.uef().ivm(f10).lw(f11).moa(f12).yo(f13).oa(System.currentTimeMillis()).uef(0L).uef(af.uef(this.uef.oyt.dj())).oa(af.yo(this.uef.oyt.dj())).moa(i10).lw(i11).ivm(i5).uef(sparseArray).oa(com.bytedance.sdk.openadsdk.core.zjm.oa().uef() ? 1 : 2).yo(iZjm).uef(af.bcc(com.bytedance.sdk.openadsdk.core.sy.uef())).oa(af.cz(com.bytedance.sdk.openadsdk.core.sy.uef())).uef();
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(this.uef.tpx.cq()));
            oa oaVar = this.uef;
            String str = oaVar.lw;
            if (z2) {
                str = "landingpage_endcard";
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef("click_other", oaVar.f25412oa, wrvVarUef, str, true, (Map<String, Object>) map, -1);
        }
    }

    public void uef(final Map<String, Object> map) {
        if (xs()) {
            return;
        }
        gzw gzwVar = this.uef.f25412oa;
        if (gzwVar == null || !gzwVar.swd()) {
            final View viewFindViewById = this.uef.pu.findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = this.uef.pu.getWindow().getDecorView();
            }
            int width = viewFindViewById.getWidth();
            int height = viewFindViewById.getHeight();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dj.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z2;
                    int iDj;
                    Map map2;
                    oa unused = dj.this.uef;
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", viewFindViewById.getWidth());
                        jSONObject2.put("height", viewFindViewById.getHeight());
                        jSONObject2.put("alpha", viewFindViewById.getAlpha());
                        jSONObject.put("root_view", jSONObject2.toString());
                    } catch (Throwable th) {
                        dhk.uef("TTAD.RFReportManager", "run: ", th);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (dj.this.uef.gsd == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                        z2 = false;
                        iDj = -1;
                    } else {
                        iDj = dj.this.uef.gsd.dj();
                        z2 = true;
                    }
                    int i5 = iDj;
                    boolean z10 = z2;
                    dj djVar = dj.this;
                    djVar.uef(jSONObject3, djVar.bcc(), z10, i5, false);
                }
            };
            Thread.currentThread().getName();
            if (width > 0 && height > 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                    return;
                } else {
                    viewFindViewById.post(runnable);
                    return;
                }
            }
            viewFindViewById.post(runnable);
        }
    }

    private void uef(lw.uef uefVar) {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        oa oaVar = this.uef;
        if (!oaVar.vjj || (bccVar = oaVar.sw) == null) {
            return;
        }
        uefVar.f25909oa = bccVar.dj;
    }

    public void uef(boolean z2) {
        gzw gzwVar = this.uef.f25412oa;
        if (gzwVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ab.uef.moa moaVarLw = com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef(z2 ? 7 : 8).yo(String.valueOf(gzwVar.jnk())).lw(this.uef.f25412oa.ofp());
        moaVarLw.oa(this.uef.ku.sy()).ivm(this.uef.ku.oib());
        moaVarLw.xs(this.uef.f25412oa.em()).moa(this.uef.f25412oa.iou());
        com.bytedance.sdk.openadsdk.ab.moa.uef().oa(moaVarLw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, int i5, int i10, int i11) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.bs.xs) {
            uef("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.bs.ivm && view.getId() != com.bytedance.sdk.openadsdk.utils.bs.cz) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.bs.lw) {
                uef("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.bs.moa) {
                uef("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.bs.dz && view.getId() != com.bytedance.sdk.openadsdk.utils.bs.aje && view.getId() != com.bytedance.sdk.openadsdk.utils.bs.sy) {
                if (view.getId() == 520093705) {
                    uef("click_start_play", zjm());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.bs.cq) {
                    uef("click_video", zjm());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.bs.zjm) {
                    uef("fallback_endcard_click", zjm());
                }
            } else {
                uef("click_start_play_bar", zjm());
            }
        } else {
            uef("click_play_star_nums", (JSONObject) null);
        }
        oa(view, f10, f11, f12, f13, sparseArray, i5, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str, JSONObject jSONObject) {
        oa oaVar = this.uef;
        gzw gzwVar = oaVar.f25412oa;
        String str2 = oaVar.lw;
        if (!oaVar.moa) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.yo.lw uef(final oa oaVar, final gzw gzwVar) {
        return new com.bytedance.sdk.openadsdk.core.yo.lw(oaVar.pu, gzwVar, oaVar.lw, oaVar.moa ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dj.4
            @Override // com.bytedance.sdk.openadsdk.core.yo.lw
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, int i5, int i10, int i11, boolean z2) {
                if (gzwVar.ebe() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        uef((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(oaVar.tpx.cq()));
                if (oaVar.cz.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = oaVar.sw;
                if (bccVar != null) {
                    bccVar.uef(map, f10, f11);
                }
                uef(map);
                oaVar.gb.lz();
                oaVar.orq.uef(view, f10, f11, f12, f13, sparseArray, i5, i10, i11, new lw.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.dj.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.lw.uef
                    public void uef(String str, JSONObject jSONObject) {
                        dj.this.uef(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.uef.lw.uef
                    public void uef(View view2, float f14, float f15, float f16, float f17, SparseArray<yo.uef> sparseArray2, int i12, int i13, int i14) {
                        dj.this.uef(view2, f14, f15, f16, f17, sparseArray2, i12, i13, i14);
                    }
                });
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(gzwVar, 9);
                oaVar.tpx.swd();
            }
        };
    }
}
