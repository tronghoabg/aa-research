package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ivm.rt;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class cz extends FrameLayout implements bcc {
    private View.OnTouchListener bcc;
    private int cz;
    private com.bytedance.sdk.component.adexpress.dynamic.moa.zjm dj;
    private String ivm;
    private xs lw;
    private View moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw f24878oa;
    private Context uef;
    private com.bytedance.sdk.component.adexpress.oa.cq wrv;
    private com.bytedance.sdk.component.adexpress.ivm.bs xs;
    private com.bytedance.sdk.component.adexpress.dynamic.moa.xs yo;
    private boolean zjm;

    public cz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        super(context);
        this.uef = context;
        this.f24878oa = lwVar;
        this.yo = xsVar;
        xs();
    }

    private boolean bcc() {
        return (this.yo.nkh() || TextUtils.equals("9", this.ivm) || TextUtils.equals("16", this.ivm) || TextUtils.equals("17", this.ivm) || TextUtils.equals("18", this.ivm) || TextUtils.equals("20", this.ivm) || TextUtils.equals("29", this.ivm) || TextUtils.equals("10", this.ivm)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cz() {
        if (this.bcc != null) {
            setOnClickListener((View.OnClickListener) this.f24878oa.getDynamicClickListener());
            performClick();
            if (this.yo.ix()) {
                return;
            }
            setVisibility(8);
        }
    }

    private void xs() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.ivm = this.yo.rl();
        this.cz = this.yo.cop();
        this.zjm = this.yo.nkh();
        xs xsVarUef = zjm.uef(this.uef, this.f24878oa, this.yo, this.dj, this.wrv);
        this.lw = xsVarUef;
        if (xsVarUef != null) {
            this.moa = xsVarUef.yo();
            if (this.yo.swd()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.ivm, "6")) {
                if (!this.yo.hts() || TextUtils.isEmpty(this.yo.vyg())) {
                    this.xs = new com.bytedance.sdk.component.adexpress.ivm.bs(this.uef, Color.parseColor("#99000000"));
                } else {
                    this.xs = new com.bytedance.sdk.component.adexpress.ivm.bs(this.uef, com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(this.yo.vyg()));
                }
                FrameLayout frameLayout = new FrameLayout(this.uef);
                frameLayout.addView(this.xs, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.yo.cz.1
                    @Override // java.lang.Runnable
                    public void run() {
                        cz.this.xs.oa();
                    }
                });
            }
            if (uef(this.ivm) && com.bytedance.sdk.component.adexpress.moa.oa()) {
                int color = Color.parseColor("#99000000");
                if (this.yo.hts() && !TextUtils.isEmpty(this.yo.vyg())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(this.yo.vyg());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.uef);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.lw.yo());
            uef(this.lw.yo());
            setVisibility(0);
        }
    }

    public void ivm() {
        if (this.moa != null && TextUtils.equals(this.ivm, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            View view = this.moa;
            if (view instanceof com.bytedance.sdk.component.adexpress.ivm.yo) {
                ((com.bytedance.sdk.component.adexpress.ivm.yo) view).moa();
            }
        }
    }

    public void lw() {
        if (this.moa != null && TextUtils.equals(this.ivm, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            View view = this.moa;
            if (view instanceof com.bytedance.sdk.component.adexpress.ivm.yo) {
                ((com.bytedance.sdk.component.adexpress.ivm.yo) view).yo();
            }
        }
    }

    public void moa() {
        xs xsVar = this.lw;
        if (xsVar != null) {
            xsVar.oa();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            xs xsVar = this.lw;
            if (xsVar != null) {
                xsVar.oa();
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.bcc instanceof com.bytedance.sdk.component.adexpress.dynamic.yo.uef.yo) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void yo() {
        xs xsVar = this.lw;
        if (xsVar != null) {
            xsVar.uef();
        }
    }

    private boolean uef(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.bcc
    public void oa() {
        if (bcc()) {
            setOnClickListener((View.OnClickListener) this.f24878oa.getDynamicClickListener());
            performClick();
            if (this.yo.ix()) {
                return;
            }
            setVisibility(8);
        }
    }

    public cz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar, com.bytedance.sdk.component.adexpress.dynamic.moa.zjm zjmVar, com.bytedance.sdk.component.adexpress.oa.cq cqVar) {
        super(context);
        this.uef = context;
        this.f24878oa = lwVar;
        this.yo = xsVar;
        this.dj = zjmVar;
        this.wrv = cqVar;
        xs();
    }

    private void uef(ViewGroup viewGroup) {
        if (this.moa == null) {
            return;
        }
        String str = this.ivm;
        str.getClass();
        switch (str) {
            case "0":
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.lw(this, this.cz);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.yo.hts() || TextUtils.isEmpty(this.yo.vyg())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.ivm(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.oa(this, this);
                break;
            case "5":
                if (this.yo.hts() && !TextUtils.isEmpty(this.yo.vyg())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(this.yo.vyg()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.yo(this);
                this.moa.setTag(2);
                break;
            case "8":
            case "11":
                this.f24878oa.setClipChildren(false);
                this.f24878oa.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.f24878oa.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.ivm(this);
                break;
            case "9":
            case "17":
                this.moa.setTag(2);
                break;
            case "10":
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.moa(this, this.cz, this.zjm);
                break;
            case "12":
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.yo(this);
                this.moa.setTag(2);
                break;
            case "13":
            case "24":
                if (this.ivm.equals("24") && com.bytedance.sdk.component.adexpress.moa.oa()) {
                    this.f24878oa.setClipChildren(false);
                    this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.ivm(this);
                    break;
                } else {
                    this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.lw(this, this.cz);
                    break;
                }
                break;
            case "14":
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.oa(this, this);
                break;
            case "16":
                View view = this.moa;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.ivm.sy) && ((com.bytedance.sdk.component.adexpress.ivm.sy) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.ivm.sy) this.moa).getShakeLayout().setTag(2);
                }
                this.moa.setTag(2);
                break;
            case "18":
                View view2 = this.moa;
                if (view2 != null && (view2 instanceof rt) && ((rt) view2).getWriggleLayout() != null) {
                    ((rt) this.moa).getWriggleLayout().setTag(2);
                }
                this.moa.setTag(2);
                break;
            case "20":
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.uef(this, this.cz, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                    this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.bcc(this, this.zjm);
                    break;
                } else {
                    this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.xs(this, this.cz, viewGroup);
                    break;
                }
            case "23":
                if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                    this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.ivm(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                    this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.bcc(this, this.zjm);
                    break;
                }
                break;
            case "29":
                View view3 = this.moa;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.ivm.ivm) && ((com.bytedance.sdk.component.adexpress.ivm.ivm) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.ivm.ivm) this.moa).getShakeView().setTag(2);
                }
                this.bcc = new com.bytedance.sdk.component.adexpress.dynamic.yo.uef.lw(this, this.cz);
                break;
        }
        View.OnTouchListener onTouchListener = this.bcc;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (bcc()) {
            this.moa.setTag(2);
            setOnClickListener((View.OnClickListener) this.f24878oa.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.bcc
    public void uef() {
        if (TextUtils.equals(this.ivm, "6")) {
            com.bytedance.sdk.component.adexpress.ivm.bs bsVar = this.xs;
            if (bsVar != null) {
                bsVar.yo();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.yo.cz.2
                    @Override // java.lang.Runnable
                    public void run() {
                        cz.this.cz();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.ivm, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.yo.cz.3
                @Override // java.lang.Runnable
                public void run() {
                    cz.this.cz();
                }
            }, 400L);
        } else {
            cz();
        }
    }
}
