package com.bytedance.sdk.component.adexpress.dynamic.uef;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oyt;
import com.bytedance.sdk.component.adexpress.dynamic.moa.ivm;
import com.bytedance.sdk.component.adexpress.oa.bcc;
import com.bytedance.sdk.component.adexpress.oa.cq;
import com.bytedance.sdk.component.adexpress.oa.dj;
import com.bytedance.sdk.component.adexpress.oa.dz;
import com.bytedance.sdk.component.adexpress.oa.moa;
import com.bytedance.sdk.component.adexpress.oa.xs;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.yo;
import com.bytedance.sdk.component.utils.cz;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef implements dj, moa<DynamicRootView> {
    private AtomicBoolean bcc = new AtomicBoolean(false);
    private cq ivm;
    private bcc lw;
    private xs moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.lw.bcc f24873oa;
    private DynamicRootView uef;
    private ScheduledFuture<?> xs;
    private Context yo;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.uef.uef$uef, reason: collision with other inner class name */
    public class RunnableC0051uef implements Runnable {

        /* renamed from: oa, reason: collision with root package name */
        private int f24875oa;

        public RunnableC0051uef(int i5) {
            this.f24875oa = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24875oa == 2) {
                uef.this.uef.callBackRenderFail(uef.this.f24873oa instanceof com.bytedance.sdk.component.adexpress.dynamic.lw.xs ? 127 : 117, null);
            }
        }
    }

    public uef(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z2, com.bytedance.sdk.component.adexpress.dynamic.lw.bcc bccVar, cq cqVar, com.bytedance.sdk.component.adexpress.dynamic.ivm.uef uefVar) {
        this.yo = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z2, cqVar, uefVar);
        this.uef = dynamicRootView;
        this.f24873oa = bccVar;
        this.ivm = cqVar;
        dynamicRootView.setRenderListener(this);
        this.ivm = cqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bcc() {
        try {
            ScheduledFuture<?> scheduledFuture = this.xs;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.xs.cancel(false);
            this.xs = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ivm() {
        this.ivm.lw().oa(yo());
        JSONObject jSONObjectYo = this.ivm.yo();
        if (com.bytedance.sdk.component.adexpress.uef.oa.oa.uef(jSONObjectYo)) {
            this.f24873oa.uef(new com.bytedance.sdk.component.adexpress.dynamic.ivm.oa() { // from class: com.bytedance.sdk.component.adexpress.dynamic.uef.uef.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.ivm.oa
                public void uef(final com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
                    uef.this.bcc();
                    uef.this.ivm.lw().yo(uef.this.yo());
                    uef.this.uef(bccVar);
                    uef.this.oa(bccVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        uef.this.yo(bccVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.uef.uef.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                uef.this.yo(bccVar);
                            }
                        });
                    }
                    if (uef.this.uef == null || bccVar == null) {
                        return;
                    }
                    uef.this.uef.setBgColor(bccVar.uef());
                    uef.this.uef.setBgMaterialCenterCalcColor(bccVar.oa());
                }
            });
            this.f24873oa.uef(this.ivm);
            return;
        }
        int i5 = this.f24873oa instanceof com.bytedance.sdk.component.adexpress.dynamic.lw.xs ? 123 : 113;
        DynamicRootView dynamicRootView = this.uef;
        StringBuilder sb2 = new StringBuilder("data null is ");
        sb2.append(jSONObjectYo == null);
        dynamicRootView.callBackRenderFail(i5, sb2.toString());
    }

    private boolean xs() {
        DynamicRootView dynamicRootView = this.uef;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    public DynamicRootView moa() {
        return this.uef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        float fXs;
        float fIvm;
        List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> listDj;
        if (bccVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> listDj2 = bccVar.dj();
        if (listDj2 == null || listDj2.size() <= 0) {
            fXs = 0.0f;
        } else {
            fXs = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar2 : listDj2) {
                if (bccVar2.xs() > bccVar.xs() - bccVar2.cz() || (listDj = bccVar2.dj()) == null || listDj.size() <= 0) {
                    fIvm = 0.0f;
                } else {
                    fIvm = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar3 : listDj) {
                        if (bccVar3.zjm().oa().equals("logo-union")) {
                            fIvm = bccVar3.zjm().ivm();
                            fXs = ((bccVar.xs() + (-fIvm)) - bccVar2.xs()) + bccVar2.zjm().lw().uf();
                        }
                    }
                }
                oa(bccVar2);
                if (fIvm <= -15.0f) {
                    bccVar2.ivm(bccVar2.cz() - fIvm);
                    bccVar2.moa(bccVar2.xs() + fIvm);
                    for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar4 : bccVar2.dj()) {
                        bccVar4.moa(bccVar4.xs() - fIvm);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVarWrv = bccVar.wrv();
        if (bccVarWrv == null) {
            return;
        }
        float fIvm2 = bccVar.ivm() - bccVarWrv.ivm();
        float fXs2 = bccVar.xs() - bccVarWrv.xs();
        bccVar.yo(fIvm2);
        bccVar.moa(fXs2);
        if (fXs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            bccVar.moa(bccVar.xs() - fXs);
            bccVar.ivm(bccVar.cz() + fXs);
            for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar5 : bccVar.dj()) {
                bccVar5.moa(bccVar5.xs() + fXs);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    public void uef(xs xsVar) {
        this.moa = xsVar;
        int iIvm = this.ivm.ivm();
        if (iIvm < 0) {
            this.uef.callBackRenderFail(this.f24873oa instanceof com.bytedance.sdk.component.adexpress.dynamic.lw.xs ? 127 : 117, "time is ".concat(String.valueOf(iIvm)));
            return;
        }
        this.xs = com.bytedance.sdk.component.adexpress.moa.moa.uef(new RunnableC0051uef(2), iIvm, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.ivm.cz() <= 0) {
            ivm();
        } else {
            cz.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.uef.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    uef.this.ivm();
                }
            }, this.ivm.cz());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    public int yo() {
        return this.f24873oa instanceof com.bytedance.sdk.component.adexpress.dynamic.lw.xs ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        if (bccVar == null) {
            this.uef.callBackRenderFail(this.f24873oa instanceof com.bytedance.sdk.component.adexpress.dynamic.lw.xs ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.ivm.lw().moa(yo());
        try {
            this.uef.render(bccVar, yo());
        } catch (Exception e7) {
            int i5 = this.f24873oa instanceof com.bytedance.sdk.component.adexpress.dynamic.lw.xs ? 128 : 118;
            this.uef.callBackRenderFail(i5, "exception is " + e7.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> listDj;
        if (bccVar == null || (listDj = bccVar.dj()) == null || listDj.size() <= 0) {
            return;
        }
        Collections.sort(listDj, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.uef.uef.3
            @Override // java.util.Comparator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar2, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar3) {
                ivm ivmVarLw = bccVar2.zjm().lw();
                ivm ivmVarLw2 = bccVar3.zjm().lw();
                if (ivmVarLw == null || ivmVarLw2 == null) {
                    return 0;
                }
                return ivmVarLw.fzf() >= ivmVarLw2.fzf() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar2 : listDj) {
            if (bccVar2 != null) {
                uef(bccVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public DynamicRootView lw() {
        return moa();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void uef(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i5 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i5 >= viewGroup.getChildCount()) {
                    break;
                }
                uef(viewGroup.getChildAt(i5));
                i5++;
            }
        }
        if (view instanceof oyt) {
            ((oyt) view).oa();
        }
    }

    public void uef(bcc bccVar) {
        this.lw = bccVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.dj
    public void uef(dz dzVar) {
        if (this.bcc.get()) {
            return;
        }
        this.bcc.set(true);
        if (dzVar.oa() && xs()) {
            this.uef.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.moa.uef(lw(), dzVar);
            return;
        }
        this.moa.uef(dzVar.zjm(), dzVar.cz());
    }

    public void oa() {
        uef(lw());
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.dj
    public void uef(View view, int i5, yo yoVar) {
        bcc bccVar = this.lw;
        if (bccVar != null) {
            bccVar.uef(view, i5, yoVar);
        }
    }
}
