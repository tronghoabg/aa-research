package com.waze.modules.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    public static final al f30301a;

    /* renamed from: b, reason: collision with root package name */
    public static final al f30302b;

    /* renamed from: c, reason: collision with root package name */
    public static final al f30303c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ al[] f30304d;

    static {
        al alVar = new al("NAVIGATION_STARTED", 0);
        f30301a = alVar;
        al alVar2 = new al("ERROR", 1);
        f30302b = alVar2;
        al alVar3 = new al("CANCELED", 2);
        f30303c = alVar3;
        al[] alVarArr = {alVar, alVar2, alVar3};
        f30304d = alVarArr;
        h.d.b.a(alVarArr);
    }

    public static al[] values() {
        return (al[]) f30304d.clone();
    }
}
