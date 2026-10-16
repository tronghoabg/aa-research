package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.common.bs;
import com.bytedance.sdk.openadsdk.common.tpx;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public class orq {

    /* renamed from: ab, reason: collision with root package name */
    private final com.bytedance.sdk.component.cz.ivm f25312ab;
    private final Context bcc;
    private ivm.uef bs;
    private ImageView cq;
    private ImageView cz;
    private View dhk;
    private ImageView dj;
    private com.bytedance.sdk.openadsdk.core.ivm.lw gsd;
    private TextView gzw;
    private final RelativeLayout ivm;
    tpx lw;

    /* renamed from: oa, reason: collision with root package name */
    TTAdDislikeToast f25313oa;
    private boolean oib;
    private TextView orq;
    private final String sy;
    bs uef;
    private boolean wk;
    private ImageView wrv;
    private final gzw xs;
    private com.bytedance.sdk.openadsdk.core.ivm.ivm zjm;
    final AtomicBoolean yo = new AtomicBoolean(false);
    final AtomicBoolean moa = new AtomicBoolean(false);
    private boolean tpx = false;
    private final int dz = af.oa(com.bytedance.sdk.openadsdk.core.sy.uef(), 44.0f);

    public orq(Context context, RelativeLayout relativeLayout, gzw gzwVar, com.bytedance.sdk.component.cz.ivm ivmVar, String str, boolean z2) {
        this.bcc = context;
        this.ivm = relativeLayout;
        this.xs = gzwVar;
        this.f25312ab = ivmVar;
        this.sy = str;
        this.oib = z2;
        this.lw = new tpx(context, this.oib);
        xs();
        bcc();
    }

    private void cz() {
        try {
            if (this.uef == null) {
                bs bsVar = new bs(this.bcc, this.xs);
                this.uef = bsVar;
                bsVar.setDislikeSource("landing_page");
                this.uef.setCallback(new bs.uef() { // from class: com.bytedance.sdk.openadsdk.common.orq.3
                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void oa(View view) {
                        orq.this.yo.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void uef(View view) {
                        orq.this.yo.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void uef(FilterWord filterWord) {
                        if (orq.this.moa.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        orq.this.moa.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.ivm.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.uef);
            if (this.f25313oa == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.bcc);
                this.f25313oa = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private boolean dj() {
        return this.bcc.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private void zjm() {
        this.f25313oa.show(TTAdDislikeToast.getDislikeTip());
    }

    private void bcc() {
        View view = this.dhk;
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (orq.this.tpx) {
                    orq.this.uef();
                    orq.this.tpx = false;
                }
            }
        });
    }

    private void xs() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ivm.getLayoutParams();
        layoutParams.height = this.dz;
        this.ivm.setLayoutParams(layoutParams);
        int iOa = af.oa(this.bcc, 8.0f);
        this.ivm.setPadding(iOa, 0, iOa, 0);
        this.cz = (ImageView) this.ivm.findViewById(com.bytedance.sdk.openadsdk.utils.bs.dh);
        this.dj = (ImageView) this.ivm.findViewById(com.bytedance.sdk.openadsdk.utils.bs.hdd);
        this.wrv = (ImageView) this.ivm.findViewById(com.bytedance.sdk.openadsdk.utils.bs.f26138tc);
        this.cq = (ImageView) this.ivm.findViewById(520093740);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = (com.bytedance.sdk.openadsdk.core.ivm.lw) this.ivm.findViewById(com.bytedance.sdk.openadsdk.utils.bs.aos);
        this.gsd = lwVar;
        this.orq = (TextView) lwVar.findViewById(com.bytedance.sdk.openadsdk.utils.bs.uef);
        this.gzw = (TextView) this.gsd.findViewById(com.bytedance.sdk.openadsdk.utils.bs.f26137oa);
        if (dj()) {
            this.orq.setTextDirection(4);
            this.gzw.setTextDirection(4);
            this.orq.setGravity(8388629);
            this.gzw.setGravity(8388629);
            this.dj.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.bcc, "tt_titlebar_forward"));
            this.wrv.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.bcc, "tt_titlebar_backward"));
        }
        this.zjm = (com.bytedance.sdk.openadsdk.core.ivm.ivm) this.ivm.findViewById(com.bytedance.sdk.openadsdk.utils.bs.ix);
        this.wrv.setVisibility(0);
        this.dj.setVisibility(0);
        this.cz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (orq.this.f25312ab != null) {
                    orq.this.f25312ab.xs();
                    orq.this.f25312ab.removeAllViews();
                    ViewGroup viewGroup = (ViewGroup) orq.this.f25312ab.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(orq.this.f25312ab);
                    }
                    orq.this.f25312ab.ab();
                }
                if (orq.this.bcc instanceof Activity) {
                    ((Activity) orq.this.bcc).finish();
                }
            }
        });
        this.dj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (orq.this.f25312ab == null || !orq.this.f25312ab.cz()) {
                    return;
                }
                if (orq.this.bs != null) {
                    orq.this.bs.uef();
                }
                orq.this.f25312ab.zjm();
            }
        });
        this.wrv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (orq.this.f25312ab == null || !orq.this.f25312ab.dj()) {
                    return;
                }
                orq.this.f25312ab.wrv();
            }
        });
        this.cq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                orq orqVar = orq.this;
                orqVar.uef(orqVar.lw, view);
            }
        });
        uef(true);
        this.dj.setClickable(false);
        this.wrv.setClickable(false);
        ImageView imageView = this.dj;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView.setColorFilter(color, mode);
        this.wrv.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
        this.dhk = this.ivm;
    }

    public void ivm() {
        if (this.moa.get()) {
            zjm();
            return;
        }
        if (this.uef == null) {
            cz();
        }
        bs bsVar = this.uef;
        if (bsVar != null) {
            bsVar.uef();
        }
    }

    public TextView lw() {
        return this.gzw;
    }

    public TextView moa() {
        return this.orq;
    }

    public ImageView yo() {
        return this.cz;
    }

    private boolean moa(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c10 : str.toCharArray()) {
            if (Character.getDirectionality(c10) == 1 || Character.getDirectionality(c10) == 2) {
                return true;
            }
        }
        return false;
    }

    public void oa() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ivm.getLayoutParams();
            if (this.wk) {
                return;
            }
            int i5 = layoutParams.height;
            int i10 = this.dz;
            if (i5 == i10) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i10 / 2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.11
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        orq.this.ivm.setLayoutParams(layoutParams);
                        orq.this.ivm.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        orq.this.wk = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        orq.this.wk = true;
                        orq.this.uef(8);
                        orq.this.uef(false);
                        orq.this.tpx = true;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public String yo(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final tpx tpxVar, View view) {
        tpxVar.setOnMenuItemClickListener(new tpx.uef() { // from class: com.bytedance.sdk.openadsdk.common.orq.8
            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void ivm() {
                TTWebsiteActivity.uef(orq.this.bcc, orq.this.xs, gb.uef(orq.this.xs));
                tpxVar.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void lw() {
                if (!orq.this.oib) {
                    orq.this.ivm();
                }
                tpxVar.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void moa() {
                if (orq.this.f25312ab != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = orq.this.f25312ab.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.oa.uef(orq.this.bcc, intent, null);
                    }
                    tpxVar.uef();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void oa() {
                if (orq.this.f25312ab != null) {
                    orq.this.f25312ab.bcc();
                    if (orq.this.zjm != null) {
                        orq.this.zjm.setVisibility(0);
                        orq.this.zjm.setProgress(0);
                    }
                    tpxVar.uef();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void uef() {
            }

            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
            public void yo() {
                ClipboardManager clipboardManager;
                if (orq.this.f25312ab != null) {
                    String url = orq.this.f25312ab.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) orq.this.bcc.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                tpxVar.uef();
            }
        });
        tpxVar.uef(view);
    }

    public void uef(boolean z2) {
        if (this.orq == null || this.gzw == null) {
            return;
        }
        String string = moa().getText().toString();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        String strReplaceAll = StringUtils.SPACE;
        if (!zIsEmpty) {
            strReplaceAll = string.replaceAll("[\n\r]+", StringUtils.SPACE);
        }
        String string2 = lw().getText().toString();
        this.orq.setText(strReplaceAll);
        this.gzw.setText(string2);
        if (z2) {
            this.orq.setVisibility(0);
            com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = this.gsd;
            if (lwVar != null) {
                ViewGroup.LayoutParams layoutParams = lwVar.getLayoutParams();
                layoutParams.width = -2;
                this.gsd.setLayoutParams(layoutParams);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ivm.getLayoutParams();
            layoutParams2.height = this.dz;
            this.ivm.setLayoutParams(layoutParams2);
            return;
        }
        this.orq.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = this.gsd;
        if (lwVar2 != null) {
            ViewGroup.LayoutParams layoutParams3 = lwVar2.getLayoutParams();
            layoutParams3.width = -1;
            this.gsd.setLayoutParams(layoutParams3);
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.ivm.getLayoutParams();
        layoutParams4.height = this.dz / 2;
        this.ivm.setLayoutParams(layoutParams4);
    }

    public void oa(String str) {
        String strYo = yo(str);
        TextView textView = this.gzw;
        if (!TextUtils.isEmpty(strYo)) {
            str = strYo;
        }
        textView.setText(str);
    }

    public void uef() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ivm.getLayoutParams();
            if (this.wk) {
                return;
            }
            int i5 = layoutParams.height;
            int i10 = this.dz;
            if (i5 == i10 / 2) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10 / 2, i10);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        orq.this.ivm.setLayoutParams(layoutParams);
                        orq.this.ivm.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.orq.10
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        orq.this.wk = false;
                        orq.this.uef(0);
                        orq.this.uef(true);
                        orq.this.tpx = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        orq.this.wk = true;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void uef(String str) {
        this.orq.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5) {
        ImageView imageView = this.cz;
        if (imageView != null) {
            imageView.setVisibility(i5);
        }
        ImageView imageView2 = this.dj;
        if (imageView2 != null) {
            imageView2.setVisibility(i5);
        }
        ImageView imageView3 = this.wrv;
        if (imageView3 != null) {
            imageView3.setVisibility(i5);
        }
        ImageView imageView4 = this.cq;
        if (imageView4 != null) {
            imageView4.setVisibility(i5);
        }
    }

    public void uef(WebView webView, ivm.uef uefVar) {
        this.bs = uefVar;
        try {
            if (this.dj != null) {
                if (webView.canGoBack()) {
                    this.dj.setClickable(true);
                    this.dj.clearColorFilter();
                } else {
                    this.dj.setClickable(false);
                    this.dj.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.wrv != null) {
                if (webView.canGoForward()) {
                    this.wrv.setClickable(true);
                    this.wrv.clearColorFilter();
                } else {
                    this.wrv.setClickable(false);
                    this.wrv.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
