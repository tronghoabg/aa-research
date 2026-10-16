package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class advx implements adln {
    private final defpackage.adsx A;
    private final adni B;
    public final defpackage.advt a;
    public final java.util.concurrent.ScheduledExecutorService b;
    public final defpackage.adlk c;
    public final defpackage.adjy d;
    public final boolean e;
    public final java.util.List f;
    public final defpackage.adox g;
    public final defpackage.advu h;
    public volatile java.util.List i;
    public final defpackage.xzg j;
    public adxj k;
    public adtt n;
    public volatile adxj o;
    public defpackage.ador q;
    public volatile defpackage.adjs r;
    public final defpackage.aeaz s;
    public final java.lang.String t;
    public defpackage.adup u;
    public defpackage.aecg v;
    public defpackage.aecg w;
    private final defpackage.adlo x;
    private final java.lang.String y;
    private final adtn z;
    public final java.util.Collection l = new java.util.ArrayList();
    public final defpackage.advk m = new defpackage.advp(this);
    public volatile defpackage.adki p = defpackage.adki.a(defpackage.adkh.d);

    public advx(defpackage.adly adlyVar, java.lang.String str, adtn adtnVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.adox adoxVar, defpackage.advt advtVar, defpackage.adlk adlkVar, defpackage.adsx adsxVar, defpackage.adlo adloVar, defpackage.adjy adjyVar, java.util.List list, java.lang.String str2, adni adniVar) {
        java.lang.Object obj;
        java.util.List list2 = adlyVar.a;
        defpackage.ysr.aY(!list2.isEmpty(), "addressGroups is empty");
        j(list2);
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list2));
        this.i = listUnmodifiableList;
        this.h = new defpackage.advu(listUnmodifiableList);
        this.y = str;
        this.z = adtnVar;
        this.b = scheduledExecutorService;
        this.j = new defpackage.xzg();
        this.g = adoxVar;
        this.B = adniVar;
        this.a = advtVar;
        this.c = adlkVar;
        this.A = adsxVar;
        this.x = adloVar;
        this.d = adjyVar;
        this.f = list;
        defpackage.adlx adlxVar = defpackage.admj.c;
        int i = 0;
        while (true) {
            java.lang.Object[][] objArr = adlyVar.c;
            if (i >= objArr.length) {
                obj = adlxVar.a;
                break;
            } else {
                if (adlxVar.equals(objArr[i][0])) {
                    obj = adlyVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.e = ((java.lang.Boolean) obj).booleanValue();
        this.t = str2;
        this.s = new defpackage.aeaz(adniVar);
    }

    public static void j(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final java.lang.String k(defpackage.ador adorVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(adorVar.p);
        java.lang.String str = adorVar.q;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        java.lang.Throwable th = adorVar.r;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    public final adtl a() {
        adxj adxjVar = this.o;
        if (adxjVar != null) {
            return adxjVar;
        }
        this.g.execute(new defpackage.adug(this, 5));
        return null;
    }

    public final void b(defpackage.adkh adkhVar) {
        this.g.c();
        c(defpackage.adki.a(adkhVar));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [admi, java.lang.Object] */
    public final void c(defpackage.adki adkiVar) {
        this.g.c();
        defpackage.adkh adkhVar = this.p.a;
        defpackage.adkh adkhVar2 = adkiVar.a;
        if (adkhVar != adkhVar2) {
            defpackage.ysr.bn(this.p.a != defpackage.adkh.e, "Cannot transition out of SHUTDOWN to %s", adkhVar2);
            if (this.e && adkhVar2 == defpackage.adkh.c) {
                this.p = defpackage.adki.a(defpackage.adkh.d);
            } else {
                this.p = adkiVar;
            }
            this.a.a.a(adkiVar);
        }
    }

    public final void d() {
        this.g.execute(new defpackage.adug(this, 7));
    }

    public final defpackage.adlo e() {
        return this.x;
    }

    public final void f(adtt adttVar, boolean z) {
        this.g.execute(new defpackage.lvu(this, adttVar, z, 5));
    }

    public final void g(defpackage.ador adorVar) {
        this.g.execute(new defpackage.aafx(this, adorVar, 20, (byte[]) null));
    }

    public final void h() {
        adlf adlfVar;
        defpackage.adox adoxVar = this.g;
        adoxVar.c();
        defpackage.ysr.bk(this.v == null, "Should have no reconnectTask scheduled");
        defpackage.advu advuVar = this.h;
        if (advuVar.a == 0 && advuVar.b == 0) {
            defpackage.xzg xzgVar = this.j;
            xzgVar.d();
            xzgVar.e();
        }
        java.net.SocketAddress socketAddressB = advuVar.b();
        if (socketAddressB instanceof adlf) {
            adlf adlfVar2 = (adlf) socketAddressB;
            adlfVar = adlfVar2;
            socketAddressB = adlfVar2.b;
        } else {
            adlfVar = null;
        }
        defpackage.adjs adjsVarA = advuVar.a();
        java.lang.String str = (java.lang.String) adjsVarA.a(defpackage.adkw.a);
        defpackage.adtm adtmVar = new defpackage.adtm();
        if (str == null) {
            str = this.y;
        }
        str.getClass();
        adtmVar.a = str;
        adtmVar.b = adjsVarA;
        adtmVar.c = null;
        this.B.getClass();
        adtmVar.d = adlfVar;
        advw advwVar = new advw();
        advwVar.a = this.x;
        defpackage.advs advsVar = new defpackage.advs(this.z.a(socketAddressB, adtmVar, advwVar), this.A);
        advwVar.a = advsVar.e();
        defpackage.adlk.b(this.c.f, advsVar);
        this.n = advsVar;
        this.l.add(advsVar);
        java.lang.Runnable runnableC = advsVar.c(new defpackage.advv(this, advsVar));
        if (runnableC != null) {
            adoxVar.b(runnableC);
        }
        this.d.b(2, "Started transport {0}", advwVar.a);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.g("logId", this.x.a);
        xymVarBy.b("addressGroups", this.i);
        return xymVarBy.toString();
    }
}
