package com.bytedance.adsdk.ugeno.yoga.oa;

import Va.M6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.oa.uef;
import com.bytedance.adsdk.ugeno.uef;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.bytedance.adsdk.ugeno.yoga.cq;
import com.bytedance.adsdk.ugeno.yoga.dz;
import com.bytedance.adsdk.ugeno.yoga.ivm;
import com.bytedance.adsdk.ugeno.yoga.lw;
import com.bytedance.adsdk.ugeno.yoga.moa;
import com.bytedance.adsdk.ugeno.yoga.oa.yo;
import com.bytedance.adsdk.ugeno.yoga.zjm;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* loaded from: classes.dex */
public class uef extends com.bytedance.adsdk.ugeno.oa.uef<yo> {
    private ivm aje;
    private dz lo;
    private zjm nj;
    private lw qn;
    private com.bytedance.adsdk.ugeno.yoga.uef syr;

    /* renamed from: uf, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yoga.uef f24791uf;

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.oa.uef$uef, reason: collision with other inner class name */
    public static class C0049uef extends uef.C0043uef {
        private boolean af;
        public int cp;
        public int dxx;
        public int fz;
        private boolean gb;
        private boolean gem;
        public int gr;
        public int km;
        public float ku;
        public int lz;
        public int oyt;
        public float pu;
        public float pz;
        private boolean rl;
        private boolean sk;
        private boolean swd;

        /* renamed from: ue, reason: collision with root package name */
        public float f24794ue;

        public C0049uef(com.bytedance.adsdk.ugeno.oa.uef uefVar) {
            super(uefVar);
            this.gr = 1;
            this.f24794ue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.pz = 1.0f;
            this.cp = com.bytedance.adsdk.ugeno.yoga.uef.AUTO.uef();
            this.ku = -1.0f;
            this.fz = cq.RELATIVE.uef();
        }

        private void moa() {
            com.bytedance.adsdk.ugeno.oa.uef uefVar = this.rt;
            if (uefVar instanceof uef) {
                if (((uef) uefVar).dv() == lw.ROW && this.rt.km() == -2 && this.uef == -1.0f && !this.rt.gem()) {
                    this.uef = -2.0f;
                    this.pz = 1.0f;
                    this.f24794ue = 1.0f;
                    this.gb = true;
                    this.ku = -1.0f;
                }
                if (((uef) this.rt).dv() == lw.COLUMN && this.rt.pu() == -2 && this.f24749oa == -1.0f && !this.rt.gem()) {
                    this.f24749oa = -2.0f;
                    this.pz = 1.0f;
                    this.f24794ue = 1.0f;
                    this.gb = true;
                    this.ku = -1.0f;
                }
            }
        }

