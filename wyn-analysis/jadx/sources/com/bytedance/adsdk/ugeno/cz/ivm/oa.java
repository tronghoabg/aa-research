package com.bytedance.adsdk.ugeno.cz.ivm;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* loaded from: classes.dex */
public class oa extends yo<uef> {
    private float aje;

    /* renamed from: cc, reason: collision with root package name */
    @Deprecated
    private float f24697cc;

    /* renamed from: df, reason: collision with root package name */
    private float f24698df;
    private float dy;
    private float efa;
    private boolean ej;
    private int ifk;
    private int jp;
    private float lo;

    @Deprecated
    private float lpy;
    private TextUtils.TruncateAt meb;
    private int nj;
    protected int qn;
    private int syr;
    protected String uef;

    /* renamed from: uf, reason: collision with root package name */
    private int f24699uf;
    private float uxr;

    /* renamed from: wd, reason: collision with root package name */
    private float f24700wd;

    /* renamed from: wf, reason: collision with root package name */
    private int f24701wf;
    private float wp;

    @Deprecated
    private TextUtils.TruncateAt ykf;

    public oa(Context context) {
        super(context);
        this.qn = -16777216;
        this.lo = 12.0f;
        this.aje = -1.0f;
        this.f24699uf = f.API_PRIORITY_OTHER;
        this.jp = 8388611;
        this.meb = TextUtils.TruncateAt.END;
        this.dy = -1.0f;
        this.f24700wd = 400.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int ab(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L2b
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L21
            r1 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r0 == r1) goto L17
            goto L35
        L17:
            java.lang.String r0 = "bold"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r3
            goto L36
        L21:
            java.lang.String r0 = "normal"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r2
            goto L36
        L2b:
            java.lang.String r0 = "italic"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r4
            goto L36
        L35:
            r6 = -1
        L36:
            if (r6 == 0) goto L3c
            if (r6 == r4) goto L3b
            return r3
        L3b:
            return r2
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.cz.ivm.oa.ab(java.lang.String):int");
    }

    private int bs(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    private TextUtils.TruncateAt cq(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.ykf = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.ykf = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.ykf = TextUtils.TruncateAt.START;
                break;
            default:
                this.ykf = null;
                break;
        }
        return this.ykf;
    }

    private void cz() {
        float f10 = this.dy;
        if (f10 <= 3.0f) {
            ((uef) this.lw).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(bcc.uef(this.f24755oa, (f10 - (this.lo * 1.2f)) / 2.0f));
            int paddingTop = ((uef) this.lw).getPaddingTop() + iRound;
            int paddingBottom = ((uef) this.lw).getPaddingBottom() + iRound;
            uef uefVar = (uef) this.lw;
            uefVar.setPadding(uefVar.getPaddingLeft(), paddingTop, ((uef) this.lw).getPaddingRight(), paddingBottom);
            ((uef) this.lw).setLineHeight(Math.round(bcc.uef(this.f24755oa, this.dy)));
        }
    }

    private void moa() {
        ((uef) this.lw).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.dy);
    }

    private int sy(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return f.API_PRIORITY_OTHER;
        }
    }

    private TextUtils.TruncateAt wk(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public void dz(String str) {
        this.uef = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.uef = "";
        }
        ((uef) this.lw).setText(this.uef);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        if (TextUtils.equals("null", this.uef)) {
            this.uef = "";
        }
        dz(this.uef);
        ((uef) this.lw).setTextSize(1, this.lo);
        ((uef) this.lw).setTextColor(this.qn);
        ((uef) this.lw).setLines(this.nj);
        ((uef) this.lw).setMaxLines(this.f24699uf);
        ((uef) this.lw).setGravity(this.jp);
        ((uef) this.lw).setIncludeFontPadding(false);
        ((uef) this.lw).setMinTextSize(bcc.uef(this.f24755oa, this.aje));
        uef(this.f24701wf);
        if (fz()) {
            uef(this.meb);
        } else {
            uef(this.ykf);
        }
        if (this.dy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (fz()) {
                cz();
            } else {
                moa();
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        ((uef) this.lw).setBreakStrategy(0);
        if (!fz()) {
            ((uef) this.lw).setShadowLayer(this.uxr, this.f24697cc, this.lpy, this.ifk);
        } else if (this.ej) {
            if (this.uxr <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.uxr = 1.0E-5f;
            }
            ((uef) this.lw).setShadowLayer(this.uxr, this.wp, this.f24698df, this.ifk);
        }
        int i10 = this.syr;
        if (i10 == 1) {
            ((uef) this.lw).setTypeface(Typeface.DEFAULT, i10);
        } else if (i5 >= 28) {
            Typeface typeface = Typeface.DEFAULT;
            ((uef) this.lw).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.f24700wd, i10 == 2));
        } else if (this.f24700wd >= 500.0f) {
            ((uef) this.lw).setTypeface(Typeface.DEFAULT, 1);
        }
        if (bcc.uef(this.f24755oa, this.lo) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ((uef) this.lw).setLetterSpacing(this.efa / bcc.uef(this.f24755oa, this.lo));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public uef uef() {
        uef uefVar = new uef(this.f24755oa);
        uefVar.uef(this);
        return uefVar;
    }

    public void uef(int i5) {
        this.f24701wf = i5;
        if (i5 == Integer.MAX_VALUE) {
            return;
        }
        ((uef) this.lw).setPaintFlags(i5);
    }

    public void uef(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((uef) this.lw).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.uxr = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "shadowColor":
                this.ifk = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                this.ej = true;
                break;
            case "shadowOffsetX":
                this.wp = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "shadowOffsetY":
                this.f24698df = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "textAlign":
                this.jp = bs(str2);
                break;
            case "textColor":
                this.qn = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "textStyle":
                this.syr = ab(str2);
                break;
            case "textSize":
                this.lo = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textDecoration":
                this.f24701wf = sy(str2);
                break;
            case "shadowDx":
                this.f24697cc = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "shadowDy":
                this.lpy = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "fontWeight":
                float fUef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, -1.0f);
                this.f24700wd = fUef;
                if (fUef < 1.0f || fUef > 1000.0f) {
                    this.f24700wd = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.dy = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1.0f);
                break;
            case "text":
                this.uef = str2;
                break;
            case "lines":
                this.nj = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0);
                break;
            case "ellipsis":
                this.meb = wk(str2);
                break;
            case "minTextSize":
                this.aje = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, -1.0f);
                break;
            case "maxLines":
                int i5 = f.API_PRIORITY_OTHER;
                int iUef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, f.API_PRIORITY_OTHER);
                if (iUef > 0) {
                    i5 = iUef;
                }
                this.f24699uf = i5;
                break;
            case "ellipsize":
                this.ykf = cq(str2);
                break;
            case "letterSpacing":
                this.efa = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
    }
}
