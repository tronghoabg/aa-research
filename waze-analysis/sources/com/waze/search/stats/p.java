package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f36082a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f36083b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ p[] f36084c;

    static {
        p pVar = new p("CATEGORY_SEARCH", 0);
        f36082a = pVar;
        p pVar2 = new p("LINE_SEARCH", 1);
        f36083b = pVar2;
        p[] pVarArr = {pVar, pVar2};
        f36084c = pVarArr;
        h.d.b.a(pVarArr);
    }

    public static p[] values() {
        return (p[]) f36084c.clone();
    }
}
