package com.moloco.sdk.internal.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f29392a;

    /* renamed from: b, reason: collision with root package name */
    public static final G f29393b;

    /* renamed from: c, reason: collision with root package name */
    public static final G f29394c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ G[] f29395d;

    static {
        G g9 = new G("SILENT", 0);
        f29392a = g9;
        G g10 = new G("VIBRATE", 1);
        f29393b = g10;
        G g11 = new G("NORMAL", 2);
        f29394c = g11;
        G[] gArr = {g9, g10, g11};
        f29395d = gArr;
        ic.d.t(gArr);
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f29395d.clone();
    }
}
