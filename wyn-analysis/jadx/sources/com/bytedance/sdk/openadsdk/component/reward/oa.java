package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.pu;

/* loaded from: classes3.dex */
public class oa {
    public static void uef(final gzw gzwVar, final boolean z2, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.oa.1
            @Override // java.lang.Runnable
            public void run() {
                gzw gzwVar2 = gzwVar;
                if (gzwVar2 == null || gzwVar2.tpq() || gzw.ivm(gzwVar)) {
                    return;
                }
                try {
                    Context contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
                    AdSlot adSlotCl = gzwVar.cl();
                    if (adSlotCl != null) {
                        boolean zYo = com.bytedance.sdk.openadsdk.utils.oa.yo();
                        if (zYo) {
                            if (z10) {
                                sy.uef(contextUef).uef(adSlotCl.getCodeId(), gzwVar);
                            } else {
                                xs.uef(contextUef).uef(adSlotCl.getCodeId(), gzwVar);
                            }
                        } else if (z10) {
                            bs.uef(contextUef).uef(adSlotCl.getCodeId(), gzwVar);
                        } else {
                            ivm.uef(contextUef).uef(adSlotCl.getCodeId(), gzwVar);
                        }
                        if (z2) {
                            if (zYo) {
                                if (z10) {
                                    sy.uef(contextUef).uef(adSlotCl);
                                    return;
                                } else {
                                    xs.uef(contextUef).uef(adSlotCl);
                                    return;
                                }
                            }
                            if (z10) {
                                bs.uef(contextUef).uef(adSlotCl);
                            } else {
                                ivm.uef(contextUef).uef(adSlotCl);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean uef(final com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        com.bytedance.sdk.openadsdk.activity.single.oa oaVarSk;
        int iDxx = 0;
        if (oaVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = oaVar.sw;
        if (bccVar == null || bccVar.sk() == null) {
            oaVarSk = null;
        } else {
            oaVarSk = oaVar.sw.sk();
            if (oaVarSk != null) {
                iDxx = oaVarSk.dxx();
            }
        }
        boolean zUef = pu.uef(oaVar.pu, oaVar.f25412oa, oaVar.lw, oaVar.moa ? 7 : 5, iDxx);
        if (zUef) {
            if (oaVar.f25412oa != null) {
                cp.uef().uef(oaVar.f25412oa, new cp.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.oa.2
                    @Override // com.bytedance.sdk.openadsdk.core.cp.oa
                    public void uef() {
                        com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar2;
                        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = oaVar;
                        if (oaVar3 == null || (oaVar2 = oaVar3.gb) == null) {
                            return;
                        }
                        oaVar2.hts();
                    }
                });
            }
            if (oaVarSk != null && oaVarSk.gr()) {
                oaVarSk.cp();
            }
        }
        return zUef;
    }
}
