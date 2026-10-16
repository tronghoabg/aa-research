package k3;

import A7.C0237b0;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import ff.AbstractC2640A;
import g5.RunnableC2707d;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC3340k;
import o3.InterfaceC3644a;
import s.C3986f;

/* renamed from: k3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3176h {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f39193m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3181m f39194a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39195b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f39196c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f39197d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f39198e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f39199f;

    /* renamed from: g, reason: collision with root package name */
    public volatile o3.g f39200g;

    /* renamed from: h, reason: collision with root package name */
    public final C0237b0 f39201h;

    /* renamed from: i, reason: collision with root package name */
    public final C3986f f39202i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f39203j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC2707d f39204l;

    public C3176h(AbstractC3181m abstractC3181m, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f39194a = abstractC3181m;
        this.f39195b = map;
        this.f39201h = new C0237b0(strArr.length);
        AbstractC3340k.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f39202i = new C3986f();
        this.f39203j = new Object();
        this.k = new Object();
        this.f39196c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str = strArr[i5];
            Locale locale = Locale.US;
            String strV = com.google.android.gms.internal.consent_sdk.a.v(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f39196c.put(strV, Integer.valueOf(i5));
            String str2 = (String) this.f39195b.get(strArr[i5]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                AbstractC3340k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                strV = lowerCase;
            }
            strArr2[i5] = strV;
        }
        this.f39197d = strArr2;
        for (Map.Entry entry : this.f39195b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strV2 = com.google.android.gms.internal.consent_sdk.a.v(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f39196c.containsKey(strV2)) {
                String lowerCase2 = ((String) entry.getKey()).toLowerCase(locale2);
                AbstractC3340k.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f39196c;
                linkedHashMap.put(lowerCase2, AbstractC2640A.P(strV2, linkedHashMap));
            }
        }
        this.f39204l = new RunnableC2707d(this, 1);
    }

    public final boolean a() {
        InterfaceC3644a interfaceC3644a = this.f39194a.f39223a;
        if (!(interfaceC3644a != null && interfaceC3644a.isOpen())) {
            return false;
        }
        if (!this.f39199f) {
            this.f39194a.g().I();
        }
        if (this.f39199f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(InterfaceC3644a interfaceC3644a, int i5) {
        interfaceC3644a.f("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)");
        String str = this.f39197d[i5];
        String[] strArr = f39193m;
        for (int i10 = 0; i10 < 3; i10++) {
            String str2 = strArr[i10];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + ic.d.C(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i5 + " AND invalidated = 0; END";
            AbstractC3340k.d(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC3644a.f(str3);
        }
    }

    public final void c(InterfaceC3644a database) {
        AbstractC3340k.e(database, "database");
        if (database.O()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f39194a.f39231i.readLock();
            AbstractC3340k.d(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.f39203j) {
                    int[] iArrP = this.f39201h.p();
                    if (iArrP != null) {
                        if (database.R()) {
                            database.n();
                        } else {
                            database.c();
                        }
                        try {
                            int length = iArrP.length;
                            int i5 = 0;
                            int i10 = 0;
                            while (i5 < length) {
                                int i11 = iArrP[i5];
                                int i12 = i10 + 1;
                                if (i11 == 1) {
                                    b(database, i10);
                                } else if (i11 == 2) {
                                    String str = this.f39197d[i10];
                                    String[] strArr = f39193m;
                                    for (int i13 = 0; i13 < 3; i13++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + ic.d.C(str, strArr[i13]);
                                        AbstractC3340k.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.f(str2);
                                    }
                                }
                                i5++;
                                i10 = i12;
                            }
                            database.k();
                            database.p();
                        } catch (Throwable th) {
                            database.p();
                            throw th;
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        } catch (IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
