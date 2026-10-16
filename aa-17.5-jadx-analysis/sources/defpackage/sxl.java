package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class sxl implements sxh {
    static final Integer b;
    public static final Long c;
    static final String d;
    public final ReentrantReadWriteLock.ReadLock e;
    public volatile byte f;
    public final ConcurrentMap g;
    public final ConcurrentMap h;
    public Object i;
    private final ReentrantReadWriteLock k;
    private final ReentrantReadWriteLock.WriteLock l;
    private final ConcurrentMap m;
    private final ConcurrentMap n;
    private final ConcurrentMap o;
    private boolean p;
    private final String[] q;
    private static final String[] j = new String[0];
    static final Boolean a = new Boolean(false);

    static {
        new Float(Float.NaN);
        b = new Integer(-1);
        c = new Long(-1L);
        d = new String("");
    }

    public sxl() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.k = reentrantReadWriteLock;
        this.e = reentrantReadWriteLock.readLock();
        this.l = reentrantReadWriteLock.writeLock();
        this.f = (byte) 0;
        this.m = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap(5);
        this.g = new ConcurrentHashMap(5);
        this.h = new ConcurrentHashMap(5);
        this.o = new ConcurrentHashMap(5);
        this.i = null;
        this.p = false;
        this.q = j;
    }

    private final void g() {
        ReentrantReadWriteLock.WriteLock writeLock = this.l;
        writeLock.lock();
        try {
            if (this.f == 2) {
                writeLock.unlock();
                return;
            }
            this.m.clear();
            this.n.clear();
            this.g.clear();
            this.h.clear();
            this.o.clear();
            this.i = new Object();
            this.p = false;
            this.f = (byte) 2;
        } finally {
            this.l.unlock();
        }
    }

    private static String h(String str) {
        if (str == d) {
            return null;
        }
        return str;
    }

    @Override // defpackage.sxh
    public final boolean a(ContentResolver contentResolver, String str, boolean z) throws sxk {
        f(contentResolver);
        d(contentResolver);
        this.e.lock();
        try {
            Object obj = this.i;
            ConcurrentMap concurrentMap = this.n;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean bool = a;
            Boolean bool2 = (Boolean) c(concurrentMap, str, boolValueOf, bool);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            String strB = b(contentResolver, str);
            if (strB != null && !strB.isEmpty()) {
                if (sxg.c.matcher(strB).matches()) {
                    z = true;
                    bool2 = true;
                } else if (sxg.d.matcher(strB).matches()) {
                    z = false;
                    bool2 = false;
                } else {
                    Log.w("Gservices", a.bC(strB, str, "attempt to read Gservices key ", " (value \"", "\") as boolean"));
                }
            }
            e(obj, this.n, str, bool2, bool);
            return z;
        } finally {
            this.e.unlock();
        }
    }

    @Override // defpackage.sxh
    public final String b(ContentResolver contentResolver, String str) throws sxk {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        f(contentResolver);
        d(contentResolver);
        ReentrantReadWriteLock.ReadLock readLock = this.e;
        readLock.lock();
        try {
            Object obj = this.i;
            String str2 = (String) this.m.get(str);
            if (str2 != null) {
                String strH = h(str2);
                readLock.unlock();
                return strH;
            }
            this.e.unlock();
            try {
                uri = sxg.a;
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (sxk unused) {
            }
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new sxk("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new sxk("ContentProvider query returned null cursor");
                    }
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(1);
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    } else {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        string = null;
                    }
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    this.e.lock();
                    try {
                        if (obj == this.i) {
                            this.m.put(str, string == null ? d : string);
                        }
                        if (string != null) {
                            return string;
                        }
                        return null;
                    } finally {
                    }
                } finally {
                }
            } catch (RemoteException e) {
                throw new sxk(e);
            }
        } finally {
        }
    }

    public final Object c(Map map, String str, Object obj, Object obj2) {
        Object obj3 = map.get(str);
        return obj3 == obj2 ? obj : obj3;
    }

    public final void d(ContentResolver contentResolver) {
        byte b2 = this.f;
        if (b2 != 0) {
            if (b2 != 1) {
                return;
            }
            g();
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.l;
        writeLock.lock();
        try {
            byte b3 = this.f;
            if (b3 == 1) {
                g();
                writeLock.unlock();
            } else {
                if (b3 == 2) {
                    writeLock.unlock();
                    return;
                }
                this.i = new Object();
                this.f = (byte) 2;
                contentResolver.registerContentObserver(sxg.a, true, new sxj(this));
            }
        } finally {
            this.l.unlock();
        }
    }

    public final void e(Object obj, Map map, String str, Object obj2, Object obj3) {
        this.l.lock();
        try {
            if (obj == this.i) {
                if (obj2 == null) {
                    obj2 = obj3;
                }
                map.put(str, obj2);
                this.m.remove(str);
            }
        } finally {
            this.l.unlock();
        }
    }

    public final void f(ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }
}
