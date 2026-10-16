package com.waze.sharedui.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f38898a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f38899b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f38900c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f38901d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ g[] f38902e;

    static {
        g gVar = new g("USER_AWAITING", 0);
        f38898a = gVar;
        g gVar2 = new g("USER_VISIBLE", 1);
        f38899b = gVar2;
        g gVar3 = new g("DATA_FETCH", 2);
        f38900c = gVar3;
        g gVar4 = new g("DATA_SEND", 3);
        f38901d = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        f38902e = gVarArr;
        h.d.b.a(gVarArr);
    }

    public static g[] values() {
        return (g[]) f38902e.clone();
    }
}
