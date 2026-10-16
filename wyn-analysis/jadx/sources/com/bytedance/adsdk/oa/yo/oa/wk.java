package com.bytedance.adsdk.oa.yo.oa;

import A7.AbstractC0279p0;
import android.graphics.Path;

/* loaded from: classes.dex */
public class wk implements yo {
    private final boolean ivm;
    private final com.bytedance.adsdk.oa.yo.uef.moa lw;
    private final com.bytedance.adsdk.oa.yo.uef.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Path.FillType f24632oa;
    private final boolean uef;
    private final String yo;

    public wk(String str, boolean z2, Path.FillType fillType, com.bytedance.adsdk.oa.yo.uef.uef uefVar, com.bytedance.adsdk.oa.yo.uef.moa moaVar, boolean z10) {
        this.yo = str;
        this.uef = z2;
        this.f24632oa = fillType;
        this.moa = uefVar;
        this.lw = moaVar;
        this.ivm = z10;
    }

    public boolean lw() {
        return this.ivm;
    }

    public Path.FillType moa() {
        return this.f24632oa;
    }

    public com.bytedance.adsdk.oa.yo.uef.uef oa() {
        return this.moa;
    }

    public String toString() {
        return AbstractC0279p0.p(new StringBuilder("ShapeFill{color=, fillEnabled="), this.uef, '}');
    }

    public String uef() {
        return this.yo;
    }

    public com.bytedance.adsdk.oa.yo.uef.moa yo() {
        return this.lw;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.xs(czVar, uefVar, this);
    }
}
