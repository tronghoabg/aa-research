package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.bcc;
import com.bytedance.sdk.openadsdk.core.yo.oa;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.utils.sk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bs {
    private long bcc;
    private com.bytedance.sdk.openadsdk.core.yo.oa cq;
    private com.bykv.vk.openvk.uef.uef.uef.moa.yo dj;
    private com.bytedance.sdk.openadsdk.core.yo.uef dz;
    private final String ivm;
    private final PAGNativeAd moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo f25495oa;
    private final com.bytedance.sdk.openadsdk.core.model.gzw uef;
    private com.bytedance.sdk.openadsdk.uef.oa.ivm xs;
    private final Context yo;
    private final com.bytedance.sdk.openadsdk.uef.oa.uef zjm;
    private List<View> lw = new ArrayList();
    private final com.bytedance.sdk.openadsdk.moa.xs cz = new com.bytedance.sdk.openadsdk.moa.xs();
    private final AtomicBoolean wrv = new AtomicBoolean(false);

    public static class uef implements View.OnLayoutChangeListener {

        /* renamed from: oa, reason: collision with root package name */
        private final ViewGroup f25498oa;
        private final com.bytedance.sdk.openadsdk.moa.xs uef;

        public uef(com.bytedance.sdk.openadsdk.moa.xs xsVar, ViewGroup viewGroup) {
            this.uef = xsVar;
            this.f25498oa = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.uef.uef(System.currentTimeMillis(), km.uef(this.f25498oa));
        }
    }

    public bs(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, com.bytedance.sdk.openadsdk.uef.oa.uef uefVar) {
        this.moa = pAGNativeAd;
        this.uef = gzwVar;
        this.yo = context;
        this.ivm = str;
        this.zjm = uefVar;
        if (gzwVar.ykf() == 4) {
            this.f25495oa = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(context, str);
        }
    }

    private bcc lw(ViewGroup viewGroup) {
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt instanceof bcc) {
                return (bcc) childAt;
            }
        }
        return null;
    }

    private void moa(ViewGroup viewGroup) throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.gzw gzwVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.lw != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.lw) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            if (this.zjm.bcc() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", com.bytedance.sdk.openadsdk.utils.af.yo(this.yo, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", com.bytedance.sdk.openadsdk.utils.af.yo(this.yo, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.zjm.tpx tpxVarOa = this.zjm.oa();
            if (tpxVarOa != null && (gzwVar = this.uef) != null) {
                jSONObject.put("dynamic_show_type", gzwVar.ix());
                tpxVarOa.uef(jSONObject, this.uef);
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef(this.uef, this.ivm, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(this.uef);
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.uef("InteractionManager", "onShowFun json error", e7);
        }
    }

    private void oa(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.uef.oa.ivm ivmVar) {
        this.xs = ivmVar;
        viewGroup.addOnLayoutChangeListener(new uef(this.cz, viewGroup));
        this.lw = list;
        uef(list2, (com.bytedance.sdk.openadsdk.core.yo.yo) null);
        if (list != null) {
            for (View view : this.lw) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        uef(list3, (com.bytedance.sdk.openadsdk.core.yo.yo) null);
    }

    private bcc yo(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.uef.oa.ivm ivmVar) {
        this.xs = ivmVar;
        viewGroup.addOnLayoutChangeListener(new uef(this.cz, viewGroup));
        this.lw = list;
        bcc bccVarLw = lw(viewGroup);
        if (bccVarLw == null) {
            bccVarLw = new bcc(this.yo, viewGroup, false);
            viewGroup.addView(bccVarLw);
        }
        bccVarLw.uef();
        bccVarLw.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.lw) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        bccVarLw.setRefCreativeViews(list3);
        return bccVarLw;
    }

    public com.bytedance.sdk.openadsdk.moa.xs uef() {
        return this.cz;
    }

    public void uef(View view, int i5) {
        com.bytedance.sdk.openadsdk.uef.oa.ivm ivmVar = this.xs;
        if (ivmVar != null) {
            ivmVar.onAdClicked();
        }
    }

    public void uef(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.uef.oa.ivm ivmVar) {
        oa(viewGroup, list, list2, list3, ivmVar);
        uef(viewGroup);
        uef(viewGroup, list2, list3);
    }

    private void oa(com.bytedance.sdk.openadsdk.core.yo.oa oaVar, com.bytedance.sdk.openadsdk.core.yo.uef uefVar) {
        com.bytedance.sdk.openadsdk.uef.oa.uef uefVar2 = this.zjm;
        if (uefVar2 != null && uefVar2.oa() != null) {
            com.bytedance.sdk.openadsdk.core.zjm.tpx tpxVarOa = this.zjm.oa();
            if ((oaVar instanceof com.bytedance.sdk.openadsdk.core.zjm.zjm) && (uefVar instanceof com.bytedance.sdk.openadsdk.core.zjm.cz)) {
                tpxVarOa.setClickListener((com.bytedance.sdk.openadsdk.core.zjm.zjm) oaVar);
                tpxVarOa.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.zjm.cz) uefVar);
            }
            tpxVarOa.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lw() { // from class: com.bytedance.sdk.openadsdk.core.bs.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.lw
                public void uef() {
                    if (bs.this.xs != null) {
                        bs.this.xs.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.uef.oa.uef uefVar3 = this.zjm;
        if (uefVar3 != null && uefVar3.uef() != null) {
            this.zjm.uef().setOnClickListener(uefVar);
            this.zjm.uef().setOnTouchListener(uefVar);
        }
        com.bytedance.sdk.openadsdk.uef.oa.uef uefVar4 = this.zjm;
        if (uefVar4 != null) {
            uefVar4.uef(uefVar);
            this.zjm.uef(oaVar);
        }
    }

    private void uef(List<View> list, com.bytedance.sdk.openadsdk.core.yo.yo yoVar) {
        if (com.bytedance.sdk.component.utils.cq.oa(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(yoVar);
                    view.setOnTouchListener(yoVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(ViewGroup viewGroup) {
        this.cz.uef(System.currentTimeMillis(), km.uef(viewGroup));
    }

    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar) {
        this.dj = yoVar;
        com.bytedance.sdk.openadsdk.core.yo.oa oaVar = this.cq;
        if (oaVar != null) {
            oaVar.uef(yoVar);
        }
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar = this.dz;
        if (uefVar != null) {
            uefVar.uef(yoVar);
        }
    }

    private void uef(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextUef = viewGroup != null ? com.bytedance.sdk.component.utils.oa.uef(viewGroup) : null;
        if (contextUef == null) {
            contextUef = this.yo;
        }
        if (this.uef.ggp() == 2) {
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.uef;
            String str = this.ivm;
            this.cq = new com.bytedance.sdk.openadsdk.core.zjm.zjm(contextUef, gzwVar, str, com.bytedance.sdk.openadsdk.utils.gb.uef(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar2 = this.uef;
            String str2 = this.ivm;
            this.cq = new com.bytedance.sdk.openadsdk.core.yo.oa(contextUef, gzwVar2, str2, com.bytedance.sdk.openadsdk.utils.gb.uef(str2));
        }
        this.cq.oa(viewGroup);
        this.cq.uef(this.dj);
        this.cq.uef(this.f25495oa);
        this.cq.uef(this.moa);
        this.cq.uef(map);
        this.cq.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.bs.1
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                if (bs.this.xs != null) {
                    bs.this.xs.onAdClicked();
                }
            }
        });
        if (this.uef.ggp() == 2) {
            Context context = this.yo;
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar3 = this.uef;
            String str3 = this.ivm;
            this.dz = new com.bytedance.sdk.openadsdk.core.zjm.cz(context, gzwVar3, str3, com.bytedance.sdk.openadsdk.utils.gb.uef(str3));
        } else {
            Context context2 = this.yo;
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar4 = this.uef;
            String str4 = this.ivm;
            this.dz = new com.bytedance.sdk.openadsdk.core.yo.uef(context2, gzwVar4, str4, com.bytedance.sdk.openadsdk.utils.gb.uef(str4));
        }
        this.dz.oa(viewGroup);
        this.dz.uef(this.dj);
        this.dz.uef(this.f25495oa);
        this.dz.uef(this.moa);
        this.dz.uef(map);
        this.dz.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.bs.2
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                if (bs.this.xs != null) {
                    bs.this.xs.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(bs.this.uef, 9);
                bs.this.zjm.cq();
            }
        });
    }

    private void oa(final ViewGroup viewGroup) {
        sk.uef(viewGroup, true, 5, false, new sk.oa() { // from class: com.bytedance.sdk.openadsdk.core.bs.6
            @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
            public void oa() {
                bs.this.oa();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
            public void uef(boolean z2) {
                bs.this.uef(z2, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
            public void uef() {
                bs.this.yo(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sk.oa
            public void uef(View view, boolean z2) throws JSONException {
                if (!z2) {
                    com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(bs.this.uef, 8);
                } else {
                    com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(bs.this.uef, 4);
                    bs.this.uef(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        if (this.bcc > 0) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(String.valueOf(SystemClock.elapsedRealtime() - this.bcc), this.uef, this.ivm, this.cz);
            this.bcc = 0L;
        }
    }

    private void uef(ViewGroup viewGroup, bcc bccVar, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.yo.oa oaVar = this.cq;
        if (oaVar == null || this.dz == null) {
            return;
        }
        bccVar.uef(list, oaVar);
        bccVar.uef(list2, this.dz);
        uef(this.cq, this.dz);
        uef(bccVar, viewGroup);
    }

    private void uef(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.yo.oa oaVar = this.cq;
        if (oaVar == null || this.dz == null) {
            return;
        }
        uef(list, oaVar);
        uef(list2, this.dz);
        uef(this.cq, this.dz);
        oa(viewGroup);
    }

    private void uef(com.bytedance.sdk.openadsdk.core.yo.oa oaVar, com.bytedance.sdk.openadsdk.core.yo.uef uefVar) {
        if (this.uef.ggp() == 2) {
            oa(oaVar, uefVar);
        } else {
            uef(uefVar);
        }
    }

    private void uef(com.bytedance.sdk.openadsdk.core.yo.uef uefVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.dj.oa().moa(String.valueOf(this.uef.jnk()))) {
            com.bytedance.sdk.openadsdk.uef.oa.uef uefVar2 = this.zjm;
            if (uefVar2 != null && uefVar2.uef() != null) {
                this.zjm.uef().setOnClickListener(uefVar);
                this.zjm.uef().setOnTouchListener(uefVar);
            }
            com.bytedance.sdk.openadsdk.uef.oa.uef uefVar3 = this.zjm;
            if (uefVar3 != null) {
                uefVar3.uef(uefVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.uef.oa.uef uefVar4 = this.zjm;
        if (uefVar4 != null && uefVar4.uef() != null) {
            PAGMediaView pAGMediaViewUef = this.zjm.uef();
            com.bytedance.sdk.openadsdk.core.yo.yo yoVar = new com.bytedance.sdk.openadsdk.core.yo.yo() { // from class: com.bytedance.sdk.openadsdk.core.bs.4
                @Override // com.bytedance.sdk.openadsdk.core.yo.yo
                public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewUef.setOnClickListener(yoVar);
            pAGMediaViewUef.setOnTouchListener(yoVar);
        }
        com.bytedance.sdk.openadsdk.uef.oa.uef uefVar5 = this.zjm;
        if (uefVar5 != null) {
            uefVar5.uef((com.bytedance.sdk.openadsdk.core.yo.uef) null);
        }
    }

    private void uef(bcc bccVar, final ViewGroup viewGroup) {
        bccVar.setCallback(new bcc.uef() { // from class: com.bytedance.sdk.openadsdk.core.bs.5
            @Override // com.bytedance.sdk.openadsdk.core.bcc.uef
            public void oa() {
                bs.this.oa();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bcc.uef
            public void uef(boolean z2) {
                bs.this.uef(z2, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bcc.uef
            public void uef() {
                bs.this.yo(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bcc.uef
            public void uef(View view) throws JSONException {
                bs.this.uef(viewGroup, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(boolean z2, ViewGroup viewGroup) {
        if (z2 && this.uef.vxo() && !this.uef.ue()) {
            this.uef.xs(true);
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = this.uef;
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, this.ivm, gzwVar.lu());
        }
        if (!z2 && this.bcc > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.bcc);
            this.cz.uef(System.currentTimeMillis(), km.uef(viewGroup));
            com.bytedance.sdk.openadsdk.moa.yo.uef(strValueOf, this.uef, this.ivm, this.cz);
            this.bcc = 0L;
            return;
        }
        this.cz.uef(System.currentTimeMillis(), km.uef(viewGroup));
        this.bcc = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(ViewGroup viewGroup, View view) throws JSONException {
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        if (this.wrv.get()) {
            return;
        }
        this.wrv.set(true);
        if (this.moa instanceof com.bytedance.sdk.openadsdk.uef.oa.uef.yo) {
            com.bytedance.sdk.openadsdk.core.zjm.tpx tpxVarOa = this.zjm.oa();
            if (tpxVarOa != null) {
                tpxVarOa.oib();
            }
            ((com.bytedance.sdk.openadsdk.uef.oa.uef.yo) this.moa).uef(true);
        }
        this.cz.uef(System.currentTimeMillis(), km.uef(viewGroup));
        this.bcc = SystemClock.elapsedRealtime();
        moa(viewGroup);
        com.bytedance.sdk.openadsdk.uef.oa.ivm ivmVar = this.xs;
        if (ivmVar != null) {
            ivmVar.uef(this.moa);
        }
        if (this.uef.zrl()) {
            com.bytedance.sdk.openadsdk.utils.gb.uef(this.uef, view);
        }
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = this.uef.odd();
        if (moaVarOdd == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        moaVarUef.uef(0L);
    }
}
