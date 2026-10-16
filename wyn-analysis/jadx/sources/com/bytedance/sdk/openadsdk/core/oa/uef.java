package com.bytedance.sdk.openadsdk.core.oa;

import cb.AbstractC1593a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.sy.moa;
import com.bytedance.sdk.openadsdk.sy.yo;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class uef implements gzw.uef {

    /* renamed from: oa, reason: collision with root package name */
    private final AdSlot f25722oa;
    private final gzw.uef uef;
    private final boolean yo;

    public uef(gzw.uef uefVar, AdSlot adSlot, boolean z2) {
        this.uef = uefVar;
        this.f25722oa = adSlot;
        this.yo = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw.uef
    public void uef(final int i5, final String str) {
        AdSlot adSlot;
        if (this.uef != null) {
            if (km.ivm() || !((adSlot = this.f25722oa) == null || adSlot.getDurationSlotType() == 5 || lw.uef("getads_callback_async", 0) != 1)) {
                this.uef.uef(i5, str);
            } else {
                km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oa.uef.1
                    @Override // java.lang.Runnable
                    public void run() {
                        uef.this.uef.uef(i5, str);
                    }
                });
            }
            if (!this.yo || this.f25722oa == null) {
                return;
            }
            yo.yo(new moa() { // from class: com.bytedance.sdk.openadsdk.core.oa.uef.2
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("load_ad");
                    uefVarF.yo(uef.this.f25722oa.getCodeId());
                    uefVarF.moa(gb.yo(uef.this.f25722oa.getDurationSlotType()));
                    uefVarF.uef(BuildConfig.VERSION_NAME);
                    uefVarF.xs(gb.uef(uef.this.f25722oa).toString());
                    return uefVarF;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gzw.uef
    public void uef(final com.bytedance.sdk.openadsdk.core.model.uef uefVar, final com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
        AdSlot adSlot;
        if (this.uef != null) {
            if (!km.ivm() && ((adSlot = this.f25722oa) == null || adSlot.getDurationSlotType() == 5 || lw.uef("getads_callback_async", 0) != 1)) {
                km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oa.uef.3
                    @Override // java.lang.Runnable
                    public void run() {
                        uef.this.uef.uef(uefVar, yoVar);
                    }
                });
            } else {
                this.uef.uef(uefVar, yoVar);
            }
            if (!this.yo || this.f25722oa == null) {
                return;
            }
            yo.oa(new moa() { // from class: com.bytedance.sdk.openadsdk.core.oa.uef.4
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("load_ad");
                    uefVarF.yo(uef.this.f25722oa.getCodeId());
                    uefVarF.moa(gb.yo(uef.this.f25722oa.getDurationSlotType()));
                    uefVarF.uef(BuildConfig.VERSION_NAME);
                    uefVarF.xs(gb.uef(uef.this.f25722oa).toString());
                    return uefVarF;
                }
            });
        }
    }
}
