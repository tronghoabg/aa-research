package net.zetetic.database.sqlcipher;

import android.os.CancellationSignal;

/* loaded from: classes5.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f41135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41136b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41137c;

    /* renamed from: d, reason: collision with root package name */
    public final CancellationSignal f41138d;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.f41135a = sQLiteDatabase;
        this.f41136b = str2;
        this.f41137c = str;
        this.f41138d = cancellationSignal;
    }

    public final String toString() {
        return "SQLiteDirectCursorDriver: " + this.f41137c;
    }
}
