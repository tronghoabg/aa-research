package com.waze.asks;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f15605a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f15606b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ i[] f15607c;

    static {
        i iVar = new i("DEFAULT_HAZARD", 0);
        f15605a = iVar;
        i iVar2 = new i("CONSTRUCTION", 1);
        f15606b = iVar2;
        i[] iVarArr = {iVar, iVar2};
        f15607c = iVarArr;
        h.d.b.a(iVarArr);
    }

    public static i[] values() {
        return (i[]) f15607c.clone();
    }
}
