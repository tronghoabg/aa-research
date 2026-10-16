package com.bytedance.sdk.openadsdk.core.dz.oa;

import com.bytedance.sdk.openadsdk.core.dz.oa.yo;

/* loaded from: classes3.dex */
public class oa extends yo implements Comparable<oa> {
    private final float uef;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        private final float f25585oa;
        private final String uef;
        private yo.EnumC0096yo yo = yo.EnumC0096yo.TRACKING_URL;
        private boolean moa = false;

        public uef(String str, float f10) {
            this.uef = str;
            this.f25585oa = f10;
        }

        public oa uef() {
            return new oa(this.f25585oa, this.uef, this.yo, Boolean.valueOf(this.moa));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.dz.oa.yo
    public void m_() {
        super.m_();
    }

    public String toString() {
        return super.toString();
    }

    public boolean uef(float f10) {
        return this.uef <= f10 && !moa();
    }

    private oa(float f10, String str, yo.EnumC0096yo enumC0096yo, Boolean bool) {
        super(str, enumC0096yo, bool);
        this.uef = f10;
    }

    @Override // java.lang.Comparable
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public int compareTo(oa oaVar) {
        if (oaVar == null) {
            return 1;
        }
        float f10 = this.uef;
        float f11 = oaVar.uef;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
