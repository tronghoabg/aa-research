package com.waze.network;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    public static final al f31883a;

    /* renamed from: b, reason: collision with root package name */
    public static final al f31884b;

    /* renamed from: c, reason: collision with root package name */
    public static final al f31885c;

    /* renamed from: d, reason: collision with root package name */
    public static final al f31886d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ al[] f31887e;

    static {
        al alVar = new al("WIFI", 0);
        f31883a = alVar;
        al alVar2 = new al("CELL", 1);
        f31884b = alVar2;
        al alVar3 = new al("OTHER", 2);
        f31885c = alVar3;
        al alVar4 = new al("NA", 3);
        f31886d = alVar4;
        al[] alVarArr = {alVar, alVar2, alVar3, alVar4};
        f31887e = alVarArr;
        h.d.b.a(alVarArr);
    }

    public static al[] values() {
        return (al[]) f31887e.clone();
    }
}
