package com.bytedance.sdk.openadsdk.zjm;

import android.os.SystemClock;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.lw.dj;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.gb;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa<T> implements ab<T> {
    private final gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f26209oa;
    private final long uef = SystemClock.elapsedRealtime();
    private final ab<T> yo;

    public oa(final gzw gzwVar, String str, ab<T> abVar) {
        this.yo = abVar;
        this.moa = gzwVar;
        this.f26209oa = str;
        com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.zjm.oa.1
            @Override // com.bytedance.sdk.openadsdk.sy.moa
            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("load_img");
                gzw gzwVar2 = gzwVar;
                if (gzwVar2 != null) {
                    uefVarF.yo(gzwVar2.fz("-1"));
                    uefVarF.moa(gb.yo(gzwVar.epe()));
                }
                uefVarF.uef(BuildConfig.VERSION_NAME);
                return uefVarF;
            }
        });
    }

    @Override // com.bytedance.sdk.component.lw.ab
    public void uef(dj<T> djVar) {
        ab<T> abVar = this.yo;
        if (abVar != null) {
            abVar.uef(djVar);
        }
        if (this.moa != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.uef;
            final int iXs = djVar.xs() / Segment.SHARE_MINIMUM;
            final int i5 = djVar.ivm() ? 1 : 0;
            com.bytedance.sdk.openadsdk.ab.moa.uef("load_image_success", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.zjm.oa.2
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", oa.this.f26209oa);
                    jSONObject.put("preload_size", iXs);
                    jSONObject.put("local_cache", i5);
                    jSONObject.put("image_mode", oa.this.moa.hw());
                    jSONObject.put("use_new_img", 1);
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("load_image_success").uef(oa.this.moa.epe()).oa(jSONObject.toString());
                }
            });
            com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.zjm.oa.3
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("load_img");
                    if (oa.this.moa != null) {
                        uefVarF.yo(oa.this.moa.fz("-1"));
                        uefVarF.moa(gb.yo(oa.this.moa.epe()));
                    }
                    uefVarF.uef(BuildConfig.VERSION_NAME);
                    return uefVarF;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.lw.ab
    public void uef(final int i5, final String str, final Throwable th) {
        ab<T> abVar = this.yo;
        if (abVar != null) {
            abVar.uef(i5, str, th);
        }
        gzw gzwVar = this.moa;
        if (gzwVar != null) {
            if (!TextUtils.isEmpty(gb.uef(gzwVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.uef;
                com.bytedance.sdk.openadsdk.ab.moa.uef("load_image_error", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.zjm.oa.4
                    @Override // com.bytedance.sdk.openadsdk.ab.oa
                    public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", jElapsedRealtime);
                        jSONObject.put("url", oa.this.f26209oa);
                        jSONObject.put("error_code", i5);
                        Throwable th2 = th;
                        if (th2 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th2);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", oa.this.moa.hw());
                        jSONObject.put("use_new_img", 1);
                        return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("load_image_error").uef(oa.this.moa.epe()).oa(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.zjm.oa.5
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("load_img");
                    if (oa.this.moa != null) {
                        uefVarF.yo(oa.this.moa.fz("-1"));
                        uefVarF.moa(gb.yo(oa.this.moa.epe()));
                    }
                    uefVarF.uef(BuildConfig.VERSION_NAME);
                    return uefVarF;
                }
            });
        }
    }
}
