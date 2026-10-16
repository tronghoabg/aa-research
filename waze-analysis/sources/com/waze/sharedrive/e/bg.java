package com.waze.sharedrive.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    public static final bg f38423a;

    /* renamed from: b, reason: collision with root package name */
    public static final bg f38424b;

    /* renamed from: c, reason: collision with root package name */
    public static final bg f38425c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ bg[] f38426d;

    static {
        bg bgVar = new bg("STOP_NAVIGATION", 0);
        f38423a = bgVar;
        bg bgVar2 = new bg("NAVIGATE", 1);
        f38424b = bgVar2;
        bg bgVar3 = new bg("NAVIGATE_STOP_SHARE", 2);
        f38425c = bgVar3;
        bg[] bgVarArr = {bgVar, bgVar2, bgVar3};
        f38426d = bgVarArr;
        h.d.b.a(bgVarArr);
    }

    public static bg[] values() {
        return (bg[]) f38426d.clone();
    }
}
