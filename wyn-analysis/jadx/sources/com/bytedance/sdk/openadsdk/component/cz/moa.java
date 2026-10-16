package com.bytedance.sdk.openadsdk.component.cz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ab;
import com.bytedance.sdk.openadsdk.core.widget.bs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.dj;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class moa extends yo {

    /* renamed from: ab, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.ivm.moa f25326ab;
    private final com.bytedance.sdk.openadsdk.core.ivm.lw bs;
    private final com.bytedance.sdk.openadsdk.core.ivm.yo cq;
    private final ab dz;
    private final com.bytedance.sdk.openadsdk.core.ivm.bcc wk;

    public static final class uef extends Drawable {
        private final boolean moa;
        private static final int lw = Color.parseColor("#b0000000");
        private static final int ivm = Color.parseColor("#40000000");
        private final RectF uef = new RectF();

        /* renamed from: oa, reason: collision with root package name */
        private final Paint f25327oa = new Paint();
        private final Path yo = new Path();

        public uef(Context context) {
            this.moa = com.bytedance.sdk.component.adexpress.moa.oa.uef(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawPath(this.yo, this.f25327oa);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.uef.set(rect);
            this.yo.reset();
            int iHeight = rect.height() / 2;
            Path path = this.yo;
            RectF rectF = this.uef;
            if (this.moa) {
                float f10 = iHeight;
                fArr = new float[]{f10, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10};
            } else {
                float f11 = iHeight;
                fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, f11, f11, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f12 = rect.right;
            boolean z2 = this.moa;
            this.f25327oa.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new int[]{z2 ? ivm : lw, z2 ? lw : ivm}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i5) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public moa(Context context, gzw gzwVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iOa = af.oa(context, 8.0f);
        int iOa2 = af.oa(context, 9.0f);
        int iOa3 = af.oa(context, 10.0f);
        int iOa4 = af.oa(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.yo yoVar = new com.bytedance.sdk.openadsdk.core.widget.yo(context);
        this.wrv = yoVar;
        yoVar.setPadding(iOa2, 0, iOa2, 0);
        this.wrv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(af.oa(context, 32.0f), af.oa(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iOa3, iOa3);
        this.wrv.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        this.cq = yoVar2;
        yoVar2.setBackgroundColor(-1);
        yoVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, af.oa(context, 107.0f));
        layoutParams2.addRule(12);
        yoVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setOrientation(0);
        lwVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        lwVar.setLayoutParams(layoutParams3);
        yoVar2.addView(lwVar);
        bs bsVar = new bs(context);
        this.ivm = bsVar;
        bsVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iOa4, iOa4);
        layoutParams4.rightMargin = iOa;
        layoutParams4.setMarginEnd(iOa);
        this.ivm.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.xs = bccVar;
        bccVar.setId(520093761);
        this.xs.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = this.xs;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar2.setEllipsize(truncateAt);
        this.xs.setMaxLines(2);
        this.xs.setTextColor(Color.parseColor("#161823"));
        this.xs.setTextSize(30.0f);
        lwVar.addView(this.ivm);
        lwVar.addView(this.xs);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar3 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, yoVar2.getId());
        layoutParams5.addRule(10);
        yoVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        this.uef = moaVar;
        moaVar.setId(520093754);
        this.uef.setScaleType(ImageView.ScaleType.CENTER_CROP);
        yoVar3.addView(this.uef, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar4 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        this.f25331oa = yoVar4;
        yoVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        yoVar3.addView(this.f25331oa, layoutParams6);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        this.yo = moaVar2;
        moaVar2.setId(520093756);
        yoVar3.addView(this.yo, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.lw = bccVar3;
        bccVar3.setId(520093717);
        this.lw.setBackground(dj.uef(context, Color.parseColor("#b3000000"), 24));
        this.lw.setEllipsize(truncateAt);
        this.lw.setGravity(17);
        this.lw.setSingleLine(true);
        this.lw.setText(orq.uef(context, "tt_video_download_apk"));
        this.lw.setTextColor(-1);
        this.lw.setTextSize(1, 16.0f);
        this.lw.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(af.oa(context, 236.0f), af.oa(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = af.oa(context, 32.0f);
        yoVar3.addView(this.lw, layoutParams7);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        this.bs = lwVar2;
        lwVar2.setOrientation(0);
        lwVar2.setGravity(16);
        lwVar2.setBackground(new uef(context));
        lwVar2.setPadding(af.oa(context, 16.0f), af.oa(context, 8.0f), af.oa(context, 16.0f), af.oa(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = af.oa(context, 90.0f);
        lwVar2.setLayoutParams(layoutParams8);
        bs bsVar2 = new bs(context);
        this.f25326ab = bsVar2;
        lwVar2.addView(bsVar2, new LinearLayout.LayoutParams(af.oa(context, 36.0f), af.oa(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar3 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = af.oa(context, 8.0f);
        lwVar2.addView(lwVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar4 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.wk = bccVar4;
        bccVar4.setTextColor(-1);
        lwVar3.addView(bccVar4, new LinearLayout.LayoutParams(-2, -2));
        ab abVar = new ab(context, true);
        this.dz = abVar;
        lwVar3.addView(abVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, gzwVar);
        this.moa = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, af.oa(context, 14.0f));
        layoutParams10.gravity = 83;
        yoVar3.addView(this.moa, layoutParams10);
        addView(yoVar3);
        addView(this.wrv);
        addView(yoVar2);
        addView(this.bcc);
        addView(lwVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public com.bytedance.sdk.openadsdk.core.ivm.moa getAdIconView() {
        return this.f25326ab;
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public com.bytedance.sdk.openadsdk.core.ivm.bcc getAdTitleTextView() {
        return this.wk;
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public com.bytedance.sdk.openadsdk.core.ivm.lw getOverlayLayout() {
        return this.bs;
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public ab getScoreBar() {
        return this.dz;
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public View getUserInfo() {
        return this.cq;
    }
}
