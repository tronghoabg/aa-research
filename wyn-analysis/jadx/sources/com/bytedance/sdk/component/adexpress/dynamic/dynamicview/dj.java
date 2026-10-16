package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import A0.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dj extends ivm {
    private String uef;

    public static class oa implements com.bytedance.sdk.component.lw.ab {

        /* renamed from: oa, reason: collision with root package name */
        private Resources f24810oa;
        private WeakReference<View> uef;

        public oa(View view, Resources resources) {
            this.uef = new WeakReference<>(view);
            this.f24810oa = resources;
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(int i5, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(com.bytedance.sdk.component.lw.dj djVar) {
            Object objOa;
            View view = this.uef.get();
            if (view == null || (objOa = djVar.oa()) == null || djVar.yo() == null) {
                return;
            }
            if (objOa instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.f24810oa, (Bitmap) objOa));
            } else if (objOa instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && j.B(objOa)) {
                    j.k(objOa).start();
                }
                view.setBackground((Drawable) objOa);
            }
        }
    }

    public static class uef implements com.bytedance.sdk.component.lw.bcc {
        private final WeakReference<Context> uef;

        public uef(Context context) {
            this.uef = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.lw.bcc
        public Bitmap uef(Bitmap bitmap) {
            Context context = this.uef.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.moa.uef.uef(context, bitmap, 25);
            }
            return null;
        }
    }

    public dj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        if (!TextUtils.isEmpty(this.wrv.jkf()) && bccVar.oib()) {
            com.bytedance.sdk.component.adexpress.ivm.zjm zjmVar = new com.bytedance.sdk.component.adexpress.ivm.zjm(context);
            zjmVar.setAnimationsLoop(this.wrv.ggp());
            zjmVar.setImageLottieTosPath(this.wrv.jkf());
            zjmVar.setLottieAppNameMaxLength(this.wrv.vj());
            zjmVar.setLottieAdTitleMaxLength(this.wrv.xvp());
            zjmVar.setLottieAdDescMaxLength(this.wrv.sw());
            zjmVar.setData(bccVar.dhk());
            this.wk = zjmVar;
        } else if (this.wrv.wk() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.sdk.component.adexpress.ivm.gsd gsdVar = new com.bytedance.sdk.component.adexpress.ivm.gsd(context);
            this.wk = gsdVar;
            gsdVar.setXRound((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, this.wrv.wk()));
            ((com.bytedance.sdk.component.adexpress.ivm.gsd) this.wk).setYRound((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, this.wrv.wk()));
        } else if (bcc() || !"arrowButton".equals(bccVar.zjm().oa())) {
            this.wk = new ImageView(context);
        } else {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.oa oaVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.oa(context);
            oaVar.setBrickNativeValue(this.wrv);
            this.wk = oaVar;
        }
        this.uef = getImageKey();
        this.wk.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(bccVar.zjm().oa())) {
            if (this.wrv.oa() > 0 || this.wrv.uef() > 0) {
                int iMin = Math.min(this.xs, this.bcc);
                this.xs = iMin;
                this.bcc = Math.min(iMin, this.bcc);
                this.cz = (int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(context, (this.wrv.uef() / 2) + this.wrv.oa() + 0.5f) + this.cz);
            } else {
                int iMax = Math.max(this.xs, this.bcc);
                this.xs = iMax;
                this.bcc = Math.max(iMax, this.bcc);
            }
            this.wrv.uef(this.xs / 2);
        }
        addView(this.wk, new FrameLayout.LayoutParams(this.xs, this.bcc));
    }

    private String getImageKey() {
        Map<String, String> mapDj = this.dz.getRenderRequest().dj();
        if (mapDj == null || mapDj.size() <= 0) {
            return null;
        }
        return mapDj.get(this.wrv.dj());
    }

    private boolean uef() {
        String strWrv = this.wrv.wrv();
        if (this.wrv.dhk()) {
            return true;
        }
        if (TextUtils.isEmpty(strWrv)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strWrv);
            return Math.abs((((float) this.xs) / (((float) this.bcc) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        int iBs;
        super.cz();
        if (!TextUtils.isEmpty(this.wrv.jkf())) {
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iAb = 0;
        if ("arrowButton".equals(this.cq.zjm().oa())) {
            ((ImageView) this.wk).setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.dj, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.wk).getDrawable() != null) {
                ((ImageView) this.wk).getDrawable().setAutoMirrored(true);
            }
            this.wk.setPadding(0, 0, 0, 0);
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.wk.setBackgroundColor(this.wrv.pz());
        String strYo = this.cq.zjm().yo();
        if ("user".equals(strYo)) {
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.wk).setColorFilter(this.wrv.xs());
            ((ImageView) this.wk).setImageDrawable(com.bytedance.sdk.component.utils.orq.yo(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.wk;
            int i5 = this.xs;
            imageView.setPadding(i5 / 10, this.bcc / 5, i5 / 10, 0);
        } else if (strYo != null && strYo.startsWith("@")) {
            try {
                ((ImageView) this.wk).setImageResource(Integer.parseInt(strYo.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.lw.wk wkVarLw = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().lw();
        String strDj = this.wrv.dj();
        if (!TextUtils.isEmpty(strDj) && !strDj.startsWith("http:") && !strDj.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.dz;
            strDj = com.bytedance.sdk.component.adexpress.dynamic.lw.cz.oa(strDj, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.dz.getRenderRequest().gsd());
        }
        com.bytedance.sdk.component.adexpress.uef.uef.yo yoVarYo = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo();
        if (yoVarYo != null) {
            iAb = yoVarYo.ab();
            iBs = yoVarYo.bs();
        } else {
            iBs = 0;
        }
        com.bytedance.sdk.component.lw.zjm zjmVarLw = wkVarLw.uef(strDj).uef(this.uef).uef(this.xs).oa(this.bcc).moa(iAb).lw(iBs);
        String strDz = this.dz.getRenderRequest().dz();
        if (!TextUtils.isEmpty(strDz)) {
            zjmVarLw.oa(strDz);
        }
        if (uef()) {
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.FIT_CENTER);
            zjmVarLw.uef(Bitmap.Config.ARGB_4444).yo(2).uef(new uef(this.dj)).uef(new oa(this.wk, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                zjmVarLw.yo(1).uef((ImageView) this.wk);
            }
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.wk instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.wk).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !j.x(drawable)) {
            return;
        }
        j.j(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.wk).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !j.x(drawable)) {
            return;
        }
        j.j(drawable).stop();
    }
}
