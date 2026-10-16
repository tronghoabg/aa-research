package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Path;
import com.bytedance.adsdk.oa.uef.oa.uef;

/* loaded from: classes.dex */
public class sy implements uef.InterfaceC0035uef, cq {
    private boolean ivm;
    private final com.bytedance.adsdk.oa.uef.oa.cq lw;
    private final com.bytedance.adsdk.oa.cz moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f24589oa;
    private final Path uef = new Path();
    private final oa xs = new oa();
    private final boolean yo;

    public sy(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.bs bsVar) {
        this.f24589oa = bsVar.uef();
        this.yo = bsVar.yo();
        this.moa = czVar;
        com.bytedance.adsdk.oa.uef.oa.cq cqVarUef = bsVar.oa().uef();
        this.lw = cqVarUef;
        uefVar.uef(cqVarUef);
        cqVarUef.uef(this);
    }

    private void oa() {
        this.ivm = false;
        this.moa.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.cq
    public Path moa() {
        if (this.ivm) {
            return this.uef;
        }
        this.uef.reset();
        if (this.yo) {
            this.ivm = true;
            return this.uef;
        }
        Path pathXs = this.lw.xs();
        if (pathXs == null) {
            return this.uef;
        }
        this.uef.set(pathXs);
        this.uef.setFillType(Path.FillType.EVEN_ODD);
        this.xs.uef(this.uef);
        this.ivm = true;
        return this.uef;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        oa();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(java.util.List<com.bytedance.adsdk.oa.uef.uef.yo> r6, java.util.List<com.bytedance.adsdk.oa.uef.uef.yo> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            com.bytedance.adsdk.oa.uef.uef.yo r1 = (com.bytedance.adsdk.oa.uef.uef.yo) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.oa.uef.uef.tpx
            if (r2 == 0) goto L26
            r2 = r1
            com.bytedance.adsdk.oa.uef.uef.tpx r2 = (com.bytedance.adsdk.oa.uef.uef.tpx) r2
            com.bytedance.adsdk.oa.yo.oa.oib$uef r3 = r2.oa()
            com.bytedance.adsdk.oa.yo.oa.oib$uef r4 = com.bytedance.adsdk.oa.yo.oa.oib.uef.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            com.bytedance.adsdk.oa.uef.uef.oa r1 = r5.xs
            r1.uef(r2)
            r2.uef(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof com.bytedance.adsdk.oa.uef.uef.oib
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            com.bytedance.adsdk.oa.uef.uef.oib r1 = (com.bytedance.adsdk.oa.uef.uef.oib) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            com.bytedance.adsdk.oa.uef.oa.cq r6 = r5.lw
            r6.uef(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.uef.uef.sy.uef(java.util.List, java.util.List):void");
    }
}
