package com.bytedance.sdk.openadsdk.core.cq.oa;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.bs;
import com.bytedance.sdk.component.adexpress.oa.bcc;
import com.bytedance.sdk.component.adexpress.oa.cq;
import com.bytedance.sdk.component.adexpress.oa.dz;
import com.bytedance.sdk.component.adexpress.oa.wk;
import com.bytedance.sdk.component.adexpress.oa.zjm;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.zjm.ab;
import com.bytedance.sdk.openadsdk.utils.km;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class xs implements zjm {
    private ab ivm;
    private AtomicBoolean lw = new AtomicBoolean(false);
    private ScheduledFuture<?> moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.cq.ivm.moa f25542oa;
    private Context uef;
    private cq yo;

    public class uef implements Runnable {
        zjm.uef uef;
        private int yo;

        public uef(int i5, zjm.uef uefVar) {
            this.yo = i5;
            this.uef = uefVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.yo == 1) {
                xs.this.f25542oa.uef(true);
                xs.this.uef(this.uef, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "real time out" + xs.this.yo.ivm());
            }
        }
    }

    public xs(Context context, com.bytedance.sdk.openadsdk.core.cq.ivm.moa moaVar, bcc bccVar, cq cqVar) {
        this.uef = context;
        this.f25542oa = moaVar;
        this.yo = cqVar;
        this.f25542oa.uef(bccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm
    public void uef() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        try {
            ScheduledFuture<?> scheduledFuture = this.moa;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.moa.cancel(false);
            this.moa = null;
        } catch (Throwable th) {
            dhk.yo("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }

    public void uef(ab abVar) {
        this.ivm = abVar;
        this.f25542oa.uef(abVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm
    public boolean uef(final zjm.uef uefVar) {
        int iIvm = this.yo.ivm();
        if (iIvm < 0) {
            uef(uefVar, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "time is ".concat(String.valueOf(iIvm)));
        } else {
            if (!(this.f25542oa instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm)) {
                this.moa = km.uef().schedule(new uef(1, uefVar), iIvm, TimeUnit.MILLISECONDS);
            }
            this.f25542oa.uef(new com.bytedance.sdk.component.adexpress.oa.xs() { // from class: com.bytedance.sdk.openadsdk.core.cq.oa.xs.1
                @Override // com.bytedance.sdk.component.adexpress.oa.xs
                public void uef(View view, dz dzVar) {
                    xs.this.oa();
                    if (uefVar.yo()) {
                        return;
                    }
                    bs bsVar = new bs();
                    bsVar.uef(0);
                    if (xs.this.f25542oa instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm) {
                        xs.this.yo.lw().ivm();
                    } else {
                        ((com.bytedance.sdk.openadsdk.core.cq.ivm.uef) xs.this.yo).dxx().uef(bsVar);
                    }
                    xs.this.yo.lw().cz();
                    wk wkVarOa = uefVar.oa();
                    if (wkVarOa == null) {
                        return;
                    }
                    wkVarOa.uef(xs.this.f25542oa, dzVar);
                    uefVar.uef(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.oa.xs
                public void uef(int i5, String str) {
                    xs.this.uef(uefVar, i5, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(zjm.uef uefVar, int i5, String str) {
        wk wkVarOa;
        if (uefVar.yo() || this.lw.get()) {
            return;
        }
        oa();
        bs bsVar = new bs();
        bsVar.uef(i5);
        bsVar.uef(str);
        ((com.bytedance.sdk.openadsdk.core.cq.ivm.uef) this.yo).dxx().uef(bsVar);
        if (uefVar.oa(this)) {
            uefVar.uef(this);
        } else {
            if (uefVar.yo() || (wkVarOa = uefVar.oa()) == null) {
                return;
            }
            uefVar.uef(true);
            wkVarOa.a_(i5);
        }
        this.lw.getAndSet(true);
    }
}
