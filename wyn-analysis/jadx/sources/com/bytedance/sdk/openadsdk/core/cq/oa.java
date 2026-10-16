package com.bytedance.sdk.openadsdk.core.cq;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class oa {

    /* renamed from: ab, reason: collision with root package name */
    private float f25524ab;
    private float bs;
    private int cq;
    private int cz;
    private boolean dhk;
    private float dj;
    private boolean dz;
    private int lw;
    private Context oib;
    private float sy;
    protected String uef;
    private float wk;
    private float wrv;
    private int xs;
    private TextUtils.TruncateAt zjm;

    /* renamed from: oa, reason: collision with root package name */
    protected int f25525oa = -16777216;
    private float yo = 12.0f;
    private float moa = -1.0f;
    private int ivm = f.API_PRIORITY_OTHER;
    private int bcc = 8388611;

    public oa(Context context, boolean z2) {
        this.oib = context;
        this.dhk = z2;
    }

    private int moa(String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int oa(java.lang.String r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cq.oa.oa(java.lang.String):int");
    }

    private TextUtils.TruncateAt yo(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public void uef(com.bytedance.adsdk.ugeno.cz.ivm.uef uefVar) {
        if (uefVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.uef)) {
            uefVar.setText(TextUtils.equals("null", this.uef) ? "" : this.uef);
        }
        uefVar.setTextSize(1, this.yo);
        uefVar.setMinTextSize(bcc.uef(this.oib, this.moa));
        uefVar.setTextColor(this.f25525oa);
        uefVar.setGravity(this.bcc);
        uefVar.setLines(this.xs);
        uefVar.setMaxLines(this.ivm);
        int i5 = this.cz;
        if (i5 != Integer.MAX_VALUE) {
            uefVar.setPaintFlags(i5);
        }
        uefVar.setEllipsize(this.zjm);
        if (this.dj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.dhk) {
                yo(uefVar);
            } else {
                oa(uefVar);
            }
        }
        uefVar.setTypeface(uef((int) this.wrv));
        moa(uefVar);
        float fUef = bcc.uef(this.oib, this.yo);
        if (fUef > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uefVar.setLetterSpacing(this.sy / fUef);
        }
        uefVar.setIncludeFontPadding(false);
    }

    private void moa(com.bytedance.adsdk.ugeno.cz.ivm.uef uefVar) {
        if (!this.dhk) {
            uefVar.setShadowLayer(this.bs, this.wk, this.f25524ab, this.cq);
        } else if (this.dz) {
            float f10 = this.bs;
            if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f10 = 1.0E-5f;
            }
            uefVar.setShadowLayer(f10, this.wk, this.f25524ab, this.cq);
        }
    }

    private void oa(com.bytedance.adsdk.ugeno.cz.ivm.uef uefVar) {
        uefVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.dj);
    }

    private void yo(com.bytedance.adsdk.ugeno.cz.ivm.uef uefVar) {
        float f10 = this.dj;
        if (f10 <= 3.0f) {
            uefVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(bcc.uef(this.oib, (f10 - (this.yo * 1.2f)) / 2.0f));
            uefVar.setPadding(uefVar.getPaddingLeft(), uefVar.getPaddingTop() + iRound, uefVar.getPaddingRight(), uefVar.getPaddingBottom() + iRound);
            uefVar.setLineHeight(Math.round(bcc.uef(this.oib, this.dj)));
        }
    }

    public void uef(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "shadowColor":
                this.cq = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                this.dz = true;
                break;
            case "shadowOffsetX":
                this.wk = bcc.uef(this.oib, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "shadowOffsetY":
                this.f25524ab = bcc.uef(this.oib, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "textAlign":
                this.bcc = uef(str2);
                break;
            case "textColor":
                this.f25525oa = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "textStyle":
                this.lw = oa(str2);
                break;
            case "shadowBlur":
                this.bs = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textSize":
                this.yo = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textDecoration":
                this.cz = moa(str2);
                break;
            case "fontWeight":
                float fUef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, -1.0f);
                this.wrv = fUef;
                if (fUef < 1.0f || fUef > 1000.0f) {
                    this.wrv = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.dj = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1.0f);
                break;
            case "text":
                this.uef = str2;
                break;
            case "lines":
                this.xs = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0);
                break;
            case "ellipsis":
                this.zjm = yo(str2);
                break;
            case "minTextSize":
                this.moa = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, -1.0f);
                break;
            case "maxLines":
                int i5 = f.API_PRIORITY_OTHER;
                int iUef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, f.API_PRIORITY_OTHER);
                if (iUef > 0) {
                    i5 = iUef;
                }
                this.ivm = i5;
                break;
            case "letterSpacing":
                this.sy = bcc.uef(this.oib, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
    }

    private int uef(String str) {
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

    private Typeface uef(int i5) {
        if (Build.VERSION.SDK_INT < 28) {
            return i5 >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
        }
        Typeface typeface = Typeface.DEFAULT;
        return Typeface.create(Typeface.DEFAULT, i5, false);
    }
}
