package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f36008a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f36009b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f36010c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f36011d;

    static {
        b bVar = new b("RESULT_SOURCE_UNSPECIFIED", 0);
        f36008a = bVar;
        b bVar2 = new b("GOOGLE", 1);
        f36009b = bVar2;
        b bVar3 = new b("WAZE", 2);
        f36010c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f36011d = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f36011d.clone();
    }
}
