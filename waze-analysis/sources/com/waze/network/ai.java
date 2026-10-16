package com.waze.network;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public static final ai f31877a;

    /* renamed from: b, reason: collision with root package name */
    public static final ai f31878b;

    /* renamed from: c, reason: collision with root package name */
    public static final ai f31879c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ai[] f31880d;

    static {
        ai aiVar = new ai("WIFI", 0);
        f31877a = aiVar;
        ai aiVar2 = new ai("CELL", 1);
        f31878b = aiVar2;
        ai aiVar3 = new ai("OTHER", 2);
        f31879c = aiVar3;
        ai[] aiVarArr = {aiVar, aiVar2, aiVar3};
        f31880d = aiVarArr;
        h.d.b.a(aiVarArr);
    }

    public static ai[] values() {
        return (ai[]) f31880d.clone();
    }
}
