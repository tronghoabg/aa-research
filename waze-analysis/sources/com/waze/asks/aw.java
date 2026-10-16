package com.waze.asks;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    public static final aw f15546a;

    /* renamed from: b, reason: collision with root package name */
    public static final aw f15547b;

    /* renamed from: c, reason: collision with root package name */
    public static final aw f15548c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ aw[] f15549d;

    static {
        aw awVar = new aw("UNKNOWN", 0);
        f15546a = awVar;
        aw awVar2 = new aw("LEGACY_API", 1);
        f15547b = awVar2;
        aw awVar3 = new aw("REFACTOR_API", 2);
        f15548c = awVar3;
        aw[] awVarArr = {awVar, awVar2, awVar3};
        f15549d = awVarArr;
        h.d.b.a(awVarArr);
    }

    public static aw[] values() {
        return (aw[]) f15549d.clone();
    }
}
