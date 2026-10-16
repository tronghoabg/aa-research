package com.waze.bg.e.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public static final bd f16621a;

    /* renamed from: b, reason: collision with root package name */
    public static final bd f16622b;

    /* renamed from: c, reason: collision with root package name */
    public static final bd f16623c;

    /* renamed from: d, reason: collision with root package name */
    public static final bd f16624d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bd[] f16625e;

    static {
        bd bdVar = new bd("ADD_DETOUR_INSTRUCTION", 0);
        f16621a = bdVar;
        bd bdVar2 = new bd("REMOVE_DETOUR_INSTRUCTION", 1);
        f16622b = bdVar2;
        bd bdVar3 = new bd("REFRESH_DETOUR_INSTRUCTION", 2);
        f16623c = bdVar3;
        bd bdVar4 = new bd("DETOURINSTRUCTIONONEOF_NOT_SET", 3);
        f16624d = bdVar4;
        f16625e = new bd[]{bdVar, bdVar2, bdVar3, bdVar4};
    }

    public static bd[] values() {
        return (bd[]) f16625e.clone();
    }
}
