package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qmm extends qmf implements Closeable {
    public static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    public static final String c = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    public final ajzn d;
    private final ssj e;
    private final ajzn f;

    public qmm(qmh qmhVar) {
        super(qmhVar);
        q();
        this.f = new ajzn((byte[]) null);
        q();
        this.d = new ajzn((byte[]) null);
        d();
        this.e = new ssj(this, qmhVar.b);
    }

    public final void A() {
        s();
        c().endTransaction();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[PHI: r3
  0x00e5: PHI (r3v13 android.database.Cursor) = (r3v12 android.database.Cursor), (r3v14 android.database.Cursor) binds: [B:38:0x00e3, B:28:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153 A[Catch: SQLiteException -> 0x016e, TryCatch #4 {SQLiteException -> 0x016e, blocks: (B:53:0x0147, B:55:0x0153, B:56:0x0160), top: B:66:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160 A[Catch: SQLiteException -> 0x016e, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x016e, blocks: (B:53:0x0147, B:55:0x0153, B:56:0x0160), top: B:66:0x0147 }] */
    /* JADX WARN: Type inference failed for: r3v10, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.qna r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmm.B(qna):void");
    }

    public final void C() {
        s();
        c().setTransactionSuccessful();
    }

    public final void D(qmi qmiVar) {
        qmm qmmVar;
        s();
        qlk.b();
        SQLiteDatabase sQLiteDatabaseC = c();
        Map map = qmiVar.e;
        spu.aw(map);
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_uid", (Long) 0L);
        contentValues.put("cid", qmiVar.a);
        contentValues.put("tid", qmiVar.b);
        contentValues.put("adid", Integer.valueOf(qmiVar.c ? 1 : 0));
        contentValues.put("hits_count", Long.valueOf(qmiVar.d));
        contentValues.put("params", encodedQuery);
        try {
            if (sQLiteDatabaseC.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                qmmVar = this;
                try {
                    super.p(6, "Failed to insert/update a property (got -1)", null, null, null);
                } catch (SQLiteException e) {
                    e = e;
                    super.p(6, "Error storing a property", e, null, null);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            qmmVar = this;
        }
    }

    final boolean E() {
        return a() == 0;
    }

    public final void F(String str) {
        spu.at(str);
        s();
        qlk.b();
        int iDelete = c().delete("properties", "app_uid=? AND cid<>?", new String[]{CloudRecognizerProtocolStrings.DBG_VALUE, str});
        if (iDelete > 0) {
            super.p(2, "Deleted property records", Integer.valueOf(iDelete), null, null);
        }
    }

    @ResultIgnorabilityUnspecified
    public final void G() {
        qlk.b();
        s();
        ajzn ajznVar = this.f;
        if (ajznVar.e(86400000L)) {
            ajznVar.d();
            super.p(2, "Deleting stale hits (if any)", null, null, null);
            SQLiteDatabase sQLiteDatabaseC = c();
            q();
            super.p(2, "Deleted stale hits, count", Integer.valueOf(sQLiteDatabaseC.delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})), null, null);
        }
    }

    public final List H() {
        s();
        qlk.b();
        SQLiteDatabase sQLiteDatabaseC = c();
        Cursor cursorQuery = null;
        try {
            try {
                j();
                int iIntValue = ((Integer) qmy.d.f()).intValue();
                cursorQuery = sQLiteDatabaseC.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{CloudRecognizerProtocolStrings.DBG_VALUE}, null, null, null, String.valueOf(iIntValue));
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        boolean z = cursorQuery.getInt(2) != 0;
                        long j = cursorQuery.getInt(3);
                        Map mapW = w(cursorQuery.getString(4));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            super.p(5, "Read property with empty client id or tracker id", string, string2, null);
                        } else {
                            arrayList.add(new qmi(string, string2, z, j, mapW));
                        }
                    } while (cursorQuery.moveToNext());
                }
                if (arrayList.size() >= iIntValue) {
                    super.p(5, "Sending hits to too many properties. Campaign report might be incorrect", null, null, null);
                }
                return arrayList;
            } catch (SQLiteException e) {
                super.p(6, "Error loading hits from the database", e, null, null);
                throw e;
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final long I(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = c().rawQuery(str, strArr);
                long j = cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : 0L;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                super.p(6, "Database error", str, e, null);
                throw e;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() throws java.lang.Throwable {
        /*
            r8 = this;
            defpackage.qlk.b()
            r8.s()
            android.database.sqlite.SQLiteDatabase r0 = r8.c()
            java.lang.String r4 = "SELECT COUNT(*) FROM hits2"
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r1)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2d
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2d
            if (r0 == 0) goto L22
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2d
            if (r1 == 0) goto L21
            r1.close()
        L21:
            return r2
        L22:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2d
            java.lang.String r2 = "Database returned empty set"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2d
            throw r0     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2d
        L2a:
            r0 = move-exception
            r8 = r0
            goto L3c
        L2d:
            r0 = move-exception
            r5 = r0
            r7 = r1
            java.lang.String r3 = "Database error"
            r2 = 6
            r6 = 0
            r1 = r8
            super.p(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L39
            throw r5     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            r8 = r0
            r1 = r7
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmm.a():long");
    }

    final SQLiteDatabase c() {
        try {
            return this.e.getWritableDatabase();
        } catch (SQLiteException e) {
            super.p(5, "Error opening database", e, null, null);
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.e.close();
        } catch (SQLiteException e) {
            super.p(6, "Sql error closing database", e, null, null);
        } catch (IllegalStateException e2) {
            super.p(6, "Error closing database", e2, null, null);
        }
    }

    public final String d() {
        j();
        j();
        return "google_analytics_v4.db";
    }

    public final List e(long j) {
        spu.am(j >= 0);
        qlk.b();
        s();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(1);
                        String string = cursorQuery.getString(2);
                        String string2 = cursorQuery.getString(3);
                        arrayList.add(new qna(this, v(string), j3, TextUtils.isEmpty(string2) || !string2.startsWith("http:"), j2, cursorQuery.getInt(4), null));
                    } while (cursorQuery.moveToNext());
                }
                return arrayList;
            } catch (SQLiteException e) {
                super.p(6, "Error loading hits from the database", e, null, null);
                throw e;
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    final Map v(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = a.bz(str, "?");
            }
            return spr.a(new URI(str));
        } catch (URISyntaxException e) {
            super.p(6, "Error parsing hit parameters", e, null, null);
            return new HashMap(0);
        }
    }

    final Map w(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            return spr.a(new URI(a.bz(str, "?")));
        } catch (URISyntaxException e) {
            super.p(6, "Error parsing property parameters", e, null, null);
            return new HashMap(0);
        }
    }

    public final void x() {
        s();
        c().beginTransaction();
    }

    public final void y(long j) {
        qlk.b();
        s();
        ArrayList arrayList = new ArrayList(1);
        Long lValueOf = Long.valueOf(j);
        arrayList.add(lValueOf);
        super.p(2, "Deleting hit, id", lValueOf, null, null);
        z(arrayList);
    }

    public final void z(List list) {
        qmm qmmVar;
        spu.aw(list);
        qlk.b();
        s();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id in (");
        for (int i = 0; i < list.size(); i++) {
            Long l = (Long) list.get(i);
            if (l == null || l.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append(l);
        }
        sb.append(")");
        String string = sb.toString();
        try {
            SQLiteDatabase sQLiteDatabaseC = c();
            qmmVar = this;
            try {
                super.p(2, "Deleting dispatched hits. count", Integer.valueOf(list.size()), null, null);
                int iDelete = sQLiteDatabaseC.delete("hits2", string, null);
                if (iDelete != list.size()) {
                    try {
                        super.p(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(iDelete), string);
                    } catch (SQLiteException e) {
                        e = e;
                        qmmVar = qmmVar;
                        SQLiteException sQLiteException = e;
                        super.p(6, "Error deleting hits", sQLiteException, null, null);
                        throw sQLiteException;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            qmmVar = this;
        }
    }

    @Override // defpackage.qmf
    protected final void b() {
    }
}
