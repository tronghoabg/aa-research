package com.waze.google_assistant;

import l.a.zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f24162a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f24163b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f24164c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f24165d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f24166e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f24167f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f24168g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f24169h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f24170i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f24171j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f24172k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f24173l;
    public static final e m;
    public static final e n;
    public static final e o;
    public static final e p;
    public static final e q;
    private static final /* synthetic */ e[] r;
    private final zw s;

    static {
        e eVar = new e("ACTION_UNSPECIFIED", 0, zw.ACTION_UNSPECIFIED);
        f24162a = eVar;
        e eVar2 = new e("ALTERNATE_ROUTES", 1, zw.ALTERNATE_ROUTES);
        f24163b = eVar2;
        e eVar3 = new e("ETA_QUERY", 2, zw.ETA_QUERY);
        f24164c = eVar3;
        e eVar4 = new e("NAVIGATE", 3, zw.NAVIGATE);
        f24165d = eVar4;
        e eVar5 = new e("RECENTER", 4, zw.RECENTER);
        f24166e = eVar5;
        e eVar6 = new e("ROUTE_OVERVIEW", 5, zw.ROUTE_OVERVIEW);
        f24167f = eVar6;
        e eVar7 = new e("ROUTE_PREFERENCE_HIGHWAYS", 6, zw.ROUTE_PREFERENCE_HIGHWAYS);
        f24168g = eVar7;
        e eVar8 = new e("ROUTE_PREFERENCE_TOLLS", 7, zw.ROUTE_PREFERENCE_TOLLS);
        f24169h = eVar8;
        e eVar9 = new e("SEARCH", 8, zw.SEARCH);
        f24170i = eVar9;
        e eVar10 = new e("SET_HOME", 9, zw.SET_HOME);
        f24171j = eVar10;
        e eVar11 = new e("SET_WORK", 10, zw.SET_WORK);
        f24172k = eVar11;
        e eVar12 = new e("SHOW_DIRECTIONS", 11, zw.SHOW_DIRECTIONS);
        f24173l = eVar12;
        e eVar13 = new e("STOP_NAVIGATION", 12, zw.STOP_NAVIGATION);
        m = eVar13;
        e eVar14 = new e("VOICE_DIRECTIONS", 13, zw.VOICE_DIRECTIONS);
        n = eVar14;
        e eVar15 = new e("ROUTE_PREFERENCE_FERRIES", 14, zw.ACTION_UNSPECIFIED);
        o = eVar15;
        e eVar16 = new e("SHOW_MAP", 15, zw.ACTION_UNSPECIFIED);
        p = eVar16;
        e eVar17 = new e("BACK", 16, zw.ACTION_UNSPECIFIED);
        q = eVar17;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17};
        r = eVarArr;
        h.d.b.a(eVarArr);
    }

    private e(String str, int i2, zw zwVar) {
        this.s = zwVar;
    }

    public static e[] values() {
        return (e[]) r.clone();
    }

    public final zw a() {
        return this.s;
    }
}
