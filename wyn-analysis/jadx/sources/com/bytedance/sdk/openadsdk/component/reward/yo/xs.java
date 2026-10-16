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
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.oa;
import com.bytedance.sdk.openadsdk.activity.TTRewardWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.wrv;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.zjm;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.km;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class xs extends oa implements ivm {
    private static com.bytedance.sdk.openadsdk.uef.lw.uef oib;
    public com.bytedance.sdk.openadsdk.component.reward.yo.uef.lw bs;
    private long dhk;
    private String orq;
    private com.bytedance.sdk.openadsdk.uef.lw.uef sy;
    private String tpx;

    public xs(Activity activity, Context context, gzw gzwVar, String str, ViewGroup viewGroup, String str2) {
        super(activity, context, gzwVar, str, viewGroup, str2);
        this.dhk = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa;
        gzw gzwVar = this.lw;
        if (gzwVar == null || (uefVarMoa = gzwVar.moa()) == null || !uefVarMoa.ivm()) {
            return;
        }
        final gzw gzwVarXs = uefVarMoa.xs();
        List<gzw> listLw = uefVarMoa.lw();
        if (listLw != null) {
            Iterator<gzw> it = listLw.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.oa(this.wrv, it.next());
            }
        }
        gzwVarXs.sy(1);
        Context contextUef = this.moa;
        if (contextUef == null) {
            contextUef = this.wrv;
        }
        if (contextUef == null) {
            contextUef = sy.uef();
        }
        Intent intent = new Intent(contextUef, (Class<?>) TTRewardExpressVideoActivity.class);
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(intent, this.moa, this.yo, uefVarMoa, this.uef);
        intent.putExtra("media_extra", this.tpx);
        intent.putExtra("user_id", this.orq);
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        intent.putExtra("enable_new_arch", this.wk);
        if (this.wk) {
            cp.uef().uef(this.uef, (String) this.sy);
        } else {
            cp.uef().uef(this.sy);
        }
        this.sy = null;
        intent.putExtra("back_up", true);
        if (com.bytedance.sdk.openadsdk.gzw.lw.uef("start_activity_async", 0) == 1) {
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.xs.2
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                    uefVar.oa("start_activity");
                    uefVar.moa("rewarded_video");
                    return uefVar;
                }
            });
        }
        com.bytedance.sdk.component.utils.oa.uef(contextUef, intent, new oa.InterfaceC0066oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.xs.3
            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef() {
            }

            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef(Throwable th) {
                zjm.uef(gzwVarXs, "show_ad_fail", xs.this.ivm, "activity_start_fail");
            }
        }, true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void cq() {
        super.cq();
        com.bytedance.sdk.openadsdk.component.reward.yo.uef.lw lwVar = this.bs;
        if (lwVar != null) {
            lwVar.uef(this.dz, (int) (System.currentTimeMillis() - this.dz), 14);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void dj() {
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.uef();
        } else {
            zjm.uef(this.lw, "show", 0);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.wk) {
            return;
        }
        oib = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void ivm() {
        super.ivm();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void lw() {
        this.xs.uef((ivm) this);
        super.lw();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void oa(Bundle bundle) {
        if (!this.wk) {
            oib = this.sy;
        }
        super.oa(bundle);
        com.bytedance.sdk.openadsdk.component.reward.yo.uef.lw lwVar = this.bs;
        if (lwVar != null) {
            lwVar.uef();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa, com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i5) {
        super.onRenderFail(view, str, i5);
        wk.yo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.xs.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d("UnifyRewardBundle", "run: start backup activity");
                com.bytedance.sdk.openadsdk.component.reward.uef.uef uefVar = xs.this.zjm;
                if (uefVar != null) {
                    uefVar.moa();
                }
                xs.this.bs();
                Activity activity = xs.this.moa;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                Activity activity2 = xs.this.moa;
                if (activity2 instanceof TTRewardWebActivity) {
                    ((TTRewardWebActivity) activity2).oa();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void wk() {
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.oa();
        } else {
            zjm.uef(this.lw, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void wrv() {
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.onAdClicked();
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
        this.sy = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void yo() {
        super.yo();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void uef(Bundle bundle) {
        super.uef(bundle);
        Intent intent = this.moa.getIntent();
        if (intent != null) {
            this.tpx = intent.getStringExtra("media_extra");
            this.orq = intent.getStringExtra("user_id");
        }
        com.bytedance.sdk.openadsdk.component.reward.yo.uef.lw lwVar = new com.bytedance.sdk.openadsdk.component.reward.yo.uef.lw(this.lw, this.moa, this.orq, this.tpx);
        this.bs = lwVar;
        lwVar.uef(this);
        if (bundle != null) {
            this.bs.oa();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void yo(Bundle bundle) {
        super.yo(bundle);
        if (this.wk) {
            this.sy = (com.bytedance.sdk.openadsdk.uef.lw.uef) cp.uef().uef(this.uef, com.bytedance.sdk.openadsdk.uef.lw.uef.class);
            return;
        }
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVarOa = cp.uef().oa();
        this.sy = uefVarOa;
        if (uefVarOa != null || bundle == null) {
            return;
        }
        this.sy = oib;
        oib = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.ivm
    public void oa(boolean z2, int i5, String str, int i10, String str2, int i11) {
        yo(z2, i5, str, i10, str2, i11);
    }

    private void yo(final boolean z2, final int i5, final String str, final int i10, final String str2, final int i11) {
        dhk.uef("UnifyRewardBundle", "invoke callback onRewardVerify: " + z2 + ", " + i5 + ", " + str + ", " + i10 + ", " + str2 + "; " + this);
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.xs.4
            @Override // java.lang.Runnable
            public void run() {
                xs.this.uef(z2, i5, str, i10, str2, i11);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.oa
    public void uef(boolean z2, int i5, String str, int i10, String str2, int i11) {
        com.bytedance.sdk.openadsdk.uef.lw.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.uef(z2, i5, str, i10, str2);
            wrv.uef(this.lw, z2, i11);
        }
    }

    public void uef(boolean z2, boolean z10) {
        if (!this.wk || TextUtils.isEmpty(this.uef)) {
            return;
        }
        cp.uef().uef(this.uef, z2, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.ivm
    public void uef(long j8, int i5) {
        com.bytedance.sdk.openadsdk.component.reward.yo.uef.lw lwVar = this.bs;
        if (lwVar != null) {
            lwVar.uef(j8, i5, 13);
        }
    }
}
