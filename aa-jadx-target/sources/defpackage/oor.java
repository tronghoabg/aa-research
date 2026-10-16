package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oor implements defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.WeatherFetcher");
    public static final j$.time.Duration b = j$.time.Duration.ofHours(1);
    public final defpackage.yfd c;
    public final defpackage.oos d;
    public final defpackage.afak e;
    public final defpackage.zhv f;
    public final defpackage.htw g;

    public oor(android.content.Context context) {
        defpackage.oyx oyxVar = new defpackage.oyx(context, 1);
        defpackage.oos oosVar = new defpackage.oos(context);
        defpackage.htw htwVar = new defpackage.htw(context, (char[]) null, (byte[]) null);
        this.c = new defpackage.yfd(10);
        this.f = defpackage.ysr.cf(java.util.concurrent.Executors.newSingleThreadExecutor());
        this.e = oyxVar;
        this.d = oosVar;
        this.g = htwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x00b0, please report this as an issue */
    public static int b(ywk ywkVar, int i) {
        double dRint;
        long j;
        long j2;
        boolean z;
        double dC = i == 2132085377 ? ywkVar.c() : ywk.a(ywkVar.a, ywkVar.b, ywj.c);
        java.math.RoundingMode roundingMode = java.math.RoundingMode.HALF_UP;
        int i2 = zdn.a;
        if (!defpackage.ytn.n(dC)) {
            throw new java.lang.ArithmeticException("input is infinite or NaN");
        }
        switch (zdm.a[roundingMode.ordinal()]) {
            case 1:
                defpackage.ysr.cV(zdn.a(dC));
                dRint = dC;
                if (dRint > -2.147483649E9d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 2.147483648E9d)) {
                    return (int) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + dC + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (dC >= 0.0d || zdn.a(dC)) {
                    dRint = dC;
                } else {
                    j = (long) dC;
                    j2 = -1;
                    dRint = j + j2;
                }
                if (dRint > -2.147483649E9d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 2.147483648E9d)) {
                    return (int) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + dC + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (dC <= 0.0d || zdn.a(dC)) {
                    dRint = dC;
                } else {
                    j = (long) dC;
                    j2 = 1;
                    dRint = j + j2;
                }
                if (dRint > -2.147483649E9d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 2.147483648E9d)) {
                    return (int) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + dC + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                dRint = dC;
                if (dRint > -2.147483649E9d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 2.147483648E9d)) {
                    return (int) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + dC + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (zdn.a(dC)) {
                    dRint = dC;
                } else {
                    j = (long) dC;
                    j2 = dC > 0.0d ? 1 : -1;
                    dRint = j + j2;
                }
                if (dRint > -2.147483649E9d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 2.147483648E9d)) {
                    return (int) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + dC + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                dRint = java.lang.Math.rint(dC);
                if (dRint > -2.147483649E9d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 2.147483648E9d)) {
                    return (int) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + dC + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                dRint = java.lang.Math.rint(dC);
                if (java.lang.Math.abs(dC - dRint) == 0.5d) {
                    dRint = dC + java.lang.Math.copySign(0.5d, dC);
                }
                if (dRint > -2.147483649E9d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 2.147483648E9d)) {
                    return (int) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + dC + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                dRint = java.lang.Math.rint(dC);
                if (java.lang.Math.abs(dC - dRint) == 0.5d) {
                    dRint = dC;
                }
                if (dRint > -2.147483649E9d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 2.147483648E9d)) {
                    return (int) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + dC + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            default:
                throw new java.lang.AssertionError();
        }
    }

    final void a(android.location.Location location, j$.time.Instant instant, defpackage.zbd zbdVar) {
        this.c.add(new oop(location.getLatitude(), location.getLongitude(), (oom) null, instant, zbdVar.sn));
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        mnm mnmVarA = mnn.a();
        mnmVarA.a = "Request Time";
        mnmVarA.b();
        mnmVarA.c('|');
        mnmVarA.d(true);
        mnm mnmVarA2 = mnn.a();
        mnmVarA2.a = "Status";
        mnmVarA2.b();
        mnmVarA2.c('|');
        mnmVarA2.d(true);
        java.util.List listAsList = java.util.Arrays.asList(mnmVarA.a(), mnmVarA2.a());
        mnl mnlVarL = mnq.l();
        java.util.Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            mnlVarL.b((mnn) it.next());
        }
        mnm mnmVarA3 = mnn.a();
        mnmVarA3.a = "Latitude";
        mnmVarA3.b();
        mnmVarA3.c('|');
        mnmVarA3.d(true);
        mnlVarL.b(mnmVarA3.a());
        mnm mnmVarA4 = mnn.a();
        mnmVarA4.a = "Longitude";
        mnmVarA4.b();
        mnmVarA4.c('|');
        mnmVarA4.d(true);
        mnlVarL.b(mnmVarA4.a());
        mnm mnmVarA5 = mnn.a();
        mnmVarA5.a = "Weather Data";
        mnmVarA5.b();
        mnmVarA5.c('|');
        mnmVarA5.d(true);
        mnlVarL.b(mnmVarA5.a());
        for (oop oopVar : this.c) {
            mnlVarL.c(new java.lang.Object[]{oopVar.d, oopVar.e, java.lang.Double.valueOf(oopVar.a), java.lang.Double.valueOf(oopVar.b), oopVar.c});
        }
        mnlVarL.a().m(printWriter);
    }
}
