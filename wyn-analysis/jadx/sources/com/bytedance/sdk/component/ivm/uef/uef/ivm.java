package com.bytedance.sdk.component.ivm.uef.uef;

import com.bytedance.sdk.component.ivm.uef.uef.oa.xs;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class ivm implements moa {
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef bcc;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef cq;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef cz;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef dj;
    private Queue<String> dz;
    private com.bytedance.sdk.component.ivm.uef.uef.oa.yo ivm;
    private xs lw;
    private com.bytedance.sdk.component.ivm.uef.uef.oa.oa moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.ivm.uef.uef.oa.lw f25008oa;
    lw uef = com.bytedance.sdk.component.ivm.uef.xs.ivm().yo();
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef wrv;
    private com.bytedance.sdk.component.ivm.uef.uef.oa.ivm xs;
    private com.bytedance.sdk.component.ivm.uef.uef.oa.uef yo;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef zjm;

    public ivm(Queue<String> queue) {
        this.dz = queue;
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.uef()) {
            com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVarDj = com.bytedance.sdk.component.ivm.uef.xs.ivm().dj();
            this.bcc = uefVarDj;
            this.f25008oa = new com.bytedance.sdk.component.ivm.uef.uef.oa.lw(uefVarDj, queue);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.lw()) {
            if (com.bytedance.sdk.component.ivm.uef.xs.ivm().cz() != null) {
                this.zjm = com.bytedance.sdk.component.ivm.uef.xs.ivm().cz();
            } else {
                this.zjm = com.bytedance.sdk.component.ivm.uef.xs.ivm().wrv();
            }
            this.moa = new com.bytedance.sdk.component.ivm.uef.uef.oa.oa(this.zjm, queue);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.oa()) {
            com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVarWrv = com.bytedance.sdk.component.ivm.uef.xs.ivm().wrv();
            this.cz = uefVarWrv;
            this.yo = new com.bytedance.sdk.component.ivm.uef.uef.oa.uef(uefVarWrv, queue);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.yo()) {
            com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVarWrv2 = com.bytedance.sdk.component.ivm.uef.xs.ivm().wrv();
            this.dj = uefVarWrv2;
            this.lw = new xs(uefVarWrv2, queue);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.moa()) {
            com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVarCq = com.bytedance.sdk.component.ivm.uef.xs.ivm().cq();
            this.wrv = uefVarCq;
            this.ivm = new com.bytedance.sdk.component.ivm.uef.uef.oa.yo(uefVarCq, queue);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.ivm()) {
            com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVarDz = com.bytedance.sdk.component.ivm.uef.xs.ivm().dz();
            this.cq = uefVarDz;
            this.xs = new com.bytedance.sdk.component.ivm.uef.uef.oa.ivm(uefVarDz, queue);
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public void uef(int i5, long j8) {
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, int i5) {
        try {
            byte bMoa = uefVar.moa();
            byte bLw = uefVar.lw();
            if (bMoa == 0 && bLw == 1 && com.bytedance.sdk.component.ivm.uef.oa.uef.uef()) {
                this.f25008oa.uef(uefVar);
                return;
            }
            if (bMoa == 3 && bLw == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.lw()) {
                this.moa.uef(uefVar);
                return;
            }
            if (bMoa == 0 && bLw == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.oa()) {
                this.yo.uef(uefVar);
                return;
            }
            if (bMoa == 1 && bLw == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.yo()) {
                this.lw.uef(uefVar);
                return;
            }
            if (bMoa == 1 && bLw == 3 && com.bytedance.sdk.component.ivm.uef.oa.uef.moa()) {
                this.ivm.uef(uefVar);
            } else if (bMoa == 2 && bLw == 3 && com.bytedance.sdk.component.ivm.uef.oa.uef.ivm()) {
                this.xs.uef(uefVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public void uef(int i5, List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.ivm.uef.moa.uef uefVar = list.get(0);
        byte bLw = uefVar.lw();
        byte bMoa = uefVar.moa();
        if (bMoa == 0 && bLw == 1 && com.bytedance.sdk.component.ivm.uef.oa.uef.uef()) {
            this.f25008oa.uef(i5, list);
            return;
        }
        if (bMoa == 3 && bLw == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.lw()) {
            this.moa.uef(i5, list);
            return;
        }
        if (bMoa == 0 && bLw == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.oa()) {
            this.yo.uef(i5, list);
            return;
        }
        if (bMoa == 1 && bLw == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.yo()) {
            this.lw.uef(i5, list);
            return;
        }
        if (bMoa == 1 && bLw == 3 && com.bytedance.sdk.component.ivm.uef.oa.uef.moa()) {
            this.ivm.uef(i5, list);
        } else if (bMoa == 2 && bLw == 3 && com.bytedance.sdk.component.ivm.uef.oa.uef.ivm()) {
            this.xs.uef(i5, list);
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public List<com.bytedance.sdk.component.ivm.uef.moa.uef> uef(int i5, int i10, List<String> list) {
        List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef;
        List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef2;
        List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef3;
        List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef4;
        List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef5;
        List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef6;
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.uef() && this.f25008oa.oa(i5, i10) && (listUef6 = this.f25008oa.uef(i5, i10)) != null && listUef6.size() != 0) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.sy(), 1);
            return listUef6;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.lw() && this.moa.oa(i5, i10) && (listUef5 = this.moa.uef(i5, i10)) != null && listUef5.size() != 0) {
            return listUef5;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.oa() && this.yo.oa(i5, i10) && (listUef4 = this.yo.uef(i5, i10)) != null && listUef4.size() != 0) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.oib(), 1);
            return listUef4;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.yo() && this.lw.oa(i5, i10) && (listUef3 = this.lw.uef(i5, i10)) != null && listUef3.size() != 0) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.dhk(), 1);
            return listUef3;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.moa() && this.ivm.oa(i5, i10) && (listUef2 = this.ivm.uef(i5, i10)) != null && listUef2.size() != 0) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.tpx(), 1);
            return listUef2;
        }
        if (!com.bytedance.sdk.component.ivm.uef.oa.uef.ivm() || !this.xs.oa(i5, i10) || (listUef = this.xs.uef(i5, i10)) == null || listUef.size() == 0) {
            return null;
        }
        return listUef;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public boolean uef(int i5, boolean z2) {
        com.bytedance.sdk.component.ivm.uef.uef.oa.ivm ivmVar;
        com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar;
        com.bytedance.sdk.component.ivm.uef.uef.oa.yo yoVar;
        com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar2;
        xs xsVar;
        com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar3;
        com.bytedance.sdk.component.ivm.uef.uef.oa.uef uefVar4;
        com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar5;
        com.bytedance.sdk.component.ivm.uef.uef.oa.oa oaVar;
        com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar6;
        com.bytedance.sdk.component.ivm.uef.uef.oa.lw lwVar;
        com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar7;
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.uef() && (lwVar = this.f25008oa) != null && (uefVar7 = this.bcc) != null && lwVar.oa(i5, uefVar7.uef())) {
            return true;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.lw() && (oaVar = this.moa) != null && (uefVar6 = this.zjm) != null && oaVar.oa(i5, uefVar6.uef())) {
            return true;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.oa() && (uefVar4 = this.yo) != null && (uefVar5 = this.cz) != null && uefVar4.oa(i5, uefVar5.uef())) {
            return true;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.yo() && (xsVar = this.lw) != null && (uefVar3 = this.dj) != null && xsVar.oa(i5, uefVar3.uef())) {
            return true;
        }
        if (!com.bytedance.sdk.component.ivm.uef.oa.uef.moa() || (yoVar = this.ivm) == null || (uefVar2 = this.wrv) == null || !yoVar.oa(i5, uefVar2.uef())) {
            return com.bytedance.sdk.component.ivm.uef.oa.uef.ivm() && (ivmVar = this.xs) != null && (uefVar = this.cq) != null && ivmVar.oa(i5, uefVar.uef());
        }
        return true;
    }
}
