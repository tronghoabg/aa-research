package com.waze.ev;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f23725a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f23726b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f23727c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f23728d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f23729e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f23730f;

    /* renamed from: g, reason: collision with root package name */
    public static final t f23731g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ t[] f23732h;

    /* renamed from: i, reason: collision with root package name */
    private final String f23733i;

    static {
        t tVar = new t("TYPE1", 0, "TYPE1");
        f23725a = tVar;
        t tVar2 = new t("TYPE2", 1, "TYPE2");
        f23726b = tVar2;
        t tVar3 = new t("TESLA", 2, "TESLA");
        f23727c = tVar3;
        t tVar4 = new t("CCS_TYPE1", 3, "CCS_TYPE1");
        f23728d = tVar4;
        t tVar5 = new t("CCS_TYPE2", 4, "CCS_TYPE2");
        f23729e = tVar5;
        t tVar6 = new t("CHADEMO", 5, "CHADEMO");
        f23730f = tVar6;
        t tVar7 = new t("GB_T", 6, "GB_T");
        f23731g = tVar7;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7};
        f23732h = tVarArr;
        h.d.b.a(tVarArr);
    }

    private t(String str, int i2, String str2) {
        this.f23733i = str2;
    }

    public static t[] values() {
        return (t[]) f23732h.clone();
    }

    public final String a() {
        return this.f23733i;
    }
}
