package com.waze.location;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public static final at f25272a;

    /* renamed from: b, reason: collision with root package name */
    public static final at f25273b;

    /* renamed from: c, reason: collision with root package name */
    public static final at f25274c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ at[] f25275d;

    static {
        at atVar = new at("UNKNOWN", 0);
        f25272a = atVar;
        at atVar2 = new at("GRANTED_APPROXIMATE", 1);
        f25273b = atVar2;
        at atVar3 = new at("GRANTED_PRECISE", 2);
        f25274c = atVar3;
        at[] atVarArr = {atVar, atVar2, atVar3};
        f25275d = atVarArr;
        h.d.b.a(atVarArr);
    }

    public static at[] values() {
        return (at[]) f25275d.clone();
    }
}
