package com.bytedance.adsdk.oa.yo.oa;

import com.bytedance.adsdk.oa.yo.oa.sy;
import java.util.List;

/* loaded from: classes.dex */
public class ivm implements yo {
    private final sy.uef bcc;
    private final boolean cq;
    private final sy.oa cz;
    private final List<com.bytedance.adsdk.oa.yo.uef.oa> dj;
    private final com.bytedance.adsdk.oa.yo.uef.ivm ivm;
    private final com.bytedance.adsdk.oa.yo.uef.ivm lw;
    private final com.bytedance.adsdk.oa.yo.uef.moa moa;

    /* renamed from: oa, reason: collision with root package name */
    private final xs f24621oa;
    private final String uef;
    private final com.bytedance.adsdk.oa.yo.uef.oa wrv;
    private final com.bytedance.adsdk.oa.yo.uef.oa xs;
    private final com.bytedance.adsdk.oa.yo.uef.yo yo;
    private final float zjm;

    public ivm(String str, xs xsVar, com.bytedance.adsdk.oa.yo.uef.yo yoVar, com.bytedance.adsdk.oa.yo.uef.moa moaVar, com.bytedance.adsdk.oa.yo.uef.ivm ivmVar, com.bytedance.adsdk.oa.yo.uef.ivm ivmVar2, com.bytedance.adsdk.oa.yo.uef.oa oaVar, sy.uef uefVar, sy.oa oaVar2, float f10, List<com.bytedance.adsdk.oa.yo.uef.oa> list, com.bytedance.adsdk.oa.yo.uef.oa oaVar3, boolean z2) {
        this.uef = str;
        this.f24621oa = xsVar;
        this.yo = yoVar;
        this.moa = moaVar;
        this.lw = ivmVar;
        this.ivm = ivmVar2;
        this.xs = oaVar;
        this.bcc = uefVar;
        this.cz = oaVar2;
        this.zjm = f10;
        this.dj = list;
        this.wrv = oaVar3;
        this.cq = z2;
    }

    public sy.uef bcc() {
        return this.bcc;
    }

    public boolean cq() {
        return this.cq;
    }

    public sy.oa cz() {
        return this.cz;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa dj() {
        return this.wrv;
    }

    public com.bytedance.adsdk.oa.yo.uef.ivm ivm() {
        return this.ivm;
    }

    public com.bytedance.adsdk.oa.yo.uef.ivm lw() {
        return this.lw;
    }

    public com.bytedance.adsdk.oa.yo.uef.moa moa() {
        return this.moa;
    }

    public xs oa() {
        return this.f24621oa;
    }

    public String uef() {
        return this.uef;
    }

    public float wrv() {
        return this.zjm;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa xs() {
        return this.xs;
    }

    public com.bytedance.adsdk.oa.yo.uef.yo yo() {
        return this.yo;
    }

    public List<com.bytedance.adsdk.oa.yo.uef.oa> zjm() {
        return this.dj;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.cz(czVar, uefVar, this);
    }
}
