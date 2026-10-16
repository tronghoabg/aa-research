package defpackage;

import android.util.Log;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Row;
import androidx.car.app.serialization.ListDelegateImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class jta extends eql implements eqa {
    public final ept a;
    private final eqc h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jta(ajmd ajmdVar, fux fuxVar, final ieb iebVar, int i) {
        this(1, null);
        this.i = i;
        this.a.c(new jsv(fuxVar, 1));
        ehq ehqVar = new ehq((Object) fuxVar, 3, (short[]) null);
        gen genVarG = ((geu) ajmdVar.a).g();
        ept eptVar = this.a;
        juh juhVar = new juh(ehqVar, 2);
        eptVar.getClass();
        List list = genVarG.a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (affa.f(((gem) it.next()).a, juhVar)) {
                    throw new IllegalStateException("The same listener cannot be registered multiple times.");
                }
            }
        }
        list.add(0, new gem(genVarG, eptVar, juhVar));
        r(fuxVar.c, new ewg(new afec() { // from class: fuz
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v0, types: [fur, gmo] */
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                gru gruVarC;
                fuw fuwVar = (fuw) obj;
                fuwVar.getClass();
                gru gruVar = fuwVar.a;
                if (!gruVar.a && gruVar.e) {
                    Map map = fuwVar.d;
                    if (aclh.u(map) >= 16) {
                        int iU = aclh.u(map);
                        int i2 = fvf.a;
                        List list2 = (List) map.get(fve.a);
                        if (iU - (list2 != null ? list2.size() : 0) != 0) {
                            Collection collectionValues = map.values();
                            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                                Iterator it2 = collectionValues.iterator();
                                int i3 = 0;
                                while (it2.hasNext()) {
                                    if (!((List) it2.next()).isEmpty() && (i3 = i3 + 1) < 0) {
                                        woy.bn();
                                    }
                                }
                                if (i3 >= 2) {
                                    Log.i("GH.AJTelemetry", "onAlphaJumpOffered");
                                    gml gmlVar = fuwVar.b;
                                    int iOrdinal = gmlVar.ordinal();
                                    if (iOrdinal == 0 || iOrdinal == 1) {
                                        gruVarC = gruVar;
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new aezs();
                                        }
                                        afbt afbtVar = new afbt(10);
                                        for (fvd fvdVar : map.keySet()) {
                                            Object obj2 = map.get(fvdVar);
                                            obj2.getClass();
                                            List list3 = (List) obj2;
                                            ArrayList arrayList = new ArrayList(woy.bp(list3, 10));
                                            Iterator it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                arrayList.add(((fva) it3.next()).b);
                                            }
                                            if (!arrayList.isEmpty()) {
                                                CarText carTextCreate = CarText.create(fvdVar.a);
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj3 : arrayList) {
                                                    if (((Row) obj3).isIndexable()) {
                                                        arrayList2.add(obj3);
                                                    }
                                                }
                                                afbtVar.add(new grr(woy.cc(arrayList2, new ail(8)), new ListDelegateImpl(arrayList), null, gkf.b, carTextCreate));
                                            }
                                        }
                                        gruVarC = gru.c(gruVar, false, afbtVar.f(), 59);
                                    }
                                    ieb iebVar2 = iebVar;
                                    Object obj4 = iebVar2.a;
                                    obj4.getClass();
                                    Set setKeySet = map.keySet();
                                    ArrayList arrayList3 = new ArrayList(woy.bp(setKeySet, 10));
                                    Iterator it4 = setKeySet.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        fvd fvdVar2 = (fvd) it4.next();
                                        sw swVar = new sw();
                                        swVar.b = CarText.create(fvdVar2.a);
                                        swVar.d(new jsu(iebVar2, fvdVar2, 1, null));
                                        map.get(fvdVar2).getClass();
                                        swVar.a = !((Collection) r11).isEmpty();
                                        arrayList3.add(swVar.a());
                                    }
                                    fvd fvdVar3 = fuwVar.c;
                                    ?? furVar = new fur(gmlVar, gruVarC, (Action) obj4, arrayList3, fvdVar3 != null ? fvdVar3.a : null);
                                    gka.b(furVar, gka.a(gruVar));
                                    gruVar = furVar;
                                }
                            }
                        }
                    }
                }
                this.a.m(gruVar);
                return afak.a;
            }
        }, 3));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        if (this.i != 0) {
            super.c();
            this.h.f(eps.e);
        } else {
            super.c();
            this.h.f(eps.e);
        }
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        if (this.i != 0) {
            super.d();
            this.h.f(eps.d);
        } else {
            super.d();
            this.h.f(eps.d);
        }
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.a;
    }

    public jta(int i, byte[] bArr) {
        this.i = i;
        eqc eqcVar = new eqc(this, true);
        this.h = eqcVar;
        this.a = eqcVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [eqa, java.lang.Object] */
    public jta(gms gmsVar, jst jstVar, kex kexVar, jtf jtfVar, int i) {
        this(0);
        this.i = i;
        this.a.c(new jsv(jstVar, 0));
        ehq ehqVar = new ehq((Object) jstVar, 4, (int[]) null);
        ?? r7 = gmsVar.a;
        qn qnVar = ((qw) r7).a;
        qnVar.e.x(r7, new jsw(ehqVar));
        r(jstVar.d, new ewg(new hgf((Object) this, (Object) jtfVar, (Object) kexVar, 4, (char[]) null), 5));
    }

    public jta(int i) {
        this.i = i;
        eqc eqcVar = new eqc(this, true);
        this.h = eqcVar;
        this.a = eqcVar;
    }
}
