package com.waze.map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    public static final db f28740a;

    /* renamed from: b, reason: collision with root package name */
    public static final db f28741b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ db[] f28742c;

    static {
        db dbVar = new db("ZoomIn", 0);
        f28740a = dbVar;
        db dbVar2 = new db("ZoomOut", 1);
        f28741b = dbVar2;
        db[] dbVarArr = {dbVar, dbVar2};
        f28742c = dbVarArr;
        h.d.b.a(dbVarArr);
    }

    public static db[] values() {
        return (db[]) f28742c.clone();
    }
}
