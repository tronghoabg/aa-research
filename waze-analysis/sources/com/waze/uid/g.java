package com.waze.uid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f44521a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f44522b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f44523c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ g[] f44524d;

    /* renamed from: e, reason: collision with root package name */
    private final String f44525e;

    static {
        g gVar = new g("SET", 0, "set");
        f44521a = gVar;
        g gVar2 = new g("UNSET", 1, "unset");
        f44522b = gVar2;
        g gVar3 = new g("LEGACY", 2, "legacy");
        f44523c = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        f44524d = gVarArr;
        h.d.b.a(gVarArr);
    }

    private g(String str, int i2, String str2) {
        this.f44525e = str2;
    }

    public static g[] values() {
        return (g[]) f44524d.clone();
    }

    public final String a() {
        return this.f44525e;
    }
}
