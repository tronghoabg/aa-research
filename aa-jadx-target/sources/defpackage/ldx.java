package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ldx {
    public final java.lang.Object a;

    public ldx(byte[] bArr) {
        java.util.List listU;
        int i = 0;
        if (defpackage.sqs.e()) {
            listU = defpackage.ygw.u(new defpackage.mhq(), new defpackage.mhs(), new defpackage.mht(), new defpackage.mhp(), new defpackage.mhr());
        } else {
            defpackage.mhs mhsVar = new defpackage.mhs();
            int i2 = defpackage.ygw.d;
            java.lang.Object[] objArr = {mhsVar};
            defpackage.ysr.B(objArr, 1);
            listU = new defpackage.ymx(objArr, 1);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int i3 = ((defpackage.ymx) listU).c;
        while (i < i3) {
            defpackage.mhm mhmVar = (defpackage.mhm) listU.get(i);
            mhmVar.a();
            i++;
            if (!hashSet.add(java.lang.Integer.valueOf(mhmVar.a()))) {
                throw new java.lang.IllegalArgumentException("Duplicate requirementId: " + mhmVar.a());
            }
        }
        this.a = listU;
    }

    public static defpackage.ldx a() {
        return (defpackage.ldx) defpackage.mkp.a.i(defpackage.ldx.class);
    }

    public static int l(defpackage.abpu abpuVar, java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.abon.a((defpackage.abrf) abpuVar.c, 1, obj) + defpackage.abon.a((defpackage.abrf) abpuVar.d, 2, obj2);
    }

    public static void m(defpackage.abof abofVar, defpackage.abpu abpuVar, java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
        defpackage.abon.f(abofVar, (defpackage.abrf) abpuVar.c, 1, obj);
        defpackage.abon.f(abofVar, (defpackage.abrf) abpuVar.d, 2, obj2);
    }

    public final void A() {
        synchronized (this) {
            ((defpackage.zo) this.a).f();
        }
    }

    public final void b(boolean z) {
        ((java.util.concurrent.atomic.AtomicBoolean) this.a).set(z);
    }

    public final boolean c() {
        return ((java.util.concurrent.atomic.AtomicBoolean) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.mhm d(int i) {
        defpackage.mhm mhmVar;
        int i2 = 0;
        do {
            ?? r1 = this.a;
            if (i2 >= ((defpackage.ymx) r1).c) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Invalid requirementId: "));
            }
            mhmVar = (defpackage.mhm) r1.get(i2);
            i2++;
        } while (mhmVar.a() != i);
        return mhmVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final boolean e() {
        int i = 0;
        while (true) {
            ?? r2 = this.a;
            if (i >= ((defpackage.ymx) r2).c) {
                return false;
            }
            defpackage.mhm mhmVar = (defpackage.mhm) r2.get(i);
            if (mhmVar.a() != 5 && mhmVar.d() && !mhmVar.e()) {
                return true;
            }
            i++;
        }
    }

    public final void f(int i, java.lang.Integer num, java.lang.Integer num2, int i2, java.lang.Integer num3) {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        defpackage.abor aborVarN2 = defpackage.zbi.a.n();
        aborVarN2.t();
        defpackage.zbi zbiVar = (defpackage.zbi) aborVarN2.b;
        zbiVar.b |= 1;
        zbiVar.c = i;
        if (num != null) {
            int iIntValue = num.intValue();
            aborVarN2.t();
            defpackage.zbi zbiVar2 = (defpackage.zbi) aborVarN2.b;
            zbiVar2.b |= 2;
            zbiVar2.d = iIntValue;
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            aborVarN2.t();
            defpackage.zbi zbiVar3 = (defpackage.zbi) aborVarN2.b;
            zbiVar3.b |= 4;
            zbiVar3.e = iIntValue2;
        }
        if (i2 != 0) {
            aborVarN2.t();
            defpackage.zbi zbiVar4 = (defpackage.zbi) aborVarN2.b;
            zbiVar4.b |= 8;
            zbiVar4.f = i2 - 1;
        }
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            aborVarN2.t();
            defpackage.zbi zbiVar5 = (defpackage.zbi) aborVarN2.b;
            zbiVar5.b |= 16;
            zbiVar5.g = iIntValue3;
        }
        java.lang.Object obj = this.a;
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        defpackage.zbi zbiVar6 = (defpackage.zbi) aborVarN2.q();
        zbiVar6.getClass();
        yygVar.H = zbiVar6;
        yygVar.c |= 64;
        defpackage.yyh yyhVar = defpackage.yyh.WIFI_SOCKET_CONNECT;
        int i3 = defpackage.ygw.d;
        ((defpackage.sbg) obj).f(aborVarN, yyhVar, defpackage.ymx.a);
    }

    public final int g() {
        long j = ((ajds) ((aitx) this.a).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final java.lang.Object h() {
        while (true) {
            aitx aitxVar = (aitx) this.a;
            ajds ajdsVar = (ajds) aitxVar.a;
            java.lang.Object objB = ajdsVar.b();
            if (objB != ajds.a) {
                return objB;
            }
            aitxVar.d(ajdsVar, ajdsVar.c());
        }
    }

    public final void i() {
        while (true) {
            aitx aitxVar = (aitx) this.a;
            ajds ajdsVar = (ajds) aitxVar.a;
            if (ajdsVar.d()) {
                return;
            } else {
                aitxVar.d(ajdsVar, ajdsVar.c());
            }
        }
    }

    public final boolean j(java.lang.Object obj) {
        while (true) {
            aitx aitxVar = (aitx) this.a;
            ajds ajdsVar = (ajds) aitxVar.a;
            int iA = ajdsVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            aitxVar.d(ajdsVar, ajdsVar.c());
        }
    }

    public final aitx k(int i) {
        return ((aitx[]) this.a)[i];
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void n(defpackage.rrw rrwVar, int i) {
        int iIntValue = 0;
        defpackage.ysr.aY(i >= 0, "negative addedCount is forbidden for batched events");
        defpackage.ysr.aY(true ^ rrwVar.x.f(), "eventCount field is forbidden for batched events");
        if (i == 0) {
            return;
        }
        ?? r4 = this.a;
        synchronized (r4) {
            java.lang.Integer num = (java.lang.Integer) r4.get(rrwVar);
            if (num != null) {
                iIntValue = num.intValue();
            }
            r4.put(rrwVar, java.lang.Integer.valueOf(iIntValue + i));
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void o(defpackage.jfo jfoVar) {
        ?? r4 = this.a;
        synchronized (r4) {
            for (java.util.Map.Entry entry : r4.entrySet()) {
                defpackage.rrv rrvVar = new defpackage.rrv((defpackage.rrw) entry.getKey());
                rrvVar.w(((java.lang.Integer) entry.getValue()).intValue());
                jfoVar.b(rrvVar.l());
            }
            r4.clear();
        }
    }

    public final synchronized void p(int i) {
        java.lang.Object obj = this.a;
        java.lang.Integer num = (java.lang.Integer) ((android.util.SparseArray) obj).get(i);
        ((android.util.SparseArray) obj).put(i, java.lang.Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
    }

    public final synchronized void q(defpackage.jfo jfoVar) {
        int i = 0;
        while (true) {
            java.lang.Object obj = this.a;
            if (i < ((android.util.SparseArray) obj).size()) {
                int iKeyAt = ((android.util.SparseArray) obj).keyAt(i);
                int iIntValue = ((java.lang.Integer) ((android.util.SparseArray) obj).valueAt(i)).intValue();
                if (iIntValue > 0) {
                    defpackage.zbd zbdVar = (defpackage.zbd) defpackage.jex.b.get(java.lang.Integer.valueOf(iKeyAt));
                    zbdVar.getClass();
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_SENSOR, zbdVar);
                    rrvVarH.w(iIntValue);
                    jfoVar.b((defpackage.rrw) rrvVarH.l());
                }
                i++;
            } else {
                ((android.util.SparseArray) obj).clear();
            }
        }
    }

    public final defpackage.jhl r() {
        defpackage.ing ingVar = (defpackage.ing) this.a;
        if (ingVar.isEmpty()) {
            return null;
        }
        return (defpackage.jhl) ingVar.peek();
    }

    public final defpackage.jhl s(defpackage.inf infVar) {
        defpackage.jhl jhlVar;
        do {
            defpackage.ing ingVar = (defpackage.ing) this.a;
            if (ingVar.isEmpty()) {
                return null;
            }
            jhlVar = (defpackage.jhl) ingVar.pop();
        } while (!infVar.a(jhlVar));
        return jhlVar;
    }

    public final void t(defpackage.jhl jhlVar) {
        ((defpackage.ing) this.a).push(jhlVar);
    }

    public final void u(defpackage.jhl jhlVar) {
        ((defpackage.ing) this.a).remove(jhlVar);
    }

    public final boolean v(defpackage.jhl jhlVar) {
        return jhlVar == r();
    }

    public final int w() {
        return ((java.util.concurrent.atomic.AtomicInteger) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void x() {
        ?? r2 = this.a;
        int size = r2.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.czl) ((defpackage.izq) ((java.util.ArrayList) r2).get(size)).a).e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r7 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.dhy r6, defpackage.afdk r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dhm
            if (r0 == 0) goto L13
            r0 = r7
            dhm r0 = (defpackage.dhm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhm r0 = new dhm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.afga.cz(r7)
            goto L7d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.afga.cz(r7)
            return r7
        L38:
            defpackage.afga.cz(r7)
            boolean r7 = r6 instanceof defpackage.dhl
            if (r7 == 0) goto L51
            dhl r6 = (defpackage.dhl) r6
            dhk r7 = r6.a
            java.lang.Object r5 = r5.a
            r0.c = r4
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r5 = r7.b(r5, r6, r0)
            if (r5 != r1) goto L50
            goto L7c
        L50:
            return r5
        L51:
            boolean r7 = r6 instanceof defpackage.dip
            if (r7 == 0) goto L8e
            r7 = r6
            dip r7 = (defpackage.dip) r7
            java.lang.Object r2 = r5.a
            r0.a = r6
            r0.c = r3
            aiug r3 = new aiug
            afdk r0 = defpackage.afga.s(r0)
            r3.<init>(r0, r4)
            r3.z()
            int r0 = r7.a
            dhn r4 = new dhn
            r4.<init>(r3, r7)
            android.content.Context r2 = (android.content.Context) r2
            defpackage.dvi.c(r2, r0, r4)
            java.lang.Object r7 = r3.k()
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            dip r6 = (defpackage.dip) r6
            dij r6 = r6.b
            java.lang.Object r5 = r5.a
            int r0 = defpackage.diq.a
            android.content.Context r5 = (android.content.Context) r5
            android.graphics.Typeface r5 = defpackage.diq.a(r7, r6, r5)
            return r5
        L8e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Unknown font type: "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldx.y(dhy, afdk):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ java.lang.Object z(defpackage.dhy dhyVar) {
        if (dhyVar instanceof defpackage.dhl) {
            defpackage.dhl dhlVar = (defpackage.dhl) dhyVar;
            return dhlVar.a.a((android.content.Context) this.a, dhlVar);
        }
        if (!(dhyVar instanceof defpackage.dip)) {
            return null;
        }
        defpackage.dip dipVar = (defpackage.dip) dhyVar;
        int i = dipVar.c;
        java.lang.Object obj = this.a;
        int i2 = dipVar.a;
        java.util.WeakHashMap weakHashMap = defpackage.dvi.a;
        android.content.Context context = (android.content.Context) obj;
        android.graphics.Typeface typefaceD = context.isRestricted() ? null : defpackage.dvi.d(context, i2, new android.util.TypedValue(), 0, null, false, false);
        typefaceD.getClass();
        defpackage.dij dijVar = dipVar.b;
        int i3 = defpackage.diq.a;
        return defpackage.diq.a(typefaceD, dijVar, context);
    }

    public ldx(java.lang.Object obj) {
        this.a = obj;
    }

    public ldx(int i) {
        aitx[] aitxVarArr = new aitx[i];
        for (int i2 = 0; i2 < i; i2++) {
            aitxVarArr[i2] = new aitx((java.lang.Object) null, aity.a);
        }
        this.a = aitxVarArr;
    }

    public ldx(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new defpackage.zo(6);
    }

    public ldx(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public ldx(byte[] bArr, char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public ldx(char[] cArr) {
        this.a = new aitx(new ajds(8, false), aity.a);
    }

    public ldx(char[] cArr, byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public ldx(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new defpackage.ing();
    }

    public ldx(byte[] bArr, byte[] bArr2) {
        this.a = new android.util.SparseArray();
    }

    public ldx(short[] sArr) {
        this.a = new defpackage.zd();
    }

    public ldx() {
        this.a = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public ldx(defpackage.abrf abrfVar, java.lang.Object obj, defpackage.abrf abrfVar2, java.lang.Object obj2) {
        this.a = new defpackage.abpu(abrfVar, obj, abrfVar2, obj2);
    }
}
