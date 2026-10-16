package com.waze.sharedui.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f39287a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f39288b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f39289c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ y[] f39290d;

    static {
        y yVar = new y("NOT_VALIDATED", 0);
        f39287a = yVar;
        y yVar2 = new y("VALID", 1);
        f39288b = yVar2;
        y yVar3 = new y("INVALID", 2);
        f39289c = yVar3;
        y[] yVarArr = {yVar, yVar2, yVar3};
        f39290d = yVarArr;
        h.d.b.a(yVarArr);
    }

    public static y[] values() {
        return (y[]) f39290d.clone();
    }
}
