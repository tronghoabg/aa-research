package com.bytedance.adsdk.ugeno.oa;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public class uef<E extends ViewGroup> extends yo {
    protected List<yo<View>> uef;

    public uef(Context context) {
        this(context, null);
    }

    public List<yo<View>> cz() {
        return this.uef;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public yo moa(String str) {
        yo<T> yoVarBcc;
        if (!TextUtils.isEmpty(str) && wrv(str) != null) {
            return this;
        }
        for (yo<View> yoVar : this.uef) {
            if (yoVar != null && (yoVarBcc = yoVar.bcc(str)) != 0) {
                return yoVarBcc;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
    }

    public void uef(yo yoVar) {
        if (yoVar == null) {
            return;
        }
        this.uef.add(yoVar);
        View viewDj = yoVar.dj();
        if (viewDj != null) {
            ((ViewGroup) this.lw).addView(viewDj);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public yo yo(String str) {
        yo<T> yoVarXs;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.wrv) && this.wxf == 0) {
            return this;
        }
        if (this.wxf != 0) {
            return null;
        }
        for (yo<View> yoVar : this.uef) {
            if (yoVar != null && (yoVarXs = yoVar.xs(str)) != 0) {
                return yoVarXs;
            }
        }
        return null;
    }

    public C0043uef zjm() {
        return new C0043uef(this);
    }

    public uef(Context context, uef uefVar) {
        super(context, uefVar);
        this.uef = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public yo oa(String str) {
        yo<T> yoVarIvm;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.wrv)) {
            return this;
        }
        for (yo<View> yoVar : this.uef) {
            if (yoVar != null && (yoVarIvm = yoVar.ivm(str)) != 0) {
                return yoVarIvm;
            }
        }
        return null;
    }

    public void uef(yo yoVar, ViewGroup.LayoutParams layoutParams) {
        if (yoVar == null) {
            return;
        }
        this.uef.add(yoVar);
        View viewDj = yoVar.dj();
        if (viewDj != null) {
            ((ViewGroup) this.lw).addView(viewDj, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public yo uef(String str) {
        yo<T> yoVarLw;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.dj)) {
            return this;
        }
        for (yo<View> yoVar : this.uef) {
            if (yoVar != null && (yoVarLw = yoVar.lw(str)) != 0) {
                return yoVarLw;
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.oa.uef$uef, reason: collision with other inner class name */
    public static class C0043uef {

        /* renamed from: ab, reason: collision with root package name */
        protected boolean f24748ab;
        protected float bcc;
        protected boolean bs;
        protected float cq;
        protected float cz;
        protected boolean dhk;
        protected float dj;
        protected float dz;
        protected ViewGroup.LayoutParams gsd;
        protected boolean gzw;
        protected float ivm;
        protected float lw;
        protected boolean oib;
        protected boolean orq;
        protected uef rt;
        protected boolean sy;
        protected boolean tpx;
        protected boolean wk;
        protected float wrv;
        protected float xs;
        protected float zjm;
        protected float uef = -2.0f;

        /* renamed from: oa, reason: collision with root package name */
        protected float f24749oa = -2.0f;
        protected float yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        protected float moa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        public C0043uef(uef uefVar) {
            this.rt = uefVar;
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.uef + ", mHeight=" + this.f24749oa + ", mMargin=" + this.lw + ", mMarginLeft=" + this.ivm + ", mMarginRight=" + this.xs + ", mMarginTop=" + this.bcc + ", mMarginBottom=" + this.cz + ", mParams=" + this.gsd + '}';
        }

        public void uef(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.dj = bcc.uef(context, str2);
                    this.f24748ab = true;
                    break;
                case "minWidth":
                    this.yo = bcc.uef(context, str2);
                    break;
                case "height":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.f24749oa = bcc.uef(context, str2);
                            break;
                        } else {
                            this.f24749oa = -2.0f;
                            break;
                        }
                    } else {
                        this.f24749oa = -1.0f;
                        break;
                    }
                case "margin":
                    this.lw = bcc.uef(context, str2);
                    break;
                case "marginTop":
                    this.bcc = bcc.uef(context, str2);
                    this.orq = true;
                    break;
                case "padding":
                    this.zjm = bcc.uef(context, str2);
                    this.wk = true;
                    break;
                case "marginBottom":
                    this.cz = bcc.uef(context, str2);
                    this.gzw = true;
                    break;
                case "minHeight":
                    this.moa = bcc.uef(context, str2);
                    break;
                case "paddingTop":
                    this.wrv = bcc.uef(context, str2);
                    this.sy = true;
                    break;
                case "width":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.uef = bcc.uef(context, str2);
                            break;
                        } else {
                            this.uef = -2.0f;
                            break;
                        }
                    } else {
                        this.uef = -1.0f;
                        break;
                    }
                case "paddingBottom":
                    this.dz = bcc.uef(context, str2);
                    this.oib = true;
                    break;
                case "paddingRight":
                    this.cq = bcc.uef(context, str2);
                    this.bs = true;
                    break;
                case "marginRight":
                    this.xs = bcc.uef(context, str2);
                    this.tpx = true;
                    break;
                case "marginLeft":
                    this.ivm = bcc.uef(context, str2);
                    this.dhk = true;
                    break;
            }
        }

        public ViewGroup.LayoutParams uef() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.uef, (int) this.f24749oa);
            marginLayoutParams.leftMargin = (int) (this.dhk ? this.ivm : this.lw);
            marginLayoutParams.rightMargin = (int) (this.tpx ? this.xs : this.lw);
            marginLayoutParams.topMargin = (int) (this.orq ? this.bcc : this.lw);
            marginLayoutParams.bottomMargin = (int) (this.gzw ? this.cz : this.lw);
            return marginLayoutParams;
        }
    }
}
