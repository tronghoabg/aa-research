package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vsu {
    public final defpackage.vss a;
    public final defpackage.afak b;
    public final defpackage.vze c;
    public final defpackage.afak d;
    public final defpackage.aclm e;
    private final defpackage.vmh f;
    private final java.util.concurrent.Executor g;

    /* JADX WARN: Type inference failed for: r11v15, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [afak, java.lang.Object] */
    public vsu(defpackage.vss vssVar, defpackage.afak afakVar, defpackage.vmh vmhVar, defpackage.ret retVar, defpackage.afak afakVar2, java.util.concurrent.Executor executor, defpackage.aclm aclmVar, defpackage.afak afakVar3) {
        this.a = vssVar;
        this.f = vmhVar;
        this.b = afakVar;
        this.g = executor;
        this.d = new defpackage.vxe(afakVar2, 1);
        android.content.Context context = (android.content.Context) ((defpackage.aclu) retVar.a).b;
        context.getClass();
        java.util.concurrent.Executor executor2 = (java.util.concurrent.Executor) retVar.d.a();
        executor2.getClass();
        defpackage.vzg vzgVar = (defpackage.vzg) retVar.e.a();
        vzgVar.getClass();
        java.lang.Boolean bool = (java.lang.Boolean) retVar.b.a();
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        defpackage.xyn xynVar = (defpackage.xyn) ((defpackage.aclu) retVar.f).b;
        xynVar.getClass();
        this.c = new defpackage.vze(context, executor2, vzgVar, aclmVar, zBooleanValue, xynVar, afakVar3, (defpackage.zhk) retVar.c.a());
        this.e = aclmVar;
    }

    public final defpackage.zhs a(final defpackage.vsq vsqVar) {
        if (this.f.a) {
            defpackage.zhn zhnVar = defpackage.zhn.a;
            return zhnVar != null ? zhnVar : new defpackage.zhn();
        }
        defpackage.zgm zgmVar = new defpackage.zgm() { // from class: vst
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, xzi] */
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, xzi] */
            /* JADX WARN: Type inference failed for: r7v45, types: [afak, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v49, types: [afak, java.lang.Object] */
            @Override // defpackage.zgm
            public final defpackage.zhs a() {
                ajgy ajgyVarB;
                java.lang.String strB;
                boolean z;
                int i;
                int i2;
                boolean z2;
                java.util.ArrayList arrayList;
                long j;
                defpackage.vsq vsqVar2 = vsqVar;
                boolean z3 = vsqVar2.g;
                defpackage.vsu vsuVar = this.a;
                char c = 2;
                if (z3) {
                    defpackage.abor aborVarN = ajgy.a.n();
                    aborVarN.t();
                    ajgy ajgyVar = aborVarN.b;
                    ajgyVar.e = 2;
                    ajgyVar.b |= 2;
                    ajgyVarB = (ajgy) aborVarN.q();
                } else {
                    defpackage.vzf vzfVar = vsqVar2.f;
                    defpackage.vze vzeVar = vsuVar.c;
                    boolean z4 = vzeVar.b;
                    defpackage.vzh vzhVar = vzeVar.a;
                    ajgyVarB = z4 ? vzhVar.b(vzfVar) : vzhVar.e();
                }
                int i3 = vsqVar2.m;
                byte b = -1;
                if (i3 != 0) {
                    defpackage.abor aborVarK = ajgyVarB.K();
                    aborVarK.t();
                    ajgy ajgyVar2 = aborVarK.b;
                    ajgyVar2.e = i3 - 1;
                    ajgyVar2.b |= 2;
                    ajgyVarB = (ajgy) aborVarK.q();
                }
                defpackage.vzf vzfVar2 = defpackage.vzf.a;
                if (ajgyVarB.c != 2 || ((java.lang.Integer) ajgyVarB.d).intValue() != -1) {
                    char c2 = 4;
                    if ((ajgyVarB.c == 4 ? (ajgx) ajgyVarB.d : ajgx.a).c != -1) {
                        defpackage.vsx vsxVar = (defpackage.vsx) vsuVar.b.a();
                        ajht ajhtVar = vsqVar2.c;
                        defpackage.abor aborVarK2 = ajhtVar.K();
                        defpackage.abor aborVarN2 = ajhb.a.n();
                        int i4 = vsxVar.l;
                        aborVarN2.t();
                        ajhb ajhbVar = aborVarN2.b;
                        ajhbVar.e = i4 - 1;
                        ajhbVar.b |= 4;
                        java.lang.String str = vsxVar.b;
                        boolean z5 = true;
                        if (str != null) {
                            aborVarN2.t();
                            ajhb ajhbVar2 = aborVarN2.b;
                            ajhbVar2.b |= 1;
                            ajhbVar2.c = str;
                        }
                        aborVarN2.t();
                        ajhb ajhbVar3 = aborVarN2.b;
                        ajhbVar3.b |= 8;
                        ajhbVar3.f = 966998491L;
                        java.lang.String str2 = vsxVar.d;
                        if (str2 != null) {
                            aborVarN2.t();
                            ajhb ajhbVar4 = aborVarN2.b;
                            ajhbVar4.b |= 2;
                            ajhbVar4.d = str2;
                        }
                        ajgd ajgdVar = ajhtVar.f;
                        if (ajgdVar == null) {
                            ajgdVar = ajgd.a;
                        }
                        ajgw ajgwVar = ajgdVar.d;
                        if (ajgwVar == null) {
                            ajgwVar = ajgw.a;
                        }
                        ajgv ajgvVar = ajgwVar.c;
                        if (ajgvVar == null) {
                            ajgvVar = ajgv.a;
                        }
                        if ((ajgvVar.b & 8) == 0 || !((java.lang.Boolean) vsxVar.g.a()).booleanValue()) {
                            strB = vsxVar.c;
                        } else {
                            ajgd ajgdVar2 = ajhtVar.f;
                            if (ajgdVar2 == null) {
                                ajgdVar2 = ajgd.a;
                            }
                            ajgw ajgwVar2 = ajgdVar2.d;
                            if (ajgwVar2 == null) {
                                ajgwVar2 = ajgw.a;
                            }
                            ajgv ajgvVar2 = ajgwVar2.c;
                            if (ajgvVar2 == null) {
                                ajgvVar2 = ajgv.a;
                            }
                            strB = defpackage.vrn.b(str, ajgvVar2.f);
                        }
                        if (strB != null) {
                            aborVarN2.t();
                            ajhb ajhbVar5 = aborVarN2.b;
                            ajhbVar5.b |= 16;
                            ajhbVar5.g = strB;
                        }
                        defpackage.ojm ojmVar = vsxVar.m;
                        int i5 = ajhtVar.b;
                        if ((i5 & 64) != 0 || (((i5 & 65536) != 0 && ((java.lang.Boolean) ojmVar.a.a()).booleanValue()) || ((java.lang.Boolean) ojmVar.b.a()).booleanValue())) {
                            defpackage.xyn xynVar = (defpackage.xyn) ((defpackage.vsl) ojmVar.c).a.fF();
                            if (xynVar.f()) {
                                java.lang.String str3 = (java.lang.String) xynVar.b();
                                if (str3.equals("com.android.vending")) {
                                    aborVarN2.t();
                                    ajhb ajhbVar6 = aborVarN2.b;
                                    ajhbVar6.b |= 64;
                                    ajhbVar6.h = true;
                                } else {
                                    aborVarN2.t();
                                    ajhb ajhbVar7 = aborVarN2.b;
                                    ajhbVar7.b |= 128;
                                    ajhbVar7.i = str3;
                                }
                            }
                        }
                        aborVarK2.t();
                        ajht ajhtVar2 = aborVarK2.b;
                        ajhb ajhbVarQ = aborVarN2.q();
                        ajhbVarQ.getClass();
                        ajhtVar2.z = ajhbVarQ;
                        ajhtVar2.b |= 4194304;
                        if (defpackage.tnx.e(vsxVar.a)) {
                            defpackage.abor aborVarN3 = ajhi.a.n();
                            long freeSpace = vsxVar.e.a().getFreeSpace() / 1024;
                            aborVarN3.t();
                            ajhi ajhiVar = aborVarN3.b;
                            ajhiVar.b |= 1;
                            ajhiVar.c = freeSpace;
                            long jLongValue = ((java.lang.Long) vsxVar.f.fF()).longValue();
                            aborVarN3.t();
                            ajhi ajhiVar2 = aborVarN3.b;
                            ajhiVar2.b |= 2;
                            ajhiVar2.d = jLongValue;
                            aborVarK2.t();
                            ajht ajhtVar3 = aborVarK2.b;
                            ajhi ajhiVarQ = aborVarN3.q();
                            ajhiVarQ.getClass();
                            ajhtVar3.B = ajhiVarQ;
                            ajhtVar3.b |= 16777216;
                        }
                        vqj vqjVar = vsqVar2.k;
                        if (vqjVar == null || !vsxVar.h.f()) {
                            z = true;
                        } else {
                            int i6 = vsqVar2.l;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            int i7 = 0;
                            while (true) {
                                defpackage.vqk[] vqkVarArr = vqjVar.b;
                                if (i7 >= vqkVarArr.length) {
                                    break;
                                }
                                defpackage.vqh[] vqhVarArrB = vqkVarArr[i7].b(vqjVar.c[i7], i6);
                                int length = vqhVarArrB.length;
                                char c3 = c;
                                int i8 = 0;
                                while (i8 < length) {
                                    arrayList2.add(new acku(vqhVarArrB[i8], i7));
                                    i8++;
                                    b = b;
                                    c2 = c2;
                                }
                                i7++;
                                c = c3;
                            }
                            java.util.Collections.sort(arrayList2, new tve(9));
                            defpackage.abor aborVarN4 = ajhh.a.n();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            int iMax = java.lang.Math.max(arrayList2.size() - i6, 0);
                            long j2 = 0;
                            while (iMax < arrayList2.size()) {
                                acku ackuVar = (acku) arrayList2.get(iMax);
                                defpackage.vqh vqhVar = (defpackage.vqh) ackuVar.b;
                                defpackage.vqg vqgVar = vqhVar.g;
                                if (vqgVar != null) {
                                    defpackage.abor aborVarN5 = ajhl.a.n();
                                    int iIntValue = vqgVar.a.intValue();
                                    aborVarN5.t();
                                    z2 = z5;
                                    ajhl ajhlVar = aborVarN5.b;
                                    i2 = iMax;
                                    ajhlVar.b |= 1;
                                    ajhlVar.c = iIntValue;
                                    arrayList = arrayList2;
                                    long j3 = vqhVar.a;
                                    j = j2;
                                    defpackage.abqv abqvVarC = defpackage.abrx.c(j3 / 1000000000, (int) (j3 % 1000000000));
                                    aborVarN5.t();
                                    ajhl ajhlVar2 = aborVarN5.b;
                                    abqvVarC.getClass();
                                    ajhlVar2.d = abqvVarC;
                                    ajhlVar2.b |= 2;
                                    int i9 = vqhVar.d;
                                    aborVarN5.t();
                                    ajhl ajhlVar3 = aborVarN5.b;
                                    ajhlVar3.b |= 16;
                                    ajhlVar3.g = i9;
                                    aborVarN5.t();
                                    ajhl ajhlVar4 = aborVarN5.b;
                                    ajhlVar4.b |= 32;
                                    ajhlVar4.h = vqgVar.d;
                                    aborVarN5.t();
                                    ajhl ajhlVar5 = aborVarN5.b;
                                    ajhlVar5.b |= 4;
                                    ajhlVar5.e = vqgVar.b;
                                    aborVarN5.t();
                                    ajhl ajhlVar6 = aborVarN5.b;
                                    java.lang.String str4 = vqgVar.c;
                                    str4.getClass();
                                    ajhlVar6.b |= 8;
                                    ajhlVar6.f = str4;
                                    arrayList3.add(aborVarN5.q());
                                } else {
                                    i2 = iMax;
                                    z2 = z5;
                                    arrayList = arrayList2;
                                    j = j2;
                                    int i10 = ackuVar.a;
                                    java.lang.Long lG = defpackage.zfh.g(vqhVar.b + "." + vqhVar.c + ":" + vqhVar.d);
                                    if (lG != null) {
                                        long jLongValue2 = lG.longValue();
                                        aborVarN4.t();
                                        ajhh ajhhVar = aborVarN4.b;
                                        defpackage.abpi abpiVar = ajhhVar.b;
                                        if (!abpiVar.c()) {
                                            ajhhVar.b = defpackage.abox.H(abpiVar);
                                        }
                                        ajhhVar.b.f(jLongValue2);
                                        int size = aborVarN4.b.b.size() - 1;
                                        long j4 = vqhVar.a / 1000000;
                                        long j5 = j4 - j;
                                        aborVarN4.t();
                                        ajhh ajhhVar2 = aborVarN4.b;
                                        defpackage.abpi abpiVar2 = ajhhVar2.c;
                                        if (!abpiVar2.c()) {
                                            ajhhVar2.c = defpackage.abox.H(abpiVar2);
                                        }
                                        ajhhVar2.c.f(j5);
                                        aborVarN4.t();
                                        ajhh ajhhVar3 = aborVarN4.b;
                                        defpackage.abpf abpfVar = ajhhVar3.d;
                                        if (!abpfVar.c()) {
                                            int size2 = abpfVar.size();
                                            ajhhVar3.d = abpfVar.d(size2 + size2);
                                        }
                                        ajhhVar3.d.g(i10);
                                        int i11 = 0;
                                        while (true) {
                                            int[] iArr = vqhVar.e;
                                            if (i11 >= iArr.length) {
                                                break;
                                            }
                                            int i12 = iArr[i11];
                                            aborVarN4.t();
                                            ajhh ajhhVar4 = aborVarN4.b;
                                            defpackage.abpf abpfVar2 = ajhhVar4.e;
                                            if (!abpfVar2.c()) {
                                                int size3 = abpfVar2.size();
                                                ajhhVar4.e = abpfVar2.d(size3 + size3);
                                            }
                                            ajhhVar4.e.g(size);
                                            aborVarN4.t();
                                            ajhh ajhhVar5 = aborVarN4.b;
                                            defpackage.abpf abpfVar3 = ajhhVar5.f;
                                            if (!abpfVar3.c()) {
                                                int size4 = abpfVar3.size();
                                                ajhhVar5.f = abpfVar3.d(size4 + size4);
                                            }
                                            ajhhVar5.f.g(i12);
                                            java.lang.String str5 = vqhVar.f[i11];
                                            aborVarN4.t();
                                            ajhh ajhhVar6 = aborVarN4.b;
                                            str5.getClass();
                                            defpackage.abpj abpjVar = ajhhVar6.g;
                                            if (!abpjVar.c()) {
                                                int size5 = abpjVar.size();
                                                ajhhVar6.g = abpjVar.d(size5 + size5);
                                            }
                                            ajhhVar6.g.add(str5);
                                            i11++;
                                        }
                                        j2 = j4;
                                    }
                                    arrayList2 = arrayList;
                                    z5 = z2;
                                    iMax = i2 + 1;
                                    arrayList3 = arrayList3;
                                }
                                j2 = j;
                                arrayList2 = arrayList;
                                z5 = z2;
                                iMax = i2 + 1;
                                arrayList3 = arrayList3;
                            }
                            z = z5;
                            vqi vqiVar = new vqi(aborVarN4.q(), defpackage.ygw.o(arrayList3));
                            ajhh ajhhVar7 = vqiVar.a;
                            aborVarK2.t();
                            ajht ajhtVar4 = aborVarK2.b;
                            ajhtVar4.w = ajhhVar7;
                            ajhtVar4.b |= 2097152;
                            defpackage.ygw ygwVar = vqiVar.b;
                            aborVarK2.t();
                            ajht ajhtVar5 = aborVarK2.b;
                            defpackage.abpj abpjVar2 = ajhtVar5.x;
                            if (!abpjVar2.c()) {
                                int size6 = abpjVar2.size();
                                ajhtVar5.x = abpjVar2.d(size6 + size6);
                            }
                            defpackage.abnf.i(ygwVar, ajhtVar5.x);
                        }
                        defpackage.xyn xynVar2 = vsxVar.i;
                        if (xynVar2.f() && vsqVar2.i && (i = vsqVar2.j) > 0) {
                            if (((java.lang.Boolean) vsxVar.k.a()).booleanValue()) {
                                defpackage.ygw ygwVarC = ((vyb) xynVar2.b()).c();
                                if (!ygwVarC.isEmpty()) {
                                    aborVarK2.aQ(defpackage.ysr.V(defpackage.vsx.a(ygwVarC, i), new txx(14)));
                                }
                            } else {
                                defpackage.ygw ygwVarD = ((vyb) xynVar2.b()).d();
                                if (!ygwVarD.isEmpty()) {
                                    aborVarK2.aQ(defpackage.ysr.V(defpackage.vsx.a(ygwVarD, i), new txx(15)));
                                }
                            }
                        }
                        java.lang.RuntimeException runtimeException = null;
                        if (vsqVar2.h != null) {
                            throw null;
                        }
                        defpackage.xyn xynVar3 = vsxVar.j;
                        if (xynVar3.f()) {
                            defpackage.ygw ygwVarA = ((vso) xynVar3.b()).a();
                            aborVarK2.t();
                            ajht ajhtVar6 = aborVarK2.b;
                            defpackage.abpj abpjVar3 = ajhtVar6.y;
                            if (!abpjVar3.c()) {
                                int size7 = abpjVar3.size();
                                ajhtVar6.y = abpjVar3.d(size7 + size7);
                            }
                            defpackage.abnf.i(ygwVarA, ajhtVar6.y);
                        }
                        defpackage.abor aborVarK3 = aborVarK2.q().K();
                        aborVarK3.t();
                        ajht ajhtVar7 = aborVarK3.b;
                        ajgyVarB.getClass();
                        ajhtVar7.u = ajgyVarB;
                        ajhtVar7.b |= 1048576;
                        java.lang.String str6 = vsqVar2.a;
                        if (vsqVar2.b) {
                            if (str6 != null) {
                                aborVarK3.t();
                                ajht ajhtVar8 = aborVarK3.b;
                                ajhtVar8.b |= 4;
                                ajhtVar8.e = str6;
                            } else {
                                aborVarK3.t();
                                ajht ajhtVar9 = aborVarK3.b;
                                ajhtVar9.b &= -5;
                                ajhtVar9.e = ajht.a.e;
                            }
                        } else if (str6 != null) {
                            aborVarK3.t();
                            ajht ajhtVar10 = aborVarK3.b;
                            ajhtVar10.b |= 2;
                            ajhtVar10.d = str6;
                        } else {
                            aborVarK3.t();
                            ajht ajhtVar11 = aborVarK3.b;
                            ajhtVar11.b &= -3;
                            ajhtVar11.d = ajht.a.d;
                        }
                        vsuVar.d.a();
                        defpackage.abot abotVar = (defpackage.abot) ajfx.a.n();
                        ajfx ajfxVar = vsqVar2.d;
                        defpackage.afak afakVarB = ((defpackage.vrp) vsuVar.e.a()).b();
                        if (ajfxVar != null) {
                            abotVar.w(ajfxVar);
                        } else if (afakVarB != null) {
                            try {
                                abotVar.w((defpackage.abox) afakVarB.a());
                            } catch (java.lang.RuntimeException e) {
                                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9828)).u("Failed to get metric extension from configuration object");
                            }
                        }
                        ajfx ajfxVarQ = abotVar.q();
                        if (z == ajfxVarQ.equals(ajfx.a)) {
                            ajfxVarQ = null;
                        }
                        if (ajfxVarQ != null) {
                            aborVarK3.t();
                            ajht ajhtVar12 = aborVarK3.b;
                            ajhtVar12.C = ajfxVarQ;
                            ajhtVar12.b |= 33554432;
                        }
                        java.lang.String str7 = vsqVar2.e;
                        if (str7 != null) {
                            defpackage.abor aborVarN6 = ajha.a.n();
                            aborVarN6.t();
                            ajha ajhaVar = aborVarN6.b;
                            ajhaVar.b |= 1;
                            ajhaVar.c = str7;
                            aborVarK3.t();
                            ajht ajhtVar13 = aborVarK3.b;
                            ajha ajhaVarQ = aborVarN6.q();
                            ajhaVarQ.getClass();
                            ajhtVar13.D = ajhaVarQ;
                            ajhtVar13.b |= 67108864;
                        }
                        defpackage.vss vssVar = vsuVar.a;
                        ajht ajhtVarQ = aborVarK3.q();
                        defpackage.ygw ygwVar2 = (defpackage.ygw) vssVar.a.fF();
                        int size8 = ygwVar2.size();
                        defpackage.ysr.aL(size8, "expectedSize");
                        defpackage.ygr ygrVar = new defpackage.ygr(size8);
                        int size9 = ygwVar2.size();
                        for (int i13 = 0; i13 < size9; i13++) {
                            try {
                                ygrVar.i(((defpackage.vzq) ygwVar2.get(i13)).b(ajhtVarQ));
                            } catch (java.lang.RuntimeException e2) {
                                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e2)).ai((char) 9827)).u("One transmitter failed to send message");
                                if (runtimeException == null) {
                                    runtimeException = e2;
                                } else {
                                    runtimeException.addSuppressed(e2);
                                }
                            }
                        }
                        if (runtimeException != null) {
                            throw runtimeException;
                        }
                        defpackage.zhs zhsVarA = new defpackage.zhk(true, defpackage.ygw.n(ygrVar.g())).a(new defpackage.vsr(), defpackage.zgt.INSTANCE);
                        vsuVar.c.c.a();
                        return zhsVarA;
                    }
                }
                return defpackage.zho.a;
            }
        };
        java.util.concurrent.Executor executor = this.g;
        defpackage.zim zimVar = new defpackage.zim(zgmVar);
        executor.execute(zimVar);
        return zimVar;
    }

    public final boolean b(java.lang.String str) {
        return !e(str).f();
    }

    public final boolean c() {
        defpackage.vze vzeVar = this.c;
        return vzeVar.b && vzeVar.a.a;
    }

    public final int d() {
        int iAs = defpackage.a.as(this.c.a.b.e);
        if (iAs == 0) {
            return 1;
        }
        return iAs;
    }

    public final defpackage.vzf e(java.lang.String str) {
        if (this.f.a) {
            return defpackage.vzf.b;
        }
        defpackage.vze vzeVar = this.c;
        if (vzeVar.c.b()) {
            return defpackage.vzf.b;
        }
        return vzeVar.b ? vzeVar.a.d(str) : defpackage.vzf.b;
    }
}
