package com.bytedance.sdk.openadsdk.component.reward.yo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.oa;
import com.bytedance.sdk.openadsdk.activity.TTFullWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.zjm;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo extends oa {
    private static com.bytedance.sdk.openadsdk.uef.yo.oa sy;
    private com.bytedance.sdk.openadsdk.uef.yo.oa bs;
    private long oib;

    public yo(Activity activity, Context context, gzw gzwVar, String str, ViewGroup viewGroup, String str2) {
        super(activity, context, gzwVar, str, viewGroup, str2);
        this.oib = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa;
        gzw gzwVar = this.lw;
        if (gzwVar == null || (uefVarMoa = gzwVar.moa()) == null) {
            return;
        }
        List<gzw> listLw = uefVarMoa.lw();
        if (listLw != null) {
            Iterator<gzw> it = listLw.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.oa(this.wrv, it.next());
            }
        }
        gzw gzwVar2 = this.lw;
        if (gzwVar2 == null || (gzwVar2.nj() == null && this.lw.lpy() == null)) {
            zjm.uef(this.lw, "show_ad_fail", this.ivm, "video_or_image_empty");
            return;
        }
        this.lw.sy(1);
        zjm.uef(this.lw, "show_start", this.ivm, (String) null);
        Context contextUef = this.moa;
        if (contextUef == null) {
            contextUef = this.wrv;
        }
        if (contextUef == null) {
            contextUef = sy.uef();
        }
        Intent intent = new Intent(contextUef, (Class<?>) TTFullScreenExpressVideoActivity.class);
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        intent.putExtra("enable_new_arch", this.wk);
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(intent, this.moa, this.yo, uefVarMoa, this.uef);
        if (this.wk) {
            cp.uef().uef(this.uef, (String) this.bs);
        } else {
            cp.uef().uef(this.bs);
        }
        this.bs = null;
        intent.putExtra("back_up", true);
        final boolean z2 = com.bytedance.sdk.openadsdk.gzw.lw.uef("start_activity_async", 0) == 1;
        if (z2) {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.yo.2
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                    uefVar.oa("start_activity");
                    uefVar.moa("fullscreen_interstitial_ad");
                    return uefVar;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.oa.uef(contextUef, intent, new oa.InterfaceC0066oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.yo.3
            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef() {
                if (z2) {
                    com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.yo.3.1
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                            uefVar.oa("start_activity");
                            uefVar.moa("fullscreen_interstitial_ad");
                            return uefVar;
                        }
                    });
                    final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    com.bytedance.sdk.openadsdk.ab.moa.uef("start_activity_action", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.yo.3.2
                        @Override // com.bytedance.sdk.openadsdk.ab.oa
                        public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", jElapsedRealtime2);
                            return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("start_activity_action").oa(jSONObject.toString());
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef(Throwable th) {
                yo yoVar = yo.this;
                zjm.uef(yoVar.lw, "show_ad_fail", yoVar.ivm, "activity_start_fail");
                if (z2) {
                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.yo.3.3
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                            uefVar.oa("start_activity");
                            uefVar.moa("fullscreen_interstitial_ad");
                            return uefVar;
                        }
                    });
                }
            }
        }, true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void dj() {
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.bs;
        if (oaVar != null) {
            oaVar.uef();
        } else {
            zjm.uef(this.lw, "show", 0);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.wk) {
            return;
        }
        sy = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void oa(Bundle bundle) {
        if (!this.wk) {
            sy = this.bs;
        }
        super.oa(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa, com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i5) {
        super.onRenderFail(view, str, i5);
        wk.yo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.yo.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d("UnifyFullManagerBundle", "run: start backup activity");
                com.bytedance.sdk.openadsdk.component.reward.uef.uef uefVar = yo.this.zjm;
                if (uefVar != null) {
                    uefVar.moa();
                }
                yo.this.bs();
                Activity activity = yo.this.moa;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                Activity activity2 = yo.this.moa;
                if (activity2 instanceof TTFullWebActivity) {
                    ((TTFullWebActivity) activity2).oa();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void uef(boolean z2, int i5, String str, int i10, String str2, int i11) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void wk() {
        toString();
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.bs;
        if (oaVar != null) {
            oaVar.oa();
        } else {
            zjm.uef(this.lw, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void wrv() {
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.bs;
        if (oaVar != null) {
            oaVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void xs() {
        super.xs();
        if (this.cq.get()) {
            ab();
        }
        uef(this.moa.isFinishing(), this.moa.isChangingConfigurations());
        if (this.wk) {
            return;
        }
        this.bs = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void yo(Bundle bundle) {
        super.yo(bundle);
        if (this.wk) {
            this.bs = (com.bytedance.sdk.openadsdk.uef.yo.oa) cp.uef().uef(this.uef, com.bytedance.sdk.openadsdk.uef.yo.oa.class);
            return;
        }
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVarYo = cp.uef().yo();
        this.bs = oaVarYo;
        if (oaVarYo != null || bundle == null) {
            return;
        }
        this.bs = sy;
        sy = null;
    }

    public void uef(boolean z2, boolean z10) {
        if (!TextUtils.isEmpty(this.uef)) {
            cp.uef().uef(this.uef, z2, z10);
        }
        if (!this.wk || TextUtils.isEmpty(this.uef)) {
            return;
        }
        cp.uef().uef(this.uef, z2, z10);
    }
}
