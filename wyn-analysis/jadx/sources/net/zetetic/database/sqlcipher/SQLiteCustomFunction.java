package net.zetetic.database.sqlcipher;

import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes5.dex */
public final class SQLiteCustomFunction {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase.CustomFunction f41112a;
    public final String name;
    public final int numArgs;

    public SQLiteCustomFunction(String str, int i5, SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            throw new IllegalArgumentException("name must not be null.");
        }
        this.name = str;
        this.numArgs = i5;
        this.f41112a = customFunction;
    }

    private void dispatchCallback(String[] strArr) {
        this.f41112a.a();
    }
}
