package com.google.android.datatransport.runtime.scheduling.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.autofill.HintConstants;
import com.google.android.datatransport.runtime.x;
import j$.util.Objects;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.datatransport.a f4276a = com.google.android.datatransport.a.a("proto");

    /* renamed from: b, reason: collision with root package name */
    private final v f4277b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4278c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4279d;

    /* renamed from: e, reason: collision with root package name */
    private final b f4280e;

    /* renamed from: f, reason: collision with root package name */
    private final g.a.a f4281f;

    r(com.google.android.datatransport.runtime.c.a aVar, com.google.android.datatransport.runtime.c.a aVar2, b bVar, v vVar, g.a.a aVar3) {
        this.f4277b = vVar;
        this.f4278c = aVar;
        this.f4279d = aVar2;
        this.f4280e = bVar;
        this.f4281f = aVar3;
    }

    private static String A(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((d) it.next()).a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private final List B(SQLiteDatabase sQLiteDatabase, x xVar, int i2) {
        ArrayList arrayList = new ArrayList();
        Long lC = C(sQLiteDatabase, xVar);
        if (lC == null) {
            return arrayList;
        }
        l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob", "experiment_ids_encrypted_list_blob", "pseudonymous_id_update_receiver_class_name"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i2)), new f(this, arrayList, xVar, 1));
        return arrayList;
    }

    private static final Long C(SQLiteDatabase sQLiteDatabase, x xVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(xVar.e(), String.valueOf(com.google.android.datatransport.runtime.d.a.a(xVar.d()))));
        if (xVar.f() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(xVar.f(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) l(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new i(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v9 com.google.android.datatransport.runtime.a.a.f) = 
  (r3v2 com.google.android.datatransport.runtime.a.a.f)
  (r3v3 com.google.android.datatransport.runtime.a.a.f)
  (r3v4 com.google.android.datatransport.runtime.a.a.f)
  (r3v5 com.google.android.datatransport.runtime.a.a.f)
  (r3v6 com.google.android.datatransport.runtime.a.a.f)
  (r3v7 com.google.android.datatransport.runtime.a.a.f)
 binds: [B:8:0x001f, B:11:0x0029, B:14:0x0032, B:17:0x003b, B:20:0x0044, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.android.datatransport.runtime.a.a.b d(com.google.android.datatransport.runtime.scheduling.a.r r5, java.util.Map r6, com.google.android.datatransport.runtime.a.a.a r7, android.database.Cursor r8) {
        /*
        L0:
            boolean r0 = r8.moveToNext()
            r1 = 1
            if (r0 == 0) goto L87
            r0 = 0
            java.lang.String r0 = r8.getString(r0)
            int r1 = r8.getInt(r1)
            com.google.android.datatransport.runtime.a.a.f r2 = com.google.android.datatransport.runtime.a.a.f.REASON_UNKNOWN
            int r3 = r2.a()
            if (r1 != r3) goto L19
            goto L5b
        L19:
            com.google.android.datatransport.runtime.a.a.f r3 = com.google.android.datatransport.runtime.a.a.f.MESSAGE_TOO_OLD
            int r4 = r3.a()
            if (r1 != r4) goto L23
        L21:
            r2 = r3
            goto L5b
        L23:
            com.google.android.datatransport.runtime.a.a.f r3 = com.google.android.datatransport.runtime.a.a.f.CACHE_FULL
            int r4 = r3.a()
            if (r1 != r4) goto L2c
            goto L21
        L2c:
            com.google.android.datatransport.runtime.a.a.f r3 = com.google.android.datatransport.runtime.a.a.f.PAYLOAD_TOO_BIG
            int r4 = r3.a()
            if (r1 != r4) goto L35
            goto L21
        L35:
            com.google.android.datatransport.runtime.a.a.f r3 = com.google.android.datatransport.runtime.a.a.f.MAX_RETRIES_REACHED
            int r4 = r3.a()
            if (r1 != r4) goto L3e
            goto L21
        L3e:
            com.google.android.datatransport.runtime.a.a.f r3 = com.google.android.datatransport.runtime.a.a.f.INVALID_PAYLOD
            int r4 = r3.a()
            if (r1 != r4) goto L47
            goto L21
        L47:
            com.google.android.datatransport.runtime.a.a.f r3 = com.google.android.datatransport.runtime.a.a.f.SERVER_ERROR
            int r4 = r3.a()
            if (r1 != r4) goto L50
            goto L21
        L50:
            java.lang.String r3 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "SQLiteEventStore"
            com.google.android.datatransport.cct.e.b(r4, r3, r1)
        L5b:
            r1 = 2
            long r3 = r8.getLong(r1)
            boolean r1 = r6.containsKey(r0)
            if (r1 != 0) goto L6e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.put(r0, r1)
        L6e:
            java.lang.Object r0 = r6.get(r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.datatransport.runtime.a.a.e r1 = com.google.android.datatransport.runtime.a.a.g.b()
            r1.c(r2)
            r1.b(r3)
            com.google.android.datatransport.runtime.a.a.g r1 = r1.a()
            r0.add(r1)
            goto L0
        L87:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L8f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            com.google.android.datatransport.runtime.a.a.h r0 = com.google.android.datatransport.runtime.a.a.i.a()
            java.lang.Object r2 = r8.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.c(r2)
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            r0.b(r8)
            com.google.android.datatransport.runtime.a.a.i r8 = r0.a()
            r7.b(r8)
            goto L8f
        Lb9:
            com.google.android.datatransport.runtime.c.a r6 = r5.f4278c
            long r2 = r6.a()
            com.google.android.datatransport.runtime.scheduling.a.k r6 = new com.google.android.datatransport.runtime.scheduling.a.k
            r6.<init>(r2, r1)
            java.lang.Object r6 = r5.j(r6)
            com.google.android.datatransport.runtime.a.a.l r6 = (com.google.android.datatransport.runtime.a.a.l) r6
            r7.e(r6)
            com.google.android.datatransport.runtime.a.a.c r6 = com.google.android.datatransport.runtime.a.a.d.a()
            com.google.android.datatransport.runtime.a.a.k r8 = com.google.android.datatransport.runtime.a.a.j.c()
            long r0 = r5.w()
            long r2 = r5.x()
            long r0 = r0 * r2
            r8.e(r0)
            com.google.android.datatransport.runtime.scheduling.a.b r0 = com.google.android.datatransport.runtime.scheduling.a.b.f4241a
            long r0 = r0.e()
            r8.f(r0)
            com.google.android.datatransport.runtime.a.a.j r8 = r8.d()
            r6.b(r8)
            com.google.android.datatransport.runtime.a.a.d r6 = r6.a()
            r7.d(r6)
            g.a.a r5 = r5.f4281f
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            r7.c(r5)
            com.google.android.datatransport.runtime.a.a.b r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.a.r.d(com.google.android.datatransport.runtime.scheduling.a.r, java.util.Map, com.google.android.datatransport.runtime.a.a.a, android.database.Cursor):com.google.android.datatransport.runtime.a.a.b");
    }

    public static /* synthetic */ Boolean f(r rVar, x xVar, SQLiteDatabase sQLiteDatabase) {
        Long lC = C(sQLiteDatabase, xVar);
        int i2 = 0;
        if (lC == null) {
            return false;
        }
        return (Boolean) l(rVar.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()}), new i(i2));
    }

    public static /* synthetic */ Long i(r rVar, com.google.android.datatransport.runtime.n nVar, x xVar, SQLiteDatabase sQLiteDatabase) {
        long jInsert;
        byte[] bArrArray;
        long jW = rVar.w() * rVar.x();
        b bVar = rVar.f4280e;
        if (jW >= bVar.e()) {
            rVar.o(1L, com.google.android.datatransport.runtime.a.a.f.CACHE_FULL, nVar.m());
            return -1L;
        }
        Long lC = C(sQLiteDatabase, xVar);
        if (lC != null) {
            jInsert = lC.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", xVar.e());
            contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.runtime.d.a.a(xVar.d())));
            contentValues.put("next_request_ms", (Integer) 0);
            if (xVar.f() != null) {
                contentValues.put("extras", Base64.encodeToString(xVar.f(), 0));
            }
            jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int iC = bVar.c();
        byte[] bArrB = nVar.h().b();
        boolean z = bArrB.length <= iC;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(jInsert));
        contentValues2.put("transport_name", nVar.m());
        contentValues2.put("timestamp_ms", Long.valueOf(nVar.f()));
        contentValues2.put("uptime_ms", Long.valueOf(nVar.g()));
        contentValues2.put("payload_encoding", nVar.h().a().b());
        contentValues2.put("code", nVar.i());
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArrB : new byte[0]);
        contentValues2.put("product_id", nVar.j());
        contentValues2.put("pseudonymous_id", nVar.k());
        contentValues2.put("experiment_ids_clear_blob", nVar.o());
        contentValues2.put("experiment_ids_encrypted_blob", nVar.p());
        List listN = nVar.n();
        if (listN == null) {
            bArrArray = new byte[0];
        } else {
            byte[][] bArr = (byte[][]) listN.toArray(new byte[0][]);
            int length = bArr.length * 4;
            int length2 = 0;
            for (byte[] bArr2 : bArr) {
                length2 += bArr2.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 + length);
            for (byte[] bArr3 : bArr) {
                byteBufferAllocate.putInt(bArr3.length);
                byteBufferAllocate.put(bArr3);
            }
            bArrArray = byteBufferAllocate.array();
        }
        contentValues2.put("experiment_ids_encrypted_list_blob", bArrArray);
        contentValues2.put("pseudonymous_id_update_receiver_class_name", nVar.l());
        long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z) {
            int iCeil = (int) Math.ceil(bArrB.length / iC);
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrB, (i2 - 1) * iC, Math.min(i2 * iC, bArrB.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(jInsert2));
                contentValues3.put("sequence_num", Integer.valueOf(i2));
                contentValues3.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : nVar.e().entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(jInsert2));
            contentValues4.put(HintConstants.AUTOFILL_HINT_NAME, (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(jInsert2);
    }

    static Object l(Cursor cursor, o oVar) {
        try {
            return oVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ List m(r rVar, x xVar, SQLiteDatabase sQLiteDatabase) {
        b bVar = rVar.f4280e;
        List listB = rVar.B(sQLiteDatabase, xVar, bVar.b());
        for (com.google.android.datatransport.c cVar : com.google.android.datatransport.c.values()) {
            if (cVar != xVar.d()) {
                int iB = bVar.b() - listB.size();
                if (iB <= 0) {
                    break;
                }
                listB.addAll(rVar.B(sQLiteDatabase, xVar.b(cVar), iB));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < listB.size(); i2++) {
            sb.append(((d) listB.get(i2)).a());
            if (i2 < listB.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        l(sQLiteDatabase.query("event_metadata", new String[]{"event_id", HintConstants.AUTOFILL_HINT_NAME, "value"}, sb.toString(), null, null, null, null), new g(map, 2));
        ListIterator listIterator = listB.listIterator();
        while (listIterator.hasNext()) {
            d dVar = (d) listIterator.next();
            if (map.containsKey(Long.valueOf(dVar.a()))) {
                com.google.android.datatransport.runtime.m mVarC = dVar.b().c();
                for (p pVar : (Set) map.get(Long.valueOf(dVar.a()))) {
                    mVarC.e(pVar.f4274a, pVar.f4275b);
                }
                listIterator.set(new d(dVar.a(), dVar.c(), mVarC.a()));
            }
        }
        return listB;
    }

    public static /* synthetic */ void t(r rVar, List list, x xVar, Cursor cursor) {
        int i2;
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            int i3 = cursor.getInt(7);
            com.google.android.datatransport.runtime.m mVarB = com.google.android.datatransport.runtime.n.b();
            mVarB.p(cursor.getString(1));
            mVarB.i(cursor.getLong(2));
            int i4 = 3;
            mVarB.q(cursor.getLong(3));
            if (i3 != 0) {
                mVarB.h(new com.google.android.datatransport.runtime.l(y(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mVarB.h(new com.google.android.datatransport.runtime.l(y(cursor.getString(4)), (byte[]) l(rVar.c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), new i(i4))));
            }
            if (!cursor.isNull(6)) {
                mVarB.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                mVarB.m(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                mVarB.n(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                mVarB.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                mVarB.k(cursor.getBlob(11));
            }
            if (!cursor.isNull(12)) {
                byte[] blob = cursor.getBlob(12);
                ArrayList arrayList = null;
                if (blob != null && blob.length != 0) {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(blob);
                    arrayList = new ArrayList();
                    while (byteBufferWrap.hasRemaining() && (i2 = byteBufferWrap.getInt()) <= byteBufferWrap.remaining()) {
                        byte[] bArr = new byte[i2];
                        byteBufferWrap.get(bArr);
                        arrayList.add(bArr);
                    }
                }
                mVarB.l(arrayList);
            }
            if (!cursor.isNull(13)) {
                mVarB.o(cursor.getString(13));
            }
            list.add(new d(j2, xVar, mVarB.a()));
        }
    }

    public static /* synthetic */ void u(r rVar, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + rVar.f4278c.a()).execute();
    }

    private final long w() {
        return c().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private final long x() {
        return c().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private static com.google.android.datatransport.a y(String str) {
        return str == null ? f4276a : com.google.android.datatransport.a.a(str);
    }

    private final Object z(q qVar, o oVar) {
        long jA = this.f4279d.a();
        while (true) {
            try {
                return qVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f4279d.a() >= this.f4280e.a() + jA) {
                    return oVar.a(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final int a() {
        return ((Integer) j(new h(this, this.f4278c.a() - this.f4280e.d(), 0))).intValue();
    }

    public final long b(x xVar) {
        return ((Long) l(c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{xVar.e(), String.valueOf(com.google.android.datatransport.runtime.d.a.a(xVar.d()))}), new i(5))).longValue();
    }

    final SQLiteDatabase c() {
        final v vVar = this.f4277b;
        Objects.requireNonNull(vVar);
        return (SQLiteDatabase) z(new q() { // from class: com.google.android.datatransport.runtime.scheduling.a.n
            @Override // com.google.android.datatransport.runtime.scheduling.a.q
            public final Object a() {
                return vVar.getWritableDatabase();
            }
        }, new i(8));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4277b.close();
    }

    public final com.google.android.datatransport.runtime.a.a.b e() {
        final com.google.android.datatransport.runtime.a.a.a aVarA = com.google.android.datatransport.runtime.a.a.b.a();
        final HashMap map = new HashMap();
        return (com.google.android.datatransport.runtime.a.a.b) j(new o() { // from class: com.google.android.datatransport.runtime.scheduling.a.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f4251b = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";

            @Override // com.google.android.datatransport.runtime.scheduling.a.o
            public final Object a(Object obj) {
                return (com.google.android.datatransport.runtime.a.a.b) r.l(((SQLiteDatabase) obj).rawQuery(this.f4251b, new String[0]), new f(this.f4250a, map, aVarA, 0));
            }
        });
    }

    public final Iterable g() {
        return (Iterable) j(new i(4));
    }

    public final Iterable h(x xVar) {
        return (Iterable) j(new m(this, xVar, 0));
    }

    final Object j(o oVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        sQLiteDatabaseC.beginTransaction();
        try {
            Object objA = oVar.a(sQLiteDatabaseC);
            sQLiteDatabaseC.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    public final Object k(com.google.android.datatransport.runtime.b.b bVar) {
        final SQLiteDatabase sQLiteDatabaseC = c();
        z(new q() { // from class: com.google.android.datatransport.runtime.scheduling.a.l
            @Override // com.google.android.datatransport.runtime.scheduling.a.q
            public final Object a() {
                sQLiteDatabaseC.beginTransaction();
                return null;
            }
        }, new i(7));
        try {
            Object objA = bVar.a();
            sQLiteDatabaseC.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    public final void n(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            j(new f(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(A(iterable)), 3));
        }
    }

    public final void o(final long j2, final com.google.android.datatransport.runtime.a.a.f fVar, final String str) {
        j(new o() { // from class: com.google.android.datatransport.runtime.scheduling.a.j
            @Override // com.google.android.datatransport.runtime.scheduling.a.o
            public final Object a(Object obj) throws SQLException {
                String str2 = str;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                com.google.android.datatransport.runtime.a.a.f fVar2 = fVar;
                boolean zBooleanValue = ((Boolean) r.l(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(fVar2.a())}), new i(6))).booleanValue();
                long j3 = j2;
                if (zBooleanValue) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(fVar2.a())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(fVar2.a()));
                    contentValues.put("events_dropped_count", Long.valueOf(j3));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    public final void p(x xVar, long j2) {
        j(new h(j2, xVar, 1));
    }

    public final void q(Iterable iterable) throws SQLException {
        if (iterable.iterator().hasNext()) {
            c().compileStatement("DELETE FROM events WHERE _id in ".concat(A(iterable))).execute();
        }
    }

    public final void r() {
        j(new g(this, 0));
    }

    public final boolean s(x xVar) {
        return ((Boolean) j(new m(this, xVar, 1))).booleanValue();
    }

    public final void v(x xVar, com.google.android.datatransport.runtime.n nVar) {
        com.google.android.datatransport.cct.e.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", xVar.d(), nVar.m(), xVar.e());
        ((Long) j(new f(this, nVar, xVar, 2))).longValue();
    }
}
