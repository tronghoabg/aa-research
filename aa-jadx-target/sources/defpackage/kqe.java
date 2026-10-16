package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kqe {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public kqe() {
        java.util.HashMap map = new java.util.HashMap();
        this.a = map;
        this.b = new java.util.HashMap();
        map.put("MODEL", 1);
        map.put("ENERGY_PROFILE", 2);
        map.put("TOLLCARD", 3);
        map.put("SPEED", 5);
        map.put("MILEAGE", 6);
        map.put("ENERGY_LEVEL", 4);
        map.put("ACCELEROMETER", 20);
        map.put("COMPASS", 21);
        map.put("GYROSCOPE", 22);
        map.put("CAR_LOCATION", 23);
    }

    public static /* synthetic */ java.util.List A(java.lang.String str, java.lang.String str2, fch fchVar) {
        fchVar.getClass();
        fbr fbrVarA = fchVar.a(str);
        try {
            fbrVarA.h(1, str2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (fbrVarA.k()) {
                arrayList.add(fbrVarA.d(0));
            }
            fbrVarA.close();
            return arrayList;
        } catch (java.lang.Throwable th) {
            fbrVarA.close();
            throw th;
        }
    }

    public static /* synthetic */ int B(java.lang.String str, java.lang.String str2, fch fchVar) {
        fchVar.getClass();
        fbr fbrVarA = fchVar.a(str);
        try {
            fbrVarA.h(1, str2);
            fbrVarA.k();
            return defpackage.cdp.h(fchVar);
        } finally {
            fbrVarA.close();
        }
    }

    public static /* synthetic */ java.util.List C(java.lang.String str, fch fchVar) {
        fchVar.getClass();
        fbr fbrVarA = fchVar.a(str);
        try {
            int iG = defpackage.cdp.g(fbrVarA, "id");
            int iG2 = defpackage.cdp.g(fbrVarA, "state");
            int iG3 = defpackage.cdp.g(fbrVarA, "worker_class_name");
            int iG4 = defpackage.cdp.g(fbrVarA, "input_merger_class_name");
            int iG5 = defpackage.cdp.g(fbrVarA, "input");
            int iG6 = defpackage.cdp.g(fbrVarA, "output");
            int iG7 = defpackage.cdp.g(fbrVarA, "initial_delay");
            int iG8 = defpackage.cdp.g(fbrVarA, "interval_duration");
            int iG9 = defpackage.cdp.g(fbrVarA, "flex_duration");
            int iG10 = defpackage.cdp.g(fbrVarA, "run_attempt_count");
            int iG11 = defpackage.cdp.g(fbrVarA, "backoff_policy");
            int iG12 = defpackage.cdp.g(fbrVarA, "backoff_delay_duration");
            int iG13 = defpackage.cdp.g(fbrVarA, "last_enqueue_time");
            int iG14 = defpackage.cdp.g(fbrVarA, "minimum_retention_duration");
            int iG15 = defpackage.cdp.g(fbrVarA, "schedule_requested_at");
            int iG16 = defpackage.cdp.g(fbrVarA, "run_in_foreground");
            int iG17 = defpackage.cdp.g(fbrVarA, "out_of_quota_policy");
            int iG18 = defpackage.cdp.g(fbrVarA, "period_count");
            int iG19 = defpackage.cdp.g(fbrVarA, "generation");
            int iG20 = defpackage.cdp.g(fbrVarA, "next_schedule_time_override");
            int iG21 = defpackage.cdp.g(fbrVarA, "next_schedule_time_override_generation");
            int iG22 = defpackage.cdp.g(fbrVarA, "stop_reason");
            int iG23 = defpackage.cdp.g(fbrVarA, "trace_tag");
            int iG24 = defpackage.cdp.g(fbrVarA, "backoff_on_system_interruptions");
            int iG25 = defpackage.cdp.g(fbrVarA, "required_network_type");
            int iG26 = defpackage.cdp.g(fbrVarA, "required_network_request");
            int iG27 = defpackage.cdp.g(fbrVarA, "requires_charging");
            int iG28 = defpackage.cdp.g(fbrVarA, "requires_device_idle");
            int iG29 = defpackage.cdp.g(fbrVarA, "requires_battery_not_low");
            int iG30 = defpackage.cdp.g(fbrVarA, "requires_storage_not_low");
            int iG31 = defpackage.cdp.g(fbrVarA, "trigger_content_update_delay");
            int iG32 = defpackage.cdp.g(fbrVarA, "trigger_max_content_delay");
            int iG33 = defpackage.cdp.g(fbrVarA, "content_uri_triggers");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (fbrVarA.k()) {
                java.lang.String strD = fbrVarA.d(iG);
                int i = iG14;
                java.util.ArrayList arrayList2 = arrayList;
                fkb fkbVarK = dtb.k((int) fbrVarA.b(iG2));
                java.lang.String strD2 = fbrVarA.d(iG3);
                java.lang.String strD3 = fbrVarA.d(iG4);
                byte[] bArrL = fbrVarA.l(iG5);
                fjj fjjVar = fjj.a;
                fjj fjjVarH = defpackage.dbc.h(bArrL);
                fjj fjjVarH2 = defpackage.dbc.h(fbrVarA.l(iG6));
                long jB = fbrVarA.b(iG7);
                long jB2 = fbrVarA.b(iG8);
                long jB3 = fbrVarA.b(iG9);
                int iB = (int) fbrVarA.b(iG10);
                int i2 = iG2;
                int i3 = iG3;
                int iN = dtb.n((int) fbrVarA.b(iG11));
                long jB4 = fbrVarA.b(iG12);
                long jB5 = fbrVarA.b(iG13);
                long jB6 = fbrVarA.b(i);
                int i4 = iG15;
                long jB7 = fbrVarA.b(i4);
                int i5 = iG;
                int i6 = iG16;
                boolean z = ((int) fbrVarA.b(i6)) != 0;
                int i7 = iG17;
                int i8 = iG4;
                int iP = dtb.p((int) fbrVarA.b(i7));
                int i9 = iG18;
                int i10 = iG5;
                int iB2 = (int) fbrVarA.b(i9);
                int i11 = iG19;
                int iB3 = (int) fbrVarA.b(i11);
                int i12 = iG20;
                long jB8 = fbrVarA.b(i12);
                int i13 = iG21;
                int iB4 = (int) fbrVarA.b(i13);
                int i14 = iG22;
                int iB5 = (int) fbrVarA.b(i14);
                int i15 = iG23;
                java.lang.Boolean boolValueOf = null;
                java.lang.String strD4 = fbrVarA.j(i15) ? null : fbrVarA.d(i15);
                int i16 = iG24;
                java.lang.Integer numValueOf = fbrVarA.j(i16) ? null : java.lang.Integer.valueOf((int) fbrVarA.b(i16));
                if (numValueOf != null) {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i17 = iG25;
                java.lang.Boolean bool = boolValueOf;
                int iO = dtb.o((int) fbrVarA.b(i17));
                int i18 = iG26;
                foz fozVarL = dtb.l(fbrVarA.l(i18));
                iG25 = i17;
                iG26 = i18;
                int i19 = iG27;
                boolean z2 = ((int) fbrVarA.b(i19)) != 0;
                iG27 = i19;
                int i20 = iG28;
                boolean z3 = ((int) fbrVarA.b(i20)) != 0;
                int i21 = iG29;
                boolean z4 = ((int) fbrVarA.b(i21)) != 0;
                iG29 = i21;
                int i22 = iG30;
                int i23 = iG31;
                int i24 = iG32;
                int i25 = iG33;
                iG33 = i25;
                arrayList2.add(new fok(strD, fkbVarK, strD2, strD3, fjjVarH, fjjVarH2, jB, jB2, jB3, new fjh(fozVarL, iO, z2, z3, z4, ((int) fbrVarA.b(i22)) != 0, fbrVarA.b(i23), fbrVarA.b(i24), dtb.m(fbrVarA.l(i25))), iB, iN, jB4, jB5, jB6, jB7, z, iP, iB2, iB3, jB8, iB4, iB5, strD4, bool));
                iG30 = i22;
                iG4 = i8;
                iG17 = i7;
                iG19 = i11;
                iG22 = i14;
                iG24 = i16;
                iG31 = i23;
                iG32 = i24;
                iG2 = i2;
                iG14 = i;
                iG3 = i3;
                arrayList = arrayList2;
                iG = i5;
                iG15 = i4;
                iG16 = i6;
                iG20 = i12;
                iG21 = i13;
                iG23 = i15;
                iG28 = i20;
                iG5 = i10;
                iG18 = i9;
            }
            return arrayList;
        } finally {
            fbrVarA.close();
        }
    }

    public static /* synthetic */ defpackage.afbk D(java.lang.String str, java.lang.String str2, fch fchVar) {
        fchVar.getClass();
        fbr fbrVarA = fchVar.a(str);
        try {
            fbrVarA.h(1, str2);
            fbrVarA.k();
            return defpackage.afbk.a;
        } finally {
            fbrVarA.close();
        }
    }

    public static /* synthetic */ boolean E(java.lang.String str, java.lang.String str2, fch fchVar) {
        fchVar.getClass();
        fbr fbrVarA = fchVar.a(str);
        try {
            fbrVarA.h(1, str2);
            return fbrVarA.k() && ((int) fbrVarA.b(0)) != 0;
        } finally {
            fbrVarA.close();
        }
    }

    public static final double F(defpackage.ly lyVar, defpackage.afer aferVar) {
        return lyVar instanceof fts ? ((fts) lyVar).a : ((java.lang.Number) aferVar.invoke()).doubleValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized java.util.List I(java.lang.String str) {
        ?? r0 = this.a;
        if (!r0.contains(str)) {
            r0.add(str);
        }
        ?? r1 = this.b;
        java.util.List list = (java.util.List) r1.get(str);
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r1.put(str, arrayList);
        return arrayList;
    }

    public static final hxg o(android.graphics.ImageDecoder.Source source, int i, int i2, huw huwVar) throws java.io.IOException {
        android.graphics.drawable.Drawable drawableM = jx$.ExternalSyntheticApiModelOutline3.m(source, new iai(i, i2, huwVar));
        if (jx$.ExternalSyntheticApiModelOutline3.m(drawableM)) {
            return new icm(jx$.ExternalSyntheticApiModelOutline3.m(drawableM));
        }
        throw new java.io.IOException("Received unexpected drawable type for animated image, failing: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(drawableM))));
    }

    public static final boolean p(com.bumptech.glide.load.ImageHeaderParser.ImageType imageType) {
        if (imageType != com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return android.os.Build.VERSION.SDK_INT >= 31 && imageType == com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public final void G(defpackage.gkc gkcVar, int i) {
        ((ajer) this.b).e(new fpf((fku) this.a, gkcVar, false, i));
    }

    public final void H(defpackage.gkc gkcVar, defpackage.dbd dbdVar) {
        ((ajer) this.b).e(new ae(this, gkcVar, dbdVar, 12));
    }

    public final void a(kqb kqbVar) {
        defpackage.mkp.a.d.execute(new defpackage.kos(this, kqbVar, 6, null));
    }

    public final void b(j$.util.Optional optional, kqd kqdVar, kqc kqcVar) {
        if (!optional.isEmpty()) {
            a(new kpz(kqcVar, optional, kqdVar));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yox) this.b).h()).ai((char) 3370)).u("Database operation not completed, no CarInfoInternal provided.");
            kqdVar.a(false);
        }
    }

    public final void c() {
        com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView actionStripView = (com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView) this.a;
        actionStripView.setVisibility(8);
        actionStripView.clearAnimation();
    }

    public final void d(java.lang.Runnable runnable) {
        com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView actionStripView = (com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView) this.a;
        if (actionStripView.getVisibility() == 0) {
            return;
        }
        actionStripView.setVisibility(0);
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation((android.content.Context) this.b, 2130771980);
        animationLoadAnimation.setAnimationListener(new kcs(runnable));
        actionStripView.setAnimation(animationLoadAnimation);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean e(int i) {
        java.lang.Boolean bool = (java.lang.Boolean) this.b.get(java.lang.Integer.valueOf(i));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized java.util.List f(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            java.util.List<defpackage.kez> list = (java.util.List) this.b.get((java.lang.String) it.next());
            if (list != null) {
                for (defpackage.kez kezVar : list) {
                    if (kezVar.c(cls, cls2)) {
                        arrayList.add(kezVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized java.util.List g(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            java.util.List<defpackage.kez> list = (java.util.List) this.b.get((java.lang.String) it.next());
            if (list != null) {
                for (defpackage.kez kezVar : list) {
                    if (kezVar.c(cls, cls2)) {
                        java.lang.Object obj = kezVar.a;
                        if (arrayList.contains(obj)) {
                            continue;
                        } else {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void h(java.lang.String str, huy huyVar, java.lang.Class cls, java.lang.Class cls2) {
        I(str).add(new defpackage.kez(cls, cls2, huyVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized void i(java.util.List list) {
        ?? r1 = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) r1);
        r1.clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r1.add((java.lang.String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str = (java.lang.String) arrayList.get(i);
            if (!list.contains(str)) {
                r1.add(str);
            }
        }
    }

    public final synchronized void j(huy huyVar, java.lang.Class cls, java.lang.Class cls2) {
        I("legacy_prepend_all").add(0, new defpackage.kez(cls, cls2, huyVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [idu, java.lang.Object] */
    public final htb k(android.content.Context context, hsc hscVar, defpackage.epy epyVar, boolean z) {
        defpackage.igg.f();
        defpackage.igg.f();
        ?? r0 = this.b;
        htb htbVar = (htb) r0.get(epyVar);
        if (htbVar != null) {
            return htbVar;
        }
        com.bumptech.glide.manager.LifecycleLifecycle lifecycleLifecycle = new com.bumptech.glide.manager.LifecycleLifecycle(epyVar);
        htb htbVarA = this.a.a(hscVar, lifecycleLifecycle, new ids(), context);
        r0.put(epyVar, htbVarA);
        lifecycleLifecycle.a(new idr(this, epyVar));
        if (!z) {
            return htbVarA;
        }
        htbVarA.k();
        return htbVarA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hxn, java.lang.Object] */
    public final void l(android.graphics.Bitmap bitmap) {
        this.a.d(bitmap);
    }

    public final void m(byte[] bArr) {
        java.lang.Object obj = this.b;
        if (obj == null) {
            return;
        }
        ((hxu) obj).c(bArr);
    }

    public final byte[] n(int i) {
        java.lang.Object obj = this.b;
        return obj == null ? new byte[i] : (byte[]) ((hxu) obj).a(i, byte[].class);
    }

    public final synchronized java.util.List q(java.lang.Class cls) {
        return ((hzv) this.b).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final synchronized java.util.List r(java.lang.Class cls) {
        java.lang.Object obj;
        ?? r1;
        ?? r0 = ((defpackage.htw) this.a).a;
        defpackage.gmz gmzVar = (defpackage.gmz) r0.get(cls);
        if (gmzVar == null) {
            r1 = 0;
        } else {
            obj = gmzVar.a;
        }
        if (r1 != 0) {
            return r1;
        }
        r1 = obj;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((hzv) this.b).b(cls));
        if (((defpackage.gmz) r0.put(cls, new defpackage.gmz(listUnmodifiableList, (byte[]) null))) == null) {
            return listUnmodifiableList;
        }
        throw new java.lang.IllegalStateException("Already cached loaders for model: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(cls))));
    }

    public final synchronized void s(java.lang.Class cls, java.lang.Class cls2, hzr hzrVar) {
        ((hzv) this.b).d(cls, cls2, hzrVar);
        ((defpackage.htw) this.a).i();
    }

    public final synchronized void t(java.lang.Class cls, java.lang.Class cls2, hzr hzrVar) {
        ((hzv) this.b).e(cls, cls2, hzrVar);
        ((defpackage.htw) this.a).i();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [dzr, java.lang.Object] */
    public final java.lang.String u(hus husVar) {
        java.lang.String str;
        java.lang.Object obj = this.b;
        synchronized (obj) {
            str = (java.lang.String) ((igc) obj).f(husVar);
        }
        if (str == null) {
            hyj hyjVar = (hyj) this.a.a();
            try {
                java.security.MessageDigest messageDigest = hyjVar.a;
                husVar.a(messageDigest);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = defpackage.igg.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i + i;
                        char[] cArr2 = defpackage.igg.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new java.lang.String(cArr);
                }
                this.a.b(hyjVar);
            } catch (java.lang.Throwable th) {
                this.a.b(hyjVar);
                throw th;
            }
        }
        java.lang.Object obj2 = this.b;
        synchronized (obj2) {
            ((igc) obj2).g(husVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Queue] */
    public final void v(java.lang.String str) {
        ajku ajkuVar;
        synchronized (this) {
            ?? r1 = this.b;
            ajkuVar = (ajku) r1.get(str);
            defpackage.a.ak(ajkuVar, "Argument must not be null");
            int i = ajkuVar.a;
            if (i <= 0) {
                throw new java.lang.IllegalStateException(defpackage.a.by(i, str, "Cannot release a lock that is not held, safeKey: ", ", interestedThreads: "));
            }
            int i2 = i - 1;
            ajkuVar.a = i2;
            if (i2 == 0) {
                ajku ajkuVar2 = (ajku) r1.remove(str);
                if (!ajkuVar2.equals(ajkuVar)) {
                    throw new java.lang.IllegalStateException("Removed the wrong lock, expected to remove: " + ajkuVar.toString() + ", but actually removed: " + java.lang.String.valueOf(ajkuVar2) + ", safeKey: " + str);
                }
                ?? r6 = ((defpackage.htw) this.a).a;
                synchronized (r6) {
                    if (r6.size() < 10) {
                        r6.offer(ajkuVar2);
                    }
                }
            }
        }
        ajkuVar.b.unlock();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ajaj, java.lang.Object] */
    public final void w() {
        this.a.c(new hjy(3, ""));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r8 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.Object r6, defpackage.affc r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof gix
            if (r0 == 0) goto L13
            r0 = r8
            gix r0 = (gix) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            gix r0 = new gix
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            gjs r6 = r0.c
            defpackage.afga.cz(r8)
            goto L6e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            gjs r6 = r0.c
            defpackage.afga.cz(r8)
            goto L5b
        L3a:
            defpackage.afga.cz(r8)
            java.lang.Object r8 = r5.a
            aab r8 = (defpackage.aab) r8
            java.lang.Object r8 = r8.b(r6)
            if (r8 == 0) goto L48
            return r8
        L48:
            giy r8 = new giy
            r2 = 0
            r8.<init>(r5, r6, r7, r2)
            r7 = r6
            gjs r7 = (gjs) r7
            r0.c = r7
            r0.b = r4
            java.lang.Object r8 = ahoi.a(r8, r0)
            if (r8 == r1) goto L76
        L5b:
            r8.getClass()
            aivc r8 = (aivc) r8
            r7 = r6
            gjs r7 = (gjs) r7
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L6e
            goto L76
        L6e:
            java.lang.Object r5 = r5.b
            j$.util.concurrent.ConcurrentHashMap r5 = (j$.util.concurrent.ConcurrentHashMap) r5
            r5.remove(r6)
            return r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.x(java.lang.Object, affc, afdk):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajaj, java.lang.Object] */
    public final void y() {
        this.a.c(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajaj, java.lang.Object] */
    public final void z() {
        this.a.c(java.lang.Boolean.FALSE);
    }

    public kqe(java.lang.Class cls, huj hujVar) {
        this.b = cls;
        this.a = hujVar;
    }

    public kqe(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public kqe(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public kqe(defpackage.cit citVar, defpackage.afer aferVar) {
        citVar.getClass();
        this.b = citVar;
        this.a = aferVar;
    }

    public kqe(fku fkuVar, ajer ajerVar) {
        fkuVar.getClass();
        ajerVar.getClass();
        this.a = fkuVar;
        this.b = ajerVar;
    }

    public kqe(fvh fvhVar) {
        this.a = fvhVar;
        tb tbVar = new tb();
        tbVar.e("unused");
        tbVar.d(new gei(this, 1));
        this.b = tbVar.a();
    }

    public kqe(char[] cArr) {
        this.b = new java.util.concurrent.atomic.AtomicReference();
        this.a = new defpackage.zd();
    }

    public kqe(defpackage.eqg eqgVar, ajnd ajndVar, defpackage.kof kofVar) {
        knj knjVar = new knj(eqgVar, new knx(ajndVar, kofVar));
        this.b = new knk(this);
        this.a = knjVar;
    }

    public kqe(java.lang.String str, java.lang.String str2, byte[] bArr, byte[] bArr2) {
        str2.getClass();
        this.b = str;
        this.a = str2;
    }

    public kqe(android.content.Context context) {
        this.b = defpackage.yqm.c("GH.CONN.LD.DbMediator");
        this.a = context;
    }

    public kqe(java.lang.String str, java.lang.String str2, byte[] bArr) {
        str.getClass();
        this.b = str;
        this.a = str2;
    }

    public kqe(byte[] bArr) {
        this.a = new java.util.ArrayList();
        this.b = new java.util.HashMap();
    }

    public kqe(defpackage.csr csrVar) {
        csrVar.getClass();
        this.a = csrVar;
        this.b = getClass().getName() + "-" + csrVar;
    }

    public kqe(ajjc ajjcVar, fsu fsuVar) {
        this.a = ajjcVar;
        this.b = fsuVar;
    }

    public kqe(short[] sArr, byte[] bArr) {
        ajaj ajajVarD = ajap.d(0, 1, 2);
        this.a = ajajVarD;
        this.b = ajajVarD;
    }

    public kqe(gfa gfaVar, long j) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        gem gemVar = new gem(gfaVar, j);
        this.b = new gev(gfaVar, gemVar, handler);
        this.a = new android.view.GestureDetector(gfaVar, gemVar, handler);
    }

    public kqe(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new defpackage.aab(16);
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }

    public kqe(char[] cArr, byte[] bArr) {
        ajaj ajajVarD = ajap.d(0, 1, 2);
        this.a = ajajVarD;
        this.b = ajajVarD;
    }

    public kqe(hdw hdwVar) {
        hrp hrpVar = new hrp();
        this.a = hdwVar;
        this.b = hrpVar;
    }

    public kqe(byte[] bArr, byte[] bArr2) {
        this.b = new java.util.HashMap();
        this.a = new defpackage.htw((byte[]) null);
    }

    public kqe(short[] sArr) {
        this.b = new igc(1000L);
        this.a = ign.a(10, new hyi(0));
    }

    public kqe(defpackage.dzr dzrVar) {
        hzv hzvVar = new hzv(dzrVar);
        this.a = new defpackage.htw((byte[]) null, (byte[]) null, (byte[]) null);
        this.b = hzvVar;
    }

    public kqe(idu iduVar) {
        this.b = new java.util.HashMap();
        this.a = iduVar;
    }
}
