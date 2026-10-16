package com.bytedance.sdk.openadsdk.component.reward.yo.uef;

import android.R;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.moa.xs;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    private String lw;
    private gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.reward.yo.uef f25470oa;
    private final com.bytedance.sdk.openadsdk.component.reward.yo.oa uef;
    private Activity yo;
    private final AtomicBoolean ivm = new AtomicBoolean(false);
    private long xs = 0;

    public yo(com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar, Activity activity, gzw gzwVar, String str) {
        this.uef = oaVar;
        this.yo = activity;
        this.moa = gzwVar;
        this.lw = str;
    }

    public long oa() {
        return this.xs;
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.yo.uef uefVar) {
        this.f25470oa = uefVar;
    }

    public boolean uef() {
        return this.ivm.get();
    }

    public void uef(final JSONObject jSONObject) {
        if (!this.ivm.get() && this.ivm.compareAndSet(false, true)) {
            final View viewFindViewById = this.yo.findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = this.yo.getWindow().getDecorView();
            }
            viewFindViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.uef.yo.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject2 = jSONObject;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("width", viewFindViewById.getWidth());
                        jSONObject3.put("height", viewFindViewById.getHeight());
                        jSONObject3.put("alpha", viewFindViewById.getAlpha());
                        jSONObject2.put("root_view", jSONObject3.toString());
                        jSONObject2.put("dynamic_show_type", yo.this.moa.ix());
                    } catch (Throwable th) {
                        dhk.uef("UnifyReportManager", "run: ", th);
                    }
                    yo.this.uef(jSONObject, (JSONObject) null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(this.moa, this.lw, jSONObject, jSONObject2);
        com.bytedance.sdk.openadsdk.component.reward.yo.uef uefVar = this.f25470oa;
        if (uefVar != null) {
            uefVar.oa();
        }
    }

    public void uef(boolean z2, xs xsVar) {
        if (this.uef == null) {
            return;
        }
        if (!z2 && this.ivm.get() && this.xs > 0) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(String.valueOf(SystemClock.elapsedRealtime() - this.xs), this.moa, this.lw, xsVar);
            this.xs = 0L;
        } else {
            this.xs = SystemClock.elapsedRealtime();
        }
    }

    public void uef(boolean z2, gzw gzwVar, String str) {
        if (gzwVar != null && z2 && gzwVar.vxo() && !gzwVar.ue()) {
            gzwVar.xs(true);
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, gzwVar.lu());
        }
    }
}
