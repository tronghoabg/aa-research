package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class syj implements defpackage.syf {
    static final java.lang.Integer b;
    public static final java.lang.Long c;
    static final java.lang.String d;
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock e;
    public volatile byte f;
    public final java.util.concurrent.ConcurrentMap g;
    public final java.util.concurrent.ConcurrentMap h;
    public java.lang.Object i;
    private final java.util.concurrent.locks.ReentrantReadWriteLock k;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock l;
    private final java.util.concurrent.ConcurrentMap m;
    private final java.util.concurrent.ConcurrentMap n;
    private final java.util.concurrent.ConcurrentMap o;
    private boolean p;
    private final java.lang.String[] q;
    private static final java.lang.String[] j = new java.lang.String[0];
    static final java.lang.Boolean a = new java.lang.Boolean(false);

    static {
        new java.lang.Float(Float.NaN);
        b = new java.lang.Integer(-1);
        c = new java.lang.Long(-1L);
        d = new java.lang.String("");
    }

    public syj() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock(true);
        this.k = reentrantReadWriteLock;
        this.e = reentrantReadWriteLock.readLock();
        this.l = reentrantReadWriteLock.writeLock();
        this.f = (byte) 0;
        this.m = new j$.util.concurrent.ConcurrentHashMap();
        this.n = new j$.util.concurrent.ConcurrentHashMap(5);
        this.g = new j$.util.concurrent.ConcurrentHashMap(5);
        this.h = new j$.util.concurrent.ConcurrentHashMap(5);
        this.o = new j$.util.concurrent.ConcurrentHashMap(5);
        this.i = null;
        this.p = false;
        this.q = j;
    }

    private final void g() {
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.l;
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
            this.i = new java.lang.Object();
            this.p = false;
            this.f = (byte) 2;
            this.l.unlock();
        } catch (java.lang.Throwable th) {
            this.l.unlock();
            throw th;
        }
    }

    private static java.lang.String h(java.lang.String str) {
        if (str == d) {
            return null;
        }
        return str;
    }

    @Override // defpackage.syf
    public final boolean a(android.content.ContentResolver contentResolver, java.lang.String str, boolean z) {
        f(contentResolver);
        d(contentResolver);
        this.e.lock();
        try {
            java.lang.Object obj = this.i;
            java.util.Map map = this.n;
            java.lang.Object objValueOf = java.lang.Boolean.valueOf(z);
            java.lang.Object obj2 = a;
            java.lang.Boolean bool = (java.lang.Boolean) c(map, str, objValueOf, obj2);
            this.e.unlock();
            if (bool != null) {
                return bool.booleanValue();
            }
            java.lang.String strB = b(contentResolver, str);
            if (strB != null && !strB.isEmpty()) {
                if (defpackage.sye.c.matcher(strB).matches()) {
                    bool = java.lang.Boolean.TRUE;
                    z = true;
                } else if (defpackage.sye.d.matcher(strB).matches()) {
                    bool = java.lang.Boolean.FALSE;
                    z = false;
                } else {
                    android.util.Log.w("Gservices", defpackage.a.bB(strB, str, "attempt to read Gservices key ", " (value \"", "\") as boolean"));
                }
            }
            e(obj, this.n, str, bool, obj2);
            return z;
        } catch (java.lang.Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // defpackage.syf
    public final java.lang.String b(android.content.ContentResolver contentResolver, java.lang.String str) {
        java.lang.String string;
        f(contentResolver);
        d(contentResolver);
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.e;
        readLock.lock();
        try {
            java.lang.Object obj = this.i;
            java.lang.String str2 = (java.lang.String) this.m.get(str);
            if (str2 != null) {
                java.lang.String strH = h(str2);
                readLock.unlock();
                return strH;
            }
            this.e.unlock();
            try {
                android.net.Uri uri = defpackage.sye.a;
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new defpackage.syi("Unable to acquire ContentProviderClient");
                    }
                    try {
                        android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new java.lang.String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new defpackage.syi("ContentProvider query returned null cursor");
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
                                this.e.unlock();
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } catch (java.lang.Throwable th) {
                                this.e.unlock();
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            if (cursorQuery == null) {
                                throw th2;
                            }
                            try {
                                cursorQuery.close();
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (android.os.RemoteException e) {
                        throw new defpackage.syi(e);
                    }
                } catch (java.lang.Throwable th4) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th4;
                }
            } catch (defpackage.syi unused) {
            }
        } catch (java.lang.Throwable th5) {
            this.e.unlock();
            throw th5;
        }
    }

    public final java.lang.Object c(java.util.Map map, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = map.get(str);
        return obj3 == obj2 ? obj : obj3;
    }

    public final void d(android.content.ContentResolver contentResolver) {
        byte b2 = this.f;
        if (b2 != 0) {
            if (b2 != 1) {
                return;
            }
            g();
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.l;
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
                this.i = new java.lang.Object();
                this.f = (byte) 2;
                contentResolver.registerContentObserver(defpackage.sye.a, true, new defpackage.syh(this));
                this.l.unlock();
            }
        } catch (java.lang.Throwable th) {
            this.l.unlock();
            throw th;
        }
    }

    public final void e(java.lang.Object obj, java.util.Map map, java.lang.String str, java.lang.Object obj2, java.lang.Object obj3) {
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

    public final void f(android.content.ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new java.lang.IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }
}
