package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.unity3d.ads.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name */
    public static final G f30350b;

    /* renamed from: c, reason: collision with root package name */
    public static final G f30351c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ G[] f30352d;

    /* renamed from: a, reason: collision with root package name */
    public final String f30353a;

    static {
        G g9 = new G("Loading", 0, "loading");
        G g10 = new G("Default", 1, BuildConfig.FLAVOR);
        f30350b = g10;
        G g11 = new G("Resized", 2, "resized");
        G g12 = new G("Expanded", 3, "expanded");
        f30351c = g12;
        G[] gArr = {g9, g10, g11, g12, new G("Hidden", 4, "hidden")};
        f30352d = gArr;
        ic.d.t(gArr);
    }

    public G(String str, int i5, String str2) {
        this.f30353a = str2;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f30352d.clone();
    }
}