        @Override // com.bytedance.adsdk.ugeno.oa.uef.C0043uef
        /* renamed from: oa, reason: merged with bridge method [inline-methods] */
        public yo.uef uef() {
            moa();
            yo.uef uefVar = new yo.uef((int) this.uef, (int) this.f24749oa);
            uefVar.wrv((int) (this.dhk ? this.ivm : this.lw));
            uefVar.dz((int) (this.tpx ? this.xs : this.lw));
            uefVar.dj((int) (this.orq ? this.bcc : this.lw));
            uefVar.cq((int) (this.gzw ? this.cz : this.lw));
            uefVar.uef(this.gr);
            uefVar.lw(this.cp);
            uefVar.oa(this.f24794ue);
            uefVar.yo(this.pz);
            uefVar.ab(this.yo);
            uefVar.bs(this.moa);
            if (this.gb) {
                uefVar.moa(this.ku);
            }
            uefVar.ivm(this.fz);
            if (this.af) {
                uefVar.xs(this.dxx);
            }
            if (this.sk) {
                uefVar.cz(this.lz);
            }
            if (this.rl) {
                uefVar.bcc(this.oyt);
            }
            if (this.swd) {
                uefVar.zjm(this.km);
            }
            if (this.gem && yo()) {
                float f10 = this.pu;
                if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    uefVar.wk(f10);
                    uefVar.yo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    uefVar.oa(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            return uefVar;
        }

        @Override // com.bytedance.adsdk.ugeno.oa.uef.C0043uef
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LayoutParams{mOrder=");
            sb2.append(this.gr);
            sb2.append(", mFlexGrow=");
            sb2.append(this.f24794ue);
            sb2.append(", mFlexShrink=");
            sb2.append(this.pz);
            sb2.append(", mAlignSelf=");
            sb2.append(this.cp);
            sb2.append(", mFlexBasis=");
            sb2.append(this.ku);
            sb2.append(", mPosition=");
            sb2.append(this.fz);
            sb2.append(", mTop=");
            sb2.append(this.dxx);
            sb2.append(", mBottom=");
            sb2.append(this.lz);
            sb2.append(", mLeft=");
            sb2.append(this.oyt);
            sb2.append(", mRight=");
            return M6.r(sb2, this.km, '}');
        }

        public boolean yo() {
            float f10 = this.uef;
            if (f10 == -1.0f && this.f24749oa == -1.0f) {
                return false;
            }
            return f10 == -2.0f || this.f24749oa == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.oa.uef.C0043uef
        public void uef(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.uef(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.gb = true;
                    float fUef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, -1.0f);
                    this.ku = fUef;
                    this.ku = bcc.uef(context, fUef);
                    break;
                case "bottom":
                    this.sk = true;
                    this.lz = (int) bcc.uef(context, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0));
                    break;
                case "top":
                    this.af = true;
                    this.dxx = (int) bcc.uef(context, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0));
                    break;
                case "left":
                    this.rl = true;
                    this.oyt = (int) bcc.uef(context, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0));
                    break;
                case "order":
                    this.gr = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1);
                    break;
                case "ratio":
                    this.gem = true;
                    this.pu = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "right":
                    this.swd = true;
                    this.km = (int) bcc.uef(context, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0));
                    break;
                case "position":
                    this.fz = cq.uef(str2).uef();
                    break;
                case "flexShrink":
                    this.pz = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.f24794ue = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "alignSelf":
                    this.cp = com.bytedance.adsdk.ugeno.yoga.uef.uef(str2).uef();
                    break;
            }
        }
    }

    public uef(Context context) {
        super(context);
        this.qn = lw.ROW;
        this.lo = dz.NO_WRAP;
        this.aje = ivm.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.uef uefVar = com.bytedance.adsdk.ugeno.yoga.uef.STRETCH;
        this.syr = uefVar;
        this.f24791uf = uefVar;
    }

    public lw dv() {
        return this.qn;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void pz() {
        ImageView.ScaleType scaleType;
        if (this.rl) {
            com.bytedance.adsdk.ugeno.lw.uef().oa().uef(this.cz, this.gb, new uef.InterfaceC0044uef() { // from class: com.bytedance.adsdk.ugeno.yoga.oa.uef.1
                @Override // com.bytedance.adsdk.ugeno.uef.InterfaceC0044uef
                public void uef(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.oa.yo) uef.this).tam != null) {
                            com.bytedance.adsdk.ugeno.core.ivm unused = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).tam;
                            String unused2 = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).gb;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.oa.yo) uef.this).tam != null) {
                        com.bytedance.adsdk.ugeno.core.ivm unused3 = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).tam;
                        String unused4 = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).gb;
                    }
                    final Bitmap bitmapUef = bcc.uef(((com.bytedance.adsdk.ugeno.oa.yo) uef.this).f24755oa, bitmap, (int) ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).sk);
                    if (bitmapUef != null) {
                        bcc.uef(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.oa.uef.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                uef.this.uef(new BitmapDrawable(bitmapUef));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.cz.moa.uef uefVar = new com.bytedance.adsdk.ugeno.cz.moa.uef(this.f24755oa);
        com.bytedance.adsdk.ugeno.lw.uef().oa().uef(this.cz, this.gb, uefVar, this.lw.getWidth(), this.lw.getHeight(), new uef.InterfaceC0044uef() { // from class: com.bytedance.adsdk.ugeno.yoga.oa.uef.2
            @Override // com.bytedance.adsdk.ugeno.uef.InterfaceC0044uef
            public void uef(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.oa.yo) uef.this).tam != null) {
                        com.bytedance.adsdk.ugeno.core.ivm unused = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).tam;
                        String unused2 = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).gb;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.oa.yo) uef.this).tam != null) {
                    com.bytedance.adsdk.ugeno.core.ivm unused3 = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).tam;
                    String unused4 = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).gb;
                }
            }
        });
        if (!this.swd || (scaleType = this.af) == ImageView.ScaleType.FIT_XY) {
            uefVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            uefVar.setScaleType(scaleType);
        }
        uefVar.setCornerRadius(this.gem);
        yo.uef uefVar2 = new yo.uef(-1, -1);
        uefVar2.ivm(cq.ABSOLUTE.uef());
        uefVar2.xs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        uefVar2.bcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        T t10 = this.lw;
        if (t10 instanceof yo) {
            ((yo) t10).addView(uefVar, 0, uefVar2);
            uef(uefVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void dz() {
        if (this.fz) {
            this.nj.oa(moa.ALL, this.gr);
        }
        if (this.dxx) {
            this.nj.oa(moa.LEFT, this.f24757ue);
        }
        if (this.lz) {
            this.nj.oa(moa.RIGHT, this.pz);
        }
        if (this.oyt) {
            this.nj.oa(moa.TOP, this.cp);
        }
        if (this.km) {
            this.nj.oa(moa.BOTTOM, this.ku);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public C0049uef zjm() {
        return new C0049uef(this);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        this.nj.uef(this.qn);
        this.nj.uef(this.lo);
        this.nj.uef(this.aje);
        this.nj.uef(this.syr);
        this.nj.yo(this.f24791uf);
        this.nj.uef(true);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public yo uef() {
        yo yoVar = new yo(this.f24755oa);
        yoVar.uef(this);
        this.nj = yoVar.getYogaNode();
        return yoVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.cz.moa.uef uefVar = new com.bytedance.adsdk.ugeno.cz.moa.uef(this.f24755oa);
        uefVar.setImageDrawable(drawable);
        if (this.swd && (scaleType = this.af) != ImageView.ScaleType.FIT_XY) {
            uefVar.setScaleType(scaleType);
        } else {
            uefVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        uefVar.setCornerRadius(this.gem);
        yo.uef uefVar2 = new yo.uef(-1, -1);
        uefVar2.ivm(cq.ABSOLUTE.uef());
        uefVar2.xs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        uefVar2.bcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        T t10 = this.lw;
        if (t10 instanceof yo) {
            ((yo) t10).addView(uefVar, 0, uefVar2);
            uef(uefVar);
        }
    }

    private void uef(final com.bytedance.adsdk.ugeno.cz.moa.uef uefVar) {
        this.lw.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.oa.uef.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                zjm zjmVarUef;
                if (((com.bytedance.adsdk.ugeno.oa.yo) uef.this).lw == null || (zjmVarUef = ((yo) ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).lw).uef(uefVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).lw.getWidth();
                zjmVarUef.moa(width);
                int height = ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).lw.getHeight();
                zjmVarUef.ivm(height);
                uefVar.setCornerRadius(((com.bytedance.adsdk.ugeno.oa.yo) uef.this).gem);
                ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).lw.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.oa.yo) uef.this).lw.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        super.uef(yoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, ViewGroup.LayoutParams layoutParams) {
        if (yoVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.add(yoVar);
        View viewDj = yoVar.dj();
        if (viewDj != null) {
            ((yo) this.lw).addView(viewDj, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.syr = com.bytedance.adsdk.ugeno.yoga.uef.uef(str2);
                break;
            case "flexDirection":
                this.qn = lw.uef(str2);
                break;
            case "alignContent":
                this.f24791uf = com.bytedance.adsdk.ugeno.yoga.uef.uef(str2);
                break;
            case "flexWrap":
                this.lo = dz.uef(str2);
                break;
            case "justifyContent":
                this.aje = ivm.uef(str2);
                break;
        }
    }
}
