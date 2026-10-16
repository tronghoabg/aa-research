package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f36065a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f36066b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f36067c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f36068d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ l[] f36069e;

    static {
        l lVar = new l("SELECT", 0);
        f36065a = lVar;
        l lVar2 = new l("PIN", 1);
        f36066b = lVar2;
        l lVar3 = new l("MAP", 2);
        f36067c = lVar3;
        l lVar4 = new l("ALGO_TRANSPARENCY_LINK", 3);
        f36068d = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        f36069e = lVarArr;
        h.d.b.a(lVarArr);
    }

    public static l[] values() {
        return (l[]) f36069e.clone();
    }
}
