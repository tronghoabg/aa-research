package com.bytedance.adsdk.oa.yo.oa;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class zjm implements yo {
    private final com.bytedance.adsdk.oa.yo.uef.oa bcc;
    private final com.bytedance.adsdk.oa.yo.uef.oa cz;
    private final boolean dj;
    private final com.bytedance.adsdk.oa.yo.uef.oa ivm;
    private final com.bytedance.adsdk.oa.yo.uef.oa lw;
    private final com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> moa;

    /* renamed from: oa, reason: collision with root package name */
    private final uef f24635oa;
    private final String uef;
    private final com.bytedance.adsdk.oa.yo.uef.oa xs;
    private final com.bytedance.adsdk.oa.yo.uef.oa yo;
    private final boolean zjm;

    public enum uef {
        STAR(1),
        POLYGON(2);

        private final int yo;

        uef(int i5) {
            this.yo = i5;
        }

        public static uef uef(int i5) {
            for (uef uefVar : values()) {
                if (uefVar.yo == i5) {
                    return uefVar;
                }
            }
            return null;
        }
    }

    public zjm(String str, uef uefVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar, com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> cqVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar2, com.bytedance.adsdk.oa.yo.uef.oa oaVar3, com.bytedance.adsdk.oa.yo.uef.oa oaVar4, com.bytedance.adsdk.oa.yo.uef.oa oaVar5, com.bytedance.adsdk.oa.yo.uef.oa oaVar6, boolean z2, boolean z10) {
        this.uef = str;
        this.f24635oa = uefVar;
        this.yo = oaVar;
        this.moa = cqVar;
        this.lw = oaVar2;
        this.ivm = oaVar3;
        this.xs = oaVar4;
        this.bcc = oaVar5;
        this.cz = oaVar6;
        this.zjm = z2;
        this.dj = z10;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa bcc() {
        return this.bcc;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa cz() {
        return this.cz;
    }

    public boolean dj() {
        return this.dj;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa ivm() {
        return this.ivm;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa lw() {
        return this.lw;
    }

    public com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> moa() {
        return this.moa;
    }

    public uef oa() {
        return this.f24635oa;
    }

    public String uef() {
        return this.uef;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa xs() {
        return this.xs;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa yo() {
        return this.yo;
    }

    public boolean zjm() {
        return this.zjm;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.dz(czVar, uefVar, this);
    }
}
