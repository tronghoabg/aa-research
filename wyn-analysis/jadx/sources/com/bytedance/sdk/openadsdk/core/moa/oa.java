package com.bytedance.sdk.openadsdk.core.moa;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.sy;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ab;
import com.bytedance.sdk.openadsdk.core.widget.bs;
import com.bytedance.sdk.openadsdk.core.widget.cq;
import com.bytedance.sdk.openadsdk.core.widget.wrv;
import com.bytedance.sdk.openadsdk.core.wk.oa.ivm;
import com.bytedance.sdk.openadsdk.core.zjm.dhk;
import com.bytedance.sdk.openadsdk.core.zjm.oib;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.dj;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* loaded from: classes3.dex */
public class oa extends com.bytedance.sdk.openadsdk.core.zjm.uef {
    public static oib[] uef = {new oib(1, 6.4f, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50), new oib(4, 1.2f, 300, 250)};
    private tpx cq;
    private String dz;
    private PAGBannerAdWrapperListener wk;
    private uef wrv;

    public oa(Context context) {
        super(context);
        this.f25872oa = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.wk = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.dz = str;
    }

    private uef bcc() {
        int iOa = af.oa(this.f25872oa, 8.0f);
        int iOa2 = af.oa(this.f25872oa, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f25872oa);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iOa, iOa, iOa, iOa2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.f25872oa);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        bs bsVar = new bs(this.f25872oa);
        bsVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(af.oa(this.f25872oa, 52.0f), af.oa(this.f25872oa, 52.0f));
        bsVar.setScaleType(ImageView.ScaleType.FIT_XY);
        bsVar.setLayoutParams(layoutParams3);
        linearLayout.addView(bsVar);
        LinearLayout linearLayout2 = new LinearLayout(this.f25872oa);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iOa;
        layoutParams4.rightMargin = iOa;
        layoutParams4.setMarginStart(iOa);
        layoutParams4.setMarginEnd(iOa);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.f25872oa);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        ab abVar = new ab(this.f25872oa);
        abVar.setId(520093735);
        linearLayout2.addView(abVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.f25872oa);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(af.oa(this.f25872oa, 76.0f), af.oa(this.f25872oa, 36.0f));
        textView2.setBackground(dj.uef(this.f25872oa, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(orq.uef(this.f25872oa, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.f25872oa);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iOa2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        cq cqVar = new cq(this.f25872oa);
        cqVar.setId(520093736);
        cqVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(cqVar, layoutParams8);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f25872oa, this.yo);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iOa, iOa, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new uef(bsVar, viewCreatePAGLogoViewByMaterial, textView2, textView, cqVar, abVar, frameLayout);
    }

    private uef cz() {
        int iOa = af.oa(this.f25872oa, 8.0f);
        int iOa2 = af.oa(this.f25872oa, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f25872oa);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iOa, iOa, iOa, iOa2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.f25872oa);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        bs bsVar = new bs(this.f25872oa);
        bsVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(af.oa(this.f25872oa, 52.0f), af.oa(this.f25872oa, 52.0f));
        bsVar.setScaleType(ImageView.ScaleType.FIT_XY);
        bsVar.setLayoutParams(layoutParams3);
        linearLayout.addView(bsVar);
        LinearLayout linearLayout2 = new LinearLayout(this.f25872oa);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iOa;
        layoutParams4.rightMargin = iOa;
        layoutParams4.setMarginStart(iOa);
        layoutParams4.setMarginEnd(iOa);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.f25872oa);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        ab abVar = new ab(this.f25872oa);
        abVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = af.oa(this.f25872oa, 4.0f);
        linearLayout2.addView(abVar, layoutParams6);
        TextView textView2 = new TextView(this.f25872oa);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(af.oa(this.f25872oa, 76.0f), af.oa(this.f25872oa, 36.0f));
        textView2.setBackground(dj.uef(this.f25872oa, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(orq.uef(this.f25872oa, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.f25872oa);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iOa2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        wrv wrvVar = new wrv(this.f25872oa);
        wrvVar.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        wrvVar.setLayoutParams(layoutParams9);
        frameLayout.addView(wrvVar);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f25872oa, this.yo);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iOa, iOa, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new uef(bsVar, viewCreatePAGLogoViewByMaterial, textView2, textView, wrvVar, abVar, frameLayout);
    }

    private uef ivm() {
        int iOa = af.oa(this.f25872oa, 8.0f);
        cq cqVar = new cq(this.f25872oa);
        cqVar.setId(520093736);
        cqVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(cqVar, layoutParams);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f25872oa, this.yo);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iOa, iOa, 0, 0);
        layoutParams2.gravity = 8388659;
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(viewCreatePAGLogoViewByMaterial);
        return new uef(viewCreatePAGLogoViewByMaterial, cqVar);
    }

    private void lw() {
        TextView textView;
        gzw gzwVar = this.yo;
        if (gzwVar != null) {
            int iHw = gzwVar.hw();
            if (this.yo.nj() == null) {
                uef uefVarBcc = bcc();
                this.wrv = uefVarBcc;
                cq cqVar = uefVarBcc.uef;
                ImageView imageView = uefVarBcc.yo;
                TextView textView2 = uefVarBcc.f25645oa;
                TextView textView3 = uefVarBcc.xs;
                View view = uefVarBcc.ivm;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.oa.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.uef(((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).f25872oa, ((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).yo, ((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).ivm);
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams = cqVar.getLayoutParams();
                if (this.xs - (af.oa(this.f25872oa, 8.0f) * 2) >= ((this.bcc - af.oa(this.f25872oa, 8.0f)) - (af.oa(this.f25872oa, 21.0f) * 2)) - af.oa(this.f25872oa, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                cqVar.setLayoutParams(layoutParams);
                if (iHw == 33) {
                    cqVar.setRatio(1.0f);
                } else {
                    cqVar.setRatio(1.91f);
                }
                List<sy> listLpy = this.yo.lpy();
                if (listLpy != null && !listLpy.isEmpty()) {
                    com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(listLpy.get(0), cqVar, this.yo);
                    com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(listLpy.get(0).uef(), this.wrv.lw);
                }
                if (this.yo.ifk() == null || TextUtils.isEmpty(this.yo.ifk().uef())) {
                    textView = textView2;
                } else {
                    textView = textView2;
                    com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.yo.ifk().uef(), this.yo.ifk().oa(), this.yo.ifk().yo(), imageView, this.yo);
                }
                textView.setText(this.yo.xw());
                if (TextUtils.isEmpty(this.yo.kik())) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(this.yo.kik());
                }
                af.uef((TextView) null, this.wrv.moa, this.yo);
                uef((View) cqVar, true);
                cqVar.setTag(520093762, Boolean.TRUE);
                uef((View) this, true);
                uef((View) textView3, true);
                return;
            }
            uef uefVarCz = cz();
            this.wrv = uefVarCz;
            TextView textView4 = uefVarCz.f25645oa;
            TextView textView5 = uefVarCz.xs;
            wrv wrvVar = uefVarCz.bcc;
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.yo.nj().zjm(), this.wrv.lw);
            View view2 = this.wrv.ivm;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.oa.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.uef(((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).f25872oa, ((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).yo, ((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).ivm);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams2 = wrvVar.getLayoutParams();
            if (iHw == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                wrvVar.setLayoutParams(layoutParams2);
                wrvVar.setRatio(0.5625f);
            } else if (iHw == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                wrvVar.setLayoutParams(layoutParams2);
                wrvVar.setRatio(1.7777778f);
            } else {
                if (this.xs - (af.oa(this.f25872oa, 8.0f) * 2) >= ((this.bcc - af.oa(this.f25872oa, 8.0f)) - (af.oa(this.f25872oa, 21.0f) * 2)) - af.oa(this.f25872oa, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                wrvVar.setLayoutParams(layoutParams2);
                wrvVar.setRatio(1.0f);
            }
            wrvVar.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.wk.oa.ivm videoView = getVideoView();
            if (videoView != null) {
                if (this.cq instanceof dhk) {
                    videoView.setNeedSelfManagerVideo(!((dhk) r7).dz());
                    ((dhk) this.cq).setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener((dhk) this.cq);
                }
                wrvVar.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.core.moa.oa.5
                    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm.uef
                    public void uef(View view3, int i5) {
                        if (oa.this.wk != null) {
                            oa.this.wk.onAdClicked();
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.zjm.cz clickCreativeListener = this.cq.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.uef(videoView.getNativeVideoController());
                }
            }
            if (this.yo.ifk() != null && !TextUtils.isEmpty(this.yo.ifk().uef())) {
                com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.yo.ifk().uef(), this.yo.ifk().oa(), this.yo.ifk().yo(), this.wrv.yo, this.yo);
            }
            textView4.setText(this.yo.xw());
            af.uef((TextView) null, this.wrv.moa, this.yo);
            if (TextUtils.isEmpty(this.yo.kik())) {
                textView5.setVisibility(8);
            } else {
                textView5.setText(this.yo.kik());
            }
            uef((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            uef((View) this, true);
            uef((View) textView5, true);
            uef(wrvVar);
        }
    }

    private void moa() {
        uef uefVarIvm = ivm();
        this.wrv = uefVarIvm;
        View view = uefVarIvm.ivm;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.oa.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.uef(((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).f25872oa, ((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).yo, ((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).ivm);
                }
            });
        }
        cq cqVar = this.wrv.uef;
        if (cqVar != null) {
            List<sy> listLpy = this.yo.lpy();
            if (listLpy != null && !listLpy.isEmpty()) {
                com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(listLpy.get(0), cqVar, this.yo);
            }
            uef((View) cqVar, true);
            cqVar.setTag(520093762, Boolean.TRUE);
        }
    }

    private void oa() {
        oib oibVarUef = uef(this.cq.getExpectExpressWidth(), this.cq.getExpectExpressHeight());
        if (this.cq.getExpectExpressWidth() <= 0 || this.cq.getExpectExpressHeight() <= 0) {
            int iYo = af.yo(this.f25872oa);
            this.xs = iYo;
            this.bcc = Float.valueOf(iYo / oibVarUef.f25864oa).intValue();
        } else {
            this.xs = af.oa(this.f25872oa, this.cq.getExpectExpressWidth());
            this.bcc = af.oa(this.f25872oa, this.cq.getExpectExpressHeight());
        }
        int i5 = this.xs;
        if (i5 > 0 && i5 > af.yo(this.f25872oa)) {
            this.xs = af.yo(this.f25872oa);
            this.bcc = Float.valueOf(this.bcc * (af.yo(this.f25872oa) / this.xs)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xs, this.bcc);
        }
        layoutParams.width = this.xs;
        layoutParams.height = this.bcc;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        gzw gzwVar = this.yo;
        if (gzwVar != null) {
            int iHw = gzwVar.hw();
            if (iHw == 1010 || iHw == 1011 || iHw == 1012) {
                moa();
            } else {
                uef(oibVarUef);
            }
        }
    }

    private uef xs() {
        int iOa = af.oa(this.f25872oa, 38.0f);
        int iOa2 = (int) (af.oa(this.f25872oa, 25.0f) / 5.0d);
        int iOa3 = af.oa(this.f25872oa, 10.0f);
        int iOa4 = af.oa(this.f25872oa, 2.0f);
        int iOa5 = af.oa(this.f25872oa, 6.0f);
        int iOa6 = af.oa(this.f25872oa, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f25872oa);
        addView(relativeLayout, -1, -1);
        bs bsVar = new bs(this.f25872oa);
        bsVar.setId(520093738);
        TextView textView = new TextView(this.f25872oa);
        textView.setId(520093730);
        ab abVar = new ab(this.f25872oa);
        abVar.setId(520093735);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f25872oa, this.yo);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.f25872oa);
        textView2.setId(520093703);
        uef uefVar = new uef(bsVar, textView, abVar, viewCreatePAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOa, iOa);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(iOa5);
        layoutParams.setMargins(iOa5, 0, 0, 0);
        bsVar.setLayoutParams(layoutParams);
        bsVar.setBackgroundColor(-1);
        bsVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(bsVar);
        LinearLayout linearLayout = new LinearLayout(this.f25872oa);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, bsVar.getId());
        layoutParams2.setMarginStart(iOa6);
        layoutParams2.setMarginEnd(iOa6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, bsVar.getId());
        layoutParams2.setMargins(iOa6, 0, iOa6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iOa4;
        abVar.setLayoutParams(layoutParams4);
        linearLayout.addView(abVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(iOa5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = iOa5;
        textView2.setBackground(dj.uef(this.f25872oa, 12));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iOa3, iOa2, iOa3, iOa2);
        textView2.setText(orq.uef(this.f25872oa, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return uefVar;
    }

    private void yo() {
        af.oa(this.f25872oa, 50.0f);
        uef uefVarXs = xs();
        this.wrv = uefVarXs;
        ImageView imageView = uefVarXs.yo;
        TextView textView = uefVarXs.f25645oa;
        ab abVar = uefVarXs.moa;
        TextView textView2 = uefVarXs.xs;
        View view = uefVarXs.ivm;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.oa.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.uef(((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).f25872oa, ((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).yo, ((com.bytedance.sdk.openadsdk.core.zjm.uef) oa.this).ivm);
                }
            });
        }
        if (this.yo.ifk() != null && !TextUtils.isEmpty(this.yo.ifk().uef())) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.yo.ifk().uef(), this.yo.ifk().oa(), this.yo.ifk().yo(), imageView, this.yo);
        }
        textView.setText(this.yo.xw());
        if (TextUtils.isEmpty(this.yo.kik())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.yo.kik());
        }
        af.uef((TextView) null, abVar, this.yo);
        uef((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        uef((View) this, true);
        uef((View) textView2, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.uef
    public void uef(View view, int i5, com.bytedance.sdk.openadsdk.core.model.ab abVar) {
        tpx tpxVar = this.cq;
        if (tpxVar != null) {
            tpxVar.uef(view, i5, abVar);
        }
    }

    public void uef(gzw gzwVar, tpx tpxVar, com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yoVar) {
        setBackgroundColor(-1);
        this.yo = gzwVar;
        this.cq = tpxVar;
        this.ivm = "banner_ad";
        tpxVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        oa();
    }

    public static class uef {
        private wrv bcc;
        View ivm;
        FrameLayout lw;
        ab moa;

        /* renamed from: oa, reason: collision with root package name */
        public TextView f25645oa;
        public cq uef;
        TextView xs;
        ImageView yo;

        public uef(ImageView imageView, TextView textView, ab abVar, View view, TextView textView2) {
            this.yo = imageView;
            this.f25645oa = textView;
            this.moa = abVar;
            this.ivm = view;
            this.xs = textView2;
        }

        public uef(ImageView imageView, View view, TextView textView, TextView textView2, cq cqVar, ab abVar, FrameLayout frameLayout) {
            this.yo = imageView;
            this.ivm = view;
            this.xs = textView;
            this.f25645oa = textView2;
            this.uef = cqVar;
            this.moa = abVar;
            this.lw = frameLayout;
        }

        public uef(ImageView imageView, View view, TextView textView, TextView textView2, wrv wrvVar, ab abVar, FrameLayout frameLayout) {
            this.yo = imageView;
            this.ivm = view;
            this.xs = textView;
            this.f25645oa = textView2;
            this.bcc = wrvVar;
            this.moa = abVar;
            this.lw = frameLayout;
        }

        public uef(View view, cq cqVar) {
            this.ivm = view;
            this.uef = cqVar;
        }
    }

    private void uef(oib oibVar) {
        if (oibVar.uef == 1) {
            yo();
        } else {
            lw();
        }
    }

    public static oib uef(int i5, int i10) {
        try {
            return ((double) i10) >= Math.floor((((double) i5) * 450.0d) / 600.0d) ? uef[1] : uef[0];
        } catch (Throwable unused) {
            return uef[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.uef
    public void uef() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.lw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.yo.yo yoVar = this.moa;
        if (yoVar != null) {
            yoVar.uef();
        } else {
            TTDelegateActivity.uef(this.yo, this.dz);
        }
    }
}
