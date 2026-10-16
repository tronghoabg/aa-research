package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw {
    private boolean ivm;
    private final Activity lw;
    private final Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private final gzw f25405oa;
    com.bytedance.sdk.openadsdk.tpx.uef.uef.yo uef;
    private final String yo;

    public interface uef {
        void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, int i5, int i10, int i11);

        void uef(String str, JSONObject jSONObject);
    }

    public lw(gzw gzwVar, String str, Context context, Activity activity) {
        this.f25405oa = gzwVar;
        this.yo = str;
        this.moa = context;
        this.lw = activity;
    }

    private void moa() {
        if (this.f25405oa.ykf() == 4) {
            this.uef = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this.moa, this.yo);
        }
        if (this.uef == null) {
            this.uef = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this.lw, this.yo);
        }
    }

    public void oa() {
        com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yoVar = this.uef;
        if (yoVar != null) {
            yoVar.uef(this.f25405oa);
        }
    }

    public void uef() {
        if (this.ivm) {
            return;
        }
        this.ivm = true;
        moa();
    }

    public com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yo() {
        return this.uef;
    }

    public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, int i5, int i10, int i11, uef uefVar) {
        if (this.uef != null) {
            int id2 = view.getId();
            if (id2 == com.bytedance.sdk.openadsdk.utils.bs.xs) {
                uefVar.uef("click_play_star_level", null);
                return;
            }
            if (id2 == com.bytedance.sdk.openadsdk.utils.bs.ivm) {
                uefVar.uef("click_play_star_nums", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.bs.lw) {
                uefVar.uef("click_play_source", null);
                return;
            } else {
                if (id2 == com.bytedance.sdk.openadsdk.utils.bs.moa) {
                    uefVar.uef("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        uefVar.uef(view, f10, f11, f12, f13, sparseArray, i5, i10, i11);
    }
}
