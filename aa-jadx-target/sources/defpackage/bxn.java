package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bxn implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bxn(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x036f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x0371 A[LOOP:3: B:133:0x033a->B:144:0x0371, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.view.View$OnAttachStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [eqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [epy] */
    /* JADX WARN: Type inference failed for: r14v3, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v49, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v51, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v62, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v64, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [czl] */
    /* JADX WARN: Type inference failed for: r1v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        android.companion.virtual.VirtualDeviceParams virtualDeviceParamsBuild;
        int i = 3;
        byte[] bArr = null;
        boolean z = false;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ajba ajbaVar = defpackage.bxt.k;
                defpackage.aaw aawVar = (defpackage.aaw) this.b;
                java.lang.Object[] objArr = aawVar.b;
                long[] jArr = aawVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = (~(i2 - length)) >>> 31;
                            int i4 = 0;
                            while (true) {
                                int i5 = 8 - i3;
                                if (i4 < i5) {
                                    if ((255 & j) < 128) {
                                        ((defpackage.bvk) this.a).t(objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                    i4++;
                                } else if (i5 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                return defpackage.afbk.a;
            case 1:
                if (((defpackage.ccu) ((defpackage.ngb) this.b).c).get() == 0) {
                    this.a.invoke();
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.chf) this.b).a.invoke(this.a);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.cyg cygVar = ((defpackage.cxl) this.b).v;
                if ((cygVar.a() & 8) != 0) {
                    for (defpackage.cge cgeVar = cygVar.e; cgeVar != null; cgeVar = cgeVar.t) {
                        if ((cgeVar.r & 8) != 0) {
                            ?? O = cgeVar;
                            ?? bzcVar = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.czc) {
                                    java.lang.Object obj = this.a;
                                    defpackage.czc czcVar = (defpackage.czc) O;
                                    czcVar.D();
                                    if (czcVar.y()) {
                                        ((defpackage.ddz) ((defpackage.afgv) obj).a).a = true;
                                    }
                                    czcVar.g((defpackage.dek) ((defpackage.afgv) obj).a);
                                } else if ((O.r & 8) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                                    int i6 = 0;
                                    while (cgeVar2 != null) {
                                        if ((cgeVar2.r & 8) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                O = O;
                                                bzcVar = bzcVar;
                                                bzcVar = bzcVar;
                                                O = cgeVar2;
                                            } else {
                                                if (bzcVar == 0) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O != 0) {
                                                    bzcVar.n(O);
                                                }
                                                bzcVar.n(cgeVar2);
                                                O = 0;
                                            }
                                        } else {
                                            O = O;
                                            bzcVar = bzcVar;
                                        }
                                        cgeVar2 = cgeVar2.u;
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                    if (i6 != 1) {
                                        O = O;
                                        bzcVar = bzcVar;
                                    } else {
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar);
                            }
                        }
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.czl) this.b).removeOnAttachStateChangeListener(this.a);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.epy) this.b).d(this.a);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new java.io.File(((android.content.Context) this.b).getApplicationContext().getFilesDir(), "datastore/".concat(((defpackage.eia) this.a).a.concat(".preferences_pb")));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.jmj jmjVar = (defpackage.jmj) this.b;
                if (jmjVar.d == null) {
                    throw new java.lang.IllegalStateException("Set disappearedCallback before entering DISAPPEARING state.");
                }
                defpackage.jml jmlVar = (defpackage.jml) this.a;
                defpackage.ebq.r(jmlVar.i, defpackage.zbd.Fp);
                jmlVar.k.b(jmjVar.b);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.jmj jmjVar2 = (defpackage.jmj) this.b;
                if (jmjVar2.b <= 0) {
                    throw new java.lang.IllegalStateException("Cannot create virtual device without valid association ID!");
                }
                android.companion.virtual.VirtualDeviceParams.Builder usersWithMatchingAccounts = new android.companion.virtual.VirtualDeviceParams.Builder().setLockState(1).setUsersWithMatchingAccounts(defpackage.afga.I(android.os.Process.myUserHandle()));
                usersWithMatchingAccounts.getClass();
                if (android.os.Build.VERSION.SDK_INT >= 35) {
                    usersWithMatchingAccounts.setDevicePolicy(2, 1);
                }
                if (!defpackage.a.O()) {
                    virtualDeviceParamsBuild = usersWithMatchingAccounts.build();
                    virtualDeviceParamsBuild.getClass();
                } else if (defpackage.dmh.H()) {
                    defpackage.jml.b.l().u("All activities allowed");
                    virtualDeviceParamsBuild = usersWithMatchingAccounts.build();
                    virtualDeviceParamsBuild.getClass();
                } else {
                    usersWithMatchingAccounts.setDevicePolicy(3, 1);
                    java.util.Set setJ = defpackage.afga.J(android.content.ComponentName.createRelative("com.google.android.projection.gearhead", "com.google.android.apps.auto.client.activity.ghost.GhostActivity"), android.content.ComponentName.createRelative("com.google.android.googlequicksearchbox", "com.google.android.apps.auto.client.activity.ghost.GhostActivity"), android.content.ComponentName.createRelative("com.google.android.apps.maps", "com.google.android.apps.auto.client.activity.ghost.GhostActivity"), android.content.ComponentName.createRelative("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.car.window.composition.ProjectionRootActivity"));
                    if (defpackage.acve.c()) {
                        setJ.add(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.car.activity.virtualdevice.CarVirtualDeviceActivity"));
                    }
                    defpackage.ygw ygwVarA = defpackage.tht.a(new defpackage.ikc(17), defpackage.acqh.g());
                    ygwVarA.getClass();
                    setJ.addAll(ygwVarA);
                    defpackage.jml.b.l().y("Allowing %s", setJ);
                    usersWithMatchingAccounts.setAllowedActivities(setJ);
                    virtualDeviceParamsBuild = usersWithMatchingAccounts.build();
                    virtualDeviceParamsBuild.getClass();
                }
                java.lang.Object obj2 = this.a;
                defpackage.jml.b.l().t(virtualDeviceParamsBuild);
                android.companion.virtual.VirtualDeviceManager.VirtualDevice virtualDeviceCreateVirtualDevice = ((defpackage.jml) obj2).j.createVirtualDevice(jmjVar2.b, virtualDeviceParamsBuild);
                virtualDeviceCreateVirtualDevice.getClass();
                return virtualDeviceCreateVirtualDevice;
            case 9:
                defpackage.jmj jmjVar3 = (defpackage.jmj) this.b;
                jmo jmoVar = jmjVar3.d;
                if (jmoVar == null) {
                    throw new java.lang.IllegalStateException("Got to state ABSENT without a disappeared callback!");
                }
                java.lang.Object obj3 = this.a;
                jmjVar3.d = null;
                ahoc.d(((defpackage.jml) obj3).h, (defpackage.afdo) null, 0, new defpackage.jmh(jmoVar, null), 3);
                return defpackage.afbk.a;
            case 10:
                defpackage.jmj jmjVar4 = (defpackage.jmj) this.b;
                if (jmjVar4.c == null) {
                    throw new java.lang.IllegalStateException("Set appearedCallback before entering APPEARING state.");
                }
                defpackage.jml jmlVar2 = (defpackage.jml) this.a;
                defpackage.ebq.r(jmlVar2.i, defpackage.zbd.Fo);
                jmlVar2.k.a.notifyDeviceAppeared(jmjVar4.b);
                return defpackage.afbk.a;
            case 11:
                defpackage.jmj jmjVar5 = (defpackage.jmj) this.b;
                defpackage.jly jlyVar = jmjVar5.c;
                if (jlyVar == null) {
                    throw new java.lang.IllegalStateException("Got to state PRESENT without an appeared callback!");
                }
                java.lang.Object obj4 = this.a;
                jmjVar5.c = null;
                ahoc.d(((defpackage.jml) obj4).h, (defpackage.afdo) null, 0, new defpackage.jmg(jlyVar, jmjVar5, null), 3);
                return defpackage.afbk.a;
            case 12:
                defpackage.yqm yqmVar = defpackage.tfh.a;
                java.lang.Object obj5 = this.b;
                return defpackage.sqs.aK(((defpackage.jmj) obj5).b == 0 ? defpackage.jmk.a : defpackage.jmk.b, defpackage.jml.c, defpackage.jml.f, new defpackage.err(obj5, this.a, i, bArr));
            case 13:
                ((defpackage.kmm) this.a).m((defpackage.cik) this.b);
                return defpackage.afbk.a;
            case 14:
                defpackage.afar afarVar = defpackage.mik.a;
                defpackage.whz whzVar = defpackage.whz.a;
                java.util.HashMap map = new java.util.HashMap();
                java.util.List listSingletonList = java.util.Collections.singletonList(new defpackage.wfv(new defpackage.rkq((android.content.Context) this.b)));
                listSingletonList.getClass();
                defpackage.ngb ngbVar = new defpackage.ngb(listSingletonList);
                defpackage.sqs.bF(defpackage.whq.a, map);
                defpackage.xzi xziVar = defpackage.whm.a;
                defpackage.sqs.bF(new defpackage.whm(new defpackage.sqs()), map);
                return new defpackage.ret(this.a, ngbVar, whzVar, map);
            case 15:
                ?? r0 = this.b;
                defpackage.yqm yqmVar2 = defpackage.nif.a;
                if (((java.lang.Boolean) r0.a()).booleanValue() && ((java.lang.Boolean) this.a.a()).booleanValue()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 16:
                ?? r1 = this.b;
                defpackage.yqm yqmVar3 = defpackage.nif.a;
                ((defpackage.nkp) this.a).o(((java.lang.Number) r1.a()).intValue());
                return defpackage.afbk.a;
            case 17:
                defpackage.yqm yqmVar4 = defpackage.nif.a;
                ((defpackage.nkp) this.a).r((android.content.Context) this.b);
                return defpackage.afbk.a;
            case 18:
                ?? r2 = this.a;
                if (r2 != 0) {
                    ((defpackage.nng) this.b).a = false;
                    r2.invoke();
                }
                return defpackage.afbk.a;
            case 19:
                ((defpackage.nng) this.b).a = true;
                ?? r14 = this.a;
                if (r14 != 0) {
                    r14.invoke();
                }
                return defpackage.afbk.a;
            default:
                ((defpackage.nng) this.b).a = false;
                ?? r15 = this.a;
                if (r15 != 0) {
                    r15.invoke();
                }
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ bxn(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
