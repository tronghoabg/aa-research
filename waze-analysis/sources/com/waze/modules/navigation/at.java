package com.waze.modules.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public static final at f30321a;

    /* renamed from: b, reason: collision with root package name */
    public static final at f30322b;

    /* renamed from: c, reason: collision with root package name */
    public static final at f30323c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ at[] f30324d;

    static {
        at atVar = new at("NEW_DRIVE", 0);
        f30321a = atVar;
        at atVar2 = new at("WAYPOINT", 1);
        f30322b = atVar2;
        at atVar3 = new at("SHOW_DECISION_POPUP", 2);
        f30323c = atVar3;
        at[] atVarArr = {atVar, atVar2, atVar3};
        f30324d = atVarArr;
        h.d.b.a(atVarArr);
    }

    public static at[] values() {
        return (at[]) f30324d.clone();
    }
}
