package com.waze.settings.e.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37120a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f37121b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f37122c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f37123d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f37124e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f37125f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f37126g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f37127h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ b[] f37128i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f37129j;

    /* renamed from: k, reason: collision with root package name */
    private final String f37130k;

    static {
        b bVar = new b("MX_HNC_EXEMPT", 0, "mx-hnc-e");
        f37120a = bVar;
        b bVar2 = new b("MX_HNC_00", 1, "mx-hnc-00");
        f37121b = bVar2;
        b bVar3 = new b("MX_HNC_0", 2, "mx-hnc-0");
        f37122c = bVar3;
        b bVar4 = new b("MX_HNC_1", 3, "mx-hnc-1");
        f37123d = bVar4;
        b bVar5 = new b("MX_HNC_2", 4, "mx-hnc-2");
        f37124e = bVar5;
        b bVar6 = new b("MX_HNC_TOURIST", 5, "mx-hnc-turistico");
        f37125f = bVar6;
        b bVar7 = new b("MX_HNC_FOREIGN", 6, "mx-hnc-foreign");
        f37126g = bVar7;
        b bVar8 = new b("MX_HNC_OTHER", 7, "mx-hnc-other");
        f37127h = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        f37128i = bVarArr;
        f37129j = h.d.b.a(bVarArr);
    }

    private b(String str, int i2, String str2) {
        this.f37130k = str2;
    }

    public static h.d.a b() {
        return f37129j;
    }

    public static b[] values() {
        return (b[]) f37128i.clone();
    }

    public final String a() {
        return this.f37130k;
    }
}
