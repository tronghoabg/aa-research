package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class xs {
    private static final Object yo = new Object();

    /* renamed from: oa, reason: collision with root package name */
    private Context f25823oa;
    private yo uef;

    public class oa extends AbstractCursor {
        private oa() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i5) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i5) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i5) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i5) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i5) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i5) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i5) {
            return true;
        }
    }

    public xs(Context context) {
        try {
            this.f25823oa = context == null ? sy.uef() : context.getApplicationContext();
            if (this.uef == null) {
                this.uef = new yo();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context yo() {
        Context context = this.f25823oa;
        return context == null ? sy.uef() : context;
    }

    public class yo {

        /* renamed from: oa, reason: collision with root package name */
        private SQLiteDatabase f25825oa = null;

        public yo() {
        }

        private synchronized void oa() {
            uef uefVar;
            try {
                synchronized (xs.yo) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.f25825oa;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            if (com.bytedance.sdk.component.utils.tpx.uef(xs.this.yo())) {
                                xs xsVar = xs.this;
                                uefVar = xsVar.new uef(xsVar.yo(), "ttopensdk.db");
                            } else {
                                xs xsVar2 = xs.this;
                                uefVar = xsVar2.new uef(xsVar2.yo(), "ttopensdk_" + com.bytedance.sdk.component.utils.tpx.yo(xs.this.yo()) + ".db");
                            }
                            SQLiteDatabase writableDatabase = uefVar.getWritableDatabase();
                            this.f25825oa = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo("DBHelper", th.getMessage());
                if (yo()) {
                    throw th;
                }
            }
        }

        private synchronized boolean yo() {
            SQLiteDatabase sQLiteDatabase = this.f25825oa;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        public SQLiteDatabase uef() {
            oa();
            return this.f25825oa;
        }

        public synchronized Cursor uef(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                oa();
                cursorQuery = this.f25825oa.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo("DBHelper", th.getMessage());
                oa oaVar = new oa();
                if (yo()) {
                    throw th;
                }
                cursorQuery = oaVar;
            }
            return cursorQuery;
        }

        public synchronized int uef(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                oa();
                iUpdate = this.f25825oa.update(str, contentValues, str2, strArr);
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.yo("DBHelper", e7.getMessage());
                if (yo()) {
                    throw e7;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long uef(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                oa();
                jReplace = this.f25825oa.replace(str, str2, contentValues);
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.yo("DBHelper", e7.getMessage());
                if (yo()) {
                    throw e7;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int uef(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                oa();
                iDelete = this.f25825oa.delete(str, str2, strArr);
            } catch (Exception e7) {
                com.bytedance.sdk.component.utils.dhk.yo("DBHelper", e7.getMessage());
                if (yo()) {
                    throw e7;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public yo uef() {
        return this.uef;
    }

    public class uef extends SQLiteOpenHelper {
        final Context uef;

        public uef(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 11);
            this.uef = context;
        }

        private ArrayList<String> moa(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            return arrayList;
        }

        private void oa(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.cq.uef.yo.moa());
        }

        private void uef(SQLiteDatabase sQLiteDatabase, Context context) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.moa.uef());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.dj.yo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.ab.uef());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.wk.uef());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gsd.oa.uef());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.sy.yo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.uef.oa.oa.yo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.cq.uef.yo.yo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.bs.uef());
        }

        private void yo(SQLiteDatabase sQLiteDatabase) throws SQLException {
            ArrayList<String> arrayListMoa = moa(sQLiteDatabase);
            if (arrayListMoa == null || arrayListMoa.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListMoa.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                uef(sQLiteDatabase, this.uef);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
            if (i5 > i10) {
                try {
                    yo(sQLiteDatabase);
                    uef(sQLiteDatabase, xs.this.f25823oa);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dhk.yo(th.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            /*
                r0 = this;
                if (r2 <= r3) goto L5
                r0.yo(r1)     // Catch: java.lang.Throwable -> L43
            L5:
                com.bytedance.sdk.openadsdk.core.xs r3 = com.bytedance.sdk.openadsdk.core.xs.this     // Catch: java.lang.Throwable -> L43
                android.content.Context r3 = com.bytedance.sdk.openadsdk.core.xs.oa(r3)     // Catch: java.lang.Throwable -> L43
                r0.uef(r1, r3)     // Catch: java.lang.Throwable -> L43
                switch(r2) {
                    case 1: goto L40;
                    case 2: goto L37;
                    case 3: goto L2c;
                    case 4: goto L21;
                    case 5: goto L16;
                    case 6: goto L12;
                    default: goto L11;
                }     // Catch: java.lang.Throwable -> L43
            L11:
                goto L43
            L12:
                r0.uef(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L16:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.moa.wk.uef()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.uef(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L21:
                java.lang.String r3 = com.bytedance.sdk.component.adexpress.uef.oa.oa.yo()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.uef(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L2c:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.moa.ab.uef()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.uef(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L37:
                java.lang.String r3 = "DROP TABLE IF EXISTS 'ad_video_info';"
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.uef(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L40:
                r0.uef(r1)     // Catch: java.lang.Throwable -> L43
            L43:
                r3 = 11
                if (r2 >= r3) goto L58
                r0.oa(r1)     // Catch: java.lang.Throwable -> L4e
                com.bytedance.sdk.openadsdk.gsd.oa.uef(r1)     // Catch: java.lang.Throwable -> L4e
                goto L58
            L4e:
                r1 = move-exception
                java.lang.String r2 = "DBHelper"
                java.lang.String r1 = r1.getMessage()
                com.bytedance.sdk.component.utils.dhk.yo(r2, r1)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.xs.uef.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }

        private void uef(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.moa.oa());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.dj.moa());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.ab.oa());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.moa.wk.oa());
        }
    }
}
