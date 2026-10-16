package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.pz;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;

/* loaded from: classes3.dex */
public class uef {

    public interface oa {
        void uef();

        void uef(boolean z2, int i5);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.common.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0076uef {
        void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, View view);
    }

    public static void oa(dz dzVar) {
        uef(dzVar);
        dzVar.uef().dxx.uef(yo(dzVar));
    }

    private static com.bytedance.sdk.openadsdk.component.reward.top.oa yo(final dz dzVar) {
        final com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarUef = dzVar.uef();
        final String strOa = dzVar.oa();
        final oa oaVarMoa = dzVar.moa();
        final ab abVarIvm = dzVar.ivm();
        final boolean zLw = dzVar.lw();
        return new com.bytedance.sdk.openadsdk.component.reward.top.oa() { // from class: com.bytedance.sdk.openadsdk.common.uef.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void moa(View view) {
                if (dzVar.uef() == null || dzVar.xs() == null) {
                    return;
                }
                dzVar.xs().uef(dzVar.uef(), view);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void oa(View view) {
                com.bytedance.sdk.openadsdk.component.reward.uef.moa moaVar;
                com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar;
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = oaVarUef;
                if (oaVar2 == null || (moaVar = oaVar2.pz) == null || (oaVar = oaVar2.f25410hg) == null) {
                    return;
                }
                moaVar.uef(oaVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view) {
                if (uef.oa(abVarIvm, oaVarUef, false, strOa)) {
                    return;
                }
                if (zLw && uef.oa(oaVarUef, strOa, oaVarMoa)) {
                    return;
                }
                uef.uef(oaVarUef);
                uef.uef(oaVarUef, oaVarMoa);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void yo(View view) {
                com.bytedance.sdk.openadsdk.component.reward.view.dj djVar;
                View viewZjm;
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = oaVarUef;
                if (oaVar == null || (djVar = oaVar.oyt) == null || (viewZjm = djVar.zjm()) == null) {
                    return;
                }
                viewZjm.performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view, String str) {
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = oaVarUef;
                if (oaVar == null) {
                    return;
                }
                uef.uef(oaVar, oaVar.f25410hg, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean oa(ab abVar, com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, boolean z2, String str) {
        if (abVar == null) {
            return false;
        }
        if (!abVar.uef(cp.yo(oaVar.f25412oa), z2, null) && (oaVar.sw instanceof com.bytedance.sdk.openadsdk.activity.single.lw)) {
            return ((com.bytedance.sdk.openadsdk.activity.single.lw) oaVar.sw).bcc();
        }
        return true;
    }

    public static void uef(final dz dzVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.dj djVar;
        final View viewZjm;
        final com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarUef = dzVar.uef();
        if (oaVarUef == null || (djVar = oaVarUef.oyt) == null || (viewZjm = djVar.zjm()) == null) {
            return;
        }
        final String strOa = dzVar.oa();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.uef.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (uef.oa(oaVarUef, viewZjm)) {
                    return;
                }
                oaVarUef.ku.tpx();
                oaVarUef.fz.dj();
                oaVarUef.gr.ivm();
                ab abVarIvm = dzVar.ivm();
                if (abVarIvm == null || !cp.moa(oaVarUef.f25412oa)) {
                    dzVar.yo().run();
                    return;
                }
                boolean zOa = uef.oa(abVarIvm, oaVarUef, true, strOa);
                if (!(oaVarUef.sw instanceof com.bytedance.sdk.openadsdk.activity.single.lw) || zOa) {
                    return;
                }
                dzVar.yo().run();
            }
        };
        viewZjm.setOnClickListener(onClickListener);
        viewZjm.setTag(viewZjm.getId(), onClickListener);
    }

    private static void yo(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        gzw gzwVar;
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null || (moaVarOdd = gzwVar.odd()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef = moaVarOdd.uef();
        long jCq = oaVar.tpx.cq();
        if (oaVar.gem) {
            moaVarUef.bcc(jCq);
        } else {
            moaVarUef.cz(jCq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean oa(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, String str, oa oaVar2) {
        if (oaVar.sw instanceof com.bytedance.sdk.openadsdk.activity.single.lw) {
            oaVar2.uef();
            return true;
        }
        boolean zBcc = cp.bcc(oaVar.f25412oa);
        boolean zIvm = cp.ivm(oaVar.f25412oa);
        boolean zLw = cp.lw(oaVar.f25412oa);
        if (!zIvm && (!zLw || !oaVar.gzw.moa(com.bytedance.sdk.openadsdk.component.reward.uef.cz.f25398oa))) {
            if (com.bytedance.sdk.openadsdk.core.model.dhk.uef(oaVar.f25412oa) && !oaVar.cq.get()) {
                oaVar2.uef();
                return true;
            }
            oaVar.dxx.moa(false);
            return false;
        }
        if (zBcc) {
            oaVar.gzw.cz();
        } else {
            View viewZjm = oaVar.oyt.zjm();
            if (viewZjm != null) {
                viewZjm.performClick();
            } else {
                oaVar2.uef();
            }
        }
        return true;
    }

    public static void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        if (oaVar == null) {
            return;
        }
        wk.uef uefVar = new wk.uef();
        uefVar.oa(oaVar.tpx.cq());
        uefVar.moa(oaVar.tpx.gr());
        uefVar.yo(oaVar.tpx.bs());
        uefVar.yo(3);
        uefVar.moa(oaVar.tpx.rt());
        uefVar.uef(oaVar.tpx.oa());
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(oaVar.tpx.bcc(), uefVar, oaVar.tpx.lw());
        pz.yo(oaVar.ivm);
        oaVar.tpx.uef("skip", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean oa(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, View view) {
        if (!oaVar.ku.dhk() || (!oaVar.vjj && !oaVar.cz.get())) {
            return false;
        }
        boolean zCq = oaVar.fz.cq();
        oaVar.ku.ivm(zCq);
        oaVar.oyt.ivm(8);
        if (view instanceof com.bytedance.sdk.openadsdk.core.ivm.moa) {
            ((com.bytedance.sdk.openadsdk.core.ivm.moa) view).setImageResource(com.bytedance.sdk.component.utils.orq.moa(oaVar.af, "tt_close_btn"));
        }
        oaVar.sk.sendEmptyMessageDelayed(600, 5000L);
        return !gzw.yo(oaVar.f25412oa) || zCq;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa r3, com.bytedance.sdk.openadsdk.common.uef.oa r4) {
        /*
            boolean r0 = r3.yo
            if (r0 == 0) goto L31
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r3.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dhk.yo(r0)
            r1 = 4
            r2 = 1
            if (r0 == 0) goto L1e
            com.bytedance.sdk.openadsdk.component.reward.view.cz r0 = r3.gsd
            com.bytedance.sdk.openadsdk.component.reward.view.yo r0 = r0.uef()
            if (r0 == 0) goto L1a
            int r0 = r0.moa
            if (r0 == 0) goto L31
        L1a:
            r4.uef(r2, r1)
            goto L34
        L1e:
            r4.uef(r2, r1)
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r3.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dhk.uef(r0)
            if (r0 == 0) goto L34
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.cq
            boolean r0 = r0.get()
            if (r0 != 0) goto L34
        L31:
            r4.uef()
        L34:
            oa(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.uef.uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa, com.bytedance.sdk.openadsdk.common.uef$oa):void");
    }

    public static void oa(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        if (oaVar == null) {
            return;
        }
        gzw gzwVar = oaVar.f25412oa;
        if (gzwVar != null && (moaVarOdd = gzwVar.odd()) != null && (moaVarUef = moaVarOdd.uef()) != null) {
            long jCq = oaVar.tpx.cq();
            moaVarUef.ivm(jCq);
            moaVarUef.lw(jCq);
        }
        com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(oaVar.f25412oa, 5);
    }

    public static void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar2, String str) {
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar;
        if (oaVar == null || oaVar.f25410hg == null) {
            return;
        }
        oaVar.gem = !oaVar.gem;
        boolean z2 = oaVar.sw instanceof com.bytedance.sdk.openadsdk.activity.single.lw;
        if (oaVar.vjj && !z2 && (czVar = oaVar.gsd) != null && czVar.uef() != null) {
            oaVar.gsd.uef().setSoundMute(oaVar.gem);
        }
        oaVar.tpx.uef(oaVar.gem, str);
        oaVar.ku.lw(oaVar.gem);
        oaVar.gzw.oa(oaVar.gem);
        if (z2) {
            return;
        }
        yo(oaVar);
    }
}
