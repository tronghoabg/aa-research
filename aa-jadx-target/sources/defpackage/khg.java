package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class khg {
    public static java.lang.String a(long j, long j2, boolean z, boolean z2) {
        java.lang.String dateTime;
        j$.time.ZoneOffset zoneOffsetSystemDefault;
        boolean z3;
        android.content.Context context = defpackage.mkp.a.c;
        if (z) {
            dateTime = z2 ? "" : context.getString(2132083090);
        } else {
            dateTime = android.text.format.DateUtils.formatDateTime(context, j, 1);
        }
        if (z) {
            zoneOffsetSystemDefault = j$.time.ZoneOffset.UTC;
            z3 = true;
        } else {
            zoneOffsetSystemDefault = j$.time.ZoneId.systemDefault();
            z3 = false;
        }
        long epochDay = j$.time.Instant.ofEpochMilli(j).atZone(zoneOffsetSystemDefault).toLocalDate().toEpochDay();
        long epochDay2 = j$.time.Instant.ofEpochMilli(j2).atZone(zoneOffsetSystemDefault).toLocalDate().toEpochDay();
        if (z3) {
            epochDay2--;
        }
        defpackage.ojm.a();
        long epochDay3 = j$.time.Instant.now().atZone(zoneOffsetSystemDefault).toLocalDate().toEpochDay() - epochDay;
        long j3 = (epochDay2 - epochDay) + 1;
        if (j3 <= 1) {
            return dateTime;
        }
        long j4 = epochDay3 + 1;
        return dateTime.isEmpty() ? context.getString(2132084563, java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3)) : context.getString(2132084562, dateTime, java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3));
    }

    public static final java.lang.String b(com.google.android.apps.auto.components.calendar.model.CalendarReminder calendarReminder) {
        return a(calendarReminder.e(), calendarReminder.c(), false, false);
    }

    public static void c() {
    }

    public static final defpackage.avv d(defpackage.ktf ktfVar, int i, boolean z) {
        ktfVar.getClass();
        if (i <= 1) {
            return defpackage.asq.K(0.0f, 0.0f, 3);
        }
        return !z ? defpackage.asq.K(ktfVar.m, 0.0f, 2) : defpackage.asq.L(ktfVar.l, 0.0f, ktfVar.m, 0.0f, 10);
    }

    public static final defpackage.bpi e(defpackage.ktl ktlVar) {
        ktlVar.getClass();
        return f(ktlVar.h);
    }

    public static final defpackage.bpi f(long j) {
        return new defpackage.bpi(j, new defpackage.bmb(0.08f, 0.12f));
    }

    public static final void g(defpackage.cne cneVar, defpackage.dfb dfbVar, defpackage.ktf ktfVar, java.util.Map map, defpackage.bve bveVar, int i, int i2) {
        int i3;
        java.util.Map map2;
        defpackage.ktf ktfVar2 = ktfVar;
        java.util.Map map3 = map;
        ktfVar2.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1077190806);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(dfbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? bveVarC.C(ktfVar2) : bveVarC.E(ktfVar2)) ? 128 : 256;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? bveVarC.C(map3) : bveVarC.E(map3)) ? 1024 : 2048;
        }
        int i6 = i3;
        if (bveVarC.I((i6 & 1171) != 1170, i6 & 1)) {
            if (i5 != 0) {
                map3 = defpackage.afcf.a;
            }
            java.util.Map map4 = map3;
            if (dfbVar != null) {
                bveVarC.v(-1404152783);
                if (cneVar != null) {
                    bveVarC.v(-1404132788);
                    float f = ktfVar2.k;
                    defpackage.boh.a(cneVar, null, new defpackage.awi(f, f, f, f, true), 0L, bveVarC, (i6 & 14) | 56, 8);
                    float f2 = ktfVar2.n;
                    defpackage.asq.A(new defpackage.awi(f2, f2, f2, f2, true), bveVarC);
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(-1403979028);
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                defpackage.brv.c(dfbVar, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, map4, null, null, bveVarC, (i6 >> 3) & 14, ((i6 << 9) & 3670016) | 24960, 438270);
                bveVarC = bveVarC;
                ((defpackage.bwc) bveVarC).Y(false);
                ktfVar2 = ktfVar;
            } else {
                bveVarC.v(-1403867211);
                cneVar.getClass();
                ktfVar2 = ktfVar;
                float f3 = ktfVar2.i;
                defpackage.dlr dlrVar = ktfVar2.j;
                float f4 = dlrVar != null ? dlrVar.a : f3;
                defpackage.boh.a(cneVar, null, new defpackage.awi(f4, f3, f4, f3, true), 0L, bveVarC, 56, 8);
                ((defpackage.bwc) bveVarC).Y(false);
            }
            map2 = map4;
        } else {
            bveVarC.s();
            map2 = map3;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new dnd(cneVar, dfbVar, ktfVar2, map2, i, i2, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:110:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:118:0x014f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0156  */
    /* JADX WARN: Code duplicated, block: B:124:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x0169  */
    /* JADX WARN: Code duplicated, block: B:127:0x016d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0179  */
    /* JADX WARN: Code duplicated, block: B:132:0x017e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0188  */
    /* JADX WARN: Code duplicated, block: B:137:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0193  */
    /* JADX WARN: Code duplicated, block: B:141:0x019e  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x01da  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:174:0x0206  */
    /* JADX WARN: Code duplicated, block: B:177:0x020f  */
    /* JADX WARN: Code duplicated, block: B:194:0x027b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x027d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0280  */
    /* JADX WARN: Code duplicated, block: B:198:0x0284  */
    /* JADX WARN: Code duplicated, block: B:199:0x0292  */
    /* JADX WARN: Code duplicated, block: B:202:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:206:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:208:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:209:0x02de  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:212:0x030c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0312  */
    /* JADX WARN: Code duplicated, block: B:216:0x031a  */
    /* JADX WARN: Code duplicated, block: B:218:0x0326  */
    /* JADX WARN: Code duplicated, block: B:220:0x032a  */
    /* JADX WARN: Code duplicated, block: B:221:0x032c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0330  */
    /* JADX WARN: Code duplicated, block: B:225:0x0334  */
    /* JADX WARN: Code duplicated, block: B:226:0x034a  */
    /* JADX WARN: Code duplicated, block: B:230:0x0367  */
    /* JADX WARN: Code duplicated, block: B:231:0x036c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:234:0x0372  */
    /* JADX WARN: Code duplicated, block: B:237:0x037a  */
    /* JADX WARN: Code duplicated, block: B:239:0x03da  */
    /* JADX WARN: Code duplicated, block: B:242:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: NullPointerException in pass: IfRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:336)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:284)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:82)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final void h(defpackage.cne r34, defpackage.dfb r35, defpackage.afer r36, defpackage.cgf r37, defpackage.ktf r38, boolean r39, boolean r40, defpackage.cld r41, defpackage.cld r42, defpackage.ktl r43, defpackage.bmv r44, defpackage.ask r45, defpackage.ajl r46, java.util.Map r47, defpackage.ktl r48, defpackage.bve r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khg.h(cne, dfb, afer, cgf, ktf, boolean, boolean, cld, cld, ktl, bmv, ask, ajl, java.util.Map, ktl, bve, int, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0151  */
    /* JADX WARN: Code duplicated, block: B:123:0x015b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0164  */
    /* JADX WARN: Code duplicated, block: B:126:0x0168  */
    /* JADX WARN: Code duplicated, block: B:128:0x0173  */
    /* JADX WARN: Code duplicated, block: B:129:0x0176  */
    /* JADX WARN: Code duplicated, block: B:131:0x017b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0185  */
    /* JADX WARN: Code duplicated, block: B:136:0x018a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0190  */
    /* JADX WARN: Code duplicated, block: B:140:0x019b  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:182:0x0253 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0255  */
    /* JADX WARN: Code duplicated, block: B:184:0x0258  */
    /* JADX WARN: Code duplicated, block: B:186:0x025b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0262  */
    /* JADX WARN: Code duplicated, block: B:190:0x026d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0288  */
    /* JADX WARN: Code duplicated, block: B:193:0x028e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0291  */
    /* JADX WARN: Code duplicated, block: B:196:0x0295  */
    /* JADX WARN: Code duplicated, block: B:197:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:199:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:200:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:209:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:211:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:214:0x035e  */
    /* JADX WARN: Code duplicated, block: B:217:0x037c  */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    public static final void i(defpackage.cne cneVar, defpackage.dfb dfbVar, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, boolean z2, defpackage.cld cldVar, defpackage.cld cldVar2, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.ajl ajlVar, java.util.Map map, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean zE;
        boolean z5;
        defpackage.bve bveVar2;
        defpackage.ktf ktfVar2;
        boolean z6;
        defpackage.cld cldVar3;
        defpackage.cld cldVar4;
        defpackage.ktl ktlVar2;
        defpackage.bmv bmvVar2;
        defpackage.ask askVar2;
        boolean z7;
        java.util.Map map2;
        defpackage.cgf cgfVar3;
        defpackage.ajl ajlVar2;
        defpackage.bxl bxlVarJ;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        defpackage.ktf ktfVar3;
        int i26;
        defpackage.cld cldVarA;
        defpackage.cld cldVar5;
        defpackage.ajl ajlVar3;
        defpackage.ktl ktlVarF;
        defpackage.bmv bmvVar3;
        defpackage.ask askVar3;
        java.util.Map map3;
        defpackage.cld cldVar6;
        defpackage.ktf ktfVar4;
        int i27;
        java.lang.Object objS;
        int i28;
        int i29;
        boolean zE2;
        boolean z8 = z2;
        java.util.Map map4 = map;
        aferVar.getClass();
        int i30 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-27838166);
        if (i30 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(dfbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        int i31 = i3 & 8;
        if (i31 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                i29 = 8192;
                if ((i3 & 16) == 0) {
                    if ((32768 & i) == 0) {
                        zE2 = bveVarC.C(ktfVar);
                    } else {
                        zE2 = bveVarC.E(ktfVar);
                    }
                    if (zE2) {
                        i29 = 16384;
                    }
                }
                i4 |= i29;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i5 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i4 |= i6;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i7 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.D(z8)) {
                    i8 = 524288;
                } else {
                    i8 = 1048576;
                }
                i4 |= i8;
            }
            if ((12582912 & i) == 0) {
                i28 = 4194304;
                if ((i3 & 128) == 0 && bveVarC.C(cldVar)) {
                    i28 = 8388608;
                }
                i4 |= i28;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != bveVarC.C(cldVar2)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i4 |= i10;
            }
            if ((805306368 & i) != 0) {
                i4 |= ((i3 & 512) == 0 || !bveVarC.C(ktlVar)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                i11 = i2 | (((i3 & 1024) == 0 || !bveVarC.C(bmvVar)) ? 2 : 4);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
                i12 = i12;
                i13 = i11 | 48;
            } else {
                if ((i2 & 48) != 0) {
                    if (true != bveVarC.C(askVar)) {
                        i14 = 16;
                    } else {
                        i14 = 32;
                    }
                    i11 |= i14;
                }
                i13 = i11;
            }
            i15 = i3 & 4096;
            if (i15 != 0) {
                i17 = i13 | 384;
            } else {
                i16 = i13;
                if ((i2 & 384) == 0) {
                    i17 = i16 | (true != bveVarC.C(ajlVar) ? 128 : 256);
                } else {
                    i17 = i16;
                }
            }
            i18 = i3 & 8192;
            if (i18 != 0) {
                i20 = i17 | 3072;
            } else {
                i19 = i17;
                if ((i2 & 3072) == 0) {
                    if ((i2 & 4096) == 0) {
                        zE = bveVarC.C(map4);
                    } else {
                        zE = bveVarC.E(map4);
                    }
                    i20 = i19 | (true != zE ? 1024 : 2048);
                } else {
                    i20 = i19;
                }
            }
            if ((306783379 & i4) == 306783378 || (i20 & 1171) != 1170) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i21 = i3 & 1024;
                i22 = i3 & 512;
                i23 = i20;
                i24 = i3 & 128;
                i25 = i3 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i31 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i25 != 0) {
                        i4 &= -57345;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z9 = (!z3) | z;
                    boolean z10 = z8 & z4;
                    if (i24 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        int i32 = defpackage.bqa.a;
                        i26 = i4 & (-29360129);
                        cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                    } else {
                        i26 = i4;
                        cldVarA = cldVar;
                    }
                    if (i9 != 0) {
                        cldVar5 = null;
                    } else {
                        cldVar5 = cldVar2;
                    }
                    if (i22 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        ajlVar3 = null;
                        bveVarC = bveVarC;
                        ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVarC, 255);
                        i26 &= -1879048193;
                    } else {
                        ajlVar3 = null;
                        bveVarC = bveVarC;
                        ktlVarF = ktlVar;
                    }
                    if (i21 != 0) {
                        defpackage.avv avvVar2 = defpackage.bms.a;
                        bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        i23 &= -15;
                    } else {
                        bmvVar3 = bmvVar;
                    }
                    if (i12 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i15 == 0) {
                        ajlVar3 = ajlVar;
                    }
                    if (i18 != 0) {
                        map4 = defpackage.afcf.a;
                    }
                    askVar = askVar3;
                    z8 = z10;
                    map3 = map4;
                    cldVar = cldVarA;
                    ktlVar = ktlVarF;
                    bmvVar = bmvVar3;
                    z = z9;
                    cldVar6 = cldVar5;
                    ajlVar = ajlVar3;
                    cgfVar2 = cgfVar4;
                    ktfVar4 = ktfVar3;
                    i27 = i23;
                    i4 = i26;
                } else {
                    bveVarC.s();
                    if (i25 != 0) {
                        i4 &= -57345;
                    }
                    if (i24 != 0) {
                        i4 &= -29360129;
                    }
                    if (i22 != 0) {
                        i4 &= -1879048193;
                    }
                    i27 = i21 != 0 ? i23 & (-15) : i23;
                    cldVar6 = cldVar2;
                    map3 = map4;
                    ktfVar4 = ktfVar;
                }
                bveVarC.l();
                defpackage.ktf ktfVar5 = defpackage.ktf.a;
                defpackage.bve bveVar3 = bveVarC;
                h(cneVar, dfbVar, aferVar, cgfVar2, ktfVar4, z, z8, cldVar, cldVar6, ktlVar, bmvVar, askVar, ajlVar, map3, null, bveVar3, (i4 & 14) | 8 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), i27 & 8190, 16384);
                bveVar2 = bveVar3;
                map2 = map3;
                ajlVar2 = ajlVar;
                askVar2 = askVar;
                bmvVar2 = bmvVar;
                ktlVar2 = ktlVar;
                cldVar4 = cldVar6;
                cldVar3 = cldVar;
                z7 = z8;
                z6 = z;
                ktfVar2 = ktfVar4;
                cgfVar3 = cgfVar2;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                ktfVar2 = ktfVar;
                z6 = z;
                cldVar3 = cldVar;
                cldVar4 = cldVar2;
                ktlVar2 = ktlVar;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                z7 = z8;
                map2 = map4;
                cgfVar3 = cgfVar2;
                ajlVar2 = ajlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new kto(cneVar, dfbVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVar3, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, map2, i, i2, i3);
            }
        }
        i4 |= 3072;
        cgfVar2 = cgfVar;
        if ((i & 24576) == 0) {
            i29 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i) == 0) {
                    zE2 = bveVarC.C(ktfVar);
                } else {
                    zE2 = bveVarC.E(ktfVar);
                }
                if (zE2) {
                    i29 = 16384;
                }
            }
            i4 |= i29;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i4 |= i6;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != bveVarC.D(z8)) {
                i8 = 524288;
            } else {
                i8 = 1048576;
            }
            i4 |= i8;
        }
        if ((12582912 & i) == 0) {
            i28 = 4194304;
            if ((i3 & 128) == 0) {
                i28 = 8388608;
            }
            i4 |= i28;
        }
        i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (true != bveVarC.C(cldVar2)) {
                i10 = 33554432;
            } else {
                i10 = 67108864;
            }
            i4 |= i10;
        }
        if ((805306368 & i) != 0) {
            i4 |= ((i3 & 512) == 0 || !bveVarC.C(ktlVar)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i11 = i2 | (((i3 & 1024) == 0 || !bveVarC.C(bmvVar)) ? 2 : 4);
        } else {
            i11 = i2;
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
            i12 = i12;
            i13 = i11 | 48;
        } else {
            if ((i2 & 48) != 0) {
                if (true != bveVarC.C(askVar)) {
                    i14 = 16;
                } else {
                    i14 = 32;
                }
                i11 |= i14;
            }
            i13 = i11;
        }
        i15 = i3 & 4096;
        if (i15 != 0) {
            i17 = i13 | 384;
        } else {
            i16 = i13;
            if ((i2 & 384) == 0) {
                i17 = i16 | (true != bveVarC.C(ajlVar) ? 128 : 256);
            } else {
                i17 = i16;
            }
        }
        i18 = i3 & 8192;
        if (i18 != 0) {
            i20 = i17 | 3072;
        } else {
            i19 = i17;
            if ((i2 & 3072) == 0) {
                if ((i2 & 4096) == 0) {
                    zE = bveVarC.C(map4);
                } else {
                    zE = bveVarC.E(map4);
                }
                i20 = i19 | (true != zE ? 1024 : 2048);
            } else {
                i20 = i19;
            }
        }
        if ((306783379 & i4) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bveVarC.I(z5, i4 & 1)) {
            i21 = i3 & 1024;
            i22 = i3 & 512;
            i23 = i20;
            i24 = i3 & 128;
            i25 = i3 & 16;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i31 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i25 != 0) {
                    i4 &= -57345;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z11 = (!z3) | z;
                boolean z12 = z8 & z4;
                if (i24 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    int i33 = defpackage.bqa.a;
                    i26 = i4 & (-29360129);
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                } else {
                    i26 = i4;
                    cldVarA = cldVar;
                }
                if (i9 != 0) {
                    cldVar5 = null;
                } else {
                    cldVar5 = cldVar2;
                }
                if (i22 != 0) {
                    defpackage.afar afarVar2 = defpackage.ktl.a;
                    ajlVar3 = null;
                    bveVarC = bveVarC;
                    ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVarC, 255);
                    i26 &= -1879048193;
                } else {
                    ajlVar3 = null;
                    bveVarC = bveVarC;
                    ktlVarF = ktlVar;
                }
                if (i21 != 0) {
                    defpackage.avv avvVar4 = defpackage.bms.a;
                    bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i23 &= -15;
                } else {
                    bmvVar3 = bmvVar;
                }
                if (i12 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                if (i15 == 0) {
                    ajlVar3 = ajlVar;
                }
                if (i18 != 0) {
                    map4 = defpackage.afcf.a;
                }
                askVar = askVar3;
                z8 = z12;
                map3 = map4;
                cldVar = cldVarA;
                ktlVar = ktlVarF;
                bmvVar = bmvVar3;
                z = z11;
                cldVar6 = cldVar5;
                ajlVar = ajlVar3;
                cgfVar2 = cgfVar4;
                ktfVar4 = ktfVar3;
                i27 = i23;
                i4 = i26;
            } else {
                if (i31 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i25 != 0) {
                    i4 &= -57345;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z13 = (!z3) | z;
                boolean z14 = z8 & z4;
                if (i24 != 0) {
                    defpackage.avv avvVar5 = defpackage.bms.a;
                    int i34 = defpackage.bqa.a;
                    i26 = i4 & (-29360129);
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                } else {
                    i26 = i4;
                    cldVarA = cldVar;
                }
                if (i9 != 0) {
                    cldVar5 = null;
                } else {
                    cldVar5 = cldVar2;
                }
                if (i22 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    ajlVar3 = null;
                    bveVarC = bveVarC;
                    ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVarC, 255);
                    i26 &= -1879048193;
                } else {
                    ajlVar3 = null;
                    bveVarC = bveVarC;
                    ktlVarF = ktlVar;
                }
                if (i21 != 0) {
                    defpackage.avv avvVar6 = defpackage.bms.a;
                    bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i23 &= -15;
                } else {
                    bmvVar3 = bmvVar;
                }
                if (i12 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                if (i15 == 0) {
                    ajlVar3 = ajlVar;
                }
                if (i18 != 0) {
                    map4 = defpackage.afcf.a;
                }
                askVar = askVar3;
                z8 = z14;
                map3 = map4;
                cldVar = cldVarA;
                ktlVar = ktlVarF;
                bmvVar = bmvVar3;
                z = z13;
                cldVar6 = cldVar5;
                ajlVar = ajlVar3;
                cgfVar2 = cgfVar4;
                ktfVar4 = ktfVar3;
                i27 = i23;
                i4 = i26;
            }
            bveVarC.l();
            defpackage.ktf ktfVar6 = defpackage.ktf.a;
            defpackage.bve bveVar4 = bveVarC;
            h(cneVar, dfbVar, aferVar, cgfVar2, ktfVar4, z, z8, cldVar, cldVar6, ktlVar, bmvVar, askVar, ajlVar, map3, null, bveVar4, (i4 & 14) | 8 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), i27 & 8190, 16384);
            bveVar2 = bveVar4;
            map2 = map3;
            ajlVar2 = ajlVar;
            askVar2 = askVar;
            bmvVar2 = bmvVar;
            ktlVar2 = ktlVar;
            cldVar4 = cldVar6;
            cldVar3 = cldVar;
            z7 = z8;
            z6 = z;
            ktfVar2 = ktfVar4;
            cgfVar3 = cgfVar2;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            ktfVar2 = ktfVar;
            z6 = z;
            cldVar3 = cldVar;
            cldVar4 = cldVar2;
            ktlVar2 = ktlVar;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
            z7 = z8;
            map2 = map4;
            cgfVar3 = cgfVar2;
            ajlVar2 = ajlVar;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kto(cneVar, dfbVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVar3, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, map2, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0134  */
    /* JADX WARN: Code duplicated, block: B:113:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0145  */
    /* JADX WARN: Code duplicated, block: B:118:0x0150  */
    /* JADX WARN: Code duplicated, block: B:119:0x0153  */
    /* JADX WARN: Code duplicated, block: B:121:0x0158  */
    /* JADX WARN: Code duplicated, block: B:124:0x0162  */
    /* JADX WARN: Code duplicated, block: B:125:0x0165  */
    /* JADX WARN: Code duplicated, block: B:127:0x0169  */
    /* JADX WARN: Code duplicated, block: B:129:0x0174  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:135:0x018b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0194  */
    /* JADX WARN: Code duplicated, block: B:142:0x019d  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:165:0x0202  */
    /* JADX WARN: Code duplicated, block: B:167:0x020e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0211  */
    /* JADX WARN: Code duplicated, block: B:170:0x0215  */
    /* JADX WARN: Code duplicated, block: B:171:0x0233  */
    /* JADX WARN: Code duplicated, block: B:173:0x023d  */
    /* JADX WARN: Code duplicated, block: B:174:0x025b  */
    /* JADX WARN: Code duplicated, block: B:176:0x025f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0267  */
    /* JADX WARN: Code duplicated, block: B:180:0x0274  */
    /* JADX WARN: Code duplicated, block: B:182:0x0278  */
    /* JADX WARN: Code duplicated, block: B:183:0x0282  */
    /* JADX WARN: Code duplicated, block: B:186:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:189:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    public static final void j(defpackage.cne cneVar, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, boolean z2, defpackage.cld cldVar, defpackage.cld cldVar2, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.ajl ajlVar, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        defpackage.cld cldVarE;
        int i9;
        defpackage.cld cldVar3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z5;
        defpackage.bve bveVar2;
        defpackage.ktf ktfVar2;
        defpackage.ktl ktlVar2;
        defpackage.bmv bmvVar2;
        defpackage.ask askVar2;
        boolean z6;
        boolean z7;
        defpackage.cld cldVar4;
        defpackage.cgf cgfVar3;
        defpackage.ajl ajlVar2;
        defpackage.bxl bxlVarJ;
        int i17;
        int i18;
        int i19;
        int i20;
        defpackage.bwc bwcVar;
        boolean z8;
        defpackage.cld cldVar5;
        defpackage.bwc bwcVar2;
        defpackage.ajl ajlVar3;
        defpackage.bve bveVar3;
        defpackage.ktl ktlVarF;
        defpackage.bmv bmvVar3;
        java.lang.Object objS;
        int i21;
        int i22;
        int i23;
        boolean zE;
        cneVar.getClass();
        aferVar.getClass();
        int i24 = i & 6;
        defpackage.bve bveVarC = bveVar.c(123086942);
        if (i24 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        int i25 = i3 & 4;
        if (i25 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i23 = 1024;
                if ((i3 & 8) == 0) {
                    if ((i & 4096) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i23 = 2048;
                    }
                }
                i4 |= i23;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i5 != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z2)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i4 |= i8;
            }
            if ((1572864 & i) == 0) {
                i22 = 524288;
                if ((i3 & 64) == 0) {
                    cldVarE = cldVar;
                    if (bveVarC.C(cldVarE)) {
                        i22 = 1048576;
                    }
                } else {
                    cldVarE = cldVar;
                }
                i4 |= i22;
            } else {
                cldVarE = cldVar;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
                cldVar3 = cldVar2;
            } else {
                cldVar3 = cldVar2;
                if ((i & 12582912) == 0) {
                    if (true != bveVarC.C(cldVar3)) {
                        i10 = 4194304;
                    } else {
                        i10 = 8388608;
                    }
                    i4 |= i10;
                }
            }
            if ((100663296 & i) == 0) {
                i21 = 33554432;
                if ((i3 & 256) == 0 && bveVarC.C(ktlVar)) {
                    i21 = 67108864;
                }
                i4 |= i21;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !bveVarC.C(bmvVar)) ? 268435456 : 536870912;
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
                i12 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.C(askVar)) {
                    i13 = 2;
                } else {
                    i13 = 4;
                }
                i12 = i2 | i13;
            } else {
                i12 = i2;
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
                if ((i2 & 48) == 0) {
                    if (true != bveVarC.C(ajlVar)) {
                        i15 = 16;
                    } else {
                        i15 = 32;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((306783379 & i4) == 306783378 || (i16 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bveVarC.I(z5, i4 & 1)) {
                    i17 = i3 & 512;
                    i18 = i3 & 256;
                    i19 = i3 & 64;
                    i20 = i3 & 8;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i25 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar2;
                        }
                        if (i20 != 0) {
                            i4 &= -7169;
                            ktfVar2 = defpackage.ktf.c;
                        } else {
                            ktfVar2 = ktfVar;
                        }
                        z6 = z | (!z3);
                        z8 = z4 & z2;
                        if (i19 != 0) {
                            defpackage.avv avvVar = defpackage.bms.a;
                            cldVarE = defpackage.bms.e(bveVarC);
                            i4 &= -3670017;
                        }
                        if (i9 != 0) {
                            cldVar5 = null;
                        } else {
                            cldVar5 = cldVar3;
                        }
                        if (i18 != 0) {
                            defpackage.afar afarVar = defpackage.ktl.a;
                            bveVar3 = bveVarC;
                            ajlVar3 = null;
                            bwcVar2 = bwcVar;
                            ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                            i4 &= -234881025;
                        } else {
                            bwcVar2 = bwcVar;
                            ajlVar3 = null;
                            bveVar3 = bveVarC;
                            ktlVarF = ktlVar;
                        }
                        if (i17 != 0) {
                            defpackage.avv avvVar2 = defpackage.bms.a;
                            i4 &= -1879048193;
                            bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar3 = bmvVar;
                        }
                        if (i11 != 0) {
                            objS = bwcVar2.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar2.ad(objS);
                            }
                            askVar2 = (defpackage.ask) objS;
                        } else {
                            askVar2 = askVar;
                        }
                        if (i14 != 0) {
                            z7 = z8;
                            ajlVar2 = ajlVar3;
                        } else {
                            z7 = z8;
                            ajlVar2 = ajlVar;
                        }
                        bmvVar2 = bmvVar3;
                        ktlVar2 = ktlVarF;
                        cldVar4 = cldVar5;
                    } else {
                        bveVarC.s();
                        if (i20 != 0) {
                            i4 &= -7169;
                        }
                        if (i19 != 0) {
                            i4 &= -3670017;
                        }
                        if (i18 != 0) {
                            i4 &= -234881025;
                        }
                        if (i17 != 0) {
                            i4 &= -1879048193;
                        }
                        ktfVar2 = ktfVar;
                        ktlVar2 = ktlVar;
                        bmvVar2 = bmvVar;
                        askVar2 = askVar;
                        z6 = z;
                        i4 = i4;
                        cldVar4 = cldVar3;
                        bveVar3 = bveVarC;
                        ajlVar2 = ajlVar;
                        z7 = z2;
                        cgfVar3 = cgfVar2;
                    }
                    bveVar3.l();
                    defpackage.ktf ktfVar3 = defpackage.ktf.a;
                    int i26 = i16 << 3;
                    int i27 = i4 >> 27;
                    int i28 = i4 & 14;
                    int i29 = i4 << 3;
                    defpackage.bve bveVar4 = bveVar3;
                    h(cneVar, null, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, null, null, bveVar4, (i29 & 1879048192) | i28 | 56 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (234881024 & i29), (i27 & 14) | (i26 & 112) | (i26 & 896), 24576);
                    bveVar2 = bveVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    ktfVar2 = ktfVar;
                    ktlVar2 = ktlVar;
                    bmvVar2 = bmvVar;
                    askVar2 = askVar;
                    z6 = z;
                    z7 = z2;
                    cldVar4 = cldVar3;
                    cgfVar3 = cgfVar2;
                    ajlVar2 = ajlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new ktt(cneVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, i, i2, i3, 0);
                }
            }
            i12 |= 48;
            i16 = i12;
            if ((306783379 & i4) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i17 = i3 & 512;
                i18 = i3 & 256;
                i19 = i3 & 64;
                i20 = i3 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i20 != 0) {
                        i4 &= -7169;
                        ktfVar2 = defpackage.ktf.c;
                    } else {
                        ktfVar2 = ktfVar;
                    }
                    z6 = z | (!z3);
                    z8 = z4 & z2;
                    if (i19 != 0) {
                        defpackage.avv avvVar3 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        cldVar5 = null;
                    } else {
                        cldVar5 = cldVar3;
                    }
                    if (i18 != 0) {
                        defpackage.afar afarVar2 = defpackage.ktl.a;
                        bveVar3 = bveVarC;
                        ajlVar3 = null;
                        bwcVar2 = bwcVar;
                        ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                        i4 &= -234881025;
                    } else {
                        bwcVar2 = bwcVar;
                        ajlVar3 = null;
                        bveVar3 = bveVarC;
                        ktlVarF = ktlVar;
                    }
                    if (i17 != 0) {
                        defpackage.avv avvVar4 = defpackage.bms.a;
                        i4 &= -1879048193;
                        bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar3 = bmvVar;
                    }
                    if (i11 != 0) {
                        objS = bwcVar2.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar2.ad(objS);
                        }
                        askVar2 = (defpackage.ask) objS;
                    } else {
                        askVar2 = askVar;
                    }
                    if (i14 != 0) {
                        z7 = z8;
                        ajlVar2 = ajlVar3;
                    } else {
                        z7 = z8;
                        ajlVar2 = ajlVar;
                    }
                    bmvVar2 = bmvVar3;
                    ktlVar2 = ktlVarF;
                    cldVar4 = cldVar5;
                } else {
                    if (i25 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i20 != 0) {
                        i4 &= -7169;
                        ktfVar2 = defpackage.ktf.c;
                    } else {
                        ktfVar2 = ktfVar;
                    }
                    z6 = z | (!z3);
                    z8 = z4 & z2;
                    if (i19 != 0) {
                        defpackage.avv avvVar5 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        cldVar5 = null;
                    } else {
                        cldVar5 = cldVar3;
                    }
                    if (i18 != 0) {
                        defpackage.afar afarVar3 = defpackage.ktl.a;
                        bveVar3 = bveVarC;
                        ajlVar3 = null;
                        bwcVar2 = bwcVar;
                        ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                        i4 &= -234881025;
                    } else {
                        bwcVar2 = bwcVar;
                        ajlVar3 = null;
                        bveVar3 = bveVarC;
                        ktlVarF = ktlVar;
                    }
                    if (i17 != 0) {
                        defpackage.avv avvVar6 = defpackage.bms.a;
                        i4 &= -1879048193;
                        bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar3 = bmvVar;
                    }
                    if (i11 != 0) {
                        objS = bwcVar2.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar2.ad(objS);
                        }
                        askVar2 = (defpackage.ask) objS;
                    } else {
                        askVar2 = askVar;
                    }
                    if (i14 != 0) {
                        z7 = z8;
                        ajlVar2 = ajlVar3;
                    } else {
                        z7 = z8;
                        ajlVar2 = ajlVar;
                    }
                    bmvVar2 = bmvVar3;
                    ktlVar2 = ktlVarF;
                    cldVar4 = cldVar5;
                }
                bveVar3.l();
                defpackage.ktf ktfVar4 = defpackage.ktf.a;
                int i210 = i16 << 3;
                int i211 = i4 >> 27;
                int i212 = i4 & 14;
                int i213 = i4 << 3;
                defpackage.bve bveVar5 = bveVar3;
                h(cneVar, null, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, null, null, bveVar5, (i213 & 1879048192) | i212 | 56 | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (458752 & i213) | (3670016 & i213) | (29360128 & i213) | (234881024 & i213), (i211 & 14) | (i210 & 112) | (i210 & 896), 24576);
                bveVar2 = bveVar5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                ktfVar2 = ktfVar;
                ktlVar2 = ktlVar;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                z6 = z;
                z7 = z2;
                cldVar4 = cldVar3;
                cgfVar3 = cgfVar2;
                ajlVar2 = ajlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktt(cneVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, i, i2, i3, 0);
            }
        }
        i4 |= 384;
        cgfVar2 = cgfVar;
        if ((i & 3072) == 0) {
            i23 = 1024;
            if ((i3 & 8) == 0) {
                if ((i & 4096) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i23 = 2048;
                }
            }
            i4 |= i23;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i4 |= i6;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z2)) {
                i8 = 65536;
            } else {
                i8 = 131072;
            }
            i4 |= i8;
        }
        if ((1572864 & i) == 0) {
            i22 = 524288;
            if ((i3 & 64) == 0) {
                cldVarE = cldVar;
                if (bveVarC.C(cldVarE)) {
                    i22 = 1048576;
                }
            } else {
                cldVarE = cldVar;
            }
            i4 |= i22;
        } else {
            cldVarE = cldVar;
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
            cldVar3 = cldVar2;
        } else {
            cldVar3 = cldVar2;
            if ((i & 12582912) == 0) {
                if (true != bveVarC.C(cldVar3)) {
                    i10 = 4194304;
                } else {
                    i10 = 8388608;
                }
                i4 |= i10;
            }
        }
        if ((100663296 & i) == 0) {
            i21 = 33554432;
            if ((i3 & 256) == 0) {
                i21 = 67108864;
            }
            i4 |= i21;
        }
        if ((i & 805306368) != 0) {
            i4 |= ((i3 & 512) == 0 || !bveVarC.C(bmvVar)) ? 268435456 : 536870912;
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
            i12 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.C(askVar)) {
                i13 = 2;
            } else {
                i13 = 4;
            }
            i12 = i2 | i13;
        } else {
            i12 = i2;
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
            if ((i2 & 48) == 0) {
                if (true != bveVarC.C(ajlVar)) {
                    i15 = 16;
                } else {
                    i15 = 32;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((306783379 & i4) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i17 = i3 & 512;
                i18 = i3 & 256;
                i19 = i3 & 64;
                i20 = i3 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i25 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i20 != 0) {
                        i4 &= -7169;
                        ktfVar2 = defpackage.ktf.c;
                    } else {
                        ktfVar2 = ktfVar;
                    }
                    z6 = z | (!z3);
                    z8 = z4 & z2;
                    if (i19 != 0) {
                        defpackage.avv avvVar7 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        cldVar5 = null;
                    } else {
                        cldVar5 = cldVar3;
                    }
                    if (i18 != 0) {
                        defpackage.afar afarVar4 = defpackage.ktl.a;
                        bveVar3 = bveVarC;
                        ajlVar3 = null;
                        bwcVar2 = bwcVar;
                        ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                        i4 &= -234881025;
                    } else {
                        bwcVar2 = bwcVar;
                        ajlVar3 = null;
                        bveVar3 = bveVarC;
                        ktlVarF = ktlVar;
                    }
                    if (i17 != 0) {
                        defpackage.avv avvVar8 = defpackage.bms.a;
                        i4 &= -1879048193;
                        bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar3 = bmvVar;
                    }
                    if (i11 != 0) {
                        objS = bwcVar2.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar2.ad(objS);
                        }
                        askVar2 = (defpackage.ask) objS;
                    } else {
                        askVar2 = askVar;
                    }
                    if (i14 != 0) {
                        z7 = z8;
                        ajlVar2 = ajlVar3;
                    } else {
                        z7 = z8;
                        ajlVar2 = ajlVar;
                    }
                    bmvVar2 = bmvVar3;
                    ktlVar2 = ktlVarF;
                    cldVar4 = cldVar5;
                } else {
                    if (i25 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i20 != 0) {
                        i4 &= -7169;
                        ktfVar2 = defpackage.ktf.c;
                    } else {
                        ktfVar2 = ktfVar;
                    }
                    z6 = z | (!z3);
                    z8 = z4 & z2;
                    if (i19 != 0) {
                        defpackage.avv avvVar9 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                        i4 &= -3670017;
                    }
                    if (i9 != 0) {
                        cldVar5 = null;
                    } else {
                        cldVar5 = cldVar3;
                    }
                    if (i18 != 0) {
                        defpackage.afar afarVar5 = defpackage.ktl.a;
                        bveVar3 = bveVarC;
                        ajlVar3 = null;
                        bwcVar2 = bwcVar;
                        ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                        i4 &= -234881025;
                    } else {
                        bwcVar2 = bwcVar;
                        ajlVar3 = null;
                        bveVar3 = bveVarC;
                        ktlVarF = ktlVar;
                    }
                    if (i17 != 0) {
                        defpackage.avv avvVar10 = defpackage.bms.a;
                        i4 &= -1879048193;
                        bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar3 = bmvVar;
                    }
                    if (i11 != 0) {
                        objS = bwcVar2.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar2.ad(objS);
                        }
                        askVar2 = (defpackage.ask) objS;
                    } else {
                        askVar2 = askVar;
                    }
                    if (i14 != 0) {
                        z7 = z8;
                        ajlVar2 = ajlVar3;
                    } else {
                        z7 = z8;
                        ajlVar2 = ajlVar;
                    }
                    bmvVar2 = bmvVar3;
                    ktlVar2 = ktlVarF;
                    cldVar4 = cldVar5;
                }
                bveVar3.l();
                defpackage.ktf ktfVar5 = defpackage.ktf.a;
                int i214 = i16 << 3;
                int i215 = i4 >> 27;
                int i216 = i4 & 14;
                int i217 = i4 << 3;
                defpackage.bve bveVar6 = bveVar3;
                h(cneVar, null, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, null, null, bveVar6, (i217 & 1879048192) | i216 | 56 | (i217 & 896) | (i217 & 7168) | (57344 & i217) | (458752 & i217) | (3670016 & i217) | (29360128 & i217) | (234881024 & i217), (i215 & 14) | (i214 & 112) | (i214 & 896), 24576);
                bveVar2 = bveVar6;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                ktfVar2 = ktfVar;
                ktlVar2 = ktlVar;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                z6 = z;
                z7 = z2;
                cldVar4 = cldVar3;
                cgfVar3 = cgfVar2;
                ajlVar2 = ajlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktt(cneVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, i, i2, i3, 0);
            }
        }
        i12 |= 48;
        i16 = i12;
        if ((306783379 & i4) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bveVarC.I(z5, i4 & 1)) {
            i17 = i3 & 512;
            i18 = i3 & 256;
            i19 = i3 & 64;
            i20 = i3 & 8;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i25 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i20 != 0) {
                    i4 &= -7169;
                    ktfVar2 = defpackage.ktf.c;
                } else {
                    ktfVar2 = ktfVar;
                }
                z6 = z | (!z3);
                z8 = z4 & z2;
                if (i19 != 0) {
                    defpackage.avv avvVar11 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                    i4 &= -3670017;
                }
                if (i9 != 0) {
                    cldVar5 = null;
                } else {
                    cldVar5 = cldVar3;
                }
                if (i18 != 0) {
                    defpackage.afar afarVar6 = defpackage.ktl.a;
                    bveVar3 = bveVarC;
                    ajlVar3 = null;
                    bwcVar2 = bwcVar;
                    ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                    i4 &= -234881025;
                } else {
                    bwcVar2 = bwcVar;
                    ajlVar3 = null;
                    bveVar3 = bveVarC;
                    ktlVarF = ktlVar;
                }
                if (i17 != 0) {
                    defpackage.avv avvVar12 = defpackage.bms.a;
                    i4 &= -1879048193;
                    bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    bmvVar3 = bmvVar;
                }
                if (i11 != 0) {
                    objS = bwcVar2.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar2.ad(objS);
                    }
                    askVar2 = (defpackage.ask) objS;
                } else {
                    askVar2 = askVar;
                }
                if (i14 != 0) {
                    z7 = z8;
                    ajlVar2 = ajlVar3;
                } else {
                    z7 = z8;
                    ajlVar2 = ajlVar;
                }
                bmvVar2 = bmvVar3;
                ktlVar2 = ktlVarF;
                cldVar4 = cldVar5;
            } else {
                if (i25 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i20 != 0) {
                    i4 &= -7169;
                    ktfVar2 = defpackage.ktf.c;
                } else {
                    ktfVar2 = ktfVar;
                }
                z6 = z | (!z3);
                z8 = z4 & z2;
                if (i19 != 0) {
                    defpackage.avv avvVar13 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                    i4 &= -3670017;
                }
                if (i9 != 0) {
                    cldVar5 = null;
                } else {
                    cldVar5 = cldVar3;
                }
                if (i18 != 0) {
                    defpackage.afar afarVar7 = defpackage.ktl.a;
                    bveVar3 = bveVarC;
                    ajlVar3 = null;
                    bwcVar2 = bwcVar;
                    ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                    i4 &= -234881025;
                } else {
                    bwcVar2 = bwcVar;
                    ajlVar3 = null;
                    bveVar3 = bveVarC;
                    ktlVarF = ktlVar;
                }
                if (i17 != 0) {
                    defpackage.avv avvVar14 = defpackage.bms.a;
                    i4 &= -1879048193;
                    bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    bmvVar3 = bmvVar;
                }
                if (i11 != 0) {
                    objS = bwcVar2.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar2.ad(objS);
                    }
                    askVar2 = (defpackage.ask) objS;
                } else {
                    askVar2 = askVar;
                }
                if (i14 != 0) {
                    z7 = z8;
                    ajlVar2 = ajlVar3;
                } else {
                    z7 = z8;
                    ajlVar2 = ajlVar;
                }
                bmvVar2 = bmvVar3;
                ktlVar2 = ktlVarF;
                cldVar4 = cldVar5;
            }
            bveVar3.l();
            defpackage.ktf ktfVar6 = defpackage.ktf.a;
            int i218 = i16 << 3;
            int i219 = i4 >> 27;
            int i2110 = i4 & 14;
            int i2111 = i4 << 3;
            defpackage.bve bveVar7 = bveVar3;
            h(cneVar, null, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, null, null, bveVar7, (i2111 & 1879048192) | i2110 | 56 | (i2111 & 896) | (i2111 & 7168) | (57344 & i2111) | (458752 & i2111) | (3670016 & i2111) | (29360128 & i2111) | (234881024 & i2111), (i219 & 14) | (i218 & 112) | (i218 & 896), 24576);
            bveVar2 = bveVar7;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            ktfVar2 = ktfVar;
            ktlVar2 = ktlVar;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
            z6 = z;
            z7 = z2;
            cldVar4 = cldVar3;
            cgfVar3 = cgfVar2;
            ajlVar2 = ajlVar;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new ktt(cneVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVar2, bmvVar2, askVar2, ajlVar2, i, i2, i3, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x016b  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:127:0x017b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0180  */
    /* JADX WARN: Code duplicated, block: B:130:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0191  */
    /* JADX WARN: Code duplicated, block: B:138:0x019e  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01da  */
    /* JADX WARN: Code duplicated, block: B:162:0x01df  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0204  */
    /* JADX WARN: Code duplicated, block: B:177:0x0209  */
    /* JADX WARN: Code duplicated, block: B:180:0x0214  */
    /* JADX WARN: Code duplicated, block: B:184:0x0221  */
    /* JADX WARN: Code duplicated, block: B:187:0x022a  */
    /* JADX WARN: Code duplicated, block: B:189:0x023c  */
    /* JADX WARN: Code duplicated, block: B:193:0x025f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0267  */
    /* JADX WARN: Code duplicated, block: B:196:0x026c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0270  */
    /* JADX WARN: Code duplicated, block: B:199:0x0275  */
    /* JADX WARN: Code duplicated, block: B:202:0x0280  */
    /* JADX WARN: Code duplicated, block: B:205:0x028a  */
    /* JADX WARN: Code duplicated, block: B:206:0x028d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0291  */
    /* JADX WARN: Code duplicated, block: B:209:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:212:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:214:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:215:0x02da  */
    /* JADX WARN: Code duplicated, block: B:217:0x02de  */
    /* JADX WARN: Code duplicated, block: B:218:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:224:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:227:0x0303  */
    /* JADX WARN: Code duplicated, block: B:228:0x030e  */
    /* JADX WARN: Code duplicated, block: B:232:0x0327  */
    /* JADX WARN: Code duplicated, block: B:243:0x0356  */
    /* JADX WARN: Code duplicated, block: B:245:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0362  */
    /* JADX WARN: Code duplicated, block: B:249:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:252:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    public static final void k(defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, boolean z2, defpackage.cld cldVar, defpackage.cld cldVar2, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ajl ajlVar, defpackage.avv avvVar, defpackage.ask askVar, boolean z3, defpackage.ktl ktlVar2, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2, int i3) {
        defpackage.afer aferVar2;
        int i4;
        int i5;
        defpackage.cld cldVarE;
        defpackage.cld cldVar3;
        defpackage.ktl ktlVarJ;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        int i14;
        int i15;
        boolean z5;
        boolean z6;
        defpackage.cgf cgfVar2;
        boolean z7;
        boolean z8;
        defpackage.bmv bmvVar2;
        defpackage.ask askVar2;
        boolean z9;
        defpackage.cld cldVar4;
        defpackage.bve bveVar2;
        defpackage.cld cldVar5;
        defpackage.ktf ktfVar2;
        defpackage.ajl ajlVar2;
        defpackage.avv avvVar2;
        defpackage.ktl ktlVar3;
        defpackage.ktl ktlVar4;
        defpackage.bxl bxlVarJ;
        int i16;
        defpackage.bwc bwcVar;
        int i17;
        int i18;
        int i19;
        defpackage.cgf cgfVar3;
        defpackage.ktf ktfVar3;
        boolean z10;
        boolean z11;
        int i20;
        defpackage.bve bveVar3;
        boolean z12;
        defpackage.ajl ajlVar3;
        defpackage.avv avvVarK;
        defpackage.ask askVar3;
        boolean z13;
        defpackage.ktl ktlVar5;
        defpackage.avv avvVar3;
        defpackage.ajl ajlVar4;
        java.lang.Object objS;
        defpackage.cld cldVarI;
        defpackage.ktl ktlVar6;
        boolean z14;
        int i21;
        int i22;
        aferVar.getClass();
        affhVar.getClass();
        int i23 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1387520481);
        if (i23 == 0) {
            aferVar2 = aferVar;
            i4 = (true != bveVarC.E(aferVar2) ? 2 : 4) | i;
        } else {
            aferVar2 = aferVar;
            i4 = i;
        }
        int i24 = i3 & 2;
        if (i24 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) != 0) {
                i22 = 128;
            } else {
                if ((i & 512) == 0 ? bveVarC.C(ktfVar) : bveVarC.E(ktfVar)) {
                    i22 = 256;
                } else {
                    i22 = 128;
                }
            }
            i4 |= i22;
        }
        int i25 = i3 & 8;
        boolean z15 = i25 == 0;
        if (i25 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        int i26 = i3 & 16;
        boolean z16 = i26 == 0;
        if (i26 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= true != bveVarC.D(z2) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            if ((i3 & 32) == 0) {
                i5 = 196608;
                cldVarE = cldVar;
                if (bveVarC.C(cldVarE)) {
                    i21 = 131072;
                }
                i4 |= i21;
            } else {
                i5 = 196608;
                cldVarE = cldVar;
            }
            i21 = 65536;
            i4 |= i21;
        } else {
            i5 = 196608;
            cldVarE = cldVar;
        }
        int i27 = i3 & 64;
        if (i27 != 0) {
            i4 |= 1572864;
            cldVar3 = cldVar2;
        } else {
            cldVar3 = cldVar2;
            if ((i & 1572864) == 0) {
                i4 |= true != bveVarC.C(cldVar3) ? 524288 : 1048576;
            }
        }
        if ((12582912 & i) == 0) {
            if ((i3 & 128) == 0) {
                ktlVarJ = ktlVar;
                int i28 = bveVarC.C(ktlVarJ) ? 8388608 : 4194304;
                i4 |= i28;
            } else {
                ktlVarJ = ktlVar;
            }
            i4 |= i28;
        } else {
            ktlVarJ = ktlVar;
        }
        if ((i & 100663296) == 0) {
            i4 |= ((i3 & 256) == 0 && bveVarC.C(bmvVar)) ? 67108864 : 33554432;
        }
        int i29 = i3 & 512;
        if (i29 == 0) {
            if ((i & 805306368) == 0) {
                i4 |= true != bveVarC.C(ajlVar) ? 268435456 : 536870912;
            }
            i6 = i3 & 1024;
            if (i6 != 0) {
                i7 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.C(avvVar)) {
                    i8 = 2;
                } else {
                    i8 = 4;
                }
                i7 = i2 | i8;
            } else {
                i7 = i2;
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
                if ((i2 & 48) == 0) {
                    if (true != bveVarC.C(askVar)) {
                        i10 = 16;
                    } else {
                        i10 = 32;
                    }
                    i7 |= i10;
                }
                i11 = i7;
                i12 = i3 & 4096;
                if (i12 != 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (i12 != 0) {
                    i11 |= 384;
                } else if ((i2 & 384) != 0) {
                    i11 |= true != bveVarC.D(z3) ? 128 : 256;
                }
                if ((i3 & 8192) != 0) {
                    i11 |= 3072;
                } else {
                    i13 = i11;
                    if ((i2 & 3072) == 0) {
                        i11 = i13 | (true == bveVarC.D(false) ? 2048 : 1024);
                    }
                }
                i14 = i3 & 16384;
                if (i14 != 0) {
                    i15 = i11;
                    if ((i2 & 24576) == 0) {
                        z5 = true;
                        i15 |= true == bveVarC.C(ktlVar2) ? 16384 : 8192;
                    }
                    if ((i2 & i5) != 0) {
                        i15 |= z5 == bveVarC.E(affhVar) ? 131072 : 65536;
                    }
                    if ((306783379 & i4) == 306783378 || (i15 & 74899) != 74898) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bveVarC.I(z6, i4 & 1)) {
                        i16 = i3 & 256;
                        bwcVar = (defpackage.bwc) bveVarC;
                        bwcVar.ab(-127, null, 0, null);
                        if ((i & 1) != 0 || bveVarC.F()) {
                            i17 = i3 & 128;
                            i18 = i3 & 32;
                            i19 = i3 & 4;
                            if (i24 != 0) {
                                cgfVar3 = defpackage.cgf.e;
                            } else {
                                cgfVar3 = cgfVar;
                            }
                            if (i19 != 0) {
                                ktfVar3 = defpackage.ktf.c;
                            } else {
                                ktfVar3 = ktfVar;
                            }
                            z10 = (!z15) | z;
                            z11 = z16 & z2;
                            if (i18 != 0) {
                                defpackage.avv avvVar4 = defpackage.bms.a;
                                cldVarE = defpackage.bms.e(bveVarC);
                            }
                            defpackage.cld cldVar6 = cldVarE;
                            if (i27 != 0) {
                                cldVar3 = null;
                            } else {
                                cldVar3 = cldVar3;
                            }
                            if (i17 != 0) {
                                defpackage.afar afarVar = defpackage.ktl.a;
                                i20 = i14;
                                z12 = true;
                                bveVar3 = bveVarC;
                                ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                            } else {
                                i20 = i14;
                                bveVar3 = bveVarC;
                                z12 = true;
                            }
                            if (i16 != 0) {
                                defpackage.avv avvVar5 = defpackage.bms.a;
                                bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                            } else {
                                bmvVar2 = bmvVar;
                            }
                            if (i29 != 0) {
                                ajlVar3 = null;
                            } else {
                                ajlVar3 = ajlVar;
                            }
                            if (i6 != 0) {
                                avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                            } else {
                                avvVarK = avvVar;
                            }
                            if (i9 != 0) {
                                objS = bwcVar.S();
                                if (objS == defpackage.bvd.a) {
                                    objS = new defpackage.asl();
                                    bwcVar.ad(objS);
                                }
                                askVar3 = (defpackage.ask) objS;
                            } else {
                                askVar3 = askVar;
                            }
                            z13 = z4 & z3;
                            if (i20 != 0) {
                                ktlVar5 = null;
                            } else {
                                ktlVar5 = ktlVar2;
                            }
                            avvVar3 = avvVarK;
                            ajlVar4 = ajlVar3;
                            cldVarE = cldVar6;
                        } else {
                            bveVarC.s();
                            cgfVar3 = cgfVar;
                            ktfVar3 = ktfVar;
                            z10 = z;
                            bmvVar2 = bmvVar;
                            ajlVar4 = ajlVar;
                            avvVar3 = avvVar;
                            askVar3 = askVar;
                            ktlVar5 = ktlVar2;
                            z13 = z3;
                            bveVar3 = bveVarC;
                            z11 = z2;
                            z12 = true;
                        }
                        bveVar3.l();
                        bveVar3.v(1746334897);
                        if (cldVar3 != null || defpackage.afga.f(cldVarE, cldVar3)) {
                            bwcVar.Y(false);
                            cldVarI = cldVarE;
                        } else {
                            cldVarI = z12 != z11 ? cldVarE : cldVar3;
                            if (cldVarI instanceof defpackage.bcr) {
                                bveVar3.v(124308918);
                                cldVarI = defpackage.jxh.i((defpackage.bcr) cldVarI, bveVar3);
                                z14 = false;
                                bwcVar.Y(false);
                            } else {
                                z14 = false;
                                bveVar3.v(124372220);
                                bwcVar.Y(false);
                            }
                            bwcVar.Y(z14);
                        }
                        if (z11 || ktlVar5 == null) {
                            ktlVar6 = ktlVarJ;
                        } else {
                            ktlVar6 = ktlVar5;
                        }
                        defpackage.ajl ajlVar5 = ajlVar4;
                        defpackage.avv avvVar6 = avvVar3;
                        defpackage.ask askVar4 = askVar3;
                        boolean z17 = z13;
                        defpackage.dai.aA(defpackage.bpk.b.b(e(ktlVar6)), defpackage.dai.as(842678623, true, new ktw(aferVar2, cgfVar3, ktfVar3, ktlVar6, cldVarI, askVar4, z10, z17, bmvVar2, ajlVar5, avvVar6, affhVar), bveVar3), bveVar3, 56);
                        z8 = z11;
                        cldVar4 = cldVarE;
                        bveVar2 = bveVar3;
                        avvVar2 = avvVar6;
                        askVar2 = askVar4;
                        z7 = z10;
                        cgfVar2 = cgfVar3;
                        ktfVar2 = ktfVar3;
                        ajlVar2 = ajlVar5;
                        z9 = z17;
                        cldVar5 = cldVar3;
                        ktlVar3 = ktlVar5;
                    } else {
                        bveVarC.s();
                        cgfVar2 = cgfVar;
                        z7 = z;
                        z8 = z2;
                        bmvVar2 = bmvVar;
                        askVar2 = askVar;
                        z9 = z3;
                        cldVar4 = cldVarE;
                        bveVar2 = bveVarC;
                        cldVar5 = cldVar3;
                        ktfVar2 = ktfVar;
                        ajlVar2 = ajlVar;
                        avvVar2 = avvVar;
                        ktlVar3 = ktlVar2;
                    }
                    ktlVar4 = ktlVarJ;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new ktn(aferVar, cgfVar2, ktfVar2, z7, z8, cldVar4, cldVar5, ktlVar4, bmvVar2, ajlVar2, avvVar2, askVar2, z9, ktlVar3, affhVar, i, i2, i3);
                    }
                }
                i15 = i11 | 24576;
                z5 = true;
                if ((i2 & i5) != 0) {
                    i15 |= z5 == bveVarC.E(affhVar) ? 131072 : 65536;
                }
                if ((306783379 & i4) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bveVarC.I(z6, i4 & 1)) {
                    i16 = i3 & 256;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        i17 = i3 & 128;
                        i18 = i3 & 32;
                        i19 = i3 & 4;
                        if (i24 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i19 != 0) {
                            ktfVar3 = defpackage.ktf.c;
                        } else {
                            ktfVar3 = ktfVar;
                        }
                        z10 = (!z15) | z;
                        z11 = z16 & z2;
                        if (i18 != 0) {
                            defpackage.avv avvVar7 = defpackage.bms.a;
                            cldVarE = defpackage.bms.e(bveVarC);
                        }
                        defpackage.cld cldVar7 = cldVarE;
                        if (i27 != 0) {
                            cldVar3 = null;
                        } else {
                            cldVar3 = cldVar3;
                        }
                        if (i17 != 0) {
                            defpackage.afar afarVar2 = defpackage.ktl.a;
                            i20 = i14;
                            z12 = true;
                            bveVar3 = bveVarC;
                            ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        } else {
                            i20 = i14;
                            bveVar3 = bveVarC;
                            z12 = true;
                        }
                        if (i16 != 0) {
                            defpackage.avv avvVar8 = defpackage.bms.a;
                            bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar2 = bmvVar;
                        }
                        if (i29 != 0) {
                            ajlVar3 = null;
                        } else {
                            ajlVar3 = ajlVar;
                        }
                        if (i6 != 0) {
                            avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                        } else {
                            avvVarK = avvVar;
                        }
                        if (i9 != 0) {
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar.ad(objS);
                            }
                            askVar3 = (defpackage.ask) objS;
                        } else {
                            askVar3 = askVar;
                        }
                        z13 = z4 & z3;
                        if (i20 != 0) {
                            ktlVar5 = null;
                        } else {
                            ktlVar5 = ktlVar2;
                        }
                        avvVar3 = avvVarK;
                        ajlVar4 = ajlVar3;
                        cldVarE = cldVar7;
                    } else {
                        i17 = i3 & 128;
                        i18 = i3 & 32;
                        i19 = i3 & 4;
                        if (i24 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i19 != 0) {
                            ktfVar3 = defpackage.ktf.c;
                        } else {
                            ktfVar3 = ktfVar;
                        }
                        z10 = (!z15) | z;
                        z11 = z16 & z2;
                        if (i18 != 0) {
                            defpackage.avv avvVar9 = defpackage.bms.a;
                            cldVarE = defpackage.bms.e(bveVarC);
                        }
                        defpackage.cld cldVar8 = cldVarE;
                        if (i27 != 0) {
                            cldVar3 = null;
                        } else {
                            cldVar3 = cldVar3;
                        }
                        if (i17 != 0) {
                            defpackage.afar afarVar3 = defpackage.ktl.a;
                            i20 = i14;
                            z12 = true;
                            bveVar3 = bveVarC;
                            ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        } else {
                            i20 = i14;
                            bveVar3 = bveVarC;
                            z12 = true;
                        }
                        if (i16 != 0) {
                            defpackage.avv avvVar10 = defpackage.bms.a;
                            bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar2 = bmvVar;
                        }
                        if (i29 != 0) {
                            ajlVar3 = null;
                        } else {
                            ajlVar3 = ajlVar;
                        }
                        if (i6 != 0) {
                            avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                        } else {
                            avvVarK = avvVar;
                        }
                        if (i9 != 0) {
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar.ad(objS);
                            }
                            askVar3 = (defpackage.ask) objS;
                        } else {
                            askVar3 = askVar;
                        }
                        z13 = z4 & z3;
                        if (i20 != 0) {
                            ktlVar5 = null;
                        } else {
                            ktlVar5 = ktlVar2;
                        }
                        avvVar3 = avvVarK;
                        ajlVar4 = ajlVar3;
                        cldVarE = cldVar8;
                    }
                    bveVar3.l();
                    bveVar3.v(1746334897);
                    if (cldVar3 != null) {
                        bwcVar.Y(false);
                        cldVarI = cldVarE;
                    } else {
                        bwcVar.Y(false);
                        cldVarI = cldVarE;
                    }
                    if (z11) {
                        ktlVar6 = ktlVarJ;
                    } else {
                        ktlVar6 = ktlVarJ;
                    }
                    defpackage.ajl ajlVar6 = ajlVar4;
                    defpackage.avv avvVar11 = avvVar3;
                    defpackage.ask askVar5 = askVar3;
                    boolean z18 = z13;
                    defpackage.dai.aA(defpackage.bpk.b.b(e(ktlVar6)), defpackage.dai.as(842678623, true, new ktw(aferVar2, cgfVar3, ktfVar3, ktlVar6, cldVarI, askVar5, z10, z18, bmvVar2, ajlVar6, avvVar11, affhVar), bveVar3), bveVar3, 56);
                    z8 = z11;
                    cldVar4 = cldVarE;
                    bveVar2 = bveVar3;
                    avvVar2 = avvVar11;
                    askVar2 = askVar5;
                    z7 = z10;
                    cgfVar2 = cgfVar3;
                    ktfVar2 = ktfVar3;
                    ajlVar2 = ajlVar6;
                    z9 = z18;
                    cldVar5 = cldVar3;
                    ktlVar3 = ktlVar5;
                } else {
                    bveVarC.s();
                    cgfVar2 = cgfVar;
                    z7 = z;
                    z8 = z2;
                    bmvVar2 = bmvVar;
                    askVar2 = askVar;
                    z9 = z3;
                    cldVar4 = cldVarE;
                    bveVar2 = bveVarC;
                    cldVar5 = cldVar3;
                    ktfVar2 = ktfVar;
                    ajlVar2 = ajlVar;
                    avvVar2 = avvVar;
                    ktlVar3 = ktlVar2;
                }
                ktlVar4 = ktlVarJ;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new ktn(aferVar, cgfVar2, ktfVar2, z7, z8, cldVar4, cldVar5, ktlVar4, bmvVar2, ajlVar2, avvVar2, askVar2, z9, ktlVar3, affhVar, i, i2, i3);
                }
            }
            i7 |= 48;
            i11 = i7;
            i12 = i3 & 4096;
            if (i12 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i12 != 0) {
                i11 |= 384;
            } else if ((i2 & 384) != 0) {
                i11 |= true != bveVarC.D(z3) ? 128 : 256;
            }
            if ((i3 & 8192) != 0) {
                i11 |= 3072;
            } else {
                i13 = i11;
                if ((i2 & 3072) == 0) {
                    i11 = i13 | (true == bveVarC.D(false) ? 2048 : 1024);
                }
            }
            i14 = i3 & 16384;
            if (i14 != 0) {
                i15 = i11;
                if ((i2 & 24576) == 0) {
                    z5 = true;
                    i15 |= true == bveVarC.C(ktlVar2) ? 16384 : 8192;
                }
                if ((i2 & i5) != 0) {
                    i15 |= z5 == bveVarC.E(affhVar) ? 131072 : 65536;
                }
                if ((306783379 & i4) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bveVarC.I(z6, i4 & 1)) {
                    i16 = i3 & 256;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        i17 = i3 & 128;
                        i18 = i3 & 32;
                        i19 = i3 & 4;
                        if (i24 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i19 != 0) {
                            ktfVar3 = defpackage.ktf.c;
                        } else {
                            ktfVar3 = ktfVar;
                        }
                        z10 = (!z15) | z;
                        z11 = z16 & z2;
                        if (i18 != 0) {
                            defpackage.avv avvVar12 = defpackage.bms.a;
                            cldVarE = defpackage.bms.e(bveVarC);
                        }
                        defpackage.cld cldVar9 = cldVarE;
                        if (i27 != 0) {
                            cldVar3 = null;
                        } else {
                            cldVar3 = cldVar3;
                        }
                        if (i17 != 0) {
                            defpackage.afar afarVar4 = defpackage.ktl.a;
                            i20 = i14;
                            z12 = true;
                            bveVar3 = bveVarC;
                            ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        } else {
                            i20 = i14;
                            bveVar3 = bveVarC;
                            z12 = true;
                        }
                        if (i16 != 0) {
                            defpackage.avv avvVar13 = defpackage.bms.a;
                            bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar2 = bmvVar;
                        }
                        if (i29 != 0) {
                            ajlVar3 = null;
                        } else {
                            ajlVar3 = ajlVar;
                        }
                        if (i6 != 0) {
                            avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                        } else {
                            avvVarK = avvVar;
                        }
                        if (i9 != 0) {
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar.ad(objS);
                            }
                            askVar3 = (defpackage.ask) objS;
                        } else {
                            askVar3 = askVar;
                        }
                        z13 = z4 & z3;
                        if (i20 != 0) {
                            ktlVar5 = null;
                        } else {
                            ktlVar5 = ktlVar2;
                        }
                        avvVar3 = avvVarK;
                        ajlVar4 = ajlVar3;
                        cldVarE = cldVar9;
                    } else {
                        i17 = i3 & 128;
                        i18 = i3 & 32;
                        i19 = i3 & 4;
                        if (i24 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i19 != 0) {
                            ktfVar3 = defpackage.ktf.c;
                        } else {
                            ktfVar3 = ktfVar;
                        }
                        z10 = (!z15) | z;
                        z11 = z16 & z2;
                        if (i18 != 0) {
                            defpackage.avv avvVar14 = defpackage.bms.a;
                            cldVarE = defpackage.bms.e(bveVarC);
                        }
                        defpackage.cld cldVar10 = cldVarE;
                        if (i27 != 0) {
                            cldVar3 = null;
                        } else {
                            cldVar3 = cldVar3;
                        }
                        if (i17 != 0) {
                            defpackage.afar afarVar5 = defpackage.ktl.a;
                            i20 = i14;
                            z12 = true;
                            bveVar3 = bveVarC;
                            ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        } else {
                            i20 = i14;
                            bveVar3 = bveVarC;
                            z12 = true;
                        }
                        if (i16 != 0) {
                            defpackage.avv avvVar15 = defpackage.bms.a;
                            bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar2 = bmvVar;
                        }
                        if (i29 != 0) {
                            ajlVar3 = null;
                        } else {
                            ajlVar3 = ajlVar;
                        }
                        if (i6 != 0) {
                            avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                        } else {
                            avvVarK = avvVar;
                        }
                        if (i9 != 0) {
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar.ad(objS);
                            }
                            askVar3 = (defpackage.ask) objS;
                        } else {
                            askVar3 = askVar;
                        }
                        z13 = z4 & z3;
                        if (i20 != 0) {
                            ktlVar5 = null;
                        } else {
                            ktlVar5 = ktlVar2;
                        }
                        avvVar3 = avvVarK;
                        ajlVar4 = ajlVar3;
                        cldVarE = cldVar10;
                    }
                    bveVar3.l();
                    bveVar3.v(1746334897);
                    if (cldVar3 != null) {
                        bwcVar.Y(false);
                        cldVarI = cldVarE;
                    } else {
                        bwcVar.Y(false);
                        cldVarI = cldVarE;
                    }
                    if (z11) {
                        ktlVar6 = ktlVarJ;
                    } else {
                        ktlVar6 = ktlVarJ;
                    }
                    defpackage.ajl ajlVar7 = ajlVar4;
                    defpackage.avv avvVar16 = avvVar3;
                    defpackage.ask askVar6 = askVar3;
                    boolean z19 = z13;
                    defpackage.dai.aA(defpackage.bpk.b.b(e(ktlVar6)), defpackage.dai.as(842678623, true, new ktw(aferVar2, cgfVar3, ktfVar3, ktlVar6, cldVarI, askVar6, z10, z19, bmvVar2, ajlVar7, avvVar16, affhVar), bveVar3), bveVar3, 56);
                    z8 = z11;
                    cldVar4 = cldVarE;
                    bveVar2 = bveVar3;
                    avvVar2 = avvVar16;
                    askVar2 = askVar6;
                    z7 = z10;
                    cgfVar2 = cgfVar3;
                    ktfVar2 = ktfVar3;
                    ajlVar2 = ajlVar7;
                    z9 = z19;
                    cldVar5 = cldVar3;
                    ktlVar3 = ktlVar5;
                } else {
                    bveVarC.s();
                    cgfVar2 = cgfVar;
                    z7 = z;
                    z8 = z2;
                    bmvVar2 = bmvVar;
                    askVar2 = askVar;
                    z9 = z3;
                    cldVar4 = cldVarE;
                    bveVar2 = bveVarC;
                    cldVar5 = cldVar3;
                    ktfVar2 = ktfVar;
                    ajlVar2 = ajlVar;
                    avvVar2 = avvVar;
                    ktlVar3 = ktlVar2;
                }
                ktlVar4 = ktlVarJ;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new ktn(aferVar, cgfVar2, ktfVar2, z7, z8, cldVar4, cldVar5, ktlVar4, bmvVar2, ajlVar2, avvVar2, askVar2, z9, ktlVar3, affhVar, i, i2, i3);
                }
            }
            i15 = i11 | 24576;
            z5 = true;
            if ((i2 & i5) != 0) {
                i15 |= z5 == bveVarC.E(affhVar) ? 131072 : 65536;
            }
            if ((306783379 & i4) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bveVarC.I(z6, i4 & 1)) {
                i16 = i3 & 256;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    i17 = i3 & 128;
                    i18 = i3 & 32;
                    i19 = i3 & 4;
                    if (i24 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i19 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    z10 = (!z15) | z;
                    z11 = z16 & z2;
                    if (i18 != 0) {
                        defpackage.avv avvVar17 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                    }
                    defpackage.cld cldVar11 = cldVarE;
                    if (i27 != 0) {
                        cldVar3 = null;
                    } else {
                        cldVar3 = cldVar3;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar6 = defpackage.ktl.a;
                        i20 = i14;
                        z12 = true;
                        bveVar3 = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    } else {
                        i20 = i14;
                        bveVar3 = bveVarC;
                        z12 = true;
                    }
                    if (i16 != 0) {
                        defpackage.avv avvVar18 = defpackage.bms.a;
                        bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar2 = bmvVar;
                    }
                    if (i29 != 0) {
                        ajlVar3 = null;
                    } else {
                        ajlVar3 = ajlVar;
                    }
                    if (i6 != 0) {
                        avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                    } else {
                        avvVarK = avvVar;
                    }
                    if (i9 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    z13 = z4 & z3;
                    if (i20 != 0) {
                        ktlVar5 = null;
                    } else {
                        ktlVar5 = ktlVar2;
                    }
                    avvVar3 = avvVarK;
                    ajlVar4 = ajlVar3;
                    cldVarE = cldVar11;
                } else {
                    i17 = i3 & 128;
                    i18 = i3 & 32;
                    i19 = i3 & 4;
                    if (i24 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i19 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    z10 = (!z15) | z;
                    z11 = z16 & z2;
                    if (i18 != 0) {
                        defpackage.avv avvVar19 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                    }
                    defpackage.cld cldVar12 = cldVarE;
                    if (i27 != 0) {
                        cldVar3 = null;
                    } else {
                        cldVar3 = cldVar3;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar7 = defpackage.ktl.a;
                        i20 = i14;
                        z12 = true;
                        bveVar3 = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    } else {
                        i20 = i14;
                        bveVar3 = bveVarC;
                        z12 = true;
                    }
                    if (i16 != 0) {
                        defpackage.avv avvVar110 = defpackage.bms.a;
                        bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar2 = bmvVar;
                    }
                    if (i29 != 0) {
                        ajlVar3 = null;
                    } else {
                        ajlVar3 = ajlVar;
                    }
                    if (i6 != 0) {
                        avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                    } else {
                        avvVarK = avvVar;
                    }
                    if (i9 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    z13 = z4 & z3;
                    if (i20 != 0) {
                        ktlVar5 = null;
                    } else {
                        ktlVar5 = ktlVar2;
                    }
                    avvVar3 = avvVarK;
                    ajlVar4 = ajlVar3;
                    cldVarE = cldVar12;
                }
                bveVar3.l();
                bveVar3.v(1746334897);
                if (cldVar3 != null) {
                    bwcVar.Y(false);
                    cldVarI = cldVarE;
                } else {
                    bwcVar.Y(false);
                    cldVarI = cldVarE;
                }
                if (z11) {
                    ktlVar6 = ktlVarJ;
                } else {
                    ktlVar6 = ktlVarJ;
                }
                defpackage.ajl ajlVar8 = ajlVar4;
                defpackage.avv avvVar111 = avvVar3;
                defpackage.ask askVar7 = askVar3;
                boolean z110 = z13;
                defpackage.dai.aA(defpackage.bpk.b.b(e(ktlVar6)), defpackage.dai.as(842678623, true, new ktw(aferVar2, cgfVar3, ktfVar3, ktlVar6, cldVarI, askVar7, z10, z110, bmvVar2, ajlVar8, avvVar111, affhVar), bveVar3), bveVar3, 56);
                z8 = z11;
                cldVar4 = cldVarE;
                bveVar2 = bveVar3;
                avvVar2 = avvVar111;
                askVar2 = askVar7;
                z7 = z10;
                cgfVar2 = cgfVar3;
                ktfVar2 = ktfVar3;
                ajlVar2 = ajlVar8;
                z9 = z110;
                cldVar5 = cldVar3;
                ktlVar3 = ktlVar5;
            } else {
                bveVarC.s();
                cgfVar2 = cgfVar;
                z7 = z;
                z8 = z2;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                z9 = z3;
                cldVar4 = cldVarE;
                bveVar2 = bveVarC;
                cldVar5 = cldVar3;
                ktfVar2 = ktfVar;
                ajlVar2 = ajlVar;
                avvVar2 = avvVar;
                ktlVar3 = ktlVar2;
            }
            ktlVar4 = ktlVarJ;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktn(aferVar, cgfVar2, ktfVar2, z7, z8, cldVar4, cldVar5, ktlVar4, bmvVar2, ajlVar2, avvVar2, askVar2, z9, ktlVar3, affhVar, i, i2, i3);
            }
        }
        i4 |= 805306368;
        i6 = i3 & 1024;
        if (i6 != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.C(avvVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i7 = i2 | i8;
        } else {
            i7 = i2;
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
            if ((i2 & 48) == 0) {
                if (true != bveVarC.C(askVar)) {
                    i10 = 16;
                } else {
                    i10 = 32;
                }
                i7 |= i10;
            }
            i11 = i7;
            i12 = i3 & 4096;
            if (i12 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i12 != 0) {
                i11 |= 384;
            } else if ((i2 & 384) != 0) {
                i11 |= true != bveVarC.D(z3) ? 128 : 256;
            }
            if ((i3 & 8192) != 0) {
                i11 |= 3072;
            } else {
                i13 = i11;
                if ((i2 & 3072) == 0) {
                    i11 = i13 | (true == bveVarC.D(false) ? 2048 : 1024);
                }
            }
            i14 = i3 & 16384;
            if (i14 != 0) {
                i15 = i11;
                if ((i2 & 24576) == 0) {
                    z5 = true;
                    i15 |= true == bveVarC.C(ktlVar2) ? 16384 : 8192;
                }
                if ((i2 & i5) != 0) {
                    i15 |= z5 == bveVarC.E(affhVar) ? 131072 : 65536;
                }
                if ((306783379 & i4) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bveVarC.I(z6, i4 & 1)) {
                    i16 = i3 & 256;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        i17 = i3 & 128;
                        i18 = i3 & 32;
                        i19 = i3 & 4;
                        if (i24 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i19 != 0) {
                            ktfVar3 = defpackage.ktf.c;
                        } else {
                            ktfVar3 = ktfVar;
                        }
                        z10 = (!z15) | z;
                        z11 = z16 & z2;
                        if (i18 != 0) {
                            defpackage.avv avvVar112 = defpackage.bms.a;
                            cldVarE = defpackage.bms.e(bveVarC);
                        }
                        defpackage.cld cldVar13 = cldVarE;
                        if (i27 != 0) {
                            cldVar3 = null;
                        } else {
                            cldVar3 = cldVar3;
                        }
                        if (i17 != 0) {
                            defpackage.afar afarVar8 = defpackage.ktl.a;
                            i20 = i14;
                            z12 = true;
                            bveVar3 = bveVarC;
                            ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        } else {
                            i20 = i14;
                            bveVar3 = bveVarC;
                            z12 = true;
                        }
                        if (i16 != 0) {
                            defpackage.avv avvVar113 = defpackage.bms.a;
                            bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar2 = bmvVar;
                        }
                        if (i29 != 0) {
                            ajlVar3 = null;
                        } else {
                            ajlVar3 = ajlVar;
                        }
                        if (i6 != 0) {
                            avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                        } else {
                            avvVarK = avvVar;
                        }
                        if (i9 != 0) {
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar.ad(objS);
                            }
                            askVar3 = (defpackage.ask) objS;
                        } else {
                            askVar3 = askVar;
                        }
                        z13 = z4 & z3;
                        if (i20 != 0) {
                            ktlVar5 = null;
                        } else {
                            ktlVar5 = ktlVar2;
                        }
                        avvVar3 = avvVarK;
                        ajlVar4 = ajlVar3;
                        cldVarE = cldVar13;
                    } else {
                        i17 = i3 & 128;
                        i18 = i3 & 32;
                        i19 = i3 & 4;
                        if (i24 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i19 != 0) {
                            ktfVar3 = defpackage.ktf.c;
                        } else {
                            ktfVar3 = ktfVar;
                        }
                        z10 = (!z15) | z;
                        z11 = z16 & z2;
                        if (i18 != 0) {
                            defpackage.avv avvVar114 = defpackage.bms.a;
                            cldVarE = defpackage.bms.e(bveVarC);
                        }
                        defpackage.cld cldVar14 = cldVarE;
                        if (i27 != 0) {
                            cldVar3 = null;
                        } else {
                            cldVar3 = cldVar3;
                        }
                        if (i17 != 0) {
                            defpackage.afar afarVar9 = defpackage.ktl.a;
                            i20 = i14;
                            z12 = true;
                            bveVar3 = bveVarC;
                            ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        } else {
                            i20 = i14;
                            bveVar3 = bveVarC;
                            z12 = true;
                        }
                        if (i16 != 0) {
                            defpackage.avv avvVar115 = defpackage.bms.a;
                            bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar2 = bmvVar;
                        }
                        if (i29 != 0) {
                            ajlVar3 = null;
                        } else {
                            ajlVar3 = ajlVar;
                        }
                        if (i6 != 0) {
                            avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                        } else {
                            avvVarK = avvVar;
                        }
                        if (i9 != 0) {
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar.ad(objS);
                            }
                            askVar3 = (defpackage.ask) objS;
                        } else {
                            askVar3 = askVar;
                        }
                        z13 = z4 & z3;
                        if (i20 != 0) {
                            ktlVar5 = null;
                        } else {
                            ktlVar5 = ktlVar2;
                        }
                        avvVar3 = avvVarK;
                        ajlVar4 = ajlVar3;
                        cldVarE = cldVar14;
                    }
                    bveVar3.l();
                    bveVar3.v(1746334897);
                    if (cldVar3 != null) {
                        bwcVar.Y(false);
                        cldVarI = cldVarE;
                    } else {
                        bwcVar.Y(false);
                        cldVarI = cldVarE;
                    }
                    if (z11) {
                        ktlVar6 = ktlVarJ;
                    } else {
                        ktlVar6 = ktlVarJ;
                    }
                    defpackage.ajl ajlVar9 = ajlVar4;
                    defpackage.avv avvVar116 = avvVar3;
                    defpackage.ask askVar8 = askVar3;
                    boolean z111 = z13;
                    defpackage.dai.aA(defpackage.bpk.b.b(e(ktlVar6)), defpackage.dai.as(842678623, true, new ktw(aferVar2, cgfVar3, ktfVar3, ktlVar6, cldVarI, askVar8, z10, z111, bmvVar2, ajlVar9, avvVar116, affhVar), bveVar3), bveVar3, 56);
                    z8 = z11;
                    cldVar4 = cldVarE;
                    bveVar2 = bveVar3;
                    avvVar2 = avvVar116;
                    askVar2 = askVar8;
                    z7 = z10;
                    cgfVar2 = cgfVar3;
                    ktfVar2 = ktfVar3;
                    ajlVar2 = ajlVar9;
                    z9 = z111;
                    cldVar5 = cldVar3;
                    ktlVar3 = ktlVar5;
                } else {
                    bveVarC.s();
                    cgfVar2 = cgfVar;
                    z7 = z;
                    z8 = z2;
                    bmvVar2 = bmvVar;
                    askVar2 = askVar;
                    z9 = z3;
                    cldVar4 = cldVarE;
                    bveVar2 = bveVarC;
                    cldVar5 = cldVar3;
                    ktfVar2 = ktfVar;
                    ajlVar2 = ajlVar;
                    avvVar2 = avvVar;
                    ktlVar3 = ktlVar2;
                }
                ktlVar4 = ktlVarJ;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new ktn(aferVar, cgfVar2, ktfVar2, z7, z8, cldVar4, cldVar5, ktlVar4, bmvVar2, ajlVar2, avvVar2, askVar2, z9, ktlVar3, affhVar, i, i2, i3);
                }
            }
            i15 = i11 | 24576;
            z5 = true;
            if ((i2 & i5) != 0) {
                i15 |= z5 == bveVarC.E(affhVar) ? 131072 : 65536;
            }
            if ((306783379 & i4) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bveVarC.I(z6, i4 & 1)) {
                i16 = i3 & 256;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    i17 = i3 & 128;
                    i18 = i3 & 32;
                    i19 = i3 & 4;
                    if (i24 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i19 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    z10 = (!z15) | z;
                    z11 = z16 & z2;
                    if (i18 != 0) {
                        defpackage.avv avvVar117 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                    }
                    defpackage.cld cldVar15 = cldVarE;
                    if (i27 != 0) {
                        cldVar3 = null;
                    } else {
                        cldVar3 = cldVar3;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar10 = defpackage.ktl.a;
                        i20 = i14;
                        z12 = true;
                        bveVar3 = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    } else {
                        i20 = i14;
                        bveVar3 = bveVarC;
                        z12 = true;
                    }
                    if (i16 != 0) {
                        defpackage.avv avvVar118 = defpackage.bms.a;
                        bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar2 = bmvVar;
                    }
                    if (i29 != 0) {
                        ajlVar3 = null;
                    } else {
                        ajlVar3 = ajlVar;
                    }
                    if (i6 != 0) {
                        avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                    } else {
                        avvVarK = avvVar;
                    }
                    if (i9 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    z13 = z4 & z3;
                    if (i20 != 0) {
                        ktlVar5 = null;
                    } else {
                        ktlVar5 = ktlVar2;
                    }
                    avvVar3 = avvVarK;
                    ajlVar4 = ajlVar3;
                    cldVarE = cldVar15;
                } else {
                    i17 = i3 & 128;
                    i18 = i3 & 32;
                    i19 = i3 & 4;
                    if (i24 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i19 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    z10 = (!z15) | z;
                    z11 = z16 & z2;
                    if (i18 != 0) {
                        defpackage.avv avvVar119 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                    }
                    defpackage.cld cldVar16 = cldVarE;
                    if (i27 != 0) {
                        cldVar3 = null;
                    } else {
                        cldVar3 = cldVar3;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar11 = defpackage.ktl.a;
                        i20 = i14;
                        z12 = true;
                        bveVar3 = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    } else {
                        i20 = i14;
                        bveVar3 = bveVarC;
                        z12 = true;
                    }
                    if (i16 != 0) {
                        defpackage.avv avvVar1110 = defpackage.bms.a;
                        bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar2 = bmvVar;
                    }
                    if (i29 != 0) {
                        ajlVar3 = null;
                    } else {
                        ajlVar3 = ajlVar;
                    }
                    if (i6 != 0) {
                        avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                    } else {
                        avvVarK = avvVar;
                    }
                    if (i9 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    z13 = z4 & z3;
                    if (i20 != 0) {
                        ktlVar5 = null;
                    } else {
                        ktlVar5 = ktlVar2;
                    }
                    avvVar3 = avvVarK;
                    ajlVar4 = ajlVar3;
                    cldVarE = cldVar16;
                }
                bveVar3.l();
                bveVar3.v(1746334897);
                if (cldVar3 != null) {
                    bwcVar.Y(false);
                    cldVarI = cldVarE;
                } else {
                    bwcVar.Y(false);
                    cldVarI = cldVarE;
                }
                if (z11) {
                    ktlVar6 = ktlVarJ;
                } else {
                    ktlVar6 = ktlVarJ;
                }
                defpackage.ajl ajlVar10 = ajlVar4;
                defpackage.avv avvVar1111 = avvVar3;
                defpackage.ask askVar9 = askVar3;
                boolean z112 = z13;
                defpackage.dai.aA(defpackage.bpk.b.b(e(ktlVar6)), defpackage.dai.as(842678623, true, new ktw(aferVar2, cgfVar3, ktfVar3, ktlVar6, cldVarI, askVar9, z10, z112, bmvVar2, ajlVar10, avvVar1111, affhVar), bveVar3), bveVar3, 56);
                z8 = z11;
                cldVar4 = cldVarE;
                bveVar2 = bveVar3;
                avvVar2 = avvVar1111;
                askVar2 = askVar9;
                z7 = z10;
                cgfVar2 = cgfVar3;
                ktfVar2 = ktfVar3;
                ajlVar2 = ajlVar10;
                z9 = z112;
                cldVar5 = cldVar3;
                ktlVar3 = ktlVar5;
            } else {
                bveVarC.s();
                cgfVar2 = cgfVar;
                z7 = z;
                z8 = z2;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                z9 = z3;
                cldVar4 = cldVarE;
                bveVar2 = bveVarC;
                cldVar5 = cldVar3;
                ktfVar2 = ktfVar;
                ajlVar2 = ajlVar;
                avvVar2 = avvVar;
                ktlVar3 = ktlVar2;
            }
            ktlVar4 = ktlVarJ;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktn(aferVar, cgfVar2, ktfVar2, z7, z8, cldVar4, cldVar5, ktlVar4, bmvVar2, ajlVar2, avvVar2, askVar2, z9, ktlVar3, affhVar, i, i2, i3);
            }
        }
        i7 |= 48;
        i11 = i7;
        i12 = i3 & 4096;
        if (i12 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i12 != 0) {
            i11 |= 384;
        } else if ((i2 & 384) != 0) {
            i11 |= true != bveVarC.D(z3) ? 128 : 256;
        }
        if ((i3 & 8192) != 0) {
            i11 |= 3072;
        } else {
            i13 = i11;
            if ((i2 & 3072) == 0) {
                i11 = i13 | (true == bveVarC.D(false) ? 2048 : 1024);
            }
        }
        i14 = i3 & 16384;
        if (i14 != 0) {
            i15 = i11;
            if ((i2 & 24576) == 0) {
                z5 = true;
                i15 |= true == bveVarC.C(ktlVar2) ? 16384 : 8192;
            }
            if ((i2 & i5) != 0) {
                i15 |= z5 == bveVarC.E(affhVar) ? 131072 : 65536;
            }
            if ((306783379 & i4) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bveVarC.I(z6, i4 & 1)) {
                i16 = i3 & 256;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    i17 = i3 & 128;
                    i18 = i3 & 32;
                    i19 = i3 & 4;
                    if (i24 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i19 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    z10 = (!z15) | z;
                    z11 = z16 & z2;
                    if (i18 != 0) {
                        defpackage.avv avvVar1112 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                    }
                    defpackage.cld cldVar17 = cldVarE;
                    if (i27 != 0) {
                        cldVar3 = null;
                    } else {
                        cldVar3 = cldVar3;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar12 = defpackage.ktl.a;
                        i20 = i14;
                        z12 = true;
                        bveVar3 = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    } else {
                        i20 = i14;
                        bveVar3 = bveVarC;
                        z12 = true;
                    }
                    if (i16 != 0) {
                        defpackage.avv avvVar1113 = defpackage.bms.a;
                        bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar2 = bmvVar;
                    }
                    if (i29 != 0) {
                        ajlVar3 = null;
                    } else {
                        ajlVar3 = ajlVar;
                    }
                    if (i6 != 0) {
                        avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                    } else {
                        avvVarK = avvVar;
                    }
                    if (i9 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    z13 = z4 & z3;
                    if (i20 != 0) {
                        ktlVar5 = null;
                    } else {
                        ktlVar5 = ktlVar2;
                    }
                    avvVar3 = avvVarK;
                    ajlVar4 = ajlVar3;
                    cldVarE = cldVar17;
                } else {
                    i17 = i3 & 128;
                    i18 = i3 & 32;
                    i19 = i3 & 4;
                    if (i24 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i19 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    z10 = (!z15) | z;
                    z11 = z16 & z2;
                    if (i18 != 0) {
                        defpackage.avv avvVar1114 = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                    }
                    defpackage.cld cldVar18 = cldVarE;
                    if (i27 != 0) {
                        cldVar3 = null;
                    } else {
                        cldVar3 = cldVar3;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar13 = defpackage.ktl.a;
                        i20 = i14;
                        z12 = true;
                        bveVar3 = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    } else {
                        i20 = i14;
                        bveVar3 = bveVarC;
                        z12 = true;
                    }
                    if (i16 != 0) {
                        defpackage.avv avvVar1115 = defpackage.bms.a;
                        bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar2 = bmvVar;
                    }
                    if (i29 != 0) {
                        ajlVar3 = null;
                    } else {
                        ajlVar3 = ajlVar;
                    }
                    if (i6 != 0) {
                        avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                    } else {
                        avvVarK = avvVar;
                    }
                    if (i9 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    z13 = z4 & z3;
                    if (i20 != 0) {
                        ktlVar5 = null;
                    } else {
                        ktlVar5 = ktlVar2;
                    }
                    avvVar3 = avvVarK;
                    ajlVar4 = ajlVar3;
                    cldVarE = cldVar18;
                }
                bveVar3.l();
                bveVar3.v(1746334897);
                if (cldVar3 != null) {
                    bwcVar.Y(false);
                    cldVarI = cldVarE;
                } else {
                    bwcVar.Y(false);
                    cldVarI = cldVarE;
                }
                if (z11) {
                    ktlVar6 = ktlVarJ;
                } else {
                    ktlVar6 = ktlVarJ;
                }
                defpackage.ajl ajlVar11 = ajlVar4;
                defpackage.avv avvVar1116 = avvVar3;
                defpackage.ask askVar10 = askVar3;
                boolean z113 = z13;
                defpackage.dai.aA(defpackage.bpk.b.b(e(ktlVar6)), defpackage.dai.as(842678623, true, new ktw(aferVar2, cgfVar3, ktfVar3, ktlVar6, cldVarI, askVar10, z10, z113, bmvVar2, ajlVar11, avvVar1116, affhVar), bveVar3), bveVar3, 56);
                z8 = z11;
                cldVar4 = cldVarE;
                bveVar2 = bveVar3;
                avvVar2 = avvVar1116;
                askVar2 = askVar10;
                z7 = z10;
                cgfVar2 = cgfVar3;
                ktfVar2 = ktfVar3;
                ajlVar2 = ajlVar11;
                z9 = z113;
                cldVar5 = cldVar3;
                ktlVar3 = ktlVar5;
            } else {
                bveVarC.s();
                cgfVar2 = cgfVar;
                z7 = z;
                z8 = z2;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                z9 = z3;
                cldVar4 = cldVarE;
                bveVar2 = bveVarC;
                cldVar5 = cldVar3;
                ktfVar2 = ktfVar;
                ajlVar2 = ajlVar;
                avvVar2 = avvVar;
                ktlVar3 = ktlVar2;
            }
            ktlVar4 = ktlVarJ;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktn(aferVar, cgfVar2, ktfVar2, z7, z8, cldVar4, cldVar5, ktlVar4, bmvVar2, ajlVar2, avvVar2, askVar2, z9, ktlVar3, affhVar, i, i2, i3);
            }
        }
        i15 = i11 | 24576;
        z5 = true;
        if ((i2 & i5) != 0) {
            i15 |= z5 == bveVarC.E(affhVar) ? 131072 : 65536;
        }
        if ((306783379 & i4) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (bveVarC.I(z6, i4 & 1)) {
            i16 = i3 & 256;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                i17 = i3 & 128;
                i18 = i3 & 32;
                i19 = i3 & 4;
                if (i24 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                if (i19 != 0) {
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                z10 = (!z15) | z;
                z11 = z16 & z2;
                if (i18 != 0) {
                    defpackage.avv avvVar1117 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                }
                defpackage.cld cldVar19 = cldVarE;
                if (i27 != 0) {
                    cldVar3 = null;
                } else {
                    cldVar3 = cldVar3;
                }
                if (i17 != 0) {
                    defpackage.afar afarVar14 = defpackage.ktl.a;
                    i20 = i14;
                    z12 = true;
                    bveVar3 = bveVarC;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                } else {
                    i20 = i14;
                    bveVar3 = bveVarC;
                    z12 = true;
                }
                if (i16 != 0) {
                    defpackage.avv avvVar1118 = defpackage.bms.a;
                    bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    bmvVar2 = bmvVar;
                }
                if (i29 != 0) {
                    ajlVar3 = null;
                } else {
                    ajlVar3 = ajlVar;
                }
                if (i6 != 0) {
                    avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                } else {
                    avvVarK = avvVar;
                }
                if (i9 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                z13 = z4 & z3;
                if (i20 != 0) {
                    ktlVar5 = null;
                } else {
                    ktlVar5 = ktlVar2;
                }
                avvVar3 = avvVarK;
                ajlVar4 = ajlVar3;
                cldVarE = cldVar19;
            } else {
                i17 = i3 & 128;
                i18 = i3 & 32;
                i19 = i3 & 4;
                if (i24 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                if (i19 != 0) {
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                z10 = (!z15) | z;
                z11 = z16 & z2;
                if (i18 != 0) {
                    defpackage.avv avvVar1119 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                }
                defpackage.cld cldVar110 = cldVarE;
                if (i27 != 0) {
                    cldVar3 = null;
                } else {
                    cldVar3 = cldVar3;
                }
                if (i17 != 0) {
                    defpackage.afar afarVar15 = defpackage.ktl.a;
                    i20 = i14;
                    z12 = true;
                    bveVar3 = bveVarC;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                } else {
                    i20 = i14;
                    bveVar3 = bveVarC;
                    z12 = true;
                }
                if (i16 != 0) {
                    defpackage.avv avvVar11110 = defpackage.bms.a;
                    bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    bmvVar2 = bmvVar;
                }
                if (i29 != 0) {
                    ajlVar3 = null;
                } else {
                    ajlVar3 = ajlVar;
                }
                if (i6 != 0) {
                    avvVarK = defpackage.asq.K(0.0f, 0.0f, 3);
                } else {
                    avvVarK = avvVar;
                }
                if (i9 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                z13 = z4 & z3;
                if (i20 != 0) {
                    ktlVar5 = null;
                } else {
                    ktlVar5 = ktlVar2;
                }
                avvVar3 = avvVarK;
                ajlVar4 = ajlVar3;
                cldVarE = cldVar110;
            }
            bveVar3.l();
            bveVar3.v(1746334897);
            if (cldVar3 != null) {
                bwcVar.Y(false);
                cldVarI = cldVarE;
            } else {
                bwcVar.Y(false);
                cldVarI = cldVarE;
            }
            if (z11) {
                ktlVar6 = ktlVarJ;
            } else {
                ktlVar6 = ktlVarJ;
            }
            defpackage.ajl ajlVar12 = ajlVar4;
            defpackage.avv avvVar11111 = avvVar3;
            defpackage.ask askVar11 = askVar3;
            boolean z114 = z13;
            defpackage.dai.aA(defpackage.bpk.b.b(e(ktlVar6)), defpackage.dai.as(842678623, true, new ktw(aferVar2, cgfVar3, ktfVar3, ktlVar6, cldVarI, askVar11, z10, z114, bmvVar2, ajlVar12, avvVar11111, affhVar), bveVar3), bveVar3, 56);
            z8 = z11;
            cldVar4 = cldVarE;
            bveVar2 = bveVar3;
            avvVar2 = avvVar11111;
            askVar2 = askVar11;
            z7 = z10;
            cgfVar2 = cgfVar3;
            ktfVar2 = ktfVar3;
            ajlVar2 = ajlVar12;
            z9 = z114;
            cldVar5 = cldVar3;
            ktlVar3 = ktlVar5;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
            z7 = z;
            z8 = z2;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
            z9 = z3;
            cldVar4 = cldVarE;
            bveVar2 = bveVarC;
            cldVar5 = cldVar3;
            ktfVar2 = ktfVar;
            ajlVar2 = ajlVar;
            avvVar2 = avvVar;
            ktlVar3 = ktlVar2;
        }
        ktlVar4 = ktlVarJ;
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new ktn(aferVar, cgfVar2, ktfVar2, z7, z8, cldVar4, cldVar5, ktlVar4, bmvVar2, ajlVar2, avvVar2, askVar2, z9, ktlVar3, affhVar, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:103:0x011b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:117:0x014d  */
    /* JADX WARN: Code duplicated, block: B:130:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0190  */
    /* JADX WARN: Code duplicated, block: B:132:0x0193  */
    /* JADX WARN: Code duplicated, block: B:134:0x0196  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:146:0x0205  */
    /* JADX WARN: Code duplicated, block: B:149:0x0267  */
    /* JADX WARN: Code duplicated, block: B:152:0x027d  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
    public static final void l(defpackage.cne cneVar, java.lang.String str, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        defpackage.cld cldVar2;
        int i8;
        defpackage.ktl ktlVar2;
        int i9;
        int i10;
        boolean z3;
        defpackage.bve bveVar2;
        defpackage.ktf ktfVar2;
        boolean z4;
        defpackage.bmv bmvVar2;
        defpackage.cgf cgfVar3;
        defpackage.cld cldVar3;
        defpackage.ktl ktlVar3;
        defpackage.ask askVar2;
        defpackage.bxl bxlVarJ;
        int i11;
        int i12;
        int i13;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        int i14;
        defpackage.ktf ktfVar3;
        defpackage.cld cldVarA;
        int i15;
        defpackage.bwc bwcVar2;
        defpackage.bve bveVar3;
        defpackage.ktl ktlVarF;
        int i16;
        java.lang.Object objS;
        defpackage.ktf ktfVar4;
        boolean z5;
        defpackage.cgf cgfVar5;
        defpackage.ask askVar3;
        defpackage.bmv bmvVar3;
        defpackage.ktl ktlVar4;
        int i17;
        int i18;
        int i19;
        boolean zE;
        str.getClass();
        aferVar.getClass();
        int i20 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1345738628);
        if (i20 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        int i21 = i3 & 8;
        if (i21 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                i19 = 8192;
                if ((i3 & 16) == 0) {
                    if ((32768 & i) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i19 = 16384;
                    }
                }
                i4 |= i19;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i5 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i4 |= i6;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.D(false)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i4 |= i7;
            }
            if ((12582912 & i) == 0) {
                i18 = 4194304;
                if ((i3 & 128) == 0) {
                    cldVar2 = cldVar;
                    if (bveVarC.C(cldVar2)) {
                        i18 = 8388608;
                    }
                } else {
                    cldVar2 = cldVar;
                }
                i4 |= i18;
            } else {
                cldVar2 = cldVar;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != bveVarC.C(null)) {
                    i8 = 33554432;
                } else {
                    i8 = 67108864;
                }
                i4 |= i8;
            }
            if ((805306368 & i) == 0) {
                i17 = 268435456;
                if ((i3 & 512) == 0) {
                    ktlVar2 = ktlVar;
                    if (bveVarC.C(ktlVar2)) {
                        i17 = 536870912;
                    }
                } else {
                    ktlVar2 = ktlVar;
                }
                i4 |= i17;
            } else {
                ktlVar2 = ktlVar;
            }
            if ((i2 & 6) == 0) {
                i9 = i2 | 2;
            } else {
                i9 = i2;
            }
            i10 = i9 | 432;
            if ((i4 & 306783379) == 306783378 || (i10 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i4 & 1)) {
                i11 = i3 & 512;
                i12 = i3 & 128;
                i13 = i3 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i21 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i13 != 0) {
                        i14 = i4 & (-57345);
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        i14 = i4;
                        ktfVar3 = ktfVar;
                    }
                    boolean z6 = (!z2) | z;
                    if (i12 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        int i22 = defpackage.bqa.a;
                        i14 &= -29360129;
                        cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                    } else {
                        cldVarA = cldVar2;
                    }
                    i15 = i14;
                    if (i11 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        bveVar3 = bveVarC;
                        bwcVar2 = bwcVar;
                        ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                        i16 = i15 & (-1879048193);
                    } else {
                        bwcVar2 = bwcVar;
                        bveVar3 = bveVarC;
                        ktlVarF = ktlVar2;
                        i16 = i15;
                    }
                    defpackage.avv avvVar2 = defpackage.bms.a;
                    defpackage.bmv bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    objS = bwcVar2.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar2.ad(objS);
                    }
                    cldVar2 = cldVarA;
                    ktfVar4 = ktfVar3;
                    z5 = z6;
                    cgfVar5 = cgfVar4;
                    i4 = i16;
                    askVar3 = (defpackage.ask) objS;
                    bmvVar3 = bmvVar4;
                    ktlVar4 = ktlVarF;
                } else {
                    bveVarC.s();
                    if (i13 != 0) {
                        i4 &= -57345;
                    }
                    if (i12 != 0) {
                        i4 &= -29360129;
                    }
                    if (i11 != 0) {
                        i4 &= -1879048193;
                    }
                    ktfVar4 = ktfVar;
                    z5 = z;
                    askVar3 = askVar;
                    cgfVar5 = cgfVar2;
                    bveVar3 = bveVarC;
                    ktlVar4 = ktlVar2;
                    bmvVar3 = bmvVar;
                }
                bveVar3.l();
                defpackage.dfb dfbVar = new defpackage.dfb(str);
                defpackage.ktf ktfVar5 = defpackage.ktf.a;
                int i23 = (i4 & 14) | 8 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192);
                int i24 = i10 & 1008;
                defpackage.bve bveVar4 = bveVar3;
                cldVar3 = cldVar2;
                defpackage.ask askVar4 = askVar3;
                i(cneVar, dfbVar, aferVar, cgfVar5, ktfVar4, z5, false, cldVar3, null, ktlVar4, bmvVar3, askVar4, null, null, bveVar4, i23, i24, 8192);
                bveVar2 = bveVar4;
                z4 = z5;
                ktlVar3 = ktlVar4;
                bmvVar2 = bmvVar3;
                askVar2 = askVar4;
                ktfVar2 = ktfVar4;
                cgfVar3 = cgfVar5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                ktfVar2 = ktfVar;
                z4 = z;
                bmvVar2 = bmvVar;
                cgfVar3 = cgfVar2;
                cldVar3 = cldVar2;
                ktlVar3 = ktlVar2;
                askVar2 = askVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new kts(cneVar, str, aferVar, cgfVar3, ktfVar2, z4, cldVar3, ktlVar3, bmvVar2, askVar2, i, i2, i3, 0);
            }
        }
        i4 |= 3072;
        cgfVar2 = cgfVar;
        if ((i & 24576) == 0) {
            i19 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i19 = 16384;
                }
            }
            i4 |= i19;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i4 |= i6;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != bveVarC.D(false)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i4 |= i7;
        }
        if ((12582912 & i) == 0) {
            i18 = 4194304;
            if ((i3 & 128) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i18 = 8388608;
                }
            } else {
                cldVar2 = cldVar;
            }
            i4 |= i18;
        } else {
            cldVar2 = cldVar;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (true != bveVarC.C(null)) {
                i8 = 33554432;
            } else {
                i8 = 67108864;
            }
            i4 |= i8;
        }
        if ((805306368 & i) == 0) {
            i17 = 268435456;
            if ((i3 & 512) == 0) {
                ktlVar2 = ktlVar;
                if (bveVarC.C(ktlVar2)) {
                    i17 = 536870912;
                }
            } else {
                ktlVar2 = ktlVar;
            }
            i4 |= i17;
        } else {
            ktlVar2 = ktlVar;
        }
        if ((i2 & 6) == 0) {
            i9 = i2 | 2;
        } else {
            i9 = i2;
        }
        i10 = i9 | 432;
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bveVarC.I(z3, i4 & 1)) {
            i11 = i3 & 512;
            i12 = i3 & 128;
            i13 = i3 & 16;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i21 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i13 != 0) {
                    i14 = i4 & (-57345);
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    i14 = i4;
                    ktfVar3 = ktfVar;
                }
                boolean z7 = (!z2) | z;
                if (i12 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    int i25 = defpackage.bqa.a;
                    i14 &= -29360129;
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                } else {
                    cldVarA = cldVar2;
                }
                i15 = i14;
                if (i11 != 0) {
                    defpackage.afar afarVar2 = defpackage.ktl.a;
                    bveVar3 = bveVarC;
                    bwcVar2 = bwcVar;
                    ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                    i16 = i15 & (-1879048193);
                } else {
                    bwcVar2 = bwcVar;
                    bveVar3 = bveVarC;
                    ktlVarF = ktlVar2;
                    i16 = i15;
                }
                defpackage.avv avvVar4 = defpackage.bms.a;
                defpackage.bmv bmvVar5 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                objS = bwcVar2.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar2.ad(objS);
                }
                cldVar2 = cldVarA;
                ktfVar4 = ktfVar3;
                z5 = z7;
                cgfVar5 = cgfVar4;
                i4 = i16;
                askVar3 = (defpackage.ask) objS;
                bmvVar3 = bmvVar5;
                ktlVar4 = ktlVarF;
            } else {
                if (i21 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i13 != 0) {
                    i14 = i4 & (-57345);
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    i14 = i4;
                    ktfVar3 = ktfVar;
                }
                boolean z8 = (!z2) | z;
                if (i12 != 0) {
                    defpackage.avv avvVar5 = defpackage.bms.a;
                    int i26 = defpackage.bqa.a;
                    i14 &= -29360129;
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                } else {
                    cldVarA = cldVar2;
                }
                i15 = i14;
                if (i11 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    bveVar3 = bveVarC;
                    bwcVar2 = bwcVar;
                    ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                    i16 = i15 & (-1879048193);
                } else {
                    bwcVar2 = bwcVar;
                    bveVar3 = bveVarC;
                    ktlVarF = ktlVar2;
                    i16 = i15;
                }
                defpackage.avv avvVar6 = defpackage.bms.a;
                defpackage.bmv bmvVar6 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                objS = bwcVar2.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar2.ad(objS);
                }
                cldVar2 = cldVarA;
                ktfVar4 = ktfVar3;
                z5 = z8;
                cgfVar5 = cgfVar4;
                i4 = i16;
                askVar3 = (defpackage.ask) objS;
                bmvVar3 = bmvVar6;
                ktlVar4 = ktlVarF;
            }
            bveVar3.l();
            defpackage.dfb dfbVar2 = new defpackage.dfb(str);
            defpackage.ktf ktfVar6 = defpackage.ktf.a;
            int i27 = (i4 & 14) | 8 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192);
            int i28 = i10 & 1008;
            defpackage.bve bveVar5 = bveVar3;
            cldVar3 = cldVar2;
            defpackage.ask askVar5 = askVar3;
            i(cneVar, dfbVar2, aferVar, cgfVar5, ktfVar4, z5, false, cldVar3, null, ktlVar4, bmvVar3, askVar5, null, null, bveVar5, i27, i28, 8192);
            bveVar2 = bveVar5;
            z4 = z5;
            ktlVar3 = ktlVar4;
            bmvVar2 = bmvVar3;
            askVar2 = askVar5;
            ktfVar2 = ktfVar4;
            cgfVar3 = cgfVar5;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            ktfVar2 = ktfVar;
            z4 = z;
            bmvVar2 = bmvVar;
            cgfVar3 = cgfVar2;
            cldVar3 = cldVar2;
            ktlVar3 = ktlVar2;
            askVar2 = askVar;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kts(cneVar, str, aferVar, cgfVar3, ktfVar2, z4, cldVar3, ktlVar3, bmvVar2, askVar2, i, i2, i3, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x0144  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165  */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:153:0x020b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0210  */
    /* JADX WARN: Code duplicated, block: B:156:0x0231  */
    /* JADX WARN: Code duplicated, block: B:158:0x0235  */
    /* JADX WARN: Code duplicated, block: B:160:0x023d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0248  */
    /* JADX WARN: Code duplicated, block: B:165:0x029e  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    public static final void m(final defpackage.cne cneVar, final defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.bve bveVar, final int i, final int i2, final int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        defpackage.cld cldVar2;
        int i8;
        defpackage.ktl ktlVarG;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        final defpackage.ktf ktfVar2;
        final boolean z4;
        final defpackage.bmv bmvVar2;
        final defpackage.ask askVar2;
        final defpackage.ktl ktlVar2;
        final defpackage.cgf cgfVar3;
        final defpackage.cld cldVar3;
        defpackage.bxl bxlVarJ;
        int i13;
        int i14;
        int i15;
        int i16;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        defpackage.ktf ktfVar3;
        int i17;
        defpackage.cld cldVarA;
        defpackage.bwc bwcVar2;
        int i18;
        defpackage.bmv bmvVar3;
        defpackage.ask askVar3;
        defpackage.ktl ktlVar3;
        defpackage.bmv bmvVar4;
        defpackage.cld cldVar4;
        java.lang.Object objS;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean zE;
        cneVar.getClass();
        aferVar.getClass();
        int i23 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1098550240);
        if (i23 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        int i24 = i3 & 4;
        if (i24 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i22 = 1024;
                if ((i3 & 8) == 0) {
                    if ((i & 4096) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i22 = 2048;
                    }
                }
                i4 |= i22;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i5 != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i4 |= i6;
            }
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(false)) {
                    i7 = 65536;
                } else {
                    i7 = 131072;
                }
                i4 |= i7;
            }
            if ((1572864 & i) == 0) {
                i21 = 524288;
                if ((i3 & 64) == 0) {
                    cldVar2 = cldVar;
                    if (bveVarC.C(cldVar2)) {
                        i21 = 1048576;
                    }
                } else {
                    cldVar2 = cldVar;
                }
                i4 |= i21;
            } else {
                cldVar2 = cldVar;
            }
            if ((i3 & 128) != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (true != bveVarC.C(null)) {
                    i8 = 4194304;
                } else {
                    i8 = 8388608;
                }
                i4 |= i8;
            }
            if ((100663296 & i) == 0) {
                i20 = 33554432;
                if ((i3 & 256) == 0) {
                    ktlVarG = ktlVar;
                    if (bveVarC.C(ktlVarG)) {
                        i20 = 67108864;
                    }
                } else {
                    ktlVarG = ktlVar;
                }
                i4 |= i20;
            } else {
                ktlVarG = ktlVar;
            }
            if ((i & 805306368) == 0) {
                i19 = 268435456;
                if ((i3 & 512) == 0 && bveVarC.C(bmvVar)) {
                    i19 = 536870912;
                }
                i4 |= i19;
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
                i10 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.C(askVar)) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                i10 = i2 | i11;
            } else {
                i10 = i2;
            }
            i12 = i10 | 48;
            if ((306783379 & i4) == 306783378 || (i12 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i4 & 1)) {
                i13 = i3 & 512;
                i14 = i3 & 256;
                i15 = i3 & 64;
                i16 = i3 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i24 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i16 != 0) {
                        i4 &= -7169;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z5 = (!z2) | z;
                    if (i15 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        int i25 = defpackage.bqa.a;
                        i17 = i4 & (-3670017);
                        cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                    } else {
                        i17 = i4;
                        cldVarA = cldVar2;
                    }
                    if (i14 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        i18 = i13;
                        i17 &= -234881025;
                        bwcVar2 = bwcVar;
                        ktlVarG = defpackage.kgu.g(0L, 0L, 0L, 0L, bveVarC, 255);
                    } else {
                        bwcVar2 = bwcVar;
                        i18 = i13;
                    }
                    if (i18 != 0) {
                        defpackage.avv avvVar2 = defpackage.bms.a;
                        bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        i17 &= -1879048193;
                    } else {
                        bmvVar3 = bmvVar;
                    }
                    if (i9 != 0) {
                        objS = bwcVar2.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar2.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    cgfVar2 = cgfVar4;
                    ktfVar2 = ktfVar3;
                    ktlVar3 = ktlVarG;
                    bmvVar4 = bmvVar3;
                    cldVar4 = cldVarA;
                    z4 = z5;
                } else {
                    bveVarC.s();
                    if (i16 != 0) {
                        i4 &= -7169;
                    }
                    if (i15 != 0) {
                        i4 &= -3670017;
                    }
                    if (i14 != 0) {
                        i4 &= -234881025;
                    }
                    if (i13 != 0) {
                        i4 &= -1879048193;
                    }
                    ktfVar2 = ktfVar;
                    bmvVar4 = bmvVar;
                    askVar3 = askVar;
                    i17 = i4;
                    ktlVar3 = ktlVarG;
                    cldVar4 = cldVar2;
                    z4 = z;
                }
                bveVarC.l();
                defpackage.ktf ktfVar4 = defpackage.ktf.a;
                int i26 = i12 << 3;
                int i27 = i17 << 3;
                cgfVar3 = cgfVar2;
                defpackage.ask askVar4 = askVar3;
                h(cneVar, null, aferVar, cgfVar3, ktfVar2, z4, false, cldVar4, null, ktlVar3, bmvVar4, askVar4, null, null, null, bveVarC, (i17 & 14) | 56 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192), ((i17 >> 27) & 14) | (i26 & 112) | (i26 & 896), 24576);
                cldVar3 = cldVar4;
                ktlVar2 = ktlVar3;
                bmvVar2 = bmvVar4;
                askVar2 = askVar4;
            } else {
                bveVarC.s();
                ktfVar2 = ktfVar;
                z4 = z;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                ktlVar2 = ktlVarG;
                cgfVar3 = cgfVar2;
                cldVar3 = cldVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: ktp
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cne cneVar2 = cneVar;
                        defpackage.afer aferVar2 = aferVar;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        defpackage.ktf ktfVar5 = ktfVar2;
                        boolean z6 = z4;
                        int i28 = i;
                        defpackage.cld cldVar5 = cldVar3;
                        int i29 = i2;
                        int i30 = i28 | 1;
                        int i31 = i29 & 306783378;
                        int i32 = i31 + i31;
                        int i33 = 306783378 & i30;
                        defpackage.bmv bmvVar5 = bmvVar2;
                        int i34 = i29 & 613566756;
                        int i35 = i29 & (-920350135);
                        int i36 = i30 & 613566756;
                        defpackage.ask askVar5 = askVar2;
                        defpackage.khg.m(cneVar2, aferVar2, cgfVar5, ktfVar5, z6, cldVar5, ktlVar2, bmvVar5, askVar5, (defpackage.bve) obj, (i30 & (-920350135)) | i33 | (i36 >> 1) | ((i33 + i33) & i36), i35 | i31 | (i34 >> 1) | (i32 & i34), i3);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i4 |= 384;
        cgfVar2 = cgfVar;
        if ((i & 3072) == 0) {
            i22 = 1024;
            if ((i3 & 8) == 0) {
                if ((i & 4096) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i22 = 2048;
                }
            }
            i4 |= i22;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i4 |= i6;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(false)) {
                i7 = 65536;
            } else {
                i7 = 131072;
            }
            i4 |= i7;
        }
        if ((1572864 & i) == 0) {
            i21 = 524288;
            if ((i3 & 64) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i21 = 1048576;
                }
            } else {
                cldVar2 = cldVar;
            }
            i4 |= i21;
        } else {
            cldVar2 = cldVar;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (true != bveVarC.C(null)) {
                i8 = 4194304;
            } else {
                i8 = 8388608;
            }
            i4 |= i8;
        }
        if ((100663296 & i) == 0) {
            i20 = 33554432;
            if ((i3 & 256) == 0) {
                ktlVarG = ktlVar;
                if (bveVarC.C(ktlVarG)) {
                    i20 = 67108864;
                }
            } else {
                ktlVarG = ktlVar;
            }
            i4 |= i20;
        } else {
            ktlVarG = ktlVar;
        }
        if ((i & 805306368) == 0) {
            i19 = 268435456;
            if ((i3 & 512) == 0) {
                i19 = 536870912;
            }
            i4 |= i19;
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
            i10 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.C(askVar)) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            i10 = i2 | i11;
        } else {
            i10 = i2;
        }
        i12 = i10 | 48;
        if ((306783379 & i4) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bveVarC.I(z3, i4 & 1)) {
            i13 = i3 & 512;
            i14 = i3 & 256;
            i15 = i3 & 64;
            i16 = i3 & 8;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i24 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i16 != 0) {
                    i4 &= -7169;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z6 = (!z2) | z;
                if (i15 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    int i28 = defpackage.bqa.a;
                    i17 = i4 & (-3670017);
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                } else {
                    i17 = i4;
                    cldVarA = cldVar2;
                }
                if (i14 != 0) {
                    defpackage.afar afarVar2 = defpackage.ktl.a;
                    i18 = i13;
                    i17 &= -234881025;
                    bwcVar2 = bwcVar;
                    ktlVarG = defpackage.kgu.g(0L, 0L, 0L, 0L, bveVarC, 255);
                } else {
                    bwcVar2 = bwcVar;
                    i18 = i13;
                }
                if (i18 != 0) {
                    defpackage.avv avvVar4 = defpackage.bms.a;
                    bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i17 &= -1879048193;
                } else {
                    bmvVar3 = bmvVar;
                }
                if (i9 != 0) {
                    objS = bwcVar2.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar2.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                cgfVar2 = cgfVar4;
                ktfVar2 = ktfVar3;
                ktlVar3 = ktlVarG;
                bmvVar4 = bmvVar3;
                cldVar4 = cldVarA;
                z4 = z6;
            } else {
                if (i24 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i16 != 0) {
                    i4 &= -7169;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z7 = (!z2) | z;
                if (i15 != 0) {
                    defpackage.avv avvVar5 = defpackage.bms.a;
                    int i29 = defpackage.bqa.a;
                    i17 = i4 & (-3670017);
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                } else {
                    i17 = i4;
                    cldVarA = cldVar2;
                }
                if (i14 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    i18 = i13;
                    i17 &= -234881025;
                    bwcVar2 = bwcVar;
                    ktlVarG = defpackage.kgu.g(0L, 0L, 0L, 0L, bveVarC, 255);
                } else {
                    bwcVar2 = bwcVar;
                    i18 = i13;
                }
                if (i18 != 0) {
                    defpackage.avv avvVar6 = defpackage.bms.a;
                    bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i17 &= -1879048193;
                } else {
                    bmvVar3 = bmvVar;
                }
                if (i9 != 0) {
                    objS = bwcVar2.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar2.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                cgfVar2 = cgfVar4;
                ktfVar2 = ktfVar3;
                ktlVar3 = ktlVarG;
                bmvVar4 = bmvVar3;
                cldVar4 = cldVarA;
                z4 = z7;
            }
            bveVarC.l();
            defpackage.ktf ktfVar5 = defpackage.ktf.a;
            int i210 = i12 << 3;
            int i211 = i17 << 3;
            cgfVar3 = cgfVar2;
            defpackage.ask askVar5 = askVar3;
            h(cneVar, null, aferVar, cgfVar3, ktfVar2, z4, false, cldVar4, null, ktlVar3, bmvVar4, askVar5, null, null, null, bveVarC, (i17 & 14) | 56 | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (3670016 & i211) | (29360128 & i211) | (234881024 & i211) | (i211 & 1879048192), ((i17 >> 27) & 14) | (i210 & 112) | (i210 & 896), 24576);
            cldVar3 = cldVar4;
            ktlVar2 = ktlVar3;
            bmvVar2 = bmvVar4;
            askVar2 = askVar5;
        } else {
            bveVarC.s();
            ktfVar2 = ktfVar;
            z4 = z;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
            ktlVar2 = ktlVarG;
            cgfVar3 = cgfVar2;
            cldVar3 = cldVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: ktp
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cne cneVar2 = cneVar;
                    defpackage.afer aferVar2 = aferVar;
                    defpackage.cgf cgfVar5 = cgfVar3;
                    defpackage.ktf ktfVar6 = ktfVar2;
                    boolean z8 = z4;
                    int i212 = i;
                    defpackage.cld cldVar5 = cldVar3;
                    int i213 = i2;
                    int i30 = i212 | 1;
                    int i31 = i213 & 306783378;
                    int i32 = i31 + i31;
                    int i33 = 306783378 & i30;
                    defpackage.bmv bmvVar5 = bmvVar2;
                    int i34 = i213 & 613566756;
                    int i35 = i213 & (-920350135);
                    int i36 = i30 & 613566756;
                    defpackage.ask askVar6 = askVar2;
                    defpackage.khg.m(cneVar2, aferVar2, cgfVar5, ktfVar6, z8, cldVar5, ktlVar2, bmvVar5, askVar6, (defpackage.bve) obj, (i30 & (-920350135)) | i33 | (i36 >> 1) | ((i33 + i33) & i36), i35 | i31 | (i34 >> 1) | (i32 & i34), i3);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:120:0x0154  */
    /* JADX WARN: Code duplicated, block: B:122:0x0158  */
    /* JADX WARN: Code duplicated, block: B:124:0x0163  */
    /* JADX WARN: Code duplicated, block: B:125:0x0166  */
    /* JADX WARN: Code duplicated, block: B:130:0x0171  */
    /* JADX WARN: Code duplicated, block: B:132:0x0175  */
    /* JADX WARN: Code duplicated, block: B:135:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0185  */
    /* JADX WARN: Code duplicated, block: B:141:0x018d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0192  */
    /* JADX WARN: Code duplicated, block: B:144:0x0198  */
    /* JADX WARN: Code duplicated, block: B:146:0x019c  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x01af  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:159:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:180:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x0228  */
    /* JADX WARN: Code duplicated, block: B:182:0x022b  */
    /* JADX WARN: Code duplicated, block: B:184:0x022e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0235  */
    /* JADX WARN: Code duplicated, block: B:188:0x023f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0257  */
    /* JADX WARN: Code duplicated, block: B:191:0x025a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0265  */
    /* JADX WARN: Code duplicated, block: B:194:0x0268  */
    /* JADX WARN: Code duplicated, block: B:195:0x0288  */
    /* JADX WARN: Code duplicated, block: B:197:0x028d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0297  */
    /* JADX WARN: Code duplicated, block: B:201:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:203:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:204:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:206:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:207:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:210:0x0313  */
    /* JADX WARN: Code duplicated, block: B:213:0x032a  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public static final void n(defpackage.cne cneVar, defpackage.dfb dfbVar, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.ajl ajlVar, java.util.Map map, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        defpackage.cld cldVar2;
        int i8;
        defpackage.ktl ktlVar2;
        defpackage.bmv bmvVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zE;
        boolean z3;
        defpackage.ktf ktfVar2;
        boolean z4;
        defpackage.ajl ajlVar2;
        defpackage.cgf cgfVar3;
        defpackage.ktl ktlVar3;
        defpackage.cld cldVar3;
        defpackage.bmv bmvVar3;
        defpackage.ask askVar2;
        java.util.Map map2;
        defpackage.bxl bxlVarJ;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        defpackage.bwc bwcVar;
        int i20;
        defpackage.cgf cgfVar4;
        defpackage.ktf ktfVar3;
        defpackage.cld cldVarA;
        defpackage.ktl ktlVarH;
        defpackage.bmv bmvVar4;
        int i21;
        defpackage.ask askVar3;
        defpackage.ajl ajlVarC;
        defpackage.bmv bmvVar5;
        java.util.Map map3;
        defpackage.ask askVar4;
        defpackage.ktf ktfVar4;
        boolean z5;
        int i22;
        defpackage.cgf cgfVar5;
        java.lang.Object objS;
        int i23;
        int i24;
        boolean zE2;
        aferVar.getClass();
        int i25 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1259694506);
        if (i25 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(dfbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        int i26 = i3 & 8;
        if (i26 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                i24 = 8192;
                if ((i3 & 16) == 0) {
                    if ((32768 & i) == 0) {
                        zE2 = bveVarC.C(ktfVar);
                    } else {
                        zE2 = bveVarC.E(ktfVar);
                    }
                    if (zE2) {
                        i24 = 16384;
                    }
                }
                i4 |= i24;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i5 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i4 |= i6;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.D(false)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i4 |= i7;
            }
            if ((12582912 & i) == 0) {
                i23 = 4194304;
                if ((i3 & 128) == 0) {
                    cldVar2 = cldVar;
                    if (bveVarC.C(cldVar2)) {
                        i23 = 8388608;
                    }
                } else {
                    cldVar2 = cldVar;
                }
                i4 |= i23;
            } else {
                cldVar2 = cldVar;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != bveVarC.C(null)) {
                    i8 = 33554432;
                } else {
                    i8 = 67108864;
                }
                i4 |= i8;
            }
            if ((805306368 & i) == 0) {
                if ((i3 & 512) == 0) {
                    ktlVar2 = ktlVar;
                    int i27 = bveVarC.C(ktlVar2) ? 536870912 : 268435456;
                    i4 |= i27;
                } else {
                    ktlVar2 = ktlVar;
                }
                i4 |= i27;
            } else {
                ktlVar2 = ktlVar;
            }
            if ((i2 & 6) == 0) {
                if ((i3 & 1024) == 0) {
                    bmvVar2 = bmvVar;
                    int i28 = bveVarC.C(bmvVar2) ? 4 : 2;
                    i9 = i2 | i28;
                } else {
                    bmvVar2 = bmvVar;
                }
                i9 = i2 | i28;
            } else {
                bmvVar2 = bmvVar;
                i9 = i2;
            }
            i10 = i3 & 2048;
            if (i10 != 0) {
                if ((i2 & 48) == 0) {
                    if (true != bveVarC.C(askVar)) {
                        i11 = 16;
                    } else {
                        i11 = 32;
                    }
                    i9 |= i11;
                }
                if ((i2 & 384) != 0) {
                    i9 |= ((i3 & 4096) == 0 || !bveVarC.C(ajlVar)) ? 128 : 256;
                }
                i12 = i9;
                i13 = i3 & 8192;
                if (i13 != 0) {
                    i12 |= 3072;
                    i14 = i13;
                } else {
                    i14 = i13;
                    if ((i2 & 3072) != 0) {
                        if ((i2 & 4096) == 0) {
                            zE = bveVarC.C(map);
                        } else {
                            zE = bveVarC.E(map);
                        }
                        i12 |= true != zE ? 1024 : 2048;
                    }
                }
                if ((306783379 & i4) == 306783378 || (i12 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i4 & 1)) {
                    i15 = i3 & 4096;
                    i16 = i3 & 1024;
                    i17 = i3 & 512;
                    i18 = i3 & 128;
                    i19 = i3 & 16;
                    bwcVar = (defpackage.bwc) bveVarC;
                    i20 = i12;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i26 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i19 != 0) {
                            i4 &= -57345;
                            ktfVar3 = defpackage.ktf.c;
                        } else {
                            ktfVar3 = ktfVar;
                        }
                        boolean z6 = (!z2) | z;
                        if (i18 != 0) {
                            defpackage.avv avvVar = defpackage.bms.a;
                            int i29 = defpackage.bqa.a;
                            cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                            i4 &= -29360129;
                        } else {
                            cldVarA = cldVar2;
                        }
                        if (i17 != 0) {
                            defpackage.afar afarVar = defpackage.ktl.a;
                            ktlVarH = defpackage.kgu.h(bveVarC);
                            i4 &= -1879048193;
                        } else {
                            ktlVarH = ktlVar2;
                        }
                        if (i16 != 0) {
                            i21 = i20 & (-15);
                            defpackage.avv avvVar2 = defpackage.bms.a;
                            bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar4 = bmvVar2;
                            i21 = i20;
                        }
                        if (i10 != 0) {
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar.ad(objS);
                            }
                            askVar3 = (defpackage.ask) objS;
                        } else {
                            askVar3 = askVar;
                        }
                        if (i15 != 0) {
                            ajlVarC = defpackage.kil.c(askVar3, bveVarC, (i21 >> 3) & 14);
                            i21 &= -897;
                        } else {
                            ajlVarC = ajlVar;
                        }
                        if (i14 != 0) {
                            map3 = defpackage.afcf.a;
                            bmvVar5 = bmvVar4;
                        } else {
                            bmvVar5 = bmvVar4;
                            map3 = map;
                        }
                        askVar4 = askVar3;
                        ktfVar4 = ktfVar3;
                        z5 = z6;
                        i22 = i4;
                        cldVar3 = cldVarA;
                        cgfVar5 = cgfVar4;
                    } else {
                        bveVarC.s();
                        if (i19 != 0) {
                            i4 &= -57345;
                        }
                        if (i18 != 0) {
                            i4 &= -29360129;
                        }
                        if (i17 != 0) {
                            i4 &= -1879048193;
                        }
                        i21 = i16 != 0 ? i20 & (-15) : i20;
                        if (i15 != 0) {
                            i21 &= -897;
                        }
                        ktfVar4 = ktfVar;
                        z5 = z;
                        askVar4 = askVar;
                        i22 = i4;
                        cgfVar5 = cgfVar2;
                        ktlVarH = ktlVar2;
                        cldVar3 = cldVar2;
                        bmvVar5 = bmvVar2;
                        ajlVarC = ajlVar;
                        map3 = map;
                    }
                    bveVarC.l();
                    defpackage.ktf ktfVar5 = defpackage.ktf.a;
                    h(cneVar, dfbVar, aferVar, cgfVar5, ktfVar4, z5, false, cldVar3, null, ktlVarH, bmvVar5, askVar4, ajlVarC, map3, null, bveVarC, (i22 & 14) | 8 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), i21 & 8190, 16384);
                    z4 = z5;
                    ktlVar3 = ktlVarH;
                    bmvVar3 = bmvVar5;
                    askVar2 = askVar4;
                    ajlVar2 = ajlVarC;
                    map2 = map3;
                    ktfVar2 = ktfVar4;
                    cgfVar3 = cgfVar5;
                } else {
                    bveVarC.s();
                    ktfVar2 = ktfVar;
                    z4 = z;
                    ajlVar2 = ajlVar;
                    cgfVar3 = cgfVar2;
                    ktlVar3 = ktlVar2;
                    cldVar3 = cldVar2;
                    bmvVar3 = bmvVar2;
                    askVar2 = askVar;
                    map2 = map;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new ktq(cneVar, dfbVar, aferVar, cgfVar3, ktfVar2, z4, cldVar3, ktlVar3, bmvVar3, askVar2, ajlVar2, map2, i, i2, i3);
                }
            }
            i9 |= 48;
            if ((i2 & 384) != 0) {
                i9 |= ((i3 & 4096) == 0 || !bveVarC.C(ajlVar)) ? 128 : 256;
            }
            i12 = i9;
            i13 = i3 & 8192;
            if (i13 != 0) {
                i12 |= 3072;
                i14 = i13;
            } else {
                i14 = i13;
                if ((i2 & 3072) != 0) {
                    if ((i2 & 4096) == 0) {
                        zE = bveVarC.C(map);
                    } else {
                        zE = bveVarC.E(map);
                    }
                    i12 |= true != zE ? 1024 : 2048;
                }
            }
            if ((306783379 & i4) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bveVarC.I(z3, i4 & 1)) {
                i15 = i3 & 4096;
                i16 = i3 & 1024;
                i17 = i3 & 512;
                i18 = i3 & 128;
                i19 = i3 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                i20 = i12;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i26 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i19 != 0) {
                        i4 &= -57345;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z7 = (!z2) | z;
                    if (i18 != 0) {
                        defpackage.avv avvVar3 = defpackage.bms.a;
                        int i210 = defpackage.bqa.a;
                        cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                        i4 &= -29360129;
                    } else {
                        cldVarA = cldVar2;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar2 = defpackage.ktl.a;
                        ktlVarH = defpackage.kgu.h(bveVarC);
                        i4 &= -1879048193;
                    } else {
                        ktlVarH = ktlVar2;
                    }
                    if (i16 != 0) {
                        i21 = i20 & (-15);
                        defpackage.avv avvVar4 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar4 = bmvVar2;
                        i21 = i20;
                    }
                    if (i10 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i15 != 0) {
                        ajlVarC = defpackage.kil.c(askVar3, bveVarC, (i21 >> 3) & 14);
                        i21 &= -897;
                    } else {
                        ajlVarC = ajlVar;
                    }
                    if (i14 != 0) {
                        map3 = defpackage.afcf.a;
                        bmvVar5 = bmvVar4;
                    } else {
                        bmvVar5 = bmvVar4;
                        map3 = map;
                    }
                    askVar4 = askVar3;
                    ktfVar4 = ktfVar3;
                    z5 = z7;
                    i22 = i4;
                    cldVar3 = cldVarA;
                    cgfVar5 = cgfVar4;
                } else {
                    if (i26 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i19 != 0) {
                        i4 &= -57345;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z8 = (!z2) | z;
                    if (i18 != 0) {
                        defpackage.avv avvVar5 = defpackage.bms.a;
                        int i211 = defpackage.bqa.a;
                        cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                        i4 &= -29360129;
                    } else {
                        cldVarA = cldVar2;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar3 = defpackage.ktl.a;
                        ktlVarH = defpackage.kgu.h(bveVarC);
                        i4 &= -1879048193;
                    } else {
                        ktlVarH = ktlVar2;
                    }
                    if (i16 != 0) {
                        i21 = i20 & (-15);
                        defpackage.avv avvVar6 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar4 = bmvVar2;
                        i21 = i20;
                    }
                    if (i10 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i15 != 0) {
                        ajlVarC = defpackage.kil.c(askVar3, bveVarC, (i21 >> 3) & 14);
                        i21 &= -897;
                    } else {
                        ajlVarC = ajlVar;
                    }
                    if (i14 != 0) {
                        map3 = defpackage.afcf.a;
                        bmvVar5 = bmvVar4;
                    } else {
                        bmvVar5 = bmvVar4;
                        map3 = map;
                    }
                    askVar4 = askVar3;
                    ktfVar4 = ktfVar3;
                    z5 = z8;
                    i22 = i4;
                    cldVar3 = cldVarA;
                    cgfVar5 = cgfVar4;
                }
                bveVarC.l();
                defpackage.ktf ktfVar6 = defpackage.ktf.a;
                h(cneVar, dfbVar, aferVar, cgfVar5, ktfVar4, z5, false, cldVar3, null, ktlVarH, bmvVar5, askVar4, ajlVarC, map3, null, bveVarC, (i22 & 14) | 8 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), i21 & 8190, 16384);
                z4 = z5;
                ktlVar3 = ktlVarH;
                bmvVar3 = bmvVar5;
                askVar2 = askVar4;
                ajlVar2 = ajlVarC;
                map2 = map3;
                ktfVar2 = ktfVar4;
                cgfVar3 = cgfVar5;
            } else {
                bveVarC.s();
                ktfVar2 = ktfVar;
                z4 = z;
                ajlVar2 = ajlVar;
                cgfVar3 = cgfVar2;
                ktlVar3 = ktlVar2;
                cldVar3 = cldVar2;
                bmvVar3 = bmvVar2;
                askVar2 = askVar;
                map2 = map;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktq(cneVar, dfbVar, aferVar, cgfVar3, ktfVar2, z4, cldVar3, ktlVar3, bmvVar3, askVar2, ajlVar2, map2, i, i2, i3);
            }
        }
        i4 |= 3072;
        cgfVar2 = cgfVar;
        if ((i & 24576) == 0) {
            i24 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i) == 0) {
                    zE2 = bveVarC.C(ktfVar);
                } else {
                    zE2 = bveVarC.E(ktfVar);
                }
                if (zE2) {
                    i24 = 16384;
                }
            }
            i4 |= i24;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i4 |= i6;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != bveVarC.D(false)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i4 |= i7;
        }
        if ((12582912 & i) == 0) {
            i23 = 4194304;
            if ((i3 & 128) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i23 = 8388608;
                }
            } else {
                cldVar2 = cldVar;
            }
            i4 |= i23;
        } else {
            cldVar2 = cldVar;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (true != bveVarC.C(null)) {
                i8 = 33554432;
            } else {
                i8 = 67108864;
            }
            i4 |= i8;
        }
        if ((805306368 & i) == 0) {
            if ((i3 & 512) == 0) {
                ktlVar2 = ktlVar;
                if (bveVarC.C(ktlVar2)) {
                }
                i4 |= i27;
            } else {
                ktlVar2 = ktlVar;
            }
            i4 |= i27;
        } else {
            ktlVar2 = ktlVar;
        }
        if ((i2 & 6) == 0) {
            if ((i3 & 1024) == 0) {
                bmvVar2 = bmvVar;
                if (bveVarC.C(bmvVar2)) {
                }
                i9 = i2 | i28;
            } else {
                bmvVar2 = bmvVar;
            }
            i9 = i2 | i28;
        } else {
            bmvVar2 = bmvVar;
            i9 = i2;
        }
        i10 = i3 & 2048;
        if (i10 != 0) {
            if ((i2 & 48) == 0) {
                if (true != bveVarC.C(askVar)) {
                    i11 = 16;
                } else {
                    i11 = 32;
                }
                i9 |= i11;
            }
            if ((i2 & 384) != 0) {
                i9 |= ((i3 & 4096) == 0 || !bveVarC.C(ajlVar)) ? 128 : 256;
            }
            i12 = i9;
            i13 = i3 & 8192;
            if (i13 != 0) {
                i12 |= 3072;
                i14 = i13;
            } else {
                i14 = i13;
                if ((i2 & 3072) != 0) {
                    if ((i2 & 4096) == 0) {
                        zE = bveVarC.C(map);
                    } else {
                        zE = bveVarC.E(map);
                    }
                    i12 |= true != zE ? 1024 : 2048;
                }
            }
            if ((306783379 & i4) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bveVarC.I(z3, i4 & 1)) {
                i15 = i3 & 4096;
                i16 = i3 & 1024;
                i17 = i3 & 512;
                i18 = i3 & 128;
                i19 = i3 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                i20 = i12;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i26 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i19 != 0) {
                        i4 &= -57345;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z9 = (!z2) | z;
                    if (i18 != 0) {
                        defpackage.avv avvVar7 = defpackage.bms.a;
                        int i212 = defpackage.bqa.a;
                        cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                        i4 &= -29360129;
                    } else {
                        cldVarA = cldVar2;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar4 = defpackage.ktl.a;
                        ktlVarH = defpackage.kgu.h(bveVarC);
                        i4 &= -1879048193;
                    } else {
                        ktlVarH = ktlVar2;
                    }
                    if (i16 != 0) {
                        i21 = i20 & (-15);
                        defpackage.avv avvVar8 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar4 = bmvVar2;
                        i21 = i20;
                    }
                    if (i10 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i15 != 0) {
                        ajlVarC = defpackage.kil.c(askVar3, bveVarC, (i21 >> 3) & 14);
                        i21 &= -897;
                    } else {
                        ajlVarC = ajlVar;
                    }
                    if (i14 != 0) {
                        map3 = defpackage.afcf.a;
                        bmvVar5 = bmvVar4;
                    } else {
                        bmvVar5 = bmvVar4;
                        map3 = map;
                    }
                    askVar4 = askVar3;
                    ktfVar4 = ktfVar3;
                    z5 = z9;
                    i22 = i4;
                    cldVar3 = cldVarA;
                    cgfVar5 = cgfVar4;
                } else {
                    if (i26 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i19 != 0) {
                        i4 &= -57345;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z10 = (!z2) | z;
                    if (i18 != 0) {
                        defpackage.avv avvVar9 = defpackage.bms.a;
                        int i213 = defpackage.bqa.a;
                        cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                        i4 &= -29360129;
                    } else {
                        cldVarA = cldVar2;
                    }
                    if (i17 != 0) {
                        defpackage.afar afarVar5 = defpackage.ktl.a;
                        ktlVarH = defpackage.kgu.h(bveVarC);
                        i4 &= -1879048193;
                    } else {
                        ktlVarH = ktlVar2;
                    }
                    if (i16 != 0) {
                        i21 = i20 & (-15);
                        defpackage.avv avvVar10 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar4 = bmvVar2;
                        i21 = i20;
                    }
                    if (i10 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i15 != 0) {
                        ajlVarC = defpackage.kil.c(askVar3, bveVarC, (i21 >> 3) & 14);
                        i21 &= -897;
                    } else {
                        ajlVarC = ajlVar;
                    }
                    if (i14 != 0) {
                        map3 = defpackage.afcf.a;
                        bmvVar5 = bmvVar4;
                    } else {
                        bmvVar5 = bmvVar4;
                        map3 = map;
                    }
                    askVar4 = askVar3;
                    ktfVar4 = ktfVar3;
                    z5 = z10;
                    i22 = i4;
                    cldVar3 = cldVarA;
                    cgfVar5 = cgfVar4;
                }
                bveVarC.l();
                defpackage.ktf ktfVar7 = defpackage.ktf.a;
                h(cneVar, dfbVar, aferVar, cgfVar5, ktfVar4, z5, false, cldVar3, null, ktlVarH, bmvVar5, askVar4, ajlVarC, map3, null, bveVarC, (i22 & 14) | 8 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), i21 & 8190, 16384);
                z4 = z5;
                ktlVar3 = ktlVarH;
                bmvVar3 = bmvVar5;
                askVar2 = askVar4;
                ajlVar2 = ajlVarC;
                map2 = map3;
                ktfVar2 = ktfVar4;
                cgfVar3 = cgfVar5;
            } else {
                bveVarC.s();
                ktfVar2 = ktfVar;
                z4 = z;
                ajlVar2 = ajlVar;
                cgfVar3 = cgfVar2;
                ktlVar3 = ktlVar2;
                cldVar3 = cldVar2;
                bmvVar3 = bmvVar2;
                askVar2 = askVar;
                map2 = map;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktq(cneVar, dfbVar, aferVar, cgfVar3, ktfVar2, z4, cldVar3, ktlVar3, bmvVar3, askVar2, ajlVar2, map2, i, i2, i3);
            }
        }
        i9 |= 48;
        if ((i2 & 384) != 0) {
            i9 |= ((i3 & 4096) == 0 || !bveVarC.C(ajlVar)) ? 128 : 256;
        }
        i12 = i9;
        i13 = i3 & 8192;
        if (i13 != 0) {
            i12 |= 3072;
            i14 = i13;
        } else {
            i14 = i13;
            if ((i2 & 3072) != 0) {
                if ((i2 & 4096) == 0) {
                    zE = bveVarC.C(map);
                } else {
                    zE = bveVarC.E(map);
                }
                i12 |= true != zE ? 1024 : 2048;
            }
        }
        if ((306783379 & i4) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bveVarC.I(z3, i4 & 1)) {
            i15 = i3 & 4096;
            i16 = i3 & 1024;
            i17 = i3 & 512;
            i18 = i3 & 128;
            i19 = i3 & 16;
            bwcVar = (defpackage.bwc) bveVarC;
            i20 = i12;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i26 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i19 != 0) {
                    i4 &= -57345;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z11 = (!z2) | z;
                if (i18 != 0) {
                    defpackage.avv avvVar11 = defpackage.bms.a;
                    int i214 = defpackage.bqa.a;
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                    i4 &= -29360129;
                } else {
                    cldVarA = cldVar2;
                }
                if (i17 != 0) {
                    defpackage.afar afarVar6 = defpackage.ktl.a;
                    ktlVarH = defpackage.kgu.h(bveVarC);
                    i4 &= -1879048193;
                } else {
                    ktlVarH = ktlVar2;
                }
                if (i16 != 0) {
                    i21 = i20 & (-15);
                    defpackage.avv avvVar12 = defpackage.bms.a;
                    bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    bmvVar4 = bmvVar2;
                    i21 = i20;
                }
                if (i10 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                if (i15 != 0) {
                    ajlVarC = defpackage.kil.c(askVar3, bveVarC, (i21 >> 3) & 14);
                    i21 &= -897;
                } else {
                    ajlVarC = ajlVar;
                }
                if (i14 != 0) {
                    map3 = defpackage.afcf.a;
                    bmvVar5 = bmvVar4;
                } else {
                    bmvVar5 = bmvVar4;
                    map3 = map;
                }
                askVar4 = askVar3;
                ktfVar4 = ktfVar3;
                z5 = z11;
                i22 = i4;
                cldVar3 = cldVarA;
                cgfVar5 = cgfVar4;
            } else {
                if (i26 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i19 != 0) {
                    i4 &= -57345;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z12 = (!z2) | z;
                if (i18 != 0) {
                    defpackage.avv avvVar13 = defpackage.bms.a;
                    int i215 = defpackage.bqa.a;
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                    i4 &= -29360129;
                } else {
                    cldVarA = cldVar2;
                }
                if (i17 != 0) {
                    defpackage.afar afarVar7 = defpackage.ktl.a;
                    ktlVarH = defpackage.kgu.h(bveVarC);
                    i4 &= -1879048193;
                } else {
                    ktlVarH = ktlVar2;
                }
                if (i16 != 0) {
                    i21 = i20 & (-15);
                    defpackage.avv avvVar14 = defpackage.bms.a;
                    bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    bmvVar4 = bmvVar2;
                    i21 = i20;
                }
                if (i10 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                if (i15 != 0) {
                    ajlVarC = defpackage.kil.c(askVar3, bveVarC, (i21 >> 3) & 14);
                    i21 &= -897;
                } else {
                    ajlVarC = ajlVar;
                }
                if (i14 != 0) {
                    map3 = defpackage.afcf.a;
                    bmvVar5 = bmvVar4;
                } else {
                    bmvVar5 = bmvVar4;
                    map3 = map;
                }
                askVar4 = askVar3;
                ktfVar4 = ktfVar3;
                z5 = z12;
                i22 = i4;
                cldVar3 = cldVarA;
                cgfVar5 = cgfVar4;
            }
            bveVarC.l();
            defpackage.ktf ktfVar8 = defpackage.ktf.a;
            h(cneVar, dfbVar, aferVar, cgfVar5, ktfVar4, z5, false, cldVar3, null, ktlVarH, bmvVar5, askVar4, ajlVarC, map3, null, bveVarC, (i22 & 14) | 8 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), i21 & 8190, 16384);
            z4 = z5;
            ktlVar3 = ktlVarH;
            bmvVar3 = bmvVar5;
            askVar2 = askVar4;
            ajlVar2 = ajlVarC;
            map2 = map3;
            ktfVar2 = ktfVar4;
            cgfVar3 = cgfVar5;
        } else {
            bveVarC.s();
            ktfVar2 = ktfVar;
            z4 = z;
            ajlVar2 = ajlVar;
            cgfVar3 = cgfVar2;
            ktlVar3 = ktlVar2;
            cldVar3 = cldVar2;
            bmvVar3 = bmvVar2;
            askVar2 = askVar;
            map2 = map;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new ktq(cneVar, dfbVar, aferVar, cgfVar3, ktfVar2, z4, cldVar3, ktlVar3, bmvVar3, askVar2, ajlVar2, map2, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:91:0x01af  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void o(final defpackage.cne cneVar, final java.lang.String str, final defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.ajl ajlVar, defpackage.bve bveVar, final int i, final int i2, final int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        final boolean z3;
        final defpackage.cld cldVar2;
        final defpackage.ktl ktlVar2;
        final defpackage.ask askVar2;
        final defpackage.ajl ajlVar2;
        final defpackage.ktf ktfVar2;
        final defpackage.cgf cgfVar3;
        final defpackage.bmv bmvVar2;
        defpackage.bxl bxlVarJ;
        int i9;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        java.lang.Object objS;
        int i10;
        defpackage.ktf ktfVar3;
        defpackage.ktl ktlVar3;
        int i11;
        defpackage.ask askVar3;
        defpackage.bmv bmvVar3;
        defpackage.ajl ajlVarC;
        defpackage.cld cldVar3;
        boolean z4;
        int i12;
        boolean zE;
        defpackage.ktf ktfVar4 = ktfVar;
        aferVar.getClass();
        int i13 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-407677180);
        if (i13 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        int i14 = i3 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                i12 = 8192;
                if ((i3 & 16) == 0) {
                    if ((32768 & i) == 0) {
                        zE = bveVarC.C(ktfVar4);
                    } else {
                        zE = bveVarC.E(ktfVar4);
                    }
                    if (zE) {
                        i12 = 16384;
                    }
                }
                i4 |= i12;
            }
            i5 = 1769472 | i4;
            if ((12582912 & i) == 0) {
                i5 = i4 | 5963776;
            }
            i6 = 100663296 | i5;
            if ((805306368 & i) == 0) {
                i6 = i5 | 369098752;
            }
            if ((i2 & 6) == 0) {
                i7 = i2 | 2;
            } else {
                i7 = i2;
            }
            i8 = i7 | 48;
            if ((i2 & 384) == 0) {
                i8 = i7 | 176;
            }
            if ((306783379 & i6) == 306783378 || (i8 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i6 & 1)) {
                i9 = i3 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i14 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i9 != 0) {
                        i6 &= -57345;
                        ktfVar4 = defpackage.ktf.c;
                    }
                    defpackage.avv avvVar = defpackage.bms.a;
                    int i15 = defpackage.bqa.a;
                    defpackage.cld cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                    defpackage.afar afarVar = defpackage.ktl.a;
                    defpackage.ktl ktlVarH = defpackage.kgu.h(bveVarC);
                    int i16 = i6 & (-1908408321);
                    int i17 = i8 & (-15);
                    defpackage.bmv bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    int i18 = (i17 >> 3) & 14;
                    defpackage.ask askVar4 = (defpackage.ask) objS;
                    i10 = i8 & (-911);
                    ktfVar3 = ktfVar4;
                    ktlVar3 = ktlVarH;
                    i11 = i16;
                    askVar3 = askVar4;
                    bmvVar3 = bmvVar4;
                    ajlVarC = defpackage.kil.c(askVar4, bveVarC, i18);
                    cldVar3 = cldVarA;
                    z4 = true;
                } else {
                    bveVarC.s();
                    if (i9 != 0) {
                        i6 &= -57345;
                    }
                    int i19 = i6 & (-1908408321);
                    cldVar3 = cldVar;
                    ktlVar3 = ktlVar;
                    bmvVar3 = bmvVar;
                    ajlVarC = ajlVar;
                    ktfVar3 = ktfVar4;
                    i11 = i19;
                    i10 = i8 & (-911);
                    cgfVar4 = cgfVar2;
                    z4 = z;
                    askVar3 = askVar;
                }
                bveVarC.l();
                defpackage.cgf cgfVar5 = cgfVar4;
                defpackage.cld cldVar4 = cldVar3;
                defpackage.dfb dfbVar = new defpackage.dfb(str);
                defpackage.ktf ktfVar5 = defpackage.ktf.a;
                n(cneVar, dfbVar, aferVar, cgfVar5, ktfVar3, z4, cldVar4, ktlVar3, bmvVar3, askVar3, ajlVarC, null, bveVarC, (i11 & 14) | 8 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 234881024), i10 & 112, 8192);
                ajlVar2 = ajlVarC;
                askVar2 = askVar3;
                bmvVar2 = bmvVar3;
                ktlVar2 = ktlVar3;
                cldVar2 = cldVar4;
                z3 = z4;
                ktfVar2 = ktfVar3;
                cgfVar3 = cgfVar5;
            } else {
                bveVarC.s();
                z3 = z;
                cldVar2 = cldVar;
                ktlVar2 = ktlVar;
                askVar2 = askVar;
                ajlVar2 = ajlVar;
                ktfVar2 = ktfVar4;
                cgfVar3 = cgfVar2;
                bmvVar2 = bmvVar;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: ktr
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cne cneVar2 = cneVar;
                        java.lang.String str2 = str;
                        defpackage.afer aferVar2 = aferVar;
                        defpackage.cgf cgfVar6 = cgfVar3;
                        defpackage.ktf ktfVar6 = ktfVar2;
                        boolean z5 = z3;
                        defpackage.cld cldVar5 = cldVar2;
                        int i20 = i;
                        defpackage.ktl ktlVar4 = ktlVar2;
                        int i21 = i2;
                        int i22 = i20 | 1;
                        int i23 = i21 & 306783378;
                        int i24 = i23 + i23;
                        int i25 = 306783378 & i22;
                        defpackage.ask askVar5 = askVar2;
                        int i26 = i21 & 613566756;
                        int i27 = i21 & (-920350135);
                        int i28 = i22 & 613566756;
                        defpackage.ajl ajlVar3 = ajlVar2;
                        defpackage.khg.o(cneVar2, str2, aferVar2, cgfVar6, ktfVar6, z5, cldVar5, ktlVar4, bmvVar2, askVar5, ajlVar3, (defpackage.bve) obj, (i22 & (-920350135)) | i25 | (i28 >> 1) | ((i25 + i25) & i28), i27 | i23 | (i26 >> 1) | (i24 & i26), i3);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i4 |= 3072;
        cgfVar2 = cgfVar;
        if ((i & 24576) == 0) {
            i12 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i) == 0) {
                    zE = bveVarC.C(ktfVar4);
                } else {
                    zE = bveVarC.E(ktfVar4);
                }
                if (zE) {
                    i12 = 16384;
                }
            }
            i4 |= i12;
        }
        i5 = 1769472 | i4;
        if ((12582912 & i) == 0) {
            i5 = i4 | 5963776;
        }
        i6 = 100663296 | i5;
        if ((805306368 & i) == 0) {
            i6 = i5 | 369098752;
        }
        if ((i2 & 6) == 0) {
            i7 = i2 | 2;
        } else {
            i7 = i2;
        }
        i8 = i7 | 48;
        if ((i2 & 384) == 0) {
            i8 = i7 | 176;
        }
        if ((306783379 & i6) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (bveVarC.I(z2, i6 & 1)) {
            i9 = i3 & 16;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i9 != 0) {
                    i6 &= -57345;
                    ktfVar4 = defpackage.ktf.c;
                }
                defpackage.avv avvVar2 = defpackage.bms.a;
                int i110 = defpackage.bqa.a;
                defpackage.cld cldVarA2 = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                defpackage.afar afarVar2 = defpackage.ktl.a;
                defpackage.ktl ktlVarH2 = defpackage.kgu.h(bveVarC);
                int i111 = i6 & (-1908408321);
                int i112 = i8 & (-15);
                defpackage.bmv bmvVar5 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar.ad(objS);
                }
                int i113 = (i112 >> 3) & 14;
                defpackage.ask askVar5 = (defpackage.ask) objS;
                i10 = i8 & (-911);
                ktfVar3 = ktfVar4;
                ktlVar3 = ktlVarH2;
                i11 = i111;
                askVar3 = askVar5;
                bmvVar3 = bmvVar5;
                ajlVarC = defpackage.kil.c(askVar5, bveVarC, i113);
                cldVar3 = cldVarA2;
                z4 = true;
            } else {
                if (i14 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i9 != 0) {
                    i6 &= -57345;
                    ktfVar4 = defpackage.ktf.c;
                }
                defpackage.avv avvVar3 = defpackage.bms.a;
                int i114 = defpackage.bqa.a;
                defpackage.cld cldVarA3 = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                defpackage.afar afarVar3 = defpackage.ktl.a;
                defpackage.ktl ktlVarH3 = defpackage.kgu.h(bveVarC);
                int i115 = i6 & (-1908408321);
                int i116 = i8 & (-15);
                defpackage.bmv bmvVar6 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar.ad(objS);
                }
                int i117 = (i116 >> 3) & 14;
                defpackage.ask askVar6 = (defpackage.ask) objS;
                i10 = i8 & (-911);
                ktfVar3 = ktfVar4;
                ktlVar3 = ktlVarH3;
                i11 = i115;
                askVar3 = askVar6;
                bmvVar3 = bmvVar6;
                ajlVarC = defpackage.kil.c(askVar6, bveVarC, i117);
                cldVar3 = cldVarA3;
                z4 = true;
            }
            bveVarC.l();
            defpackage.cgf cgfVar6 = cgfVar4;
            defpackage.cld cldVar5 = cldVar3;
            defpackage.dfb dfbVar2 = new defpackage.dfb(str);
            defpackage.ktf ktfVar6 = defpackage.ktf.a;
            n(cneVar, dfbVar2, aferVar, cgfVar6, ktfVar3, z4, cldVar5, ktlVar3, bmvVar3, askVar3, ajlVarC, null, bveVarC, (i11 & 14) | 8 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 234881024), i10 & 112, 8192);
            ajlVar2 = ajlVarC;
            askVar2 = askVar3;
            bmvVar2 = bmvVar3;
            ktlVar2 = ktlVar3;
            cldVar2 = cldVar5;
            z3 = z4;
            ktfVar2 = ktfVar3;
            cgfVar3 = cgfVar6;
        } else {
            bveVarC.s();
            z3 = z;
            cldVar2 = cldVar;
            ktlVar2 = ktlVar;
            askVar2 = askVar;
            ajlVar2 = ajlVar;
            ktfVar2 = ktfVar4;
            cgfVar3 = cgfVar2;
            bmvVar2 = bmvVar;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: ktr
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cne cneVar2 = cneVar;
                    java.lang.String str2 = str;
                    defpackage.afer aferVar2 = aferVar;
                    defpackage.cgf cgfVar7 = cgfVar3;
                    defpackage.ktf ktfVar7 = ktfVar2;
                    boolean z5 = z3;
                    defpackage.cld cldVar6 = cldVar2;
                    int i20 = i;
                    defpackage.ktl ktlVar4 = ktlVar2;
                    int i21 = i2;
                    int i22 = i20 | 1;
                    int i23 = i21 & 306783378;
                    int i24 = i23 + i23;
                    int i25 = 306783378 & i22;
                    defpackage.ask askVar7 = askVar2;
                    int i26 = i21 & 613566756;
                    int i27 = i21 & (-920350135);
                    int i28 = i22 & 613566756;
                    defpackage.ajl ajlVar3 = ajlVar2;
                    defpackage.khg.o(cneVar2, str2, aferVar2, cgfVar7, ktfVar7, z5, cldVar6, ktlVar4, bmvVar2, askVar7, ajlVar3, (defpackage.bve) obj, (i22 & (-920350135)) | i25 | (i28 >> 1) | ((i25 + i25) & i28), i27 | i23 | (i26 >> 1) | (i24 & i26), i3);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0114  */
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x011f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0131  */
    /* JADX WARN: Code duplicated, block: B:112:0x0135  */
    /* JADX WARN: Code duplicated, block: B:114:0x013d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0140  */
    /* JADX WARN: Code duplicated, block: B:117:0x0145  */
    /* JADX WARN: Code duplicated, block: B:120:0x014d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0163  */
    /* JADX WARN: Code duplicated, block: B:130:0x016d  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:159:0x0204  */
    /* JADX WARN: Code duplicated, block: B:161:0x020c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0218  */
    /* JADX WARN: Code duplicated, block: B:166:0x0272  */
    /* JADX WARN: Code duplicated, block: B:169:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    public static final void p(defpackage.cne cneVar, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.ajl ajlVar, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        defpackage.cld cldVar2;
        int i8;
        defpackage.ktl ktlVarH;
        defpackage.bmv bmvVar2;
        int i9;
        int i10;
        int i11;
        boolean z3;
        defpackage.ktf ktfVar2;
        boolean z4;
        defpackage.ask askVar2;
        defpackage.ajl ajlVar2;
        defpackage.bmv bmvVar3;
        defpackage.cgf cgfVar3;
        defpackage.ktl ktlVar2;
        defpackage.cld cldVar3;
        defpackage.bxl bxlVarJ;
        int i12;
        int i13;
        int i14;
        int i15;
        defpackage.bwc bwcVar;
        defpackage.ktf ktfVar3;
        defpackage.cld cldVarE;
        defpackage.ask askVar3;
        defpackage.ktl ktlVar3;
        defpackage.bmv bmvVar4;
        defpackage.ajl ajlVarC;
        defpackage.cld cldVar4;
        defpackage.ask askVar4;
        int i16;
        java.lang.Object objS;
        int i17;
        int i18;
        int i19;
        boolean zE;
        cneVar.getClass();
        aferVar.getClass();
        int i20 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1669683422);
        if (i20 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        int i21 = i3 & 4;
        if (i21 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i19 = 1024;
                if ((i3 & 8) == 0) {
                    if ((i & 4096) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i19 = 2048;
                    }
                }
                i4 |= i19;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i5 != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i4 |= i6;
            }
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(false)) {
                    i7 = 65536;
                } else {
                    i7 = 131072;
                }
                i4 |= i7;
            }
            if ((1572864 & i) == 0) {
                i18 = 524288;
                if ((i3 & 64) == 0) {
                    cldVar2 = cldVar;
                    if (bveVarC.C(cldVar2)) {
                        i18 = 1048576;
                    }
                } else {
                    cldVar2 = cldVar;
                }
                i4 |= i18;
            } else {
                cldVar2 = cldVar;
            }
            if ((i3 & 128) != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (true != bveVarC.C(null)) {
                    i8 = 4194304;
                } else {
                    i8 = 8388608;
                }
                i4 |= i8;
            }
            if ((100663296 & i) == 0) {
                i17 = 33554432;
                if ((i3 & 256) == 0) {
                    ktlVarH = ktlVar;
                    if (bveVarC.C(ktlVarH)) {
                        i17 = 67108864;
                    }
                } else {
                    ktlVarH = ktlVar;
                }
                i4 |= i17;
            } else {
                ktlVarH = ktlVar;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    bmvVar2 = bmvVar;
                    int i22 = bveVarC.C(bmvVar2) ? 536870912 : 268435456;
                    i4 |= i22;
                } else {
                    bmvVar2 = bmvVar;
                }
                i4 |= i22;
            } else {
                bmvVar2 = bmvVar;
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
                i10 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.C(askVar)) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                i10 = i2 | i11;
            } else {
                i10 = i2;
            }
            if ((i2 & 48) == 0) {
                i10 |= 16;
            }
            if ((306783379 & i4) == 306783378 || (i10 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i4 & 1)) {
                i12 = i3 & 512;
                i13 = i3 & 256;
                i14 = i3 & 64;
                i15 = i3 & 8;
                int i23 = i10 & (-113);
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i21 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i15 != 0) {
                        i4 &= -7169;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z5 = (!z2) | z;
                    if (i14 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                        i4 &= -3670017;
                    } else {
                        cldVarE = cldVar2;
                    }
                    if (i13 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        ktlVarH = defpackage.kgu.h(bveVarC);
                        i4 &= -234881025;
                    }
                    if (i12 != 0) {
                        defpackage.avv avvVar2 = defpackage.bms.a;
                        i4 &= -1879048193;
                        bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    }
                    if (i9 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    ktfVar2 = ktfVar3;
                    ktlVar3 = ktlVarH;
                    bmvVar4 = bmvVar2;
                    ajlVarC = defpackage.kil.c(askVar3, bveVarC, i10 & 14);
                    cldVar4 = cldVarE;
                    cgfVar3 = cgfVar2;
                    askVar4 = askVar3;
                    i16 = i4;
                    z4 = z5;
                } else {
                    bveVarC.s();
                    if (i15 != 0) {
                        i4 &= -7169;
                    }
                    if (i14 != 0) {
                        i4 &= -3670017;
                    }
                    if (i13 != 0) {
                        i4 &= -234881025;
                    }
                    if (i12 != 0) {
                        i4 &= -1879048193;
                    }
                    ktfVar2 = ktfVar;
                    i16 = i4;
                    ktlVar3 = ktlVarH;
                    bmvVar4 = bmvVar2;
                    cgfVar3 = cgfVar2;
                    cldVar4 = cldVar2;
                    z4 = z;
                    askVar4 = askVar;
                    ajlVarC = ajlVar;
                }
                bveVarC.l();
                int i24 = i16 & 14;
                defpackage.ktf ktfVar4 = defpackage.ktf.a;
                int i25 = (i16 >> 27) & 14;
                int i26 = i16 << 3;
                h(cneVar, null, aferVar, cgfVar3, ktfVar2, z4, false, cldVar4, null, ktlVar3, bmvVar4, askVar4, ajlVarC, null, null, bveVarC, i24 | 56 | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), i25 | ((i23 << 3) & 112), 24576);
                cldVar3 = cldVar4;
                ktlVar2 = ktlVar3;
                bmvVar3 = bmvVar4;
                askVar2 = askVar4;
                ajlVar2 = ajlVarC;
            } else {
                bveVarC.s();
                ktfVar2 = ktfVar;
                z4 = z;
                askVar2 = askVar;
                ajlVar2 = ajlVar;
                bmvVar3 = bmvVar2;
                cgfVar3 = cgfVar2;
                ktlVar2 = ktlVarH;
                cldVar3 = cldVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new kts(cneVar, aferVar, cgfVar3, ktfVar2, z4, cldVar3, ktlVar2, bmvVar3, askVar2, ajlVar2, i, i2, i3, 1);
            }
        }
        i4 |= 384;
        cgfVar2 = cgfVar;
        if ((i & 3072) == 0) {
            i19 = 1024;
            if ((i3 & 8) == 0) {
                if ((i & 4096) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i19 = 2048;
                }
            }
            i4 |= i19;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i4 |= i6;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(false)) {
                i7 = 65536;
            } else {
                i7 = 131072;
            }
            i4 |= i7;
        }
        if ((1572864 & i) == 0) {
            i18 = 524288;
            if ((i3 & 64) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i18 = 1048576;
                }
            } else {
                cldVar2 = cldVar;
            }
            i4 |= i18;
        } else {
            cldVar2 = cldVar;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (true != bveVarC.C(null)) {
                i8 = 4194304;
            } else {
                i8 = 8388608;
            }
            i4 |= i8;
        }
        if ((100663296 & i) == 0) {
            i17 = 33554432;
            if ((i3 & 256) == 0) {
                ktlVarH = ktlVar;
                if (bveVarC.C(ktlVarH)) {
                    i17 = 67108864;
                }
            } else {
                ktlVarH = ktlVar;
            }
            i4 |= i17;
        } else {
            ktlVarH = ktlVar;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                bmvVar2 = bmvVar;
                if (bveVarC.C(bmvVar2)) {
                }
                i4 |= i22;
            } else {
                bmvVar2 = bmvVar;
            }
            i4 |= i22;
        } else {
            bmvVar2 = bmvVar;
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
            i10 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.C(askVar)) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            i10 = i2 | i11;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            i10 |= 16;
        }
        if ((306783379 & i4) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bveVarC.I(z3, i4 & 1)) {
            i12 = i3 & 512;
            i13 = i3 & 256;
            i14 = i3 & 64;
            i15 = i3 & 8;
            int i27 = i10 & (-113);
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i21 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i15 != 0) {
                    i4 &= -7169;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z6 = (!z2) | z;
                if (i14 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                    i4 &= -3670017;
                } else {
                    cldVarE = cldVar2;
                }
                if (i13 != 0) {
                    defpackage.afar afarVar2 = defpackage.ktl.a;
                    ktlVarH = defpackage.kgu.h(bveVarC);
                    i4 &= -234881025;
                }
                if (i12 != 0) {
                    defpackage.avv avvVar4 = defpackage.bms.a;
                    i4 &= -1879048193;
                    bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i9 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                ktfVar2 = ktfVar3;
                ktlVar3 = ktlVarH;
                bmvVar4 = bmvVar2;
                ajlVarC = defpackage.kil.c(askVar3, bveVarC, i10 & 14);
                cldVar4 = cldVarE;
                cgfVar3 = cgfVar2;
                askVar4 = askVar3;
                i16 = i4;
                z4 = z6;
            } else {
                if (i21 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i15 != 0) {
                    i4 &= -7169;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z7 = (!z2) | z;
                if (i14 != 0) {
                    defpackage.avv avvVar5 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                    i4 &= -3670017;
                } else {
                    cldVarE = cldVar2;
                }
                if (i13 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    ktlVarH = defpackage.kgu.h(bveVarC);
                    i4 &= -234881025;
                }
                if (i12 != 0) {
                    defpackage.avv avvVar6 = defpackage.bms.a;
                    i4 &= -1879048193;
                    bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i9 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                ktfVar2 = ktfVar3;
                ktlVar3 = ktlVarH;
                bmvVar4 = bmvVar2;
                ajlVarC = defpackage.kil.c(askVar3, bveVarC, i10 & 14);
                cldVar4 = cldVarE;
                cgfVar3 = cgfVar2;
                askVar4 = askVar3;
                i16 = i4;
                z4 = z7;
            }
            bveVarC.l();
            int i28 = i16 & 14;
            defpackage.ktf ktfVar5 = defpackage.ktf.a;
            int i29 = (i16 >> 27) & 14;
            int i210 = i16 << 3;
            h(cneVar, null, aferVar, cgfVar3, ktfVar2, z4, false, cldVar4, null, ktlVar3, bmvVar4, askVar4, ajlVarC, null, null, bveVarC, i28 | 56 | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (458752 & i210) | (3670016 & i210) | (29360128 & i210) | (234881024 & i210) | (i210 & 1879048192), i29 | ((i27 << 3) & 112), 24576);
            cldVar3 = cldVar4;
            ktlVar2 = ktlVar3;
            bmvVar3 = bmvVar4;
            askVar2 = askVar4;
            ajlVar2 = ajlVarC;
        } else {
            bveVarC.s();
            ktfVar2 = ktfVar;
            z4 = z;
            askVar2 = askVar;
            ajlVar2 = ajlVar;
            bmvVar3 = bmvVar2;
            cgfVar3 = cgfVar2;
            ktlVar2 = ktlVarH;
            cldVar3 = cldVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kts(cneVar, aferVar, cgfVar3, ktfVar2, z4, cldVar3, ktlVar2, bmvVar3, askVar2, ajlVar2, i, i2, i3, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0151  */
    /* JADX WARN: Code duplicated, block: B:123:0x015b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0164  */
    /* JADX WARN: Code duplicated, block: B:126:0x0168  */
    /* JADX WARN: Code duplicated, block: B:128:0x0173  */
    /* JADX WARN: Code duplicated, block: B:129:0x0176  */
    /* JADX WARN: Code duplicated, block: B:131:0x017b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0188  */
    /* JADX WARN: Code duplicated, block: B:136:0x018b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0191  */
    /* JADX WARN: Code duplicated, block: B:140:0x0198  */
    /* JADX WARN: Code duplicated, block: B:142:0x019d  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:163:0x01db  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:182:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x024c  */
    /* JADX WARN: Code duplicated, block: B:184:0x024f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0252  */
    /* JADX WARN: Code duplicated, block: B:187:0x0259  */
    /* JADX WARN: Code duplicated, block: B:190:0x0264  */
    /* JADX WARN: Code duplicated, block: B:191:0x0272  */
    /* JADX WARN: Code duplicated, block: B:194:0x0279  */
    /* JADX WARN: Code duplicated, block: B:196:0x027d  */
    /* JADX WARN: Code duplicated, block: B:197:0x029b  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:200:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:206:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:208:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:211:0x033b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0358  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Instruction removed from duplicated block: B:166:0x01e4, please report this as an issue */
    public static final void q(defpackage.cne cneVar, defpackage.dfb dfbVar, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, boolean z2, defpackage.cld cldVar, defpackage.cld cldVar2, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, java.util.Map map, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean zE;
        boolean z5;
        defpackage.bve bveVar2;
        java.util.Map map2;
        defpackage.cgf cgfVar3;
        defpackage.ktf ktfVar2;
        boolean z6;
        defpackage.cld cldVar3;
        defpackage.cld cldVar4;
        defpackage.ktl ktlVar2;
        defpackage.bmv bmvVar2;
        defpackage.ask askVar2;
        boolean z7;
        defpackage.bxl bxlVarJ;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        defpackage.ktf ktfVar3;
        int i25;
        defpackage.cld cldVarE;
        defpackage.bwc bwcVar2;
        defpackage.ktl ktlVarJ;
        defpackage.bmv bmvVar3;
        defpackage.cld cldVar5;
        defpackage.ktf ktfVar4;
        int i26;
        java.lang.Object objS;
        int i27;
        int i28;
        boolean zE2;
        boolean z8 = z2;
        java.util.Map map3 = map;
        aferVar.getClass();
        int i29 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-434585622);
        if (i29 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(dfbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        int i30 = i3 & 8;
        if (i30 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                i28 = 8192;
                if ((i3 & 16) == 0) {
                    if ((32768 & i) == 0) {
                        zE2 = bveVarC.C(ktfVar);
                    } else {
                        zE2 = bveVarC.E(ktfVar);
                    }
                    if (zE2) {
                        i28 = 16384;
                    }
                }
                i4 |= i28;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i5 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i4 |= i6;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i7 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.D(z8)) {
                    i8 = 524288;
                } else {
                    i8 = 1048576;
                }
                i4 |= i8;
            }
            if ((12582912 & i) == 0) {
                i27 = 4194304;
                if ((i3 & 128) == 0 && bveVarC.C(cldVar)) {
                    i27 = 8388608;
                }
                i4 |= i27;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != bveVarC.C(cldVar2)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i4 |= i10;
            }
            if ((805306368 & i) != 0) {
                i4 |= ((i3 & 512) == 0 || !bveVarC.C(ktlVar)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                i11 = i2 | (((i3 & 1024) == 0 || !bveVarC.C(bmvVar)) ? 2 : 4);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
                i12 = i12;
                i13 = i11 | 48;
            } else {
                if ((i2 & 48) != 0) {
                    if (true != bveVarC.C(askVar)) {
                        i14 = 16;
                    } else {
                        i14 = 32;
                    }
                    i11 |= i14;
                }
                i13 = i11;
            }
            if ((i3 & 4096) != 0) {
                i16 = i13 | 384;
            } else {
                i15 = i13;
                if ((i2 & 384) == 0) {
                    i16 = i15 | (true != bveVarC.C(null) ? 128 : 256);
                } else {
                    i16 = i15;
                }
            }
            i17 = i3 & 8192;
            if (i17 != 0) {
                i19 = i16 | 3072;
            } else {
                i18 = i16;
                if ((i2 & 3072) == 0) {
                    if ((i2 & 4096) == 0) {
                        zE = bveVarC.C(map3);
                    } else {
                        zE = bveVarC.E(map3);
                    }
                    i19 = i18 | (true != zE ? 1024 : 2048);
                } else {
                    i19 = i18;
                }
            }
            if ((306783379 & i4) == 306783378 || (i19 & 1171) != 1170) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i20 = i3 & 1024;
                i21 = i3 & 512;
                i22 = i19;
                i23 = i3 & 128;
                i24 = i3 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i30 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i24 != 0) {
                        i4 &= -57345;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z9 = (!z3) | z;
                    boolean z10 = z8 & z4;
                    if (i23 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        i25 = i4 & (-29360129);
                        cldVarE = defpackage.bms.e(bveVarC);
                    } else {
                        i25 = i4;
                        cldVarE = cldVar;
                    }
                    defpackage.cld cldVar6 = i9 == 0 ? cldVar2 : null;
                    if (i21 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        bwcVar2 = bwcVar;
                        bveVarC = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        i25 &= -1879048193;
                    } else {
                        bwcVar2 = bwcVar;
                        bveVarC = bveVarC;
                        ktlVarJ = ktlVar;
                    }
                    if (i20 != 0) {
                        defpackage.avv avvVar2 = defpackage.bms.a;
                        bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        i22 &= -15;
                    } else {
                        bmvVar3 = bmvVar;
                    }
                    if (i12 != 0) {
                        objS = bwcVar2.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar2.ad(objS);
                        }
                        askVar = (defpackage.ask) objS;
                    } else {
                        askVar = askVar;
                    }
                    if (i17 != 0) {
                        map3 = defpackage.afcf.a;
                    }
                    z8 = z10;
                    map2 = map3;
                    cldVar = cldVarE;
                    ktlVar = ktlVarJ;
                    bmvVar = bmvVar3;
                    z = z9;
                    cgfVar2 = cgfVar4;
                    cldVar5 = cldVar6;
                    ktfVar4 = ktfVar3;
                    i26 = i22;
                    i4 = i25;
                } else {
                    bveVarC.s();
                    if (i24 != 0) {
                        i4 &= -57345;
                    }
                    if (i23 != 0) {
                        i4 &= -29360129;
                    }
                    if (i21 != 0) {
                        i4 &= -1879048193;
                    }
                    i26 = i20 != 0 ? i22 & (-15) : i22;
                    cldVar5 = cldVar2;
                    map2 = map3;
                    ktfVar4 = ktfVar;
                }
                bveVarC.l();
                defpackage.ktf ktfVar5 = defpackage.ktf.a;
                defpackage.bve bveVar3 = bveVarC;
                h(cneVar, dfbVar, aferVar, cgfVar2, ktfVar4, z, z8, cldVar, cldVar5, ktlVar, bmvVar, askVar, null, map2, null, bveVar3, (i4 & 14) | 8 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), i26 & 8190, 16384);
                bveVar2 = bveVar3;
                askVar2 = askVar;
                bmvVar2 = bmvVar;
                ktlVar2 = ktlVar;
                cldVar4 = cldVar5;
                cldVar3 = cldVar;
                z7 = z8;
                z6 = z;
                ktfVar2 = ktfVar4;
                cgfVar3 = cgfVar2;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                defpackage.cgf cgfVar5 = cgfVar2;
                map2 = map3;
                cgfVar3 = cgfVar5;
                ktfVar2 = ktfVar;
                z6 = z;
                cldVar3 = cldVar;
                cldVar4 = cldVar2;
                ktlVar2 = ktlVar;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                z7 = z8;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktm(cneVar, dfbVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVar3, cldVar4, ktlVar2, bmvVar2, askVar2, map2, i, i2, i3);
            }
        }
        i4 |= 3072;
        cgfVar2 = cgfVar;
        if ((i & 24576) == 0) {
            i28 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i) == 0) {
                    zE2 = bveVarC.C(ktfVar);
                } else {
                    zE2 = bveVarC.E(ktfVar);
                }
                if (zE2) {
                    i28 = 16384;
                }
            }
            i4 |= i28;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i4 |= i6;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != bveVarC.D(z8)) {
                i8 = 524288;
            } else {
                i8 = 1048576;
            }
            i4 |= i8;
        }
        if ((12582912 & i) == 0) {
            i27 = 4194304;
            if ((i3 & 128) == 0) {
                i27 = 8388608;
            }
            i4 |= i27;
        }
        i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (true != bveVarC.C(cldVar2)) {
                i10 = 33554432;
            } else {
                i10 = 67108864;
            }
            i4 |= i10;
        }
        if ((805306368 & i) != 0) {
            i4 |= ((i3 & 512) == 0 || !bveVarC.C(ktlVar)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i11 = i2 | (((i3 & 1024) == 0 || !bveVarC.C(bmvVar)) ? 2 : 4);
        } else {
            i11 = i2;
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
            i12 = i12;
            i13 = i11 | 48;
        } else {
            if ((i2 & 48) != 0) {
                if (true != bveVarC.C(askVar)) {
                    i14 = 16;
                } else {
                    i14 = 32;
                }
                i11 |= i14;
            }
            i13 = i11;
        }
        if ((i3 & 4096) != 0) {
            i16 = i13 | 384;
        } else {
            i15 = i13;
            if ((i2 & 384) == 0) {
                i16 = i15 | (true != bveVarC.C(null) ? 128 : 256);
            } else {
                i16 = i15;
            }
        }
        i17 = i3 & 8192;
        if (i17 != 0) {
            i19 = i16 | 3072;
        } else {
            i18 = i16;
            if ((i2 & 3072) == 0) {
                if ((i2 & 4096) == 0) {
                    zE = bveVarC.C(map3);
                } else {
                    zE = bveVarC.E(map3);
                }
                i19 = i18 | (true != zE ? 1024 : 2048);
            } else {
                i19 = i18;
            }
        }
        if ((306783379 & i4) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bveVarC.I(z5, i4 & 1)) {
            i20 = i3 & 1024;
            i21 = i3 & 512;
            i22 = i19;
            i23 = i3 & 128;
            i24 = i3 & 16;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i30 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i24 != 0) {
                    i4 &= -57345;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z11 = (!z3) | z;
                boolean z12 = z8 & z4;
                if (i23 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    i25 = i4 & (-29360129);
                    cldVarE = defpackage.bms.e(bveVarC);
                } else {
                    i25 = i4;
                    cldVarE = cldVar;
                }
                if (i9 == 0) {
                }
                if (i21 != 0) {
                    defpackage.afar afarVar2 = defpackage.ktl.a;
                    bwcVar2 = bwcVar;
                    bveVarC = bveVarC;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    i25 &= -1879048193;
                } else {
                    bwcVar2 = bwcVar;
                    bveVarC = bveVarC;
                    ktlVarJ = ktlVar;
                }
                if (i20 != 0) {
                    defpackage.avv avvVar4 = defpackage.bms.a;
                    bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i22 &= -15;
                } else {
                    bmvVar3 = bmvVar;
                }
                if (i12 != 0) {
                    objS = bwcVar2.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar2.ad(objS);
                    }
                    askVar = (defpackage.ask) objS;
                } else {
                    askVar = askVar;
                }
                if (i17 != 0) {
                    map3 = defpackage.afcf.a;
                }
                z8 = z12;
                map2 = map3;
                cldVar = cldVarE;
                ktlVar = ktlVarJ;
                bmvVar = bmvVar3;
                z = z11;
                cgfVar2 = cgfVar4;
                cldVar5 = cldVar6;
                ktfVar4 = ktfVar3;
                i26 = i22;
                i4 = i25;
            } else {
                if (i30 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i24 != 0) {
                    i4 &= -57345;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z13 = (!z3) | z;
                boolean z14 = z8 & z4;
                if (i23 != 0) {
                    defpackage.avv avvVar5 = defpackage.bms.a;
                    i25 = i4 & (-29360129);
                    cldVarE = defpackage.bms.e(bveVarC);
                } else {
                    i25 = i4;
                    cldVarE = cldVar;
                }
                if (i9 == 0) {
                }
                if (i21 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    bwcVar2 = bwcVar;
                    bveVarC = bveVarC;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    i25 &= -1879048193;
                } else {
                    bwcVar2 = bwcVar;
                    bveVarC = bveVarC;
                    ktlVarJ = ktlVar;
                }
                if (i20 != 0) {
                    defpackage.avv avvVar6 = defpackage.bms.a;
                    bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i22 &= -15;
                } else {
                    bmvVar3 = bmvVar;
                }
                if (i12 != 0) {
                    objS = bwcVar2.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar2.ad(objS);
                    }
                    askVar = (defpackage.ask) objS;
                } else {
                    askVar = askVar;
                }
                if (i17 != 0) {
                    map3 = defpackage.afcf.a;
                }
                z8 = z14;
                map2 = map3;
                cldVar = cldVarE;
                ktlVar = ktlVarJ;
                bmvVar = bmvVar3;
                z = z13;
                cgfVar2 = cgfVar4;
                cldVar5 = cldVar6;
                ktfVar4 = ktfVar3;
                i26 = i22;
                i4 = i25;
            }
            bveVarC.l();
            defpackage.ktf ktfVar6 = defpackage.ktf.a;
            defpackage.bve bveVar4 = bveVarC;
            h(cneVar, dfbVar, aferVar, cgfVar2, ktfVar4, z, z8, cldVar, cldVar5, ktlVar, bmvVar, askVar, null, map2, null, bveVar4, (i4 & 14) | 8 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), i26 & 8190, 16384);
            bveVar2 = bveVar4;
            askVar2 = askVar;
            bmvVar2 = bmvVar;
            ktlVar2 = ktlVar;
            cldVar4 = cldVar5;
            cldVar3 = cldVar;
            z7 = z8;
            z6 = z;
            ktfVar2 = ktfVar4;
            cgfVar3 = cgfVar2;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            defpackage.cgf cgfVar6 = cgfVar2;
            map2 = map3;
            cgfVar3 = cgfVar6;
            ktfVar2 = ktfVar;
            z6 = z;
            cldVar3 = cldVar;
            cldVar4 = cldVar2;
            ktlVar2 = ktlVar;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
            z7 = z8;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new ktm(cneVar, dfbVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVar3, cldVar4, ktlVar2, bmvVar2, askVar2, map2, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:110:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:118:0x0151  */
    /* JADX WARN: Code duplicated, block: B:121:0x015b  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x0276  */
    /* JADX WARN: Code duplicated, block: B:157:0x028f  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x015b, please report this as an issue */
    public static final void r(defpackage.cne cneVar, java.lang.String str, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, boolean z2, defpackage.cld cldVar, defpackage.cld cldVar2, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        defpackage.cld cldVarE;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z5;
        defpackage.ktf ktfVar2;
        boolean z6;
        boolean z7;
        defpackage.cld cldVar3;
        defpackage.ktl ktlVar2;
        defpackage.cgf cgfVar3;
        defpackage.cld cldVar4;
        defpackage.bmv bmvVar2;
        defpackage.ask askVar2;
        defpackage.bxl bxlVarJ;
        int i13;
        int i14;
        int i15;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        defpackage.ktf ktfVar3;
        defpackage.bve bveVar2;
        defpackage.ktl ktlVarJ;
        java.lang.Object objS;
        defpackage.bmv bmvVar3;
        defpackage.ktf ktfVar4;
        defpackage.cgf cgfVar5;
        defpackage.cld cldVar5;
        boolean z8;
        defpackage.ktl ktlVar3;
        boolean z9;
        defpackage.ask askVar3;
        int i16;
        defpackage.cld cldVar6;
        int i17;
        int i18;
        int i19;
        boolean zE;
        str.getClass();
        aferVar.getClass();
        int i20 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1832855356);
        if (i20 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        int i21 = i3 & 8;
        if (i21 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                i19 = 8192;
                if ((i3 & 16) == 0) {
                    if ((32768 & i) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i19 = 16384;
                    }
                }
                i4 |= i19;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i5 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i4 |= i6;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i7 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.D(z2)) {
                    i8 = 524288;
                } else {
                    i8 = 1048576;
                }
                i4 |= i8;
            }
            if ((12582912 & i) == 0) {
                i18 = 4194304;
                if ((i3 & 128) == 0) {
                    cldVarE = cldVar;
                    if (bveVarC.C(cldVarE)) {
                        i18 = 8388608;
                    }
                } else {
                    cldVarE = cldVar;
                }
                i4 |= i18;
            } else {
                cldVarE = cldVar;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != bveVarC.C(cldVar2)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i4 |= i10;
            }
            if ((805306368 & i) == 0) {
                i17 = 268435456;
                if ((i3 & 512) == 0 && bveVarC.C(ktlVar)) {
                    i17 = 536870912;
                }
                i4 |= i17;
            }
            if ((i2 & 6) == 0) {
                i11 = i2 | 2;
            } else {
                i11 = i2;
            }
            i12 = i11 | 432;
            if ((i4 & 306783379) == 306783378 || (i12 & 147) != 146) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i13 = i3 & 512;
                i14 = i3 & 128;
                i15 = i3 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i21 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i15 != 0) {
                        i4 &= -57345;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z10 = (!z3) | z;
                    boolean z11 = z4 & z2;
                    if (i14 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                        i4 &= -29360129;
                    }
                    defpackage.cld cldVar7 = i9 == 0 ? cldVar2 : null;
                    if (i13 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        bveVar2 = bveVarC;
                        i4 = (-1879048193) & i4;
                    } else {
                        bveVar2 = bveVarC;
                        ktlVarJ = ktlVar;
                    }
                    defpackage.avv avvVar2 = defpackage.bms.a;
                    defpackage.bmv bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    defpackage.cgf cgfVar6 = cgfVar4;
                    objS = bwcVar.S();
                    defpackage.cld cldVar8 = cldVar7;
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    defpackage.ktf ktfVar5 = ktfVar3;
                    bmvVar3 = bmvVar4;
                    ktfVar4 = ktfVar5;
                    cgfVar5 = cgfVar6;
                    cldVar5 = cldVar8;
                    z8 = z10;
                    ktlVar3 = ktlVarJ;
                    z9 = z11;
                    askVar3 = (defpackage.ask) objS;
                    i16 = i4;
                    cldVar6 = cldVarE;
                } else {
                    bveVarC.s();
                    if (i15 != 0) {
                        i4 &= -57345;
                    }
                    if (i14 != 0) {
                        i4 &= -29360129;
                    }
                    if (i13 != 0) {
                        i4 &= -1879048193;
                    }
                    ktfVar4 = ktfVar;
                    z8 = z;
                    z9 = z2;
                    cldVar5 = cldVar2;
                    ktlVar3 = ktlVar;
                    bmvVar3 = bmvVar;
                    i16 = i4;
                    cgfVar5 = cgfVar2;
                    cldVar6 = cldVarE;
                    bveVar2 = bveVarC;
                    askVar3 = askVar;
                }
                bveVar2.l();
                defpackage.dfb dfbVar = new defpackage.dfb(str);
                defpackage.ktf ktfVar6 = defpackage.ktf.a;
                int i22 = i12 & 1008;
                defpackage.cld cldVar9 = cldVar5;
                bveVarC = bveVar2;
                q(cneVar, dfbVar, aferVar, cgfVar5, ktfVar4, z8, z9, cldVar6, cldVar9, ktlVar3, bmvVar3, askVar3, null, bveVarC, (i16 & 1879048192) | (i16 & 14) | 8 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16), i22, 8192);
                askVar2 = askVar3;
                bmvVar2 = bmvVar3;
                ktlVar2 = ktlVar3;
                cldVar3 = cldVar9;
                cldVar4 = cldVar6;
                z7 = z9;
                z6 = z8;
                ktfVar2 = ktfVar4;
                cgfVar3 = cgfVar5;
            } else {
                bveVarC.s();
                ktfVar2 = ktfVar;
                z6 = z;
                z7 = z2;
                cldVar3 = cldVar2;
                ktlVar2 = ktlVar;
                cgfVar3 = cgfVar2;
                cldVar4 = cldVarE;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.ktu(cneVar, str, aferVar, cgfVar3, ktfVar2, z6, z7, cldVar4, cldVar3, ktlVar2, bmvVar2, askVar2, i, i2, i3, 0);
            }
        }
        i4 |= 3072;
        cgfVar2 = cgfVar;
        if ((i & 24576) == 0) {
            i19 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i19 = 16384;
                }
            }
            i4 |= i19;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i4 |= i6;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != bveVarC.D(z2)) {
                i8 = 524288;
            } else {
                i8 = 1048576;
            }
            i4 |= i8;
        }
        if ((12582912 & i) == 0) {
            i18 = 4194304;
            if ((i3 & 128) == 0) {
                cldVarE = cldVar;
                if (bveVarC.C(cldVarE)) {
                    i18 = 8388608;
                }
            } else {
                cldVarE = cldVar;
            }
            i4 |= i18;
        } else {
            cldVarE = cldVar;
        }
        i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (true != bveVarC.C(cldVar2)) {
                i10 = 33554432;
            } else {
                i10 = 67108864;
            }
            i4 |= i10;
        }
        if ((805306368 & i) == 0) {
            i17 = 268435456;
            if ((i3 & 512) == 0) {
                i17 = 536870912;
            }
            i4 |= i17;
        }
        if ((i2 & 6) == 0) {
            i11 = i2 | 2;
        } else {
            i11 = i2;
        }
        i12 = i11 | 432;
        if ((i4 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bveVarC.I(z5, i4 & 1)) {
            i13 = i3 & 512;
            i14 = i3 & 128;
            i15 = i3 & 16;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i21 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i15 != 0) {
                    i4 &= -57345;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z12 = (!z3) | z;
                boolean z13 = z4 & z2;
                if (i14 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                    i4 &= -29360129;
                }
                if (i9 == 0) {
                }
                if (i13 != 0) {
                    defpackage.afar afarVar2 = defpackage.ktl.a;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    bveVar2 = bveVarC;
                    i4 = (-1879048193) & i4;
                } else {
                    bveVar2 = bveVarC;
                    ktlVarJ = ktlVar;
                }
                defpackage.avv avvVar4 = defpackage.bms.a;
                defpackage.bmv bmvVar5 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                defpackage.cgf cgfVar7 = cgfVar4;
                objS = bwcVar.S();
                defpackage.cld cldVar10 = cldVar7;
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar.ad(objS);
                }
                defpackage.ktf ktfVar7 = ktfVar3;
                bmvVar3 = bmvVar5;
                ktfVar4 = ktfVar7;
                cgfVar5 = cgfVar7;
                cldVar5 = cldVar10;
                z8 = z12;
                ktlVar3 = ktlVarJ;
                z9 = z13;
                askVar3 = (defpackage.ask) objS;
                i16 = i4;
                cldVar6 = cldVarE;
            } else {
                if (i21 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i15 != 0) {
                    i4 &= -57345;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z14 = (!z3) | z;
                boolean z15 = z4 & z2;
                if (i14 != 0) {
                    defpackage.avv avvVar5 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                    i4 &= -29360129;
                }
                if (i9 == 0) {
                }
                if (i13 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    bveVar2 = bveVarC;
                    i4 = (-1879048193) & i4;
                } else {
                    bveVar2 = bveVarC;
                    ktlVarJ = ktlVar;
                }
                defpackage.avv avvVar6 = defpackage.bms.a;
                defpackage.bmv bmvVar6 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                defpackage.cgf cgfVar8 = cgfVar4;
                objS = bwcVar.S();
                defpackage.cld cldVar11 = cldVar7;
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar.ad(objS);
                }
                defpackage.ktf ktfVar8 = ktfVar3;
                bmvVar3 = bmvVar6;
                ktfVar4 = ktfVar8;
                cgfVar5 = cgfVar8;
                cldVar5 = cldVar11;
                z8 = z14;
                ktlVar3 = ktlVarJ;
                z9 = z15;
                askVar3 = (defpackage.ask) objS;
                i16 = i4;
                cldVar6 = cldVarE;
            }
            bveVar2.l();
            defpackage.dfb dfbVar2 = new defpackage.dfb(str);
            defpackage.ktf ktfVar9 = defpackage.ktf.a;
            int i23 = i12 & 1008;
            defpackage.cld cldVar12 = cldVar5;
            bveVarC = bveVar2;
            q(cneVar, dfbVar2, aferVar, cgfVar5, ktfVar4, z8, z9, cldVar6, cldVar12, ktlVar3, bmvVar3, askVar3, null, bveVarC, (i16 & 1879048192) | (i16 & 14) | 8 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16), i23, 8192);
            askVar2 = askVar3;
            bmvVar2 = bmvVar3;
            ktlVar2 = ktlVar3;
            cldVar3 = cldVar12;
            cldVar4 = cldVar6;
            z7 = z9;
            z6 = z8;
            ktfVar2 = ktfVar4;
            cgfVar3 = cgfVar5;
        } else {
            bveVarC.s();
            ktfVar2 = ktfVar;
            z6 = z;
            z7 = z2;
            cldVar3 = cldVar2;
            ktlVar2 = ktlVar;
            cgfVar3 = cgfVar2;
            cldVar4 = cldVarE;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.ktu(cneVar, str, aferVar, cgfVar3, ktfVar2, z6, z7, cldVar4, cldVar3, ktlVar2, bmvVar2, askVar2, i, i2, i3, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x0159  */
    /* JADX WARN: Code duplicated, block: B:122:0x015e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0169  */
    /* JADX WARN: Code duplicated, block: B:126:0x016c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0170  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:131:0x017a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0184  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:138:0x018f  */
    /* JADX WARN: Code duplicated, block: B:141:0x019b  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:168:0x0210 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0212  */
    /* JADX WARN: Code duplicated, block: B:170:0x0215  */
    /* JADX WARN: Code duplicated, block: B:172:0x0218  */
    /* JADX WARN: Code duplicated, block: B:173:0x021d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0229  */
    /* JADX WARN: Code duplicated, block: B:177:0x0238  */
    /* JADX WARN: Code duplicated, block: B:179:0x023e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0241  */
    /* JADX WARN: Code duplicated, block: B:182:0x0245  */
    /* JADX WARN: Code duplicated, block: B:183:0x0262  */
    /* JADX WARN: Code duplicated, block: B:185:0x026b  */
    /* JADX WARN: Code duplicated, block: B:186:0x028d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0291  */
    /* JADX WARN: Code duplicated, block: B:190:0x0299  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:198:0x030e  */
    /* JADX WARN: Code duplicated, block: B:201:0x032a  */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    public static final void s(defpackage.cne cneVar, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z, boolean z2, defpackage.cld cldVar, defpackage.cld cldVar2, defpackage.ktl ktlVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.ktl ktlVar2, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        defpackage.cld cldVar3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        defpackage.bve bveVar2;
        defpackage.ktf ktfVar2;
        boolean z6;
        defpackage.cld cldVarE;
        defpackage.ktl ktlVarJ;
        defpackage.bmv bmvVar2;
        defpackage.ask askVar2;
        boolean z7;
        defpackage.cgf cgfVar3;
        defpackage.cld cldVar4;
        defpackage.ktl ktlVar3;
        defpackage.bxl bxlVarJ;
        int i18;
        int i19;
        int i20;
        int i21;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        int i22;
        defpackage.ktl ktlVar4;
        defpackage.bve bveVar3;
        defpackage.ask askVar3;
        defpackage.ktl ktlVar5;
        java.lang.Object objS;
        int i23;
        int i24;
        boolean zE;
        cneVar.getClass();
        aferVar.getClass();
        int i25 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-632367756);
        if (i25 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        int i26 = i3 & 4;
        if (i26 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i24 = 1024;
                if ((i3 & 8) == 0) {
                    if ((i & 4096) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i24 = 2048;
                    }
                }
                i4 |= i24;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i5 != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z2)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i4 |= i8;
            }
            if ((1572864 & i) == 0) {
                i23 = 524288;
                if ((i3 & 64) == 0 && bveVarC.C(cldVar)) {
                    i23 = 1048576;
                }
                i4 |= i23;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
                cldVar3 = cldVar2;
            } else {
                cldVar3 = cldVar2;
                if ((i & 12582912) == 0) {
                    if (true != bveVarC.C(cldVar3)) {
                        i10 = 4194304;
                    } else {
                        i10 = 8388608;
                    }
                    i4 |= i10;
                }
            }
            if ((100663296 & i) != 0) {
                i4 |= ((i3 & 256) == 0 || !bveVarC.C(ktlVar)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !bveVarC.C(bmvVar)) ? 268435456 : 536870912;
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
                i12 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.C(askVar)) {
                    i13 = 2;
                } else {
                    i13 = 4;
                }
                i12 = i2 | i13;
            } else {
                i12 = i2;
            }
            if ((i3 & 2048) != 0) {
                i12 |= 48;
            } else if ((i2 & 48) == 0) {
                if (true != bveVarC.C(null)) {
                    i14 = 16;
                } else {
                    i14 = 32;
                }
                i12 |= i14;
            }
            i15 = i12;
            i16 = i3 & 4096;
            if (i16 != 0) {
                i17 = i15 | 384;
            } else if ((i2 & 384) == 0) {
                i17 = i15 | (true == bveVarC.C(ktlVar2) ? 256 : 128);
            } else {
                i17 = i15;
            }
            if ((306783379 & i4) == 306783378 || (i17 & 147) != 146) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i18 = i3 & 512;
                i19 = i3 & 256;
                i20 = i3 & 64;
                i21 = i3 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                int i27 = i17;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i26 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i21 != 0) {
                        i4 &= -7169;
                        ktfVar2 = defpackage.ktf.c;
                    } else {
                        ktfVar2 = ktfVar;
                    }
                    z6 = (!z3) | z;
                    z7 = z4 & z2;
                    if (i20 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        i22 = i4 & (-3670017);
                        cldVarE = defpackage.bms.e(bveVarC);
                    } else {
                        i22 = i4;
                        cldVarE = cldVar;
                    }
                    if (i9 != 0) {
                        cldVar4 = null;
                    } else {
                        cldVar4 = cldVar3;
                    }
                    if (i19 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        bveVar3 = bveVarC;
                        ktlVar4 = null;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar3, 255);
                        i22 &= -234881025;
                    } else {
                        ktlVar4 = null;
                        bveVar3 = bveVarC;
                        ktlVarJ = ktlVar;
                    }
                    if (i18 != 0) {
                        defpackage.avv avvVar2 = defpackage.bms.a;
                        bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        i22 &= -1879048193;
                    } else {
                        bmvVar2 = bmvVar;
                    }
                    if (i11 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i16 != 0) {
                        ktlVar5 = ktlVar4;
                    } else {
                        ktlVar5 = ktlVar2;
                    }
                    cgfVar3 = cgfVar4;
                    askVar2 = askVar3;
                } else {
                    bveVarC.s();
                    if (i21 != 0) {
                        i4 &= -7169;
                    }
                    if (i20 != 0) {
                        i4 &= -3670017;
                    }
                    if (i19 != 0) {
                        i4 &= -234881025;
                    }
                    if (i18 != 0) {
                        i4 &= -1879048193;
                    }
                    ktfVar2 = ktfVar;
                    z6 = z;
                    ktlVarJ = ktlVar;
                    bmvVar2 = bmvVar;
                    askVar2 = askVar;
                    ktlVar5 = ktlVar2;
                    z7 = z2;
                    i22 = i4;
                    cgfVar3 = cgfVar2;
                    cldVar4 = cldVar3;
                    bveVar3 = bveVarC;
                    cldVarE = cldVar;
                }
                bveVar3.l();
                defpackage.ktf ktfVar3 = defpackage.ktf.a;
                int i28 = i27 << 3;
                int i29 = i22 << 3;
                defpackage.bve bveVar4 = bveVar3;
                h(cneVar, null, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVarJ, bmvVar2, askVar2, null, null, ktlVar5, bveVar4, (i22 & 14) | 56 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (234881024 & i29) | (1879048192 & i29), (i28 & 896) | ((i22 >> 27) & 14) | (i28 & 112) | ((i27 << 6) & 57344), 8192);
                bveVar2 = bveVar4;
                ktlVar3 = ktlVar5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                ktfVar2 = ktfVar;
                z6 = z;
                cldVarE = cldVar;
                ktlVarJ = ktlVar;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
                z7 = z2;
                cgfVar3 = cgfVar2;
                cldVar4 = cldVar3;
                ktlVar3 = ktlVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new ktt(cneVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVarJ, bmvVar2, askVar2, ktlVar3, i, i2, i3, 1);
            }
        }
        i4 |= 384;
        cgfVar2 = cgfVar;
        if ((i & 3072) == 0) {
            i24 = 1024;
            if ((i3 & 8) == 0) {
                if ((i & 4096) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i24 = 2048;
                }
            }
            i4 |= i24;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i4 |= i6;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z2)) {
                i8 = 65536;
            } else {
                i8 = 131072;
            }
            i4 |= i8;
        }
        if ((1572864 & i) == 0) {
            i23 = 524288;
            if ((i3 & 64) == 0) {
                i23 = 1048576;
            }
            i4 |= i23;
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
            cldVar3 = cldVar2;
        } else {
            cldVar3 = cldVar2;
            if ((i & 12582912) == 0) {
                if (true != bveVarC.C(cldVar3)) {
                    i10 = 4194304;
                } else {
                    i10 = 8388608;
                }
                i4 |= i10;
            }
        }
        if ((100663296 & i) != 0) {
            i4 |= ((i3 & 256) == 0 || !bveVarC.C(ktlVar)) ? 33554432 : 67108864;
        }
        if ((i & 805306368) != 0) {
            i4 |= ((i3 & 512) == 0 || !bveVarC.C(bmvVar)) ? 268435456 : 536870912;
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
            i12 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.C(askVar)) {
                i13 = 2;
            } else {
                i13 = 4;
            }
            i12 = i2 | i13;
        } else {
            i12 = i2;
        }
        if ((i3 & 2048) != 0) {
            i12 |= 48;
        } else if ((i2 & 48) == 0) {
            if (true != bveVarC.C(null)) {
                i14 = 16;
            } else {
                i14 = 32;
            }
            i12 |= i14;
        }
        i15 = i12;
        i16 = i3 & 4096;
        if (i16 != 0) {
            i17 = i15 | 384;
        } else if ((i2 & 384) == 0) {
            i17 = i15 | (true == bveVarC.C(ktlVar2) ? 256 : 128);
        } else {
            i17 = i15;
        }
        if ((306783379 & i4) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bveVarC.I(z5, i4 & 1)) {
            i18 = i3 & 512;
            i19 = i3 & 256;
            i20 = i3 & 64;
            i21 = i3 & 8;
            bwcVar = (defpackage.bwc) bveVarC;
            int i210 = i17;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i26 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i21 != 0) {
                    i4 &= -7169;
                    ktfVar2 = defpackage.ktf.c;
                } else {
                    ktfVar2 = ktfVar;
                }
                z6 = (!z3) | z;
                z7 = z4 & z2;
                if (i20 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    i22 = i4 & (-3670017);
                    cldVarE = defpackage.bms.e(bveVarC);
                } else {
                    i22 = i4;
                    cldVarE = cldVar;
                }
                if (i9 != 0) {
                    cldVar4 = null;
                } else {
                    cldVar4 = cldVar3;
                }
                if (i19 != 0) {
                    defpackage.afar afarVar2 = defpackage.ktl.a;
                    bveVar3 = bveVarC;
                    ktlVar4 = null;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar3, 255);
                    i22 &= -234881025;
                } else {
                    ktlVar4 = null;
                    bveVar3 = bveVarC;
                    ktlVarJ = ktlVar;
                }
                if (i18 != 0) {
                    defpackage.avv avvVar4 = defpackage.bms.a;
                    bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i22 &= -1879048193;
                } else {
                    bmvVar2 = bmvVar;
                }
                if (i11 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                if (i16 != 0) {
                    ktlVar5 = ktlVar4;
                } else {
                    ktlVar5 = ktlVar2;
                }
                cgfVar3 = cgfVar4;
                askVar2 = askVar3;
            } else {
                if (i26 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i21 != 0) {
                    i4 &= -7169;
                    ktfVar2 = defpackage.ktf.c;
                } else {
                    ktfVar2 = ktfVar;
                }
                z6 = (!z3) | z;
                z7 = z4 & z2;
                if (i20 != 0) {
                    defpackage.avv avvVar5 = defpackage.bms.a;
                    i22 = i4 & (-3670017);
                    cldVarE = defpackage.bms.e(bveVarC);
                } else {
                    i22 = i4;
                    cldVarE = cldVar;
                }
                if (i9 != 0) {
                    cldVar4 = null;
                } else {
                    cldVar4 = cldVar3;
                }
                if (i19 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    bveVar3 = bveVarC;
                    ktlVar4 = null;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar3, 255);
                    i22 &= -234881025;
                } else {
                    ktlVar4 = null;
                    bveVar3 = bveVarC;
                    ktlVarJ = ktlVar;
                }
                if (i18 != 0) {
                    defpackage.avv avvVar6 = defpackage.bms.a;
                    bmvVar2 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i22 &= -1879048193;
                } else {
                    bmvVar2 = bmvVar;
                }
                if (i11 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                if (i16 != 0) {
                    ktlVar5 = ktlVar4;
                } else {
                    ktlVar5 = ktlVar2;
                }
                cgfVar3 = cgfVar4;
                askVar2 = askVar3;
            }
            bveVar3.l();
            defpackage.ktf ktfVar4 = defpackage.ktf.a;
            int i211 = i210 << 3;
            int i212 = i22 << 3;
            defpackage.bve bveVar5 = bveVar3;
            h(cneVar, null, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVarJ, bmvVar2, askVar2, null, null, ktlVar5, bveVar5, (i22 & 14) | 56 | (i212 & 896) | (i212 & 7168) | (57344 & i212) | (458752 & i212) | (3670016 & i212) | (29360128 & i212) | (234881024 & i212) | (1879048192 & i212), (i211 & 896) | ((i22 >> 27) & 14) | (i211 & 112) | ((i210 << 6) & 57344), 8192);
            bveVar2 = bveVar5;
            ktlVar3 = ktlVar5;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            ktfVar2 = ktfVar;
            z6 = z;
            cldVarE = cldVar;
            ktlVarJ = ktlVar;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
            z7 = z2;
            cgfVar3 = cgfVar2;
            cldVar4 = cldVar3;
            ktlVar3 = ktlVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new ktt(cneVar, aferVar, cgfVar3, ktfVar2, z6, z7, cldVarE, cldVar4, ktlVarJ, bmvVar2, askVar2, ktlVar3, i, i2, i3, 1);
        }
    }

    public static final defpackage.cld t(defpackage.bve bveVar) {
        return defpackage.bxi.o(bveVar).b;
    }

    public static final java.lang.Object u(defpackage.wde wdeVar, defpackage.afer aferVar) {
        defpackage.kjf kjfVar = new defpackage.kjf(aferVar, 0);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) wdeVar.a, 0);
        java.lang.String str = (java.lang.String) wdeVar.c;
        defpackage.zbd zbdVar = (defpackage.zbd) wdeVar.b;
        return defpackage.kgu.c(kjfVar, (java.lang.String) wdeVar.e, (defpackage.zbe) wdeVar.d, zbdVar, true, str, objArrCopyOf);
    }

    public static final java.lang.Object v(defpackage.wde wdeVar, defpackage.afer aferVar) {
        defpackage.kjg kjgVar = new defpackage.kjg(aferVar, 0);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) wdeVar.a, 0);
        java.lang.String str = (java.lang.String) wdeVar.c;
        defpackage.zbd zbdVar = (defpackage.zbd) wdeVar.b;
        return defpackage.kgu.c(kjgVar, (java.lang.String) wdeVar.e, (defpackage.zbe) wdeVar.d, zbdVar, false, str, objArrCopyOf);
    }
}
