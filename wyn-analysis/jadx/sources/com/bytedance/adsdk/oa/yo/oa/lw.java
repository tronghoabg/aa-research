package com.bytedance.adsdk.oa.yo.oa;

import android.graphics.Path;

/* loaded from: classes.dex */
public class lw implements yo {
    private final com.bytedance.adsdk.oa.yo.uef.oa bcc;
    private final com.bytedance.adsdk.oa.yo.uef.oa cz;
    private final com.bytedance.adsdk.oa.yo.uef.ivm ivm;
    private final com.bytedance.adsdk.oa.yo.uef.ivm lw;
    private final com.bytedance.adsdk.oa.yo.uef.moa moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Path.FillType f24622oa;
    private final xs uef;
    private final String xs;
    private final com.bytedance.adsdk.oa.yo.uef.yo yo;
    private final boolean zjm;

    public lw(String str, xs xsVar, Path.FillType fillType, com.bytedance.adsdk.oa.yo.uef.yo yoVar, com.bytedance.adsdk.oa.yo.uef.moa moaVar, com.bytedance.adsdk.oa.yo.uef.ivm ivmVar, com.bytedance.adsdk.oa.yo.uef.ivm ivmVar2, com.bytedance.adsdk.oa.yo.uef.oa oaVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar2, boolean z2) {
        this.uef = xsVar;
        this.f24622oa = fillType;
        this.yo = yoVar;
        this.moa = moaVar;
        this.lw = ivmVar;
        this.ivm = ivmVar2;
        this.xs = str;
        this.bcc = oaVar;
        this.cz = oaVar2;
        this.zjm = z2;
    }

    public boolean bcc() {
        return this.zjm;
    }

    public com.bytedance.adsdk.oa.yo.uef.ivm ivm() {
        return this.lw;
    }

    public com.bytedance.adsdk.oa.yo.uef.moa lw() {
        return this.moa;
    }

    public com.bytedance.adsdk.oa.yo.uef.yo moa() {
        return this.yo;
    }

    public xs oa() {
        return this.uef;
    }

    public String uef() {
        return this.xs;
    }

    public com.bytedance.adsdk.oa.yo.uef.ivm xs() {
        return this.ivm;
    }

    public Path.FillType yo() {
        return this.f24622oa;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.bcc(czVar, xsVar, uefVar, this);
    }
}
