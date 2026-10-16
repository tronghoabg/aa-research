package com.bytedance.adsdk.ugeno.cz.oa;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.oa.uef;
import org.json.JSONException;

/* loaded from: classes.dex */
public class oa extends com.bytedance.adsdk.ugeno.oa.uef<com.bytedance.adsdk.ugeno.cz.oa.uef> {
    private com.bytedance.adsdk.ugeno.cz.oa.uef qn;

    public static class uef extends uef.C0043uef {
        protected int gr;

        public uef(com.bytedance.adsdk.ugeno.oa.uef uefVar) {
            super(uefVar);
            this.gr = -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int oa(java.lang.String r6) {
            /*
                r5 = this;
                r0 = 5
                r1 = 3
                r2 = 1
                r6.getClass()
                r3 = -1
                int r4 = r6.hashCode()
                switch(r4) {
                    case -1383228885: goto L52;
                    case -1364013995: goto L47;
                    case -348726240: goto L3c;
                    case 115029: goto L31;
                    case 3317767: goto L26;
                    case 108511772: goto L1b;
                    case 1063616078: goto L10;
                    default: goto Le;
                }
            Le:
                r6 = r3
                goto L5c
            L10:
                java.lang.String r4 = "center_horizontal"
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L19
                goto Le
            L19:
                r6 = 6
                goto L5c
            L1b:
                java.lang.String r4 = "right"
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L24
                goto Le
            L24:
                r6 = r0
                goto L5c
            L26:
                java.lang.String r4 = "left"
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L2f
                goto Le
            L2f:
                r6 = 4
                goto L5c
            L31:
                java.lang.String r4 = "top"
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L3a
                goto Le
            L3a:
                r6 = r1
                goto L5c
            L3c:
                java.lang.String r4 = "center_vertical"
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L45
                goto Le
            L45:
                r6 = 2
                goto L5c
            L47:
                java.lang.String r4 = "center"
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L50
                goto Le
            L50:
                r6 = r2
                goto L5c
            L52:
                java.lang.String r4 = "bottom"
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L5b
                goto Le
            L5b:
                r6 = 0
            L5c:
                switch(r6) {
                    case 0: goto L6c;
                    case 1: goto L69;
                    case 2: goto L66;
                    case 3: goto L63;
                    case 4: goto L62;
                    case 5: goto L61;
                    case 6: goto L60;
                    default: goto L5f;
                }
            L5f:
                return r3
            L60:
                return r2
            L61:
                return r0
            L62:
                return r1
            L63:
                r6 = 48
                return r6
            L66:
                r6 = 16
                return r6
            L69:
                r6 = 17
                return r6
            L6c:
                r6 = 80
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.cz.oa.oa.uef.oa(java.lang.String):int");
        }

        @Override // com.bytedance.adsdk.ugeno.oa.uef.C0043uef
        /* renamed from: oa, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams uef() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.uef, (int) this.f24749oa);
            layoutParams.leftMargin = (int) this.ivm;
            layoutParams.rightMargin = (int) this.xs;
            layoutParams.topMargin = (int) this.bcc;
            layoutParams.bottomMargin = (int) this.cz;
            layoutParams.gravity = this.gr;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.oa.uef.C0043uef
        public void uef(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.uef(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.gr = uef(str2);
            }
        }

        private int uef(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iOa = 0;
            for (String str2 : strArrSplit) {
                iOa |= oa(str2);
            }
            return iOa;
        }
    }

    public oa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        this.qn.setEventMap(this.fjj);
        super.oa();
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.cz.oa.uef uef() {
        com.bytedance.adsdk.ugeno.cz.oa.uef uefVar = new com.bytedance.adsdk.ugeno.cz.oa.uef(this.f24755oa);
        this.qn = uefVar;
        uefVar.uef(this);
        return this.qn;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public uef.C0043uef zjm() {
        return new uef(this);
    }
}
