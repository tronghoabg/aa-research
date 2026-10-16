package com.bytedance.sdk.openadsdk.oib.uef;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class uef implements Cursor {

    /* renamed from: oa, reason: collision with root package name */
    String[] f26056oa;
    Map<String, List<String>> uef;
    int yo = 0;

    public uef(Map<String, List<String>> map) {
        if (map == null || map.keySet() == null) {
            this.uef = new HashMap();
            return;
        }
        this.uef = map;
        try {
            this.f26056oa = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i5, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i5) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.f26056oa;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.f26056oa;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f26056oa;
            if (i5 >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i5])) {
                return i5;
            }
            i5++;
        }
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public String getColumnName(int i5) {
        if (i5 < 0) {
            return "";
        }
        String[] strArr = this.f26056oa;
        return i5 < strArr.length ? strArr[i5] : "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.f26056oa;
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.f26056oa;
            if (strArr != null && strArr.length != 0) {
                return this.uef.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i5) {
        try {
            return Double.parseDouble(getString(i5));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i5) {
        try {
            return Float.parseFloat(getString(i5));
        } catch (Exception unused) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i5) {
        try {
            return Integer.parseInt(getString(i5));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i5) {
        try {
            return Long.parseLong(getString(i5));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.yo;
    }

    @Override // android.database.Cursor
    public short getShort(int i5) {
        try {
            return Short.parseShort(getString(i5));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public String getString(int i5) {
        return (i5 < 0 || i5 >= getColumnCount()) ? "" : this.uef.get(this.f26056oa[i5]).get(getPosition());
    }

    @Override // android.database.Cursor
    public int getType(int i5) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.yo == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.yo == getCount() - 1;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i5) {
        return getString(i5) == null;
    }

    @Override // android.database.Cursor
    public boolean move(int i5) {
        if (this.yo + i5 >= getCount()) {
            return false;
        }
        this.yo += i5;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.yo = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.yo = this.uef.get(this.f26056oa[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.yo + 1 >= getCount()) {
            return false;
        }
        this.yo++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i5) {
        if (i5 >= getCount()) {
            return false;
        }
        this.yo = i5;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i5 = this.yo;
        if (i5 - 1 < 0) {
            return false;
        }
        this.yo = i5 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
