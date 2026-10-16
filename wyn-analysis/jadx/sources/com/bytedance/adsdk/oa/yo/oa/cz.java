package com.bytedance.adsdk.oa.yo.oa;

/* loaded from: classes.dex */
public class cz implements yo {

    /* renamed from: oa, reason: collision with root package name */
    private final uef f24617oa;
    private final String uef;
    private final boolean yo;

    public enum uef {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static uef uef(int i5) {
            return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public cz(String str, uef uefVar, boolean z2) {
        this.uef = str;
        this.f24617oa = uefVar;
        this.yo = z2;
    }

    public uef oa() {
        return this.f24617oa;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f24617oa + '}';
    }

    public String uef() {
        return this.uef;
    }

    public boolean yo() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.wrv(this);
    }
}
