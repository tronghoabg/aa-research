package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbn implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ sbn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.e = i;
        this.b = obj;
        this.a = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, ulj] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, zhs] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, upp] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, ulj] */
    /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, zhs] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, upp] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zB;
        defpackage.xyn xynVarH;
        switch (this.e) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.c;
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl = ((sbo) this.d).a;
                carSetupServiceImpl.e((defpackage.zaj) obj3, (defpackage.zak) obj2, (java.lang.String) obj);
                carSetupServiceImpl.k();
                return;
            case 1:
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = this.d;
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.b;
                try {
                    ((defpackage.rwk) obj6).b((defpackage.qug) obj5, (java.nio.ByteBuffer) obj4);
                    break;
                } catch (java.io.IOException unused) {
                    defpackage.ypu ypuVarAi = defpackage.rwl.a.f().ai(8443);
                    defpackage.rwl rwlVar = (defpackage.rwl) obj7;
                    int i = rwlVar.h;
                    if (i == 0) {
                        throw null;
                    }
                    ypuVarAi.K("%s Could not write message %d", defpackage.ooa.m(i), ((defpackage.qug) obj5).f);
                    rwlVar.c.p(defpackage.zaj.CAR_SERVICE_CONNECTION_ERROR, defpackage.zak.WRITER_IO_ERROR, "Failed to write message");
                }
                synchronized (((defpackage.rwl) obj7).f) {
                    ((defpackage.rwl) obj7).g--;
                    break;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj8 = this.d;
                ?? r0 = this.c;
                java.lang.Object obj9 = this.a;
                try {
                    syx syxVarD = ((rko) this.b).d((java.util.List) r0);
                    ((syx) obj9).a |= syxVarD.a;
                    ((syx) obj9).b = syxVarD.b | ((syx) obj9).b;
                    if (zB) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    syx syxVar = (syx) obj9;
                    if (syxVar.b()) {
                        syxVar.a(((syw) obj8).b);
                    }
                }
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                tys tysVar = (tys) this.a;
                tysVar.V.f();
                if (!tysVar.A() || !tysVar.D()) {
                    tysVar.g.o((java.lang.Runnable) this.c, defpackage.zgt.INSTANCE);
                }
                tysVar.p.execute(new txg(this.b, this.d, 4));
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                tys tysVar2 = (tys) this.a;
                tysVar2.V.e();
                if (tysVar2.D()) {
                    this.c.run();
                }
                tysVar2.p.execute(new txg(this.b, this.d, 3));
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ?? r1 = this.d;
                this.c.a((ulk) this.a, (upo) this.b, (ulj) r1);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj10 = ((wij) this.a).c;
                java.lang.Object obj11 = this.d;
                ?? r3 = this.b;
                byte[] bArr = (byte[]) this.c;
                if (bArr.length == 0) {
                    ulk ulkVar = (ulk) obj11;
                    xynVarH = defpackage.xyn.h(new ujo(((unu) obj10).h(ulkVar).q(), unu.b, ulkVar, tpx.a));
                } else {
                    ulk ulkVar2 = (ulk) obj11;
                    unu unuVar = (unu) obj10;
                    pku pkuVarQ = unuVar.h(ulkVar2).q();
                    uos uosVar = unuVar.f;
                    abho abhoVar = unu.b;
                    ulp ulpVarA = uosVar.a(pkuVarQ, abhoVar, ulkVar2, bArr, tpx.b);
                    if (ulpVarA.a == ulo.d) {
                        unuVar.e(ulkVar2, (upp) r3, upo.c, (ulj) null);
                        unuVar.e.a(ulkVar2);
                        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("I/O error unpacking tile");
                        runtimeException.fillInStackTrace();
                        ((defpackage.ype) ((defpackage.ype) unu.a.a(uzo.a).p(runtimeException)).ai((char) 9457)).s();
                    }
                    xynVarH = ulpVarA.b;
                    if (!xynVarH.f()) {
                        ((defpackage.ype) ((defpackage.ype) unu.a.g()).ai(9456)).R("Tile not created for tileType=%s, coords=%s, result: %s", abhoVar.name(), obj11, ulpVarA);
                    }
                }
                if (xynVarH.f()) {
                    ?? B = xynVarH.b();
                    unu unuVar2 = (unu) obj10;
                    ulk ulkVar3 = (ulk) obj11;
                    unuVar2.d.g(ulkVar3, (ulj) B);
                    unuVar2.e.b(ulkVar3);
                    unuVar2.e(ulkVar3, (upp) r3, upo.a, (ulj) B);
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj12 = this.b;
                ((uon) this.a).u((java.lang.String) this.c, (uoi) this.d, true, (uqx) obj12);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ?? r2 = this.c;
                ((uon) this.d).i((uou) this.b, (uoo) this.a, (defpackage.zhs) r2);
                return;
            case 9:
                ((uon) this.d).p((uov) this.b, (defpackage.zhs) this.c, (uoo) this.a);
                return;
            case 10:
                java.lang.Object obj13 = this.c;
                java.lang.Object obj14 = this.a;
                java.lang.Object obj15 = this.b;
                java.lang.Object obj16 = this.d;
                try {
                    java.lang.String str = ((uov) obj14).d;
                    vbn.d();
                    int length = ((byte[]) obj13).length;
                    byte[] bArrA = uye.a((byte[]) obj13, length);
                    defpackage.abor aborVarN = pkr.a.n();
                    defpackage.abor aborVarN2 = pkq.a.n();
                    aborVarN2.t();
                    pkq pkqVar = aborVarN2.b;
                    pkqVar.c = 4;
                    pkqVar.b |= 1;
                    aborVarN2.t();
                    pkq pkqVar2 = aborVarN2.b;
                    str.getClass();
                    pkqVar2.b |= 2;
                    pkqVar2.d = str;
                    aborVarN.t();
                    pkr pkrVar = aborVarN.b;
                    pkq pkqVarQ = aborVarN2.q();
                    pkqVarQ.getClass();
                    pkrVar.c = pkqVarQ;
                    pkrVar.b = 1 | pkrVar.b;
                    long epochMilli = ((uqb) obj15).d.f().toEpochMilli() + uqb.b;
                    aborVarN.t();
                    pkr pkrVar2 = aborVarN.b;
                    pkrVar2.b |= 8;
                    pkrVar2.e = epochMilli;
                    aborVarN.t();
                    pkr pkrVar3 = aborVarN.b;
                    pkrVar3.b |= 16;
                    pkrVar3.f = length;
                    aborVarN.t();
                    pkr pkrVar4 = aborVarN.b;
                    pkrVar4.g = defpackage.adrq.x(4);
                    pkrVar4.b |= 32;
                    try {
                        ((uqb) obj15).c.h(aborVarN.q(), bArrA);
                        return;
                    } catch (java.io.IOException e) {
                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) uqb.a.g()).p(e)).ai(9580)).u("Failed to insert resource:");
                        ((uon) obj16).d();
                        return;
                    }
                } catch (java.io.IOException e2) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) uon.a.g()).p(e2)).ai((char) 9491)).u("Disk cache insertion for style data failed.");
                    return;
                }
            case 11:
                this.c.execute(new defpackage.unw(this.a, this.b, this.d, 6));
                return;
            case 12:
                ((defpackage.ype) ((defpackage.ype) wbo.a.a((java.util.logging.Level) this.b).p((java.lang.Throwable) this.a)).ai(9918)).Y((java.lang.String) this.d, (java.lang.Object[]) this.c);
                return;
            case 13:
                toe toeVar = (toe) this.a.fF();
                if (toeVar != null) {
                    java.lang.Object obj17 = this.d;
                    toeVar.c(zlv.u((zzf) this.c, (zco) this.b, ((android.app.Application) obj17).getPackageName()));
                    return;
                }
                return;
            default:
                toe toeVar2 = (toe) this.a.fF();
                if (toeVar2 != null) {
                    java.lang.Object obj18 = this.d;
                    toeVar2.c(zlv.u((zzf) this.c, (zco) this.b, ((android.app.Application) obj18).getPackageName()));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ sbn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public /* synthetic */ sbn(rko rkoVar, syx syxVar, java.util.List list, syw sywVar, int i) {
        this.e = i;
        this.b = rkoVar;
        this.a = syxVar;
        this.c = list;
        this.d = sywVar;
    }

    public sbn(sbo sboVar, defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str, int i) {
        this.e = i;
        this.a = zajVar;
        this.b = zakVar;
        this.c = str;
        this.d = sboVar;
    }

    public /* synthetic */ sbn(uon uonVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.e = i;
        this.d = uonVar;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ sbn(uon uonVar, java.lang.String str, uoi uoiVar, uqx uqxVar, int i) {
        this.e = i;
        this.a = uonVar;
        this.c = str;
        this.d = uoiVar;
        this.b = uqxVar;
    }

    public /* synthetic */ sbn(uon uonVar, uov uovVar, defpackage.zhs zhsVar, uoo uooVar, int i) {
        this.e = i;
        this.d = uonVar;
        this.b = uovVar;
        this.c = zhsVar;
        this.a = uooVar;
    }

    public /* synthetic */ sbn(upp uppVar, ulk ulkVar, upo upoVar, ulj uljVar, int i) {
        this.e = i;
        this.c = uppVar;
        this.a = ulkVar;
        this.b = upoVar;
        this.d = uljVar;
    }

    public /* synthetic */ sbn(defpackage.vze vzeVar, defpackage.aclm aclmVar, defpackage.zhk zhkVar, java.util.concurrent.Executor executor, int i) {
        this.e = i;
        this.a = vzeVar;
        this.b = aclmVar;
        this.d = zhkVar;
        this.c = executor;
    }

    public sbn(wij wijVar, ulk ulkVar, upp uppVar, byte[] bArr, int i) {
        this.e = i;
        this.d = ulkVar;
        this.b = uppVar;
        this.c = bArr;
        this.a = wijVar;
    }
}
