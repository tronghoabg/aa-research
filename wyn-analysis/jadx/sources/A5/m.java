package A5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import df.InterfaceC2432a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import q5.C3868c;
import t5.C4114i;
import w5.EnumC4363c;

/* loaded from: classes3.dex */
public final class m implements d, B5.c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final C3868c f370f = new C3868c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final p f371a;

    /* renamed from: b, reason: collision with root package name */
    public final C5.a f372b;

    /* renamed from: c, reason: collision with root package name */
    public final C5.a f373c;

    /* renamed from: d, reason: collision with root package name */
    public final a f374d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2432a f375e;

    public m(C5.a aVar, C5.a aVar2, a aVar3, p pVar, InterfaceC2432a interfaceC2432a) {
        this.f371a = pVar;
        this.f372b = aVar;
        this.f373c = aVar2;
        this.f374d = aVar3;
        this.f375e = interfaceC2432a;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, C4114i c4114i) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c4114i.f45776a, String.valueOf(D5.a.a(c4114i.f45778c))));
        byte[] bArr = c4114i.f45777b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String w(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f350a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object y(Cursor cursor, k kVar) {
        try {
            return kVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        p pVar = this.f371a;
        Objects.requireNonNull(pVar);
        C5.a aVar = this.f373c;
        long jC = aVar.c();
        while (true) {
            try {
                return pVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.c() >= this.f374d.f347c + jC) {
                    throw new B5.a("Timed out while trying to open db.", e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f371a.close();
    }

    public final Object d(k kVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = kVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, C4114i c4114i, int i5) {
        ArrayList arrayList = new ArrayList();
        Long lB = b(sQLiteDatabase, c4114i);
        if (lB == null) {
            return arrayList;
        }
        y(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(i5)), new g(this, arrayList, c4114i, 1));
        return arrayList;
    }

    public final void i(long j8, EnumC4363c enumC4363c, String str) {
        d(new j(str, enumC4363c, j8));
    }

    public final Object o(B5.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        C5.a aVar = this.f373c;
        long jC = aVar.c();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objExecute = bVar.execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.c() >= this.f374d.f347c + jC) {
                    throw new B5.a("Timed out while trying to acquire the lock.", e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
