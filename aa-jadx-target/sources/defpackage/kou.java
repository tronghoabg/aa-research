package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kou extends defpackage.rlw {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.FailureInjection");
    public static final defpackage.rlu b = new defpackage.kop();
    public android.os.Handler e;
    android.os.HandlerThread f;
    public android.os.Handler g;
    android.os.HandlerThread h;
    private final java.util.List j = new java.util.ArrayList();
    public final java.util.Set c = new java.util.HashSet();
    private final java.util.Map k = new java.util.EnumMap(pcb.class);
    private final java.util.Map l = new java.util.EnumMap(pcb.class);
    private final java.util.Map m = new java.util.HashMap();
    private final java.util.Map n = new java.util.HashMap();
    private final java.util.Map o = new java.util.HashMap();
    public final defpackage.ydi d = new defpackage.yge();

    public static synchronized defpackage.zhs a(android.content.Context context, java.util.concurrent.Executor executor) {
        return o(context, executor);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0073 A[PHI: r0
  0x0073: PHI (r0v2 pbr) = (r0v1 pbr), (r0v18 pbr) binds: [B:5:0x0033, B:17:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private final java.lang.Object p(defpackage.pbp pbpVar, rlv rlvVar, j$.util.Optional optional, defpackage.rlu rluVar) throws java.lang.Throwable {
        int i;
        kor korVarB;
        java.util.concurrent.locks.Lock lock;
        pbr pbrVarB;
        ((defpackage.yqj) a.l().ai((char) 3280)).y("substituteCallWithInjection %s", pbpVar.name());
        pbr pbrVar = pbr.a;
        synchronized (this) {
            i = 0;
            j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(this.j).filter(new defpackage.koo(pbpVar, i)).filter(new defpackage.koo(this, 2)).findFirst();
            if (optionalFindFirst.isPresent()) {
                pby pbyVar = (pby) optionalFindFirst.get();
                pbt pbtVar = pbyVar.c == 11 ? (pbt) pbyVar.d : pbt.a;
                if (pbtVar.b == 2 && (pbrVarB = pbr.b(((java.lang.Integer) pbtVar.c).intValue())) != null) {
                    pbrVar = pbrVarB;
                }
                if (((pby) optionalFindFirst.get()).e == 9) {
                    korVarB = kor.b((pby) optionalFindFirst.get());
                } else {
                    korVarB = null;
                }
            } else {
                korVarB = null;
            }
        }
        try {
            java.util.Map map = this.o;
            if (map.containsKey(kor.a(pbpVar))) {
                koq koqVar = (koq) map.get(kor.a(pbpVar));
                koqVar.c.lock();
                while (koqVar.h) {
                    try {
                        try {
                            koqVar.d.await();
                        } catch (java.lang.Throwable th) {
                            koqVar.c.unlock();
                            throw th;
                        }
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        lock = koqVar.c;
                    }
                }
                lock = koqVar.c;
                lock.unlock();
            }
            java.lang.Object objA = rlvVar.a(pbrVar);
            defpackage.ydi ydiVar = this.d;
            if (ydiVar.containsKey(kor.a(pbpVar))) {
                kot kotVar = (kot) ydiVar.get(kor.a(pbpVar));
                kotVar.getClass();
                jgh jghVar = new jgh(kotVar, 7);
                if (true == optional.isPresent()) {
                    ((kot) jghVar.a).e = (android.os.Handler) optional.get();
                }
                if (kotVar.d.get()) {
                    defpackage.aboh abohVar = defpackage.abrv.a;
                    if (kotVar.a() && kotVar.b) {
                        kotVar.f = 0;
                    }
                    if (!kotVar.a()) {
                        java.util.List list = kotVar.a;
                        int i2 = kotVar.f;
                        kotVar.f = i2 + 1;
                        abohVar = (defpackage.aboh) list.get(i2);
                    }
                    if (rluVar != b) {
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3272)).y("Schedule a post-injection action in %s", defpackage.acmh.y(abohVar));
                        android.os.Handler handler = kotVar.e;
                        if (handler == null) {
                            handler = kotVar.c;
                        }
                        handler.postDelayed(new defpackage.kos(kotVar, rluVar, i), defpackage.abrv.a(abohVar));
                        kotVar.e = null;
                    }
                }
            }
            synchronized (this) {
                if (korVarB != null) {
                    if (this.c.contains(korVarB)) {
                        g(korVarB, "call is over");
                    }
                }
            }
            return objA;
        } catch (java.lang.Throwable th2) {
            synchronized (this) {
                if (korVarB != null) {
                    if (this.c.contains(korVarB)) {
                        g(korVarB, "call is over");
                    }
                }
                throw th2;
            }
        }
    }

    private final void q(pby pbyVar) {
        kor korVarB = kor.b(pbyVar);
        if (l(pbyVar)) {
            if (((pbyVar.e == 8 ? (pbv) pbyVar.f : pbv.a).b & 1) != 0) {
                defpackage.aboh abohVar = (pbyVar.e == 8 ? (pbv) pbyVar.f : pbv.a).e;
                if (abohVar == null) {
                    abohVar = defpackage.aboh.a;
                }
                jx$.ExternalSyntheticApiModelOutline3.m(this.e, new defpackage.jdh(this, korVarB, abohVar, 11), korVarB, defpackage.abrv.a(abohVar));
            }
        }
    }

    @Override // defpackage.rlw
    public final java.lang.Object b(defpackage.pbp pbpVar, rlv rlvVar) throws java.lang.Throwable {
        return p(pbpVar, rlvVar, j$.util.Optional.empty(), b);
    }

    @Override // defpackage.rlw
    public final java.lang.Object c(defpackage.pbp pbpVar, rlv rlvVar, android.os.Handler handler, defpackage.rlu rluVar) throws java.lang.Throwable {
        return p(pbpVar, rlvVar, j$.util.Optional.of(handler), rluVar);
    }

    @Override // defpackage.rlw
    public final synchronized void d(pby pbyVar) {
        int i = pbyVar.c;
        int i2 = 3;
        char c = 0;
        if (i == 11) {
            pbt pbtVar = (pbt) pbyVar.d;
            defpackage.pbp pbpVarB = defpackage.pbp.b(pbtVar.d);
            if (pbpVarB == null) {
                pbpVarB = defpackage.pbp.CALL_SITE_UNSET;
            }
            if (pbpVarB == defpackage.pbp.CALL_SITE_UNSET) {
                throw new java.lang.IllegalArgumentException("FailureInjection must have a call_site set.");
            }
            int i3 = pbtVar.b;
            if (i3 == 2) {
                pbr pbrVarB = pbr.b(((java.lang.Integer) pbtVar.c).intValue());
                if (pbrVarB == null) {
                    pbrVarB = pbr.a;
                }
                if (pbrVarB == pbr.a) {
                    throw new java.lang.IllegalArgumentException("Do not set FailureType.NOT_INJECTED.");
                }
                defpackage.yhe yheVar = pbo.a;
                int i4 = defpackage.ygw.d;
                if (!((java.util.List) yheVar.getOrDefault(pbpVarB, defpackage.ymx.a)).contains(pbrVarB)) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("CallSite %s can not be used with failure type %s", pbpVarB.name(), pbrVarB.name()));
                }
            } else if (i3 == 3 && ((pbq) pbtVar.c).b.size() == 0) {
                throw new java.lang.IllegalArgumentException("Must specify at least one delay.");
            }
            pbs pbsVar = (pbyVar.c == 11 ? (pbt) pbyVar.d : pbt.a).e;
            if (pbsVar == null) {
                pbsVar = pbs.a;
            }
            java.util.Iterator<E> it = pbsVar.b.iterator();
            while (it.hasNext()) {
                if (defpackage.abrv.f((defpackage.aboh) it.next())) {
                    throw new java.lang.IllegalArgumentException("Post-injection action delay shouldn't be negative.");
                }
            }
        } else if (i == 12) {
            pcb pcbVarB = pcb.b(((java.lang.Integer) pbyVar.d).intValue());
            if (pcbVarB == null) {
                pcbVarB = pcb.a;
            }
            if (pcbVarB == pcb.a) {
                throw new java.lang.IllegalArgumentException("Must not set StaticInjection.STATIC_INJECTION_UNSET.");
            }
            if (pbyVar.e == 9) {
                throw new java.lang.IllegalArgumentException("CallActivationParameters cannot be used with StaticInjection.");
            }
        }
        int i5 = pbyVar.e;
        if (i5 != 0) {
            switch (i5) {
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    c = '\t';
                    break;
                case 9:
                    c = '\n';
                    break;
                case 10:
                    c = 11;
                    break;
            }
        } else {
            c = 1;
        }
        if (c == 0) {
            throw null;
        }
        if (c == 1) {
            throw new java.lang.IllegalArgumentException("FailureInjection must have activation parameters set.");
        }
        if (((i5 == 8 ? (pbv) pbyVar.f : pbv.a).b & 1) != 0) {
            defpackage.aboh abohVar = (pbyVar.e == 8 ? (pbv) pbyVar.f : pbv.a).e;
            if (abohVar == null) {
                abohVar = defpackage.aboh.a;
            }
            defpackage.abrv.g(abohVar);
            if (defpackage.abrv.f(abohVar) || abohVar.equals(defpackage.abrv.a)) {
                throw new java.lang.IllegalArgumentException("The timeout must be a positive number, if set.");
            }
        }
        if ((pbyVar.b & 1) != 0 && pbyVar.g <= 0) {
            throw new java.lang.IllegalArgumentException("The max activation count must be a positive number, if set.");
        }
        int i6 = pbyVar.e;
        if (i6 == 10) {
            if ((i6 == 10 ? (pbx) pbyVar.f : pbx.a).b.size() == 0) {
                throw new java.lang.IllegalArgumentException("The intervals must have at least one element.");
            }
        }
        kor korVarB = kor.b(pbyVar);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3275)).y("Adding failure injection: %s", pbyVar);
        java.util.List list = this.j;
        if (j$.util.Collection.-EL.stream(list).anyMatch(new defpackage.koo(korVarB, i2))) {
            throw new java.lang.IllegalArgumentException("Injection already exists: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(korVarB))));
        }
        list.add(pbyVar);
        if (this.e == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("failure-injection-manager");
            this.f = handlerThread;
            handlerThread.start();
            this.e = new android.os.Handler(this.f.getLooper());
        }
        if (this.g == null) {
            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("failure-injection-manager-post-injection-action");
            this.h = handlerThread2;
            handlerThread2.start();
            this.g = new android.os.Handler(this.h.getLooper());
        }
        int i7 = pbyVar.e;
        if (i7 == 8) {
            if ((i7 == 8 ? (pbv) pbyVar.f : pbv.a).c.size() == 0) {
                q(pbyVar);
                return;
            }
        }
        if (pbyVar.e == 10) {
            j(pbyVar);
        }
    }

    @Override // defpackage.rlw
    public final synchronized void e(pcb pcbVar, rls rlsVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3276)).y("Adding injection activated callback for injection: %s", pcbVar.name());
        ((java.util.List) j$.util.Map.-EL.computeIfAbsent(this.k, pcbVar, new defpackage.khy(3))).add(rlsVar);
        if (this.c.contains(kor.c(pcbVar))) {
            rlsVar.a();
        }
    }

    @Override // defpackage.rlw
    public final synchronized void f(pcb pcbVar, rlt rltVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3277)).y("Adding injection deactivated callback for injection: %s", pcbVar.name());
        ((java.util.List) j$.util.Map.-EL.computeIfAbsent(this.l, pcbVar, new defpackage.khy(2))).add(rltVar);
    }

    public final void g(kor korVar, java.lang.String str) {
        pcb pcbVarB;
        java.util.Set set = this.c;
        if (set.contains(korVar)) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(3278)).M("Deactivating injection: %s, reason: %s", korVar, str);
            pby pbyVar = (pby) j$.util.Collection.-EL.stream(this.j).filter(new defpackage.koo(korVar, 1)).findFirst().get();
            int i = pbyVar.c;
            if (i == 12) {
                java.util.Map map = this.l;
                if (i != 12 || (pcbVarB = pcb.b(((java.lang.Integer) pbyVar.d).intValue())) == null) {
                    pcbVarB = pcb.a;
                }
                j$.lang.Iterable.-EL.forEach(defpackage.ygw.o((java.util.Collection) j$.util.Map.-EL.getOrDefault(map, pcbVarB, new java.util.ArrayList())), new defpackage.ixc(9));
            }
        }
        java.util.Map map2 = this.o;
        if (map2.containsKey(korVar)) {
            ((koq) map2.get(korVar)).a();
        }
        defpackage.ydi ydiVar = this.d;
        if (ydiVar.containsKey(korVar)) {
            ((kot) ydiVar.get(korVar)).d.set(false);
        }
        this.e.removeCallbacksAndMessages(korVar);
        set.remove(korVar);
    }

    @Override // defpackage.rlw
    public final void h(defpackage.pbp pbpVar) throws java.lang.Throwable {
        b(pbpVar, new shh(1));
    }

    @Override // defpackage.rlw
    public final synchronized void i() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3279)).u("Resetting failure injections");
        java.util.Set set = this.c;
        j$.lang.Iterable.-EL.forEach(defpackage.yhx.n(set), new kcx(this, 2));
        defpackage.ysr.bk(set.isEmpty(), "activeInjections should be cleared by deactivateInjection");
        this.j.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.d.clear();
        android.os.Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f.quit();
            this.e = null;
            this.f = null;
        }
    }

    public final void j(pby pbyVar) {
        java.util.Map map = this.m;
        kor korVarB = kor.b(pbyVar);
        int iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(map, korVarB, 0)).intValue();
        pbw pbwVar = (pbw) (pbyVar.e == 10 ? (pbx) pbyVar.f : pbx.a).b.get(iIntValue % (pbyVar.e == 10 ? (pbx) pbyVar.f : pbx.a).b.size());
        android.os.Handler handler = this.e;
        defpackage.ye yeVar = new defpackage.ye(this, pbyVar, korVarB, pbwVar, 13);
        defpackage.aboh abohVar = pbwVar.b;
        if (abohVar == null) {
            abohVar = defpackage.aboh.a;
        }
        jx$.ExternalSyntheticApiModelOutline3.m(handler, yeVar, korVarB, defpackage.abrv.a(abohVar));
    }

    @Override // defpackage.rlw
    public final synchronized void k(defpackage.yyn yynVar) {
        yynVar.name();
        defpackage.abor aborVarN = pca.a.n();
        aborVarN.t();
        pca pcaVar = aborVarN.b;
        pcaVar.c = java.lang.Integer.valueOf(yynVar.pE);
        pcaVar.b = 2;
        pca pcaVarQ = aborVarN.q();
        for (pby pbyVar : this.j) {
            if (pbyVar.e == 8) {
                java.util.Iterator<E> it = ((pbv) pbyVar.f).c.iterator();
                while (it.hasNext()) {
                    if (((pca) it.next()).equals(pcaVarQ)) {
                        q(pbyVar);
                    }
                }
                for (pca pcaVar2 : (pbyVar.e == 8 ? (pbv) pbyVar.f : pbv.a).d) {
                    if (pcaVar2.equals(pcaVarQ)) {
                        g(kor.b(pbyVar), java.lang.String.format(java.util.Locale.US, "exit stage %s", pcaVar2));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:9:0x006c  */
    public final boolean l(pby pbyVar) {
        defpackage.yqm yqmVar;
        int i;
        int i2;
        pbt pbtVar;
        koq koqVar;
        int i3;
        java.util.List list;
        boolean z;
        pcb pcbVarB;
        java.util.Set set = this.c;
        kor korVarB = kor.b(pbyVar);
        if (set.contains(korVarB)) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3274)).y("Injection already active: %s", korVarB);
            return false;
        }
        int i4 = 4;
        pby pbyVar2 = (pby) j$.util.Collection.-EL.stream(this.j).filter(new defpackage.koo(korVarB, i4)).findAny().orElseThrow(new mam(1));
        java.util.Map map = this.m;
        int iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(map, korVarB, 0)).intValue();
        java.util.Map map2 = this.n;
        int iIntValue2 = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(map2, korVarB, 0)).intValue();
        map.put(korVarB, java.lang.Integer.valueOf(iIntValue + 1));
        if (pbyVar2.h.size() == 0) {
            if ((pbyVar2.b & 1) != 0) {
            }
            map2.put(korVarB, java.lang.Integer.valueOf(iIntValue2 + 1));
            yqmVar = a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3273)).y("Activating injection: %s", korVarB);
            set.add(korVarB);
            i = pbyVar.c;
            i2 = 5;
            if (i == 12) {
                java.util.Map map3 = this.k;
                pcbVarB = pcb.b(((java.lang.Integer) pbyVar.d).intValue());
                if (pcbVarB == null) {
                    pcbVarB = pcb.a;
                }
                j$.lang.Iterable.-EL.forEach(defpackage.ygw.o((java.util.Collection) j$.util.Map.-EL.getOrDefault(map3, pcbVarB, new java.util.ArrayList())), new defpackage.ixc(10));
            } else {
                if (i == 11) {
                    pbtVar = (pbt) pbyVar.d;
                } else {
                    pbtVar = pbt.a;
                }
                if (pbtVar.b == 3) {
                    koqVar = (koq) j$.util.Map.-EL.computeIfAbsent(this.o, korVarB, new defpackage.jxj(this, pbyVar, i4));
                    koqVar.c.lock();
                    i3 = koqVar.g;
                    list = koqVar.a;
                    if (i3 < list.size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    koqVar.h = z;
                    if (z) {
                        jx$.ExternalSyntheticApiModelOutline3.m(koqVar.f, new defpackage.kmp(koqVar, i2), koqVar.e, defpackage.abrv.a((defpackage.aboh) list.get(koqVar.g)));
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3271)).y("Call Site blocking will be activated for %s.", defpackage.acmh.y((defpackage.aboh) list.get(koqVar.g)));
                    }
                    int i5 = koqVar.g + 1;
                    koqVar.g = i5;
                    if (koqVar.b) {
                        koqVar.g = 0;
                    }
                    koqVar.c.unlock();
                }
            }
            ((kot) j$.util.Map.-EL.computeIfAbsent(this.d, korVarB, new defpackage.jxj(this, pbyVar, i2))).d.set(true);
            return true;
        }
        if (!pbyVar2.h.f(iIntValue % pbyVar2.h.size())) {
            aboz abozVar = pbyVar2.h;
        } else if ((pbyVar2.b & 1) != 0 || iIntValue2 < pbyVar2.g) {
            map2.put(korVarB, java.lang.Integer.valueOf(iIntValue2 + 1));
            yqmVar = a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3273)).y("Activating injection: %s", korVarB);
            set.add(korVarB);
            i = pbyVar.c;
            i2 = 5;
            if (i == 12) {
                java.util.Map map4 = this.k;
                pcbVarB = pcb.b(((java.lang.Integer) pbyVar.d).intValue());
                if (pcbVarB == null) {
                    pcbVarB = pcb.a;
                }
                j$.lang.Iterable.-EL.forEach(defpackage.ygw.o((java.util.Collection) j$.util.Map.-EL.getOrDefault(map4, pcbVarB, new java.util.ArrayList())), new defpackage.ixc(10));
            } else {
                if (i == 11) {
                    pbtVar = (pbt) pbyVar.d;
                } else {
                    pbtVar = pbt.a;
                }
                if (pbtVar.b == 3) {
                    koqVar = (koq) j$.util.Map.-EL.computeIfAbsent(this.o, korVarB, new defpackage.jxj(this, pbyVar, i4));
                    koqVar.c.lock();
                    try {
                        i3 = koqVar.g;
                        list = koqVar.a;
                        if (i3 < list.size()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        koqVar.h = z;
                        if (z && !defpackage.abrv.f((defpackage.aboh) list.get(koqVar.g))) {
                            jx$.ExternalSyntheticApiModelOutline3.m(koqVar.f, new defpackage.kmp(koqVar, i2), koqVar.e, defpackage.abrv.a((defpackage.aboh) list.get(koqVar.g)));
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3271)).y("Call Site blocking will be activated for %s.", defpackage.acmh.y((defpackage.aboh) list.get(koqVar.g)));
                        }
                        int i6 = koqVar.g + 1;
                        koqVar.g = i6;
                        if (koqVar.b && i6 >= list.size()) {
                            koqVar.g = 0;
                        }
                        koqVar.c.unlock();
                    } catch (java.lang.Throwable th) {
                        koqVar.c.unlock();
                        throw th;
                    }
                }
            }
            ((kot) j$.util.Map.-EL.computeIfAbsent(this.d, korVarB, new defpackage.jxj(this, pbyVar, i2))).d.set(true);
            return true;
        }
        return false;
    }
}
