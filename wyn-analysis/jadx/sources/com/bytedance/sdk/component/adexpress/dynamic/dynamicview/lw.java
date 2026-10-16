package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class lw extends FrameLayout implements IAnimation, lz, oyt {

    /* renamed from: ab, reason: collision with root package name */
    protected boolean f24822ab;
    protected int bcc;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.uef.oa bs;
    protected com.bytedance.sdk.component.adexpress.dynamic.moa.bcc cq;
    protected int cz;
    private float dhk;
    protected Context dj;
    protected DynamicRootView dz;
    protected float ivm;
    protected float lw;
    protected float moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24823oa;
    private float oib;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.yo sy;
    private com.bytedance.sdk.component.utils.gsd tpx;
    private float uef;
    protected View wk;
    protected com.bytedance.sdk.component.adexpress.dynamic.moa.xs wrv;
    protected int xs;
    protected float yo;
    protected int zjm;
    private static final View.OnTouchListener orq = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener gzw = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public lw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context);
        this.dj = context;
        this.dz = dynamicRootView;
        this.cq = bccVar;
        this.yo = bccVar.ivm();
        this.moa = bccVar.xs();
        this.lw = bccVar.bcc();
        this.ivm = bccVar.cz();
        this.cz = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.yo);
        this.zjm = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.moa);
        this.xs = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.lw);
        this.bcc = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.ivm);
        com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar = new com.bytedance.sdk.component.adexpress.dynamic.moa.xs(bccVar.zjm());
        this.wrv = xsVar;
        if (xsVar.sy() > 0) {
            this.xs = (this.wrv.sy() * 2) + this.xs;
            this.bcc = (this.wrv.sy() * 2) + this.bcc;
            this.cz -= this.wrv.sy();
            this.zjm -= this.wrv.sy();
            List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> listDj = bccVar.dj();
            if (listDj != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar2 : listDj) {
                    bccVar2.yo(bccVar2.ivm() + com.bytedance.sdk.component.adexpress.moa.xs.oa(this.dj, this.wrv.sy()));
                    bccVar2.moa(bccVar2.xs() + com.bytedance.sdk.component.adexpress.moa.xs.oa(this.dj, this.wrv.sy()));
                    bccVar2.uef(com.bytedance.sdk.component.adexpress.moa.xs.oa(this.dj, this.wrv.sy()));
                    bccVar2.oa(com.bytedance.sdk.component.adexpress.moa.xs.oa(this.dj, this.wrv.sy()));
                }
            }
        }
        this.f24822ab = this.wrv.dz() > 0.0d;
        this.sy = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.yo();
    }

    public boolean bcc() {
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar = this.cq;
        return bccVar == null || bccVar.zjm() == null || this.cq.zjm().lw() == null || this.cq.zjm().lw().syr() == null;
    }

    public Drawable getBackgroundDrawable() {
        return uef(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.f24822ab;
    }

    public int getClickArea() {
        return this.wrv.ue();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ivm.uef getDynamicClickListener() {
        return this.dz.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.bcc;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.moa.ivm getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.moa.lw lwVarZjm;
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar = this.cq;
        if (bccVar == null || (lwVarZjm = bccVar.zjm()) == null) {
            return null;
        }
        return lwVarZjm.lw();
    }

    public int getDynamicWidth() {
        return this.xs;
    }

    public String getImageObjectFit() {
        return this.wrv.dv();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.oib;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(uef(oa(this.wrv.km().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f24823oa;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.dhk;
    }

    public void ivm() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xs, this.bcc);
        layoutParams.topMargin = this.zjm;
        int i5 = this.cz;
        layoutParams.leftMargin = i5;
        layoutParams.setMarginStart(i5);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean lw() {
        com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar = this.wrv;
        return (xsVar == null || xsVar.ue() == 0) ? false : true;
    }

    public boolean moa() throws JSONException {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.wk;
        if (view == null) {
            view = this;
        }
        if (lw()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = orq;
            onClickListener = gzw;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int iUef = com.bytedance.sdk.component.adexpress.dynamic.oa.uef.uef(this.wrv);
            if (iUef == 2 || iUef == 3) {
                view.setOnClickListener(gzw);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        uef(view);
        oa(view);
        return true;
    }

    public void oa(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVarLw;
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar = this.cq;
        if (bccVar == null || (ivmVarLw = bccVar.zjm().lw()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(ivmVarLw.cc()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xs();
        uef();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        oa();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.sy.uef(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.yo yoVar = this.sy;
        View view = this.wk;
        if (view == null) {
            view = this;
        }
        yoVar.uef(view, i5, i10);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.oib = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.uef = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.f24823oa = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z2) {
        this.f24822ab = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.dhk = f10;
        this.sy.uef(this, f10);
    }

    public void uef(int i5) {
        com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar = this.wrv;
        if (xsVar != null && xsVar.uef(i5)) {
            cz();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != null && (getChildAt(i10) instanceof lw)) {
                    ((lw) childAt).uef(i5);
                }
            }
        }
    }

    public void xs() {
        if (bcc()) {
            return;
        }
        View view = this.wk;
        if (view == null) {
            view = this;
        }
        this.bs = new com.bytedance.sdk.component.adexpress.dynamic.animation.uef.oa(view, this.cq.zjm().lw().syr());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.uef.oa oaVar = lw.this.bs;
                if (oaVar != null) {
                    oaVar.uef();
                }
            }
        });
    }

    public boolean yo() {
        cz();
        ivm();
        moa();
        return true;
    }

    private List<String> oa(String str) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        boolean z2 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '(') {
                i5++;
                z2 = true;
            } else if (str.charAt(i11) == ')' && i5 - 1 == 0 && z2) {
                int i12 = i11 + 1;
                arrayList.add(str.substring(i10, i12));
                i10 = i12;
                z2 = false;
            }
        }
        return arrayList;
    }

    public void uef(View view) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.cq.bcc());
            jSONObject.put("height", this.cq.cz());
            if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.uef.dhk, this.wrv.pu());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.uef.tpx, this.cq.zjm().oa());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.uef.orq, this.cq.yo());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.uef.gzw, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.wrv.pu());
            view.setTag(2097610715, this.cq.zjm().oa());
            view.setTag(2097610714, this.cq.yo());
            view.setTag(2097610713, jSONObject.toString());
            int iUef = com.bytedance.sdk.component.adexpress.dynamic.oa.uef.uef(this.wrv);
            if (iUef == 1) {
                view.setTag(2097610707, new Pair(this.wrv.rt(), Long.valueOf(this.wrv.gr())));
                view.setTag(2097610708, Integer.valueOf(iUef));
            }
        } catch (JSONException unused) {
        }
    }

    public void oa() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.uef.oa oaVar = this.bs;
        if (oaVar != null) {
            oaVar.oa();
        }
    }

    public Drawable uef(boolean z2, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iPz;
        if (!TextUtils.isEmpty(this.wrv.km())) {
            try {
                String strKm = this.wrv.km();
                String strSubstring = strKm.substring(strKm.indexOf("(") + 1, strKm.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d3 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d3 > 225.0d && d3 < 315.0d) {
                        int i5 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i5;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableUef = uef(uef(strArrSplit[0]), iArr);
                gradientDrawableUef.setShape(0);
                gradientDrawableUef.setCornerRadius(com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.wk()));
                return gradientDrawableUef;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fUef = com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.wk());
        drawable.setCornerRadius(fUef);
        if (fUef < 1.0f) {
            float fUef2 = com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.ku());
            float fUef3 = com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.fz());
            float fUef4 = com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.dxx());
            float fUef5 = com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.lz());
            float[] fArr = new float[8];
            if (fUef2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[0] = fUef2;
                fArr[1] = fUef2;
            }
            if (fUef3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[2] = fUef3;
                fArr[3] = fUef3;
            }
            if (fUef4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[4] = fUef4;
                fArr[5] = fUef4;
            }
            if (fUef5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[6] = fUef5;
                fArr[7] = fUef5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z2) {
            iPz = Color.parseColor(str);
        } else {
            iPz = this.wrv.pz();
        }
        drawable.setColor(iPz);
        if (this.wrv.bs() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.bs()), this.wrv.ab());
        } else if (this.wrv.sy() > 0) {
            drawable.setStroke(this.wrv.sy(), this.wrv.ab());
            drawable.setAlpha(50);
            if (AbstractC1593a.z(this.cq, "video-vd")) {
                setLayerType(1, null);
                return new oib((int) fUef, this.wrv.sy());
            }
        }
        return drawable;
    }

    public oa uef(Bitmap bitmap) {
        return new uef(bitmap, null);
    }

    private Drawable[] uef(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str = list.get(i5);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    iArr[i10] = com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(strArrSplit[i11].substring(0, 7));
                    i10 = i11;
                }
                GradientDrawable gradientDrawableUef = uef(uef(strArrSplit[0]), iArr);
                gradientDrawableUef.setShape(0);
                gradientDrawableUef.setCornerRadius(com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.wk()));
                drawableArr[(list.size() - 1) - i5] = gradientDrawableUef;
            }
        }
        return drawableArr;
    }

    public GradientDrawable uef(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation uef(String str) {
        try {
            int i5 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i5 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i5 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i5 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void uef() {
        if (isShown()) {
            int iUef = com.bytedance.sdk.component.adexpress.dynamic.oa.uef.uef(this.wrv);
            if (iUef == 2) {
                if (this.tpx == null) {
                    this.tpx = new com.bytedance.sdk.component.utils.gsd(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw.4
                };
                com.bytedance.sdk.component.adexpress.oa.cq renderRequest = this.dz.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.wk();
                    renderRequest.tpx();
                    renderRequest.oib();
                    return;
                }
                return;
            }
            if (iUef == 3) {
                if (this.tpx == null) {
                    this.tpx = new com.bytedance.sdk.component.utils.gsd(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw.5
                };
                com.bytedance.sdk.component.adexpress.oa.cq renderRequest2 = this.dz.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.bs();
                    renderRequest2.orq();
                    renderRequest2.sy();
                    renderRequest2.dhk();
                }
            }
        }
    }
}
