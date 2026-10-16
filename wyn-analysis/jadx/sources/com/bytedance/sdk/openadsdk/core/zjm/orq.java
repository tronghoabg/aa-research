package com.bytedance.sdk.openadsdk.core.zjm;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.km;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class orq extends com.bytedance.sdk.component.adexpress.oa.uef<uef> {
    private final com.bytedance.sdk.component.adexpress.oa.cq ivm;
    private com.bytedance.sdk.component.adexpress.oa.xs lw;
    private com.bytedance.sdk.component.adexpress.oa.yo moa;

    /* renamed from: oa, reason: collision with root package name */
    private uef f25865oa;
    AtomicBoolean uef = new AtomicBoolean(false);
    private final View yo;

    public orq(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.oa.cq cqVar) {
        this.yo = view;
        this.ivm = cqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        if (this.uef.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.oa.yo yoVar = this.moa;
        if (yoVar == null || !yoVar.uef((tpx) this.yo, 0)) {
            this.lw.uef(107, "backup false");
            return;
        }
        this.ivm.lw().ivm();
        uef uefVar = (uef) this.yo.findViewWithTag("tt_express_backup_fl_tag_26");
        this.f25865oa = uefVar;
        if (uefVar == null) {
            this.lw.uef(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.oa.dz dzVar = new com.bytedance.sdk.component.adexpress.oa.dz();
        uef uefVar2 = this.f25865oa;
        float realHeight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float realWidth = uefVar2 == null ? 0.0f : uefVar2.getRealWidth();
        uef uefVar3 = this.f25865oa;
        if (uefVar3 != null) {
            realHeight = uefVar3.getRealHeight();
        }
        dzVar.uef(true);
        dzVar.uef(realWidth);
        dzVar.oa(realHeight);
        this.lw.uef(this.f25865oa, dzVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    public void uef(com.bytedance.sdk.component.adexpress.oa.xs xsVar) {
        this.lw = xsVar;
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.orq.1
            @Override // java.lang.Runnable
            public void run() {
                orq.this.oa();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public uef lw() {
        return this.f25865oa;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.uef
    public void uef(com.bytedance.sdk.component.adexpress.oa.yo yoVar) {
        this.moa = yoVar;
    }
}
