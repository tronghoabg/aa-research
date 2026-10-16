package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbg {
    public volatile int a;
    private final android.content.Context b;
    private final defpackage.rqt c;

    public sbg(android.content.Context context, byte[] bArr) {
        this.b = context.getApplicationContext();
        this.c = defpackage.rqt.a(context);
    }

    public final synchronized void a() {
        this.c.b();
    }

    protected final synchronized void b() {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        try {
            android.content.SharedPreferences sharedPreferences = this.b.getSharedPreferences("gearhead_analytics", 0);
            this.a = sharedPreferences.getInt("car_session", 0);
            sharedPreferences.edit().putInt("car_session", this.a + 1).commit();
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public final void c(int i, int i2, defpackage.xpc xpcVar) {
        java.util.List listCP;
        defpackage.xoy xoyVar;
        java.util.List listCP2;
        java.util.List listCP3;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.util.Iterator<E> it = xpcVar.c.iterator();
        while (true) {
            listCP = null;
            if (!it.hasNext()) {
                xoyVar = null;
                break;
            }
            defpackage.xpa xpaVar = (defpackage.xpa) it.next();
            if ((xpaVar.b & 2) != 0) {
                xoyVar = xpaVar.d;
                if (xoyVar != null) {
                    break;
                }
                xoyVar = defpackage.xoy.c;
                break;
            }
        }
        if (xoyVar != null) {
            listCP = defpackage.ysr.cP(defpackage.ysr.bJ(new defpackage.abph(xoyVar.f, defpackage.xoy.a)));
            listCP3 = defpackage.ysr.cP(defpackage.ysr.bJ(new defpackage.abph(xoyVar.g, defpackage.xoy.b)));
            defpackage.abpj abpjVar = xoyVar.d;
            defpackage.kpo kpoVar = new defpackage.kpo(5);
            abpjVar.getClass();
            defpackage.xoz[] xozVarArr = (defpackage.xoz[]) defpackage.ysr.aq(new defpackage.yio(abpjVar, kpoVar)).toArray((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) defpackage.xoz.class, 0));
            if (xozVarArr == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            listCP2 = defpackage.ysr.cP(defpackage.ysr.bK(xozVarArr));
        } else {
            listCP2 = null;
            listCP3 = null;
        }
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        defpackage.abor aborVarN2 = defpackage.yyv.a.n();
        if ((xpcVar.b & 16384) != 0) {
            defpackage.xhs xhsVar = xpcVar.q;
            if (xhsVar == null) {
                xhsVar = defpackage.xhs.a;
            }
            str = xhsVar.c;
        } else {
            str = xpcVar.d;
        }
        aborVarN2.t();
        defpackage.yyv yyvVar = (defpackage.yyv) aborVarN2.b;
        str.getClass();
        yyvVar.b |= 1;
        yyvVar.c = str;
        if ((xpcVar.b & 16384) != 0) {
            defpackage.xhs xhsVar2 = xpcVar.q;
            if (xhsVar2 == null) {
                xhsVar2 = defpackage.xhs.a;
            }
            str2 = xhsVar2.d;
        } else {
            str2 = xpcVar.e;
        }
        aborVarN2.t();
        defpackage.yyv yyvVar2 = (defpackage.yyv) aborVarN2.b;
        str2.getClass();
        yyvVar2.b |= 2;
        yyvVar2.d = str2;
        if ((xpcVar.b & 16384) != 0) {
            defpackage.xhs xhsVar3 = xpcVar.q;
            if (xhsVar3 == null) {
                xhsVar3 = defpackage.xhs.a;
            }
            str3 = xhsVar3.e;
        } else {
            str3 = xpcVar.f;
        }
        aborVarN2.t();
        defpackage.yyv yyvVar3 = (defpackage.yyv) aborVarN2.b;
        str3.getClass();
        yyvVar3.b |= 4;
        yyvVar3.e = str3;
        if ((xpcVar.b & 16384) != 0) {
            defpackage.xhs xhsVar4 = xpcVar.q;
            if (xhsVar4 == null) {
                xhsVar4 = defpackage.xhs.a;
            }
            str4 = xhsVar4.i;
        } else {
            str4 = xpcVar.k;
        }
        aborVarN2.t();
        defpackage.yyv yyvVar4 = (defpackage.yyv) aborVarN2.b;
        str4.getClass();
        yyvVar4.b |= 32;
        yyvVar4.h = str4;
        if ((xpcVar.b & 16384) != 0) {
            defpackage.xhs xhsVar5 = xpcVar.q;
            if (xhsVar5 == null) {
                xhsVar5 = defpackage.xhs.a;
            }
            str5 = xhsVar5.g;
        } else {
            str5 = xpcVar.i;
        }
        aborVarN2.t();
        defpackage.yyv yyvVar5 = (defpackage.yyv) aborVarN2.b;
        str5.getClass();
        yyvVar5.b |= 8;
        yyvVar5.f = str5;
        if ((xpcVar.b & 16384) != 0) {
            defpackage.xhs xhsVar6 = xpcVar.q;
            if (xhsVar6 == null) {
                xhsVar6 = defpackage.xhs.a;
            }
            str6 = xhsVar6.h;
        } else {
            str6 = xpcVar.j;
        }
        aborVarN2.t();
        defpackage.yyv yyvVar6 = (defpackage.yyv) aborVarN2.b;
        str6.getClass();
        yyvVar6.b |= 16;
        yyvVar6.g = str6;
        if ((xpcVar.b & 16384) != 0) {
            defpackage.xhs xhsVar7 = xpcVar.q;
            if (xhsVar7 == null) {
                xhsVar7 = defpackage.xhs.a;
            }
            str7 = xhsVar7.j;
        } else {
            str7 = xpcVar.l;
        }
        aborVarN2.t();
        defpackage.yyv yyvVar7 = (defpackage.yyv) aborVarN2.b;
        str7.getClass();
        yyvVar7.b |= 64;
        yyvVar7.i = str7;
        aborVarN2.t();
        defpackage.yyv yyvVar8 = (defpackage.yyv) aborVarN2.b;
        yyvVar8.b |= 512;
        yyvVar8.j = i;
        aborVarN2.t();
        defpackage.yyv yyvVar9 = (defpackage.yyv) aborVarN2.b;
        yyvVar9.b |= 1024;
        yyvVar9.k = i2;
        java.lang.String str8 = xpcVar.o;
        aborVarN2.t();
        defpackage.yyv yyvVar10 = (defpackage.yyv) aborVarN2.b;
        str8.getClass();
        yyvVar10.b |= 2048;
        yyvVar10.l = str8;
        defpackage.xkf xkfVarB = defpackage.xkf.b(xpcVar.h);
        if (xkfVarB == null) {
            xkfVarB = defpackage.xkf.DRIVER_POSITION_LEFT;
        }
        aborVarN2.t();
        defpackage.yyv yyvVar11 = (defpackage.yyv) aborVarN2.b;
        yyvVar11.b |= 4096;
        yyvVar11.m = xkfVarB.e;
        if (listCP != null) {
            aborVarN2.t();
            defpackage.yyv yyvVar12 = (defpackage.yyv) aborVarN2.b;
            defpackage.abpf abpfVar = yyvVar12.n;
            if (!abpfVar.c()) {
                int size = abpfVar.size();
                yyvVar12.n = abpfVar.d(size + size);
            }
            defpackage.abnf.i(listCP, yyvVar12.n);
        }
        if (listCP3 != null) {
            aborVarN2.t();
            defpackage.yyv yyvVar13 = (defpackage.yyv) aborVarN2.b;
            defpackage.abpf abpfVar2 = yyvVar13.o;
            if (!abpfVar2.c()) {
                int size2 = abpfVar2.size();
                yyvVar13.o = abpfVar2.d(size2 + size2);
            }
            defpackage.abnf.i(listCP3, yyvVar13.o);
        }
        if (listCP2 != null) {
            aborVarN2.t();
            defpackage.yyv yyvVar14 = (defpackage.yyv) aborVarN2.b;
            defpackage.abpf abpfVar3 = yyvVar14.p;
            if (!abpfVar3.c()) {
                int size3 = abpfVar3.size();
                yyvVar14.p = abpfVar3.d(size3 + size3);
            }
            defpackage.abnf.i(listCP2, yyvVar14.p);
        }
        defpackage.abor aborVarN3 = defpackage.yyy.a.n();
        aborVarN3.t();
        defpackage.yyy yyyVar = (defpackage.yyy) aborVarN3.b;
        defpackage.yyv yyvVar15 = (defpackage.yyv) aborVarN2.q();
        yyvVar15.getClass();
        yyyVar.d = yyvVar15;
        yyyVar.b |= 2;
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        defpackage.yyy yyyVar2 = (defpackage.yyy) aborVarN3.q();
        yyyVar2.getClass();
        yygVar.e = yyyVar2;
        yygVar.b |= 1;
        defpackage.yyh yyhVar = defpackage.yyh.CONNECT_CAR_INFO;
        int i3 = defpackage.ygw.d;
        f(aborVarN, yyhVar, defpackage.ymx.a);
    }

    public final void d(defpackage.yyg yygVar, defpackage.yyh yyhVar) {
        defpackage.abor aborVarK = yygVar.K();
        int i = defpackage.ygw.d;
        f(aborVarK, yyhVar, defpackage.ymx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(defpackage.rrs rrsVar) {
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        defpackage.yot it = rrsVar.d().iterator();
        while (it.hasNext()) {
            ygrVar.i(java.lang.Integer.valueOf(((defpackage.acbk) it.next()).a()));
        }
        f(rrsVar.g(), rrsVar.e(), ygrVar.g());
    }

    public final void f(defpackage.abor aborVar, defpackage.yyh yyhVar, java.util.List list) {
        int i = this.a;
        aborVar.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVar.b;
        defpackage.yyg yygVar2 = defpackage.yyg.a;
        yygVar.b |= 8388608;
        yygVar.x = i;
        this.c.e(yyhVar, (defpackage.yyg) aborVar.q(), list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sbg(android.content.Context context) {
        this(context, null);
        defpackage.qtp.a(context);
    }
}
