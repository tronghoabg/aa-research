package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f44761a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f44762b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f44763c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ l[] f44764d;

    static {
        l lVar = new l("ACCEPTED", 0);
        f44761a = lVar;
        l lVar2 = new l("DECLINED", 1);
        f44762b = lVar2;
        l lVar3 = new l("URL_CLICKED", 2);
        f44763c = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f44764d = lVarArr;
        h.d.b.a(lVarArr);
    }

    public static l[] values() {
        return (l[]) f44764d.clone();
    }
}
