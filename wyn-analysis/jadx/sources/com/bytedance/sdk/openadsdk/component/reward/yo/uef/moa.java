package com.bytedance.sdk.openadsdk.component.reward.yo.uef;

import android.R;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bs;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class moa {
    private String bcc;
    private gzw ivm;
    private Activity lw;

    /* renamed from: oa, reason: collision with root package name */
    private TTAdDislikeToast f25465oa;
    private bs uef;
    private com.bytedance.sdk.openadsdk.component.reward.yo.oa xs;
    private final AtomicBoolean yo = new AtomicBoolean(false);
    private final ConcurrentHashMap<String, Boolean> moa = new ConcurrentHashMap<>();

    public moa(com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar, Activity activity, gzw gzwVar) {
        this.xs = oaVar;
        this.lw = activity;
        this.ivm = gzwVar;
    }

    private void ivm() {
        if (this.f25465oa == null) {
            this.f25465oa = new TTAdDislikeToast(this.lw);
            ((FrameLayout) this.lw.findViewById(R.id.content)).addView(this.f25465oa);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lw() {
        if (this.moa.containsKey(this.bcc)) {
            return Boolean.TRUE.equals(this.moa.get(this.bcc));
        }
        return false;
    }

    private void moa() {
        if (this.uef == null) {
            bs bsVar = new bs(this.lw, this.ivm);
            this.uef = bsVar;
            bsVar.setCallback(new bs.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.yo.uef.moa.1
                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void oa(View view) {
                    moa.this.yo.set(false);
                    if (moa.this.xs == null || moa.this.xs.xs == null || moa.this.xs.xs.oa() == null) {
                        return;
                    }
                    moa.this.xs.xs.oa().uef(0, true, false);
                    moa.this.xs.xs.oa().setShouldNotifyAdVisibility(true);
                }

                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void uef(View view) {
                    moa.this.yo.set(true);
                    if (moa.this.xs != null && moa.this.xs.xs != null && moa.this.xs.xs.oa() != null) {
                        moa.this.xs.xs.oa().uef(8, false, true);
                        moa.this.xs.xs.oa().setShouldNotifyAdVisibility(false);
                    }
                    moa.this.uef.setDislikeSource(moa.this.bcc);
                }

                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void uef(FilterWord filterWord) {
                    if (moa.this.lw() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    moa.this.moa.put(moa.this.bcc, Boolean.TRUE);
                    moa.this.xs();
                }
            });
            ((FrameLayout) this.lw.findViewById(R.id.content)).addView(this.uef);
        }
    }

    private void oa() {
        this.f25465oa.show(TTAdDislikeToast.getDislikeTip());
        this.moa.put(this.bcc, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xs() {
        TTAdDislikeToast tTAdDislikeToast = this.f25465oa;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void yo() {
        if (this.uef == null) {
            try {
                moa();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        bs bsVar = this.uef;
        if (bsVar != null) {
            bsVar.uef();
        }
    }

    public void uef(String str) {
        this.bcc = str;
        if (this.lw.isFinishing()) {
            return;
        }
        ivm();
        if (lw()) {
            oa();
        } else {
            yo();
        }
    }

    public void uef() {
        TTAdDislikeToast tTAdDislikeToast = this.f25465oa;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }
}
