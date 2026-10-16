package com.waze.network.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f31982a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f31983b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f31984c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f31985d;

    static {
        b bVar = new b("SUCCESS", 0);
        f31982a = bVar;
        b bVar2 = new b("TIMEOUT", 1);
        f31983b = bVar2;
        b bVar3 = new b("ERROR", 2);
        f31984c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f31985d = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f31985d.clone();
    }
}
