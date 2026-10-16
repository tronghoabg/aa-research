package com.google.k.a.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f12201a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f12202b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f12203c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f12204d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ u[] f12205e;

    static {
        u uVar = new u("MULTIPOINT", 0);
        f12201a = uVar;
        u uVar2 = new u("MULTISURFACE", 1);
        f12202b = uVar2;
        u uVar3 = new u("SOLID", 2);
        f12203c = uVar3;
        u uVar4 = new u("BOUNDARIES_NOT_SET", 3);
        f12204d = uVar4;
        f12205e = new u[]{uVar, uVar2, uVar3, uVar4};
    }

    public static u[] values() {
        return (u[]) f12205e.clone();
    }
}
