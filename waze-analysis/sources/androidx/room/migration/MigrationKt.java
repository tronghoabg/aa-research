package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MigrationKt {
    public static final Migration Migration(int i2, int i3, l<? super SupportSQLiteDatabase, ab> lVar) {
        x.f(lVar, "migrate");
        return new MigrationImpl(i2, i3, lVar);
    }
}
