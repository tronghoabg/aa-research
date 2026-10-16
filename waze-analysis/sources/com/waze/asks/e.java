package com.waze.asks;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f15585a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f15586b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ e[] f15587c;

    static {
        e eVar = new e("WHAT_DO_YOU_SEE", 0);
        f15585a = eVar;
        e eVar2 = new e("ARE_LANES_BLOCKED", 1);
        f15586b = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f15587c = eVarArr;
        h.d.b.a(eVarArr);
    }

    public static e[] values() {
        return (e[]) f15587c.clone();
    }
}
