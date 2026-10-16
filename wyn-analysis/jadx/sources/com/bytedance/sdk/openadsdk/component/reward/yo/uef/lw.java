package com.bytedance.sdk.openadsdk.component.reward.yo.uef;

import android.app.Activity;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.sy;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.component.reward.wrv;
import com.bytedance.sdk.openadsdk.core.gsd;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.ue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw implements wrv.uef {
    private long bcc;
    private com.bytedance.sdk.openadsdk.component.reward.yo.ivm cz;
    private String ivm;
    private String lw;
    private Activity moa;
    private int xs;
    private gzw yo;
    private final AtomicBoolean uef = new AtomicBoolean(false);

    /* renamed from: oa, reason: collision with root package name */
    private final AtomicInteger f25463oa = new AtomicInteger(0);

    public lw(gzw gzwVar, Activity activity, String str, String str2) {
        this.yo = gzwVar;
        this.moa = activity;
        this.lw = str;
        this.ivm = str2;
    }

    private JSONObject yo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.yo.ot());
            jSONObject.put("reward_amount", this.yo.jkf());
            jSONObject.put("network", sy.yo(this.moa.getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iUs = this.yo.us();
            String strMoa = "unKnow";
            if (iUs == 2) {
                strMoa = gb.oa();
            } else if (iUs == 1) {
                strMoa = gb.moa();
            }
            jSONObject.put("user_agent", strMoa);
            JSONObject jSONObjectZec = this.yo.zec();
            if (jSONObjectZec != null) {
                jSONObjectZec.put("gaid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
            }
            jSONObject.put("extra", jSONObjectZec);
            jSONObject.put("media_extra", this.ivm);
            jSONObject.put("video_duration", this.yo.nj().ivm());
            jSONObject.put("play_start_ts", this.bcc);
            jSONObject.put("play_end_ts", System.currentTimeMillis());
            jSONObject.put("duration", this.xs);
            jSONObject.put("user_id", this.lw);
            jSONObject.put("trans_id", ue.uef().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            dhk.uef("RewardFullRewardManager", "", th);
            return null;
        }
    }

    public void oa() {
        gzw gzwVar = this.yo;
        if (gzwVar == null || !gzwVar.sk()) {
            return;
        }
        this.uef.set(true);
    }

    public void uef() {
        if (this.yo != null && this.uef.get()) {
            this.yo.cz(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.wrv.uef
    public void uef(int i5) {
        if (this.uef.get()) {
            return;
        }
        uef(0L, 0, 13);
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.yo.ivm ivmVar) {
        this.cz = ivmVar;
    }

    public void uef(long j8, int i5, final int i10) {
        this.xs = i5;
        this.bcc = j8;
        if (this.uef.get()) {
            return;
        }
        this.uef.set(true);
        if (com.bytedance.sdk.openadsdk.core.sy.moa().bs(String.valueOf(this.yo.jnk()))) {
            this.f25463oa.set(1);
            com.bytedance.sdk.openadsdk.component.reward.yo.ivm ivmVar = this.cz;
            if (ivmVar != null) {
                ivmVar.oa(true, this.yo.jkf(), this.yo.ot(), 0, "", i10);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.sy.yo().uef(yo(), new gzw.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.uef.lw.1
            @Override // com.bytedance.sdk.openadsdk.core.gzw.oa
            public void uef(int i11, String str) {
                if (lw.this.cz != null) {
                    lw.this.cz.oa(false, 0, "", i11, str, i10);
                }
                lw.this.f25463oa.set(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.gzw.oa
            public void uef(gsd.oa oaVar) {
                boolean z2 = oaVar.f25626oa;
                int iUef = oaVar.yo.uef();
                String strOa = oaVar.yo.oa();
                if (lw.this.cz != null) {
                    lw.this.cz.oa(oaVar.f25626oa, iUef, strOa, 0, "", i10);
                }
                lw.this.f25463oa.set(1);
            }
        });
    }
}
