package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class unw implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public unw(defpackage.adzf adzfVar, adzb adzbVar, defpackage.adzg adzgVar, int i) {
        this.d = i;
        this.c = adzbVar;
        this.b = adzgVar;
        this.a = adzfVar;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0247  */
    /* JADX WARN: Code duplicated, block: B:78:0x0256  */
    /* JADX WARN: Code duplicated, block: B:81:0x025f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0267  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, vav] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, vav] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r13v86, types: [aduj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, vjm] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aclm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ulj] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, xzi] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zS;
        boolean zS2;
        int iAs;
        aagl aaglVar;
        java.lang.String str;
        boolean z = true;
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                vbn.d();
                java.lang.Object obj = this.c;
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = ((usd) this.a).a;
                synchronized (((unz) obj3).b) {
                    ((unz) obj3).l((uot) obj2, (pxn) obj);
                    break;
                }
                return;
            case 1:
                defpackage.ypg ypgVar = unz.a;
                uot uotVar = (uot) this.a;
                upp uppVar = uotVar.c;
                if (uppVar != null) {
                    uppVar.a(uotVar.b, (upo) this.b, (ulj) this.c);
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj4 = this.b;
                uon uonVar = (uon) this.c;
                defpackage.yjm yjmVar = uonVar.e;
                synchronized (yjmVar) {
                    zS = yjmVar.s(obj4);
                    break;
                }
                defpackage.yjm yjmVar2 = uonVar.f;
                synchronized (yjmVar2) {
                    zS2 = yjmVar2.s(obj4);
                    break;
                }
                if (((uqw) this.a).l()) {
                    return;
                }
                if (zS || zS2) {
                    ((defpackage.ype) ((defpackage.ype) uon.a.h()).ai((char) 9492)).u("(non-prefetch) Style table fetching incomplete after 60s");
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                usi usiVar = (usi) this.c;
                ttb ttbVarA = usiVar.a();
                usiVar.c();
                zrv zrvVar = (zrv) this.b;
                zry zryVar = zrvVar.c;
                if (zryVar == null) {
                    zryVar = zry.a;
                }
                defpackage.kez kezVar = (defpackage.kez) this.a;
                if (!((java.lang.Boolean) kezVar.c.fF()).booleanValue() || (iAs = defpackage.a.as(zryVar.d)) == 0 || iAs != 2) {
                    int iAs2 = defpackage.a.as(zryVar.b);
                    int i = iAs2 != 0 ? iAs2 : 1;
                    if (i != 4 && i != 2) {
                        zrz zrzVar = zryVar.c;
                        if (zrzVar == null) {
                            zrzVar = zrz.a;
                        }
                        int i2 = zrzVar.b;
                    }
                }
                ttc ttcVar = new ttc();
                ttcVar.a();
                ttcVar.b();
                int i3 = zrvVar.d;
                ((java.lang.Boolean) kezVar.b.fF()).booleanValue();
                ttcVar.b();
                if ((zrvVar.b & 4) != 0) {
                    long j = zrvVar.e;
                }
                ttcVar.a();
                if (ttcVar.a != 3) {
                    throw new java.lang.IllegalStateException();
                }
                ttbVarA.a();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                if (((defpackage.htw) this.b).a.a() == 0) {
                    ((android.content.Context) ((defpackage.kez) this.a).c).registerReceiver((android.content.BroadcastReceiver) this.c, new android.content.IntentFilter("android.intent.action.LOCALE_CHANGED"));
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (((defpackage.htw) this.b).a.a() == 0) {
                    ((android.content.Context) ((defpackage.kez) this.a).c).unregisterReceiver((android.content.BroadcastReceiver) this.c);
                    return;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.vze) this.a).a(this.b, (defpackage.zhk) this.c);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((wis) this.a).h((aclz) this.b, (wij) this.c);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((wis) this.c).f((abym) this.b, (wjb) this.a);
                return;
            case 9:
                int lineCount = ((android.widget.TextView) this.a).getLineCount();
                java.lang.Object obj5 = this.c;
                if (lineCount <= 3) {
                    ((android.view.ViewGroup) obj5).findViewById(2131427924).setVisibility(8);
                    return;
                } else {
                    ((xcq) this.b).g((android.view.View) obj5);
                    return;
                }
            case 10:
                zju zjuVar = (zju) this.c;
                java.util.Iterator it = zjuVar.b.iterator();
                while (it.hasNext()) {
                    ((defpackage.zhs) it.next()).cancel(true);
                }
                defpackage.adrq adrqVar = zjuVar.i;
                if (adrqVar != null) {
                    adrqVar.i((java.lang.String) this.a, (java.lang.Throwable) this.b);
                    return;
                }
                return;
            case 11:
                java.lang.Object obj6 = this.c;
                zjq zjqVar = (zjq) obj6;
                boolean z2 = zjqVar.a;
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = this.b;
                if (z2) {
                    return;
                }
                try {
                    ((zjq) obj6).c.a((defpackage.ador) obj8, (defpackage.adnd) obj7);
                    return;
                } finally {
                    zjqVar.a = true;
                    zjqVar.b.g.a();
                }
            case 12:
                ((zka) this.c).a.a((defpackage.ador) this.b, (defpackage.adnd) this.a);
                return;
            case 13:
                ((zwi) this.b).g.b((android.graphics.Bitmap) this.c, (vjm) this.a, false);
                return;
            case 14:
                java.lang.Object obj9 = this.a;
                ((aaif) obj9).b.a();
                java.lang.Object obj10 = this.b;
                zlv.n(obj10, "StreetViewMetadataProtoRequest");
                java.lang.Object obj11 = this.c;
                zlv.n(obj11, "StreetViewPanoTarget");
                synchronized (obj9) {
                    if (!((aaif) obj9).c && defpackage.a.B(((aaif) obj9).e, obj10)) {
                        ((aaif) obj9).e = null;
                        aagf aagfVar = ((aaif) obj9).d;
                        if (aagfVar != null) {
                            java.lang.String str2 = aaif.a;
                            if (zsr.e(str2, 4)) {
                                android.util.Log.i(str2, java.lang.String.format("Metadata request finished [%s] => [%s]", obj10, obj11));
                            }
                            aagf aagfVar2 = aagfVar;
                            aagfVar2.k.a();
                            java.lang.String str3 = aagf.b;
                            if (zsr.e(str3, 4)) {
                                android.util.Log.i(str3, java.lang.String.format("onPanoramaRequestFinished(%s)", obj11));
                            }
                            aahl aahlVar = (aahl) obj11;
                            if (aahlVar.i()) {
                                if (zsr.e(str3, 6)) {
                                    android.util.Log.e(str3, java.lang.String.format("Failed to load pano for %s", aagfVar2.v));
                                }
                                aaho aahoVar = aagfVar2.v;
                                if (aahoVar == null || !aahoVar.c) {
                                    aaglVar = aagfVar2.i;
                                    aaglVar.c.a();
                                    str = aagl.a;
                                    if (zsr.e(str, 4)) {
                                        android.util.Log.i(str, "goToPanoNullTarget()");
                                    }
                                    if (aaglVar.g) {
                                        new aaho(aahl.a);
                                    } else {
                                        aaglVar.e(new aaho(aaglVar.m));
                                    }
                                } else {
                                    aahl aahlVar2 = aahoVar.b;
                                    if (aahlVar2.i()) {
                                        aaglVar = aagfVar2.i;
                                        aaglVar.c.a();
                                        str = aagl.a;
                                        if (zsr.e(str, 4)) {
                                            android.util.Log.i(str, "goToPanoNullTarget()");
                                        }
                                        if (aaglVar.g) {
                                            new aaho(aahl.a);
                                        } else {
                                            aaglVar.e(new aaho(aaglVar.m));
                                        }
                                    } else {
                                        aagfVar2.i.b(aahlVar2.b, (com.google.android.libraries.maps.model.StreetViewPanoramaCamera) null, false).g(aahlVar2);
                                    }
                                }
                            } else {
                                aaho aahoVar2 = aagfVar2.v;
                                if (aahoVar2 == null || !aahoVar2.g(aahlVar)) {
                                    if (zsr.e(str3, 4)) {
                                        android.util.Log.i(str3, java.lang.String.format("Unexpected: %s vs %s", aahlVar.b, aagfVar2.v));
                                    }
                                    aagfVar2.i.b(aahlVar.b, (com.google.android.libraries.maps.model.StreetViewPanoramaCamera) null, false).g(aahlVar);
                                }
                            }
                            aagfVar2.v = null;
                            aagfVar2.i.run();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 15:
                ((adud) this.b).g.b((defpackage.adrq) this.c, (defpackage.adnd) this.a);
                return;
            case 16:
                java.lang.Object obj12 = this.b;
                aduc aducVar = (aduc) obj12;
                defpackage.ador adorVar = aducVar.b;
                java.lang.Object adndVar = this.c;
                java.lang.Object obj13 = this.a;
                if (adorVar != null) {
                    defpackage.ador adorVar2 = aducVar.b;
                    adndVar = new defpackage.adnd();
                    obj13 = adorVar2;
                }
                try {
                    ((aduc) obj12).d.a((defpackage.ador) obj13, (defpackage.adnd) adndVar);
                    return;
                } catch (java.lang.RuntimeException e) {
                    adud.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.DelayedClientCall$DelayedListener$3", "run", "Exception thrown by onClose() in ClientCall", (java.lang.Throwable) e);
                    return;
                }
            case 17:
                defpackage.advv advvVar = (defpackage.advv) this.b;
                defpackage.advx advxVar = advvVar.c;
                if (advxVar.p.a == defpackage.adkh.e) {
                    return;
                }
                adtt adttVar = advxVar.o;
                adtt adttVar2 = advvVar.a;
                if (adttVar == adttVar2) {
                    advxVar.o = null;
                    defpackage.advu advuVar = advxVar.h;
                    advuVar.c();
                    advxVar.b(defpackage.adkh.d);
                    defpackage.aeaz aeazVar = advxVar.s;
                    java.lang.String str4 = advxVar.t;
                    java.lang.String strG = defpackage.advv.g(advuVar.a());
                    java.lang.String strF = defpackage.advv.f(advuVar.a(), defpackage.adkw.b);
                    java.lang.String strA = this.a.a();
                    java.lang.String strE = defpackage.advv.e((defpackage.adof) advuVar.a().a(defpackage.adva.a));
                    defpackage.adnz adnzVar = defpackage.aeaz.b;
                    defpackage.ygw ygwVarQ = defpackage.ygw.q(str4);
                    defpackage.ygw ygwVarS = defpackage.ygw.s(strG, strF, strA);
                    adni adniVar = aeazVar.a;
                    adniVar.a(adnzVar, ygwVarQ, ygwVarS);
                    adniVar.b(defpackage.aeaz.e, defpackage.ygw.q(str4), defpackage.ygw.s(strE, strG, strF));
                    return;
                }
                if (advxVar.n == adttVar2) {
                    defpackage.aeaz aeazVar2 = advxVar.s;
                    java.lang.String str5 = advxVar.t;
                    defpackage.advu advuVar2 = advxVar.h;
                    aeazVar2.a.a(defpackage.aeaz.d, defpackage.ygw.q(str5), defpackage.ygw.r(defpackage.advv.g(advuVar2.a()), defpackage.advv.f(advuVar2.a(), defpackage.adkw.b)));
                    defpackage.ysr.bn(advxVar.p.a == defpackage.adkh.a, "Expected state is CONNECTING, actual state is %s", advxVar.p.a);
                    defpackage.adkw adkwVar = (defpackage.adkw) advuVar2.c.get(advuVar2.a);
                    int i4 = advuVar2.b + 1;
                    advuVar2.b = i4;
                    if (i4 >= adkwVar.e.size()) {
                        advuVar2.a++;
                        advuVar2.b = 0;
                    }
                    if (advuVar2.a < advuVar2.c.size()) {
                        advxVar.h();
                        return;
                    }
                    advxVar.n = null;
                    advuVar2.c();
                    java.lang.Object obj14 = this.c;
                    defpackage.adox adoxVar = advxVar.g;
                    adoxVar.c();
                    defpackage.ador adorVar3 = (defpackage.ador) obj14;
                    defpackage.ysr.aY(!adorVar3.g(), "The error status must not be OK");
                    advxVar.c(new defpackage.adki(defpackage.adkh.c, adorVar3));
                    if (advxVar.e) {
                        return;
                    }
                    if (advxVar.u == null) {
                        advxVar.u = new defpackage.adup();
                    }
                    long jA = advxVar.u.a() - advxVar.j.a(java.util.concurrent.TimeUnit.NANOSECONDS);
                    advxVar.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", defpackage.advx.k(adorVar3), java.lang.Long.valueOf(jA));
                    defpackage.ysr.bk(advxVar.v == null, "previous reconnectTask is not done");
                    advxVar.v = adoxVar.d(new defpackage.adug(advxVar, 4), jA, java.util.concurrent.TimeUnit.NANOSECONDS, advxVar.b);
                    return;
                }
                return;
            default:
                java.lang.Object obj15 = this.c;
                synchronized (((adzb) obj15).a) {
                    if (((adzb) obj15).c) {
                        return;
                    }
                    ((adzb) obj15).a();
                    ((defpackage.adzf) this.a).b.g.execute(new defpackage.adwr(this, this.b, 5, null));
                    return;
                }
        }
    }

    public /* synthetic */ unw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ unw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ unw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public unw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int[] iArr) {
        this.d = i;
        this.a = obj2;
        this.c = obj3;
        this.b = obj;
    }

    public /* synthetic */ unw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ unw(defpackage.kez kezVar, usi usiVar, zrv zrvVar, int i) {
        this.d = i;
        this.a = kezVar;
        this.c = usiVar;
        this.b = zrvVar;
    }

    public /* synthetic */ unw(zju zjuVar, java.lang.String str, java.lang.Throwable th, int i) {
        this.d = i;
        this.c = zjuVar;
        this.a = str;
        this.b = th;
    }
}
