package com.waze.ads.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f14010a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f14011b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f14012c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f14013d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f14014e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f14015f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ e[] f14016g;

    static {
        e eVar = new e("FAILURE_REASON_UNSPECIFIED", 0);
        f14010a = eVar;
        e eVar2 = new e("DEVELOPER_ERROR", 1);
        f14011b = eVar2;
        e eVar3 = new e("GMS_UNAVAILABLE", 2);
        f14012c = eVar3;
        e eVar4 = new e("NETWORK_ERROR", 3);
        f14013d = eVar4;
        e eVar5 = new e("SERVICE_ERROR", 4);
        f14014e = eVar5;
        e eVar6 = new e("INTERNAL_ERROR", 5);
        f14015f = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        f14016g = eVarArr;
        h.d.b.a(eVarArr);
    }

    public static e[] values() {
        return (e[]) f14016g.clone();
    }
}
