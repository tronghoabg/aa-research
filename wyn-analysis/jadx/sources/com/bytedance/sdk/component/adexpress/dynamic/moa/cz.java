package com.bytedance.sdk.component.adexpress.dynamic.moa;

import java.util.Arrays;

/* loaded from: classes.dex */
public class cz {

    /* renamed from: oa, reason: collision with root package name */
    public float f24850oa;
    public float uef;

    public cz(float f10, float f11) {
        this.uef = f10;
        this.f24850oa = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cz czVar = (cz) obj;
            if (Float.compare(czVar.uef, this.uef) == 0 && Float.compare(czVar.f24850oa, this.f24850oa) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.uef), Float.valueOf(this.f24850oa)});
    }
}
