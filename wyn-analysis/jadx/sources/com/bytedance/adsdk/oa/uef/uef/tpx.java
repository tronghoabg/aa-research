package com.bytedance.adsdk.oa.uef.uef;

import com.bytedance.adsdk.oa.uef.oa.uef;
import com.bytedance.adsdk.oa.yo.oa.oib;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class tpx implements uef.InterfaceC0035uef, yo {
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> ivm;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> lw;
    private final oib.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private final boolean f24590oa;
    private final String uef;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> xs;
    private final List<uef.InterfaceC0035uef> yo = new ArrayList();

    public tpx(com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.oib oibVar) {
        this.uef = oibVar.uef();
        this.f24590oa = oibVar.ivm();
        this.moa = oibVar.oa();
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef = oibVar.moa().uef();
        this.lw = uefVarUef;
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef2 = oibVar.yo().uef();
        this.ivm = uefVarUef2;
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef3 = oibVar.lw().uef();
        this.xs = uefVarUef3;
        uefVar.uef(uefVarUef);
        uefVar.uef(uefVarUef2);
        uefVar.uef(uefVarUef3);
        uefVarUef.uef(this);
        uefVarUef2.uef(this);
        uefVarUef3.uef(this);
    }

    public boolean ivm() {
        return this.f24590oa;
    }

    public com.bytedance.adsdk.oa.uef.oa.uef<?, Float> lw() {
        return this.xs;
    }

    public com.bytedance.adsdk.oa.uef.oa.uef<?, Float> moa() {
        return this.ivm;
    }

    public oib.uef oa() {
        return this.moa;
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
    }

    public com.bytedance.adsdk.oa.uef.oa.uef<?, Float> yo() {
        return this.lw;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        for (int i5 = 0; i5 < this.yo.size(); i5++) {
            this.yo.get(i5).uef();
        }
    }

    public void uef(uef.InterfaceC0035uef interfaceC0035uef) {
        this.yo.add(interfaceC0035uef);
    }
}
