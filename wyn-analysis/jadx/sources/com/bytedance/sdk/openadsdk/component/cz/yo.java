package com.bytedance.sdk.openadsdk.component.cz;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ab;
import com.bytedance.sdk.openadsdk.core.widget.bs;

/* loaded from: classes3.dex */
public abstract class yo extends com.bytedance.sdk.openadsdk.core.ivm.xs {
    final xs bcc;
    bs cz;
    com.bytedance.sdk.openadsdk.core.ivm.bcc dj;
    bs ivm;
    com.bytedance.sdk.openadsdk.core.ivm.bcc lw;
    PAGLogoView moa;

    /* renamed from: oa, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.ivm.yo f25331oa;
    com.bytedance.sdk.openadsdk.core.ivm.moa uef;
    com.bytedance.sdk.openadsdk.core.widget.yo wrv;
    com.bytedance.sdk.openadsdk.core.ivm.bcc xs;
    com.bytedance.sdk.openadsdk.core.ivm.moa yo;
    com.bytedance.sdk.openadsdk.core.ivm.bcc zjm;

    public yo(Context context) {
        super(context);
        this.bcc = new xs(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.ivm.moa getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.moa;
    }

    public abstract com.bytedance.sdk.openadsdk.core.ivm.bcc getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.ivm.moa getBackImage() {
        return this.uef;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.bcc getClickButton() {
        return this.lw;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.bcc getContent() {
        return this.dj;
    }

    public com.bytedance.sdk.openadsdk.core.widget.yo getDspAdChoice() {
        return this.wrv;
    }

    public bs getHostAppIcon() {
        return this.ivm;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.bcc getHostAppName() {
        return this.xs;
    }

    public bs getIconOnlyView() {
        return this.cz;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.moa getImageView() {
        return this.yo;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.lw getOverlayLayout() {
        return null;
    }

    public abstract ab getScoreBar();

    public com.bytedance.sdk.openadsdk.core.ivm.bcc getTitle() {
        return this.zjm;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.bcc getTopCountDown() {
        xs xsVar = this.bcc;
        if (xsVar != null) {
            return xsVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        xs xsVar = this.bcc;
        if (xsVar != null) {
            return xsVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.moa getTopSkip() {
        xs xsVar = this.bcc;
        if (xsVar != null) {
            return xsVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.ivm.yo getVideoContainer() {
        return this.f25331oa;
    }
}
