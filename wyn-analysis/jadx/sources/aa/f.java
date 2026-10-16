package aa;

import A.AbstractC0213f;
import A7.C0240c0;
import F6.r;
import M.y;
import Va.M6;
import Va.Za;
import android.database.Cursor;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.applovin.applovin_max.AppLovinMAX;
import com.applovin.impl.Y;
import com.applovin.impl.i5;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.applovin.mediation.adapters.MolocoMediationAdapter;
import com.applovin.mediation.adapters.UnityAdsMediationAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import k2.M;
import ka.AbstractC3230e0;
import ka.AbstractC3256n;
import ka.C1;
import ka.C3214A;
import ka.C3277w;
import ka.C3279x;
import ka.C3282y0;
import m9.B;
import m9.C3506e;
import m9.C3507f;
import m9.F;
import m9.G;
import md.C3535c;
import md.S;
import md.c0;
import ne.C3618a;
import o1.C3641c;
import p9.C3777B;
import p9.u;
import r9.C3955l;
import r9.C3958o;
import r9.C3959p;
import r9.C3960q;
import r9.H;
import r9.InterfaceC3940A;
import r9.K;
import r9.O;
import s8.C4026b;
import t.InterfaceC4035a;
import t6.InterfaceC4143k;
import t6.InterfaceC4144l;
import uc.InterfaceC4280q;
import w5.EnumC4363c;
import w9.AbstractC4392k;
import w9.C4386e;
import w9.InterfaceC4388g;
import w9.InterfaceC4394m;
import w9.InterfaceC4396o;
import x6.InterfaceC4487r;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Continuation, AppLovinSdk.SdkInitializationListener, InterfaceC4035a, InterfaceC4487r, MolocoBidTokenListener, IUnityAdsTokenListener, InterfaceC4143k, L8.e, Q1.c, n2.l, OnCompleteListener, r6.i, InterfaceC4396o, InterfaceC4394m, B5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17431c;

    public /* synthetic */ f(int i5, Object obj, Object obj2) {
        this.f17429a = i5;
        this.f17430b = obj;
        this.f17431c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    @Override // r6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l8.e0 a(int r17, f6.Z r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.f.a(int, f6.Z, int[]):l8.e0");
    }

    @Override // Q1.c
    public void accept(Object obj) {
        Z1.d dVar = (Z1.d) this.f17430b;
        ((M) obj).q(dVar.f16926a, dVar.f16927b, (h2.g) this.f17431c);
    }

    @Override // t.InterfaceC4035a
    public Object apply(Object obj) {
        boolean z2 = true;
        Object obj2 = this.f17431c;
        Object obj3 = this.f17430b;
        switch (this.f17429a) {
            case 3:
                return ((com.applovin.impl.sdk.ad.b) obj3).a((MotionEvent) obj2, (i5) obj);
            case 23:
                String str = (String) obj2;
                Cursor cursor = (Cursor) obj;
                ((X2.j) obj3).getClass();
                if (cursor == null) {
                    return null;
                }
                try {
                    ja.d dVarI = ja.d.i(cursor.getBlob(2));
                    return new o9.j(str, new o9.i(v9.o.e(dVarI.f(), dVarI.g()), dVarI.e().equals(ja.c.FIRST) ? 1 : 2), new s9.o(new s8.q(cursor.getLong(0), cursor.getInt(1))));
                } catch (InvalidProtocolBufferException e7) {
                    A6.c.s("NamedQuery failed to parse: %s", e7);
                    throw null;
                }
            default:
                s9.k kVar = (s9.k) obj;
                if (!((u) obj3).g(kVar) && !((Set) obj2).contains(kVar.f45380a)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }

    @Override // t6.InterfaceC4143k
    public InterfaceC4144l b() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j) this.f17431c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d((String) this.f17430b, jVar.f32233c);
        jVar.f32246q = dVar;
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    @Override // n2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l8.e0 c(int r17, N1.O r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.f.c(int, N1.O, int[]):l8.e0");
    }

    public void d(String str, String str2) {
        ((C4026b) this.f17430b).f45322b = false;
        ((Y) this.f17431c).c(str, str2);
    }

    @Override // B5.b
    public Object execute() {
        switch (this.f17429a) {
            case 28:
                A5.m mVar = (A5.m) ((z5.f) this.f17430b).f48385c;
                mVar.getClass();
                Iterable iterable = (Iterable) this.f17431c;
                if (iterable.iterator().hasNext()) {
                    mVar.a().compileStatement("DELETE FROM events WHERE _id in " + A5.m.w(iterable)).execute();
                    break;
                }
                break;
            default:
                z5.f fVar = (z5.f) this.f17430b;
                fVar.getClass();
                Iterator it = ((HashMap) this.f17431c).entrySet().iterator();
                while (it.hasNext()) {
                    ((A5.m) fVar.f48391i).i(((Integer) r2.getValue()).intValue(), EnumC4363c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // w9.InterfaceC4396o
    public Object get() {
        int i5;
        Long lValueOf;
        Long lValueOf2;
        char c10;
        Object obj = this.f17431c;
        Object obj2 = this.f17430b;
        final int i10 = 0;
        switch (this.f17429a) {
            case 19:
                return ((C3955l) obj2).f44640j.A((String) obj);
            case 20:
                int i11 = 2;
                C3955l c3955l = (C3955l) obj2;
                C8.i iVar = (C8.i) obj;
                t9.i iVar2 = (t9.i) iVar.f1939b;
                c3955l.f44633c.j(iVar2, (ByteString) iVar.f1942e);
                Iterator it = iVar2.b().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList = (ArrayList) iVar.f1941d;
                    List list = iVar2.f45957d;
                    if (!zHasNext) {
                        c3955l.f44633c.e(iVar2);
                        c3955l.f44633c.a();
                        c3955l.f44634d.f(iVar2.f45954a);
                        Za za2 = c3955l.f44636f;
                        HashSet hashSet = new HashSet();
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (!((t9.j) arrayList.get(i12)).f45959b.isEmpty()) {
                                hashSet.add(((t9.h) list.get(i12)).f45951a);
                            }
                        }
                        za2.k(((InterfaceC3940A) za2.f13915a).y(hashSet));
                        return c3955l.f44636f.e(iVar2.b());
                    }
                    s9.h hVar = (s9.h) it.next();
                    InterfaceC3940A interfaceC3940A = c3955l.f44635e;
                    s9.k kVarB = interfaceC3940A.B(hVar);
                    s9.o oVar = (s9.o) ((c9.c) iVar.f1943f).b(hVar);
                    A6.c.z(oVar != null, "docVersions should contain every doc in the write.", new Object[0]);
                    if (kVarB.f45382c.compareTo(oVar) < 0) {
                        int size = list.size();
                        boolean z2 = arrayList.size() == size;
                        Integer numValueOf = Integer.valueOf(size);
                        Integer numValueOf2 = Integer.valueOf(arrayList.size());
                        i5 = i11;
                        Object[] objArr = new Object[i5];
                        objArr[0] = numValueOf;
                        objArr[1] = numValueOf2;
                        A6.c.z(z2, "Mismatch between mutations length (%d) and results length (%d)", objArr);
                        for (int i13 = 0; i13 < size; i13++) {
                            t9.h hVar2 = (t9.h) list.get(i13);
                            if (hVar2.f45951a.equals(kVarB.f45380a)) {
                                hVar2.b(kVarB, (t9.j) arrayList.get(i13));
                            }
                        }
                        if (!AbstractC0213f.b(kVarB.f45381b, 1)) {
                            interfaceC3940A.F(kVarB, (s9.o) iVar.f1940c);
                        }
                    } else {
                        i5 = i11;
                    }
                    i11 = i5;
                }
            case 21:
                SparseArray sparseArray = ((C3955l) obj2).k;
                C3960q c3960q = (C3960q) obj;
                J5.n nVar = c3960q.f44655b;
                long jLongValue = -1;
                if (nVar.f5655a == -1) {
                    Ba.c.p("LruGarbageCollector", "Garbage collection skipped; disabled", 1, new Object[0]);
                    return new C3958o();
                }
                Object obj3 = c3960q.f44654a;
                K k = (K) ((C0240c0) obj3).f827b;
                Cursor cursorI = k.g0("PRAGMA page_count").i();
                try {
                    if (cursorI.moveToFirst()) {
                        lValueOf = Long.valueOf(cursorI.getLong(0));
                        cursorI.close();
                    } else {
                        cursorI.close();
                        lValueOf = null;
                    }
                    long jLongValue2 = lValueOf.longValue();
                    Cursor cursorI2 = k.g0("PRAGMA page_size").i();
                    try {
                        if (cursorI2.moveToFirst()) {
                            lValueOf2 = Long.valueOf(cursorI2.getLong(0));
                            cursorI2.close();
                        } else {
                            cursorI2.close();
                            lValueOf2 = null;
                        }
                        long jLongValue3 = lValueOf2.longValue() * jLongValue2;
                        long j8 = nVar.f5655a;
                        if (jLongValue3 < j8) {
                            StringBuilder sbU = M6.u(jLongValue3, "Garbage collection skipped; Cache size ", " is lower than threshold ");
                            sbU.append(j8);
                            Ba.c.p("LruGarbageCollector", sbU.toString(), 1, new Object[0]);
                            return new C3958o();
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        K k5 = (K) ((C0240c0) obj3).f827b;
                        long j10 = k5.f44578g.f44595f;
                        Cursor cursorI3 = k5.g0("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").i();
                        try {
                            Long lValueOf3 = cursorI3.moveToFirst() ? Long.valueOf(cursorI3.getLong(0)) : null;
                            cursorI3.close();
                            int iLongValue = (int) ((10 / 100.0f) * (j10 + lValueOf3.longValue()));
                            if (iLongValue > 1000) {
                                Ba.c.p("LruGarbageCollector", AbstractC3256n.g(iLongValue, "Capping sequence numbers to collect down to the maximum of 1000 from "), 1, new Object[0]);
                                iLongValue = 1000;
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (iLongValue == 0) {
                                c10 = 2;
                            } else {
                                final C3959p c3959p = new C3959p();
                                c3959p.f44650a = iLongValue;
                                c3959p.f44651b = new PriorityQueue(iLongValue, C3959p.f44649c);
                                InterfaceC4388g interfaceC4388g = new InterfaceC4388g() { // from class: r9.n
                                    @Override // w9.InterfaceC4388g
                                    public final void accept(Object obj4) {
                                        switch (i10) {
                                            case 0:
                                                c3959p.a(Long.valueOf(((S) obj4).f44598c));
                                                break;
                                            default:
                                                c3959p.a((Long) obj4);
                                                break;
                                        }
                                    }
                                };
                                O o7 = ((K) ((C0240c0) obj3).f827b).f44578g;
                                c10 = 2;
                                Cursor cursorI4 = o7.f44590a.g0("SELECT target_proto FROM targets").i();
                                while (cursorI4.moveToNext()) {
                                    try {
                                        interfaceC4388g.accept(o7.k(cursorI4.getBlob(0)));
                                    } finally {
                                    }
                                }
                                cursorI4.close();
                                final char c11 = 1 == true ? 1 : 0;
                                InterfaceC4388g interfaceC4388g2 = new InterfaceC4388g() { // from class: r9.n
                                    @Override // w9.InterfaceC4388g
                                    public final void accept(Object obj4) {
                                        switch (c11) {
                                            case 0:
                                                c3959p.a(Long.valueOf(((S) obj4).f44598c));
                                                break;
                                            default:
                                                c3959p.a((Long) obj4);
                                                break;
                                        }
                                    }
                                };
                                Cursor cursorI5 = ((K) ((C0240c0) obj3).f827b).g0("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").i();
                                while (cursorI5.moveToNext()) {
                                    try {
                                        interfaceC4388g2.accept(Long.valueOf(cursorI5.getLong(0)));
                                    } finally {
                                    }
                                }
                                cursorI5.close();
                                jLongValue = ((Long) ((PriorityQueue) c3959p.f44651b).peek()).longValue();
                            }
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            O o10 = ((K) ((C0240c0) obj3).f827b).f44578g;
                            int[] iArr = new int[1];
                            C3618a c3618aG0 = o10.f44590a.g0("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
                            c3618aG0.b(Long.valueOf(jLongValue));
                            c3618aG0.f(new H(o10, sparseArray, iArr, 1));
                            o10.m();
                            int i14 = iArr[0];
                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                            final C0240c0 c0240c0 = (C0240c0) obj3;
                            c0240c0.getClass();
                            final int[] iArr2 = new int[1];
                            final ArrayList arrayList2 = new ArrayList();
                            final s9.m[] mVarArr = {s9.m.f45388b};
                            while (true) {
                                K k10 = (K) c0240c0.f827b;
                                long j11 = jCurrentTimeMillis;
                                C3618a c3618aG02 = k10.g0("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
                                Long lValueOf4 = Long.valueOf(jLongValue);
                                String strN = AbstractC3230e0.n(mVarArr[0]);
                                Object[] objArr2 = new Object[3];
                                objArr2[0] = lValueOf4;
                                objArr2[1] = strN;
                                objArr2[c10] = 100;
                                c3618aG02.b(objArr2);
                                if (c3618aG02.f(new InterfaceC4388g() { // from class: r9.G
                                    @Override // w9.InterfaceC4388g
                                    public final void accept(Object obj4) {
                                        boolean zMoveToFirst;
                                        C0240c0 c0240c02 = c0240c0;
                                        c0240c02.getClass();
                                        s9.m mVarL = AbstractC3230e0.l(((Cursor) obj4).getString(0));
                                        s9.h hVar3 = new s9.h(mVarL);
                                        boolean zL = ((Y2.B) c0240c02.f830e).l(hVar3);
                                        K k11 = (K) c0240c02.f827b;
                                        s9.m mVar = hVar3.f45375a;
                                        if (zL) {
                                            zMoveToFirst = true;
                                        } else {
                                            C3618a c3618aG03 = k11.g0("SELECT 1 FROM document_mutations WHERE path = ?");
                                            c3618aG03.b(AbstractC3230e0.n(mVar));
                                            Cursor cursorI6 = c3618aG03.i();
                                            try {
                                                zMoveToFirst = cursorI6.moveToFirst();
                                                cursorI6.close();
                                            } catch (Throwable th) {
                                                if (cursorI6 != null) {
                                                    try {
                                                        cursorI6.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!zMoveToFirst) {
                                            int[] iArr3 = iArr2;
                                            iArr3[0] = iArr3[0] + 1;
                                            arrayList2.add(hVar3);
                                            k11.f0("DELETE FROM target_documents WHERE path = ? AND target_id = 0", AbstractC3230e0.n(mVar));
                                        }
                                        mVarArr[0] = mVarL;
                                    }
                                }) != 100) {
                                    k10.f44580i.z(arrayList2);
                                    int i15 = iArr2[0];
                                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                                    if (Ba.c.E()) {
                                        StringBuilder sbJ = N0.a.j(M6.s(new StringBuilder("LRU Garbage Collection:\n\tCounted targets in "), jCurrentTimeMillis2 - j11, "ms\n"));
                                        Locale locale = Locale.ROOT;
                                        sbJ.append("\tDetermined least recently used " + iLongValue + " sequence numbers in " + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms\n");
                                        StringBuilder sbJ2 = N0.a.j(sbJ.toString());
                                        sbJ2.append("\tRemoved " + i14 + " targets in " + (jCurrentTimeMillis4 - jCurrentTimeMillis3) + "ms\n");
                                        StringBuilder sbJ3 = N0.a.j(sbJ2.toString());
                                        sbJ3.append("\tRemoved " + i15 + " documents in " + (jCurrentTimeMillis5 - jCurrentTimeMillis4) + "ms\n");
                                        StringBuilder sbJ4 = N0.a.j(sbJ3.toString());
                                        StringBuilder sb2 = new StringBuilder("Total Duration: ");
                                        sb2.append(jCurrentTimeMillis5 - j11);
                                        sb2.append("ms");
                                        sbJ4.append(sb2.toString());
                                        Ba.c.p("LruGarbageCollector", sbJ4.toString(), 1, new Object[0]);
                                    }
                                    return new C3958o();
                                }
                                jCurrentTimeMillis = j11;
                            }
                        } finally {
                            if (cursorI3 == null) {
                                throw th;
                            }
                            try {
                                cursorI3.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                        if (cursorI2 == null) {
                            throw th;
                        }
                        try {
                            cursorI2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                    if (cursorI == null) {
                        throw th;
                    }
                    try {
                        cursorI.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            default:
                C3955l c3955l2 = (C3955l) obj2;
                c3955l2.getClass();
                o9.e eVar = (o9.e) obj;
                o9.e eVarU = c3955l2.f44640j.u(eVar.f41439a);
                return Boolean.valueOf(eVarU != null && eVarU.f41441c.f45390a.compareTo(eVar.f41441c.f45390a) >= 0);
        }
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        String str = (String) this.f17430b;
        L8.b bVar = (L8.b) this.f17431c;
        try {
            Trace.beginSection(str);
            return bVar.f6995f.o(lVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
    public void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
        ((MolocoMediationAdapter) this.f17430b).lambda$collectSignal$1((MaxSignalCollectionListener) this.f17431c, str, errorType);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Task taskContinueWithTask;
        int i5 = 15;
        switch (this.f17429a) {
            case 15:
                R1.q qVar = (R1.q) this.f17430b;
                qVar.getClass();
                if (task.isSuccessful()) {
                    ((TaskCompletionSource) qVar.f10162f).setResult(((Task) this.f17431c).getResult());
                    return;
                } else {
                    qVar.s(task);
                    return;
                }
            default:
                R1.q qVar2 = (R1.q) this.f17430b;
                C3777B c3777b = (C3777B) this.f17431c;
                qVar2.getClass();
                if (!task.isSuccessful()) {
                    qVar2.s(task);
                    return;
                }
                A6.c.z(!c3777b.f43319d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
                G g9 = c3777b.f43320e;
                if (g9 != null) {
                    taskContinueWithTask = Tasks.forException(g9);
                } else {
                    HashSet hashSet = new HashSet(c3777b.f43317b.keySet());
                    Iterator it = c3777b.f43318c.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(((t9.h) it.next()).f45951a);
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        s9.h hVar = (s9.h) it2.next();
                        c3777b.f43318c.add(new t9.q(hVar, c3777b.a(hVar)));
                    }
                    c3777b.f43319d = true;
                    v9.g gVar = c3777b.f43316a;
                    ArrayList arrayList = c3777b.f43318c;
                    gVar.getClass();
                    C3277w c3277wE = C3279x.e();
                    c3277wE.b(gVar.f47066a.f47102b);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        c3277wE.a(gVar.f47066a.i((t9.h) it3.next()));
                    }
                    v9.m mVar = gVar.f47068c;
                    r rVar = AbstractC3230e0.f39402b;
                    if (rVar == null) {
                        synchronized (AbstractC3230e0.class) {
                            try {
                                rVar = AbstractC3230e0.f39402b;
                                if (rVar == null) {
                                    y yVarD = r.d();
                                    yVarD.f7229d = c0.f40628a;
                                    yVarD.f7230e = r.a("google.firestore.v1.Firestore", "Commit");
                                    yVarD.f7226a = true;
                                    C3279x c3279xD = C3279x.d();
                                    ExtensionRegistryLite extensionRegistryLite = td.c.f46039a;
                                    yVarD.f7227b = new td.b(c3279xD);
                                    yVarD.f7228c = new td.b(C3214A.c());
                                    r rVarD = yVarD.d();
                                    AbstractC3230e0.f39402b = rVarD;
                                    rVar = rVarD;
                                }
                            } finally {
                            }
                        }
                    }
                    C3279x c3279x = (C3279x) c3277wE.build();
                    mVar.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    X8.c cVar = mVar.f47095d;
                    ((Task) cVar.f16184a).continueWithTask(((C4386e) cVar.f16185b).f47427a, new f(26, cVar, rVar)).addOnCompleteListener(mVar.f47092a.f47427a, new A5.g(mVar, taskCompletionSource, c3279x, 23));
                    taskContinueWithTask = taskCompletionSource.getTask().continueWith(gVar.f47067b.f47427a, new C3641c(gVar, 7)).continueWithTask(AbstractC4392k.f47445b, new B(i5));
                }
                taskContinueWithTask.addOnCompleteListener(((C4386e) qVar2.f10158b).f47427a, new f(i5, qVar2, task));
                return;
        }
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        ((AppLovinMAX) this.f17430b).lambda$initialize$0((InterfaceC4280q) this.f17431c, appLovinSdkConfiguration);
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        ((UnityAdsMediationAdapter) this.f17430b).lambda$collectSignal$0((MaxSignalCollectionListener) this.f17431c, str);
    }

    @Override // x6.InterfaceC4487r
    public void onUserEarnedReward(R6.b bVar) {
        switch (this.f17429a) {
            case 4:
                ((GoogleAdManagerMediationAdapter) this.f17430b).lambda$showRewardedAd$0((String) this.f17431c, (zzccz) bVar);
                break;
            default:
                ((GoogleMediationAdapter) this.f17430b).lambda$showRewardedAd$1((String) this.f17431c, (zzccz) bVar);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [aa.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.net.HttpURLConnection] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        Integer num;
        Throwable th;
        Integer numValueOf;
        Z9.h hVar;
        int responseCode;
        boolean zD;
        switch (this.f17429a) {
            case 0:
                return ((h) this.f17430b).b(task, 0L, (HashMap) this.f17431c);
            case 1:
                ?? r13 = (n) this.f17430b;
                ?? r32 = (Task) this.f17431c;
                r13.getClass();
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e7) {
                    e = e7;
                    r32 = 0;
                    numValueOf = null;
                } catch (Throwable th3) {
                    num = null;
                    th = th3;
                    r32 = 0;
                }
                if (!r32.isSuccessful()) {
                    throw new IOException(r32.getException());
                }
                r13.i(true);
                r32 = (HttpURLConnection) r32.getResult();
                try {
                    responseCode = r32.getResponseCode();
                    numValueOf = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            synchronized (r13) {
                                r13.f17465c = 8;
                            }
                            r13.f17476o.e(0, k.f17453f);
                            r13.k(r32).g();
                        } catch (IOException e10) {
                            e = e10;
                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            n.b(r32);
                            r13.i(false);
                            boolean z2 = numValueOf == null || n.d(numValueOf.intValue());
                            if (z2) {
                                r13.f17475n.getClass();
                                r13.l(new Date(System.currentTimeMillis()));
                            }
                            if (!z2 && numValueOf.intValue() != 200) {
                                String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                if (numValueOf.intValue() == 403) {
                                    strF = n.f(r32.getErrorStream());
                                }
                                hVar = new Z9.h(numValueOf.intValue(), strF, 0);
                                r13.g(hVar);
                                return Tasks.forResult(null);
                            }
                            r13.h();
                            return Tasks.forResult(null);
                        }
                    }
                    n.b(r32);
                    r13.i(false);
                    zD = n.d(responseCode);
                    if (zD) {
                        r13.f17475n.getClass();
                        r13.l(new Date(System.currentTimeMillis()));
                    }
                } catch (IOException e11) {
                    e = e11;
                    numValueOf = null;
                } catch (Throwable th4) {
                    num = null;
                    th = th4;
                    n.b(r32);
                    r13.i(false);
                    boolean z10 = num == null || n.d(num.intValue());
                    if (z10) {
                        r13.f17475n.getClass();
                        r13.l(new Date(System.currentTimeMillis()));
                    }
                    if (z10 || num.intValue() == 200) {
                        r13.h();
                    } else {
                        String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                        if (num.intValue() == 403) {
                            strF2 = n.f(r32.getErrorStream());
                        }
                        r13.g(new Z9.h(num.intValue(), strF2, 0));
                    }
                    throw th;
                }
                if (!zD && responseCode != 200) {
                    String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                    if (responseCode == 403) {
                        strF3 = n.f(r32.getErrorStream());
                    }
                    hVar = new Z9.h(responseCode, strF3, 0);
                    r13.g(hVar);
                    return Tasks.forResult(null);
                }
                r13.h();
                return Tasks.forResult(null);
            case 12:
                C3506e c3506e = (C3506e) this.f17430b;
                c3506e.getClass();
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f17431c;
                if (zIsSuccessful) {
                    taskCompletionSource.setResult(new C3507f(c3506e, (Map) task.getResult()));
                } else {
                    taskCompletionSource.setException(task.getException());
                }
                return null;
            case 25:
                v9.g gVar = (v9.g) this.f17430b;
                gVar.getClass();
                if (!task.isSuccessful()) {
                    if ((task.getException() instanceof G) && ((G) task.getException()).f40425a == F.UNAUTHENTICATED) {
                        v9.m mVar = gVar.f47068c;
                        mVar.f47093b.Y();
                        mVar.f47094c.X();
                    }
                    throw task.getException();
                }
                HashMap map = new HashMap();
                for (Map.Entry entry : ((C3282y0) task.getResult()).c().b().entrySet()) {
                    Object key = entry.getKey();
                    HashMap map2 = (HashMap) this.f17431c;
                    A6.c.z(map2.containsKey(key), "%s not present in aliasMap", entry.getKey());
                    map.put((String) map2.get(entry.getKey()), (C1) entry.getValue());
                }
                return map;
            default:
                X8.c cVar = (X8.c) this.f17430b;
                cVar.getClass();
                return Tasks.forResult(((S) task.getResult()).h((r) this.f17431c, (C3535c) cVar.f16186c));
        }
    }
}
