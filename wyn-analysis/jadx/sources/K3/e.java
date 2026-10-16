package K3;

import A.AbstractC0213f;
import Uc.x;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kd.RunnableC3307c;
import m9.C3514m;
import m9.F;
import m9.G;
import m9.a0;
import m9.d0;
import m9.e0;
import ne.C3618a;
import p9.C3777B;
import p9.z;
import w9.C4386e;
import w9.C4393l;
import w9.EnumC4385d;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6469d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i5) {
        this.f6466a = i5;
        this.f6467b = obj;
        this.f6468c = obj2;
        this.f6469d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a0 a0VarA;
        switch (this.f6466a) {
            case 0:
                WorkDatabase workDatabase = ((f) this.f6467b).f6475e;
                S3.s sVarV = workDatabase.v();
                String str = (String) this.f6469d;
                ((ArrayList) this.f6468c).addAll(sVarV.r(str));
                return workDatabase.u().h(str);
            case 1:
                return ((M8.f) this.f6467b).f7553a.submit(new C8.d(22, (Callable) this.f6468c, (xa.d) this.f6469d));
            case 2:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f6467b;
                firebaseFirestore.getClass();
                d0 d0Var = new d0((C3777B) this.f6469d, firebaseFirestore);
                Vc.e eVar = (Vc.e) this.f6468c;
                Vc.g gVar = eVar.f14869a;
                A5.h hVar = gVar.f14874a;
                ((Uc.f) hVar.f361b).f12733d.put((String) hVar.f362c, d0Var);
                HashMap map = new HashMap();
                FirebaseFirestore firebaseFirestore2 = gVar.f14875b;
                s8.g gVar2 = firebaseFirestore2.f27328g;
                gVar2.a();
                map.put("appName", gVar2.f45329b);
                gVar.f14881h.post(new Vc.f(eVar.f14870b, map, 1));
                try {
                    if (!gVar.f14878e.tryAcquire(gVar.f14876c.longValue(), TimeUnit.MILLISECONDS)) {
                        return new Uc.g(new G("timed out", F.DEADLINE_EXCEEDED));
                    }
                    if (gVar.f14880g.isEmpty()) {
                        return new Uc.g();
                    }
                    if (gVar.f14879f == 2) {
                        return new Uc.g();
                    }
                    for (x xVar : gVar.f14880g) {
                        C3514m c3514mD = firebaseFirestore2.d(xVar.f12788b);
                        int iF = AbstractC0213f.f(xVar.f12787a);
                        C3777B c3777b = d0Var.f40473a;
                        FirebaseFirestore firebaseFirestore3 = d0Var.f40474b;
                        s9.h hVar2 = c3514mD.f40495a;
                        if (iF == 1) {
                            Map map2 = xVar.f12789c;
                            Objects.requireNonNull(map2);
                            C3618a c3618aI = firebaseFirestore3.f27329h.i(map2);
                            firebaseFirestore3.k(c3514mD);
                            c3777b.getClass();
                            try {
                                List listSingletonList = Collections.singletonList(new t9.l(hVar2, (s9.l) c3618aI.f41020a, (t9.f) c3618aI.f41021b, c3777b.b(hVar2), (List) c3618aI.f41022c));
                                A6.c.z(!c3777b.f43319d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
                                c3777b.f43318c.addAll(listSingletonList);
                            } catch (G e7) {
                                c3777b.f43320e = e7;
                            }
                            c3777b.f43321f.add(hVar2);
                        } else if (iF == 2) {
                            Uc.q qVar = xVar.f12790d;
                            Objects.requireNonNull(qVar);
                            Boolean bool = qVar.f12761a;
                            if (bool == null || !bool.booleanValue()) {
                                List list = qVar.f12762b;
                                a0VarA = list != null ? a0.a(xg.g.D(list)) : null;
                            } else {
                                a0VarA = a0.f40465d;
                            }
                            Map map3 = xVar.f12789c;
                            Objects.requireNonNull(map3);
                            Map map4 = map3;
                            if (a0VarA == null) {
                                d0Var.c(c3514mD, map4, a0.f40464c);
                            } else {
                                d0Var.c(c3514mD, map4, a0VarA);
                            }
                        } else if (iF == 3) {
                            firebaseFirestore3.k(c3514mD);
                            List listSingletonList2 = Collections.singletonList(new t9.e(hVar2, c3777b.a(hVar2)));
                            A6.c.z(!c3777b.f43319d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
                            c3777b.f43318c.addAll(listSingletonList2);
                            c3777b.f43321f.add(hVar2);
                        }
                    }
                    return new Uc.g();
                } catch (InterruptedException unused) {
                    return new Uc.g(new G("interrupted", F.DEADLINE_EXCEEDED));
                }
            default:
                p9.n nVar = (p9.n) this.f6467b;
                z zVar = nVar.f43387i;
                zVar.getClass();
                R1.q qVar2 = new R1.q();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                qVar2.f10162f = taskCompletionSource;
                C4386e c4386e = nVar.f43382d;
                qVar2.f10158b = c4386e;
                qVar2.f10159c = zVar.f43432b;
                qVar2.f10160d = (A5.g) this.f6469d;
                qVar2.f10157a = ((e0) this.f6468c).f40477a;
                C4393l c4393l = new C4393l(c4386e, EnumC4385d.f47424h, 1000L, 60000L);
                qVar2.f10161e = c4393l;
                qVar2.f10157a--;
                c4393l.a(new RunnableC3307c(qVar2, 6));
                return taskCompletionSource.getTask();
        }
    }
}
