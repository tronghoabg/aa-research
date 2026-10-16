package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ozs implements defpackage.zhh {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public ozs(defpackage.affc affcVar, defpackage.ldf ldfVar, java.util.Set set, int i) {
        this.d = i;
        this.b = affcVar;
        this.c = ldfVar;
        this.a = set;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        int i = this.d;
        if (i == 0) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) ozu.a.g()).p(th)).ai((char) 6231)).u("SDP query failed.");
            return;
        }
        if (i == 1) {
            th.getClass();
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ldf.b.g()).p(th)).u("Could not determine eligible surveys");
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                defpackage.jzl.g((defpackage.lby) it.next(), defpackage.zbd.FO);
            }
            this.b.invoke(null);
            return;
        }
        if (i == 2) {
            defpackage.rhc.a.h().p(th).ai(8029).u("Error adding car BT address");
            return;
        }
        if (i == 3) {
            android.util.Log.e("NetworkCallerGrpc", "Failed to record event.", th);
            ((wis) this.c).g();
            return;
        }
        if (i == 4) {
            android.util.Log.e("NetworkCallerGrpc", "Failed to record event.", th);
            ((wis) this.c).g();
            return;
        }
        if (i != 5) {
            android.util.Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
            wis wisVar = (wis) this.c;
            wisVar.c(wie.b);
            wisVar.g();
            return;
        }
        android.util.Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
        wis wisVar2 = (wis) this.c;
        wisVar2.c(wie.b);
        wisVar2.g();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r12v3, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ozm] */
    @Override // defpackage.zhh
    public final /* synthetic */ void b(java.lang.Object obj) {
        java.lang.Object objInvoke;
        java.lang.Object next;
        float f;
        defpackage.zbe zbeVarB;
        int i = this.d;
        int i2 = 0;
        if (i == 0) {
            ozt oztVar = (ozt) obj;
            ozo ozoVarC = ozp.c(oztVar.b);
            android.bluetooth.BluetoothDevice bluetoothDevice = oztVar.a;
            java.lang.Object obj2 = ((j$.util.Optional) this.b).get();
            ?? r3 = this.a;
            r3.e(bluetoothDevice, (ozo) obj2, ozoVarC);
            ozp.e((ozm) r3, (android.bluetooth.BluetoothDevice) this.c, ozoVarC, false);
            return;
        }
        abyn abynVar = null;
        if (i != 1) {
            if (i == 2) {
                if (((java.util.concurrent.atomic.AtomicBoolean) this.b).get()) {
                    ((defpackage.rhc) this.c).a((java.lang.String) this.a, 100);
                    return;
                }
                return;
            }
            if (i == 3) {
                wis wisVar = (wis) this.c;
                wisVar.g();
                wisVar.j((abyk) this.b, (wjb) this.a);
                return;
            }
            if (i == 4) {
                acmc acmcVar = (acmc) obj;
                ((wis) this.c).g();
                try {
                    defpackage.abox.y(abyl.a, acmcVar.f(), defpackage.abol.a());
                } catch (defpackage.abpp e) {
                    android.util.Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey record event response to scone.", e);
                }
                ((wis) this.c).j((abyk) this.b, (wjb) this.a);
                return;
            }
            java.lang.Object obj3 = this.c;
            if (i == 5) {
                wis wisVar2 = (wis) obj3;
                wisVar2.g();
                wisVar2.b((abym) this.b, (abyn) obj, (wjb) this.a);
                return;
            }
            acme acmeVar = (acme) obj;
            ((wis) obj3).g();
            try {
                abynVar = (abyn) defpackage.abox.y(abyn.a, acmeVar.f(), defpackage.abol.a());
            } catch (defpackage.abpp e2) {
                android.util.Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey trigger response to scone.", e2);
            }
            ((wis) this.c).b((abym) this.b, abynVar, (wjb) this.a);
            return;
        }
        java.util.Set<abyn> set = (java.util.Set) obj;
        set.getClass();
        java.util.Iterator it = defpackage.afga.K(this.a, set).iterator();
        while (it.hasNext()) {
            defpackage.jzl.g((defpackage.lby) it.next(), defpackage.zbd.FK);
        }
        if (!set.isEmpty()) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            abyn abynVar2 = null;
            for (abyn abynVar3 : set) {
                boolean z = abynVar3.v;
                if (z) {
                    f = 1.0f;
                } else {
                    defpackage.abpj abpjVar = defpackage.acqn.d().b;
                    abpjVar.getClass();
                    java.util.Iterator<E> it2 = abpjVar.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        zbeVarB = defpackage.zbe.b(((defpackage.absg) next).b);
                        if (zbeVarB == null) {
                            zbeVarB = defpackage.zbe.UNKNOWN_CONTEXT;
                        }
                    } while (zbeVarB != abynVar3.c());
                    defpackage.absg absgVar = (defpackage.absg) next;
                    if (absgVar == null) {
                        absgVar = defpackage.absg.a;
                        absgVar.getClass();
                    }
                    f = absgVar.c;
                }
                if (defpackage.afhs.b.a() < f) {
                    if (z && abynVar2 == null) {
                        abynVar2 = abynVar3;
                    }
                    linkedHashSet.add(abynVar3);
                } else {
                    defpackage.ldf.b.l().J("Survey %s: sampled out (sample fraction: %.1f)", abynVar3.name(), f);
                    defpackage.jzl.g(abynVar3, defpackage.zbd.FL);
                }
            }
            int size = linkedHashSet.size();
            if (size != 0) {
                if (size != 1) {
                    if (abynVar2 == null) {
                        java.lang.Object obj4 = this.c;
                        if (linkedHashSet.isEmpty()) {
                            throw new java.util.NoSuchElementException("Collection is empty.");
                        }
                        int iC = ((defpackage.ldf) obj4).e.c(linkedHashSet.size());
                        defpackage.cii ciiVar = new defpackage.cii(iC, 10);
                        if (iC >= 0) {
                            java.util.Iterator it3 = linkedHashSet.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    objInvoke = ciiVar.invoke(java.lang.Integer.valueOf(iC));
                                    break;
                                }
                                java.lang.Object next2 = it3.next();
                                int i3 = i2 + 1;
                                if (iC == i2) {
                                    objInvoke = next2;
                                    break;
                                }
                                i2 = i3;
                            }
                        } else {
                            objInvoke = ciiVar.invoke(java.lang.Integer.valueOf(iC));
                        }
                        abynVar = (defpackage.lby) objInvoke;
                    } else {
                        abynVar = abynVar2;
                    }
                    defpackage.ldf.b.l().M("Selected %s from %s", abynVar, linkedHashSet);
                    linkedHashSet.remove(abynVar);
                    java.util.Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        defpackage.jzl.g((defpackage.lby) it4.next(), defpackage.zbd.FM);
                    }
                } else {
                    abynVar = (defpackage.lby) defpackage.afga.aG(linkedHashSet);
                }
            }
        }
        this.b.invoke(abynVar);
    }

    public ozs(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.b = obj2;
        this.a = obj3;
        this.c = obj;
    }

    public ozs(ozm ozmVar, j$.util.Optional optional, android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
        this.d = i;
        this.a = ozmVar;
        this.b = optional;
        this.c = bluetoothDevice;
    }
}
