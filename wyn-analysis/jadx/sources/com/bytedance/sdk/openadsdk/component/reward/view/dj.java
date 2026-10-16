package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.oa.dz;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.uef.ab;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.wk;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class dj {

    /* renamed from: ab, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.ivm.ivm f25442ab;
    View bcc;
    PAGLogoView cz;
    private int dhk;
    RelativeLayout dj;
    private com.bytedance.sdk.openadsdk.core.widget.dj gzw;
    FrameLayout ivm;
    ImageView lw;
    final gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    final Activity f25443oa;
    private final String oib;
    private moa orq;
    private final boolean sy;
    private boolean tpx;
    public dhk wk;
    ab wrv;
    View xs;
    protected final com.bytedance.sdk.openadsdk.component.reward.uef.oa yo;
    ImageView zjm;
    int uef = 3;
    protected int cq = 0;
    protected final AtomicBoolean dz = new AtomicBoolean(false);
    Runnable bs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dj.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                gzw gzwVar = dj.this.moa;
                if ((gzwVar == null || !gzwVar.ib()) && (imageView = dj.this.lw) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    dj.this.yo.dxx.uef(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public dj(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.yo = oaVar;
        this.f25443oa = oaVar.pu;
        this.moa = oaVar.f25412oa;
        this.oib = oaVar.lw;
        this.sy = oaVar.moa;
    }

    private void sy() {
        RelativeLayout relativeLayout;
        moa moaVar = (moa) this.yo.km.findViewById(bs.dz);
        this.orq = moaVar;
        moaVar.uef(this.yo);
        com.bytedance.sdk.openadsdk.core.widget.dj djVar = (com.bytedance.sdk.openadsdk.core.widget.dj) this.yo.km.findViewById(bs.lo);
        this.gzw = djVar;
        if (djVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.yo;
            djVar.uef(oaVar.f25412oa, oaVar.lw, null);
        }
        this.cz = (PAGLogoView) this.yo.km.findViewById(520093757);
        this.zjm = (ImageView) this.yo.km.findViewById(bs.ovw);
        this.lw = (ImageView) this.yo.km.findViewById(520093708);
        this.ivm = (FrameLayout) this.yo.km.findViewById(bs.cq);
        this.xs = this.yo.km.findViewById(bs.sy);
        this.bcc = this.yo.km.findViewById(bs.aje);
        this.dj = (RelativeLayout) this.yo.km.findViewById(bs.pp);
        ab abVar = this.wrv;
        if (abVar == null || abVar.lw() == null || (relativeLayout = this.dj) == null) {
            return;
        }
        relativeLayout.addView(this.wrv.lw(), new LinearLayout.LayoutParams(-1, -1));
        this.wrv.oa();
    }

    public void ab() {
        dhk dhkVar = this.wk;
        if (dhkVar != null) {
            dhkVar.bcc();
        }
    }

    public void bcc() {
        moa moaVar = this.orq;
        if (moaVar == null) {
            return;
        }
        moaVar.uef();
    }

    public void bs() {
        com.bytedance.sdk.openadsdk.core.yo.lw lwVarLw = this.yo.gr.lw();
        View view = this.orq;
        if (view == null) {
            view = this.yo.km;
        }
        lwVarLw.onClick(view);
    }

    public void cq() {
        try {
            Activity activity = this.yo.pu;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, orq.cz(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.yo.oyt.wrv();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dj.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        dj.this.yo.oyt.wrv();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.yo.oyt.uef(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.yo.oyt.wrv();
        }
    }

    public boolean cz() {
        ImageView imageView = this.lw;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public View dj() {
        return this.orq;
    }

    public void dz() {
        dhk dhkVar = this.wk;
        if (dhkVar != null) {
            dhkVar.ivm();
        }
        ImageView imageView = this.lw;
        if (imageView != null) {
            imageView.removeCallbacks(this.bs);
        }
    }

    public FrameLayout ivm() {
        return this.ivm;
    }

    public void lw() {
        int iHdd = this.moa.hdd();
        this.uef = iHdd;
        if (iHdd == -200) {
            this.uef = sy.moa().ab(String.valueOf(this.moa.jnk()));
        }
        if (this.uef != -1 || uef()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo.f25410hg;
        if ((oaVar instanceof com.bytedance.sdk.openadsdk.component.reward.oa.moa) || (oaVar instanceof com.bytedance.sdk.openadsdk.component.reward.oa.yo)) {
            return;
        }
        oa(0);
    }

    public void moa() {
        if (this.yo.f25412oa.hs() && cp.yo(this.yo.f25412oa)) {
            return;
        }
        af.uef((View) this.ivm, 8);
        af.uef((View) this.gzw, 8);
        af.uef(this.xs, 8);
        af.uef(this.bcc, 8);
        oa(8);
        af.uef((View) this.lw, 8);
        af.uef((View) this.cz, 8);
        af.uef((View) this.dj, 8);
        af.uef((View) this.zjm, 8);
    }

    public void oa() {
        if (this.tpx) {
            return;
        }
        this.tpx = true;
        this.dhk = this.yo.etd;
        if (uef()) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.yo;
            if (!oaVar.vyg) {
                ab abVar = new ab(oaVar);
                this.wrv = abVar;
                abVar.uef();
            }
        }
        sy();
        Activity activity = this.f25443oa;
        gzw gzwVar = this.moa;
        String str = this.oib;
        FrameLayout frameLayout = this.ivm;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.yo;
        dhk dhkVar = new dhk(activity, gzwVar, str, frameLayout, oaVar2.gb, oaVar2.km);
        this.wk = dhkVar;
        dhkVar.uef();
    }

    public boolean uef() {
        return true;
    }

    public void wk() {
        dhk dhkVar = this.wk;
        if (dhkVar != null) {
            dhkVar.xs();
        }
    }

    public void wrv() {
        try {
            ab abVar = this.wrv;
            if (abVar != null) {
                abVar.yo();
            }
            RelativeLayout relativeLayout = this.dj;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.dj;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    public void xs() {
        if (this.zjm.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.zjm.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.zjm.setLayoutParams(marginLayoutParams);
        }
    }

    public void yo() {
        this.ivm.removeAllViews();
    }

    public View zjm() {
        return this.lw;
    }

    public void ivm(int i5) {
        af.uef((View) this.lw, i5);
    }

    public void yo(int i5) {
        gzw gzwVar = this.moa;
        if (gzwVar != null && gzwVar.hs() && cp.yo(this.moa)) {
            af.uef((View) this.gzw, i5);
        }
    }

    public void uef(boolean z2) {
        af.uef((View) this.cz, cp.yo(this.moa) ? 8 : 0);
        af.uef((View) this.zjm, (this.moa.ebe() && this.moa.gzw()) ? 0 : 8);
        oa(z2);
        if (this.sy) {
            lw();
        }
    }

    public void lw(int i5) {
        int i10 = this.uef;
        if (i10 == -1 || i5 != i10 || this.dz.get()) {
            return;
        }
        oa(0);
        this.dz.set(true);
        bcc();
    }

    public void uef(int i5) {
        if (this.f25442ab == null) {
            this.f25442ab = new com.bytedance.sdk.openadsdk.core.ivm.ivm(this.yo.pu);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.f25442ab.setLayoutParams(layoutParams);
            this.f25442ab.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.dj.uef(this.yo.pu, "tt_video_loading_progress_bar"));
            this.yo.oyt.ivm().addView(this.f25442ab);
        }
        this.f25442ab.setVisibility(i5);
    }

    public void oa(boolean z2) {
        ImageView imageView;
        int iUef;
        if (this.dhk != 1 && (imageView = this.lw) != null && z2) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iUef = uef("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iUef > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iUef;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo.f25410hg;
        if ((oaVar instanceof com.bytedance.sdk.openadsdk.component.reward.oa.moa) || (oaVar instanceof com.bytedance.sdk.openadsdk.component.reward.oa.yo)) {
            return;
        }
        oa(0);
    }

    public void moa(int i5) {
        af.uef((View) this.cz, i5);
    }

    public void uef(int i5, int i10) {
        FrameLayout frameLayout;
        if (this.moa.bx() == 1 && (frameLayout = this.ivm) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iYo = af.yo((Context) this.f25443oa);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ivm.getLayoutParams();
            layoutParams.width = iYo;
            int i11 = (iYo * 9) / 16;
            layoutParams.height = i11;
            this.ivm.setLayoutParams(layoutParams);
            this.cq = (af.lw(this.f25443oa) - i11) / 2;
        }
    }

    public void oa(int i5) {
        gzw gzwVar = this.moa;
        if (gzwVar != null && gzwVar.ebe() && wk.uef(this.moa)) {
            af.uef((View) this.orq, 8);
        } else {
            af.uef((View) this.orq, i5);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.yo yoVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        gzw gzwVar;
        if (this.ivm != null && (gzwVar = this.moa) != null && gzwVar.fzf() != null) {
            if (this.moa.fzf().ivm && !dhk.oa(this.moa)) {
                uef((View.OnClickListener) yoVar);
                uef(yoVar);
            } else {
                uef(onClickListener);
            }
        }
        gzw gzwVar2 = this.moa;
        if (gzwVar2 != null && gzwVar2.bx() == 1) {
            if (this.moa.fzf() != null && (view2 = this.xs) != null) {
                af.uef(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.xs.getLayoutParams();
                layoutParams.height = this.cq;
                this.xs.setLayoutParams(layoutParams);
                if (this.moa.fzf().f25673oa) {
                    this.xs.setOnClickListener(yoVar);
                    this.xs.setOnTouchListener(onTouchListener);
                } else {
                    this.xs.setOnClickListener(onClickListener);
                }
            }
            if (this.moa.fzf() != null && (view = this.bcc) != null) {
                af.uef(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.bcc.getLayoutParams();
                layoutParams2.height = this.cq;
                this.bcc.setLayoutParams(layoutParams2);
                if (this.moa.fzf().moa) {
                    this.bcc.setOnClickListener(yoVar);
                    this.bcc.setOnTouchListener(onTouchListener);
                } else {
                    this.bcc.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.cz;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        dj djVar = dj.this;
                        TTWebsiteActivity.uef(djVar.f25443oa, djVar.moa, djVar.oib);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.dhk.yo("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.zjm;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef((int) af.uef(sy.uef(), 14.0f, true), this.zjm, this.yo.f25412oa);
        }
    }

    private int uef(String str) {
        Resources resources = this.f25443oa.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void uef(View.OnClickListener onClickListener) {
        af.uef(this.ivm, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void uef(com.bytedance.sdk.openadsdk.core.yo.yo yoVar) {
        af.uef((View) this.ivm, (View.OnTouchListener) yoVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void uef(float f10) {
        af.uef(this.lw, f10);
    }

    public void uef(Animation animation) {
        RelativeLayout relativeLayout = this.dj;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void uef(int i5, dz dzVar) {
        dhk dhkVar = this.wk;
        if (dhkVar != null) {
            dhkVar.uef(i5, dzVar);
        }
    }
}
