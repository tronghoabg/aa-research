package A5;

import A.e0;
import J9.G;
import J9.K;
import Va.Za;
import W9.v;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import ba.C1521a;
import ba.RunnableC1522b;
import com.applovin.impl.AbstractActivityC1655p;
import com.applovin.impl.AbstractActivityC1657q;
import com.applovin.impl.C1651n;
import com.applovin.impl.j2;
import com.applovin.impl.m8;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.t4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.H;
import k2.M;
import ka.C3247k;
import kd.RunnableC3307c;
import md.AbstractC3538f;
import md.C3549q;
import md.b0;
import md.k0;
import od.C3670a1;
import od.r;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONException;
import p7.AbstractC3772b;
import p9.C3777B;
import q5.C3868c;
import r9.C3955l;
import r9.Q;
import r9.S;
import s8.C4027c;
import t5.C4113h;
import t5.C4114i;
import t5.C4117l;
import v9.t;
import w4.InterfaceC4359a;
import w5.C4361a;
import w5.C4362b;
import w5.C4364d;
import w5.C4365e;
import w5.C4366f;
import w5.EnumC4363c;
import w9.InterfaceC4394m;
import w9.InterfaceC4396o;
import x4.C4469b;
import y5.C4563a;
import z9.C4634b;
import z9.C4635c;
import z9.EnumC4624C;
import z9.EnumC4625D;
import z9.Z;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements k, OnSuccessListener, O9.a, Continuation, SuccessContinuation, t4.b, s2.a, ConsentInformation.OnConsentInfoUpdateSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, Q1.c, InterfaceC4394m, InterfaceC4396o, OnCompleteListener, OnFailureListener, B5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f358c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f359d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i5) {
        this.f356a = i5;
        this.f357b = obj;
        this.f359d = obj2;
        this.f358c = obj3;
    }

    @Override // com.applovin.impl.s2.a
    public void a(j2 j2Var, r2 r2Var) {
        switch (this.f356a) {
            case 12:
                ((AbstractActivityC1655p) this.f357b).a((com.applovin.impl.sdk.k) this.f359d, (C1651n) this.f358c, j2Var, r2Var);
                break;
            default:
                ((AbstractActivityC1657q) this.f357b).a((List) this.f359d, (com.applovin.impl.sdk.k) this.f358c, j2Var, r2Var);
                break;
        }
    }

    @Override // Q1.c
    public void accept(Object obj) {
        ((M) obj).B(((Z1.d) this.f357b).f16926a, (H) this.f359d, (h2.g) this.f358c);
    }

    @Override // A5.k, k8.InterfaceC3199h
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        int i5;
        EnumC4363c enumC4363c;
        EnumC4363c enumC4363c2;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        EnumC4363c enumC4363c3 = EnumC4363c.CACHE_FULL;
        int i13 = 0;
        int i14 = 2;
        Object obj2 = this.f359d;
        Object obj3 = this.f358c;
        Object obj4 = this.f357b;
        int i15 = 1;
        switch (this.f356a) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                m mVar = (m) obj4;
                long jSimpleQueryForLong = mVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * mVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                a aVar = mVar.f374d;
                long j8 = aVar.f345a;
                C4113h c4113h = (C4113h) obj2;
                String str = c4113h.f45766a;
                if (jSimpleQueryForLong >= j8) {
                    mVar.i(1L, enumC4363c3, str);
                    return -1L;
                }
                C4114i c4114i = (C4114i) obj3;
                Long lB = m.b(sQLiteDatabase, c4114i);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c4114i.f45776a);
                    contentValues.put("priority", Integer.valueOf(D5.a.a(c4114i.f45778c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c4114i.f45777b;
                    if (bArr != null) {
                        contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                C4117l c4117l = c4113h.f45768c;
                byte[] bArr2 = c4117l.f45786b;
                int length = bArr2.length;
                int i16 = aVar.f349e;
                boolean z2 = length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c4113h.f45769d));
                contentValues2.put("uptime_ms", Long.valueOf(c4113h.f45770e));
                contentValues2.put("payload_encoding", c4117l.f45785a.f44124a);
                contentValues2.put("code", c4113h.f45767b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c4113h.f45772g);
                contentValues2.put("pseudonymous_id", c4113h.f45773h);
                contentValues2.put("experiment_ids_clear_blob", c4113h.f45774i);
                contentValues2.put("experiment_ids_encrypted_blob", c4113h.f45775j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int iCeil = (int) Math.ceil(bArr2.length / i16);
                    for (int i17 = 1; i17 <= iCeil; i17++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(c4113h.f45771f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(MediationMetaData.KEY_NAME, (String) entry.getKey());
                    contentValues4.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 1:
                Cursor cursor2 = (Cursor) obj;
                m mVar2 = (m) obj4;
                mVar2.getClass();
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    int i18 = cursor2.getInt(7) != 0 ? i15 : 0;
                    com.bumptech.glide.f fVar = new com.bumptech.glide.f();
                    fVar.f24235f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    fVar.f24230a = string;
                    fVar.f24233d = Long.valueOf(cursor2.getLong(i14));
                    fVar.f24234e = Long.valueOf(cursor2.getLong(3));
                    if (i18 != 0) {
                        String string2 = cursor2.getString(4);
                        fVar.f24232c = new C4117l(string2 == null ? m.f370f : new C3868c(string2), cursor2.getBlob(5));
                        i5 = i15;
                    } else {
                        String string3 = cursor2.getString(4);
                        C3868c c3868c = string3 == null ? m.f370f : new C3868c(string3);
                        Cursor cursorQuery = mVar2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                int i19 = i15;
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                                i15 = i19;
                            }
                            i5 = i15;
                            byte[] bArr3 = new byte[length2];
                            int i20 = 0;
                            int length3 = 0;
                            while (i20 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i20);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList2 = arrayList;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i20++;
                                    cursorQuery = cursor;
                                    arrayList = arrayList2;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            fVar.f24232c = new C4117l(c3868c, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        fVar.f24231b = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        fVar.f24236g = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        fVar.f24237h = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        fVar.f24238i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        fVar.f24239j = cursor2.getBlob(11);
                    }
                    ((ArrayList) obj2).add(new b(j10, (C4114i) obj3, fVar.f()));
                    i15 = i5;
                    i14 = 2;
                }
                return null;
            case 2:
                Cursor cursor3 = (Cursor) obj;
                m mVar3 = (m) obj4;
                mVar3.getClass();
                while (true) {
                    HashMap map = (HashMap) obj2;
                    if (cursor3.moveToNext()) {
                        String string4 = cursor3.getString(i13);
                        int i21 = cursor3.getInt(1);
                        EnumC4363c enumC4363c4 = EnumC4363c.REASON_UNKNOWN;
                        if (i21 != 0) {
                            if (i21 == 1) {
                                enumC4363c4 = EnumC4363c.MESSAGE_TOO_OLD;
                            } else if (i21 == 2) {
                                enumC4363c = enumC4363c3;
                                enumC4363c2 = enumC4363c;
                            } else if (i21 == i12) {
                                enumC4363c4 = EnumC4363c.PAYLOAD_TOO_BIG;
                            } else if (i21 == i11) {
                                enumC4363c4 = EnumC4363c.MAX_RETRIES_REACHED;
                            } else if (i21 == i10) {
                                enumC4363c4 = EnumC4363c.INVALID_PAYLOD;
                            } else if (i21 == 6) {
                                enumC4363c4 = EnumC4363c.SERVER_ERROR;
                            } else {
                                ic.d.n("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i21));
                            }
                            enumC4363c2 = enumC4363c3;
                            enumC4363c = enumC4363c4;
                        } else {
                            enumC4363c2 = enumC4363c3;
                            enumC4363c = enumC4363c4;
                        }
                        long j11 = cursor3.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new C4364d(j11, enumC4363c));
                        enumC4363c3 = enumC4363c2;
                        i10 = 5;
                        i11 = 4;
                        i12 = 3;
                        i13 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            S3.n nVar = (S3.n) obj3;
                            if (!it.hasNext()) {
                                long jC = mVar3.f372b.c();
                                SQLiteDatabase sQLiteDatabaseA = mVar3.a();
                                sQLiteDatabaseA.beginTransaction();
                                try {
                                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        cursorRawQuery.moveToNext();
                                        w5.g gVar = new w5.g(cursorRawQuery.getLong(0), jC);
                                        cursorRawQuery.close();
                                        sQLiteDatabaseA.setTransactionSuccessful();
                                        sQLiteDatabaseA.endTransaction();
                                        nVar.f10970a = gVar;
                                        nVar.f10972c = new C4362b(new C4366f(mVar3.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * mVar3.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), a.f344f.f345a));
                                        nVar.f10973d = (String) mVar3.f375e.get();
                                        return new C4361a((w5.g) nVar.f10970a, DesugarCollections.unmodifiableList((ArrayList) nVar.f10971b), (C4362b) nVar.f10972c, (String) nVar.f10973d);
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    sQLiteDatabaseA.endTransaction();
                                    throw th4;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i22 = C4365e.f47298c;
                            new ArrayList();
                            ((ArrayList) nVar.f10971b).add(new C4365e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
            default:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj4;
                firebaseFirestore.getClass();
                return Tasks.call((ThreadPoolExecutor) obj2, new K3.e(firebaseFirestore, (Vc.e) obj3, (C3777B) obj, i14));
        }
    }

    @Override // B5.b
    public Object execute() {
        C4563a c4563a = (C4563a) this.f357b;
        m mVar = (m) c4563a.f48029d;
        mVar.getClass();
        C4114i c4114i = (C4114i) this.f358c;
        C4113h c4113h = (C4113h) this.f359d;
        String strB = ic.d.B("SQLiteEventStore");
        if (Log.isLoggable(strB, 3)) {
            Log.d(strB, "Storing event with priority=" + c4114i.f45778c + ", name=" + c4113h.f45766a + " for destination " + c4114i.f45776a);
        }
        ((Long) mVar.d(new g(mVar, c4113h, c4114i, 0))).getClass();
        c4563a.f48026a.a(c4114i, 1, false);
        return null;
    }

    @Override // O9.a
    public void f(O9.b bVar) {
        K k = (K) this.f357b;
        String str = (String) this.f359d;
        w8.b bVar2 = (w8.b) this.f358c;
        if (k.f5890b == K.f5888c) {
            return;
        }
        w8.a aVarH = ((w8.d) bVar.get()).h(str, bVar2);
        k.f5890b = aVarH;
        synchronized (k) {
            try {
                if (!k.f5889a.isEmpty()) {
                    aVarH.c(k.f5889a);
                    k.f5889a = new HashSet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w9.InterfaceC4396o
    public Object get() {
        Object obj;
        Object obj2 = this.f358c;
        Object obj3 = this.f359d;
        C3955l c3955l = (C3955l) this.f357b;
        switch (this.f356a) {
            case 18:
                C8.i iVar = (C8.i) obj3;
                AbstractC3772b abstractC3772b = c3955l.f44631a;
                long jD = abstractC3772b.D().d();
                Iterator it = ((Map) iVar.f1940c).entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Q q4 = c3955l.f44639i;
                    if (!zHasNext) {
                        Object obj4 = obj2;
                        Map map = (Map) iVar.f1942e;
                        for (s9.h hVar : map.keySet()) {
                            if (((Set) iVar.f1943f).contains(hVar)) {
                                abstractC3772b.D().c(hVar);
                            }
                        }
                        C1521a c1521aD = c3955l.d(map);
                        s9.o oVarI = q4.i();
                        s9.o oVar = (s9.o) obj4;
                        if (!oVar.equals(s9.o.f45389b)) {
                            A6.c.z(oVar.compareTo(oVarI) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", oVar, oVarI);
                            q4.e(oVar);
                        }
                        return c3955l.f44636f.h((HashMap) c1521aD.f19414b, (HashSet) c1521aD.f19415c);
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Integer num = (Integer) entry.getKey();
                    int iIntValue = num.intValue();
                    t tVar = (t) entry.getValue();
                    SparseArray sparseArray = c3955l.k;
                    S s10 = (S) sparseArray.get(iIntValue);
                    if (s10 != null) {
                        q4.a(tVar.f47116e, iIntValue);
                        q4.c(tVar.f47114c, iIntValue);
                        S sB = s10.b(jD);
                        if (((Map) iVar.f1941d).containsKey(num)) {
                            ByteString byteString = ByteString.EMPTY;
                            s9.o oVar2 = s9.o.f45389b;
                            S sA = sB.a(byteString, oVar2);
                            obj = obj2;
                            sB = new S(sA.f44596a, sA.f44597b, sA.f44598c, sA.f44599d, sA.f44600e, oVar2, sA.f44602g, null);
                        } else {
                            obj = obj2;
                            ByteString byteString2 = tVar.f47112a;
                            if (!byteString2.isEmpty()) {
                                sB = sB.a(byteString2, (s9.o) iVar.f1939b);
                            }
                        }
                        sparseArray.put(iIntValue, sB);
                        if (C3955l.e(s10, sB, tVar)) {
                            q4.b(sB);
                        }
                        obj2 = obj;
                    }
                }
            default:
                c9.d dVarA = s9.h.f45374c;
                HashMap map2 = new HashMap();
                for (Map.Entry entry2 : (c9.c) obj3) {
                    s9.h hVar2 = (s9.h) entry2.getKey();
                    s9.k kVar = (s9.k) entry2.getValue();
                    if (kVar.d()) {
                        dVarA = dVarA.a(hVar2);
                    }
                    map2.put(hVar2, kVar);
                }
                S s11 = (S) obj2;
                int i5 = s11.f44597b;
                Q q10 = c3955l.f44639i;
                q10.j(i5);
                q10.c(dVarA, s11.f44597b);
                C1521a c1521aD2 = c3955l.d(map2);
                return c3955l.f44636f.h((HashMap) c1521aD2.f19414b, (HashSet) c1521aD2.f19415c);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Object obj = this.f358c;
        Object obj2 = this.f359d;
        Object obj3 = this.f357b;
        switch (this.f356a) {
            case 20:
                b0 b0Var = new b0();
                Task task2 = (Task) obj3;
                C3670a1 c3670a1 = (C3670a1) obj2;
                if (task2.isSuccessful()) {
                    String str = (String) task2.getResult();
                    Ba.c.p("FirestoreCallCredentials", "Successfully fetched auth token.", 1, new Object[0]);
                    if (str != null) {
                        b0Var.f(v9.i.f47075c, "Bearer ".concat(str));
                    }
                } else {
                    Exception exception = task2.getException();
                    if (exception instanceof C4027c) {
                        Ba.c.p("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", 1, new Object[0]);
                    } else {
                        if (!(exception instanceof U9.a)) {
                            Ba.c.p("FirestoreCallCredentials", "Failed to get auth token: %s.", 2, exception);
                            c3670a1.a(k0.f40679j.g(exception));
                            return;
                        }
                        Ba.c.p("FirestoreCallCredentials", "No user signed in, not using authentication.", 1, new Object[0]);
                    }
                }
                Task task3 = (Task) obj;
                if (task3.isSuccessful()) {
                    String str2 = (String) task3.getResult();
                    if (str2 != null && !str2.isEmpty()) {
                        Ba.c.p("FirestoreCallCredentials", "Successfully fetched AppCheck token.", 1, new Object[0]);
                        b0Var.f(v9.i.f47076d, str2);
                    }
                } else {
                    Exception exception2 = task3.getException();
                    if (!(exception2 instanceof C4027c)) {
                        Ba.c.p("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", 2, exception2);
                        c3670a1.a(k0.f40679j.g(exception2));
                        return;
                    }
                    Ba.c.p("FirestoreCallCredentials", "Firebase AppCheck API not available.", 1, new Object[0]);
                }
                Fe.e.w("apply() or fail() already called", !c3670a1.f41911j);
                b0 b0Var2 = c3670a1.f41904c;
                b0Var2.d(b0Var);
                C3549q c3549q = c3670a1.f41906e;
                C3549q c3549qA = c3549q.a();
                try {
                    r rVarC = c3670a1.f41902a.c(c3670a1.f41903b, b0Var2, c3670a1.f41905d, c3670a1.f41908g);
                    c3549q.c(c3549qA);
                    c3670a1.b(rVarC);
                    return;
                } catch (Throwable th) {
                    c3549q.c(c3549qA);
                    throw th;
                }
            case 21:
                v9.m mVar = (v9.m) obj3;
                mVar.getClass();
                AbstractC3538f abstractC3538f = (AbstractC3538f) task.getResult();
                abstractC3538f.e(new v9.l((Za) obj2, abstractC3538f), mVar.a());
                abstractC3538f.c(1);
                abstractC3538f.d((C3247k) obj);
                abstractC3538f.b();
                return;
            case 22:
                v9.m mVar2 = (v9.m) obj3;
                mVar2.getClass();
                AbstractC3538f abstractC3538f2 = (AbstractC3538f) task.getResult();
                AbstractC3538f[] abstractC3538fArr = (AbstractC3538f[]) obj2;
                abstractC3538fArr[0] = abstractC3538f2;
                E4.n nVar = (E4.n) obj;
                abstractC3538f2.e(new v9.j(mVar2, nVar, abstractC3538fArr), mVar2.a());
                ((A2.d) nVar.f2939c).N(new RunnableC3307c(nVar, 16));
                abstractC3538fArr[0].c(1);
                return;
            default:
                v9.m mVar3 = (v9.m) obj3;
                mVar3.getClass();
                AbstractC3538f abstractC3538f3 = (AbstractC3538f) task.getResult();
                abstractC3538f3.e(new v9.l(mVar3, (TaskCompletionSource) obj2), mVar3.a());
                abstractC3538f3.c(2);
                abstractC3538f3.d((GeneratedMessageLite) obj);
                abstractC3538f3.b();
                return;
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((com.applovin.impl.privacy.cmp.a) this.f357b).a((a.InterfaceC0018a) this.f359d, (FormError) this.f358c, formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        ((com.applovin.impl.privacy.cmp.a) this.f357b).a((Activity) this.f359d, (a.InterfaceC0018a) this.f358c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) throws IntentSender.SendIntentException {
        C4469b c4469b = (C4469b) this.f357b;
        c4469b.getClass();
        boolean z2 = exc instanceof s;
        InterfaceC4359a interfaceC4359a = (InterfaceC4359a) this.f358c;
        if (!z2) {
            if (((com.google.android.gms.common.api.j) exc).getStatusCode() == 8502) {
                c4469b.g(c4469b.f47687f);
                return;
            } else {
                interfaceC4359a.onError(3);
                return;
            }
        }
        Activity activity = (Activity) this.f359d;
        if (activity == null) {
            interfaceC4359a.onError(3);
            return;
        }
        s sVar = (s) exc;
        if (sVar.getStatusCode() != 6) {
            interfaceC4359a.onError(3);
            return;
        }
        try {
            int i5 = c4469b.f47686e;
            Status status = sVar.getStatus();
            if (status.f26431c != null) {
                Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
                PendingIntent pendingIntent = status.f26431c;
                AbstractC1732v.i(pendingIntent);
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i5, null, 0, 0, 0, bundle);
            }
        } catch (IntentSender.SendIntentException unused) {
            interfaceC4359a.onError(3);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) throws JSONException {
        switch (this.f356a) {
            case 3:
                G g9 = (G) this.f357b;
                g9.getClass();
                Z z2 = (Z) G.f5875h.get((EnumC4625D) this.f358c);
                C4634b c4634bA = g9.a((N9.h) this.f359d, (String) obj);
                c4634bA.h(z2);
                g9.f5877a.b(((C4635c) c4634bA.build()).toByteArray());
                break;
            case 4:
                G g10 = (G) this.f357b;
                g10.getClass();
                z9.r rVar = (z9.r) G.f5876i.get((EnumC4624C) this.f358c);
                C4634b c4634bA2 = g10.a((N9.h) this.f359d, (String) obj);
                c4634bA2.d(rVar);
                g10.f5877a.b(((C4635c) c4634bA2.build()).toByteArray());
                break;
            default:
                Task task = (Task) this.f359d;
                O8.b bVar = (O8.b) this.f358c;
                Za za2 = (Za) this.f357b;
                try {
                    aa.e eVar = (aa.e) task.getResult();
                    if (eVar != null) {
                        ((Executor) za2.f13917c).execute(new RunnableC1522b(bVar, ((C1521a) za2.f13916b).u(eVar), 1));
                        break;
                    }
                } catch (Z9.f e7) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e7);
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        aa.e eVar;
        URL url;
        switch (this.f356a) {
            case 6:
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f357b;
                if (zIsSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (((AtomicBoolean) this.f359d).getAndSet(true)) {
                    ((CancellationTokenSource) this.f358c).cancel();
                }
                return Tasks.forResult(null);
            case 7:
            default:
                aa.n nVar = (aa.n) this.f357b;
                nVar.getClass();
                Task task2 = (Task) this.f359d;
                if (!task2.isSuccessful()) {
                    return Tasks.forException(new Z9.e("Firebase Installations failed to get installation auth token for config update listener connection.", task2.getException()));
                }
                Task task3 = (Task) this.f358c;
                try {
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new Z9.e("Firebase Installations failed to get installation ID for config update listener connection.", task3.getException()));
                    }
                    try {
                        url = new URL(nVar.c(nVar.f17473l));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    nVar.j(httpURLConnection, (String) task3.getResult(), ((P9.a) task2.getResult()).f9265a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e7) {
                    return Tasks.forException(new Z9.e("Failed to open HTTP stream connection", e7));
                }
            case 8:
                Z9.d dVar = (Z9.d) this.f357b;
                dVar.getClass();
                Task task4 = (Task) this.f359d;
                if (!task4.isSuccessful() || task4.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                aa.e eVar2 = (aa.e) task4.getResult();
                Task task5 = (Task) this.f358c;
                return (task5.isSuccessful() && (eVar = (aa.e) task5.getResult()) != null && eVar2.f17424c.equals(eVar.f17424c)) ? Tasks.forResult(Boolean.FALSE) : dVar.f17054e.e(eVar2).continueWith(dVar.f17052c, new Z9.c(dVar));
        }
    }

    public /* synthetic */ g(C4563a c4563a, C4114i c4114i, C4113h c4113h) {
        this.f356a = 25;
        this.f357b = c4563a;
        this.f358c = c4114i;
        this.f359d = c4113h;
    }

    @Override // com.applovin.impl.t4.b
    public void a(boolean z2, Object obj, Object obj2) {
        ((m8) this.f357b).a((AppLovinPostbackListener) this.f359d, (String) this.f358c, z2, (String) obj, (String) obj2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f357b;
        String str = (String) this.f359d;
        v vVar = (v) this.f358c;
        String str2 = (String) obj;
        e0 e0VarD = FirebaseMessaging.d(firebaseMessaging.f27361b);
        String strE = firebaseMessaging.e();
        String strB = firebaseMessaging.f27368i.b();
        synchronized (e0VarD) {
            String strA = v.a(System.currentTimeMillis(), str2, strB);
            if (strA != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) e0VarD.f152b).edit();
                editorEdit.putString(e0.j(strE, str), strA);
                editorEdit.commit();
            }
        }
        if (vVar == null || !str2.equals(vVar.f15394a)) {
            s8.g gVar = firebaseMessaging.f27360a;
            gVar.a();
            if ("[DEFAULT]".equals(gVar.f45329b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar.a();
                    sb2.append(gVar.f45329b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new W9.i(firebaseMessaging.f27361b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
