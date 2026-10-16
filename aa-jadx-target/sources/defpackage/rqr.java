package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rqr implements defpackage.zhh {
    final /* synthetic */ defpackage.rqt a;

    public rqr(defpackage.rqt rqtVar) {
        this.a = rqtVar;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        defpackage.rqt.a.g().p(th).ai(8214).u("Checkbox request failed");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:161:0x048d  */
    /* JADX WARN: Code duplicated, block: B:173:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x0205  */
    /* JADX WARN: Code duplicated, block: B:79:0x020f A[Catch: all -> 0x02e3, DONT_GENERATE, TryCatch #0 {, blocks: (B:77:0x0207, B:79:0x020f, B:81:0x0211), top: B:168:0x0207 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0211 A[Catch: all -> 0x02e3, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:77:0x0207, B:79:0x020f, B:81:0x0211), top: B:168:0x0207 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x021a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0238  */
    /* JADX WARN: Code duplicated, block: B:88:0x0255  */
    /* JADX WARN: Code duplicated, block: B:89:0x026f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0288  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.zhh
    public final /* synthetic */ void b(java.lang.Object obj) {
        defpackage.abpu abpuVar;
        defpackage.yyg yygVar;
        defpackage.yxv yxvVarA;
        java.lang.Object obj2;
        defpackage.zae zaeVar;
        defpackage.abor aborVarN;
        int iA;
        defpackage.yzo yzoVar;
        defpackage.yyg yygVar2;
        defpackage.yzo yzoVar2;
        int i;
        defpackage.rqo rqoVarA;
        defpackage.xyn xynVar;
        defpackage.xyn xynVar2;
        defpackage.xyn xynVar3;
        defpackage.xyn xynVar4;
        java.lang.Object obj3;
        ?? r6;
        defpackage.yyg yygVar3;
        java.lang.Object obj4;
        defpackage.zbg zbgVar;
        java.lang.Object obj5;
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalArgumentException();
        }
        defpackage.rqt rqtVar = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rqtVar.f.drainTo(arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.mku mkuVar = (defpackage.mku) arrayList.get(i2);
            java.lang.Object obj6 = mkuVar.a;
            defpackage.abor aborVarK = ((defpackage.abox) obj6).K();
            defpackage.sac sacVar = rqtVar.g;
            defpackage.yzc yzcVarC = ((defpackage.rqx) sacVar.fF()).c((defpackage.yzd) mkuVar.d);
            aborVarK.t();
            defpackage.yyg yygVar4 = (defpackage.yyg) aborVarK.b;
            yzcVarC.getClass();
            yygVar4.O = yzcVarC;
            int i3 = 32768;
            yygVar4.c |= 32768;
            aborVarK.N(((defpackage.rqx) sacVar.fF()).b());
            if (zBooleanValue || (obj5 = mkuVar.c) == defpackage.yyh.CONNECT_CAR_INFO) {
                if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                    throw new java.lang.IllegalArgumentException();
                }
                abpuVar = (defpackage.abpu) rqtVar.i.fF();
                yygVar = (defpackage.yyg) obj6;
                if ((yygVar.b & 4096) != 0) {
                    obj4 = abpuVar.b;
                    zbgVar = yygVar.o;
                    if (zbgVar == null) {
                        zbgVar = defpackage.zbg.a;
                    }
                    if (((defpackage.yhx) obj4).contains(java.lang.Integer.valueOf(zbgVar.e))) {
                        yxvVarA = abpuVar.a();
                    } else if ((yygVar.b & 8192) != 0) {
                        obj2 = abpuVar.d;
                        zaeVar = yygVar.p;
                        if (zaeVar == null) {
                            zaeVar = defpackage.zae.a;
                        }
                        if (((defpackage.yhx) obj2).contains(java.lang.Integer.valueOf(zaeVar.d))) {
                            yxvVarA = abpuVar.a();
                        } else if (((defpackage.rrd) abpuVar.a).a()) {
                            yxvVarA = abpuVar.a();
                        } else {
                            yxvVarA = defpackage.yxv.a;
                        }
                    } else if (((defpackage.rrd) abpuVar.a).a()) {
                        yxvVarA = abpuVar.a();
                    } else {
                        yxvVarA = defpackage.yxv.a;
                    }
                } else if ((yygVar.b & 8192) != 0) {
                    obj2 = abpuVar.d;
                    zaeVar = yygVar.p;
                    if (zaeVar == null) {
                        zaeVar = defpackage.zae.a;
                    }
                    if (((defpackage.yhx) obj2).contains(java.lang.Integer.valueOf(zaeVar.d))) {
                        yxvVarA = abpuVar.a();
                    } else if (((defpackage.rrd) abpuVar.a).a()) {
                        yxvVarA = abpuVar.a();
                    } else {
                        yxvVarA = defpackage.yxv.a;
                    }
                } else if (((defpackage.rrd) abpuVar.a).a()) {
                    yxvVarA = abpuVar.a();
                } else {
                    yxvVarA = defpackage.yxv.a;
                }
                if (!yxvVarA.equals(defpackage.yxv.a)) {
                    aborVarK.t();
                    defpackage.yyg yygVar5 = (defpackage.yyg) aborVarK.b;
                    yxvVarA.getClass();
                    yygVar5.ae = yxvVarA;
                    yygVar5.d |= 8;
                    if ((yxvVarA.b & 4) != 0) {
                        int i4 = yxvVarA.e;
                        aborVarK.t();
                        defpackage.yyg yygVar6 = (defpackage.yyg) aborVarK.b;
                        yygVar6.b |= 16777216;
                        yygVar6.y = i4;
                    }
                    if ((yxvVarA.b & 1) != 0) {
                        int i5 = yxvVarA.c;
                        aborVarK.t();
                        defpackage.yyg yygVar7 = (defpackage.yyg) aborVarK.b;
                        yygVar7.b |= 134217728;
                        yygVar7.B = i5;
                    }
                    if ((yxvVarA.b & 16) != 0) {
                        int i6 = yxvVarA.g;
                        aborVarK.t();
                        defpackage.yyg yygVar8 = (defpackage.yyg) aborVarK.b;
                        yygVar8.c |= 1048576;
                        yygVar8.S = i6;
                    }
                }
                defpackage.yzo yzoVar3 = defpackage.yzo.a;
                aborVarN = yzoVar3.n();
                iA = (int) defpackage.acxb.a.fF().a();
                if (iA != 0) {
                    aborVarN.t();
                    defpackage.yzo yzoVar4 = (defpackage.yzo) aborVarN.b;
                    yzoVar4.b |= 4;
                    yzoVar4.e = iA;
                }
                aborVarN.t();
                defpackage.yzo yzoVar5 = (defpackage.yzo) aborVarN.b;
                yzoVar5.b |= 1;
                yzoVar5.c = 176663424;
                yzoVar = (defpackage.yzo) aborVarN.q();
                aborVarK.t();
                yygVar2 = (defpackage.yyg) aborVarK.b;
                yzoVar.getClass();
                yzoVar2 = yygVar2.Q;
                if (yzoVar2 != null || yzoVar2 == yzoVar3) {
                    yygVar2.Q = yzoVar;
                } else {
                    defpackage.abor aborVarO = yzoVar3.o(yzoVar2);
                    aborVarO.w(yzoVar);
                    yygVar2.Q = (defpackage.yzo) aborVarO.r();
                }
                yygVar2.c |= 131072;
                int i7 = rqtVar.j;
                aborVarK.t();
                defpackage.yyg yygVar9 = (defpackage.yyg) aborVarK.b;
                yygVar9.ad = i7 - 1;
                yygVar9.d |= 4;
                i = yygVar9.b;
                if ((i & 524288) != 0 && (i & 1048576) == 0 && (i & 2097152) == 0 && (i & 4194304) == 0) {
                    synchronized (defpackage.rqt.b) {
                        rqoVarA = rqtVar.d.a();
                        if (rqoVarA == null) {
                            i3 = 32768;
                        } else {
                            xynVar = rqoVarA.a;
                            if (xynVar.f()) {
                                int iIntValue = ((java.lang.Integer) xynVar.b()).intValue();
                                aborVarK.t();
                                defpackage.yyg yygVar10 = (defpackage.yyg) aborVarK.b;
                                yygVar10.b |= 524288;
                                yygVar10.t = iIntValue;
                            } else {
                                aborVarK.t();
                                defpackage.yyg yygVar11 = (defpackage.yyg) aborVarK.b;
                                yygVar11.b &= -524289;
                                yygVar11.t = 0;
                            }
                            xynVar2 = rqoVarA.b;
                            if (xynVar2.f()) {
                                boolean zBooleanValue2 = ((java.lang.Boolean) xynVar2.b()).booleanValue();
                                aborVarK.t();
                                defpackage.yyg yygVar12 = (defpackage.yyg) aborVarK.b;
                                yygVar12.b |= 1048576;
                                yygVar12.u = zBooleanValue2;
                            } else {
                                aborVarK.t();
                                defpackage.yyg yygVar13 = (defpackage.yyg) aborVarK.b;
                                yygVar13.b &= -1048577;
                                yygVar13.u = false;
                            }
                            xynVar3 = rqoVarA.c;
                            if (xynVar3.f()) {
                                int iIntValue2 = ((java.lang.Integer) xynVar3.b()).intValue();
                                aborVarK.t();
                                defpackage.yyg yygVar14 = (defpackage.yyg) aborVarK.b;
                                yygVar14.b |= 2097152;
                                yygVar14.v = iIntValue2;
                            } else {
                                aborVarK.t();
                                defpackage.yyg yygVar15 = (defpackage.yyg) aborVarK.b;
                                yygVar15.b &= -2097153;
                                yygVar15.v = 0;
                            }
                            xynVar4 = rqoVarA.d;
                            if (xynVar4.f()) {
                                int i8 = ((defpackage.yzk) xynVar4.b()).l;
                                aborVarK.t();
                                defpackage.yyg yygVar16 = (defpackage.yyg) aborVarK.b;
                                yygVar16.b |= 4194304;
                                yygVar16.w = i8;
                            } else {
                                aborVarK.t();
                                defpackage.yyg yygVar17 = (defpackage.yyg) aborVarK.b;
                                yygVar17.b &= -4194305;
                                yygVar17.w = -1;
                            }
                        }
                    }
                } else {
                    i3 = 32768;
                }
                obj3 = mkuVar.c;
                r6 = mkuVar.b;
                aborVarK.t();
                defpackage.yyg yygVar18 = (defpackage.yyg) aborVarK.b;
                yygVar18.d |= 1;
                yygVar18.ab = zBooleanValue;
                if (!zBooleanValue) {
                    aborVarK.t();
                    defpackage.yyg yygVar19 = (defpackage.yyg) aborVarK.b;
                    yygVar19.c &= -2;
                    yygVar19.F = 0L;
                }
                yygVar3 = (defpackage.yyg) aborVarK.q();
                if (r6.isEmpty() || obj3 != defpackage.yyh.UI || (yygVar3.b & 4096) == 0) {
                    defpackage.yyh yyhVar = (defpackage.yyh) obj3;
                    yyhVar.name();
                    rqtVar.e.a(yyhVar, yygVar3, r6);
                } else {
                    defpackage.rrb rrbVar = (defpackage.rrb) rqtVar.h.fF();
                    if ((yygVar3.b & 4096) == 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    defpackage.zbg zbgVar2 = yygVar3.o;
                    if (zbgVar2 == null) {
                        zbgVar2 = defpackage.zbg.a;
                    }
                    defpackage.rra rraVar = (defpackage.rra) rrbVar.a.get(defpackage.zbd.b(zbgVar2.e));
                    if (rraVar == null) {
                        defpackage.yyh yyhVar2 = (defpackage.yyh) obj3;
                        yyhVar2.name();
                        rqtVar.e.a(yyhVar2, yygVar3, r6);
                    } else {
                        defpackage.abor aborVarN2 = defpackage.zbg.a.n();
                        int i9 = zbgVar2.e;
                        aborVarN2.t();
                        defpackage.zbg zbgVar3 = (defpackage.zbg) aborVarN2.b;
                        zbgVar3.b |= 2;
                        zbgVar3.e = i9;
                        int i10 = zbgVar2.b & 1;
                        defpackage.yhx yhxVar = rraVar.a;
                        if (i10 != 0 && yhxVar.contains(defpackage.ovn.BATCH_KEY_CONTEXT)) {
                            int i11 = zbgVar2.d;
                            aborVarN2.t();
                            defpackage.zbg zbgVar4 = (defpackage.zbg) aborVarN2.b;
                            zbgVar4.b |= 1;
                            zbgVar4.d = i11;
                        }
                        if ((zbgVar2.b & 16) != 0 && yhxVar.contains(defpackage.ovn.BATCH_KEY_SCREEN)) {
                            int i12 = zbgVar2.h;
                            aborVarN2.t();
                            defpackage.zbg zbgVar5 = (defpackage.zbg) aborVarN2.b;
                            zbgVar5.b |= 16;
                            zbgVar5.h = i12;
                        }
                        if ((zbgVar2.b & 8) != 0 && yhxVar.contains(defpackage.ovn.BATCH_KEY_APP_PACKAGE)) {
                            java.lang.String str = zbgVar2.g;
                            aborVarN2.t();
                            defpackage.zbg zbgVar6 = (defpackage.zbg) aborVarN2.b;
                            str.getClass();
                            zbgVar6.b |= 8;
                            zbgVar6.g = str;
                        }
                        if ((zbgVar2.b & 16384) != 0 && yhxVar.contains(defpackage.ovn.BATCH_KEY_COMPONENT_NAME)) {
                            java.lang.String str2 = zbgVar2.r;
                            aborVarN2.t();
                            defpackage.zbg zbgVar7 = (defpackage.zbg) aborVarN2.b;
                            str2.getClass();
                            zbgVar7.b |= 16384;
                            zbgVar7.r = str2;
                        }
                        if (zbgVar2.y.size() > 0 && yhxVar.contains(defpackage.ovn.BATCH_KEY_COMPONENT_NAMES)) {
                            defpackage.abpj abpjVar = zbgVar2.y;
                            aborVarN2.t();
                            defpackage.zbg zbgVar8 = (defpackage.zbg) aborVarN2.b;
                            zbgVar8.b();
                            defpackage.abnf.i(abpjVar, zbgVar8.y);
                        }
                        defpackage.zbg zbgVar9 = (defpackage.zbg) aborVarN2.q();
                        defpackage.rrb.b(zbgVar2);
                        defpackage.rrb.b(zbgVar9);
                        synchronized (rrbVar) {
                            java.util.Map map = rrbVar.b;
                            defpackage.rkc rkcVar = (defpackage.rkc) map.get(zbgVar9);
                            if (rkcVar == null) {
                                defpackage.abor aborVarK2 = zbgVar2.K();
                                if ((zbgVar2.b & i3) == 0) {
                                    aborVarK2.t();
                                    defpackage.zbg zbgVar10 = (defpackage.zbg) aborVarK2.b;
                                    zbgVar10.b |= i3;
                                    zbgVar10.s = 1;
                                }
                                map.put(zbgVar9, new defpackage.rkc(yygVar3, aborVarK2, null));
                            } else {
                                java.lang.Object obj7 = rkcVar.a;
                                rrbVar.c++;
                                int i13 = ((defpackage.zbg) ((defpackage.abor) obj7).b).s + zbgVar2.s;
                                ((defpackage.abor) obj7).t();
                                defpackage.zbg zbgVar11 = (defpackage.zbg) ((defpackage.abor) obj7).b;
                                zbgVar11.b |= i3;
                                zbgVar11.s = i13;
                                if ((zbgVar2.b & 4) != 0) {
                                    long j = zbgVar11.f + zbgVar2.f;
                                    ((defpackage.abor) obj7).t();
                                    defpackage.zbg zbgVar12 = (defpackage.zbg) ((defpackage.abor) obj7).b;
                                    zbgVar12.b |= 4;
                                    zbgVar12.f = j;
                                }
                            }
                        }
                    }
                }
            } else {
                if (obj5 == defpackage.yyh.UI) {
                    defpackage.yyg yygVar20 = (defpackage.yyg) obj6;
                    if ((yygVar20.b & 4096) != 0) {
                        defpackage.zbg zbgVar13 = yygVar20.o;
                        if (zbgVar13 == null) {
                            zbgVar13 = defpackage.zbg.a;
                        }
                        if (zbgVar13.e == defpackage.zbd.pe.a()) {
                            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            abpuVar = (defpackage.abpu) rqtVar.i.fF();
                            yygVar = (defpackage.yyg) obj6;
                            if ((yygVar.b & 4096) != 0) {
                                obj4 = abpuVar.b;
                                zbgVar = yygVar.o;
                                if (zbgVar == null) {
                                    zbgVar = defpackage.zbg.a;
                                }
                                if (((defpackage.yhx) obj4).contains(java.lang.Integer.valueOf(zbgVar.e))) {
                                    yxvVarA = abpuVar.a();
                                } else if ((yygVar.b & 8192) != 0) {
                                    obj2 = abpuVar.d;
                                    zaeVar = yygVar.p;
                                    if (zaeVar == null) {
                                        zaeVar = defpackage.zae.a;
                                    }
                                    if (((defpackage.yhx) obj2).contains(java.lang.Integer.valueOf(zaeVar.d))) {
                                        yxvVarA = abpuVar.a();
                                    } else if (((defpackage.rrd) abpuVar.a).a()) {
                                        yxvVarA = abpuVar.a();
                                    } else {
                                        yxvVarA = defpackage.yxv.a;
                                    }
                                } else if (((defpackage.rrd) abpuVar.a).a()) {
                                    yxvVarA = abpuVar.a();
                                } else {
                                    yxvVarA = defpackage.yxv.a;
                                }
                            } else if ((yygVar.b & 8192) != 0) {
                                obj2 = abpuVar.d;
                                zaeVar = yygVar.p;
                                if (zaeVar == null) {
                                    zaeVar = defpackage.zae.a;
                                }
                                if (((defpackage.yhx) obj2).contains(java.lang.Integer.valueOf(zaeVar.d))) {
                                    yxvVarA = abpuVar.a();
                                } else if (((defpackage.rrd) abpuVar.a).a()) {
                                    yxvVarA = abpuVar.a();
                                } else {
                                    yxvVarA = defpackage.yxv.a;
                                }
                            } else if (((defpackage.rrd) abpuVar.a).a()) {
                                yxvVarA = abpuVar.a();
                            } else {
                                yxvVarA = defpackage.yxv.a;
                            }
                            if (!yxvVarA.equals(defpackage.yxv.a)) {
                                aborVarK.t();
                                defpackage.yyg yygVar21 = (defpackage.yyg) aborVarK.b;
                                yxvVarA.getClass();
                                yygVar21.ae = yxvVarA;
                                yygVar21.d |= 8;
                                if ((yxvVarA.b & 4) != 0) {
                                    int i14 = yxvVarA.e;
                                    aborVarK.t();
                                    defpackage.yyg yygVar22 = (defpackage.yyg) aborVarK.b;
                                    yygVar22.b |= 16777216;
                                    yygVar22.y = i14;
                                }
                                if ((yxvVarA.b & 1) != 0) {
                                    int i15 = yxvVarA.c;
                                    aborVarK.t();
                                    defpackage.yyg yygVar23 = (defpackage.yyg) aborVarK.b;
                                    yygVar23.b |= 134217728;
                                    yygVar23.B = i15;
                                }
                                if ((yxvVarA.b & 16) != 0) {
                                    int i16 = yxvVarA.g;
                                    aborVarK.t();
                                    defpackage.yyg yygVar24 = (defpackage.yyg) aborVarK.b;
                                    yygVar24.c |= 1048576;
                                    yygVar24.S = i16;
                                }
                            }
                            defpackage.yzo yzoVar6 = defpackage.yzo.a;
                            aborVarN = yzoVar6.n();
                            iA = (int) defpackage.acxb.a.fF().a();
                            if (iA != 0) {
                                aborVarN.t();
                                defpackage.yzo yzoVar7 = (defpackage.yzo) aborVarN.b;
                                yzoVar7.b |= 4;
                                yzoVar7.e = iA;
                            }
                            aborVarN.t();
                            defpackage.yzo yzoVar8 = (defpackage.yzo) aborVarN.b;
                            yzoVar8.b |= 1;
                            yzoVar8.c = 176663424;
                            yzoVar = (defpackage.yzo) aborVarN.q();
                            aborVarK.t();
                            yygVar2 = (defpackage.yyg) aborVarK.b;
                            yzoVar.getClass();
                            yzoVar2 = yygVar2.Q;
                            if (yzoVar2 != null) {
                                yygVar2.Q = yzoVar;
                            } else {
                                yygVar2.Q = yzoVar;
                            }
                            yygVar2.c |= 131072;
                            int i17 = rqtVar.j;
                            aborVarK.t();
                            defpackage.yyg yygVar25 = (defpackage.yyg) aborVarK.b;
                            yygVar25.ad = i17 - 1;
                            yygVar25.d |= 4;
                            i = yygVar25.b;
                            if ((i & 524288) != 0) {
                                i3 = 32768;
                            } else {
                                synchronized (defpackage.rqt.b) {
                                    rqoVarA = rqtVar.d.a();
                                    if (rqoVarA == null) {
                                        i3 = 32768;
                                    } else {
                                        xynVar = rqoVarA.a;
                                        if (xynVar.f()) {
                                            int iIntValue3 = ((java.lang.Integer) xynVar.b()).intValue();
                                            aborVarK.t();
                                            defpackage.yyg yygVar110 = (defpackage.yyg) aborVarK.b;
                                            yygVar110.b |= 524288;
                                            yygVar110.t = iIntValue3;
                                        } else {
                                            aborVarK.t();
                                            defpackage.yyg yygVar111 = (defpackage.yyg) aborVarK.b;
                                            yygVar111.b &= -524289;
                                            yygVar111.t = 0;
                                        }
                                        xynVar2 = rqoVarA.b;
                                        if (xynVar2.f()) {
                                            boolean zBooleanValue3 = ((java.lang.Boolean) xynVar2.b()).booleanValue();
                                            aborVarK.t();
                                            defpackage.yyg yygVar112 = (defpackage.yyg) aborVarK.b;
                                            yygVar112.b |= 1048576;
                                            yygVar112.u = zBooleanValue3;
                                        } else {
                                            aborVarK.t();
                                            defpackage.yyg yygVar113 = (defpackage.yyg) aborVarK.b;
                                            yygVar113.b &= -1048577;
                                            yygVar113.u = false;
                                        }
                                        xynVar3 = rqoVarA.c;
                                        if (xynVar3.f()) {
                                            int iIntValue4 = ((java.lang.Integer) xynVar3.b()).intValue();
                                            aborVarK.t();
                                            defpackage.yyg yygVar114 = (defpackage.yyg) aborVarK.b;
                                            yygVar114.b |= 2097152;
                                            yygVar114.v = iIntValue4;
                                        } else {
                                            aborVarK.t();
                                            defpackage.yyg yygVar115 = (defpackage.yyg) aborVarK.b;
                                            yygVar115.b &= -2097153;
                                            yygVar115.v = 0;
                                        }
                                        xynVar4 = rqoVarA.d;
                                        if (xynVar4.f()) {
                                            int i18 = ((defpackage.yzk) xynVar4.b()).l;
                                            aborVarK.t();
                                            defpackage.yyg yygVar116 = (defpackage.yyg) aborVarK.b;
                                            yygVar116.b |= 4194304;
                                            yygVar116.w = i18;
                                        } else {
                                            aborVarK.t();
                                            defpackage.yyg yygVar117 = (defpackage.yyg) aborVarK.b;
                                            yygVar117.b &= -4194305;
                                            yygVar117.w = -1;
                                        }
                                    }
                                }
                            }
                            obj3 = mkuVar.c;
                            r6 = mkuVar.b;
                            aborVarK.t();
                            defpackage.yyg yygVar118 = (defpackage.yyg) aborVarK.b;
                            yygVar118.d |= 1;
                            yygVar118.ab = zBooleanValue;
                            if (!zBooleanValue) {
                                aborVarK.t();
                                defpackage.yyg yygVar119 = (defpackage.yyg) aborVarK.b;
                                yygVar119.c &= -2;
                                yygVar119.F = 0L;
                            }
                            yygVar3 = (defpackage.yyg) aborVarK.q();
                            if (r6.isEmpty()) {
                                defpackage.yyh yyhVar3 = (defpackage.yyh) obj3;
                                yyhVar3.name();
                                rqtVar.e.a(yyhVar3, yygVar3, r6);
                            } else {
                                defpackage.yyh yyhVar4 = (defpackage.yyh) obj3;
                                yyhVar4.name();
                                rqtVar.e.a(yyhVar4, yygVar3, r6);
                            }
                        }
                    }
                }
                defpackage.rqt.a.l().ai(8219).u("Dropping the event. Checkbox is opt-out and telemetry is not business critical");
            }
        }
    }
}
