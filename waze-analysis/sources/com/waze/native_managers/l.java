package com.waze.native_managers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f30697a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f30698b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f30699c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ l[] f30700d;

    static {
        l lVar = new l("INACTIVE", 0);
        f30697a = lVar;
        l lVar2 = new l("ACTIVE", 1);
        f30698b = lVar2;
        l lVar3 = new l("SHUTDOWN", 2);
        f30699c = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f30700d = lVarArr;
        h.d.b.a(lVarArr);
    }

    public static l[] values() {
        return (l[]) f30700d.clone();
    }
}
