package com.bytedance.sdk.openadsdk.core.yo;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.utils.bs;

/* loaded from: classes3.dex */
public abstract class xs extends yo {

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.dz.uef f25834oa;
    private final String uef;
    private yo yo;

    public xs(String str, com.bytedance.sdk.openadsdk.core.dz.uef uefVar) {
        this(str, uefVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.yo, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public void uef(yo yoVar) {
        this.yo = yoVar;
    }

    public xs(String str, com.bytedance.sdk.openadsdk.core.dz.uef uefVar, yo yoVar) {
        this.uef = str;
        this.f25834oa = uefVar;
        this.yo = yoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.yo
    public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
        com.bytedance.sdk.openadsdk.core.dz.uef uefVar = this.f25834oa;
        if (uefVar != null) {
            uefVar.lw(this.uef);
        }
        if (view != null) {
            if (view.getId() == bs.lw) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == bs.cz) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.uef);
            }
        }
        yo yoVar = this.yo;
        if (yoVar != null) {
            yoVar.gsd = this.gsd;
            yoVar.rt = this.rt;
            yoVar.gr = this.gr;
            int i5 = this.gr;
            yoVar.f25836ue = i5;
            yoVar.pz = i5;
            yoVar.uef(view, f10, f11, f12, f13, sparseArray, z2);
        }
    }
}
