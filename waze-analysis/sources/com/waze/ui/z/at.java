package com.waze.ui.z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public static final at f43933a;

    /* renamed from: b, reason: collision with root package name */
    public static final at f43934b;

    /* renamed from: c, reason: collision with root package name */
    public static final at f43935c;

    /* renamed from: d, reason: collision with root package name */
    public static final at f43936d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ at[] f43937e;

    static {
        at atVar = new at("GENERAL", 0);
        f43933a = atVar;
        at atVar2 = new at("DRIVE_NOT_AVAILABLE", 1);
        f43934b = atVar2;
        at atVar3 = new at("UNSUPPORTED_LINK", 2);
        f43935c = atVar3;
        at atVar4 = new at("DRIVE_HAS_ENDED", 3);
        f43936d = atVar4;
        at[] atVarArr = {atVar, atVar2, atVar3, atVar4};
        f43937e = atVarArr;
        h.d.b.a(atVarArr);
    }

    public static at[] values() {
        return (at[]) f43937e.clone();
    }
}
