package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ab;
import com.bytedance.sdk.openadsdk.core.widget.bs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.uef.oa adContext;
    private PAGLogoView adLogo;
    private bs ivIcon;
    private boolean mInit;
    private ab rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc tvDesc;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc tvDownload;
    private TextView tvTitle;

    public static final class uef extends Drawable {

        /* renamed from: oa, reason: collision with root package name */
        private final Drawable f25440oa;
        Path uef = new Path();
        private final int yo;

        public uef(Context context) {
            this.f25440oa = orq.yo(context, "tt_ad_bg_header_gradient");
            this.yo = af.oa(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.clipPath(this.uef);
            canvas.drawColor(-1);
            this.f25440oa.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i5) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i5, int i10, int i11, int i12) {
            super.setBounds(i5, i10, i11, i12);
            float f10 = i11;
            this.f25440oa.setBounds(i5, i10, i11, (int) (((1.0f * f10) / this.f25440oa.getIntrinsicWidth()) * this.f25440oa.getIntrinsicHeight()));
            this.uef.reset();
            Path path = this.uef;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, i12);
            int i13 = this.yo;
            path.addRoundRect(rectF, i13, i13, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.bs.qn);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar, gzw gzwVar) {
        if (bccVar == null) {
            return;
        }
        String strAz = gzwVar.az();
        if (TextUtils.isEmpty(strAz)) {
            return;
        }
        bccVar.setText(strAz);
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.ivm.moa moaVar, gzw gzwVar) {
        if (moaVar == null || gzwVar.ifk() == null || TextUtils.isEmpty(gzwVar.ifk().uef())) {
            return;
        }
        com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(gzwVar.ifk(), moaVar, gzwVar);
    }

    private void bindTitleData(TextView textView, gzw gzwVar, String str) {
        if (textView != null) {
            if (gzwVar.no() == null || TextUtils.isEmpty(gzwVar.no().oa())) {
                textView.setText(str);
            } else {
                textView.setText(gzwVar.no().oa());
            }
        }
    }

    private void initData(final gzw gzwVar, com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar) {
        setDownloadButtonData(bccVar, gzwVar, -1);
        bindIconData(this.ivIcon, gzwVar);
        ab abVar = this.rbScore;
        if (abVar != null) {
            af.uef((TextView) null, abVar, gzwVar);
            if (gzwVar.no() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            if (gzwVar.no() != null && !TextUtils.isEmpty(gzwVar.no().oa())) {
                this.tvTitle.setText(gzwVar.no().oa());
            } else if (TextUtils.isEmpty(gzwVar.jp())) {
                this.tvTitle.setVisibility(8);
            } else {
                this.tvTitle.setText(gzwVar.jp());
            }
        }
        if (this.tvDesc != null) {
            String strXw = gzwVar.xw();
            if (TextUtils.isEmpty(strXw)) {
                this.tvDesc.setVisibility(8);
            } else {
                this.tvDesc.setText(strXw);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.uef(RFEndCardBackUpLayout.this.adContext.pu, gzwVar, RFEndCardBackUpLayout.this.adContext.lw);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(af.oa(context, 16.0f), 0, af.oa(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(lwVar, layoutParams);
        if (this.adContext.etd == 2) {
            com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
            lwVar2.setOrientation(0);
            lwVar.addView(lwVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(lwVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(lwVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(lwVar);
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.adContext;
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(oaVar.pu, oaVar.f25412oa);
        viewCreatePAGLogoViewByMaterial.setId(520093757);
        lwVar.addView(viewCreatePAGLogoViewByMaterial);
        viewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.uef(RFEndCardBackUpLayout.this.adContext.pu, RFEndCardBackUpLayout.this.adContext.f25412oa, RFEndCardBackUpLayout.this.adContext.lw);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.ivm.lw lwVar) {
        gzw gzwVar = this.adContext.f25412oa;
        if (gzwVar != null) {
            List<gzw> listLw = gzwVar.moa().lw();
            for (int i5 = 0; i5 < listLw.size() && i5 < 3; i5++) {
                initSingleCardInThreeCardStyle(lwVar, listLw.get(i5), i5);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.ivm.lw lwVar) {
        gzw gzwVar = this.adContext.f25412oa;
        if (gzwVar != null) {
            List<gzw> listLw = gzwVar.moa().lw();
            for (int i5 = 0; i5 < listLw.size() && i5 < 2; i5++) {
                initSingleCardInTwoCardStyle(lwVar, listLw.get(i5), i5);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.ivm.lw lwVar, int i5) {
        gzw gzwVar = this.adContext.f25412oa;
        if (gzwVar != null) {
            List<gzw> listLw = gzwVar.moa().lw();
            for (int i10 = 0; i10 < listLw.size() && i10 < i5 && i10 < 3; i10++) {
                initSingleCardInTwoCardStyleLandscape(lwVar, listLw.get(i10), i10, i5);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.ivm.lw lwVar, gzw gzwVar, int i5) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar2.setOrientation(1);
        lwVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i5 > 0 ? af.oa(context, 12.0f) : 0, 0, 0);
        lwVar2.setBackground(new uef(context));
        lwVar.addView(lwVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar3 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar3.setOrientation(0);
        lwVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = af.oa(context, 20.0f);
        layoutParams2.leftMargin = af.oa(context, 17.0f);
        layoutParams2.rightMargin = af.oa(context, 30.0f);
        lwVar2.addView(lwVar3, layoutParams2);
        bs bsVar = new bs(context);
        lwVar3.addView(bsVar, new FrameLayout.LayoutParams(af.oa(context, 70.0f), af.oa(context, 63.0f)));
        bindIconData(bsVar, gzwVar);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar4 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = af.oa(context, 7.0f);
        lwVar3.addView(lwVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        bccVar.setTextSize(18.0f);
        bccVar.setTextColor(Color.parseColor("#161823"));
        bccVar.setGravity(8388611);
        bccVar.setTypeface(null, 1);
        lwVar4.addView(bccVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(bccVar, gzwVar, gzwVar.jp());
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar2.setSingleLine(true);
        bccVar2.setEllipsize(truncateAt);
        bccVar2.setTextSize(16.0f);
        bccVar2.setTextColor(Color.parseColor("#80161823"));
        lwVar4.addView(bccVar2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(bccVar2, gzwVar);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar5 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar5.setOrientation(0);
        lwVar5.setGravity(16);
        lwVar4.addView(lwVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar3.setTextSize(16.0f);
        bccVar3.setTextColor(Color.parseColor("#80161823"));
        lwVar5.addView(bccVar3, new ViewGroup.LayoutParams(-2, -2));
        ab abVar = new ab(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = af.oa(context, 8.0f);
        lwVar5.addView(abVar, layoutParams4);
        af.uef(bccVar3, abVar, gzwVar, 18);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar4 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar4.setGravity(17);
        bccVar4.setId(520093707);
        bccVar4.setText(orq.uef(context, "tt_video_download_apk"));
        bccVar4.setTextColor(-1);
        bccVar4.setTextSize(2, 16.0f);
        bccVar4.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, af.oa(context, 36.0f));
        layoutParams5.setMargins(af.oa(context, 20.0f), af.oa(context, 22.0f), af.oa(context, 20.0f), af.oa(context, 20.0f));
        lwVar2.addView(bccVar4, layoutParams5);
        setDownloadButtonData(bccVar4, gzwVar, i5);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.ivm.lw lwVar, gzw gzwVar, int i5) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar2.setOrientation(1);
        lwVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i5 > 0 ? af.oa(context, 12.0f) : 0, 0, 0);
        lwVar2.setBackground(new uef(context));
        lwVar.addView(lwVar2, layoutParams);
        bs bsVar = new bs(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(af.oa(context, 70.0f), af.oa(context, 63.0f));
        layoutParams2.setMargins(0, af.oa(context, 24.0f), 0, af.oa(context, 12.0f));
        lwVar2.addView(bsVar, layoutParams2);
        bindIconData(bsVar, gzwVar);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        bccVar.setTextSize(18.0f);
        bccVar.setTextColor(Color.parseColor("#161823"));
        bccVar.setGravity(17);
        bccVar.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(af.oa(context, 56.0f), 0, af.oa(context, 56.0f), 0);
        lwVar2.addView(bccVar, layoutParams3);
        bindTitleData(bccVar, gzwVar, gzwVar.jp());
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar2.setSingleLine(true);
        bccVar2.setEllipsize(truncateAt);
        bccVar2.setTextSize(16.0f);
        bccVar2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(af.oa(context, 56.0f), af.oa(context, 4.0f), af.oa(context, 56.0f), 0);
        lwVar2.addView(bccVar2, layoutParams4);
        bindDescData(bccVar2, gzwVar);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar3 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar3.setOrientation(0);
        lwVar3.setGravity(16);
        lwVar2.addView(lwVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar3.setTextSize(16.0f);
        bccVar3.setTextColor(Color.parseColor("#80161823"));
        lwVar3.addView(bccVar3, new ViewGroup.LayoutParams(-2, -2));
        ab abVar = new ab(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = af.oa(context, 8.0f);
        lwVar3.addView(abVar, layoutParams5);
        af.uef(bccVar3, abVar, gzwVar, 18);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar4 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar4.setGravity(17);
        bccVar4.setId(520093707);
        bccVar4.setText(orq.uef(context, "tt_video_download_apk"));
        bccVar4.setTextColor(-1);
        bccVar4.setTextSize(2, 16.0f);
        bccVar4.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, af.oa(context, 36.0f));
        layoutParams6.setMargins(af.oa(context, 20.0f), af.oa(context, 36.0f), af.oa(context, 20.0f), af.oa(context, 20.0f));
        lwVar2.addView(bccVar4, layoutParams6);
        setDownloadButtonData(bccVar4, gzwVar, i5);
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.ivm.lw lwVar, gzw gzwVar, int i5, int i10) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar2.setOrientation(1);
        lwVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i5 > 0) {
            layoutParams.setMargins(af.oa(context, 12.0f), 0, 0, 0);
        }
        lwVar2.setBackground(new uef(context));
        lwVar.addView(lwVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar3 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar3.setOrientation(0);
        lwVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = af.oa(context, 20.0f);
        layoutParams2.leftMargin = af.oa(context, 17.0f);
        layoutParams2.rightMargin = af.oa(context, 30.0f);
        lwVar2.addView(lwVar3, layoutParams2);
        bs bsVar = new bs(context);
        lwVar3.addView(bsVar, new FrameLayout.LayoutParams(af.oa(context, 44.0f), af.oa(context, 44.0f)));
        bindIconData(bsVar, gzwVar);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar4 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = af.oa(context, 7.0f);
        lwVar3.addView(lwVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        bccVar.setTextSize(18.0f);
        bccVar.setTextColor(Color.parseColor("#161823"));
        bccVar.setGravity(8388611);
        bccVar.setTypeface(null, 1);
        lwVar4.addView(bccVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(bccVar, gzwVar, gzwVar.jp());
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar5 = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar5.setOrientation(0);
        lwVar5.setGravity(16);
        lwVar4.addView(lwVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar2.setTextSize(16.0f);
        bccVar2.setTextColor(Color.parseColor("#80161823"));
        lwVar5.addView(bccVar2, new ViewGroup.LayoutParams(-2, -2));
        ab abVar = new ab(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = af.oa(context, 8.0f);
        lwVar5.addView(abVar, layoutParams4);
        af.uef(bccVar2, abVar, gzwVar, 18);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        if (i10 == 2) {
            bccVar3.setSingleLine(true);
        } else {
            bccVar3.setLines(2);
        }
        bccVar3.setEllipsize(truncateAt);
        bccVar3.setTextSize(16.0f);
        bccVar3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i11 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i11;
        layoutParams5.leftMargin = i11;
        layoutParams5.topMargin = af.oa(context, 12.0f);
        lwVar2.addView(bccVar3, layoutParams5);
        bindDescData(bccVar3, gzwVar);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar4 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar4.setGravity(17);
        bccVar4.setId(520093707);
        bccVar4.setText(orq.uef(context, "tt_video_download_apk"));
        bccVar4.setTextColor(-1);
        bccVar4.setTextSize(2, 16.0f);
        bccVar4.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, af.oa(context, 36.0f));
        layoutParams6.setMargins(af.oa(context, 20.0f), af.oa(context, 22.0f), af.oa(context, 20.0f), af.oa(context, 20.0f));
        lwVar2.addView(bccVar4, layoutParams6);
        setDownloadButtonData(bccVar4, gzwVar, i5);
    }

    private void initViews() {
        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa;
        List<gzw> listLw;
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        boolean z2 = this.adContext.f25412oa.gem() && (bccVar = this.adContext.sw) != null && bccVar.pu();
        if (z2) {
            if (com.bytedance.sdk.openadsdk.core.cq.ivm.uef.yo.uef()) {
                initViewsForUGen(true);
                return;
            } else if (this.shownAdCount > 1) {
                initOneSlotMultipleAdsLayout();
                return;
            }
        }
        gzw gzwVar = this.adContext.f25412oa;
        if (gzwVar.ebe()) {
            initViewsForVast();
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.cq.ivm.uef.yo.uef()) {
            initViewsForUGen(false);
            return;
        }
        if (z2 && (uefVarMoa = gzwVar.moa()) != null && (listLw = uefVarMoa.lw()) != null && !listLw.isEmpty()) {
            gzwVar = listLw.get(0);
        }
        initViewsDefault(gzwVar);
        initData(gzwVar, this.tvDownload);
    }

    private void initViewsDefault(gzw gzwVar) {
        Context context = getContext();
        boolean z2 = gzwVar.cgg() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setGravity(1);
        lwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z2 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(af.oa(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iOa = af.oa(context, 24.0f);
        layoutParams.rightMargin = iOa;
        layoutParams.leftMargin = iOa;
        addView(lwVar, layoutParams);
        bs bsVar = new bs(context);
        this.ivIcon = bsVar;
        bsVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(af.oa(context, 80.0f), af.oa(context, 80.0f));
        layoutParams2.bottomMargin = af.oa(context, 12.0f);
        lwVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.tvTitle = bccVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(af.oa(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        lwVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.tvDesc = bccVar2;
        bccVar2.setEllipsize(truncateAt);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = af.oa(context, 8.0f);
        lwVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new ab(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, af.oa(context, 16.0f));
        layoutParams4.topMargin = af.oa(context, 12.0f);
        this.rbScore.setVisibility(8);
        lwVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.tvDownload = bccVar3;
        bccVar3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(orq.uef(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, af.oa(context, 44.0f));
        layoutParams5.topMargin = af.oa(context, 54.0f);
        lwVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, gzwVar);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, af.oa(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = af.oa(context, 18.0f);
        if (z2) {
            layoutParams6.bottomMargin = af.oa(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = af.oa(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForUGen(boolean z2) {
        addView(new com.bytedance.sdk.openadsdk.core.cq.ivm.uef.yo(this.adContext, z2));
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar.setId(com.bytedance.sdk.openadsdk.utils.bs.zjm);
        moaVar.setVisibility(8);
        addView(moaVar, new FrameLayout.LayoutParams(-1, -1));
        View ivmVar = new com.bytedance.sdk.component.cz.ivm(context, true, ivm.yo.VAST_ENDCARD);
        ivmVar.setVisibility(8);
        ivmVar.setId(com.bytedance.sdk.openadsdk.utils.bs.dj);
        addView(ivmVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar, gzw gzwVar, int i5) {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.adContext;
        com.bytedance.sdk.openadsdk.core.yo.lw lwVarUef = oaVar.gr.uef(oaVar, gzwVar);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.adContext;
        lwVarUef.uef(com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(oaVar2.pu, oaVar2.lw));
        if (i5 != -1) {
            HashMap map = new HashMap();
            int i10 = i5 + 1;
            map.put("ad_show_order", Integer.valueOf(i10));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            lwVarUef.uef(map);
        }
        bccVar.setOnClickListener(lwVarUef);
        bccVar.setOnTouchListener(lwVarUef);
        CharSequence charSequenceKik = gzwVar.kik();
        if (TextUtils.isEmpty(charSequenceKik)) {
            return;
        }
        bccVar.setText(charSequenceKik);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.adContext = oaVar;
        if (oaVar.f25412oa.ebe()) {
            initViews();
        }
    }

    public void setShownAdCount(int i5) {
        this.shownAdCount = i5;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        if (i5 == 0) {
            initViews();
        }
    }
}
