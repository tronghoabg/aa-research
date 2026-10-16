package com.bytedance.sdk.openadsdk.core.zjm;

import com.bytedance.sdk.openadsdk.utils.km;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dz implements com.bytedance.adsdk.ugeno.core.sy, com.bytedance.sdk.component.adexpress.oa.cz {
    private boolean ivm;
    private long lw;
    private final String moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f25854oa;
    private final com.bytedance.sdk.openadsdk.moa.moa.lw uef;
    private final com.bytedance.sdk.openadsdk.core.model.gzw yo;

    public dz(com.bytedance.sdk.openadsdk.moa.moa.lw lwVar, String str, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str2, boolean z2) {
        this.uef = lwVar;
        this.f25854oa = str;
        this.moa = str2;
        this.yo = gzwVar;
        this.ivm = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void bcc() {
        this.uef.dz();
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void cz() {
        this.uef.oa();
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void ivm(int i5) {
        final String str;
        System.currentTimeMillis();
        if (i5 == 3) {
            this.uef.xs("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.uef.xs("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.uef.uef(true);
        km.oa(new com.bytedance.sdk.component.bcc.oa.yo("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.zjm.dz.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.moa.yo.oa(dz.this.yo, dz.this.f25854oa, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void lw() {
        this.uef.oa();
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void moa() {
        this.uef.uef();
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void xs(int i5) {
        this.uef.uef(i5);
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void yo(int i5) {
        if (i5 == 3) {
            this.uef.moa("dynamic_sub_analysis2_end");
        } else {
            this.uef.moa("dynamic_sub_analysis_end");
        }
    }

    public void zjm() {
        this.uef.zjm();
        this.uef.dj();
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void lw(int i5) {
        if (i5 == 3) {
            this.uef.moa("dynamic_sub_render2_end");
        } else {
            this.uef.moa("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void moa(int i5) {
        if (i5 == 3) {
            this.uef.moa("dynamic_sub_render2_start");
        } else {
            this.uef.moa("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void oa(int i5) {
        if (i5 == 3) {
            this.uef.moa("dynamic_sub_analysis2_start");
        } else {
            this.uef.moa("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void uef(boolean z2) {
        this.uef.oa(z2 ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void xs() {
        this.uef.cq();
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void uef(int i5, String str) throws JSONException {
        this.uef.uef(i5, str);
        wrv.uef("Web", i5, str, this.f25854oa, this.moa, this.yo);
    }

    @Override // com.bytedance.adsdk.ugeno.core.sy
    public void yo() {
        this.uef.lw("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.sy
    public void oa() {
        this.uef.lw("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void uef(int i5) {
        this.lw = System.currentTimeMillis();
        if (i5 == 3) {
            this.uef.yo("dynamic_render2_start");
        } else {
            this.uef.yo("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void ivm() {
        this.uef.uef(true);
        this.uef.wrv();
        km.oa(new com.bytedance.sdk.component.bcc.oa.yo("native_success") { // from class: com.bytedance.sdk.openadsdk.core.zjm.dz.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.moa.yo.oa(dz.this.yo, dz.this.f25854oa, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.cz
    public void uef(int i5, int i10, String str, boolean z2) throws JSONException {
        if (!z2) {
            this.uef.uef(true);
        }
        if (i5 == 3) {
            this.uef.oa(i10, "dynamic_render2_error");
        } else {
            this.uef.oa(i10, "dynamic_render_error");
        }
        wrv.uef("NDR", i10, str, this.f25854oa, this.moa, this.yo);
    }

    @Override // com.bytedance.adsdk.ugeno.core.sy
    public void uef() {
        this.uef.uef("ugen_render_start", this.ivm);
        this.uef.lw("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.sy
    public void uef(com.bytedance.adsdk.ugeno.core.bs bsVar) throws JSONException {
        if (bsVar.uef() == 0) {
            this.uef.lw("ugen_sub_render_end");
            this.uef.ivm("ugen_render_success");
        } else {
            this.uef.yo(bsVar.uef(), "ugen_render_error");
            wrv.uef("UGen", bsVar.uef(), bsVar.oa(), this.f25854oa, this.moa, this.yo);
        }
        this.uef.uef(true);
    }
}
