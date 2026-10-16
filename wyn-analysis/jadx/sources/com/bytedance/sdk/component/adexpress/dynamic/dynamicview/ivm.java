package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import A0.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm extends lw {
    private static String dhk = "";

    /* renamed from: oa, reason: collision with root package name */
    private Runnable f24816oa;
    protected com.bytedance.sdk.component.adexpress.dynamic.yo.cz oib;
    private volatile boolean tpx;
    private Runnable uef;

    public static class oa implements com.bytedance.sdk.component.lw.ab {

        /* renamed from: oa, reason: collision with root package name */
        private final WeakReference<lw> f24819oa;
        private final WeakReference<View> uef;

        public oa(View view, lw lwVar) {
            this.uef = new WeakReference<>(view);
            this.f24819oa = new WeakReference<>(lwVar);
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(int i5, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(com.bytedance.sdk.component.lw.dj djVar) {
            Object objOa;
            lw lwVar;
            Bitmap bitmapYo;
            View view = this.uef.get();
            if (view == null || (objOa = djVar.oa()) == null || djVar.yo() == null || (lwVar = this.f24819oa.get()) == null || !(objOa instanceof Bitmap) || (bitmapYo = ivm.yo((Bitmap) objOa)) == null) {
                return;
            }
            view.setBackground(lwVar.uef(bitmapYo));
        }
    }

    public static class uef implements com.bytedance.sdk.component.lw.ab {

        /* renamed from: oa, reason: collision with root package name */
        private final WeakReference<DynamicRootView> f24820oa;
        private final WeakReference<View> uef;
        private final com.bytedance.sdk.component.adexpress.dynamic.moa.bcc yo;

        public uef(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
            this.uef = new WeakReference<>(view);
            this.f24820oa = new WeakReference<>(dynamicRootView);
            this.yo = bccVar;
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(int i5, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(com.bytedance.sdk.component.lw.dj djVar) {
            Drawable bitmapDrawable;
            View view = this.uef.get();
            Object objOa = djVar.oa();
            if (objOa instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objOa);
            } else if (objOa instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawable = (Drawable) objOa;
                    if (j.x(drawable)) {
                        j.j(drawable).start();
                    }
                }
                bitmapDrawable = (Drawable) objOa;
            } else {
                bitmapDrawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.moa.oa()) {
                DynamicRootView dynamicRootView = this.f24820oa.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().moa()) || "splash_ad".equals(dynamicRootView.getRenderRequest().moa())) {
                    view.setBackground(bitmapDrawable);
                    return;
                } else {
                    view.setBackground(bitmapDrawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(bitmapDrawable);
            com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar = this.yo;
            if (bccVar == null || bccVar.zjm() == null || 6 != this.yo.zjm().uef() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    public static class yo implements com.bytedance.sdk.component.lw.bcc {

        /* renamed from: oa, reason: collision with root package name */
        private final int f24821oa;
        private final WeakReference<Context> uef;

        public yo(Context context, int i5) {
            this.uef = new WeakReference<>(context);
            this.f24821oa = i5;
        }

        @Override // com.bytedance.sdk.component.lw.bcc
        public Bitmap uef(Bitmap bitmap) {
            Context context = this.uef.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.moa.uef.uef(context, bitmap, this.f24821oa);
            }
            return null;
        }
    }

    public ivm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.tpx = true;
        setTag(Integer.valueOf(getClickArea()));
        String strOa = bccVar.zjm().oa();
        if ("logo-union".equals(strOa)) {
            dynamicRootView.setLogoUnionHeight(this.bcc - ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, this.wrv.uef() + this.wrv.oa())));
        } else if ("scoreCountWithIcon".equals(strOa)) {
            dynamicRootView.setScoreCountWithIcon(this.bcc - ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, this.wrv.uef() + this.wrv.oa())));
        }
    }

    private static String getBuildModel() {
        try {
            dhk = com.bytedance.sdk.component.utils.rt.uef();
        } catch (Throwable unused) {
            dhk = Build.MODEL;
        }
        if (TextUtils.isEmpty(dhk)) {
            dhk = Build.MODEL;
        }
        return dhk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap yo(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            return (Build.VERSION.SDK_INT < 26 || bitmap.getConfig() != Bitmap.Config.HARDWARE) ? bitmap : bitmap.copy(Bitmap.Config.ARGB_8888, false);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    public boolean cz() {
        int iAb;
        int iBs;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        final View view = this.wk;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.cq.uef(this.wrv.ue()));
        String strNe = this.wrv.ne();
        String strGsd = null;
        String strUef = (TextUtils.isEmpty(strNe) || (dynamicRootView = this.dz) == null || dynamicRootView.getRenderRequest() == null || this.dz.getRenderRequest().yo() == null || (jSONObjectOptJSONObject = this.dz.getRenderRequest().yo().optJSONObject("creative")) == null) ? null : uef(jSONObjectOptJSONObject.opt(strNe));
        if (TextUtils.isEmpty(strUef)) {
            strUef = this.wrv.tpx();
        }
        com.bytedance.sdk.component.adexpress.uef.uef.yo yoVarYo = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo();
        if (yoVarYo != null) {
            iAb = yoVarYo.ab();
            iBs = yoVarYo.bs();
        } else {
            iAb = 0;
            iBs = 0;
        }
        if (this.wrv.dhk()) {
            int iOib = this.wrv.oib();
            String str = this.wrv.f24868oa;
            com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().lw().uef(str).uef(this.xs).oa(this.bcc).moa(iAb).lw(iBs).uef(oa(str)).yo(2).uef(new yo(this.dj, iOib)).uef(new oa(view, this));
        } else if (!TextUtils.isEmpty(strUef)) {
            if (!strUef.startsWith("http:") && !strUef.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.dz;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    strGsd = this.dz.getRenderRequest().gsd();
                }
                strUef = com.bytedance.sdk.component.adexpress.dynamic.lw.cz.oa(strUef, strGsd);
            }
            com.bytedance.sdk.component.lw.zjm zjmVarYo = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().lw().uef(strUef).uef(this.xs).oa(this.bcc).moa(iAb).lw(iBs).uef(oa(strUef)).yo(1);
            uef(zjmVarYo);
            zjmVarYo.uef(new uef(view, this.dz, this.cq));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.wrv.cp() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ivm.this.wrv.oyt() > 0) {
                            ivm ivmVar = ivm.this;
                            Drawable drawableYo = ivmVar.yo(ivmVar.dz.getBgMaterialCenterCalcColor().get(Integer.valueOf(ivm.this.wrv.oyt())));
                            if (drawableYo == null) {
                                ivm ivmVar2 = ivm.this;
                                drawableYo = ivmVar2.uef(true, ivmVar2.dz.getBgMaterialCenterCalcColor().get(Integer.valueOf(ivm.this.wrv.oyt())));
                            }
                            if (drawableYo != null) {
                                view.setBackground(drawableYo);
                                return;
                            }
                            View view2 = view;
                            ivm ivmVar3 = ivm.this;
                            view2.setBackground(ivmVar3.uef(true, ivmVar3.dz.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.wrv.cp() * 1000.0d));
        }
        View view2 = this.wk;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.yo()), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.oa()), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.moa()), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.uef()));
        }
        if (this.f24822ab || this.wrv.dz() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.xs, this.bcc);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.wk;
        if (view == null) {
            view = this;
        }
        double dDhk = this.cq.zjm().lw().dhk();
        if (dDhk < 90.0d && dDhk > 0.0d) {
            com.bytedance.sdk.component.utils.cz.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm.2
                @Override // java.lang.Runnable
                public void run() {
                    ivm.this.setVisibility(8);
                }
            }, (long) (dDhk * 1000.0d));
        }
        uef(this.cq.zjm().lw().oib(), view);
        if (!TextUtils.isEmpty(this.wrv.rl())) {
            uef();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.uef);
            removeCallbacks(this.f24816oa);
        } catch (Exception unused) {
        }
    }

    private String oa(String str) {
        try {
            Map<String, String> mapDj = this.dz.getRenderRequest().dj();
            if (mapDj != null && mapDj.size() > 0) {
                return mapDj.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private String uef(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return uef(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return uef((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable yo(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                if (jSONArray.getString(i5).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i5));
                } else if (jSONArray.getString(i5).endsWith("deg")) {
                    string = jSONArray.getString(i5);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = com.bytedance.sdk.component.adexpress.dynamic.moa.xs.uef(((String) arrayList.get(i10)).substring(0, 7));
            }
            GradientDrawable gradientDrawableUef = uef(uef(string), iArr);
            gradientDrawableUef.setShape(0);
            gradientDrawableUef.setCornerRadius(com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.wk()));
            return gradientDrawableUef;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void uef(com.bytedance.sdk.component.lw.zjm zjmVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            zjmVar.uef(Bitmap.Config.ARGB_8888);
        }
    }

    private void uef(double d3, final View view) {
        if (d3 > 0.0d) {
            com.bytedance.sdk.component.utils.cz.oa().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm.3
                @Override // java.lang.Runnable
                public void run() {
                    if (ivm.this.cq.zjm().lw().syr() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    ivm.this.setVisibility(0);
                }
            }, (long) (d3 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            if (viewGroup.getChildAt(i5) instanceof com.bytedance.sdk.component.adexpress.dynamic.yo.cz) {
                viewGroup.removeViewAt(i5);
            }
        }
    }

    private void uef() {
        if (this.tpx) {
            int iDor = this.wrv.dor();
            int iEtd = this.wrv.etd();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm.4
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = ivm.this.dz;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        ivm ivmVar = ivm.this;
                        ivm ivmVar2 = ivm.this;
                        ivmVar.oib = new com.bytedance.sdk.component.adexpress.dynamic.yo.cz(ivmVar2.dj, ivmVar2, ivmVar2.wrv);
                    } else {
                        com.bytedance.sdk.component.adexpress.oa.cq renderRequest = ivm.this.dz.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.moa.zjm zjmVar = new com.bytedance.sdk.component.adexpress.dynamic.moa.zjm();
                        zjmVar.uef(renderRequest.wk());
                        zjmVar.oa(renderRequest.ab());
                        zjmVar.yo(renderRequest.bs());
                        zjmVar.uef(renderRequest.sy());
                        zjmVar.oa(renderRequest.oib());
                        zjmVar.yo(renderRequest.dhk());
                        zjmVar.moa(renderRequest.tpx());
                        zjmVar.lw(renderRequest.orq());
                        ivm ivmVar3 = ivm.this;
                        ivm ivmVar4 = ivm.this;
                        ivmVar3.oib = new com.bytedance.sdk.component.adexpress.dynamic.yo.cz(ivmVar4.dj, ivmVar4, ivmVar4.wrv, zjmVar, renderRequest);
                    }
                    ivm ivmVar5 = ivm.this;
                    ivmVar5.oa(ivmVar5.oib);
                    if (ivm.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ivm.this.getParent()).setClipChildren(false);
                    }
                    ivm.this.setClipChildren(false);
                    ivm.this.oib.setTag(2);
                    ivm ivmVar6 = ivm.this;
                    ivmVar6.uef((ViewGroup) ivmVar6);
                    ivm ivmVar7 = ivm.this;
                    ivmVar7.addView(ivmVar7.oib, new FrameLayout.LayoutParams(-1, -1));
                    ivm.this.oib.yo();
                }
            };
            this.uef = runnable;
            postDelayed(runnable, iDor * 1000);
            if (this.wrv.uqx() || iEtd >= Integer.MAX_VALUE || iDor >= iEtd) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm.5
                @Override // java.lang.Runnable
                public void run() {
                    ivm ivmVar = ivm.this;
                    if (ivmVar.oib != null) {
                        ivmVar.tpx = false;
                        ivm.this.oib.moa();
                        ivm.this.oib.setVisibility(4);
                        ivm ivmVar2 = ivm.this;
                        ivmVar2.removeView(ivmVar2.oib);
                    }
                }
            };
            this.f24816oa = runnable2;
            postDelayed(runnable2, iEtd * 1000);
        }
    }
}
