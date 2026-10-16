package com.bytedance.sdk.openadsdk.moa.uef;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.sy;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class xs implements com.bytedance.sdk.component.ivm.uef.lw {
    private final String uef = "[8005]";

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public boolean bcc() {
        return true;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public boolean cq() {
        return com.bytedance.sdk.openadsdk.gzw.lw.uef("batch_log_config", "enable", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public String cz() {
        return gb.moa();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public com.bytedance.sdk.component.ivm.uef.ivm dj() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public boolean dz() {
        return com.bytedance.sdk.openadsdk.gzw.lw.uef("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public int ivm() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public Executor lw() {
        return km.bcc();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public Executor moa() {
        return km.moa();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public boolean oa() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public com.bytedance.sdk.component.ivm.uef.moa.uef uef(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public int wk() {
        return com.bytedance.sdk.openadsdk.gzw.lw.uef("batch_log_config", "once_max", 10);
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public long wrv() {
        long jUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("log_queue_timeout", 40000);
        if (jUef < 30000 || jUef > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return jUef;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public boolean xs() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public boolean yo() {
        return true;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public com.bytedance.sdk.component.ivm.uef.lw.yo zjm() {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            return null;
        }
        return new yo();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public String oa(String str) {
        return com.bytedance.sdk.component.moa.uef.uef(str, com.bytedance.sdk.openadsdk.core.uef.uef());
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public boolean uef() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public int yo(String str) {
        zjm zjmVarTam = dj.oa().tam();
        if (zjmVarTam == null) {
            return 3;
        }
        return zjmVarTam.uef(str);
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public boolean uef(Context context) {
        return sy.uef(context);
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public String uef(String str) {
        return com.bytedance.sdk.component.moa.uef.oa(str, com.bytedance.sdk.openadsdk.core.uef.uef());
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public void uef(boolean z2, int i5, long j8, com.bytedance.sdk.component.ivm.uef.ivm.moa moaVar) {
        Runnable runnableUef;
        if (moaVar == null) {
            return;
        }
        if (z2) {
            com.bytedance.sdk.openadsdk.ab.moa.uef("track_link_result", false, new cz(true, moaVar));
            return;
        }
        zjm zjmVarTam = dj.oa().tam();
        if (zjmVarTam == null || moaVar.moa() >= zjmVarTam.uef(moaVar.ivm())) {
            com.bytedance.sdk.openadsdk.ab.moa.uef("track_link_result", false, new cz(false, moaVar));
        } else {
            if (!zjmVarTam.uef() || (runnableUef = moaVar.uef(cq.uef(com.bytedance.sdk.openadsdk.core.sy.uef()), null)) == null) {
                return;
            }
            km.uef().schedule(runnableUef, zjmVarTam.oa(moaVar.ivm()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw
    public HandlerThread uef(String str, int i5) {
        return com.bytedance.sdk.component.utils.bcc.uef(str, i5);
    }
}
