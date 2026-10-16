package com.bytedance.sdk.openadsdk.core.wk.oa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.dhk;
import com.bytedance.sdk.openadsdk.core.widget.oib;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.dj;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class moa extends lw {
    private ImageView af;
    private float aos;
    private TextView au;
    private ColorStateList bx;
    private final Rect cl;
    private SeekBar cop;
    private final Rect dh;
    private TextView dor;
    private boolean dv;
    private TextView dxx;
    private ImageView etd;
    private float fzf;
    private TextView gb;
    private View gem;
    private final int ggp;
    private final Rect hdd;

    /* renamed from: hg, reason: collision with root package name */
    private final Rect f25798hg;
    private float hnk;
    private int hts;
    private ColorStateList ix;
    private final int jkf;
    private TextView km;
    private ImageView lz;

    /* renamed from: ne, reason: collision with root package name */
    private float f25799ne;
    private int nkh;
    private int ot;
    private ColorStateList ou;
    private View oyt;
    private TextView pu;
    private boolean rj;
    private ImageView rl;
    private View sk;
    private final oib sw;
    private TextView swd;
    private final ue uqx;
    private float vj;
    private final Rect vjj;
    private int vyg;
    private int wxf;
    private final View.OnTouchListener xvp;
    private int zou;

    public moa(Context context, ViewGroup viewGroup, boolean z2, int i5, gzw gzwVar, com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar, boolean z10) {
        super(context, viewGroup, z2, i5, gzwVar, yoVar, z10);
        this.uqx = new ue(this);
        this.rj = false;
        this.dv = false;
        this.zou = 0;
        this.nkh = 0;
        this.hts = 0;
        this.vyg = 0;
        this.wxf = 0;
        this.f25798hg = new Rect();
        this.vjj = new Rect();
        this.ot = 0;
        this.xvp = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.moa.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.dh = new Rect();
        this.cl = new Rect();
        this.hdd = new Rect();
        this.gzw = sy.uef().getApplicationContext();
        moa(z10);
        this.yo = viewGroup;
        this.sy = z2;
        oib oibVar = new oib(this);
        this.sw = oibVar;
        oibVar.uef(this.sy);
        DisplayMetrics displayMetrics = this.gzw.getResources().getDisplayMetrics();
        this.jkf = displayMetrics.widthPixels;
        this.ggp = displayMetrics.heightPixels;
        this.tpx = i5;
        this.pz = yoVar;
        this.orq = gzwVar;
        moa(8);
        uef(context, this.yo);
        moa();
        wrv();
    }

    private void gr() {
        TextView textView = this.dor;
        if (textView != null) {
            textView.setTextSize(0, this.vj);
            ColorStateList colorStateList = this.ix;
            if (colorStateList != null) {
                this.dor.setTextColor(colorStateList);
            }
            this.dor.setAlpha(this.f25799ne);
            this.dor.setShadowLayer(af.oa(this.gzw, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, orq.xs(this.gzw, "tt_72000000"));
            TextView textView2 = this.dor;
            Rect rect = this.dh;
            af.uef(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.au;
        if (textView3 != null) {
            textView3.setTextSize(0, this.aos);
            ColorStateList colorStateList2 = this.bx;
            if (colorStateList2 != null) {
                this.au.setTextColor(colorStateList2);
            }
            this.au.setAlpha(this.fzf);
            this.au.setShadowLayer(af.oa(this.gzw, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, orq.xs(this.gzw, "tt_72000000"));
            TextView textView4 = this.au;
            Rect rect2 = this.cl;
            af.uef(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.etd;
        if (imageView != null) {
            Rect rect3 = this.hdd;
            af.uef(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.etd;
        if (imageView2 != null) {
            imageView2.setImageDrawable(orq.yo(this.gzw, "tt_enlarge_video"));
        }
        TextView textView5 = this.pu;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.ou;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.pu.setAlpha(this.hnk);
            TextView textView6 = this.pu;
            Rect rect4 = this.cl;
            af.uef(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.oyt;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.ot;
            this.oyt.setLayoutParams(layoutParams);
            this.oyt.setBackground(dj.uef(this.gzw, "tt_video_black_desc_gradient"));
        }
        oa(false, true);
    }

    private void rt() {
        DisplayMetrics displayMetrics = this.gzw.getResources().getDisplayMetrics();
        TextView textView = this.dor;
        if (textView != null) {
            this.vj = textView.getTextSize();
            this.dor.setTextSize(2, 14.0f);
            ColorStateList textColors = this.dor.getTextColors();
            this.ix = textColors;
            if (textColors != null) {
                this.dor.setTextColor(-1);
            }
            this.f25799ne = this.dor.getAlpha();
            this.dor.setAlpha(0.85f);
            this.dor.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, af.oa(this.gzw, 0.5f), af.oa(this.gzw, 0.5f), orq.xs(this.gzw, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.dor.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.dh.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                af.uef(this.dor, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.dh.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.dh.bottom);
            }
        }
        TextView textView2 = this.au;
        if (textView2 != null) {
            this.aos = textView2.getTextSize();
            this.au.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.au.getTextColors();
            this.bx = textColors2;
            if (textColors2 != null) {
                this.au.setTextColor(-1);
            }
            this.fzf = this.au.getAlpha();
            this.au.setAlpha(0.85f);
            this.au.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, af.oa(this.gzw, 0.5f), af.oa(this.gzw, 0.5f), orq.xs(this.gzw, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.au.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.cl.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.au;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.cl;
                af.uef(textView3, iApplyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.etd;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.hdd.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.etd;
                Rect rect2 = this.hdd;
                af.uef(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.hdd.bottom);
            }
        }
        ImageView imageView3 = this.etd;
        if (imageView3 != null) {
            imageView3.setImageDrawable(orq.yo(this.gzw, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.pu;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.ou = textColors3;
            if (textColors3 != null) {
                this.pu.setTextColor(-1);
            }
            this.hnk = this.pu.getAlpha();
            this.pu.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.pu.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.vjj.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.pu;
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.cl;
                af.uef(textView5, iApplyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.oyt;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.ot = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.oyt.setLayoutParams(layoutParams5);
            this.oyt.setBackgroundResource(orq.moa(this.gzw, "tt_shadow_fullscreen_top"));
        }
        oa(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void bcc() {
        af.lw(this.ivm);
        af.lw(this.sk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void cz() {
        this.cop.setProgress(0);
        this.cop.setSecondaryProgress(0);
        this.au.setText(orq.uef(this.gzw, "tt_00_00"));
        this.dor.setText(orq.uef(this.gzw, "tt_00_00"));
        moa(8);
        if (gsd()) {
            this.moa.setVisibility(8);
        }
        ImageView imageView = this.bcc;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        moa(8);
        af.uef(this.gem, 8);
        af.uef(this.zjm, 8);
        af.uef((View) this.dj, 8);
        af.uef(this.wrv, 8);
        dhk dhkVar = this.gsd;
        if (dhkVar != null) {
            dhkVar.uef(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw, com.bytedance.sdk.openadsdk.core.widget.dhk.oa
    public void dj() {
        uef(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void ivm() {
        this.uqx.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void lw() {
        this.uqx.removeMessages(1);
        this.uqx.sendMessageDelayed(this.uqx.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void moa() {
        super.moa();
        this.sw.uef(this.yo);
        af.uef((View) this.lz, (this.sy || (this.tpx & 1) == 1) ? 8 : 0);
        this.lz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.moa.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (moa.this.ab()) {
                    moa moaVar = moa.this;
                    moaVar.rt.yo(moaVar, view);
                }
            }
        });
        af.uef((View) this.dxx, (!this.sy || (this.tpx & 2) == 2) ? 0 : 8);
        this.dxx.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.moa.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (moa.this.ab()) {
                    moa moaVar = moa.this;
                    moaVar.rt.moa(moaVar, view);
                }
            }
        });
        this.af.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.moa.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (moa.this.ab()) {
                    moa moaVar = moa.this;
                    moaVar.rt.lw(moaVar, view);
                }
            }
        });
        this.rl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.moa.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                moa.this.oa(false, true);
                moa.this.bcc();
                moa.this.xs();
                moa.this.ab();
            }
        });
        this.etd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.moa.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (moa.this.ab()) {
                    moa moaVar = moa.this;
                    moaVar.rt.oa(moaVar, view);
                }
            }
        });
        this.cop.setThumbOffset(0);
        this.cop.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.wk.oa.moa.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i5, boolean z2) {
                if (moa.this.ab()) {
                    moa moaVar = moa.this;
                    moaVar.rt.uef(moaVar, i5, z2);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!moa.this.rj && moa.this.gzw != null) {
                    seekBar.setThumb(dj.uef(sy.uef(), "tt_seek_thumb_press"));
                }
                if (moa.this.ab()) {
                    seekBar.setThumbOffset(0);
                    moa moaVar = moa.this;
                    moaVar.rt.oa(moaVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!moa.this.rj && moa.this.gzw != null) {
                    seekBar.setThumb(dj.uef(sy.uef(), "tt_seek_thumb_normal"));
                }
                if (moa.this.ab()) {
                    seekBar.setThumbOffset(0);
                    moa moaVar = moa.this;
                    moaVar.rt.uef(moaVar, seekBar.getProgress());
                }
            }
        });
        this.cop.setOnTouchListener(this.xvp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void oa(boolean z2) {
        int i5 = zjm() ? this.ggp : this.dz;
        int iOa = zjm() ? this.jkf : this.wk;
        if (this.bs <= 0 || this.f25795ab <= 0 || i5 <= 0) {
            return;
        }
        if (!tpx() && !zjm() && (this.tpx & 8) != 8) {
            iOa = af.oa(this.gzw, 228.0f);
        }
        int i10 = this.f25795ab;
        int i11 = this.bs;
        int i12 = (int) (i11 * ((i5 * 1.0f) / i10));
        if (i12 > iOa) {
            i5 = (int) (i10 * ((iOa * 1.0f) / i11));
        } else {
            iOa = i12;
        }
        if (!z2 && !zjm()) {
            i5 = this.dz;
            iOa = this.wk;
        }
        this.moa.uef(i5, iOa);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw, com.bykv.vk.openvk.uef.uef.uef.moa.oa
    public /* bridge */ /* synthetic */ void uef(gzw gzwVar, WeakReference weakReference, boolean z2) {
        uef(gzwVar, (WeakReference<Context>) weakReference, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void xs() {
        gzw gzwVar;
        af.ivm(this.ivm);
        af.ivm(this.xs);
        af.lw(this.sk);
        if (this.bcc != null && (gzwVar = this.orq) != null && gzwVar.nj() != null && this.orq.nj().zjm() != null) {
            af.ivm(this.bcc);
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.orq.nj().zjm(), this.orq.nj().yo(), this.orq.nj().oa(), this.bcc, this.orq);
        }
        if (this.lw.getVisibility() == 0) {
            af.uef((View) this.lw, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void yo(boolean z2) {
        TextView textView = this.km;
        if (textView != null) {
            af.uef((View) textView, (!this.sy && z2) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw, com.bytedance.sdk.openadsdk.core.widget.dhk.oa
    public boolean zjm() {
        return this.rj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(Context context, View view) {
        super.uef(context, view);
        this.dxx = (TextView) view.findViewById(bs.rwy);
        this.lz = (ImageView) view.findViewById(bs.f5try);
        this.oyt = view.findViewById(bs.no);
        this.af = (ImageView) view.findViewById(bs.agr);
        this.km = (TextView) view.findViewById(bs.jx);
        this.pu = (TextView) view.findViewById(bs.em);
        this.gb = (TextView) view.findViewById(bs.tkg);
        this.sk = view.findViewById(bs.kik);
        this.rl = (ImageView) view.findViewById(bs.up);
        TextView textView = (TextView) view.findViewById(bs.iou);
        this.swd = textView;
        textView.setText(orq.uef(context, "tt_video_retry_des_txt"));
        this.cop = (SeekBar) view.findViewById(bs.zrl);
        this.au = (TextView) view.findViewById(bs.hjx);
        this.dor = (TextView) view.findViewById(bs.gk);
        this.gem = view.findViewById(bs.vup);
        this.etd = (ImageView) view.findViewById(bs.kn);
        this.cz = view.findViewById(bs.lpy);
    }

    private void lw(boolean z2) {
        if (z2) {
            rt();
        } else {
            gr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void oa(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = this.yo) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.rj = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.yo.getLayoutParams();
        marginLayoutParams.width = this.hts;
        marginLayoutParams.height = this.vyg;
        marginLayoutParams.leftMargin = this.nkh;
        marginLayoutParams.topMargin = this.zou;
        this.yo.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.wxf);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.f25798hg;
            af.uef(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        oa(true);
        this.etd.setImageDrawable(orq.yo(this.gzw, "tt_enlarge_video"));
        this.cop.setThumb(dj.uef(this.gzw, "tt_seek_thumb_normal"));
        this.cop.setThumbOffset(0);
        com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef((View) this.yo, true);
        lw(this.rj);
        af.uef(this.oyt, 8);
        if ((this.tpx & 2) == 2) {
            af.uef((View) this.dxx, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(String str) {
        TextView textView = this.km;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.pu;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(int i5) {
        View view = this.gem;
        if (view == null || view.getVisibility() != 0) {
            this.cop.setProgress(i5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(long j8, long j10) {
        this.au.setText(com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(j10));
        this.dor.setText(com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(j8));
        this.cop.setProgress(com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(j8, j10));
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw, com.bykv.vk.openvk.uef.uef.uef.moa.oa
    public void uef() {
        uef(false, this.sy);
        oib();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(long j8) {
        this.dor.setText(com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(j8));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(gzw gzwVar, WeakReference<Context> weakReference, boolean z2) {
        String strUef;
        gzw gzwVar2;
        if (gzwVar == null) {
            return;
        }
        uef(this.yo, sy.uef());
        uef(false, this.sy);
        af.uef(this.zjm, 0);
        af.uef((View) this.dj, 0);
        af.uef(this.wrv, 0);
        if (this.dj != null && (gzwVar2 = this.orq) != null && gzwVar2.nj() != null && this.orq.nj().zjm() != null) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.orq.nj().zjm(), this.orq.nj().yo(), this.orq.nj().oa(), this.dj, this.orq);
        }
        af.uef((View) this.cq, 0);
        int iYkf = gzwVar.ykf();
        if (iYkf == 4) {
            strUef = orq.uef(this.gzw, "tt_video_download_apk");
        } else if (iYkf != 5) {
            strUef = orq.uef(this.gzw, "tt_video_mobile_go_detail");
        } else {
            strUef = orq.uef(this.gzw, "tt_video_dial_phone");
        }
        TextView textView = this.cq;
        if (textView != null) {
            textView.setText(strUef);
            this.cq.setOnClickListener(this.cp);
            this.cq.setOnTouchListener(this.cp);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public boolean oa(int i5) {
        SeekBar seekBar = this.cop;
        return seekBar != null && i5 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(ViewGroup viewGroup) {
        if (viewGroup != null && (this.yo.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.rj = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.yo.getLayoutParams();
            this.nkh = marginLayoutParams.leftMargin;
            this.zou = marginLayoutParams.topMargin;
            this.hts = marginLayoutParams.width;
            this.vyg = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.yo.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.wxf = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f25798hg.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                af.uef(viewGroup, 0, 0, 0, 0);
            }
            oa(true);
            this.etd.setImageDrawable(orq.yo(this.gzw, "tt_shrink_video"));
            this.cop.setThumb(dj.uef(this.gzw, "tt_seek_thumb_fullscreen_selector"));
            this.cop.setThumbOffset(0);
            com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef((View) this.yo, false);
            lw(this.rj);
            af.uef(this.oyt, 8);
            if (!this.sy) {
                af.uef((View) this.lz, 8);
                af.uef((View) this.dxx, 8);
            } else if ((this.tpx & 1) == 1) {
                af.uef((View) this.lz, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw, com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        if (message.what != 1) {
            return;
        }
        dj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(boolean z2, boolean z10, boolean z11) {
        af.uef(this.gem, 0);
        if (this.rj) {
            af.uef(this.oyt, 0);
            af.uef((View) this.pu, 0);
        } else if (z11) {
            af.uef(this.oyt, 8);
        }
        af.uef((View) this.lw, (!z2 || this.ivm.getVisibility() == 0) ? 8 : 0);
        if (!this.sy && !this.rj) {
            if ((this.tpx & 1) != 1 && !z11) {
                af.uef((View) this.lz, 0);
            }
            af.uef((View) this.dxx, z11 ? 8 : 0);
        }
        af.uef((View) this.au, 0);
        af.uef((View) this.dor, 0);
        af.uef((View) this.cop, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw
    public void uef(boolean z2, boolean z10) {
        af.uef(this.gem, 8);
        af.uef(this.oyt, 8);
        af.uef((View) this.lw, 8);
        if (!this.sy && !this.rj) {
            af.uef((View) this.lz, 8);
            if ((this.tpx & 2) != 2) {
                af.uef((View) this.dxx, 8);
            }
        } else if ((this.tpx & 1) == 1) {
            af.uef((View) this.lz, 8);
        }
        if (z10) {
            af.uef((View) this.lz, 8);
            af.uef((View) this.dxx, 8);
        }
        yo(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.lw, com.bytedance.sdk.openadsdk.core.widget.oib.uef
    public void uef(View view, boolean z2) {
        if (zjm()) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            gzw gzwVar = this.orq;
            if (gzwVar != null && !TextUtils.isEmpty(gzwVar.xw())) {
                uef(this.orq.xw());
            }
            this.gb.setText(str);
        } else {
            uef("");
            this.gb.setText("");
        }
        if (this.gr) {
            return;
        }
        yo(this.sy && !this.rj);
        if (ab()) {
            this.rt.uef(this, view, true, this.ivm.getVisibility() != 0);
        }
    }
}
