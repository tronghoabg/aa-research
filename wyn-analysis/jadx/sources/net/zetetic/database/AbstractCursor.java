package net.zetetic.database;

import A7.AbstractC0279p0;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public abstract class AbstractCursor implements Cursor {

    /* renamed from: b, reason: collision with root package name */
    public boolean f41024b;

    /* renamed from: c, reason: collision with root package name */
    public ContentResolver f41025c;

    /* renamed from: d, reason: collision with root package name */
    public Uri f41026d;

    /* renamed from: f, reason: collision with root package name */
    public SelfContentObserver f41028f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41029g;

    /* renamed from: e, reason: collision with root package name */
    public final Object f41027e = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final DataSetObservable f41030h = new DataSetObservable();

    /* renamed from: i, reason: collision with root package name */
    public final ContentObservable f41031i = new ContentObservable();

    /* renamed from: j, reason: collision with root package name */
    public Bundle f41032j = Bundle.EMPTY;

    /* renamed from: a, reason: collision with root package name */
    public int f41023a = -1;

    public static class SelfContentObserver extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f41033a;

        public SelfContentObserver(AbstractCursor abstractCursor) {
            super(null);
            this.f41033a = new WeakReference(abstractCursor);
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z2) {
            AbstractCursor abstractCursor = (AbstractCursor) this.f41033a.get();
            if (abstractCursor != null) {
                synchronized (abstractCursor.f41027e) {
                    abstractCursor.f41031i.dispatchChange(false, null);
                }
            }
        }
    }

    public void a() {
        SelfContentObserver selfContentObserver = this.f41028f;
        if (selfContentObserver != null) {
            this.f41025c.unregisterContentObserver(selfContentObserver);
            this.f41029g = false;
        }
        this.f41030h.notifyInvalidated();
    }

    public abstract void b(int i5);

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f41024b = true;
        this.f41031i.unregisterAll();
        a();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i5, CharArrayBuffer charArrayBuffer) {
        String string = getString(i5);
        if (string == null) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr == null || cArr.length < string.length()) {
            charArrayBuffer.data = string.toCharArray();
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        charArrayBuffer.sizeCopied = string.length();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        a();
    }

    public void finalize() {
        SelfContentObserver selfContentObserver = this.f41028f;
        if (selfContentObserver != null && this.f41029g) {
            this.f41025c.unregisterContentObserver(selfContentObserver);
        }
        try {
            if (this.f41024b) {
                return;
            }
            close();
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i5) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Logger.a(new Exception(), "Cursor", "requesting column name with table name -- ".concat(str));
            str = str.substring(iLastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (columnNames[i5].equalsIgnoreCase(str)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException(AbstractC0279p0.l("column '", str, "' does not exist"));
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i5) {
        return getColumnNames()[i5];
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.f41032j;
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        Uri uri;
        synchronized (this.f41027e) {
            uri = this.f41026d;
        }
        return uri;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f41023a;
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.f41023a == getCount();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.f41023a == -1;
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.f41024b;
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f41023a == 0 && getCount() != 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.f41023a == count + (-1) && count != 0;
    }

    @Override // android.database.Cursor
    public final boolean move(int i5) {
        return moveToPosition(this.f41023a + i5);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.f41023a + 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i5) {
        int count = getCount();
        if (i5 >= count) {
            this.f41023a = count;
            return false;
        }
        if (i5 < 0) {
            this.f41023a = -1;
            return false;
        }
        if (i5 == this.f41023a) {
            return true;
        }
        b(i5);
        this.f41023a = i5;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.f41023a - 1);
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.f41031i.registerObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f41030h.registerObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public boolean requery() {
        SelfContentObserver selfContentObserver = this.f41028f;
        if (selfContentObserver != null && !this.f41029g) {
            this.f41025c.registerContentObserver(this.f41026d, true, selfContentObserver);
            this.f41029g = true;
        }
        this.f41030h.notifyChanged();
        return true;
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.f41032j = bundle;
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.f41027e) {
            try {
                this.f41026d = uri;
                this.f41025c = contentResolver;
                SelfContentObserver selfContentObserver = this.f41028f;
                if (selfContentObserver != null) {
                    contentResolver.unregisterContentObserver(selfContentObserver);
                }
                SelfContentObserver selfContentObserver2 = new SelfContentObserver(this);
                this.f41028f = selfContentObserver2;
                this.f41025c.registerContentObserver(this.f41026d, true, selfContentObserver2);
                this.f41029g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        if (this.f41024b) {
            return;
        }
        this.f41031i.unregisterObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f41030h.unregisterObserver(dataSetObserver);
    }
}
