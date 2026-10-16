package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class bs extends com.bytedance.sdk.openadsdk.core.wk.oa.ivm implements View.OnClickListener {
    private boolean bs;

    public bs(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, com.bytedance.sdk.openadsdk.moa.xs xsVar, boolean z2) {
        super(context, gzwVar, false, str, false, false, xsVar);
        this.bs = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z2);
    }

    private void oib() {
        xs();
        RelativeLayout relativeLayout = this.xs;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.uef.nj().zjm(), this.uef.nj().yo(), this.uef.nj().oa(), this.bcc, this.uef);
            }
        }
        sy();
    }

    private void sy() {
        af.uef((View) this.xs, 0);
        af.uef((View) this.bcc, 0);
        af.uef((View) this.zjm, 8);
    }

    public void lw() {
        xs();
        af.uef((View) this.xs, 0);
    }

    public void moa() {
        ImageView imageView = this.zjm;
        if (imageView != null) {
            af.uef((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm
    public void oa() {
        if (!this.lw || !ue.oa(this.wrv)) {
            this.moa = false;
        }
        super.oa();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.cz;
        if (imageView != null && imageView.getVisibility() == 0) {
            af.lw(this.xs);
        }
        yo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        ImageView imageView = this.cz;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z2);
        } else {
            oib();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm, android.view.View
    public void onWindowVisibilityChanged(int i5) {
        ImageView imageView = this.cz;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i5);
        } else {
            oib();
        }
    }

    public void setCanInterruptVideoPlay(boolean z2) {
        this.bs = z2;
    }

    public void setShouldCheckNetChange(boolean z2) {
        com.bytedance.sdk.openadsdk.core.wk.oa.yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.lw(z2);
        }
    }

    public void setShowAdInteractionView(boolean z2) {
        com.bytedance.sdk.openadsdk.core.wk.oa.lw lwVarWrv;
        com.bytedance.sdk.openadsdk.core.wk.oa.yo yoVar = this.f25793oa;
        if (yoVar == null || (lwVarWrv = yoVar.wrv()) == null) {
            return;
        }
        lwVarWrv.uef(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm
    public void uef(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm
    public void yo() {
        if (this.bs) {
            super.yo();
        }
    }

    public void uef(int i5, int i10) {
        com.bytedance.sdk.openadsdk.core.wk.oa.yo yoVar = this.f25793oa;
        if (yoVar != null) {
            yoVar.oa(i5, i10);
        }
    }
}
