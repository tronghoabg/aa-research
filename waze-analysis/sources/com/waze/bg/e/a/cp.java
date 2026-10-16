package com.waze.bg.e.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cp {

    /* renamed from: a, reason: collision with root package name */
    public static final cp f16651a;

    /* renamed from: b, reason: collision with root package name */
    public static final cp f16652b;

    /* renamed from: c, reason: collision with root package name */
    public static final cp f16653c;

    /* renamed from: d, reason: collision with root package name */
    public static final cp f16654d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cp[] f16655e;

    static {
        cp cpVar = new cp("HOME_FAVORITE", 0);
        f16651a = cpVar;
        cp cpVar2 = new cp("WORK_FAVORITE", 1);
        f16652b = cpVar2;
        cp cpVar3 = new cp("CUSTOM_FAVORITE", 2);
        f16653c = cpVar3;
        cp cpVar4 = new cp("FAVORITE_NOT_SET", 3);
        f16654d = cpVar4;
        f16655e = new cp[]{cpVar, cpVar2, cpVar3, cpVar4};
    }

    public static cp[] values() {
        return (cp[]) f16655e.clone();
    }
}
