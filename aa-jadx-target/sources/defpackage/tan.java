package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tan {
    public static volatile defpackage.adng a;
    public static volatile defpackage.adng b;
    public static volatile defpackage.adng c;
    public static volatile defpackage.adng d;
    public static volatile defpackage.adng e;
    public static volatile defpackage.adng f;
    public static volatile defpackage.adng g;
    public static volatile defpackage.adng h;
    public static volatile defpackage.adng i;
    private static volatile defpackage.adng j;

    private tan() {
    }

    public static defpackage.adng a() {
        defpackage.adng adngVarA;
        defpackage.adng adngVar = j;
        if (adngVar != null) {
            return adngVar;
        }
        synchronized (defpackage.tan.class) {
            adngVarA = j;
            if (adngVarA == null) {
                defpackage.xo xoVarC = defpackage.adng.c();
                xoVarC.b = defpackage.adnf.a;
                xoVarC.d = defpackage.adng.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "GetSettings");
                xoVarC.b();
                tbq tbqVar = tbq.b;
                defpackage.abol abolVar = defpackage.aedu.a;
                xoVarC.e = new defpackage.aedt(tbqVar);
                xoVarC.c = new defpackage.aedt(tbp.a);
                adngVarA = xoVarC.a();
                j = adngVarA;
            }
        }
        return adngVarA;
    }

    public static final /* synthetic */ taq b(defpackage.abor aborVar) {
        taq taqVarQ = aborVar.q();
        taqVarQ.getClass();
        return taqVarQ;
    }

    public static final /* synthetic */ tbf c(defpackage.abor aborVar) {
        tbf tbfVarQ = aborVar.q();
        tbfVarQ.getClass();
        return tbfVarQ;
    }

    public static final /* synthetic */ void d(java.lang.Iterable iterable, defpackage.abor aborVar) {
        aborVar.t();
        tbf tbfVar = aborVar.b;
        tbf tbfVar2 = tbf.a;
        defpackage.abpj abpjVar = tbfVar.b;
        if (!abpjVar.c()) {
            tbfVar.b = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, tbfVar.b);
    }

    public static final /* synthetic */ void e(defpackage.abor aborVar) {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aborVar.b.b);
        listUnmodifiableList.getClass();
        new abrl(listUnmodifiableList);
    }

    public static final /* synthetic */ taw f(defpackage.abor aborVar) {
        taw tawVarQ = aborVar.q();
        tawVarQ.getClass();
        return tawVarQ;
    }

    public static defpackage.eqp g(defpackage.zhs zhsVar) {
        defpackage.eqs eqsVar = new defpackage.eqs();
        defpackage.ysr.cy(defpackage.zhm.v(zhsVar), new defpackage.tcz(eqsVar, 0), defpackage.zgt.INSTANCE);
        return eqsVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public static defpackage.zhs h(defpackage.eqg eqgVar, defpackage.eqp eqpVar) throws wfo {
        defpackage.wfp.c();
        defpackage.zif zifVar = new defpackage.zif();
        defpackage.tea teaVar = new defpackage.tea(new android.os.Handler(android.os.Looper.getMainLooper()), 0);
        tcw tcwVar = new tcw(zifVar);
        defpackage.tcv tcvVar = new defpackage.tcv(zifVar);
        tcx tcxVar = new tcx(eqgVar, tcwVar, eqpVar, tcvVar);
        eqgVar.getLifecycle().c(tcwVar);
        eqpVar.eM(eqgVar, tcvVar);
        defpackage.ysr.cy(defpackage.zhm.v(zifVar), tcxVar, teaVar);
        return zifVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public static defpackage.zhs i(defpackage.eqp eqpVar, j$.time.Duration duration, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) throws wfo {
        defpackage.wfp.c();
        defpackage.zif zifVar = new defpackage.zif();
        defpackage.tcv tcvVar = new defpackage.tcv(zifVar);
        defpackage.tcy tcyVar = new defpackage.tcy(eqpVar, tcvVar, 0);
        eqpVar.i(tcvVar);
        defpackage.ysr.cy(defpackage.zhm.v(zifVar).x(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS, scheduledExecutorService), tcyVar, defpackage.zgt.INSTANCE);
        return zifVar;
    }

    public static final /* synthetic */ tbt j(defpackage.abor aborVar) {
        tbt tbtVarQ = aborVar.q();
        tbtVarQ.getClass();
        return tbtVarQ;
    }

    public static final /* synthetic */ tbq k(defpackage.abor aborVar) {
        tbq tbqVarQ = aborVar.q();
        tbqVarQ.getClass();
        return tbqVarQ;
    }

    public static final /* synthetic */ void l(tbo tboVar, defpackage.abor aborVar) {
        aborVar.t();
        tbq tbqVar = aborVar.b;
        defpackage.abpg abpgVar = tbq.a;
        defpackage.abpf abpfVar = tbqVar.c;
        if (!abpfVar.c()) {
            tbqVar.c = defpackage.abox.G(abpfVar);
        }
        tbqVar.c.g(tboVar.k);
    }

    public static final /* synthetic */ void m(defpackage.abor aborVar) {
        new abrl(new defpackage.abph(aborVar.b.c, tbq.a));
    }

    public static final /* synthetic */ tbi n(defpackage.abor aborVar) {
        tbi tbiVarQ = aborVar.q();
        tbiVarQ.getClass();
        return tbiVarQ;
    }

    public static final void o(int i2, defpackage.abor aborVar) {
        aborVar.t();
        tbi tbiVar = aborVar.b;
        tbi tbiVar2 = tbi.a;
        tbiVar.b |= 2;
        tbiVar.d = i2;
    }

    public static final void p(int i2, defpackage.abor aborVar) {
        aborVar.t();
        tbi tbiVar = aborVar.b;
        tbi tbiVar2 = tbi.a;
        tbiVar.b |= 1;
        tbiVar.c = i2;
    }

    public static int[] q() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    public static void r(java.util.List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            abfj abfjVar = (abfj) list.get(i2);
            int i3 = 0;
            while (true) {
                abfk abfkVar = abfjVar.e;
                if (abfkVar == null) {
                    abfkVar = abfk.a;
                }
                if (i3 >= abfkVar.d.size()) {
                    break;
                }
                abfk abfkVar2 = abfjVar.e;
                if (abfkVar2 == null) {
                    abfkVar2 = abfk.a;
                }
                abfkVar2.d.e(i3);
                i3++;
            }
            int i4 = 0;
            while (true) {
                abfk abfkVar3 = abfjVar.e;
                if (abfkVar3 == null) {
                    abfkVar3 = abfk.a;
                }
                if (i4 < abfkVar3.b.size()) {
                    abfk abfkVar4 = abfjVar.e;
                    if (abfkVar4 == null) {
                        abfkVar4 = abfk.a;
                    }
                    abfkVar4.b.e(i4);
                    i4++;
                }
            }
        }
    }

    public static void s(abfj abfjVar) {
        abfk abfkVar = abfjVar.e;
        if (abfkVar == null) {
            abfkVar = abfk.a;
        }
        t(abfkVar, 2);
    }

    public static void t(abfk abfkVar, int i2) {
        int i3 = i2 - 1;
        int size = i3 != 0 ? i3 != 1 ? abfkVar.c.size() : abfkVar.d.size() : abfkVar.b.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i3 == 0) {
                abfkVar.b.e(i4);
            } else if (i3 != 1) {
                abfkVar.c.e(i4);
            } else {
                abfkVar.d.e(i4);
            }
        }
    }

    public static /* synthetic */ java.lang.String u(int i2) {
        return i2 != 1 ? "LONG_PRESS" : "TAP";
    }

    public static tsk v(android.graphics.Bitmap bitmap) {
        java.util.Comparator comparator = yif.a;
        return new urg(yif.s(defpackage.ymn.a, 0, bitmap));
    }

    public static abbk w(tpm tpmVar) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        java.nio.IntBuffer intBufferAsIntBuffer = byteBufferAllocate.asIntBuffer();
        intBufferAsIntBuffer.put((int) java.lang.Math.round(tpmVar.a() * 1.0E7d));
        intBufferAsIntBuffer.put((int) java.lang.Math.round(tpmVar.b() * 1.0E7d));
        defpackage.abor aborVarN = abbk.a.n();
        defpackage.abnv abnvVarV = defpackage.abnv.v(byteBufferAllocate.array());
        aborVarN.t();
        abbk abbkVar = aborVarN.b;
        abnvVarV.getClass();
        abbkVar.b |= 1;
        abbkVar.c = abnvVarV;
        return aborVarN.q();
    }

    public static defpackage.abnv x(double[] dArr) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(dArr.length * 8);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.asDoubleBuffer().put(dArr);
        return defpackage.abnv.u(byteBufferAllocate);
    }

    public static double y(double d2, double d3) {
        double dAbs = java.lang.Math.abs(d3 - d2);
        return dAbs < 180.0d ? dAbs : 360.0d - dAbs;
    }

    public static void z(defpackage.erh erhVar, ulp ulpVar) {
        int iOrdinal = ulpVar.a.ordinal();
        if (iOrdinal == 0) {
            return;
        }
        if (iOrdinal == 1) {
        } else if (iOrdinal == 2) {
        } else {
            if (iOrdinal != 3) {
                return;
            }
        }
    }
}
