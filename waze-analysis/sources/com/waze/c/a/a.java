package com.waze.c.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18216a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f18217b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f18218c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f18219d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18220e;

    static {
        a aVar = new a("ALTERNATIVE_ROUTES_V2_LIST_DISPLAY_PREFERENCE", 0, "list");
        f18216a = aVar;
        a aVar2 = new a("ALTERNATIVE_ROUTES_V2_MAP_DISPLAY_PREFERENCE", 1, "map");
        f18217b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f18218c = aVarArr;
        f18219d = h.d.b.a(aVarArr);
    }

    private a(String str, int i2, String str2) {
        this.f18220e = str2;
    }

    public static h.d.a b() {
        return f18219d;
    }

    public static a[] values() {
        return (a[]) f18218c.clone();
    }

    public final String a() {
        return this.f18220e;
    }
}
