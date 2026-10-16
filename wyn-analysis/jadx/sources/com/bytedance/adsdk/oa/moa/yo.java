package com.bytedance.adsdk.oa.moa;

/* loaded from: classes.dex */
public enum yo {
    JSON(".json"),
    ZIP(".zip");

    public final String yo;

    yo(String str) {
        this.yo = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.yo;
    }

    public String uef() {
        return ".temp" + this.yo;
    }
}
