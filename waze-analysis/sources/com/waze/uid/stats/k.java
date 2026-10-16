package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f44758a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f44759b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ k[] f44760c;

    static {
        k kVar = new k("REGULAR", 0);
        f44758a = kVar;
        k kVar2 = new k("UNDER_18", 1);
        f44759b = kVar2;
        k[] kVarArr = {kVar, kVar2};
        f44760c = kVarArr;
        h.d.b.a(kVarArr);
    }

    public static k[] values() {
        return (k[]) f44760c.clone();
    }
}
