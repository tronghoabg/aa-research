package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aafx implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aafx(aduk adukVar, java.io.IOException iOException, int i) {
        this.c = i;
        this.b = adukVar;
        this.a = iOException;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [adke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [aeax, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [aaer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [aaer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [aaer, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        adxj adxjVar;
        int i = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                aafy aafyVar = (aafy) this.a;
                aafyVar.b.a((aaer) this.b, aafyVar.e);
                return;
            case 1:
                java.lang.Object obj = this.a;
                ((aaet) obj).b.a();
                ?? r10 = this.b;
                synchronized (obj) {
                    java.lang.String str = aaet.a;
                    if (zsr.e(str, 3)) {
                        android.util.Log.d(str, java.lang.String.format("onAnimationFinished(%s)", java.lang.Boolean.valueOf(((aaet) obj).d == r10)));
                    }
                    if (((aaet) obj).d == r10 && ((aaet) obj).e == 3) {
                        ((aaet) obj).d = null;
                        ((aaet) obj).e = 0;
                        r10.g(false);
                        return;
                    }
                    return;
                }
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                aafy aafyVar2 = (aafy) this.a;
                aafyVar2.b.a((aaer) this.b, aafyVar2.c);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                aaeq aaeqVar = ((aafy) this.a).j;
                if (aaeqVar != null) {
                    aaeqVar.A(((aaey) this.b).g);
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.adrm) this.a).b((defpackage.ador) this.b);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.adrm) this.a).b((defpackage.ador) this.b);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ador adorVar = (defpackage.ador) this.b;
                ((adud) this.a).g.i(adorVar.q, adorVar.r);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((adud) this.b).g.n(this.a);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((aduc) this.a).k((defpackage.adnd) this.b);
                return;
            case 9:
                ((aduc) this.b).l(this.a);
                return;
            case 10:
                ((defpackage.adui) this.a).f.h((adke) this.b);
                return;
            case 11:
                ((defpackage.adui) this.a).f.j((defpackage.adku) this.b);
                return;
            case 12:
                ((defpackage.adui) this.a).f.i((defpackage.adks) this.b);
                return;
            case 13:
                ((defpackage.adui) this.b).f.n((java.io.InputStream) this.a);
                return;
            case 14:
                ((defpackage.adui) this.a).f.c((defpackage.ador) this.b);
                return;
            case 15:
                ((defpackage.aduh) this.b).a.d((aeax) this.a);
                return;
            case 16:
                ((defpackage.aduh) this.a).a.c((defpackage.adnd) this.b);
                return;
            case 17:
                ((aduk) this.a).b.A((defpackage.adnq) this.b);
                return;
            case 18:
                java.util.List list = java.util.Collections.EMPTY_LIST;
                aduk adukVar = (aduk) this.b;
                adukVar.b.A(new defpackage.adnq(defpackage.adot.b(defpackage.ador.m.e("Unable to resolve host ".concat(java.lang.String.valueOf(adukVar.a.j))).d((java.lang.Throwable) this.a)), defpackage.adjs.a, null));
                return;
            case 19:
                ?? r0 = this.a;
                defpackage.advx advxVar = (defpackage.advx) this.b;
                defpackage.advu advuVar = advxVar.h;
                java.net.SocketAddress socketAddressB = advuVar.b();
                advuVar.c = r0;
                advuVar.c();
                advxVar.i = r0;
                defpackage.adkh adkhVar = advxVar.p.a;
                defpackage.adkh adkhVar2 = defpackage.adkh.b;
                if (adkhVar == adkhVar2 || advxVar.p.a == defpackage.adkh.a) {
                    while (true) {
                        if (i < advuVar.c.size()) {
                            int iIndexOf = ((defpackage.adkw) advuVar.c.get(i)).e.indexOf(socketAddressB);
                            if (iIndexOf == -1) {
                                i++;
                            } else {
                                advuVar.a = i;
                                advuVar.b = iIndexOf;
                            }
                        } else if (advxVar.p.a == adkhVar2) {
                            adxjVar = advxVar.o;
                            advxVar.o = null;
                            advuVar.c();
                            advxVar.b(defpackage.adkh.d);
                        } else {
                            advxVar.n.q(defpackage.ador.m.e("InternalSubchannel closed pending transport due to address change"));
                            advxVar.n = null;
                            advuVar.c();
                            advxVar.h();
                        }
                        adxjVar = null;
                    }
                } else {
                    adxjVar = null;
                }
                if (adxjVar != null) {
                    if (advxVar.w != null) {
                        advxVar.k.q(defpackage.ador.m.e("InternalSubchannel closed transport early due to address change"));
                        advxVar.w.h();
                        advxVar.w = null;
                    }
                    advxVar.k = adxjVar;
                    advxVar.w = advxVar.g.d(new defpackage.adug(this, 6), 5L, java.util.concurrent.TimeUnit.SECONDS, advxVar.b);
                    return;
                }
                return;
            default:
                defpackage.advx advxVar2 = (defpackage.advx) this.a;
                defpackage.adkh adkhVar3 = advxVar2.p.a;
                defpackage.adkh adkhVar4 = defpackage.adkh.e;
                if (adkhVar3 == adkhVar4) {
                    return;
                }
                defpackage.ador adorVar2 = (defpackage.ador) this.b;
                advxVar2.q = adorVar2;
                adxj adxjVar2 = advxVar2.o;
                adtt adttVar = advxVar2.n;
                advxVar2.o = null;
                advxVar2.n = null;
                advxVar2.b(adkhVar4);
                advxVar2.h.c();
                if (advxVar2.l.isEmpty()) {
                    advxVar2.d();
                }
                advxVar2.g.c();
                defpackage.aecg aecgVar = advxVar2.v;
                if (aecgVar != null) {
                    aecgVar.h();
                    advxVar2.v = null;
                    advxVar2.u = null;
                }
                defpackage.aecg aecgVar2 = advxVar2.w;
                if (aecgVar2 != null) {
                    aecgVar2.h();
                    advxVar2.k.q(adorVar2);
                    advxVar2.w = null;
                    advxVar2.k = null;
                }
                if (adxjVar2 != null) {
                    adxjVar2.q(adorVar2);
                }
                if (adttVar != null) {
                    adttVar.q(adorVar2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ aafx(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public aafx(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public aafx(java.lang.Object obj, java.lang.Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
