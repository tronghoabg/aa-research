package B8;

import E5.C0450f0;
import E5.C0464n;
import E5.C0465o;
import E5.F;
import E5.u0;
import F5.j;
import J5.p;
import J9.C0643b;
import J9.H;
import J9.L;
import J9.Y;
import J9.Z;
import K8.T;
import P2.h;
import Pc.C0788d;
import Pc.C0800p;
import Pc.C0801q;
import Re.AbstractC0814i;
import Va.Za;
import Z9.k;
import a.AbstractC1304a;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import ca.InterfaceC1592a;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vungle.ads.internal.ui.l;
import com.vungle.ads.internal.ui.view.n;
import f6.C2603p;
import f6.C2608u;
import h6.C2784c;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k1.r;
import k1.v0;
import l8.C3406H;
import m9.B;
import m9.S;
import n9.C3606a;
import q5.C3866a;
import q5.EnumC3870e;
import sa.f;
import t5.C4122q;
import ta.o;
import u6.g;
import u6.v;
import z9.C4648p;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements SuccessContinuation, L8.e, OnFailureListener, g, OnSuccessListener, Le.b, O9.a, r, He.e, com.vungle.ads.internal.ui.view.b, J5.c, Q1.c, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1602b;

    public /* synthetic */ b(F5.a aVar, C2603p c2603p, C2608u c2608u, IOException iOException, boolean z2) {
        this.f1601a = 12;
        this.f1602b = c2608u;
    }

    @Override // com.vungle.ads.internal.ui.view.b
    public void a(float f10, float f11) {
        n.a((n) this.f1602b, f10, f11);
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        switch (this.f1601a) {
            case 14:
                C0643b c0643b = (C0643b) this.f1602b;
                c0643b.getClass();
                HashSet hashSet = new HashSet();
                Iterator<E> it = ((o) obj).e().iterator();
                while (it.hasNext()) {
                    for (C4648p c4648p : ((f) it.next()).h()) {
                        if (!TextUtils.isEmpty(c4648p.b().getName())) {
                            hashSet.add(c4648p.b().getName());
                        }
                    }
                }
                if (hashSet.size() > 50) {
                    ic.d.F("Too many contextual triggers defined - limiting to 50");
                }
                ic.d.E("Updating contextual triggers for the following analytics events: " + hashSet);
                c0643b.f5917c.c(hashSet);
                break;
            case 15:
                o oVar = (o) obj;
                Z z2 = (Z) this.f1602b;
                if (!z2.f5910b) {
                    boolean z10 = z2.f5911c;
                    Y y10 = z2.f5909a;
                    if (z10) {
                        int i5 = z2.f5912d + 1;
                        z2.f5912d = i5;
                        if (i5 >= 5) {
                            z2.f5911c = false;
                            y10.a("fresh_install", false);
                        }
                    }
                    Iterator<E> it2 = oVar.e().iterator();
                    while (it2.hasNext()) {
                        if (((f) it2.next()).e()) {
                            z2.f5910b = true;
                            y10.a("test_device", true);
                            ic.d.F("Setting this device as a test device");
                            break;
                        }
                    }
                    break;
                }
                break;
            case 26:
                P2.a aVar = (P2.a) obj;
                h hVar = (h) this.f1602b;
                hVar.getClass();
                P2.g gVar = new P2.g(aVar.f9056b, S.d(aVar.f9057c, aVar.f9055a));
                hVar.f9070c.add(gVar);
                long j8 = hVar.f9077j;
                if (j8 == -9223372036854775807L || aVar.f9056b >= j8) {
                    hVar.b(gVar);
                    break;
                }
                break;
            default:
                ((C3406H) this.f1602b).a((P2.a) obj);
                break;
        }
    }

    public void b(byte[] bArr) {
        ((C4122q) this.f1602b).a(new C3866a(bArr, EnumC3870e.f44125a, null), new B(23));
    }

    @Override // O9.a
    public void f(O9.b bVar) {
        switch (this.f1601a) {
            case 16:
                L l10 = (L) this.f1602b;
                l10.getClass();
                l10.f5891a = bVar.get();
                break;
            case 24:
                O8.a aVar = (O8.a) this.f1602b;
                aVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                aVar.f8919b.set((O8.a) bVar.get());
                break;
            default:
                Za za2 = ((k) ((InterfaceC1592a) bVar.get())).a().f17060l;
                Set set = (Set) za2.f13918d;
                O8.b bVar2 = (O8.b) this.f1602b;
                set.add(bVar2);
                Task taskB = ((aa.c) za2.f13915a).b();
                taskB.addOnSuccessListener((Executor) za2.f13917c, new A5.g(za2, taskB, bVar2, 10));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    break;
                }
                break;
        }
    }

    @Override // He.e
    public void g(AbstractC0814i abstractC0814i) {
        ((H) ((xa.d) this.f1602b).f47873b).f5884a = new b(abstractC0814i, 19);
    }

    @Override // u6.g
    public void invoke(Object obj) {
        switch (this.f1601a) {
            case 4:
                ((u0) obj).I((C0450f0) this.f1602b);
                break;
            case 5:
                ((u0) obj).v((r6.r) this.f1602b);
                break;
            case 6:
                ((u0) obj).F((C2784c) this.f1602b);
                break;
            case 7:
                ((u0) obj).I(((F) this.f1602b).f3030a.f3060P);
                break;
            case 8:
                ((u0) obj).z((W5.c) this.f1602b);
                break;
            case 9:
                ((u0) obj).s((C0464n) this.f1602b);
                break;
            case 10:
                ((j) obj).f3928n = (C0465o) this.f1602b;
                break;
            case 11:
                j jVar = (j) obj;
                int i5 = jVar.f3938x;
                H5.e eVar = (H5.e) this.f1602b;
                jVar.f3938x = i5 + eVar.f4911h;
                jVar.f3939y += eVar.f4909f;
                break;
            default:
                j jVar2 = (j) obj;
                jVar2.getClass();
                jVar2.f3936v = ((C2608u) this.f1602b).f35107a;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0644  */
    @Override // L8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(C6.l r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B8.b.o(C6.l):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Object obj = this.f1602b;
        switch (this.f1601a) {
            case 28:
                HashMap map = C0788d.f9393i;
                C0800p c0800p = (C0800p) obj;
                if (!task.isSuccessful()) {
                    c0800p.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    c0800p.a(com.moloco.sdk.internal.publisher.H.i0((T) task.getResult()));
                    break;
                }
            default:
                HashMap map2 = C0788d.f9393i;
                C0801q c0801q = (C0801q) obj;
                if (!task.isSuccessful()) {
                    c0801q.b(AbstractC1304a.G(task.getException()));
                    break;
                } else {
                    c0801q.success();
                    break;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        C8.h hVar = (C8.h) this.f1602b;
        hVar.a();
        hVar.f1937e = hVar.f1937e == -1 ? 30L : hVar.f1937e * 2 < 960 ? hVar.f1937e * 2 : 960L;
        hVar.f1936d = hVar.f1935c.schedule(new C8.g(hVar, 0), hVar.f1937e, TimeUnit.SECONDS);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.vungle.ads.internal.platform.c.a((com.vungle.ads.internal.platform.c) this.f1602b, (AppSetIdInfo) obj);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f1601a) {
            case 0:
                d dVar = (d) this.f1602b;
                dVar.getClass();
                int i5 = 0;
                return Tasks.call(dVar.f1608c, new c(i5, dVar, new e((String) obj, i5)));
            default:
                C8.f fVar = (C8.f) this.f1602b;
                C8.b bVar = (C8.b) obj;
                fVar.f1926i.execute(new C8.d(1, fVar, bVar));
                fVar.f1929m = bVar;
                C8.n nVar = fVar.f1923f;
                nVar.getClass();
                C8.b bVarB = bVar instanceof C8.b ? bVar : C8.b.b(bVar.f1907a);
                nVar.f1957e = bVarB.f1908b + ((long) (bVarB.f1909c * 0.5d)) + 300000;
                long j8 = nVar.f1957e;
                long j10 = bVarB.f1908b;
                long j11 = bVarB.f1909c;
                if (j8 > j10 + j11) {
                    nVar.f1957e = (j10 + j11) - 60000;
                }
                if (nVar.b()) {
                    C8.h hVar = nVar.f1953a;
                    long j12 = nVar.f1957e;
                    nVar.f1954b.getClass();
                    hVar.b(j12 - System.currentTimeMillis());
                }
                Iterator it = fVar.f1921d.iterator();
                while (it.hasNext()) {
                    Oc.c cVar = (Oc.c) it.next();
                    cVar.getClass();
                    HashMap map = new HashMap();
                    map.put("token", bVar.f1907a);
                    cVar.f8954a.a(map);
                }
                C8.c cVarA = C8.c.a(bVar);
                Iterator it2 = fVar.f1920c.iterator();
                while (it2.hasNext()) {
                    ((C3606a) it2.next()).a(cVarA);
                }
                return Tasks.forResult(bVar);
        }
    }

    @Override // k1.r
    public v0 v(View view, v0 v0Var) {
        return l.a((l) this.f1602b, view, v0Var);
    }

    public /* synthetic */ b(F5.a aVar, Object obj, int i5) {
        this.f1601a = i5;
        this.f1602b = obj;
    }

    @Override // J5.c
    public long a(long j8) {
        return v.i((j8 * r0.f5664f) / 1000000, 0L, ((p) this.f1602b).k - 1);
    }

    public /* synthetic */ b(Object obj, int i5) {
        this.f1601a = i5;
        this.f1602b = obj;
    }
}
