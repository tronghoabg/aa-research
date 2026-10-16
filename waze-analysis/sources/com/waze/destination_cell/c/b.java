package com.waze.destination_cell.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23525a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f23526b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f23527c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f23528d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f23529e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ b[] f23530f;

    static {
        b bVar = new b("RECENT", 0);
        f23525a = bVar;
        b bVar2 = new b("FAVORITE", 1);
        f23526b = bVar2;
        b bVar3 = new b("NEW_DESTINATION", 2);
        f23527c = bVar3;
        b bVar4 = new b("HOME", 3);
        f23528d = bVar4;
        b bVar5 = new b("WORK", 4);
        f23529e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f23530f = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f23530f.clone();
    }
}
