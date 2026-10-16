package com.waze.ui.ab;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f41743a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f41744b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ k[] f41745c;

    static {
        k kVar = new k("BestRoute", 0);
        f41743a = kVar;
        k kVar2 = new k("SlowerRoute", 1);
        f41744b = kVar2;
        k[] kVarArr = {kVar, kVar2};
        f41745c = kVarArr;
        h.d.b.a(kVarArr);
    }

    public static k[] values() {
        return (k[]) f41745c.clone();
    }
}
