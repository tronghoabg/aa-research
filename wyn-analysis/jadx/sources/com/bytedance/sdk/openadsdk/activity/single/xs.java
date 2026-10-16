package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.activity.single.oa;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.ab;
import com.bytedance.sdk.openadsdk.component.reward.view.dj;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.oa;
import com.google.android.gms.common.api.f;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class xs extends uef {
    private static String dhk;
    private static String gsd;
    private static String gzw;
    private static String orq;
    private static String tpx;
    private int rt;

    public xs(oa oaVar, gzw gzwVar, int i5, int i10, boolean z2) {
        super(oaVar, gzwVar, i5, i10, z2);
        this.rt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ou() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r0 = r0.tpx
            r0.dxx()
            com.bytedance.sdk.openadsdk.moa.lw.oa.wk$uef r0 = new com.bytedance.sdk.openadsdk.moa.lw.oa.wk$uef
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.cq()
            r0.oa(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.gr()
            r0.moa(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.bs()
            r0.yo(r1)
            r1 = 3
            r0.yo(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            int r1 = r1.rt()
            r0.moa(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.oa()
            r0.uef(r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            com.bykv.vk.openvk.uef.uef.uef.oa.uef r1 = r1.bcc()
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r2 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r2 = r2.tpx
            com.bytedance.sdk.openadsdk.moa.xs r2 = r2.lw()
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            int r0 = r0.ivm
            com.bytedance.sdk.openadsdk.core.pz.yo(r0)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r0 = r0.tpx
            java.lang.String r1 = "skip"
            r2 = 0
            r0.uef(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            boolean r0 = r0.yo
            if (r0 == 0) goto L8a
            r0 = 1
            r1 = 4
            r3.uef(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dhk.uef(r0)
            if (r0 == 0) goto L8d
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.cq
            boolean r0 = r0.get()
            if (r0 != 0) goto L8d
        L8a:
            r3.swd()
        L8d:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            com.bytedance.sdk.openadsdk.core.model.moa r0 = r0.odd()
            if (r0 == 0) goto Lab
            com.bytedance.sdk.openadsdk.core.dz.moa r0 = r0.uef()
            if (r0 == 0) goto Lab
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r1 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.bs r1 = r1.tpx
            long r1 = r1.cq()
            r0.ivm(r1)
            r0.lw(r1)
        Lab:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            r1 = 5
            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.xs.ou():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void b_() {
        oa oaVar = this.xs;
        if (oaVar != null && oaVar.yo()) {
            super.b_();
            return;
        }
        final View viewZjm = this.cz.oyt.zjm();
        if (viewZjm != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.xs.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (xs.this.cz.ku.dhk() && xs.this.cz.cz.get()) {
                        boolean zCq = xs.this.cz.fz.cq();
                        xs.this.cz.ku.ivm(zCq);
                        xs.this.cz.oyt.ivm(8);
                        xs.this.cz.sk.sendEmptyMessageDelayed(600, 5000L);
                        if (!gzw.yo(xs.this.cz.f25412oa)) {
                            return;
                        }
                        if (gzw.yo(xs.this.cz.f25412oa) && zCq) {
                            return;
                        }
                    }
                    xs.this.cz.ku.tpx();
                    xs.this.cz.fz.dj();
                    xs.this.cz.gr.ivm();
                    if (cp.moa(xs.this.cz.f25412oa)) {
                        xs.this.uef(true, true, (Runnable) null);
                    } else {
                        xs.this.swd();
                    }
                }
            };
            viewZjm.setOnClickListener(onClickListener);
            viewZjm.setTag(viewZjm.getId(), onClickListener);
        }
        this.cz.dxx.uef(new com.bytedance.sdk.openadsdk.component.reward.top.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.xs.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void moa(View view) {
                xs xsVar = xs.this;
                xsVar.oa(xsVar.cz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void oa(View view) {
                xs.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view) {
                xs xsVar = xs.this;
                xsVar.uef(cp.yo(xsVar.cz.f25412oa), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void yo(View view) {
                View view2 = viewZjm;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view, String str) {
                xs.this.uef(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.uef, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void bs() {
        etd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean d_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public String e_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void f_() {
        this.cz.pz.uef(((uef) this).f25260oa);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean g_() {
        return this.cz.gem;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void km() {
        super.km();
        this.lw = false;
        this.cz.gsd.oa(false);
        this.cz.tpx.gem();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.uef
    public FrameLayout xs() {
        dj djVar;
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar;
        if (this.ivm.ivm()) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
            if (oaVar == null || (czVar = oaVar.gsd) == null) {
                return null;
            }
            return czVar.oa();
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
        if (oaVar2 == null || (djVar = oaVar2.oyt) == null) {
            return null;
        }
        return djVar.ivm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.uef
    public void oa() {
        this.cz.dxx.uef(null, TTAdDislikeToast.getSkipText());
        this.cz.dxx.lw(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(int i5) {
        if (i5 == 10000) {
            etd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.uef, com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(Activity activity, oa.lw lwVar) {
        oa oaVar;
        super.uef(activity, lwVar);
        if (com.bytedance.sdk.component.utils.oa.uef(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.wk = intent.getStringExtra("media_extra");
        this.dz = intent.getStringExtra("user_id");
        try {
            if (gzw == null) {
                gzw = orq.uef(this.cz.af, "tt_reward_msg");
                dhk = orq.uef(this.cz.af, "tt_msgPlayable");
                orq = orq.uef(this.cz.af, "tt_negtiveBtnBtnText");
                gsd = orq.uef(this.cz.af, "tt_postiveBtnText");
                tpx = orq.uef(this.cz.af, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            dhk.yo("TTAD.RewardAdScene", th.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
        if (oaVar2 == null || (oaVar = this.xs) == null) {
            return;
        }
        oaVar2.xvp = oaVar.uef;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(String str) {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        oaVar.gem = !oaVar.gem;
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = oaVar.gsd;
        if (czVar != null && czVar.uef() != null) {
            this.cz.gsd.uef().setSoundMute(this.cz.gem);
        }
        StringBuilder sb2 = new StringBuilder("will set is Mute ");
        sb2.append(this.cz.gem);
        sb2.append(" mLastVolume=");
        sb2.append(this.cz.cp.uef());
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
        oaVar2.tpx.uef(oaVar2.gem, str);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.cz;
        oaVar3.ku.lw(oaVar3.gem);
        gzw gzwVar = this.cz.f25412oa;
        if (gzwVar == null || (moaVarOdd = gzwVar.odd()) == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar4 = this.cz;
        if (oaVar4.gem) {
            moaVarUef.bcc(oaVar4.tpx.cq());
        } else {
            moaVarUef.cz(oaVar4.tpx.cq());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(final boolean z2, boolean z10, final Runnable runnable) {
        if (!z10 && this.xs.cq() && runnable != null) {
            return false;
        }
        if (!sy.moa().bcc(String.valueOf(this.cz.ivm))) {
            if (runnable == null) {
                if (z2) {
                    swd();
                    return false;
                }
                ou();
            }
            return false;
        }
        if (this.xs.bs()) {
            if (runnable == null) {
                if (z2) {
                    swd();
                    return false;
                }
                ou();
            }
            return false;
        }
        this.cz.bs.set(true);
        this.cz.tpx.orq();
        if (z2) {
            this.cz.gzw.ivm();
        }
        final com.bytedance.sdk.openadsdk.core.widget.oa oaVar = new com.bytedance.sdk.openadsdk.core.widget.oa(rl());
        ((uef) this).f25260oa.wrv = oaVar;
        if (z2) {
            oaVar.uef(dhk).yo(tpx).moa(orq);
        } else {
            oaVar.uef(gzw).yo(gsd).moa(orq);
        }
        ((uef) this).f25260oa.wrv.uef(new oa.InterfaceC0102oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.xs.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
            public void oa() {
                oaVar.dismiss();
                xs.this.xs.oa(true);
                xs.this.cz.bs.set(false);
                xs.this.cz.gzw.oa(f.API_PRIORITY_OTHER);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z2) {
                    xs.this.ou();
                } else {
                    xs.this.cz.gr.ivm();
                    xs.this.swd();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
            public void uef() {
                xs.this.cz.tpx.tpx();
                if (z2) {
                    xs.this.cz.gzw.uef(1000);
                }
                oaVar.dismiss();
                xs.this.cz.bs.set(false);
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.uef, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.cz.sw != null && this.xs.rt() == null) {
            oa oaVar = this.xs;
            if (oaVar != null && oaVar.yo()) {
                ab abVar = this.oib;
                if (abVar != null && abVar.uef(cp.yo(this.cz.f25412oa), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.xs.4
                    @Override // java.lang.Runnable
                    public void run() {
                        xs.super.uef(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (uef(cp.yo(this.cz.f25412oa), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.xs.5
                @Override // java.lang.Runnable
                public void run() {
                    xs.super.uef(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.uef(str, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa r3) {
        /*
            r2 = this;
            boolean r0 = r3.yo
            if (r0 == 0) goto L19
            r0 = 1
            r1 = 4
            r2.uef(r0, r1)
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r3.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dhk.uef(r0)
            if (r0 == 0) goto L1c
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.cq
            boolean r0 = r0.get()
            if (r0 != 0) goto L1c
        L19:
            r2.swd()
        L1c:
            com.bytedance.sdk.openadsdk.common.uef.oa(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.xs.uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa):void");
    }
}
