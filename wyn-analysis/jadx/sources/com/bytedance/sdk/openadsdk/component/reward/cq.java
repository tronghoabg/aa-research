package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.utils.oa;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fz;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes3.dex */
public class cq {
    private final uef bcc;
    protected boolean ivm;
    protected final AtomicBoolean lw = new AtomicBoolean(false);
    protected boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.core.model.uef f25362oa;
    protected final Context uef;
    protected boolean xs;
    protected final String yo;

    public interface uef {
        Intent uef(Context context, gzw gzwVar, Activity activity);

        void uef(Intent intent, Activity activity, gzw gzwVar, boolean z2);

        void uef(gzw gzwVar);

        void uef(boolean z2);
    }

    public cq(Context context, com.bytedance.sdk.openadsdk.core.model.uef uefVar, String str, uef uefVar2) {
        this.uef = context == null ? com.bytedance.sdk.openadsdk.core.sy.uef() : context;
        this.f25362oa = uefVar;
        this.yo = str;
        this.moa = false;
        this.bcc = uefVar2;
    }

    private void moa() {
        List<gzw> listLw = this.f25362oa.lw();
        if (listLw != null) {
            Iterator<gzw> it = listLw.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.oa(this.uef, it.next());
            }
        }
    }

    public Map<String, Object> oa() {
        com.bytedance.sdk.openadsdk.core.model.uef uefVar = this.f25362oa;
        if (uefVar == null || uefVar.xs() == null) {
            return null;
        }
        return this.f25362oa.xs().hjx();
    }

    public boolean yo() {
        return this.moa;
    }

    public void uef() {
        if (this.lw.get()) {
            return;
        }
        this.moa = true;
    }

    public Object uef(String str) {
        com.bytedance.sdk.openadsdk.core.model.uef uefVar = this.f25362oa;
        if (uefVar == null || uefVar.xs() == null || this.f25362oa.xs().hjx() == null) {
            return null;
        }
        try {
            return this.f25362oa.xs().hjx().get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo(this.yo, th.getMessage());
            return null;
        }
    }

    public void uef(Double d3) {
        if (this.ivm) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.uef uefVar = this.f25362oa;
        if (uefVar != null && uefVar.xs() != null) {
            fz.uef(this.f25362oa.xs(), d3);
        }
        this.ivm = true;
    }

    public void uef(Double d3, String str, String str2) {
        if (this.xs) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.uef uefVar = this.f25362oa;
        if (uefVar != null && uefVar.xs() != null) {
            fz.uef(this.f25362oa.xs(), d3, str, str2);
        }
        this.xs = true;
    }

    public void uef(Activity activity) {
        gzw gzwVarXs;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.uef uefVar = this.f25362oa;
        if (uefVar == null || !uefVar.ivm() || (gzwVarXs = this.f25362oa.xs()) == null) {
            return;
        }
        if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
            moa();
            if (!this.lw.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.moa.zjm.uef(gzwVarXs, "show_ad_fail", this.yo, "repeat_play");
                return;
            }
            if (gzwVarXs.nj() == null && gzwVarXs.lpy().isEmpty()) {
                com.bytedance.sdk.openadsdk.moa.zjm.uef(gzwVarXs, "show_ad_fail", this.yo, "video_or_image_empty");
                return;
            }
            com.bytedance.sdk.openadsdk.moa.zjm.uef(gzwVarXs, "show_start", this.yo, (String) null);
            Context contextUef = activity == null ? this.uef : activity;
            if (contextUef == null) {
                contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
            }
            Intent intentUef = this.bcc.uef(contextUef, gzwVarXs, activity);
            if (intentUef == null) {
                return;
            }
            intentUef.putExtra("start_show_time", SystemClock.elapsedRealtime());
            boolean zCz = com.bytedance.sdk.openadsdk.gzw.lw.cz();
            intentUef.putExtra("enable_new_arch", zCz);
            this.bcc.uef(intentUef, activity, gzwVarXs, zCz);
            this.bcc.uef(zCz);
            uef(contextUef, intentUef, gzwVarXs, zCz);
            this.bcc.uef(gzwVarXs);
            return;
        }
        com.bytedance.sdk.openadsdk.moa.zjm.uef(gzwVarXs, "show_ad_fail", this.yo, "not_called_on_main_thread");
        throw new IllegalStateException(b.c(new StringBuilder("Cannot be called in a child thread —— "), this.yo, ".show"));
    }

    private void uef(Context context, Intent intent, final gzw gzwVar, boolean z2) {
        final boolean z10 = com.bytedance.sdk.openadsdk.gzw.lw.uef("start_activity_async", 0) == 1;
        if (z10) {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.component.reward.cq.1
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("start_activity");
                    uefVarF.moa(cq.this.yo);
                    return uefVarF;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.oa.uef(context, intent, new oa.InterfaceC0066oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.cq.2
            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef() {
                if (z10) {
                    cq.this.uef(jElapsedRealtime);
                }
            }

            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef(Throwable th) {
                com.bytedance.sdk.openadsdk.moa.zjm.uef(gzwVar, "show_ad_fail", cq.this.yo, "activity_start_fail");
                if (z10) {
                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.component.reward.cq.2.1
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("start_activity");
                            uefVarF.moa(cq.this.yo);
                            return uefVarF;
                        }
                    });
                }
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(long j8) {
        com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.component.reward.cq.3
            @Override // com.bytedance.sdk.openadsdk.sy.moa
            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("start_activity");
                uefVarF.moa(cq.this.yo);
                return uefVarF;
            }
        });
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j8;
        com.bytedance.sdk.openadsdk.ab.moa.uef("start_activity_action", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.cq.4
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", jElapsedRealtime);
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("start_activity_action").oa(jSONObject.toString());
            }
        });
    }
}
