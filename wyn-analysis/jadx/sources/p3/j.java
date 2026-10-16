package p3;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class j extends i implements o3.g {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f43235b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f43235b = sQLiteStatement;
    }

    @Override // o3.g
    public final int g() {
        return this.f43235b.executeUpdateDelete();
    }

    @Override // o3.g
    public final long v() {
        return this.f43235b.executeInsert();
    }
}
