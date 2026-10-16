package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z, l<? super SQLiteDatabase, ? extends T> lVar) {
        x.f(sQLiteDatabase, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, l lVar, int i2, Object obj) {
        x.f(sQLiteDatabase, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        if (((z ? 1 : 0) | (i2 & 1)) != 0) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
