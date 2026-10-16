package com.bytedance.adsdk.oa.yo.oa;

import com.bytedance.adsdk.oa.uef.uef.tpx;

/* loaded from: classes.dex */
public class oib implements yo {
    private final boolean ivm;
    private final com.bytedance.adsdk.oa.yo.uef.oa lw;
    private final com.bytedance.adsdk.oa.yo.uef.oa moa;

    /* renamed from: oa, reason: collision with root package name */
    private final uef f24625oa;
    private final String uef;
    private final com.bytedance.adsdk.oa.yo.uef.oa yo;

    public enum uef {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static uef uef(int i5) {
            if (i5 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i5 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i5)));
        }
    }

    public oib(String str, uef uefVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar2, com.bytedance.adsdk.oa.yo.uef.oa oaVar3, boolean z2) {
        this.uef = str;
        this.f24625oa = uefVar;
        this.yo = oaVar;
        this.moa = oaVar2;
        this.lw = oaVar3;
        this.ivm = z2;
    }

    public boolean ivm() {
        return this.ivm;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa lw() {
        return this.lw;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa moa() {
        return this.yo;
    }

    public uef oa() {
        return this.f24625oa;
    }

    public String toString() {
        return "Trim Path: {start: " + this.yo + ", end: " + this.moa + ", offset: " + this.lw + "}";
    }

    public String uef() {
        return this.uef;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa yo() {
        return this.moa;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new tpx(uefVar, this);
    }
}
