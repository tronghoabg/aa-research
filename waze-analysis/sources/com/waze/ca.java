package com.waze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public static final ca f18721a;

    /* renamed from: b, reason: collision with root package name */
    public static final ca f18722b;

    /* renamed from: c, reason: collision with root package name */
    public static final ca f18723c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ca[] f18724d;

    static {
        ca caVar = new ca("PENDING", 0);
        f18721a = caVar;
        ca caVar2 = new ca("SHOWN", 1);
        f18722b = caVar2;
        ca caVar3 = new ca("NOT_SHOWN", 2);
        f18723c = caVar3;
        ca[] caVarArr = {caVar, caVar2, caVar3};
        f18724d = caVarArr;
        h.d.b.a(caVarArr);
    }

    public static ca[] values() {
        return (ca[]) f18724d.clone();
    }
}
