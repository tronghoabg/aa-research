package com.bytedance.sdk.openadsdk.uef.oa;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.sy;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.core.zjm.cz;
import com.bytedance.sdk.openadsdk.core.zjm.dhk;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.core.zjm.zjm;
import com.bytedance.sdk.openadsdk.utils.af;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public class uef {
    private PAGMediaView bcc;
    private boolean cq = false;
    private tpx cz;
    private com.bytedance.sdk.openadsdk.core.yo.uef dj;
    private WeakReference<com.bytedance.sdk.openadsdk.core.dz.ivm> dz;
    private oa ivm;
    private WeakReference<com.bytedance.sdk.openadsdk.core.wk.oa.ivm> lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Context f26114oa;
    protected final gzw uef;
    private com.bytedance.sdk.openadsdk.core.yo.oa wrv;
    private com.bytedance.sdk.openadsdk.uef.oa.uef.yo xs;
    private final String yo;
    private PAGMediaView zjm;

    public uef(Context context, gzw gzwVar, String str) {
        this.f26114oa = context;
        this.uef = gzwVar;
        this.yo = str;
    }

    private PAGMediaView dz() {
        if (!gzw.lw(this.uef)) {
            com.bytedance.sdk.openadsdk.uef.oa.uef.yo yoVar = this.xs;
            if (yoVar == null) {
                return null;
            }
            tpx tpxVarMoa = yoVar.moa();
            tpxVarMoa.setTag(520093762, Boolean.TRUE);
            if (!this.cq) {
                this.xs.lw();
            }
            this.cq = true;
            return uef(tpxVarMoa);
        }
        com.bytedance.sdk.openadsdk.uef.oa.uef.yo yoVar2 = this.xs;
        if (yoVar2 == null || !(yoVar2 instanceof com.bytedance.sdk.openadsdk.uef.oa.uef.oa)) {
            return null;
        }
        dhk dhkVar = (dhk) yoVar2.moa();
        dhkVar.setTag(520093762, Boolean.TRUE);
        if (!this.cq) {
            this.xs.lw();
        }
        this.cq = true;
        return uef(dhkVar);
    }

    public PAGMediaView bcc() {
        return this.zjm;
    }

    public void cq() {
        com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.dz.ivm> weakReference = this.dz;
        if (weakReference == null || (ivmVar = weakReference.get()) == null) {
            return;
        }
        ivmVar.uef(13);
    }

    public PAGMediaView cz() {
        if (!gzw.lw(this.uef)) {
            List<sy> listLpy = this.uef.lpy();
            if (listLpy == null || listLpy.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.f26114oa);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            sy syVar = listLpy.get(0);
            if (syVar != null) {
                com.bytedance.sdk.openadsdk.zjm.moa.uef(syVar).yo(1).uef(com.bytedance.sdk.openadsdk.zjm.yo.uef(this.uef, syVar.uef(), imageView));
            }
            PAGMediaView pAGMediaViewUef = uef(imageView);
            if (this.dj == null || !dj.oa().moa(String.valueOf(this.uef.jnk()))) {
                pAGMediaViewUef.setOnClickListener(null);
                pAGMediaViewUef.setOnTouchListener(null);
            } else {
                pAGMediaViewUef.setOnClickListener(this.dj);
                pAGMediaViewUef.setOnTouchListener(this.dj);
            }
            pAGMediaViewUef.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.bcc;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.bcc.setOnTouchListener(null);
            }
            this.bcc = pAGMediaViewUef;
            return pAGMediaViewUef;
        }
        oa oaVar = this.ivm;
        if (oaVar == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewLw = oaVar.lw();
        if (viewLw == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewLw.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewLw.getParent()).removeView(viewLw);
        }
        PAGMediaView pAGMediaView2 = this.bcc;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.bcc.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.f26114oa, viewLw, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.dj == null || !dj.oa().moa(String.valueOf(this.uef.jnk()))) {
            com.bytedance.sdk.openadsdk.core.yo.yo yoVar = new com.bytedance.sdk.openadsdk.core.yo.yo() { // from class: com.bytedance.sdk.openadsdk.uef.oa.uef.2
                @Override // com.bytedance.sdk.openadsdk.core.yo.yo
                public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(yoVar);
            pAGVideoMediaView.setOnTouchListener(yoVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.dj);
            pAGVideoMediaView.setOnTouchListener(this.dj);
        }
        this.bcc = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    public View dj() {
        gzw gzwVar;
        if (com.bytedance.sdk.openadsdk.core.sy.uef() == null || (gzwVar = this.uef) == null || !gzwVar.ebe() || !this.uef.gzw()) {
            return null;
        }
        ImageView imageView = new ImageView(com.bytedance.sdk.openadsdk.core.sy.uef());
        com.bytedance.sdk.openadsdk.dhk.oa.oa().uef((int) af.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), 14.0f, true), imageView, this.uef);
        return imageView;
    }

    public String ivm() {
        gzw gzwVar = this.uef;
        if (gzwVar != null) {
            return gzwVar.kik();
        }
        return null;
    }

    public String lw() {
        gzw gzwVar = this.uef;
        if (gzwVar != null) {
            return oa(gzwVar);
        }
        return null;
    }

    public String moa() {
        gzw gzwVar = this.uef;
        if (gzwVar != null) {
            return uef(gzwVar);
        }
        return null;
    }

    public tpx oa() {
        return this.cz;
    }

    public void uef(oa oaVar) {
        this.ivm = oaVar;
    }

    public void wrv() {
        Context context = this.f26114oa;
        if (context != null) {
            TTWebsiteActivity.uef(context, this.uef, this.yo);
        }
    }

    public PAGMediaView xs() {
        PAGMediaView pAGMediaViewCz;
        com.bytedance.sdk.openadsdk.utils.oa.uef(this.uef);
        if (this.uef.ggp() == 2) {
            pAGMediaViewCz = dz();
            uef(pAGMediaViewCz);
        } else {
            pAGMediaViewCz = cz();
        }
        if (pAGMediaViewCz != null) {
            pAGMediaViewCz.setMrcTrackerKey(com.bytedance.sdk.openadsdk.gsd.oa.lw.oa(this.uef));
        } else {
            pAGMediaViewCz = new PAGMediaView(this.f26114oa) { // from class: com.bytedance.sdk.openadsdk.uef.oa.uef.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.moa.uef(this, uef.this.uef);
                }
            };
        }
        if (pAGMediaViewCz instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewCz).setMaterialMeta(this.uef);
        }
        this.zjm = pAGMediaViewCz;
        return pAGMediaViewCz;
    }

    public PAGImageItem yo() {
        gzw gzwVar = this.uef;
        if (gzwVar == null || gzwVar.ifk() == null) {
            return null;
        }
        return new PAGImageItem(this.uef.ifk().yo(), this.uef.ifk().oa(), this.uef.ifk().uef(), (float) this.uef.ifk().moa());
    }

    public View zjm() {
        if (com.bytedance.sdk.openadsdk.core.sy.uef() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(com.bytedance.sdk.openadsdk.core.sy.uef()) { // from class: com.bytedance.sdk.openadsdk.uef.oa.uef.4
            int uef = 0;

            /* renamed from: oa, reason: collision with root package name */
            int f26117oa = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
                super.onLayout(z2, i5, i10, i11, i12);
                try {
                    Object parent = getParent();
                    if (parent == null || this.uef == 0 || this.f26117oa == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i13 = this.uef;
                    if (width < i13 || height < this.f26117oa) {
                        float fMin = Math.min(height / this.f26117oa, width / i13);
                        int i14 = (width - this.uef) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i14);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public void onMeasure(int i5, int i10) {
                if (this.uef == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i10);
                    this.uef = getMeasuredWidth();
                    this.f26117oa = this.containerHeight;
                }
                setMeasuredDimension(this.uef, this.f26117oa);
            }
        };
        pAGLogoView.initData(this.uef);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.uef.oa.uef.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                uef.this.wrv();
            }
        });
        return pAGLogoView;
    }

    private String oa(gzw gzwVar) {
        return !TextUtils.isEmpty(gzwVar.xw()) ? gzwVar.xw() : !TextUtils.isEmpty(gzwVar.az()) ? gzwVar.az() : "";
    }

    public void uef(com.bytedance.sdk.openadsdk.uef.oa.uef.yo yoVar) {
        this.xs = yoVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar) {
        this.lw = new WeakReference<>(ivmVar);
    }

    public void uef(boolean z2) {
        this.moa = z2;
    }

    public PAGMediaView uef() {
        return this.bcc;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.uef uefVar) {
        this.dj = uefVar;
    }

    private yo oa(final PAGVideoAdListener pAGVideoAdListener) {
        return new yo() { // from class: com.bytedance.sdk.openadsdk.uef.oa.uef.6
            @Override // com.bytedance.sdk.openadsdk.uef.oa.yo
            public void oa(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.uef.oa.yo
            public void uef(int i5, int i10) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.uef.oa.yo
            public void yo(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.uef.oa.yo
            public void uef(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    private String uef(gzw gzwVar) {
        if (gzwVar.no() != null && !TextUtils.isEmpty(gzwVar.no().oa())) {
            return gzwVar.no().oa();
        }
        if (!TextUtils.isEmpty(gzwVar.jp())) {
            return gzwVar.jp();
        }
        if (!TextUtils.isEmpty(gzwVar.xw())) {
            return gzwVar.xw();
        }
        return "";
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.oa oaVar) {
        this.wrv = oaVar;
    }

    private void uef(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView uef(final View view) {
        int i5;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        tpx tpxVar = this.cz;
        if (tpxVar != null) {
            tpxVar.setClickListener(null);
            this.cz.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.yo.oa oaVar = this.wrv;
        if (oaVar != null && (oaVar instanceof zjm) && (view instanceof tpx)) {
            ((tpx) view).setClickListener((zjm) oaVar);
        }
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar = this.dj;
        if (uefVar != null && (uefVar instanceof cz) && (view instanceof tpx)) {
            ((tpx) view).setClickCreativeListener((cz) uefVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.f26114oa) { // from class: com.bytedance.sdk.openadsdk.uef.oa.uef.3
            private void uef(boolean z2) {
                Integer num = this.uef;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(num), z2 ? 4 : 8);
                }
                gzw gzwVar = uef.this.uef;
                if (gzwVar != null) {
                    com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(gzwVar, z2);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.moa.uef(this, uef.this.uef);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z2) {
                super.onWindowFocusChanged(z2);
                if (view instanceof tpx) {
                    return;
                }
                uef(z2);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                uef.this.uef(pAGVideoAdListener);
            }
        };
        int i10 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.width;
            i5 = layoutParams.height;
        } else {
            i5 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i5);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof tpx) {
            this.cz = (tpx) view;
        }
        return pAGMediaView;
    }

    public void uef(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.uef.oa.uef.yo yoVar;
        if (this.uef.ggp() == 2 && gzw.lw(this.uef) && (yoVar = this.xs) != null && (yoVar instanceof com.bytedance.sdk.openadsdk.uef.oa.uef.oa)) {
            dhk dhkVar = (dhk) yoVar.moa();
            if (dhkVar != null) {
                dhkVar.setVideoAdListener(oa(pAGVideoAdListener));
                return;
            }
            return;
        }
        oa oaVar = this.ivm;
        if (oaVar != null) {
            oaVar.uef(oa(pAGVideoAdListener));
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.dz.ivm ivmVar) {
        this.dz = new WeakReference<>(ivmVar);
    }
}
