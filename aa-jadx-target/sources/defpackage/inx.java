package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class inx implements java.lang.Runnable {
    defpackage.iof b;
    int c;
    public com.google.android.gms.car.display.CarRegionId d;
    public final /* synthetic */ defpackage.iny g;
    private final boolean h;
    final java.util.concurrent.atomic.AtomicIntegerArray a = new java.util.concurrent.atomic.AtomicIntegerArray(10);
    volatile int e = 0;
    volatile java.lang.String f = "";

    public inx(defpackage.iny inyVar, defpackage.iof iofVar, int i, com.google.android.gms.car.display.CarRegionId carRegionId, boolean z) {
        this.g = inyVar;
        this.b = iofVar;
        this.c = i;
        this.d = carRegionId;
        this.h = z;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02da  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:115:0x031f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0328  */
    /* JADX WARN: Code duplicated, block: B:118:0x032e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0371  */
    /* JADX WARN: Code duplicated, block: B:132:0x0394  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:156:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x029f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        defpackage.inn innVar;
        android.util.Pair pairCreate;
        defpackage.ioa ioaVar;
        defpackage.inn innVarE;
        defpackage.inn innVar2;
        defpackage.inn innVar3;
        android.content.Intent intent;
        int i;
        int intExtra;
        int i2;
        defpackage.ioh iohVar;
        boolean z;
        defpackage.jik jikVarA;
        defpackage.ill.d();
        for (int i3 = 0; i3 < 10; i3++) {
            this.a.set(i3, 0);
        }
        defpackage.yqm yqmVar = defpackage.ioh.b;
        ((defpackage.yqj) yqmVar.l().ai(630)).M("Connect to %s for %s", defpackage.inn.e(this.b.a), this.d);
        defpackage.iny inyVar = this.g;
        java.lang.Object obj = inyVar.f;
        synchronized (obj) {
            try {
                try {
                    boolean z2 = this.h;
                    if (!z2) {
                        com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) inyVar.b.peek();
                        if (carRegionId != null) {
                            java.util.Map map = inyVar.a;
                            if (map.get(carRegionId) == this) {
                                map.remove(this.d);
                                inyVar.b.remove();
                            }
                        }
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(631)).M("Region already processed: %s %s ", carRegionId, this.d);
                        inyVar.c();
                        return;
                    }
                    java.util.Queue queue = inyVar.c;
                    android.content.ComponentName componentName = (android.content.ComponentName) queue.peek();
                    if (componentName != null) {
                        java.util.Map map2 = inyVar.d;
                        if (map2.get(componentName) == this) {
                            map2.remove(componentName);
                            queue.remove();
                        }
                    }
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(645)).M("Region already processed: %s %s ", inyVar.l, this.d);
                    inyVar.c();
                    return;
                    defpackage.ioh iohVar2 = inyVar.m;
                    if (!iohVar2.o) {
                        inyVar.c();
                        return;
                    }
                    if (!inyVar.g) {
                        boolean z3 = inyVar.h;
                        ((defpackage.yqj) yqmVar.l().ai((char) 643)).u("Trying to run a ClientConnectionRunnable after the ClientConnectionThread was stopped, finishing the client connection");
                        inyVar.c();
                        return;
                    }
                    if (iohVar2.ap(this.d)) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(642)).M("Start canceled for %s on %s", this.b.a, this.d);
                        inyVar.c();
                        return;
                    }
                    defpackage.jkr jkrVarJ = iohVar2.j(this.d.h);
                    defpackage.inh inhVar = (defpackage.inh) jkrVarJ;
                    if (!inhVar.C) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(641)).y("Window manager not compositing, add pending client startInfo: %s", this.b);
                        defpackage.iof iofVar = this.b;
                        if (z2) {
                            iohVar2.o(iofVar);
                        } else {
                            iohVar2.n(iofVar);
                        }
                        inyVar.c();
                        return;
                    }
                    defpackage.iof iofVar2 = this.b;
                    defpackage.ioi ioiVarA = iofVar2.f;
                    if (ioiVarA == null) {
                        defpackage.zd zdVar = iohVar2.n;
                        ioiVarA = (defpackage.ioi) zdVar.get(iofVar2.a);
                        if (ioiVarA == null) {
                            defpackage.iof iofVar3 = this.b;
                            ioiVarA = iofVar3.e.a(iohVar2, iofVar3.a);
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 640)).y("New task %s", ioiVarA);
                            zdVar.put(this.b.a, ioiVarA);
                        } else {
                            ((defpackage.yqj) yqmVar.l().ai(639)).M("Found root match %s for component: %s", ioiVarA, this.b.a);
                            if ((this.b.c.getFlags() & 1048576) == 0) {
                                this.b.c.addFlags(67108864);
                            }
                        }
                    } else {
                        defpackage.zd zdVar2 = iohVar2.n;
                        android.content.ComponentName componentName2 = ioiVarA.d;
                        defpackage.ioi ioiVar = (defpackage.ioi) zdVar2.get(componentName2);
                        if (ioiVar != ioiVarA) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(637)).S("Task finished before activity could start, target task root component:%s, target task: %s, root component task: %s, # tasks: %d, finishing client connection.", componentName2, ioiVarA, ioiVar, java.lang.Integer.valueOf(zdVar2.d));
                            for (android.content.ComponentName componentName3 : zdVar2.keySet()) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(638)).M("Task root: %s, task: %s", componentName3, zdVar2.get(componentName3));
                            }
                            inyVar.c();
                            return;
                        }
                        ((defpackage.yqj) yqmVar.l().ai((char) 632)).y("Found root match for task: %s", ioiVarA);
                    }
                    defpackage.iof iofVar4 = this.b;
                    int i4 = this.c;
                    android.content.Context context = iohVar2.d;
                    defpackage.jip jipVar = inhVar.Y;
                    defpackage.yqm yqmVar2 = defpackage.ioi.a;
                    defpackage.yqj yqjVar = (defpackage.yqj) yqmVar2.l().ai(808);
                    android.content.Intent intent2 = iofVar4.c;
                    yqjVar.M("Resolving %s in %s", intent2, ioiVarA);
                    if (ioiVarA.c() != null) {
                        ioiVarA.c().H();
                    }
                    boolean z4 = (intent2.getFlags() & 1048576) != 0;
                    defpackage.ioh iohVar3 = ioiVarA.c;
                    defpackage.inn innVarA = ioiVarA.a(iofVar4, iohVar3, i4, z4);
                    java.util.List list = ioiVarA.e;
                    if (!list.remove(innVarA)) {
                        intent2.setFlags(intent2.getFlags() & (-1048577));
                        z4 = false;
                    }
                    list.add(innVarA);
                    android.os.Bundle bundle = iofVar4.d;
                    if (bundle != null) {
                        defpackage.qrh qrhVar = new defpackage.qrh(bundle);
                        java.lang.String str = qrhVar.a;
                        if (str == null) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 810)).u("Package name cannot be null.");
                            pairCreate = android.util.Pair.create(null, null);
                            z2 = z2;
                            innVar = null;
                        } else {
                            android.content.Context contextAQ = defpackage.tna.aQ(context, str);
                            int i5 = qrhVar.c;
                            int i6 = qrhVar.d;
                            if ((i5 == 0) != (i6 == 0)) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 809)).u("enterAnimation and exitAnimation need to both be null or both be non-null.");
                                innVar = null;
                                pairCreate = android.util.Pair.create(null, null);
                            } else {
                                innVar = null;
                                if (i5 != 0) {
                                    pairCreate = android.util.Pair.create(jipVar.a(contextAQ, i5), jipVar.a(contextAQ, i6));
                                }
                            }
                        }
                        ioaVar = new defpackage.ioa(iofVar4, innVarA, z4, iohVar3.i((defpackage.jik) pairCreate.first, (defpackage.jik) pairCreate.second, iofVar4.i));
                        innVarE = iohVar2.e(this.d);
                        innVar2 = ioaVar.b;
                        if (innVarE == null && innVarE != innVar2 && innVarE.H()) {
                            innVar3 = innVarE;
                        } else {
                            innVar3 = innVar;
                        }
                        if (innVar2 == null) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 636)).y("Could not find client to start for %s, finishing client connection.", this.b.a.toShortString());
                            inyVar.c();
                            return;
                        }
                        if (z2) {
                            innVar2.n();
                            if (iohVar2.al(innVar2)) {
                                defpackage.ioh.R(innVar2);
                                innVar2.C = true;
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 635)).y("Pre-warming an already started activity %s", innVar2);
                            }
                            inyVar.c();
                            return;
                        }
                        innVar2.C = defpackage.ioh.am(this.b.c);
                        innVar2.n();
                        intent = this.b.c;
                        innVar2.t = intent;
                        if (innVar2.d() != null) {
                            int intExtra2 = intent.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0);
                            ((defpackage.yqj) defpackage.inn.a.l().ai(624)).K("setCurrentStartIntent updating focus flags c=%s newFlags=%d", innVar2.i, intExtra2);
                            innVar2.d().ak(intExtra2);
                        }
                        iohVar2.s(innVar2);
                        if (iohVar2.al(innVar2)) {
                            this.a.set(0, 1);
                            i = 1;
                        } else {
                            if (innVar2.H()) {
                                this.f = innVar2.f();
                                this.e = innVar2.a();
                                ((defpackage.yqj) yqmVar.l().ai((char) 634)).y("Client is already started, sending new intent %s and finishing client connection.", innVar2.d.getShortClassName());
                                this.a.set(0, 4);
                                innVar2.o(ioaVar);
                                defpackage.iof iofVar5 = innVar2.s;
                                iofVar5.getClass();
                                intExtra = iofVar5.c.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0);
                                if ((intExtra & 1) == 0 && (intExtra & 512) == 0) {
                                    jkrVarJ.Z(innVar2.d());
                                }
                                inyVar.c();
                                return;
                            }
                            i = 0;
                        }
                        this.f = innVar2.f();
                        this.e = innVar2.a();
                        synchronized (obj) {
                            inyVar.k = innVar2;
                        }
                        i2 = 2;
                        this.a.set(i, 2);
                        defpackage.iny inyVar2 = this.g;
                        com.google.android.gms.car.display.CarRegionId carRegionId2 = this.d;
                        iohVar = inyVar2.m;
                        iohVar.ar(carRegionId2, innVar2);
                        if (innVar3 != null) {
                            iohVar.Z(innVar3);
                            innVar3.s(innVar2);
                            iohVar.p(this.d, new ioc(new defpackage.inq(innVar3, innVar2, i2), innVar2.d));
                        } else {
                            iohVar.Q(this.d);
                        }
                        z = true;
                        if (innVar2.b() == 1) {
                            jikVarA = innVar2.w;
                            if (jikVarA == null) {
                                jikVarA = innVar2.d().A();
                            }
                            jkrVarJ.W(innVar2.z, innVar2.d(), jikVarA, innVar2.x);
                            z = true;
                        }
                        innVar2.o = z;
                        iohVar.X(ioaVar.a.a, this.d);
                        iohVar.J(this.d, new defpackage.inw(this, innVar3, innVar2, ioaVar, 0));
                    }
                    z2 = z2;
                    innVar = null;
                    pairCreate = android.util.Pair.create(innVar, innVar);
                    ioaVar = new defpackage.ioa(iofVar4, innVarA, z4, iohVar3.i((defpackage.jik) pairCreate.first, (defpackage.jik) pairCreate.second, iofVar4.i));
                    innVarE = iohVar2.e(this.d);
                    innVar2 = ioaVar.b;
                    if (innVarE == null) {
                        innVar3 = innVar;
                    } else {
                        innVar3 = innVar;
                    }
                    if (innVar2 == null) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 636)).y("Could not find client to start for %s, finishing client connection.", this.b.a.toShortString());
                        inyVar.c();
                        return;
                    }
                    if (z2) {
                        innVar2.n();
                        if (iohVar2.al(innVar2)) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 635)).y("Pre-warming an already started activity %s", innVar2);
                        } else {
                            defpackage.ioh.R(innVar2);
                            innVar2.C = true;
                        }
                        inyVar.c();
                        return;
                    }
                    innVar2.C = defpackage.ioh.am(this.b.c);
                    innVar2.n();
                    intent = this.b.c;
                    innVar2.t = intent;
                    if (innVar2.d() != null) {
                        int intExtra3 = intent.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0);
                        ((defpackage.yqj) defpackage.inn.a.l().ai(624)).K("setCurrentStartIntent updating focus flags c=%s newFlags=%d", innVar2.i, intExtra3);
                        innVar2.d().ak(intExtra3);
                    }
                    iohVar2.s(innVar2);
                    if (iohVar2.al(innVar2)) {
                        this.a.set(0, 1);
                        i = 1;
                    } else {
                        if (innVar2.H()) {
                            this.f = innVar2.f();
                            this.e = innVar2.a();
                            ((defpackage.yqj) yqmVar.l().ai((char) 634)).y("Client is already started, sending new intent %s and finishing client connection.", innVar2.d.getShortClassName());
                            this.a.set(0, 4);
                            innVar2.o(ioaVar);
                            defpackage.iof iofVar6 = innVar2.s;
                            iofVar6.getClass();
                            intExtra = iofVar6.c.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0);
                            if ((intExtra & 1) == 0) {
                                jkrVarJ.Z(innVar2.d());
                            }
                            inyVar.c();
                            return;
                        }
                        i = 0;
                    }
                    this.f = innVar2.f();
                    this.e = innVar2.a();
                    synchronized (obj) {
                        inyVar.k = innVar2;
                        i2 = 2;
                        this.a.set(i, 2);
                        defpackage.iny inyVar3 = this.g;
                        com.google.android.gms.car.display.CarRegionId carRegionId3 = this.d;
                        iohVar = inyVar3.m;
                        iohVar.ar(carRegionId3, innVar2);
                        if (innVar3 != null) {
                            iohVar.Z(innVar3);
                            innVar3.s(innVar2);
                            iohVar.p(this.d, new ioc(new defpackage.inq(innVar3, innVar2, i2), innVar2.d));
                        } else {
                            iohVar.Q(this.d);
                        }
                        z = true;
                        if (innVar2.b() == 1) {
                            jikVarA = innVar2.w;
                            if (jikVarA == null) {
                                jikVarA = innVar2.d().A();
                            }
                            jkrVarJ.W(innVar2.z, innVar2.d(), jikVarA, innVar2.x);
                            z = true;
                        }
                        innVar2.o = z;
                        iohVar.X(ioaVar.a.a, this.d);
                        iohVar.J(this.d, new defpackage.inw(this, innVar3, innVar2, ioaVar, 0));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
    }
}
