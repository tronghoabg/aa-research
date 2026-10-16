package com.bytedance.sdk.openadsdk.component.reward.oa;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.uef.cq;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.bcc;
import com.bytedance.sdk.openadsdk.component.reward.view.cz;
import com.bytedance.sdk.openadsdk.component.reward.view.dj;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.dz;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class oa extends uef {
    private com.bytedance.sdk.openadsdk.cq.xs cq;
    protected com.bytedance.sdk.openadsdk.core.yo.lw dj;
    public com.bytedance.sdk.openadsdk.core.widget.oa wrv;

    public oa(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        super(oaVar);
    }

    private void moa(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        cq cqVar = oaVar.dxx;
        if (cqVar != null) {
            cqVar.moa();
        }
    }

    private void yo(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        dj djVar = oaVar.oyt;
        if (djVar == null || djVar.zjm() == null) {
            return;
        }
        oaVar.oyt.zjm().performClick();
    }

    public void ab() {
        int i5;
        if (this.uef.cz.get() && this.uef.sy.getAndSet(false) && ((i5 = this.uef.xs) >= 0 || i5 == -1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 700;
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
            messageObtain.arg1 = oaVar.xs;
            oaVar.sk.sendMessage(messageObtain);
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.uef;
        if (oaVar2.bcc <= 0 || !oaVar2.oib.getAndSet(false)) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 900;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.uef;
        messageObtain2.arg1 = oaVar3.bcc;
        oaVar3.sk.sendMessage(messageObtain2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View bcc() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.oa.oa.bcc():android.view.View");
    }

    public void bs() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
        if (oaVar == null) {
            return;
        }
        try {
            oaVar.cop = false;
            boolean z2 = oaVar.gem;
            if (!oaVar.zjm.get()) {
                this.uef.tpx.ab();
            }
            dz();
            this.uef.ku.ab();
            this.uef.gzw.bcc();
            this.uef.oib.set(true);
            if (this.uef.cz.get()) {
                this.uef.sy.set(true);
            }
            dz dzVar = this.uef.hnk;
            if (dzVar != null) {
                dzVar.oa();
            }
            this.uef.lw();
        } catch (Throwable unused) {
        }
    }

    public void cq() {
        if (this.uef.xs()) {
            this.uef.dxx.lw();
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
            if (oaVar.vjj && (oaVar.sw instanceof com.bytedance.sdk.openadsdk.activity.single.uef)) {
                return;
            }
            oaVar.oyt.ivm(0);
        }
    }

    public View cz() {
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar;
        if (this.f25384oa.bx() != 5) {
            xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(this.uef.pu);
            xsVar.setId(bs.pp);
        } else {
            xsVar = null;
        }
        Objects.toString(xsVar);
        return xsVar;
    }

    public void dhk() {
        if (!this.uef.gzw.dj() && sy.moa().orq(String.valueOf(this.uef.ivm)) == 1) {
            int iUef = uef(this.uef);
            if (oa(this.uef)) {
                yo(this.uef);
            } else if (uef(this.uef, iUef)) {
                moa(this.uef);
            }
        }
    }

    public void dj() {
    }

    public void dz() {
        ue ueVar = this.zjm;
        if (ueVar != null) {
            ueVar.removeMessages(300);
        }
    }

    public boolean gr() {
        return true;
    }

    public void gsd() {
        yo();
        if (!this.uef.f25412oa.ebe() && gr()) {
            rt();
        }
        if (gr()) {
            this.uef.lz.oa();
        }
        if (dhk.moa(this.uef.f25412oa) || dhk.xs(this.uef.f25412oa)) {
            this.zjm.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
        oaVar.oyt.uef(oaVar.uqx == 100.0f);
        orq();
        ivm();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gzw() {
        /*
            r4 = this;
            boolean r0 = r4.lw()
            if (r0 != 0) goto L12
            boolean r0 = r4 instanceof com.bytedance.sdk.openadsdk.component.reward.oa.xs
            if (r0 == 0) goto L12
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r4.uef
            com.bytedance.sdk.openadsdk.component.reward.uef.dj r0 = r0.gr
            r0.oa()
            return
        L12:
            com.bytedance.sdk.openadsdk.core.wk.moa.oa r0 = r4.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r4.lw
            long r1 = r1.wk()
            r3 = 0
            boolean r0 = r0.uef(r1, r3)
            if (r0 != 0) goto L4b
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r4.uef
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r0 = r0.tpx
            r0.dj()
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r4.uef
            boolean r1 = r0.vjj
            if (r1 == 0) goto L3a
            com.bytedance.sdk.openadsdk.activity.single.bcc r0 = r0.sw
            boolean r1 = r0 instanceof com.bytedance.sdk.openadsdk.activity.single.uef
            if (r1 == 0) goto L3a
            com.bytedance.sdk.openadsdk.activity.single.uef r0 = (com.bytedance.sdk.openadsdk.activity.single.uef) r0
            r0.gzw()
            goto L4b
        L3a:
            int r0 = com.bytedance.sdk.openadsdk.moa.oa.C0124oa.uef
            r4.uef(r0)
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r0 = r4.lw
            boolean r1 = r0.pu()
            r1 = r1 ^ 1
            r2 = 4
            r0.uef(r1, r2)
        L4b:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r4.uef
            if (r0 == 0) goto L6a
            com.bytedance.sdk.openadsdk.core.model.gzw r1 = r0.f25412oa
            if (r1 == 0) goto L6a
            com.bytedance.sdk.openadsdk.utils.dz r0 = r0.hnk
            if (r0 == 0) goto L6a
            boolean r0 = r1.ib()
            if (r0 == 0) goto L6a
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r4.uef
            com.bytedance.sdk.openadsdk.utils.dz r1 = r0.hnk
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r0 = r0.tpx
            long r2 = r0.ue()
            r1.uef(r2)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.oa.oa.gzw():void");
    }

    public abstract void ivm();

    public abstract boolean lw();

    public abstract boolean moa();

    public void oa(boolean z2) {
        try {
            cz czVar = this.uef.gsd;
            if (czVar != null && !z2) {
                czVar.ivm();
            }
            dj djVar = this.uef.oyt;
            if (djVar != null) {
                djVar.dz();
            }
            this.uef.tpx.oyt();
            if (!moa()) {
                this.uef.cz.get();
            }
            com.bytedance.sdk.openadsdk.component.reward.uef.sy syVar = this.uef.ku;
            if (syVar != null) {
                syVar.dj();
            }
            com.bytedance.sdk.openadsdk.component.reward.uef.cz czVar2 = this.uef.gzw;
            if (czVar2 != null) {
                czVar2.yo(com.bytedance.sdk.openadsdk.component.reward.uef.cz.uef);
            }
            dj djVar2 = this.uef.oyt;
            if (djVar2 != null) {
                djVar2.wrv();
            }
            com.bytedance.sdk.openadsdk.component.reward.uef.ivm ivmVar = this.uef.lz;
            if (ivmVar != null) {
                ivmVar.yo();
            }
            dz dzVar = this.uef.hnk;
            if (dzVar != null) {
                dzVar.yo();
            }
        } catch (Throwable unused) {
        }
    }

    public void oib() {
        oa(false);
    }

    public void orq() {
        this.dj = this.uef.gr.yo();
    }

    public final void rt() {
        if (this.uef.pu.isFinishing()) {
            return;
        }
        this.uef.ku.zjm();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
        String str = oaVar.moa ? "reward_endcard" : "fullscreen_endcard";
        oaVar.ku.uef(this.cq, str, oaVar.gb);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.uef;
        if (oaVar2.vj) {
            oaVar2.gzw.uef(oaVar2.gem);
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.uef;
        oaVar3.ku.uef(str, oaVar3.gb);
        this.uef.ku.lw();
    }

    public void sy() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
        if (oaVar == null) {
            return;
        }
        dj djVar = oaVar.oyt;
        if (djVar != null) {
            djVar.ab();
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.uef;
        boolean z2 = oaVar2.gem;
        oaVar2.cp.uef();
        DeviceUtils.xs();
        this.uef.ku.wk();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.uef;
        if (oaVar3.gem) {
            oaVar3.pu.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.oa.oa.1
                @Override // java.lang.Runnable
                public void run() {
                    if (oa.this.uef.cp.uef() > 0) {
                        oa.this.uef.cp.uef(false);
                    }
                }
            });
        }
    }

    public void tpx() {
        this.uef.dxx.yo();
        this.uef.dxx.lw(true);
    }

    public abstract void uef(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.uef
    public void uef(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar, ue ueVar) {
        super.uef(oaVar, ueVar);
        if (this.uef.f25412oa.ivm()) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.uef;
            if (oaVar2.ou) {
                oaVar2.ku.uef(false);
            }
        }
    }

    public void wk() {
        if (this.uef.sw != null || ((!cp.oa(this.f25384oa) && !cp.yo(this.f25384oa)) || (cp.bcc(this.f25384oa) && this.uef.ku.pz() && !this.uef.ku.fz()))) {
            ab();
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
        if (oaVar == null) {
            return;
        }
        if (oaVar.hnk != null && !oaVar.zjm.get()) {
            this.uef.hnk.uef();
        }
        this.uef.moa();
    }

    public void wrv() {
        com.bytedance.sdk.openadsdk.core.widget.oa oaVar = this.wrv;
        if (oaVar == null || !oaVar.isShowing()) {
            return;
        }
        this.wrv.dismiss();
    }

    public RFEndCardBackUpLayout xs() {
        return new RFEndCardBackUpLayout(this.uef.af);
    }

    public void zjm() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
        oaVar.rt.uef(oaVar, oaVar.moa);
        this.uef.oyt.oa();
        this.uef.lz.uef();
        if (!this.uef.f25412oa.ebe()) {
            this.uef.ku.uef();
            this.uef.fz.uef();
        }
        this.uef.gzw.xs();
        this.uef.dxx.uef();
        if (cp.ivm(this.uef.f25412oa)) {
            this.uef.oyt.moa();
            af.uef((View) this.uef.ku.bcc(), 4);
        }
        if (dhk.moa(this.uef.f25412oa) || dhk.oa(this.uef.f25412oa) || dhk.xs(this.uef.f25412oa)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.uef;
        oaVar2.oyt.uef(af.oa(oaVar2.af, oaVar2.rj), af.oa(this.uef.af, r2.dv));
        this.uef.orq.uef();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.uef;
        if (oaVar3.wxf) {
            oaVar3.oyt.uef(0);
        }
    }

    public void uef(bcc bccVar) {
        uef(bccVar, this.uef);
    }

    public void uef(boolean z2, boolean z10, boolean z11, int i5) {
        this.uef.lz.uef(z2, z10, z11, this, i5);
    }

    private int uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        if (cp.yo(oaVar.f25412oa)) {
            return oaVar.f25412oa.yc();
        }
        if (oaVar.moa) {
            return oaVar.f25412oa.ho();
        }
        return oaVar.f25412oa.qe();
    }

    private boolean uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, int i5) {
        if (i5 == -1) {
            return false;
        }
        boolean z2 = !oaVar.cz.get() || cp.yo(oaVar.f25412oa);
        com.bytedance.sdk.openadsdk.component.reward.uef.bs bsVar = oaVar.tpx;
        boolean z10 = bsVar != null && bsVar.dz() >= ((long) i5) * 1000;
        com.bytedance.sdk.openadsdk.component.reward.uef.cz czVar = oaVar.gzw;
        return z2 && (z10 || (czVar != null && czVar.moa()));
    }

    private boolean oa(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        dj djVar = oaVar.oyt;
        return djVar != null && djVar.cz();
    }

    public void uef(int i5) {
        this.lw.dhk();
        uef(false, true, false, i5);
        if (this.uef.moa) {
            this.cz.oa(10000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.oa.oa.uef(android.os.Message):void");
    }

    private void uef(long j8, long j10) {
        long j11 = j10 - j8;
        Activity activity = this.uef.pu;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).yo(j11, j10);
        }
    }

    public static void uef(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        final com.bytedance.sdk.openadsdk.core.ivm.moa moaVar;
        Context context = frameLayout.getContext();
        if (oaVar.ou) {
            com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
            yoVar.setId(bs.wrv);
            frameLayout.addView(yoVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutUef = uef(context);
            String strUef = "";
            if (gzw.lw(oaVar.f25412oa)) {
                com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = oaVar.f25412oa.nj();
                if (oaVarNj != null) {
                    strUef = oaVarNj.zjm();
                }
            } else {
                List<com.bytedance.sdk.openadsdk.core.model.sy> listLpy = oaVar.f25412oa.lpy();
                if (listLpy != null && !listLpy.isEmpty()) {
                    strUef = listLpy.get(0).uef();
                }
            }
            if (TextUtils.isEmpty(strUef)) {
                moaVar = null;
            } else {
                moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
                int i5 = bs.jh;
                moaVar.setId(i5);
                moaVar.setTag(i5, strUef);
                moaVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutUef.addView(moaVar);
            }
            yoVar.addView(frameLayoutUef);
            yoVar.addView(new com.bytedance.sdk.openadsdk.core.widget.dj(context), new FrameLayout.LayoutParams(-1, -1));
            View moaVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.moa(context);
            moaVar2.setId(bs.dz);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(moaVar2, layoutParams);
            moaVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.oa.oa.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = oaVar.km.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = oaVar.km.findViewById(bs.ovw);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = oaVar.km.findViewById(bs.cuu);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.ivm.moa moaVar3 = moaVar;
                    if (moaVar3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = moaVar3.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            moaVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
            lwVar.setId(bs.wk);
            lwVar.setOrientation(1);
            lwVar.setVisibility(8);
            frameLayout.addView(lwVar, new FrameLayout.LayoutParams(-1, -1));
        }
        if (oaVar.rl) {
            View ivmVar = new com.bytedance.sdk.component.cz.ivm(context, true, ivm.yo.ENDCARD);
            ivmVar.setId(bs.f26132ab);
            ivmVar.setLayerType(2, null);
            ivmVar.setVisibility(4);
            boolean zIvm = dhk.ivm(oaVar.f25412oa);
            boolean zWrv = dhk.wrv(oaVar.f25412oa);
            if (!oaVar.f25411ne && (zIvm || zWrv)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = af.oa(oaVar.af, 58.0f);
                frameLayout.addView(ivmVar, layoutParams2);
            } else {
                frameLayout.addView(ivmVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(bs.bs);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (cp.oa(oaVar.f25412oa)) {
                View yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
                yoVar2.setId(bs.ksq);
                yoVar2.setVisibility(4);
                frameLayout.addView(yoVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public static FrameLayout uef(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar.setId(bs.cq);
        yoVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        yoVar.setLayoutParams(layoutParams);
        return yoVar;
    }
}
