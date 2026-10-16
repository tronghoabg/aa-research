package androidx.sqlite.db;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SupportSQLiteDatabaseKt {
    public static final <T> T transaction(SupportSQLiteDatabase supportSQLiteDatabase, boolean z, l<? super SupportSQLiteDatabase, ? extends T> lVar) {
        x.f(supportSQLiteDatabase, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        if (z) {
            supportSQLiteDatabase.beginTransaction();
        } else {
            supportSQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = lVar.invoke(supportSQLiteDatabase);
            supportSQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
        }
    }

    public static /* synthetic */ Object transaction$default(SupportSQLiteDatabase supportSQLiteDatabase, boolean z, l lVar, int i2, Object obj) {
        x.f(supportSQLiteDatabase, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        if (((z ? 1 : 0) | (i2 & 1)) != 0) {
            supportSQLiteDatabase.beginTransaction();
        } else {
            supportSQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = lVar.invoke(supportSQLiteDatabase);
            supportSQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
        }
    }
}
