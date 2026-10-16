package com.bytedance.adsdk.oa.yo.oa;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class ab implements yo {

    /* renamed from: oa, reason: collision with root package name */
    private final List<yo> f24612oa;
    private final String uef;
    private final boolean yo;

    public ab(String str, List<yo> list, boolean z2) {
        this.uef = str;
        this.f24612oa = list;
        this.yo = z2;
    }

    public List<yo> oa() {
        return this.f24612oa;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.uef + "' Shapes: " + Arrays.toString(this.f24612oa.toArray()) + '}';
    }

    public String uef() {
        return this.uef;
    }

    public boolean yo() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.moa(czVar, uefVar, this, xsVar);
    }
}
