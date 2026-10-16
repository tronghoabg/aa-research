package com.bytedance.adsdk.ugeno.cz.uef;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.cz.ivm.oa;
import com.bytedance.adsdk.ugeno.lw;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.bytedance.adsdk.ugeno.uef;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.bytedance.adsdk.ugeno.xs.moa;
import com.bytedance.adsdk.ugeno.xs.uef;
import org.json.JSONException;

/* loaded from: classes.dex */
public class uef extends oa {
    private String aje;
    private uef.C0046uef jp;
    private String lo;
    private boolean meb;
    private int nj;
    private String syr;

    /* renamed from: uf, reason: collision with root package name */
    private String f24716uf;

    /* renamed from: wf, reason: collision with root package name */
    private int f24717wf;
    private boolean ykf;

    public uef(Context context) {
        super(context);
        this.aje = "row";
    }

    private void moa() {
        if (TextUtils.isEmpty(this.lo)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).setCompoundDrawables(null, null, null, null);
        if (!this.lo.startsWith("local://")) {
            lw.uef().oa().uef(this.cz, this.lo, new uef.InterfaceC0044uef() { // from class: com.bytedance.adsdk.ugeno.cz.uef.uef.1
                @Override // com.bytedance.adsdk.ugeno.uef.InterfaceC0044uef
                public void uef(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    bcc.uef(new Runnable() { // from class: com.bytedance.adsdk.ugeno.cz.uef.uef.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            uef.this.oa(new BitmapDrawable(((yo) uef.this).f24755oa.getResources(), bitmap));
                        }
                    });
                }
            });
        } else {
            try {
                cq(this.lo.replace("local://", ""));
            } catch (Throwable unused) {
            }
        }
    }

    public void cq(String str) {
        Context context = this.f24755oa;
        oa(bcc.uef(context, moa.oa(context, str)));
    }

    @Override // com.bytedance.adsdk.ugeno.cz.ivm.oa, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        moa();
        ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void rl() {
        super.rl();
        if (this.ykf) {
            ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).setTextColor(this.f24717wf);
        }
        if (this.meb) {
            if (this.us) {
                uef(this.jp);
            } else {
                moa(this.nj);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void swd() {
        super.swd();
        if (this.ykf) {
            ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).setTextColor(((oa) this).qn);
        }
        if (this.meb) {
            if (this.us) {
                uef(this.vep);
            } else {
                moa(this.pu);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cz.ivm.oa, com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.aje = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.f24717wf = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                this.ykf = true;
                break;
            case "image":
                this.lo = str2;
                break;
            case "highlightImage":
                this.syr = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.xs.uef.yo(str2)) {
                    this.us = true;
                    this.jp = com.bytedance.adsdk.ugeno.xs.uef.oa(str2);
                } else {
                    this.nj = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                    this.us = false;
                }
                this.meb = true;
                break;
            case "highlightBackgroundImage":
                this.f24716uf = str2;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oa(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r4.aje
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case -1781065991: goto L2d;
                case -1354837162: goto L23;
                case -207799939: goto L19;
                case 113114: goto Lf;
                default: goto Le;
            }
        Le:
            goto L37
        Lf:
            java.lang.String r1 = "row"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = 3
            goto L38
        L19:
            java.lang.String r1 = "row_reverse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = 0
            goto L38
        L23:
            java.lang.String r1 = "column"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r3
            goto L38
        L2d:
            java.lang.String r1 = "column_reverse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r2
            goto L38
        L37:
            r0 = -1
        L38:
            r1 = 0
            if (r0 == 0) goto L57
            if (r0 == r3) goto L4f
            if (r0 == r2) goto L47
            T extends android.view.View r0 = r4.lw
            com.bytedance.adsdk.ugeno.cz.ivm.uef r0 = (com.bytedance.adsdk.ugeno.cz.ivm.uef) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r5, r1, r1, r1)
            return
        L47:
            T extends android.view.View r0 = r4.lw
            com.bytedance.adsdk.ugeno.cz.ivm.uef r0 = (com.bytedance.adsdk.ugeno.cz.ivm.uef) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r5)
            return
        L4f:
            T extends android.view.View r0 = r4.lw
            com.bytedance.adsdk.ugeno.cz.ivm.uef r0 = (com.bytedance.adsdk.ugeno.cz.ivm.uef) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r1, r1)
            return
        L57:
            T extends android.view.View r0 = r4.lw
            com.bytedance.adsdk.ugeno.cz.ivm.uef r0 = (com.bytedance.adsdk.ugeno.cz.ivm.uef) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.cz.uef.uef.oa(android.graphics.drawable.Drawable):void");
    }
}
