package com.bytedance.sdk.openadsdk.core.yo;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.ab;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.wrv;
import com.bytedance.sdk.openadsdk.core.pu;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa extends yo {
    private static int lz = Integer.MIN_VALUE;

    /* renamed from: ab, reason: collision with root package name */
    protected Map<String, Object> f25831ab;
    protected final int bcc;
    protected com.bytedance.sdk.openadsdk.core.moa.uef bs;
    protected com.bykv.vk.openvk.uef.uef.uef.moa.yo cq;
    protected WeakReference<View> cz;
    protected uef dj;
    protected boolean dz;
    protected final gzw ivm;
    public ab lw;
    protected Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private WeakReference<Activity> f25832oa;
    protected int oib;
    protected com.bytedance.sdk.openadsdk.core.zjm.oa sy;
    private String uef;
    protected com.bytedance.sdk.openadsdk.tpx.uef.uef.yo wk;
    protected PAGNativeAd wrv;
    protected final String xs;
    private boolean yo;
    protected wrv zjm;

    public interface uef {
        void uef(View view, int i5);
    }

    public oa(Context context, gzw gzwVar, String str, int i5) {
        this.dz = false;
        this.oib = 0;
        this.yo = false;
        this.moa = context;
        this.ivm = gzwVar;
        this.xs = str;
        this.bcc = i5;
    }

    public void lw(boolean z2) {
        this.dz = z2;
    }

    public View moa() {
        WeakReference<Activity> weakReference = this.f25832oa;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f25832oa.get().findViewById(R.id.content);
    }

    public void oa(View view) {
        if (view == null) {
            return;
        }
        this.cz = new WeakReference<>(view);
    }

    public boolean uef(wrv wrvVar, Map<String, Object> map) {
        return false;
    }

    public void yo(int i5) {
        this.gr = i5;
    }

    public static boolean yo(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || uef(view.getContext()) == view.getId() || bs.nj == view.getId() || bs.anj == view.getId();
    }

    public String lw() {
        return this.uef;
    }

    public void oa(int i5) {
        this.f25836ue = i5;
    }

    public void uef(com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yoVar) {
        this.wk = yoVar;
    }

    public void moa(int i5) {
        this.oib = i5;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.zjm.oa oaVar) {
        this.sy = oaVar;
    }

    public void uef(PAGNativeAd pAGNativeAd) {
        this.wrv = pAGNativeAd;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.moa.uef uefVar) {
        this.bs = uefVar;
    }

    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar) {
        this.cq = yoVar;
    }

    public void uef(uef uefVar) {
        this.dj = uefVar;
    }

    public void uef(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f25832oa = new WeakReference<>(activity);
    }

    public oa(Context context, gzw gzwVar, String str, int i5, boolean z2) {
        this(context, gzwVar, str, i5);
        this.yo = z2;
    }

    public void uef(Map<String, Object> map) {
        Map<String, Object> map2 = this.f25831ab;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.f25831ab);
        }
        this.f25831ab = map;
    }

    public void uef(int i5) {
        this.pz = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.yo.yo
    public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
        int i5;
        boolean z10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        if (this.moa == null) {
            this.moa = sy.uef();
        }
        if ((this.yo || !uef(view, 1, f10, f11, f12, f13, sparseArray, z2)) && this.moa != null) {
            ab abVar = this.lw;
            if (abVar != null) {
                int i10 = abVar.bcc;
                JSONObject jSONObject3 = abVar.cz;
                JSONObject jSONObject4 = abVar.cq;
                z10 = abVar.dz;
                i5 = i10;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i5 = -1;
                z10 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j8 = this.gsd;
            long j10 = this.rt;
            WeakReference<View> weakReference = this.cz;
            wrv wrvVarUef = uef(f10, f11, f12, f13, sparseArray, j8, j10, weakReference == null ? null : weakReference.get(), lw(), af.bcc(this.moa), af.zjm(this.moa), af.cz(this.moa), i5, jSONObject, jSONObject2);
            this.zjm = wrvVarUef;
            if (uef(wrvVarUef, this.f25831ab)) {
                return;
            }
            if (this.cq != null) {
                if (this.f25831ab == null) {
                    this.f25831ab = new HashMap();
                }
                this.f25831ab.put("duration", Long.valueOf(this.cq.ivm()));
            }
            gzw gzwVar = this.ivm;
            if (!this.yo && !z10) {
                uef uefVar = this.dj;
                if (uefVar != null) {
                    uefVar.uef(view, -1);
                }
                if (uef(view, z2)) {
                    boolean zOa = cp.oa(gzwVar);
                    String strUef = zOa ? this.xs : gb.uef(this.bcc);
                    if (view != null) {
                        try {
                            if (Boolean.TRUE.equals(view.getTag(520093762))) {
                                pu.uef(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity activityUef = view != null ? com.bytedance.sdk.component.utils.oa.uef(view) : null;
                    boolean zUef = pu.uef(activityUef == null ? this.moa : activityUef, gzwVar, this.bcc, this.wrv, this.bs, strUef, this.wk, zOa, 0);
                    pu.uef(false);
                    if (zUef || gzwVar == null || gzwVar.agr() == null || gzwVar.agr().yo() != 2) {
                        if (gzwVar != null && !zUef && TextUtils.isEmpty(gzwVar.cc()) && com.bytedance.sdk.openadsdk.moa.oa.uef(this.xs)) {
                            com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this.moa, this.xs).uef(gzwVar);
                        }
                        com.bytedance.sdk.openadsdk.moa.yo.uef("click", gzwVar, this.zjm, this.xs, zUef, this.f25831ab, z2 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef("click", gzwVar, this.zjm, this.xs, true, this.f25831ab, z2 ? 1 : 2);
            com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = gzwVar.odd();
            if (moaVarOdd == null || gzwVar.ebe() || (moaVarUef = moaVarOdd.uef()) == null) {
                return;
            }
            com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar = this.cq;
            moaVarUef.xs(yoVar != null ? yoVar.ivm() : 0L);
        }
    }

    public boolean uef(View view, boolean z2) {
        return uef(view, this.ivm, z2);
    }

    public static boolean uef(View view, gzw gzwVar, boolean z2) {
        if (view != null && gzwVar != null) {
            try {
                int i5 = com.bytedance.sdk.component.adexpress.dynamic.uef.dhk;
                String strValueOf = String.valueOf(view.getTag(i5));
                if (view.getTag(i5) != null && !TextUtils.isEmpty(strValueOf)) {
                    if ("click".equals(strValueOf)) {
                        return z2;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (yo(view)) {
                return gzwVar.vjj() != 1 || z2;
            }
            if (gzwVar.hnk() == 1 && !z2) {
                return false;
            }
        }
        return true;
    }

    public wrv uef(float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, long j8, long j10, View view, String str, float f14, int i5, float f15, int i10, JSONObject jSONObject, JSONObject jSONObject2) {
        return new wrv.uef().ivm(f10).lw(f11).moa(f12).yo(f13).oa(j8).uef(j10).uef(af.uef(view)).oa(af.yo(view)).moa(this.gr).lw(this.f25836ue).ivm(this.pz).uef(sparseArray).oa(zjm.oa().uef() ? 1 : 2).uef(str).uef(f14).yo(i5).oa(f15).uef(i10).uef(jSONObject).oa(jSONObject2).uef();
    }

    public boolean uef(View view, int i5, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
        if (this.sy == null) {
            return false;
        }
        this.sy.uef(view, i5, new ab.uef().moa(f10).yo(f11).oa(f12).uef(f13).oa(this.gsd).uef(this.rt).uef(sparseArray).uef(z2).uef());
        return true;
    }

    private static int uef(Context context) {
        if (lz == Integer.MIN_VALUE) {
            lz = orq.lw(context, "btn_native_creative");
        }
        return lz;
    }

    public void uef(String str) {
        this.uef = str;
    }
}
