package com.bytedance.sdk.component.oa.uef;

/* loaded from: classes.dex */
public final class ivm {
    private final String[] uef;

    public ivm(String[] strArr) {
        this.uef = strArr;
    }

    public String oa(int i5) {
        return this.uef[(i5 * 2) + 1];
    }

    public int uef() {
        return this.uef.length / 2;
    }

    public String uef(int i5) {
        return this.uef[i5 * 2];
    }
}
