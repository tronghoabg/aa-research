package com.waze.authentication;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f15760a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f15761b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ g[] f15762c;

    static {
        g gVar = new g("ENABLED", 0);
        f15760a = gVar;
        g gVar2 = new g("DISABLED", 1);
        f15761b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f15762c = gVarArr;
        h.d.b.a(gVarArr);
    }

    public static g[] values() {
        return (g[]) f15762c.clone();
    }
}
