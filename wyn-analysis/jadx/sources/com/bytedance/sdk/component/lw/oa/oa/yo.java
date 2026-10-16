package com.bytedance.sdk.component.lw.oa.oa;

import com.bytedance.sdk.component.lw.oib;
import com.bytedance.sdk.component.lw.sy;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class yo implements ivm {
    private void oa(final com.bytedance.sdk.component.lw.oa oaVar, final com.bytedance.sdk.component.lw.oa.yo.ivm ivmVar, final String str, final byte[] bArr) {
        if (oaVar == null || !oaVar.xs()) {
            return;
        }
        ivmVar.bcc().submit(new Runnable() { // from class: com.bytedance.sdk.component.lw.oa.oa.yo.1
            @Override // java.lang.Runnable
            public void run() {
                ivmVar.yo(oaVar).uef(str, bArr);
            }
        });
    }

    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public boolean uef(com.bytedance.sdk.component.lw.oa.yo.yo yoVar, oib oibVar, com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        com.bytedance.sdk.component.lw.oa oaVarBs = yoVar.bs();
        com.bytedance.sdk.component.lw.oa.yo.ivm ivmVarAb = yoVar.ab();
        if (oaVarBs != null && ivmVarAb != null) {
            if (oaVarBs.ivm()) {
                if (oibVar != null) {
                    oibVar.uef("data_cache", yoVar);
                }
                sy syVarOa = ivmVarAb.oa(oaVarBs);
                bArrUef = syVarOa != null ? syVarOa.uef(yoVar.xs()) : null;
                if (oibVar != null) {
                    oibVar.oa("data_cache", yoVar);
                }
                yoVar.xs();
                yoVar.uef();
            }
            if (oaVarBs.xs() && bArrUef == null) {
                if (oibVar != null) {
                    oibVar.uef("disk_cache", yoVar);
                }
                byte[] bArrUef = uef(oaVarBs, ivmVarAb, yoVar.xs());
                if (bArrUef != null) {
                    uef(yoVar.bs(), ivmVarAb, yoVar.xs(), bArrUef);
                }
                if (oibVar != null) {
                    oibVar.oa("disk_cache", yoVar);
                }
                yoVar.xs();
                yoVar.uef();
                bArrUef = bArrUef;
            }
        }
        if (ivmVarAb != null && bArrUef == null) {
            if (oibVar != null) {
                oibVar.uef("net_request", yoVar);
            }
            bArrUef = uef(ivmVarAb, yoVar, uefVar);
            yoVar.xs();
            yoVar.uef();
            if (oibVar != null) {
                oibVar.oa("net_request", yoVar);
            }
        }
        if (bArrUef != null) {
            yoVar.uef(bArrUef);
            return true;
        }
        yoVar.xs();
        yoVar.uef();
        return false;
    }

    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public String uef() {
        return "data_intercept";
    }

    private byte[] uef(com.bytedance.sdk.component.lw.oa.yo.ivm ivmVar, com.bytedance.sdk.component.lw.oa.yo.yo yoVar, com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        com.bytedance.sdk.component.lw.moa moaVarLw = ivmVar.lw();
        yoVar.uef(false);
        try {
            com.bytedance.sdk.component.lw.ivm ivmVarUef = moaVarLw.uef(new com.bytedance.sdk.component.lw.uef.oa(yoVar.uef(), false, false, yoVar.sy()));
            if (ivmVarUef == null) {
                uefVar.uef(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iUef = ivmVarUef.uef();
            if (iUef == 200) {
                byte[] bArr = (byte[]) ivmVarUef.oa();
                if (bArr == null) {
                    uefVar.uef(iUef, ivmVarUef.yo(), new Exception("net data is empty"));
                    return null;
                }
                uef(yoVar.bs(), ivmVar, yoVar.xs(), bArr);
                oa(yoVar.bs(), ivmVar, yoVar.xs(), bArr);
                return bArr;
            }
            Object objOa = ivmVarUef.oa();
            uefVar.uef(iUef, ivmVarUef.yo(), objOa instanceof Throwable ? (Throwable) objOa : null);
            return null;
        } catch (Throwable th) {
            uefVar.uef(1004, "net request failed!", th);
            return null;
        }
    }

    private byte[] uef(com.bytedance.sdk.component.lw.oa oaVar, com.bytedance.sdk.component.lw.oa.yo.ivm ivmVar, String str) {
        ivmVar.yo(oaVar);
        Collection<com.bytedance.sdk.component.lw.yo> collectionMoa = ivmVar.moa();
        if (collectionMoa == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.lw.yo> it = collectionMoa.iterator();
        while (it.hasNext()) {
            byte[] bArrUef = it.next().uef((com.bytedance.sdk.component.lw.yo) str);
            if (bArrUef != null) {
                return bArrUef;
            }
        }
        return null;
    }

    private void uef(com.bytedance.sdk.component.lw.oa oaVar, com.bytedance.sdk.component.lw.oa.yo.ivm ivmVar, String str, byte[] bArr) {
        if (oaVar == null || !oaVar.ivm()) {
            return;
        }
        ivmVar.oa(oaVar).uef(str, bArr);
    }
}
