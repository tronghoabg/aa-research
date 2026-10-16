package com.bytedance.sdk.component.ivm.uef.uef.uef;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.ivm.uef.xs;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONObject;

/* loaded from: classes.dex */
class oa {

    /* renamed from: oa, reason: collision with root package name */
    private Context f25013oa;
    private C0061oa uef;

    public class uef extends AbstractCursor {
        private uef() {
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

    public oa(Context context) {
        try {
            this.f25013oa = context.getApplicationContext();
            if (this.uef == null) {
                this.uef = new C0061oa();
            }
        } catch (Throwable unused) {
        }
    }

    public C0061oa uef() {
        return this.uef;
    }

    /* renamed from: com.bytedance.sdk.component.ivm.uef.uef.uef.oa$oa, reason: collision with other inner class name */
    public class C0061oa {

        /* renamed from: oa, reason: collision with root package name */
        private volatile SQLiteDatabase f25014oa = null;

        public C0061oa() {
        }

        private boolean oa() {
            SQLiteDatabase sQLiteDatabase = this.f25014oa;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        private void uef() {
            boolean zOa;
            try {
                if (this.f25014oa != null && this.f25014oa.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f25014oa == null || !this.f25014oa.isOpen()) {
                            this.f25014oa = xs.ivm().yo().uef(xs.ivm().lw());
                            this.f25014oa.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } finally {
                if (!zOa) {
                }
            }
        }

        public void uef(String str) throws SQLException {
            try {
                uef();
                this.f25014oa.execSQL(str);
            } catch (Throwable th) {
                if (oa()) {
                    throw th;
                }
            }
        }

        public Cursor uef(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                uef();
                return this.f25014oa.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                uef uefVar = new uef();
                if (oa()) {
                    throw th;
                }
                return uefVar;
            }
        }

        public int uef(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                uef();
                return this.f25014oa.update(str, contentValues, str2, strArr);
            } catch (Exception e7) {
                if (oa()) {
                    throw e7;
                }
                return 0;
            }
        }

        public long uef(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                uef();
                return this.f25014oa.insert(str, str2, contentValues);
            } catch (Exception e7) {
                if (oa()) {
                    throw e7;
                }
                return -1L;
            }
        }

        public synchronized void uef(String str, String str2, List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
            JSONObject jSONObjectIvm;
            try {
                try {
                    uef();
                    this.f25014oa.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        com.bytedance.sdk.component.ivm.uef.moa.uef uefVar = list.get(i5);
                        if (uefVar != null && (jSONObjectIvm = uefVar.ivm()) != null) {
                            contentValues.put("id", uefVar.yo());
                            String strOa = xs.ivm().wk().oa(jSONObjectIvm.toString());
                            if (!TextUtils.isEmpty(strOa)) {
                                contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, strOa);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.ivm.uef.yo.uef.moa() && uefVar.cz() > 0 && (uefVar.moa() == 0 || uefVar.moa() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(uefVar.cz()));
                                }
                                this.f25014oa.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.f25014oa.setTransactionSuccessful();
                    list.size();
                    if (this.f25014oa != null) {
                        this.f25014oa.endTransaction();
                    }
                } catch (Exception e7) {
                    list.size();
                    if (!oa()) {
                        if (this.f25014oa != null) {
                            this.f25014oa.endTransaction();
                        }
                    } else {
                        throw e7;
                    }
                }
            } catch (Throwable th) {
                if (this.f25014oa != null) {
                    this.f25014oa.endTransaction();
                }
                throw th;
            }
        }

        public int uef(String str, String str2, String[] strArr) throws Exception {
            try {
                uef();
                return this.f25014oa.delete(str, str2, strArr);
            } catch (Exception e7) {
                if (oa()) {
                    throw e7;
                }
                return 0;
            }
        }
    }
}
