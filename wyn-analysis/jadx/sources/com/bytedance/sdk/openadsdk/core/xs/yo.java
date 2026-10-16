package com.bytedance.sdk.openadsdk.core.xs;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.openadsdk.core.sy;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
class yo {
    private static final Object yo = new Object();

    /* renamed from: oa, reason: collision with root package name */
    private Context f25826oa;
    private C0111yo uef;

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

    public yo(Context context) {
        try {
            this.f25826oa = context == null ? sy.uef() : context.getApplicationContext();
            if (this.uef == null) {
                this.uef = new C0111yo();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context yo() {
        Context context = this.f25826oa;
        return context == null ? sy.uef() : context;
    }

    public class uef extends SQLiteOpenHelper {
        final Context uef;

        public uef(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
            this.uef = context;
        }

        private ArrayList<String> oa(SQLiteDatabase sQLiteDatabase) {
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

        private void uef(SQLiteDatabase sQLiteDatabase, Context context) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dz.uef.uef.oa.lw());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dz.uef.uef.oa.ivm());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                uef(sQLiteDatabase, this.uef);
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
            if (i5 > i10) {
                try {
                    uef(sQLiteDatabase);
                    uef(sQLiteDatabase, yo.this.f25826oa);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
            try {
                if (i5 <= i10) {
                    uef(sQLiteDatabase, yo.this.f25826oa);
                } else {
                    uef(sQLiteDatabase);
                    uef(sQLiteDatabase, yo.this.f25826oa);
                }
            } catch (Throwable unused) {
            }
        }

        private void uef(SQLiteDatabase sQLiteDatabase) throws SQLException {
            ArrayList<String> arrayListOa = oa(sQLiteDatabase);
            if (arrayListOa == null || arrayListOa.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListOa.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
            }
        }
    }

    public C0111yo uef() {
        return this.uef;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.xs.yo$yo, reason: collision with other inner class name */
    public class C0111yo {

        /* renamed from: oa, reason: collision with root package name */
        private SQLiteDatabase f25828oa = null;

        public C0111yo() {
        }

        private synchronized boolean oa() {
            SQLiteDatabase sQLiteDatabase = this.f25828oa;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized void uef() {
            uef uefVar;
            try {
                synchronized (yo.yo) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.f25828oa;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            if (tpx.uef(yo.this.yo())) {
                                yo yoVar = yo.this;
                                uefVar = yoVar.new uef(yoVar.yo(), "pag_business.db");
                            } else {
                                yo yoVar2 = yo.this;
                                uefVar = yoVar2.new uef(yoVar2.yo(), "pag_business_" + tpx.yo(yo.this.yo()) + ".db");
                            }
                            SQLiteDatabase writableDatabase = uefVar.getWritableDatabase();
                            this.f25828oa = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
                if (oa()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor uef(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                uef();
                cursorQuery = this.f25828oa.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                th.getMessage();
                oa oaVar = new oa();
                if (oa()) {
                    throw th;
                }
                cursorQuery = oaVar;
            }
            return cursorQuery;
        }

        public synchronized int uef(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                uef();
                iUpdate = this.f25828oa.update(str, contentValues, str2, strArr);
            } catch (Exception e7) {
                e7.getMessage();
                if (oa()) {
                    throw e7;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long uef(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                uef();
                jReplace = this.f25828oa.replace(str, str2, contentValues);
            } catch (Exception e7) {
                e7.getMessage();
                if (oa()) {
                    throw e7;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int uef(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                uef();
                iDelete = this.f25828oa.delete(str, str2, strArr);
            } catch (Exception e7) {
                e7.getMessage();
                if (oa()) {
                    throw e7;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }
}
