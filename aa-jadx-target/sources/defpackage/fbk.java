package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fbk {
    public final java.lang.Object a;
    public java.lang.Object b;

    public fbk() {
        this.a = new defpackage.bzc(new defpackage.cxl[16]);
    }

    public final android.os.Bundle a(java.lang.String str) {
        defpackage.fbq fbqVar = (defpackage.fbq) this.a;
        if (!fbqVar.d) {
            throw new java.lang.IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        android.os.Bundle bundle = fbqVar.c;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundleB = bundle.containsKey(str) ? defpackage.fbh.b(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            fbqVar.c = null;
        }
        return bundleB;
    }

    public final defpackage.fbj b(java.lang.String str) {
        defpackage.fbj fbjVar;
        java.lang.Object obj = this.a;
        synchronized (((defpackage.fbq) obj).g) {
            fbjVar = (defpackage.fbj) ((defpackage.fbq) obj).f.a(str);
        }
        return fbjVar;
    }

    public final void c(java.lang.String str, defpackage.fbj fbjVar) {
        fbjVar.getClass();
        java.lang.Object obj = this.a;
        synchronized (((defpackage.fbq) obj).g) {
            defpackage.aau aauVar = ((defpackage.fbq) obj).f;
            if (defpackage.aau.f(aauVar, str)) {
                throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aauVar.m(str, fbjVar);
            if ((fbjVar instanceof fbn) && ((defpackage.fbq) obj).d) {
                android.os.Bundle bundle = ((defpackage.fbq) obj).c;
                android.os.Bundle bundleB = null;
                if (bundle != null && bundle.containsKey(str)) {
                    bundleB = defpackage.fbh.b(bundle, str);
                }
                if (bundleB != null) {
                    bundle.getClass();
                    bundle.remove(str);
                    bundle.getClass();
                    if (bundle.isEmpty()) {
                        ((defpackage.fbq) obj).c = null;
                    }
                }
                ((fbn) fbjVar).a();
            }
        }
    }

    public final void d(java.lang.Class cls) {
        if (!((defpackage.fbq) this.a).e) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        java.lang.Object fbfVar = this.b;
        if (fbfVar == null) {
            fbfVar = new fbf(this);
        }
        this.b = fbfVar;
        try {
            cls.getDeclaredConstructor(null);
            java.lang.Object obj = this.b;
            if (obj != null) {
                java.lang.String name = cls.getName();
                name.getClass();
                ((fbf) obj).a.add(name);
            }
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void e(defpackage.cxl cxlVar) {
        if (cxlVar.C > 0) {
            if (cxlVar.av() == 5 && !cxlVar.ai() && !cxlVar.al() && !cxlVar.D && cxlVar.an()) {
                defpackage.cyg cygVar = cxlVar.v;
                if ((cygVar.a() & 256) != 0) {
                    for (defpackage.cge cgeVar = cygVar.f; cgeVar != null; cgeVar = cgeVar.u) {
                        if ((cgeVar.r & 256) != 0) {
                            ?? O = cgeVar;
                            ?? bzcVar = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.cwv) {
                                    defpackage.cwv cwvVar = (defpackage.cwv) O;
                                    cwvVar.dA(defpackage.cjv.s(cwvVar, 256));
                                } else if ((O.r & 256) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                                    int i = 0;
                                    O = O;
                                    bzcVar = bzcVar;
                                    while (cgeVar2 != null) {
                                        if ((cgeVar2.r & 256) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                        }
                                        cgeVar2 = cgeVar2.u;
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar);
                            }
                        }
                        if ((cgeVar.s & 256) == 0) {
                            break;
                        }
                    }
                }
            }
            cxlVar.B = false;
            defpackage.bzc bzcVarK = cxlVar.k();
            java.lang.Object[] objArr = bzcVarK.a;
            int i2 = bzcVarK.b;
            for (int i3 = 0; i3 < i2; i3++) {
                e((defpackage.cxl) objArr[i3]);
            }
        }
    }

    public final void f(defpackage.cxl cxlVar) {
        if (cxlVar.C > 0) {
            ((defpackage.bzc) this.a).n(cxlVar);
            cxlVar.B = true;
        }
    }

    public final boolean g() {
        return ((defpackage.bzc) this.a).b != 0;
    }

    public fbk(com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig, java.lang.Runnable runnable) {
        this.b = carActivityRegionLayoutConfig;
        this.a = runnable;
    }

    public fbk(defpackage.fbq fbqVar) {
        this.a = fbqVar;
    }
}
