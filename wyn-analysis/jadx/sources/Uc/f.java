package Uc;

import A.AbstractC0213f;
import A7.X;
import J9.C0664x;
import Pc.C0800p;
import Va.X7;
import android.app.Activity;
import ba.C1521a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import m9.C3514m;
import m9.EnumC3515n;
import m9.H;
import m9.Q;
import m9.S;
import m9.T;
import m9.W;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4273j;
import uc.C4287x;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4272i;

/* loaded from: classes5.dex */
public class f implements FlutterFirebasePlugin, InterfaceC3885b, InterfaceC3964a {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f12728h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f12729i = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4269f f12731b;

    /* renamed from: a, reason: collision with root package name */
    public final C4287x f12730a = new C4287x(c.f12715d);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f12732c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f12733d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f12734e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12735f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f12736g = new HashMap();

    public static void a(FirebaseFirestore firebaseFirestore) {
        HashMap map = f12728h;
        synchronized (map) {
            try {
                if (((b) map.get(firebaseFirestore)) != null) {
                    map.remove(firebaseFirestore);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static b b(FirebaseFirestore firebaseFirestore) {
        b bVar;
        HashMap map = f12728h;
        synchronized (map) {
            bVar = (b) map.get(firebaseFirestore);
        }
        return bVar;
    }

    public static FirebaseFirestore c(n nVar) {
        synchronized (f12728h) {
            try {
                FirebaseFirestore firebaseFirestoreD = d(nVar.f12752a, nVar.f12754c);
                if (firebaseFirestoreD != null) {
                    return firebaseFirestoreD;
                }
                FirebaseFirestore firebaseFirestoreE = FirebaseFirestore.e(s8.g.f(nVar.f12752a), nVar.f12754c);
                firebaseFirestoreE.h(e(nVar));
                i(firebaseFirestoreE, nVar.f12754c);
                return firebaseFirestoreE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FirebaseFirestore d(String str, String str2) {
        HashMap map = f12728h;
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    s8.g gVar = ((b) entry.getValue()).f12713a.f27328g;
                    gVar.a();
                    if (gVar.f45329b.equals(str) && ((b) entry.getValue()).f12714b.equals(str2)) {
                        return (FirebaseFirestore) entry.getKey();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static H e(n nVar) {
        X x5 = new X();
        String str = nVar.f12753b.f12767b;
        if (str != null) {
            x5.f741a = str;
        }
        Boolean bool = nVar.f12753b.f12768c;
        if (bool != null) {
            x5.f742b = bool.booleanValue();
        }
        Boolean bool2 = nVar.f12753b.f12766a;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                Long l10 = nVar.f12753b.f12769d;
                x5.b(new T((l10 == null || l10.longValue() == -1) ? 104857600L : l10.longValue()));
            } else {
                S s10 = new S(0);
                Q q4 = new Q();
                q4.f40453a = s10;
                x5.b(q4);
            }
        }
        return x5.a();
    }

    public static void i(FirebaseFirestore firebaseFirestore, String str) {
        HashMap map = f12728h;
        synchronized (map) {
            try {
                if (((b) map.get(firebaseFirestore)) == null) {
                    map.put(firebaseFirestore, new b(firebaseFirestore, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new T3.r(9, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final String f(String str, InterfaceC4272i interfaceC4272i) {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        g(str, lowerCase, interfaceC4272i);
        return lowerCase;
    }

    public final void g(String str, String str2, InterfaceC4272i interfaceC4272i) {
        C4273j c4273j = new C4273j(this.f12731b, N0.a.g(str, "/", str2), this.f12730a);
        c4273j.a(interfaceC4272i);
        this.f12734e.put(str2, c4273j);
        this.f12735f.put(str2, interfaceC4272i);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(s8.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Nc.c(9, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final void h() {
        synchronized (this.f12734e) {
            try {
                Iterator it = this.f12734e.keySet().iterator();
                while (it.hasNext()) {
                    C4273j c4273j = (C4273j) this.f12734e.get((String) it.next());
                    Objects.requireNonNull(c4273j);
                    c4273j.a(null);
                }
                this.f12734e.clear();
            } finally {
            }
        }
        synchronized (this.f12735f) {
            try {
                Iterator it2 = this.f12735f.keySet().iterator();
                while (it2.hasNext()) {
                    InterfaceC4272i interfaceC4272i = (InterfaceC4272i) this.f12735f.get((String) it2.next());
                    Objects.requireNonNull(interfaceC4272i);
                    interfaceC4272i.onCancel(null);
                }
                this.f12735f.clear();
            } finally {
            }
        }
        this.f12736g.clear();
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        this.f12732c.set((Activity) ((s1) interfaceC3965b).f43896a);
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f12731b = c3884a.f44188c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
        InterfaceC4269f interfaceC4269f = this.f12731b;
        m mVar = m.f12751e;
        Object obj = null;
        final int i5 = 0;
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.loadBundle").n(new InterfaceC4265b(this) { // from class: Uc.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12749b;

            {
                this.f12749b = this;
            }

            @Override // uc.InterfaceC4265b
            public final void e(Object obj2, C1521a c1521a) {
                switch (i5) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f12749b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Vc.d(f.c((n) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        c1521a.c(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        n nVar = (n) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        u uVar = (u) arrayList4.get(3);
                        t tVar = (t) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i10 = AbstractC0213f.g(2)[((Integer) arrayList4.get(6)).intValue()];
                        f fVar = this.f12749b;
                        W wI = xg.g.I(f.c(nVar), str, bool.booleanValue(), uVar);
                        if (wI != null) {
                            EnumC3515n enumC3515nG = xg.g.G(tVar.f12772b);
                            int iE = xg.g.E(i10);
                            Vc.b bVar = new Vc.b(1);
                            bVar.f14862f = wI;
                            bVar.f14858b = bool2.booleanValue() ? 2 : 1;
                            bVar.f14859c = enumC3515nG;
                            bVar.f14860d = iE;
                            arrayList3.add(0, fVar.f("plugins.flutter.io/firebase_firestore/query", bVar));
                            c1521a.c(arrayList3);
                            break;
                        } else {
                            c1521a.c(A6.h.R(new o("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            break;
                        }
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        n nVar2 = (n) arrayList6.get(0);
                        j jVar = (j) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i11 = AbstractC0213f.g(2)[((Integer) arrayList6.get(3)).intValue()];
                        f fVar2 = this.f12749b;
                        f.c(nVar2);
                        C3514m c3514mD = f.c(nVar2).d(jVar.f12743a);
                        EnumC3515n enumC3515nG2 = xg.g.G(jVar.f12747e);
                        int iE2 = xg.g.E(i11);
                        Vc.b bVar2 = new Vc.b(0);
                        bVar2.f14862f = c3514mD;
                        bVar2.f14858b = bool3.booleanValue() ? 2 : 1;
                        bVar2.f14859c = enumC3515nG2;
                        bVar2.f14860d = iE2;
                        arrayList5.add(0, fVar2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        c1521a.c(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        n nVar3 = (n) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        f fVar3 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC = f.c(nVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Vc.g gVar = new Vc.g(new A5.h(19, fVar3, lowerCase), firebaseFirestoreC, lValueOf, lValueOf2);
                        fVar3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, gVar);
                        fVar3.f12736g.put(lowerCase, gVar);
                        arrayList7.add(0, lowerCase);
                        c1521a.c(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        n nVar4 = (n) ((ArrayList) obj2).get(0);
                        f fVar4 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC2 = f.c(nVar4);
                        Oc.d dVar = new Oc.d(3);
                        dVar.f8957c = firebaseFirestoreC2;
                        arrayList9.add(0, fVar4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", dVar));
                        c1521a.c(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i12 = AbstractC0213f.g(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        Vc.g gVar2 = (Vc.g) this.f12749b.f12736g.get(str2);
                        Objects.requireNonNull(gVar2);
                        gVar2.f14879f = i12;
                        gVar2.f14880g = list;
                        gVar2.f14878e.release();
                        arrayList10.add(0, null);
                        c1521a.c(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Kb.c(this.f12749b, (n) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new C0800p(new ArrayList(), c1521a, 13)));
                        break;
                }
            }
        });
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.namedQueryGet").n(new C0664x(this, 28));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.clearPersistence").n(new l(this, 0));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.disableNetwork").n(new l(this, 1));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.enableNetwork").n(new l(this, 2));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.terminate").n(new l(this, 3));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.waitForPendingWrites").n(new l(this, 4));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setIndexConfiguration").n(new l(this, 5));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setLoggingEnabled").n(new l(this, 6));
        final int i10 = 4;
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.snapshotsInSyncSetup").n(new InterfaceC4265b(this) { // from class: Uc.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12749b;

            {
                this.f12749b = this;
            }

            @Override // uc.InterfaceC4265b
            public final void e(Object obj2, C1521a c1521a) {
                switch (i10) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f12749b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Vc.d(f.c((n) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        c1521a.c(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        n nVar = (n) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        u uVar = (u) arrayList4.get(3);
                        t tVar = (t) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i102 = AbstractC0213f.g(2)[((Integer) arrayList4.get(6)).intValue()];
                        f fVar = this.f12749b;
                        W wI = xg.g.I(f.c(nVar), str, bool.booleanValue(), uVar);
                        if (wI != null) {
                            EnumC3515n enumC3515nG = xg.g.G(tVar.f12772b);
                            int iE = xg.g.E(i102);
                            Vc.b bVar = new Vc.b(1);
                            bVar.f14862f = wI;
                            bVar.f14858b = bool2.booleanValue() ? 2 : 1;
                            bVar.f14859c = enumC3515nG;
                            bVar.f14860d = iE;
                            arrayList3.add(0, fVar.f("plugins.flutter.io/firebase_firestore/query", bVar));
                            c1521a.c(arrayList3);
                            break;
                        } else {
                            c1521a.c(A6.h.R(new o("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            break;
                        }
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        n nVar2 = (n) arrayList6.get(0);
                        j jVar = (j) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i11 = AbstractC0213f.g(2)[((Integer) arrayList6.get(3)).intValue()];
                        f fVar2 = this.f12749b;
                        f.c(nVar2);
                        C3514m c3514mD = f.c(nVar2).d(jVar.f12743a);
                        EnumC3515n enumC3515nG2 = xg.g.G(jVar.f12747e);
                        int iE2 = xg.g.E(i11);
                        Vc.b bVar2 = new Vc.b(0);
                        bVar2.f14862f = c3514mD;
                        bVar2.f14858b = bool3.booleanValue() ? 2 : 1;
                        bVar2.f14859c = enumC3515nG2;
                        bVar2.f14860d = iE2;
                        arrayList5.add(0, fVar2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        c1521a.c(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        n nVar3 = (n) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        f fVar3 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC = f.c(nVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Vc.g gVar = new Vc.g(new A5.h(19, fVar3, lowerCase), firebaseFirestoreC, lValueOf, lValueOf2);
                        fVar3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, gVar);
                        fVar3.f12736g.put(lowerCase, gVar);
                        arrayList7.add(0, lowerCase);
                        c1521a.c(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        n nVar4 = (n) ((ArrayList) obj2).get(0);
                        f fVar4 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC2 = f.c(nVar4);
                        Oc.d dVar = new Oc.d(3);
                        dVar.f8957c = firebaseFirestoreC2;
                        arrayList9.add(0, fVar4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", dVar));
                        c1521a.c(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i12 = AbstractC0213f.g(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        Vc.g gVar2 = (Vc.g) this.f12749b.f12736g.get(str2);
                        Objects.requireNonNull(gVar2);
                        gVar2.f14879f = i12;
                        gVar2.f14880g = list;
                        gVar2.f14878e.release();
                        arrayList10.add(0, null);
                        c1521a.c(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Kb.c(this.f12749b, (n) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new C0800p(new ArrayList(), c1521a, 13)));
                        break;
                }
            }
        });
        final int i11 = 3;
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionCreate").n(new InterfaceC4265b(this) { // from class: Uc.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12749b;

            {
                this.f12749b = this;
            }

            @Override // uc.InterfaceC4265b
            public final void e(Object obj2, C1521a c1521a) {
                switch (i11) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f12749b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Vc.d(f.c((n) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        c1521a.c(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        n nVar = (n) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        u uVar = (u) arrayList4.get(3);
                        t tVar = (t) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i102 = AbstractC0213f.g(2)[((Integer) arrayList4.get(6)).intValue()];
                        f fVar = this.f12749b;
                        W wI = xg.g.I(f.c(nVar), str, bool.booleanValue(), uVar);
                        if (wI != null) {
                            EnumC3515n enumC3515nG = xg.g.G(tVar.f12772b);
                            int iE = xg.g.E(i102);
                            Vc.b bVar = new Vc.b(1);
                            bVar.f14862f = wI;
                            bVar.f14858b = bool2.booleanValue() ? 2 : 1;
                            bVar.f14859c = enumC3515nG;
                            bVar.f14860d = iE;
                            arrayList3.add(0, fVar.f("plugins.flutter.io/firebase_firestore/query", bVar));
                            c1521a.c(arrayList3);
                            break;
                        } else {
                            c1521a.c(A6.h.R(new o("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            break;
                        }
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        n nVar2 = (n) arrayList6.get(0);
                        j jVar = (j) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i112 = AbstractC0213f.g(2)[((Integer) arrayList6.get(3)).intValue()];
                        f fVar2 = this.f12749b;
                        f.c(nVar2);
                        C3514m c3514mD = f.c(nVar2).d(jVar.f12743a);
                        EnumC3515n enumC3515nG2 = xg.g.G(jVar.f12747e);
                        int iE2 = xg.g.E(i112);
                        Vc.b bVar2 = new Vc.b(0);
                        bVar2.f14862f = c3514mD;
                        bVar2.f14858b = bool3.booleanValue() ? 2 : 1;
                        bVar2.f14859c = enumC3515nG2;
                        bVar2.f14860d = iE2;
                        arrayList5.add(0, fVar2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        c1521a.c(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        n nVar3 = (n) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        f fVar3 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC = f.c(nVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Vc.g gVar = new Vc.g(new A5.h(19, fVar3, lowerCase), firebaseFirestoreC, lValueOf, lValueOf2);
                        fVar3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, gVar);
                        fVar3.f12736g.put(lowerCase, gVar);
                        arrayList7.add(0, lowerCase);
                        c1521a.c(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        n nVar4 = (n) ((ArrayList) obj2).get(0);
                        f fVar4 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC2 = f.c(nVar4);
                        Oc.d dVar = new Oc.d(3);
                        dVar.f8957c = firebaseFirestoreC2;
                        arrayList9.add(0, fVar4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", dVar));
                        c1521a.c(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i12 = AbstractC0213f.g(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        Vc.g gVar2 = (Vc.g) this.f12749b.f12736g.get(str2);
                        Objects.requireNonNull(gVar2);
                        gVar2.f14879f = i12;
                        gVar2.f14880g = list;
                        gVar2.f14878e.release();
                        arrayList10.add(0, null);
                        c1521a.c(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Kb.c(this.f12749b, (n) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new C0800p(new ArrayList(), c1521a, 13)));
                        break;
                }
            }
        });
        final int i12 = 5;
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionStoreResult").n(new InterfaceC4265b(this) { // from class: Uc.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12749b;

            {
                this.f12749b = this;
            }

            @Override // uc.InterfaceC4265b
            public final void e(Object obj2, C1521a c1521a) {
                switch (i12) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f12749b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Vc.d(f.c((n) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        c1521a.c(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        n nVar = (n) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        u uVar = (u) arrayList4.get(3);
                        t tVar = (t) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i102 = AbstractC0213f.g(2)[((Integer) arrayList4.get(6)).intValue()];
                        f fVar = this.f12749b;
                        W wI = xg.g.I(f.c(nVar), str, bool.booleanValue(), uVar);
                        if (wI != null) {
                            EnumC3515n enumC3515nG = xg.g.G(tVar.f12772b);
                            int iE = xg.g.E(i102);
                            Vc.b bVar = new Vc.b(1);
                            bVar.f14862f = wI;
                            bVar.f14858b = bool2.booleanValue() ? 2 : 1;
                            bVar.f14859c = enumC3515nG;
                            bVar.f14860d = iE;
                            arrayList3.add(0, fVar.f("plugins.flutter.io/firebase_firestore/query", bVar));
                            c1521a.c(arrayList3);
                            break;
                        } else {
                            c1521a.c(A6.h.R(new o("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            break;
                        }
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        n nVar2 = (n) arrayList6.get(0);
                        j jVar = (j) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i112 = AbstractC0213f.g(2)[((Integer) arrayList6.get(3)).intValue()];
                        f fVar2 = this.f12749b;
                        f.c(nVar2);
                        C3514m c3514mD = f.c(nVar2).d(jVar.f12743a);
                        EnumC3515n enumC3515nG2 = xg.g.G(jVar.f12747e);
                        int iE2 = xg.g.E(i112);
                        Vc.b bVar2 = new Vc.b(0);
                        bVar2.f14862f = c3514mD;
                        bVar2.f14858b = bool3.booleanValue() ? 2 : 1;
                        bVar2.f14859c = enumC3515nG2;
                        bVar2.f14860d = iE2;
                        arrayList5.add(0, fVar2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        c1521a.c(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        n nVar3 = (n) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        f fVar3 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC = f.c(nVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Vc.g gVar = new Vc.g(new A5.h(19, fVar3, lowerCase), firebaseFirestoreC, lValueOf, lValueOf2);
                        fVar3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, gVar);
                        fVar3.f12736g.put(lowerCase, gVar);
                        arrayList7.add(0, lowerCase);
                        c1521a.c(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        n nVar4 = (n) ((ArrayList) obj2).get(0);
                        f fVar4 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC2 = f.c(nVar4);
                        Oc.d dVar = new Oc.d(3);
                        dVar.f8957c = firebaseFirestoreC2;
                        arrayList9.add(0, fVar4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", dVar));
                        c1521a.c(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i122 = AbstractC0213f.g(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        Vc.g gVar2 = (Vc.g) this.f12749b.f12736g.get(str2);
                        Objects.requireNonNull(gVar2);
                        gVar2.f14879f = i122;
                        gVar2.f14880g = list;
                        gVar2.f14878e.release();
                        arrayList10.add(0, null);
                        c1521a.c(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Kb.c(this.f12749b, (n) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new C0800p(new ArrayList(), c1521a, 13)));
                        break;
                }
            }
        });
        final int i13 = 6;
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionGet").n(new InterfaceC4265b(this) { // from class: Uc.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12749b;

            {
                this.f12749b = this;
            }

            @Override // uc.InterfaceC4265b
            public final void e(Object obj2, C1521a c1521a) {
                switch (i13) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f12749b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Vc.d(f.c((n) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        c1521a.c(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        n nVar = (n) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        u uVar = (u) arrayList4.get(3);
                        t tVar = (t) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i102 = AbstractC0213f.g(2)[((Integer) arrayList4.get(6)).intValue()];
                        f fVar = this.f12749b;
                        W wI = xg.g.I(f.c(nVar), str, bool.booleanValue(), uVar);
                        if (wI != null) {
                            EnumC3515n enumC3515nG = xg.g.G(tVar.f12772b);
                            int iE = xg.g.E(i102);
                            Vc.b bVar = new Vc.b(1);
                            bVar.f14862f = wI;
                            bVar.f14858b = bool2.booleanValue() ? 2 : 1;
                            bVar.f14859c = enumC3515nG;
                            bVar.f14860d = iE;
                            arrayList3.add(0, fVar.f("plugins.flutter.io/firebase_firestore/query", bVar));
                            c1521a.c(arrayList3);
                            break;
                        } else {
                            c1521a.c(A6.h.R(new o("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            break;
                        }
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        n nVar2 = (n) arrayList6.get(0);
                        j jVar = (j) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i112 = AbstractC0213f.g(2)[((Integer) arrayList6.get(3)).intValue()];
                        f fVar2 = this.f12749b;
                        f.c(nVar2);
                        C3514m c3514mD = f.c(nVar2).d(jVar.f12743a);
                        EnumC3515n enumC3515nG2 = xg.g.G(jVar.f12747e);
                        int iE2 = xg.g.E(i112);
                        Vc.b bVar2 = new Vc.b(0);
                        bVar2.f14862f = c3514mD;
                        bVar2.f14858b = bool3.booleanValue() ? 2 : 1;
                        bVar2.f14859c = enumC3515nG2;
                        bVar2.f14860d = iE2;
                        arrayList5.add(0, fVar2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        c1521a.c(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        n nVar3 = (n) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        f fVar3 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC = f.c(nVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Vc.g gVar = new Vc.g(new A5.h(19, fVar3, lowerCase), firebaseFirestoreC, lValueOf, lValueOf2);
                        fVar3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, gVar);
                        fVar3.f12736g.put(lowerCase, gVar);
                        arrayList7.add(0, lowerCase);
                        c1521a.c(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        n nVar4 = (n) ((ArrayList) obj2).get(0);
                        f fVar4 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC2 = f.c(nVar4);
                        Oc.d dVar = new Oc.d(3);
                        dVar.f8957c = firebaseFirestoreC2;
                        arrayList9.add(0, fVar4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", dVar));
                        c1521a.c(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i122 = AbstractC0213f.g(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        Vc.g gVar2 = (Vc.g) this.f12749b.f12736g.get(str2);
                        Objects.requireNonNull(gVar2);
                        gVar2.f14879f = i122;
                        gVar2.f14880g = list;
                        gVar2.f14878e.release();
                        arrayList10.add(0, null);
                        c1521a.c(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Kb.c(this.f12749b, (n) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new C0800p(new ArrayList(), c1521a, 13)));
                        break;
                }
            }
        });
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSet").n(new l(this, 7));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceUpdate").n(new l(this, 8));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceGet").n(new l(this, 9));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceDelete").n(new l(this, 10));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.queryGet").n(new l(this, 11));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.aggregateQuery").n(new l(this, 12));
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.writeBatchCommit").n(new C0664x(this, 27));
        final int i14 = 1;
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.querySnapshot").n(new InterfaceC4265b(this) { // from class: Uc.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12749b;

            {
                this.f12749b = this;
            }

            @Override // uc.InterfaceC4265b
            public final void e(Object obj2, C1521a c1521a) {
                switch (i14) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f12749b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Vc.d(f.c((n) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        c1521a.c(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        n nVar = (n) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        u uVar = (u) arrayList4.get(3);
                        t tVar = (t) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i102 = AbstractC0213f.g(2)[((Integer) arrayList4.get(6)).intValue()];
                        f fVar = this.f12749b;
                        W wI = xg.g.I(f.c(nVar), str, bool.booleanValue(), uVar);
                        if (wI != null) {
                            EnumC3515n enumC3515nG = xg.g.G(tVar.f12772b);
                            int iE = xg.g.E(i102);
                            Vc.b bVar = new Vc.b(1);
                            bVar.f14862f = wI;
                            bVar.f14858b = bool2.booleanValue() ? 2 : 1;
                            bVar.f14859c = enumC3515nG;
                            bVar.f14860d = iE;
                            arrayList3.add(0, fVar.f("plugins.flutter.io/firebase_firestore/query", bVar));
                            c1521a.c(arrayList3);
                            break;
                        } else {
                            c1521a.c(A6.h.R(new o("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            break;
                        }
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        n nVar2 = (n) arrayList6.get(0);
                        j jVar = (j) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i112 = AbstractC0213f.g(2)[((Integer) arrayList6.get(3)).intValue()];
                        f fVar2 = this.f12749b;
                        f.c(nVar2);
                        C3514m c3514mD = f.c(nVar2).d(jVar.f12743a);
                        EnumC3515n enumC3515nG2 = xg.g.G(jVar.f12747e);
                        int iE2 = xg.g.E(i112);
                        Vc.b bVar2 = new Vc.b(0);
                        bVar2.f14862f = c3514mD;
                        bVar2.f14858b = bool3.booleanValue() ? 2 : 1;
                        bVar2.f14859c = enumC3515nG2;
                        bVar2.f14860d = iE2;
                        arrayList5.add(0, fVar2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        c1521a.c(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        n nVar3 = (n) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        f fVar3 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC = f.c(nVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Vc.g gVar = new Vc.g(new A5.h(19, fVar3, lowerCase), firebaseFirestoreC, lValueOf, lValueOf2);
                        fVar3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, gVar);
                        fVar3.f12736g.put(lowerCase, gVar);
                        arrayList7.add(0, lowerCase);
                        c1521a.c(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        n nVar4 = (n) ((ArrayList) obj2).get(0);
                        f fVar4 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC2 = f.c(nVar4);
                        Oc.d dVar = new Oc.d(3);
                        dVar.f8957c = firebaseFirestoreC2;
                        arrayList9.add(0, fVar4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", dVar));
                        c1521a.c(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i122 = AbstractC0213f.g(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        Vc.g gVar2 = (Vc.g) this.f12749b.f12736g.get(str2);
                        Objects.requireNonNull(gVar2);
                        gVar2.f14879f = i122;
                        gVar2.f14880g = list;
                        gVar2.f14878e.release();
                        arrayList10.add(0, null);
                        c1521a.c(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Kb.c(this.f12749b, (n) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new C0800p(new ArrayList(), c1521a, 13)));
                        break;
                }
            }
        });
        final int i15 = 2;
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSnapshot").n(new InterfaceC4265b(this) { // from class: Uc.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f12749b;

            {
                this.f12749b = this;
            }

            @Override // uc.InterfaceC4265b
            public final void e(Object obj2, C1521a c1521a) {
                switch (i15) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f12749b.f("plugins.flutter.io/firebase_firestore/loadBundle", new Vc.d(f.c((n) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        c1521a.c(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        n nVar = (n) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        u uVar = (u) arrayList4.get(3);
                        t tVar = (t) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i102 = AbstractC0213f.g(2)[((Integer) arrayList4.get(6)).intValue()];
                        f fVar = this.f12749b;
                        W wI = xg.g.I(f.c(nVar), str, bool.booleanValue(), uVar);
                        if (wI != null) {
                            EnumC3515n enumC3515nG = xg.g.G(tVar.f12772b);
                            int iE = xg.g.E(i102);
                            Vc.b bVar = new Vc.b(1);
                            bVar.f14862f = wI;
                            bVar.f14858b = bool2.booleanValue() ? 2 : 1;
                            bVar.f14859c = enumC3515nG;
                            bVar.f14860d = iE;
                            arrayList3.add(0, fVar.f("plugins.flutter.io/firebase_firestore/query", bVar));
                            c1521a.c(arrayList3);
                            break;
                        } else {
                            c1521a.c(A6.h.R(new o("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                            break;
                        }
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        n nVar2 = (n) arrayList6.get(0);
                        j jVar = (j) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i112 = AbstractC0213f.g(2)[((Integer) arrayList6.get(3)).intValue()];
                        f fVar2 = this.f12749b;
                        f.c(nVar2);
                        C3514m c3514mD = f.c(nVar2).d(jVar.f12743a);
                        EnumC3515n enumC3515nG2 = xg.g.G(jVar.f12747e);
                        int iE2 = xg.g.E(i112);
                        Vc.b bVar2 = new Vc.b(0);
                        bVar2.f14862f = c3514mD;
                        bVar2.f14858b = bool3.booleanValue() ? 2 : 1;
                        bVar2.f14859c = enumC3515nG2;
                        bVar2.f14860d = iE2;
                        arrayList5.add(0, fVar2.f("plugins.flutter.io/firebase_firestore/document", bVar2));
                        c1521a.c(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        n nVar3 = (n) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        f fVar3 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC = f.c(nVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        Vc.g gVar = new Vc.g(new A5.h(19, fVar3, lowerCase), firebaseFirestoreC, lValueOf, lValueOf2);
                        fVar3.g("plugins.flutter.io/firebase_firestore/transaction", lowerCase, gVar);
                        fVar3.f12736g.put(lowerCase, gVar);
                        arrayList7.add(0, lowerCase);
                        c1521a.c(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        n nVar4 = (n) ((ArrayList) obj2).get(0);
                        f fVar4 = this.f12749b;
                        FirebaseFirestore firebaseFirestoreC2 = f.c(nVar4);
                        Oc.d dVar = new Oc.d(3);
                        dVar.f8957c = firebaseFirestoreC2;
                        arrayList9.add(0, fVar4.f("plugins.flutter.io/firebase_firestore/snapshotsInSync", dVar));
                        c1521a.c(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i122 = AbstractC0213f.g(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        Vc.g gVar2 = (Vc.g) this.f12749b.f12736g.get(str2);
                        Objects.requireNonNull(gVar2);
                        gVar2.f14879f = i122;
                        gVar2.f14880g = list;
                        gVar2.f14878e.release();
                        arrayList10.add(0, null);
                        c1521a.c(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new Kb.c(this.f12749b, (n) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new C0800p(new ArrayList(), c1521a, 13)));
                        break;
                }
            }
        });
        new X7(interfaceC4269f, mVar, obj, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.persistenceCacheIndexManagerRequest").n(new C0664x(this, 29));
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f12732c.set(null);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f12732c.set(null);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        h();
        this.f12731b = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        this.f12732c.set((Activity) ((s1) interfaceC3965b).f43896a);
    }
}
