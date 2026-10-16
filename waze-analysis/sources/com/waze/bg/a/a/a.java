package com.waze.bg.a.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16302a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f16303b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f16304c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f16305d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f16306e;

    static {
        a aVar = new a("HAZARD", 0);
        f16302a = aVar;
        a aVar2 = new a("BLOCKED_LANE", 1);
        f16303b = aVar2;
        a aVar3 = new a("VALIDATION", 2);
        f16304c = aVar3;
        a aVar4 = new a("ANSWEROPTION_NOT_SET", 3);
        f16305d = aVar4;
        f16306e = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a[] values() {
        return (a[]) f16306e.clone();
    }
}
