package org.a.d.f;

import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f56394a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f56395b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f56396c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f56397d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f56398e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f56399f;

    static {
        a aVar = new a("DEBUG", 0);
        f56394a = aVar;
        a aVar2 = new a("INFO", 1);
        f56395b = aVar2;
        a aVar3 = new a("WARNING", 2);
        f56396c = aVar3;
        a aVar4 = new a("ERROR", 3);
        f56397d = aVar4;
        a aVar5 = new a("NONE", 4);
        f56398e = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f56399f = aVarArr;
        b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f56399f.clone();
    }
}
