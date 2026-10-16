package com.waze.modules.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    public static final db f30041a;

    /* renamed from: b, reason: collision with root package name */
    public static final db f30042b;

    /* renamed from: c, reason: collision with root package name */
    public static final db f30043c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ db[] f30044d;

    /* renamed from: e, reason: collision with root package name */
    private final String f30045e;

    static {
        db dbVar = new db("AvoidAllDirtRoads", 0, "Don't allow");
        f30041a = dbVar;
        db dbVar2 = new db("AllowDirtRoads", 1, "Allow");
        f30042b = dbVar2;
        db dbVar3 = new db("AvoidLongDirtRoads", 2, "Avoid long ones");
        f30043c = dbVar3;
        db[] dbVarArr = {dbVar, dbVar2, dbVar3};
        f30044d = dbVarArr;
        h.d.b.a(dbVarArr);
    }

    private db(String str, int i2, String str2) {
        this.f30045e = str2;
    }

    public static db[] values() {
        return (db[]) f30044d.clone();
    }

    public final String a() {
        return this.f30045e;
    }
}
