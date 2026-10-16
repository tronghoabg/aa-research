package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final F f30346b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f30347c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ F[] f30348d;

    /* renamed from: a, reason: collision with root package name */
    public final String f30349a;

    static {
        F f10 = new F("Inline", 0, "inline");
        f30346b = f10;
        F f11 = new F("Interstitial", 1, "interstitial");
        f30347c = f11;
        F[] fArr = {f10, f11};
        f30348d = fArr;
        ic.d.t(fArr);
    }

    public F(String str, int i5, String str2) {
        this.f30349a = str2;
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f30348d.clone();
    }
}
