package com.bytedance.sdk.openadsdk.moa.uef;

import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.ue;

/* loaded from: classes3.dex */
class bcc implements com.bytedance.sdk.openadsdk.ab.oa.yo {
    public static final bcc uef = new bcc();

    private bcc() {
    }

    @Override // com.bytedance.sdk.openadsdk.ab.oa.yo
    public void uef(com.bytedance.sdk.openadsdk.ab.oa oaVar) {
        uef(oaVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.ab.oa.yo
    public void uef(final com.bytedance.sdk.openadsdk.ab.oa oaVar, final boolean z2) {
        uef(new com.bytedance.sdk.component.bcc.oa.yo("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.moa.uef.bcc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.ab.uef.yo yoVarUef = oaVar.uef();
                    if (yoVarUef == null) {
                        return;
                    }
                    com.bytedance.sdk.component.ivm.uef.moa.uef.uef uefVar = new com.bytedance.sdk.component.ivm.uef.moa.uef.uef(ue.uef(), yoVarUef.uef());
                    uefVar.uef((byte) 0);
                    uefVar.yo(z2 ? (byte) 2 : (byte) 3);
                    uefVar.oa((byte) 1);
                    if (com.bytedance.sdk.component.ivm.uef.oa.oa()) {
                        oa.uef(sy.uef());
                    }
                    com.bytedance.sdk.component.ivm.uef.oa.uef(uefVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void uef(com.bytedance.sdk.component.bcc.oa.yo yoVar) {
        if (yoVar == null) {
            return;
        }
        if (!km.xs()) {
            km.oa(yoVar, 5);
        } else {
            yoVar.run();
        }
    }
}
