package com.waze.tide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f40959a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f40960b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f40961c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f40962d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ u[] f40963e;

    static {
        u uVar = new u("UNKNOWN", 0);
        f40959a = uVar;
        u uVar2 = new u("ALWAYS_ON", 1);
        f40960b = uVar2;
        u uVar3 = new u("WHEN_IN_USE", 2);
        f40961c = uVar3;
        u uVar4 = new u("NEVER", 3);
        f40962d = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        f40963e = uVarArr;
        h.d.b.a(uVarArr);
    }

    public static u[] values() {
        return (u[]) f40963e.clone();
    }
}
