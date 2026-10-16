package com.bytedance.adsdk.oa.yo.oa;

/* loaded from: classes.dex */
public class bcc {
    private final boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.adsdk.oa.yo.uef.bcc f24613oa;
    private final uef uef;
    private final com.bytedance.adsdk.oa.yo.uef.moa yo;

    public enum uef {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public bcc(uef uefVar, com.bytedance.adsdk.oa.yo.uef.bcc bccVar, com.bytedance.adsdk.oa.yo.uef.moa moaVar, boolean z2) {
        this.uef = uefVar;
        this.f24613oa = bccVar;
        this.yo = moaVar;
        this.moa = z2;
    }

    public boolean moa() {
        return this.moa;
    }

    public com.bytedance.adsdk.oa.yo.uef.bcc oa() {
        return this.f24613oa;
    }

    public uef uef() {
        return this.uef;
    }

    public com.bytedance.adsdk.oa.yo.uef.moa yo() {
        return this.yo;
    }
}
