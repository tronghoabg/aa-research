package com.bytedance.adsdk.oa.yo;

/* loaded from: classes.dex */
public class ivm {

    /* renamed from: oa, reason: collision with root package name */
    public final float f24608oa;
    public final float uef;
    private final String yo;

    public ivm(String str, float f10, float f11) {
        this.yo = str;
        this.f24608oa = f11;
        this.uef = f10;
    }

    public boolean uef(String str) {
        if (this.yo.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.yo.endsWith("\r")) {
            String str2 = this.yo;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
