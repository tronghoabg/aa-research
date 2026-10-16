package com.waze.asks;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f15590a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f15591b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ g[] f15592c;

    static {
        g gVar = new g("HELPFUL", 0);
        f15590a = gVar;
        g gVar2 = new g("NOT_HELPFUL", 1);
        f15591b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f15592c = gVarArr;
        h.d.b.a(gVarArr);
    }

    public static g[] values() {
        return (g[]) f15592c.clone();
    }
}
