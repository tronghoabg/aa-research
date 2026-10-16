package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ngb {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public ngb(java.util.List list) {
        java.util.List<wgz> list2 = java.util.Collections.EMPTY_LIST;
        java.util.List list3 = java.util.Collections.EMPTY_LIST;
        this.c = new java.util.HashMap();
        this.b = new java.util.HashMap();
        this.a = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.wgu wguVar = (defpackage.wgu) it.next();
            if (android.text.TextUtils.isEmpty(wguVar.e())) {
                android.util.Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                defpackage.wgu wguVar2 = (defpackage.wgu) this.c.put(wguVar.e(), wguVar);
                if (wguVar2 != null) {
                    throw new java.lang.IllegalArgumentException("Cannot override Backend " + wguVar2.getClass().getCanonicalName() + " with " + wguVar.getClass().getCanonicalName());
                }
            }
        }
        for (wgz wgzVar : list2) {
            if (android.text.TextUtils.isEmpty(wgzVar.a())) {
                android.util.Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                wgz wgzVar2 = (wgz) this.b.put(wgzVar.a(), wgzVar);
                if (wgzVar2 != null) {
                    throw new java.lang.IllegalArgumentException("Cannot to override Transform " + wgzVar2.getClass().getCanonicalName() + " with " + wgzVar.getClass().getCanonicalName());
                }
            }
        }
        this.a.addAll(list3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgi */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    private final defpackage.ret E(android.net.Uri uri) throws wgi, java.io.IOException {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        java.util.regex.Pattern pattern = defpackage.wgo.a;
        defpackage.ygr ygrVar2 = new defpackage.ygr(4);
        java.lang.String encodedFragment = uri.getEncodedFragment();
        defpackage.ygw ygwVarN = (android.text.TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? defpackage.ymx.a : defpackage.ygw.n(defpackage.xzd.d("+").b().g(encodedFragment.substring(10)));
        int size = ygwVarN.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.String str = (java.lang.String) ygwVarN.get(i2);
            java.util.regex.Matcher matcher = defpackage.wgo.a.matcher(str);
            if (!matcher.matches()) {
                throw new java.lang.IllegalArgumentException("Invalid fragment spec: ".concat(java.lang.String.valueOf(str)));
            }
            ygrVar2.i(matcher.group(1));
        }
        defpackage.ygw ygwVarG = ygrVar2.g();
        int i3 = ((defpackage.ymx) ygwVarG).c;
        for (int i4 = 0; i4 < i3; i4++) {
            java.lang.String str2 = (java.lang.String) ygwVarG.get(i4);
            wgz wgzVar = (wgz) this.b.get(str2);
            if (wgzVar == null) {
                throw new wgi("Requested transform isn't registered: " + str2 + ": " + java.lang.String.valueOf(uri));
            }
            ygrVar.i(wgzVar);
        }
        defpackage.ygw ygwVarH = ygrVar.g().h();
        defpackage.wfs wfsVar = new defpackage.wfs();
        wfsVar.a = this;
        java.lang.String scheme = uri.getScheme();
        defpackage.wgu wguVar = (defpackage.wgu) this.c.get(scheme);
        if (wguVar == null) {
            throw new wgi(java.lang.String.format("Requested backend isn't registered: %s", scheme));
        }
        wfsVar.b = wguVar;
        wfsVar.d = this.a;
        wfsVar.c = ygwVarH;
        wfsVar.e = uri;
        if (!ygwVarH.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                java.lang.String strB = (java.lang.String) arrayList.get(arrayList.size() - 1);
                java.util.ListIterator<E> listIterator = ygwVarH.listIterator(ygwVarH.size());
                while (listIterator.hasPrevious()) {
                    strB = ((wgz) listIterator.previous()).b();
                }
                arrayList.set(arrayList.size() - 1, strB);
                uri = uri.buildUpon().path(android.text.TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        wfsVar.f = uri;
        return new defpackage.ret(wfsVar);
    }

    public static defpackage.ngb a() {
        return (defpackage.ngb) defpackage.mkp.a.i(defpackage.ngb.class);
    }

    public final int A() {
        return ((defpackage.byj) this.b).e();
    }

    public final int B() {
        return ((defpackage.byj) this.c).e();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void C(defpackage.izq izqVar) {
        ((java.util.concurrent.CopyOnWriteArrayList) this.c).add(izqVar);
        this.a.run();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    public final void D(defpackage.izq izqVar) {
        ((java.util.concurrent.CopyOnWriteArrayList) this.c).remove(izqVar);
        if (((defpackage.ebl) this.b.remove(izqVar)) != null) {
            throw null;
        }
        this.a.run();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void b(defpackage.mqj mqjVar, com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (mqjVar != null && this.c.add(android.util.Pair.create(carRegionId, mqjVar))) {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PROJECTION_CONTEXT, defpackage.zbd.tu);
            rrvVarH.p(mqjVar.a());
            rrvVarH.n(carRegionId);
            oimVarU.F(rrvVarH.l());
        }
    }

    public final boolean c(defpackage.xzi xziVar) {
        if (((defpackage.vqv) this.c).a().booleanValue()) {
            return ((defpackage.vra) this.b).c.a == 2;
        }
        return defpackage.vrn.c((android.content.Context) this.a, (defpackage.vro) xziVar.fF());
    }

    public final java.lang.Object d(android.net.Uri uri, defpackage.wft wftVar) throws java.io.IOException {
        return wftVar.a(E(uri));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgi */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wgu] */
    public final void e(android.net.Uri uri) throws wgi, java.io.IOException {
        defpackage.ret retVarE = E(uri);
        retVarE.d.g((android.net.Uri) retVarE.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgi */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wgu] */
    public final void f(android.net.Uri uri, android.net.Uri uri2) throws wgi, java.io.IOException {
        defpackage.ret retVarE = E(uri);
        ?? r0 = retVarE.d;
        defpackage.ret retVarE2 = E(uri2);
        if (r0 != retVarE2.d) {
            throw new wgi("Cannot rename file across backends");
        }
        r0.h((android.net.Uri) retVarE.a, (android.net.Uri) retVarE2.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgi */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wgu] */
    public final boolean g(android.net.Uri uri) throws wgi, java.io.IOException {
        defpackage.ret retVarE = E(uri);
        return retVarE.d.f((android.net.Uri) retVarE.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [afer, java.lang.Object] */
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography h(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId, boolean z) {
        if (defpackage.nte.c().b().m() == defpackage.nti.e && defpackage.afga.f(com.google.android.gms.car.display.CarRegionId.a, carRegionId) && (intent.getFlags() & 1048576) == 0) {
            defpackage.lhd lhdVarA = defpackage.ler.a();
            android.content.ComponentName componentNameA = defpackage.lhc.a().a(defpackage.mqg.NAVIGATION);
            if (lhdVarA.i(componentNameA != null ? defpackage.mpr.b(componentNameA) : null) && intent.getBooleanExtra("EXTRA_STARTED_BY_DASHBOARD", false)) {
                return (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.b.invoke();
            }
            if (z) {
                return (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.a.invoke();
            }
        }
        return null;
    }

    public final defpackage.yhe i(defpackage.ntb ntbVar) {
        return defpackage.yhe.l(com.google.android.gms.car.display.CarRegionId.a, new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772024, false, null, 0), ntbVar.r((defpackage.nta) this.c), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772027, false, null, 0));
    }

    public final void j(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((defpackage.bt) ((defpackage.izq) it.next()).a).Z(menu, menuInflater);
        }
    }

    public final void k(android.view.Menu menu) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((defpackage.bt) ((defpackage.izq) it.next()).a).ab(menu);
        }
    }

    public final boolean l(android.view.MenuItem menuItem) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            if (((defpackage.bt) ((defpackage.izq) it.next()).a).aa(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void m(defpackage.dqw dqwVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.c;
        arrayList.clear();
        int size = dqwVar.aL.size();
        for (int i = 0; i < size; i++) {
            defpackage.dqv dqvVar = (defpackage.dqv) dqwVar.aL.get(i);
            if (dqvVar.W() == 3 || dqvVar.X() == 3) {
                arrayList.add(dqvVar);
            }
        }
        dqwVar.c();
    }

    public final boolean n(defpackage.drf drfVar, defpackage.dqv dqvVar, int i) {
        defpackage.dre dreVar = (defpackage.dre) this.b;
        dreVar.i = dqvVar.W();
        dreVar.j = dqvVar.X();
        dreVar.a = dqvVar.j();
        dreVar.b = dqvVar.h();
        dreVar.g = false;
        dreVar.h = i;
        int i2 = dreVar.i;
        int i3 = dreVar.j;
        boolean z = i2 == 3 && dqvVar.ah > 0.0f;
        boolean z2 = i3 == 3 && dqvVar.ah > 0.0f;
        if (z && dqvVar.E[0] == 4) {
            dreVar.i = 1;
        }
        if (z2 && dqvVar.E[1] == 4) {
            dreVar.j = 1;
        }
        drfVar.b(dqvVar, dreVar);
        dqvVar.M(dreVar.c);
        dqvVar.B(dreVar.d);
        dqvVar.P = dreVar.f;
        dqvVar.x(dreVar.e);
        dreVar.h = 0;
        return dreVar.g;
    }

    public final void o(defpackage.dqw dqwVar, int i, int i2, int i3) {
        int i4 = dqwVar.am;
        int i5 = dqwVar.an;
        dqwVar.J(0);
        dqwVar.I(0);
        dqwVar.M(i2);
        dqwVar.B(i3);
        dqwVar.J(i4);
        dqwVar.I(i5);
        java.lang.Object obj = this.a;
        ((defpackage.dqw) obj).b = i;
        ((defpackage.drd) obj).ae();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afar, java.lang.Object] */
    public final android.view.inputmethod.InputMethodManager p() {
        return (android.view.inputmethod.InputMethodManager) this.b.a();
    }

    public final void q(int i, int i2, int i3, int i4) {
        p().updateSelection((android.view.View) this.c, i, i2, i3, i4);
    }

    public final void r(defpackage.dhy dhyVar, java.lang.Object obj) {
        defpackage.dht dhtVar = new defpackage.dht(dhyVar);
        synchronized (this.c) {
            try {
                if (obj == null) {
                    ((defpackage.aau) this.a).m(dhtVar, new defpackage.dhs(null));
                } else {
                    ((defpackage.aab) this.b).c(dhtVar, new defpackage.dhs(obj));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(defpackage.dhy dhyVar, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.dhu dhuVar;
        defpackage.dht dhtVar;
        if (afdkVar instanceof defpackage.dhu) {
            dhuVar = (defpackage.dhu) afdkVar;
            int i = dhuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dhuVar.b = i - Integer.MIN_VALUE;
            } else {
                dhuVar = new defpackage.dhu(this, afdkVar);
            }
        } else {
            dhuVar = new defpackage.dhu(this, afdkVar);
        }
        java.lang.Object obj = dhuVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = dhuVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            defpackage.dht dhtVar2 = new defpackage.dht(dhyVar);
            synchronized (this.c) {
                defpackage.dhs dhsVar = (defpackage.dhs) ((defpackage.aab) this.b).b(dhtVar2);
                if (dhsVar == null) {
                    dhsVar = (defpackage.dhs) ((defpackage.aau) this.a).a(dhtVar2);
                }
                if (dhsVar != null) {
                    return dhsVar.a;
                }
                dhuVar.c = dhtVar2;
                dhuVar.b = 1;
                java.lang.Object objInvoke = affcVar.invoke(dhuVar);
                if (objInvoke == afdrVar) {
                    return afdrVar;
                }
                obj = objInvoke;
                dhtVar = dhtVar2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dhtVar = dhuVar.c;
            defpackage.afga.cz(obj);
        }
        synchronized (this.c) {
            try {
                if (obj == null) {
                    ((defpackage.aau) this.a).m(dhtVar, new defpackage.dhs(null));
                } else {
                    ((defpackage.aab) this.b).c(dhtVar, new defpackage.dhs(obj));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bys, java.lang.Object] */
    public final boolean t() {
        if (this.b.a() != this.c) {
            return true;
        }
        java.lang.Object obj = this.a;
        return obj != null && ((defpackage.ngb) obj).t();
    }

    public final boolean u() {
        return (((defpackage.cwp) this.a).d() && ((defpackage.cwp) this.c).d() && ((defpackage.cwp) this.b).d()) ? false : true;
    }

    public final boolean v(defpackage.cxl cxlVar) {
        return cxlVar.j != null && (((defpackage.cwp) this.a).c(cxlVar) || ((defpackage.cwp) this.b).c(cxlVar));
    }

    public final void w(defpackage.cxl cxlVar) {
        ((defpackage.cwp) this.a).e(cxlVar);
        ((defpackage.cwp) this.b).e(cxlVar);
        ((defpackage.cwp) this.c).e(cxlVar);
    }

    public final void x(defpackage.cxl cxlVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            ((defpackage.cwp) this.a).b(cxlVar);
            ((defpackage.cwp) this.c).b(cxlVar);
            return;
        }
        if (i2 == 1) {
            ((defpackage.cwp) this.b).b(cxlVar);
            ((defpackage.cwp) this.c).b(cxlVar);
        } else {
            if (i2 != 2) {
                if (cxlVar.j != null) {
                    ((defpackage.cwp) this.c).b(cxlVar);
                    return;
                } else {
                    ((defpackage.cwp) this.b).b(cxlVar);
                    return;
                }
            }
            if (cxlVar.j != null) {
                ((defpackage.cwp) this.c).b(cxlVar);
            } else {
                ((defpackage.cwp) this.a).b(cxlVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [azm, java.lang.Object] */
    public final java.lang.Object y(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        defpackage.azk azkVar = (defpackage.azk) ((defpackage.aau) this.a).a(obj);
        if (azkVar != null) {
            return azkVar.b;
        }
        ?? Invoke = this.c.invoke();
        int iA = Invoke.a(obj);
        if (iA == -1) {
            return null;
        }
        return Invoke.c(iA);
    }

    public final defpackage.affg z(int i, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aau aauVar = (defpackage.aau) this.a;
        defpackage.azk azkVar = (defpackage.azk) aauVar.a(obj);
        if (azkVar != null && azkVar.c == i && defpackage.afga.f(azkVar.b, obj2)) {
            return azkVar.a();
        }
        defpackage.azk azkVar2 = new defpackage.azk(this, i, obj, obj2);
        aauVar.m(obj, azkVar2);
        return azkVar2.a();
    }

    public ngb(defpackage.nta ntaVar) {
        this.c = ntaVar;
        this.b = new defpackage.djm(this, 12);
        this.a = new defpackage.djm(this, 13);
    }

    public ngb() {
        this.c = java.util.Collections.newSetFromMap(new defpackage.nga());
        defpackage.yqm yqmVar = defpackage.mpj.a;
        defpackage.mpi mpiVar = ((defpackage.mpj) defpackage.mkp.a.i(defpackage.mpj.class)).h;
        this.b = mpiVar;
        android.content.ComponentName componentName = defpackage.nye.a;
        defpackage.eqs eqsVar = ((defpackage.nye) defpackage.mkp.a.i(defpackage.nye.class)).b;
        defpackage.mqj mqjVar = new defpackage.mqj(defpackage.nye.a, defpackage.mqg.SYSTEM);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqp eqpVarE = defpackage.ebo.e(defpackage.tcu.s(eqsVar, new defpackage.eqs(mqjVar), defpackage.ebo.f(mpiVar, new defpackage.lto(com.google.android.gms.car.display.CarRegionId.a, 8))));
        this.a = eqpVarE;
        mpiVar.eM((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class), new defpackage.kkr(this, 4));
        eqpVarE.eM((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class), new defpackage.kkr(this, 5));
    }

    public ngb(int i, int i2) {
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i2);
        this.a = new defpackage.azt(i, 90, 200);
    }

    public ngb(defpackage.abnv abnvVar, java.lang.String str, java.lang.String str2) {
        this.b = defpackage.yuv.e;
        this.a = defpackage.ysr.aQ(new defpackage.jbr(this, abnvVar, 10, null));
        this.c = defpackage.ysr.aQ(new defpackage.qfe(this, str, str2, 2));
    }

    public ngb(defpackage.cds cdsVar, defpackage.afer aferVar) {
        this.b = cdsVar;
        this.c = aferVar;
        long[] jArr = defpackage.aav.a;
        this.a = new defpackage.aau(6);
    }

    public ngb(android.content.Context context, defpackage.vra vraVar, defpackage.afak afakVar) {
        this.a = context;
        this.b = vraVar;
        this.c = afakVar;
    }

    public ngb(defpackage.afer aferVar) {
        this.c = new defpackage.ccu();
        this.a = new defpackage.ccw();
        this.b = new defpackage.bxn(this, aferVar, 1);
    }

    public ngb(char[] cArr, byte[] bArr) {
        this.a = new defpackage.cwp();
        this.b = new defpackage.cwp();
        this.c = new defpackage.cwp();
    }

    public ngb(defpackage.bys bysVar, defpackage.ngb ngbVar) {
        this.b = bysVar;
        this.a = ngbVar;
        this.c = bysVar.a();
    }

    public ngb(byte[] bArr, byte[] bArr2) {
        this.b = new defpackage.aab(16);
        long[] jArr = defpackage.aav.a;
        this.a = new defpackage.aau(6);
        this.c = new defpackage.dki(null);
    }

    public ngb(android.view.View view) {
        this.c = view;
        this.b = defpackage.afga.cB(3, new defpackage.djm(this, 0));
        this.a = new defpackage.erh(view, (byte[]) null);
    }

    public ngb(char[] cArr) {
        this.a = new java.util.WeakHashMap();
        this.b = new java.util.WeakHashMap();
        this.c = new java.util.WeakHashMap();
    }

    public ngb(defpackage.dqw dqwVar) {
        this.c = new java.util.ArrayList();
        this.b = new defpackage.dre();
        this.a = dqwVar;
    }

    public ngb(java.lang.Runnable runnable) {
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
        this.b = new java.util.HashMap();
        this.a = runnable;
    }
}
