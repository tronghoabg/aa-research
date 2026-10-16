package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class puu implements pus {
    private static final ygr a = ygr.t(uzn.SERVICE_AUTHORITY, uzn.REQUIREMENTS_SATISFIER, uzn.BOOT_COUNT, uzn.ACCEPT_LANGUAGE, uzn.CLIENT_TIME_FORMAT, uzn.ELAPSED_TIME, uzn.PRODUCT_CUI, uzn.EXPERIMENT_CONTEXT, uzn.DROIDGUARD, uzn.AUTH_REQUIRED_VERIFICATION);
    private final aezk b;
    private final aezk c;

    public puu(aezk aezkVar, aezk aezkVar2) {
        this.b = aezkVar;
        this.c = aezkVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pus
    public final adix a(adix adixVar) {
        yfq yfqVarG;
        int i;
        boolean z = ((pos) this.c).a().s;
        Collection collection = (Collection) ((acks) this.b).b;
        ygr ygrVar = a;
        ygrVar.getClass();
        final pcx pcxVar = new pcx(ygrVar, 8);
        if (z) {
            yfs yfsVar = (yfs) new yum(Collection.EL.stream(collection).filter(new Predicate() { // from class: uzq
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo56negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return pcxVar.test(((uzp) obj).a());
                }
            }).sorted(Comparator.CC.comparingInt(new mim(12))), Function$CC.identity(), Function$CC.identity()).h(new uzr(0)).j(new yuc());
            ygr ygrVarX = yfsVar.x();
            Random random = ziw.a;
            ArrayList<ziv> arrayList = new ArrayList(ygrVarX);
            Collections.shuffle(arrayList, ziw.a);
            aat aatVar = new aat(0);
            ArrayDeque arrayDeque = new ArrayDeque(arrayList);
            HashSet hashSet = new HashSet(arrayList);
            while (!arrayDeque.isEmpty()) {
                ziv zivVar = (ziv) arrayDeque.remove();
                yfq yfqVar = zivVar.a;
                int i2 = ((yls) yfqVar).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ziv zivVar2 = (ziv) yfqVar.get(i3);
                    ziw.b(aatVar, zivVar, zivVar2);
                    if (hashSet.add(zivVar2)) {
                        arrayDeque.add(zivVar2);
                    }
                }
                yfq yfqVar2 = zivVar.b;
                int i4 = ((yls) yfqVar2).c;
                for (int i5 = 0; i5 < i4; i5++) {
                    ziv zivVar3 = (ziv) yfqVar2.get(i5);
                    ziw.b(aatVar, zivVar3, zivVar);
                    if (hashSet.add(zivVar3)) {
                        arrayDeque.add(zivVar3);
                    }
                }
            }
            ygr ygrVarN = ygr.n(arrayList);
            try {
                ArrayList<zem> arrayList2 = new ArrayList(arrayList.size());
                HashMap map = new HashMap(arrayList.size());
                int i6 = 0;
                for (Object obj : arrayList) {
                    zem zemVar = new zem(obj, i6);
                    arrayList2.add(zemVar);
                    List arrayList3 = (List) map.get(obj);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(obj, arrayList3);
                    }
                    arrayList3.add(zemVar);
                    i6++;
                }
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    zem zemVar2 = (zem) arrayList2.get(i7);
                    Iterator<E> it = ziw.a(ygrVarN, aatVar, (ziv) zemVar2.a).iterator();
                    while (true) {
                        i = i7 + 1;
                        if (it.hasNext()) {
                            List list = (List) map.get(it.next());
                            if (list != null) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    ((zem) it2.next()).c.add(zemVar2);
                                    zemVar2.d++;
                                }
                            } else {
                                zemVar2.d++;
                            }
                        }
                    }
                    i7 = i;
                }
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                PriorityQueue priorityQueue = new PriorityQueue();
                for (zem zemVar3 : arrayList2) {
                    if (zemVar3.d == 0) {
                        priorityQueue.add(zemVar3);
                    }
                }
                while (!priorityQueue.isEmpty()) {
                    zem zemVar4 = (zem) priorityQueue.poll();
                    arrayList4.add(zemVar4);
                    for (zem zemVar5 : zemVar4.c) {
                        int i8 = zemVar5.d - 1;
                        zemVar5.d = i8;
                        if (i8 == 0) {
                            priorityQueue.add(zemVar5);
                        }
                    }
                }
                if (arrayList4.size() != arrayList.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (zem zemVar6 : arrayList2) {
                        if (zemVar6.d > 0) {
                            arrayList5.add(zemVar6.a);
                        }
                    }
                    throw new zel(arrayList5);
                }
                arrayList.clear();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((zem) it3.next()).a);
                }
                int i9 = yfq.d;
                yfl yflVar = new yfl(4);
                for (ziv zivVar4 : arrayList) {
                    yfl yflVar2 = new yfl(4);
                    yfq yfqVarC = yfsVar.c(zivVar4);
                    int size2 = yfqVarC.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size2; i11++) {
                        uzp uzpVar = (uzp) yfqVarC.get(i11);
                        if (uzpVar.c() != null) {
                            aezk aezkVarC = uzpVar.c();
                            aezkVarC.getClass();
                            yflVar2.i(aezkVarC);
                            i10++;
                        } else {
                            if (i10 > 0) {
                                yflVar.i(vja.r(yflVar2.g()));
                                yflVar2 = new yfl(4);
                                i10 = 0;
                            }
                            yflVar.i(uzpVar.b());
                        }
                    }
                    if (i10 > 0) {
                        yflVar.i(vja.r(yflVar2.g()));
                    }
                }
                yfqVarG = yflVar.g();
            } catch (zel e) {
                throw new IllegalStateException("Cycle: ".concat(String.valueOf(String.valueOf(DesugarCollections.unmodifiableList(e.a)))), e);
            }
        } else {
            Stream map2 = Collection.EL.stream(collection).filter(new Predicate() { // from class: uzs
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo56negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return pcxVar.test(((uzp) obj2).a());
                }
            }).sorted(Comparator.CC.comparingInt(new mim(13))).map(new uzr(2));
            int i12 = yfq.d;
            yfqVarG = (yfq) map2.collect(ycm.a);
        }
        ArrayList arrayList6 = new ArrayList(yfqVarG);
        Collections.reverse(arrayList6);
        return adqq.E(adixVar, arrayList6);
    }
}
