package com.waze.map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    public static final as f27959a;

    /* renamed from: b, reason: collision with root package name */
    public static final as f27960b;

    /* renamed from: c, reason: collision with root package name */
    public static final as f27961c;

    /* renamed from: d, reason: collision with root package name */
    public static final as f27962d;

    /* renamed from: e, reason: collision with root package name */
    public static final as f27963e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ as[] f27964f;

    static {
        as asVar = new as("TOP_LEFT", 0);
        f27959a = asVar;
        as asVar2 = new as("BOTTOM_LEFT", 1);
        f27960b = asVar2;
        as asVar3 = new as("BOTTOM_RIGHT", 2);
        f27961c = asVar3;
        as asVar4 = new as("TOP_RIGHT", 3);
        f27962d = asVar4;
        as asVar5 = new as("CENTER", 4);
        f27963e = asVar5;
        as[] asVarArr = {asVar, asVar2, asVar3, asVar4, asVar5};
        f27964f = asVarArr;
        h.d.b.a(asVarArr);
    }

    public static as[] values() {
        return (as[]) f27964f.clone();
    }
}
