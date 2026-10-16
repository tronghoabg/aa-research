package com.bytedance.adsdk.ugeno.lw;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.lw.lw;
import com.bytedance.adsdk.ugeno.oa.uef;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ivm extends com.bytedance.adsdk.ugeno.oa.uef<lw> {
    private int aje;
    private int lo;
    private int qn;
    private int syr;

    /* renamed from: uf, reason: collision with root package name */
    private int f24725uf;

    public static class uef extends uef.C0043uef {
        public int cp;
        public int dxx;
        public int fz;
        public int gr;
        public float ku;
        public int lz;
        public int oyt;
        public float pz;

        /* renamed from: ue, reason: collision with root package name */
        public float f24726ue;

        public uef(com.bytedance.adsdk.ugeno.oa.uef uefVar) {
            super(uefVar);
            this.gr = 1;
            this.f24726ue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.pz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.cp = -1;
            this.ku = -1.0f;
            this.fz = -1;
            this.dxx = -1;
            this.lz = 16777215;
            this.oyt = 16777215;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int lw(java.lang.String r8) {
            /*
                r7 = this;
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                r4 = 0
                r8.getClass()
                r5 = -1
                int r6 = r8.hashCode()
                switch(r6) {
                    case -1881872635: goto L3e;
                    case -1720785339: goto L33;
                    case -1364013995: goto L28;
                    case 1384876188: goto L1d;
                    case 1744442261: goto L12;
                    default: goto L10;
                }
            L10:
                r8 = r5
                goto L48
            L12:
                java.lang.String r6 = "flex_end"
                boolean r8 = r8.equals(r6)
                if (r8 != 0) goto L1b
                goto L10
            L1b:
                r8 = r0
                goto L48
            L1d:
                java.lang.String r6 = "flex_start"
                boolean r8 = r8.equals(r6)
                if (r8 != 0) goto L26
                goto L10
            L26:
                r8 = r1
                goto L48
            L28:
                java.lang.String r6 = "center"
                boolean r8 = r8.equals(r6)
                if (r8 != 0) goto L31
                goto L10
            L31:
                r8 = r2
                goto L48
            L33:
                java.lang.String r6 = "baseline"
                boolean r8 = r8.equals(r6)
                if (r8 != 0) goto L3c
                goto L10
            L3c:
                r8 = r3
                goto L48
            L3e:
                java.lang.String r6 = "stretch"
                boolean r8 = r8.equals(r6)
                if (r8 != 0) goto L47
                goto L10
            L47:
                r8 = r4
            L48:
                switch(r8) {
                    case 0: goto L50;
                    case 1: goto L4f;
                    case 2: goto L4e;
                    case 3: goto L4d;
                    case 4: goto L4c;
                    default: goto L4b;
                }
            L4b:
                return r5
            L4c:
                return r3
            L4d:
                return r4
            L4e:
                return r2
            L4f:
                return r1
            L50:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.lw.ivm.uef.lw(java.lang.String):int");
        }

        private float moa(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float oa(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        private float yo(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.oa.uef.C0043uef
        public String toString() {
            return "LayoutParams{mWidth=" + this.uef + ", mHeight=" + this.f24749oa + ", mMargin=" + this.lw + ", mMarginLeft=" + this.ivm + ", mMarginRight=" + this.xs + ", mMarginTop=" + this.bcc + ", mMarginBottom=" + this.cz + ", mParams=" + this.gsd + ", mOrder=" + this.gr + ", mFlexGrow=" + this.f24726ue + ", mFlexShrink=" + this.pz + ", mAlignSelf=" + this.cp + ", mFlexBasisPercent=" + this.ku + ", mMinWidth=" + this.fz + ", mMinHeight=" + this.dxx + ", mMaxWidth=" + this.lz + ", mMaxHeight=" + this.oyt + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.oa.uef.C0043uef
        /* renamed from: oa, reason: merged with bridge method [inline-methods] */
        public lw.uef uef() {
            lw.uef uefVar = new lw.uef((int) this.uef, (int) this.f24749oa);
            ((ViewGroup.MarginLayoutParams) uefVar).leftMargin = (int) this.ivm;
            ((ViewGroup.MarginLayoutParams) uefVar).rightMargin = (int) this.xs;
            ((ViewGroup.MarginLayoutParams) uefVar).topMargin = (int) this.bcc;
            ((ViewGroup.MarginLayoutParams) uefVar).bottomMargin = (int) this.cz;
            uefVar.yo(this.gr);
            uefVar.moa(this.cp);
            uefVar.uef(this.f24726ue);
            uefVar.oa(this.pz);
            uefVar.yo(this.ku);
            return uefVar;
        }

        @Override // com.bytedance.adsdk.ugeno.oa.uef.C0043uef
        public void uef(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.uef(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.ku = moa(str2);
                    break;
                case "order":
                    this.gr = uef(str2);
                    break;
                case "flexShrink":
                    this.pz = yo(str2);
                    break;
                case "flexGrow":
                    this.f24726ue = oa(str2);
                    break;
                case "alignSelf":
                    this.cp = lw(str2);
                    break;
            }
        }

        private int uef(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public ivm(Context context) {
        super(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int ab(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1881872635: goto L35;
                case -1720785339: goto L2b;
                case -1364013995: goto L21;
                case 1384876188: goto L17;
                case 1744442261: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "flex_end"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r5
            goto L40
        L17:
            java.lang.String r0 = "flex_start"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r2
            goto L40
        L21:
            java.lang.String r0 = "center"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r4
            goto L40
        L2b:
            java.lang.String r0 = "baseline"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r3
            goto L40
        L35:
            java.lang.String r0 = "stretch"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r1
            goto L40
        L3f:
            r7 = -1
        L40:
            if (r7 == 0) goto L4c
            if (r7 == r5) goto L4b
            if (r7 == r4) goto L4a
            if (r7 == r3) goto L49
            return r1
        L49:
            return r3
        L4a:
            return r4
        L4b:
            return r5
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.lw.ivm.ab(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int bs(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 5
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 4
            r6 = 1
            switch(r0) {
                case -1881872635: goto L40;
                case -1364013995: goto L36;
                case -932331738: goto L2c;
                case 1384876188: goto L22;
                case 1682480591: goto L18;
                case 1744442261: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L4a
        Le:
            java.lang.String r0 = "flex_end"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r6
            goto L4b
        L18:
            java.lang.String r0 = "space_between"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r5
            goto L4b
        L22:
            java.lang.String r0 = "flex_start"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r2
            goto L4b
        L2c:
            java.lang.String r0 = "space_around"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r4
            goto L4b
        L36:
            java.lang.String r0 = "center"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r3
            goto L4b
        L40:
            java.lang.String r0 = "stretch"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r1
            goto L4b
        L4a:
            r8 = -1
        L4b:
            if (r8 == 0) goto L5a
            if (r8 == r6) goto L59
            if (r8 == r3) goto L58
            if (r8 == r4) goto L57
            if (r8 == r5) goto L56
            return r1
        L56:
            return r4
        L57:
            return r5
        L58:
            return r3
        L59:
            return r6
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.lw.ivm.bs(java.lang.String):int");
    }

    private int dz(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int wk(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    public int cq(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        ((lw) this.lw).setFlexDirection(this.qn);
        ((lw) this.lw).setFlexWrap(this.lo);
        ((lw) this.lw).setJustifyContent(this.aje);
        ((lw) this.lw).setAlignItems(this.syr);
        ((lw) this.lw).setAlignContent(this.f24725uf);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public lw uef() {
        lw lwVar = new lw(this.f24755oa);
        lwVar.uef(this);
        return lwVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public uef.C0043uef zjm() {
        return new uef(this);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.syr = ab(str2);
                break;
            case "flexDirection":
                this.qn = cq(str2);
                break;
            case "alignContent":
                this.f24725uf = bs(str2);
                break;
            case "flexWrap":
                this.lo = dz(str2);
                break;
            case "justifyContent":
                this.aje = wk(str2);
                break;
        }
    }
}
