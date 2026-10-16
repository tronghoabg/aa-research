package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C2006a f30340a;

    /* renamed from: b, reason: collision with root package name */
    public static final D f30341b;

    /* renamed from: c, reason: collision with root package name */
    public static final D f30342c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f30343d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ D[] f30344e;

    static {
        D d3 = new D("Portrait", 0);
        f30341b = d3;
        D d5 = new D("Landscape", 1);
        f30342c = d5;
        D d10 = new D(OfficeOpenXMLExtended.SECURITY_NONE, 2);
        f30343d = d10;
        D[] dArr = {d3, d5, d10};
        f30344e = dArr;
        ic.d.t(dArr);
        f30340a = new C2006a();
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f30344e.clone();
    }
}
