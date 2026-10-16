package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ina extends defpackage.rce {
    public volatile boolean a;
    final /* synthetic */ defpackage.inh b;
    private final java.lang.Integer[] c;
    private final j$.util.concurrent.ConcurrentLinkedQueue d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ina(defpackage.inh inhVar, android.os.Looper looper) {
        super(null, looper);
        this.b = inhVar;
        this.c = new java.lang.Integer[]{0, 1, 2};
        this.a = false;
        this.d = new j$.util.concurrent.ConcurrentLinkedQueue();
    }

    private final void i(int i, defpackage.jhl jhlVar) {
        this.d.add(new defpackage.dzp(this.c[i], new defpackage.imz(jhlVar)));
        sendMessageAtFrontOfQueue(obtainMessage(5));
    }

    public final synchronized void a() {
        if (this.a) {
            return;
        }
        sendMessage(obtainMessage(8));
    }

    public final synchronized void b(defpackage.xpq xpqVar) {
        ((defpackage.yqj) defpackage.inh.a.l().ai((char) 454)).u("onUpdateUiConfigRequest");
        boolean z = this.a;
        defpackage.inh inhVar = this.b;
        if (z) {
            inhVar.ai.e(xpqVar);
        } else {
            sendMessage(obtainMessage(6, new defpackage.dzp(xpqVar, inhVar.w)));
        }
    }

    public final synchronized void c(com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.jjd jjdVar) {
        if (this.a) {
            return;
        }
        sendMessage(obtainMessage(4, new defpackage.dzp(carRegionId, jjdVar)));
    }

    public final synchronized void d(int i, android.window.InputTransferToken inputTransferToken, int i2) {
        if (this.a) {
            return;
        }
        sendMessage(obtainMessage(9, new defpackage.ine(i, inputTransferToken, i2)));
    }

    public final synchronized void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        sendMessage(obtainMessage(3));
    }

    public final synchronized void f(defpackage.jhl jhlVar) {
        if (this.a) {
            return;
        }
        i(1, jhlVar);
    }

    public final synchronized void g(defpackage.jhl jhlVar) {
        if (!this.a) {
            i(0, jhlVar);
        } else if (defpackage.acwv.a.fF().r()) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.h()).ai((char) 455)).y("requestWindowInit called when composition thread stopped for %s", jhlVar);
            jhlVar.W();
        }
    }

    public final synchronized void h(defpackage.jhl jhlVar, int i) {
        if (this.a) {
            return;
        }
        defpackage.imz imzVar = new defpackage.imz(jhlVar);
        imzVar.a = i;
        this.d.add(new defpackage.dzp(this.c[2], imzVar));
        sendMessageAtFrontOfQueue(obtainMessage(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = 0;
        defpackage.jjf jjfVar = null;
        switch (message.what) {
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
                for (defpackage.dzp dzpVar = (defpackage.dzp) concurrentLinkedQueue.poll(); dzpVar != null; dzpVar = (defpackage.dzp) concurrentLinkedQueue.poll()) {
                    if (((java.lang.Integer) dzpVar.a).intValue() == 0) {
                        arrayList.add(((defpackage.imz) dzpVar.b).b);
                    }
                }
                this.b.v(arrayList);
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                if (!this.a) {
                    try {
                        defpackage.dzp dzpVar2 = (defpackage.dzp) message.obj;
                        defpackage.inh inhVar = this.b;
                        inhVar.aq.b((com.google.android.gms.car.display.CarRegionId) dzpVar2.a, (defpackage.jjd) dzpVar2.b, inhVar.u, inhVar.c(), inhVar.b(), inhVar.S, inhVar.w);
                    } catch (defpackage.jjf e) {
                        jjfVar = e;
                    }
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (!this.a) {
                    defpackage.dzp dzpVar3 = (defpackage.dzp) this.d.poll();
                    while (dzpVar3 != null) {
                        int iIntValue = ((java.lang.Integer) dzpVar3.a).intValue();
                        if (iIntValue == 0) {
                            try {
                                defpackage.inh inhVar2 = this.b;
                                ?? r0 = ((defpackage.imz) dzpVar3.b).b;
                                int iH = r0.h();
                                boolean z = inhVar2.an;
                                if (z && r0.az(2)) {
                                    java.util.Queue queue = inhVar2.T;
                                    if (queue.contains(r0)) {
                                        ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(506)).K("window init window already in system window list %s for layoutZ %d", r0, iH);
                                    } else {
                                        queue.add(r0);
                                        if (r0.equals(queue.peek())) {
                                            for (defpackage.jhl jhlVar : inhVar2.U) {
                                                if (jhlVar.y() != null) {
                                                    int iH2 = jhlVar.h() + iH;
                                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(505)).M("Moving %s above %s", jhlVar, r0);
                                                    inhVar2.ao(jhlVar, iH2, 1);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z && r0.az(1)) {
                                    inhVar2.U.add(r0);
                                    defpackage.jhl jhlVar2 = (defpackage.jhl) inhVar2.T.peek();
                                    if (jhlVar2 != null) {
                                        iH += jhlVar2.h();
                                        ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(504)).M("Moving %s above %s", r0, jhlVar2);
                                        inhVar2.ao(r0, iH, 1);
                                    }
                                }
                                android.util.SparseArray sparseArray = inhVar2.S;
                                java.util.List list = (java.util.List) sparseArray.get(iH);
                                java.util.List list2 = list;
                                if (list == null) {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
                                    sparseArray.put(iH, arrayList2);
                                    list2 = arrayList2;
                                }
                                if (list2.contains(r0)) {
                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(503)).K("window init window already in list %s for layoutZ %d", r0, iH);
                                } else {
                                    list2.add(r0);
                                }
                                if (iH % 3 == 0) {
                                    inhVar2.S(r0, iH - 1);
                                    inhVar2.S(r0, iH + 1);
                                }
                                r0.aT(inhVar2.ap);
                                ((defpackage.yqj) defpackage.inh.a.l().ai(501)).R("doWindowInit active windows %d in layoutZ %d added %s", java.lang.Integer.valueOf(list2.size()), java.lang.Integer.valueOf(iH), r0);
                            } catch (defpackage.jjf e2) {
                                jjfVar = e2;
                            }
                        } else if (iIntValue == 1) {
                            defpackage.inh inhVar3 = this.b;
                            ?? r1 = ((defpackage.imz) dzpVar3.b).b;
                            if (r1 != 0) {
                                int iH3 = r1.h();
                                if (r1.h() % 3 != 0) {
                                    int i2 = r1.i();
                                    java.util.List list3 = (java.util.List) inhVar3.S.get(i2);
                                    if (list3 != 0 && list3.remove((java.lang.Object) r1)) {
                                        ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(572)).R("Removed window from stable z: %d. Window removed: %s. Remaining windows: %d", java.lang.Integer.valueOf(i2), r1, java.lang.Integer.valueOf(list3.size()));
                                        inhVar3.y();
                                    }
                                }
                                boolean z2 = inhVar3.an;
                                if (z2 && r1.az(2)) {
                                    java.util.Queue queue2 = inhVar3.T;
                                    defpackage.jhl jhlVar3 = (defpackage.jhl) queue2.peek();
                                    if (jhlVar3 != 0 && jhlVar3.equals(r1)) {
                                        queue2.remove(r1);
                                        defpackage.jhl jhlVar4 = (defpackage.jhl) queue2.peek();
                                        if (jhlVar4 == null) {
                                            java.util.Iterator it = inhVar3.U.iterator();
                                            while (it.hasNext()) {
                                                inhVar3.ao((defpackage.jhl) it.next(), 0, 2);
                                            }
                                        } else {
                                            for (defpackage.jhl jhlVar5 : inhVar3.U) {
                                                inhVar3.ao(jhlVar5, jhlVar4.h() + jhlVar5.h(), 1);
                                            }
                                        }
                                    }
                                }
                                if (z2 && r1.az(1)) {
                                    inhVar3.ao(r1, 0, 2);
                                    inhVar3.U.remove((java.lang.Object) r1);
                                }
                                inhVar3.Y.e(r1);
                                r1.H();
                                r1.aX(0L);
                                android.util.SparseArray sparseArray2 = inhVar3.S;
                                java.util.List list4 = (java.util.List) sparseArray2.get(iH3);
                                if (list4 == 0 || !list4.contains(r1)) {
                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(498)).D("window cleanup window not in list for layoutZ %d win %s", iH3, r1);
                                    inhVar3.y();
                                } else {
                                    list4.remove((java.lang.Object) r1);
                                    if (list4.isEmpty()) {
                                        sparseArray2.remove(iH3);
                                    }
                                    ((defpackage.yqj) defpackage.inh.a.l().ai(499)).K("doWindowCleanup removed %s remaining wins in list %d", r1, list4.size());
                                    inhVar3.y();
                                }
                            }
                        } else if (iIntValue == 2) {
                            defpackage.inh inhVar4 = this.b;
                            defpackage.imz imzVar = (defpackage.imz) dzpVar3.b;
                            inhVar4.ao(imzVar.b, imzVar.a, 3);
                        }
                        dzpVar3 = (defpackage.dzp) this.d.poll();
                    }
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.dzp dzpVar4 = (defpackage.dzp) message.obj;
                defpackage.inh inhVar5 = this.b;
                defpackage.xpq xpqVar = (defpackage.xpq) dzpVar4.a;
                xpqVar.getClass();
                defpackage.jhi jhiVar = (defpackage.jhi) dzpVar4.b;
                jhiVar.getClass();
                ((defpackage.yqj) defpackage.inh.a.l().ai((char) 496)).u("doUpdateUiConfigRequest");
                inhVar5.aq.e(jhiVar);
                inhVar5.ai.e(xpqVar);
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.inh inhVar6 = this.b;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(495)).B("Updating background colors to %08X and %08X", message.arg1, message.arg2);
                new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.bgf(inhVar6, 13));
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if (!this.a) {
                    this.b.y();
                }
                break;
            case 9:
                if (!this.a) {
                    defpackage.ine ineVar = (defpackage.ine) message.obj;
                    defpackage.inh inhVar7 = this.b;
                    while (true) {
                        android.util.SparseArray sparseArray3 = inhVar7.S;
                        if (i >= sparseArray3.size()) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.h()).ai(453)).w("Window %d not found in windowsByLayoutZ for host token delivery", ineVar.a);
                            break;
                        } else {
                            java.util.Iterator it2 = ((java.util.List) sparseArray3.valueAt(i)).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    defpackage.jhl jhlVar6 = (defpackage.jhl) it2.next();
                                    int iL = jhlVar6.l();
                                    int i3 = ineVar.a;
                                    if (iL == i3) {
                                        ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai((char) 491)).w("Found window %d for host token delivery", i3);
                                        ((defpackage.jhr) jhlVar6).U(ineVar.b, ineVar.c);
                                        break;
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                throw new java.lang.RuntimeException(defpackage.a.cb(message, "unknown msg "));
        }
        if (jjfVar != null) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.h()).p(jjfVar)).ai(452)).w("ProjectionCompositionException in CompositionThread command %s", message.what);
        }
    }

    @Override // android.os.Handler
    public final java.lang.String toString() {
        j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        return "CompositionHandler{stopped=" + this.a + ", windowInitCleanupRequests=" + java.lang.String.valueOf(concurrentLinkedQueue) + "}";
    }
}
