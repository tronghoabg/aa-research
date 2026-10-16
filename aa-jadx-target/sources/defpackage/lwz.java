package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwz {
    public static final void A(boolean z, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVarC = bveVar.c(-1822482439);
        if ((i & 6) == 0) {
            i2 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(true) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.cne cneVarH = defpackage.day.h(F(z, true), bveVarC, 0);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.niq(11);
                bwcVar.ad(objS);
            }
            defpackage.lxy.G(cneVarH, 0, 0, (defpackage.afer) objS, null, false, false, null, bveVarC, 1576376, 176);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlt(z, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void B(boolean z, boolean z2, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1624014101);
        if (i4 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.D(z2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if (bveVarC.I((i3 & 1171) != 1170, i3 & 1)) {
                if (i5 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                int i6 = i3 << 6;
                defpackage.lxy.A(defpackage.day.h(2131231628, bveVarC, 0), 36.0f, null, z, affcVar, cgfVar4, z2, null, bveVarC, ((i3 << 9) & 7168) | 56 | (57344 & i6) | (i6 & 458752) | ((i3 << 15) & 3670016), 132);
                cgfVar3 = cgfVar4;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nlj(z, z2, affcVar, cgfVar3, i, i2, 0);
            }
        }
        i3 |= 3072;
        cgfVar2 = cgfVar;
        if (bveVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            if (i5 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            int i7 = i3 << 6;
            defpackage.lxy.A(defpackage.day.h(2131231628, bveVarC, 0), 36.0f, null, z, affcVar, cgfVar4, z2, null, bveVarC, ((i3 << 9) & 7168) | 56 | (57344 & i7) | (i7 & 458752) | ((i3 << 15) & 3670016), 132);
            cgfVar3 = cgfVar4;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlj(z, z2, affcVar, cgfVar3, i, i2, 0);
        }
    }

    public static final void C(kjq kjqVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        kjqVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(759293132);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != bveVarC.E(kjqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if (bveVarC.I((i5 & 19) != 18, i5 & 1)) {
            kkf kkfVar = kjqVar.a;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            boolean zC = bveVarC.C(kkfVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                defpackage.npu npuVarA = defpackage.npu.a.a();
                kls klsVar = kkfVar.a.b;
                objS = (nqr) npuVarA.a(new npt("recircControl", klsVar), new defpackage.nma(npuVarA, klsVar, 8, null));
                bwcVar.ad(objS);
            }
            nqr nqrVar = (nqr) objS;
            if (nqrVar == null) {
                bveVarC.v(-1490810849);
                java.lang.Object objS2 = bwcVar.S();
                if (objS2 == defpackage.bvd.a) {
                    objS2 = new nli(2);
                    bwcVar.ad(objS2);
                }
                B(false, false, (defpackage.affc) objS2, null, bveVarC, 438, 8);
                bwcVar.Y(false);
                defpackage.bxl bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.nau(kjqVar, cgcVar, i, 14);
                    return;
                }
                return;
            }
            bveVarC.v(-1490727242);
            bwcVar.Y(false);
            java.lang.Object objS3 = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS3 == obj) {
                objS3 = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar.ad(objS3);
            }
            aiuw aiuwVar = (aiuw) objS3;
            defpackage.bys bysVarM = defpackage.bxi.m(nqrVar.a, kkk.a, bveVarC);
            com.google.android.gms.car.control.CarAction carAction = kjqVar.b;
            java.lang.Boolean bool = (java.lang.Boolean) kkm.b(defpackage.tna.ay(bysVarM));
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            boolean z = defpackage.tna.ay(bysVarM) instanceof kki;
            boolean zE = bveVarC.E(aiuwVar) | bveVarC.E(carAction) | bveVarC.E(nqrVar);
            java.lang.Object objS4 = bwcVar.S();
            if (zE || objS4 == obj) {
                objS4 = new defpackage.nkc(aiuwVar, carAction, nqrVar, i4);
                bwcVar.ad(objS4);
            }
            B(zBooleanValue, z, (defpackage.affc) objS4, cgcVar, bveVarC, (i5 << 6) & 7168, 0);
            cgfVar = cgcVar;
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ2 = bveVarC.J();
        if (bxlVarJ2 != null) {
            bxlVarJ2.c = new defpackage.nau(kjqVar, cgfVar, i, 15);
        }
    }

    private static final nlh D(defpackage.bys bysVar) {
        return (nlh) bysVar.a();
    }

    private static final nqi E(defpackage.bys bysVar) {
        return (nqi) bysVar.a();
    }

    private static final int F(boolean z, boolean z2) {
        if (z2) {
            return z ? 2131231774 : 2131231775;
        }
        return z ? 2131231772 : 2131231773;
    }

    public static final android.content.Intent a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        defpackage.nqs nqsVar = defpackage.nqw.a;
        android.content.Intent intentPutExtra = new android.content.Intent().putExtra("assistant_immersive_activity", true).putExtra("ROBIN_DASHBOARD_CAL_EXTRA", true);
        intentPutExtra.getClass();
        return intentPutExtra.setClass(defpackage.mkp.a.c, com.google.android.apps.auto.components.messaging.smartactions.template.SmartReplyConfirmationService.class).putExtra("EXTRA_REPLY_TEXT", str3).putExtra("EXTRA_SBN_KEY", str).putExtra("EXTRA_CONVERSATION_TITLE", str2);
    }

    public static void b() {
    }

    public static /* synthetic */ boolean c(defpackage.dta dtaVar, java.lang.String[] strArr) {
        java.lang.CharSequence charSequence = dtaVar.j;
        if (charSequence == null) {
            return false;
        }
        for (java.lang.String str : strArr) {
            if (defpackage.ysr.bD(charSequence, str)) {
                return true;
            }
        }
        return false;
    }

    public static defpackage.lyv d() {
        return (defpackage.lyv) defpackage.mkp.a.i(defpackage.lyv.class);
    }

    public static final void e(krg krgVar, android.content.Context context, defpackage.zbe zbeVar, int i) {
        java.lang.Long l;
        java.lang.String str = krgVar.d;
        if (defpackage.afga.f(str, "vnd.android.cursor.item/phone_v2") || (l = krgVar.c) == null) {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.Q);
            rrvVarH.p(defpackage.mkt.b);
            rrvVarH.A(i);
            oimVarU.F(rrvVarH.l());
            defpackage.omf.w().p(krgVar.a);
            return;
        }
        if (str == null) {
            throw new java.lang.IllegalStateException("Mime type must be set when id is set");
        }
        defpackage.oej oejVarR = defpackage.mkc.R();
        java.lang.String strL = oejVarR.l(str);
        android.content.ComponentName componentNameA = strL != null ? oejVarR.a(context, strL) : null;
        if (componentNameA != null) {
            android.content.Intent intentPutExtra = new android.content.Intent("android.intent.action.CALL").setComponent(componentNameA).putExtra("com.google.android.apps.auto.components.apphost.EXTRA_START_COMPONENT_ON_FINISH", defpackage.mkt.b);
            intentPutExtra.getClass();
            defpackage.mpk.a().i(intentPutExtra);
        } else {
            ((defpackage.ype) mff.a.h().ai(4822)).y("No calling app found for %s", str);
        }
        oejVarR.o(context, l.longValue(), zbeVar, str);
    }

    public static /* synthetic */ defpackage.afbk f(int i, int i2, int i3, defpackage.to toVar) {
        toVar.getClass();
        if (defpackage.lem.a.a().b()) {
            toVar.a(androidx.car.app.model.CarColor.createCustom(i, i2));
        } else {
            toVar.a(androidx.car.app.model.CarColor.createCustom(i3, i3));
        }
        return defpackage.afbk.a;
    }

    public static final men g(kra kraVar) {
        java.lang.String str;
        defpackage.ygw ygwVar = kraVar.b;
        if (ygwVar.isEmpty()) {
            str = kraVar.a;
        } else {
            ygwVar.getClass();
            str = ((krg) defpackage.afga.az(ygwVar)).a;
        }
        java.lang.String str2 = kraVar.a;
        android.net.Uri uri = kraVar.c;
        str.getClass();
        return new men(uri, str2, str);
    }

    public static final void h(rb rbVar) {
        rbVar.getClass();
        rbVar.g().f(rbVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void i(java.lang.Object obj, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        int i5;
        int i6;
        defpackage.acx acxVarA;
        int i7;
        boolean z;
        defpackage.acw acwVar2;
        defpackage.cgf cgfVar3;
        defpackage.acx acxVar2;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        int i8;
        defpackage.acw acwVarA;
        boolean z2;
        int i9;
        affhVar.getClass();
        int i10 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-833859217);
        if (i10 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(obj) : bveVarC.E(obj)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    if (true != bveVarC.C(acwVar)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        acxVarA = acxVar;
                        if (true != bveVarC.C(acxVarA)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i11 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(defpackage.cfs.m, 13));
                            i8 = i6;
                        } else {
                            i8 = i6;
                            acwVarA = acwVar;
                        }
                        if (i8 != 0) {
                            acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(defpackage.cfs.m, 13));
                        }
                        if (obj != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        defpackage.ca.M(z2, cgfVar4, acwVarA, acxVarA, null, defpackage.dai.as(-1052210617, true, new nme(obj, affhVar, i3, 0), bveVarC), bveVarC, (i3 & 112) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        cgfVar3 = cgfVar4;
                        acwVar2 = acwVarA;
                    } else {
                        bveVarC.s();
                        acwVar2 = acwVar;
                        cgfVar3 = cgfVar2;
                    }
                    acxVar2 = acxVarA;
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.kus(obj, cgfVar3, acwVar2, acxVar2, affhVar, i, i2, 5);
                    }
                }
                i3 |= 3072;
                acxVarA = acxVar;
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(defpackage.cfs.m, 13));
                        i8 = i6;
                    } else {
                        i8 = i6;
                        acwVarA = acwVar;
                    }
                    if (i8 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(defpackage.cfs.m, 13));
                    }
                    if (obj != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    defpackage.ca.M(z2, cgfVar4, acwVarA, acxVarA, null, defpackage.dai.as(-1052210617, true, new nme(obj, affhVar, i3, 0), bveVarC), bveVarC, (i3 & 112) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVarA;
                } else {
                    bveVarC.s();
                    acwVar2 = acwVar;
                    cgfVar3 = cgfVar2;
                }
                acxVar2 = acxVarA;
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.kus(obj, cgfVar3, acwVar2, acxVar2, affhVar, i, i2, 5);
                }
            }
            i3 |= 384;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    acxVarA = acxVar;
                    if (true != bveVarC.C(acxVarA)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(defpackage.cfs.m, 13));
                        i8 = i6;
                    } else {
                        i8 = i6;
                        acwVarA = acwVar;
                    }
                    if (i8 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(defpackage.cfs.m, 13));
                    }
                    if (obj != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    defpackage.ca.M(z2, cgfVar4, acwVarA, acxVarA, null, defpackage.dai.as(-1052210617, true, new nme(obj, affhVar, i3, 0), bveVarC), bveVarC, (i3 & 112) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVarA;
                } else {
                    bveVarC.s();
                    acwVar2 = acwVar;
                    cgfVar3 = cgfVar2;
                }
                acxVar2 = acxVarA;
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.kus(obj, cgfVar3, acwVar2, acxVar2, affhVar, i, i2, 5);
                }
            }
            i3 |= 3072;
            acxVarA = acxVar;
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(defpackage.cfs.m, 13));
                    i8 = i6;
                } else {
                    i8 = i6;
                    acwVarA = acwVar;
                }
                if (i8 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(defpackage.cfs.m, 13));
                }
                if (obj != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                defpackage.ca.M(z2, cgfVar4, acwVarA, acxVarA, null, defpackage.dai.as(-1052210617, true, new nme(obj, affhVar, i3, 0), bveVarC), bveVarC, (i3 & 112) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                cgfVar3 = cgfVar4;
                acwVar2 = acwVarA;
            } else {
                bveVarC.s();
                acwVar2 = acwVar;
                cgfVar3 = cgfVar2;
            }
            acxVar2 = acxVarA;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.kus(obj, cgfVar3, acwVar2, acxVar2, affhVar, i, i2, 5);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                if (true != bveVarC.C(acwVar)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    acxVarA = acxVar;
                    if (true != bveVarC.C(acxVarA)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(defpackage.cfs.m, 13));
                        i8 = i6;
                    } else {
                        i8 = i6;
                        acwVarA = acwVar;
                    }
                    if (i8 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(defpackage.cfs.m, 13));
                    }
                    if (obj != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    defpackage.ca.M(z2, cgfVar4, acwVarA, acxVarA, null, defpackage.dai.as(-1052210617, true, new nme(obj, affhVar, i3, 0), bveVarC), bveVarC, (i3 & 112) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVarA;
                } else {
                    bveVarC.s();
                    acwVar2 = acwVar;
                    cgfVar3 = cgfVar2;
                }
                acxVar2 = acxVarA;
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.kus(obj, cgfVar3, acwVar2, acxVar2, affhVar, i, i2, 5);
                }
            }
            i3 |= 3072;
            acxVarA = acxVar;
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(defpackage.cfs.m, 13));
                    i8 = i6;
                } else {
                    i8 = i6;
                    acwVarA = acwVar;
                }
                if (i8 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(defpackage.cfs.m, 13));
                }
                if (obj != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                defpackage.ca.M(z2, cgfVar4, acwVarA, acxVarA, null, defpackage.dai.as(-1052210617, true, new nme(obj, affhVar, i3, 0), bveVarC), bveVarC, (i3 & 112) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                cgfVar3 = cgfVar4;
                acwVar2 = acwVarA;
            } else {
                bveVarC.s();
                acwVar2 = acwVar;
                cgfVar3 = cgfVar2;
            }
            acxVar2 = acxVarA;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.kus(obj, cgfVar3, acwVar2, acxVar2, affhVar, i, i2, 5);
            }
        }
        i3 |= 384;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                acxVarA = acxVar;
                if (true != bveVarC.C(acxVarA)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(defpackage.cfs.m, 13));
                    i8 = i6;
                } else {
                    i8 = i6;
                    acwVarA = acwVar;
                }
                if (i8 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(defpackage.cfs.m, 13));
                }
                if (obj != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                defpackage.ca.M(z2, cgfVar4, acwVarA, acxVarA, null, defpackage.dai.as(-1052210617, true, new nme(obj, affhVar, i3, 0), bveVarC), bveVarC, (i3 & 112) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                cgfVar3 = cgfVar4;
                acwVar2 = acwVarA;
            } else {
                bveVarC.s();
                acwVar2 = acwVar;
                cgfVar3 = cgfVar2;
            }
            acxVar2 = acxVarA;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.kus(obj, cgfVar3, acwVar2, acxVar2, affhVar, i, i2, 5);
            }
        }
        i3 |= 3072;
        acxVarA = acxVar;
        if ((i & 24576) == 0) {
            if (true != bveVarC.E(affhVar)) {
                i9 = 8192;
            } else {
                i9 = 16384;
            }
            i3 |= i9;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            if (i11 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i4 != 0) {
                acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(defpackage.cfs.m, 13));
                i8 = i6;
            } else {
                i8 = i6;
                acwVarA = acwVar;
            }
            if (i8 != 0) {
                acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(defpackage.cfs.m, 13));
            }
            if (obj != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            defpackage.ca.M(z2, cgfVar4, acwVarA, acxVarA, null, defpackage.dai.as(-1052210617, true, new nme(obj, affhVar, i3, 0), bveVarC), bveVarC, (i3 & 112) | 196608 | (i3 & 896) | (i3 & 7168), 16);
            cgfVar3 = cgfVar4;
            acwVar2 = acwVarA;
        } else {
            bveVarC.s();
            acwVar2 = acwVar;
            cgfVar3 = cgfVar2;
        }
        acxVar2 = acxVarA;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.kus(obj, cgfVar3, acwVar2, acxVar2, affhVar, i, i2, 5);
        }
    }

    public static final void j(java.lang.String str, defpackage.cgf cgfVar, long j, defpackage.bve bveVar, int i) {
        int i2;
        long j2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        str.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1591275490);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            j2 = j;
            i4 |= true != bveVarC.B(j2) ? 128 : 256;
        } else {
            j2 = j;
        }
        if (bveVarC.I((i4 & 147) != 146, i4 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.dgd dgdVar = defpackage.bxi.p(bveVarC).b;
            long j3 = nms.a;
            long j4 = nms.b;
            defpackage.dil dilVar = new defpackage.dil(500);
            defpackage.dkz.a(0.0f);
            bveVar2 = bveVarC;
            defpackage.brv.b(str, cgcVar, j2, 0L, null, 0L, new defpackage.dlb(3), 0L, 0, false, 1, 0, defpackage.dgd.w(dgdVar, 0L, j4, dilVar, null, null, null, 0L, null, 0, 0, j4, null, new defpackage.dla(0.0f, 17), 15597561), bveVar2, i4 & 1022, 24576, 113656);
            cgfVar2 = cgcVar;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gbc(str, cgfVar2, j, i, 3);
        }
    }

    public static final void k(nlh nlhVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(450231990);
        if (i3 == 0) {
            i2 = (true != bveVarC.A(nlhVar == null ? -1 : nlhVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.lvs.G(true != z ? null : nlhVar, bveVarC, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gqf(nlhVar, z, i, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(kjq kjqVar, defpackage.cgf cgfVar, boolean z, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        nlx nlxVar;
        defpackage.cgf cgfVar4;
        boolean z5;
        kkf kkfVar;
        boolean zC;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        defpackage.afer aferVar;
        defpackage.npu npuVarA;
        klx klxVar;
        nqe nqeVarA;
        int i6;
        int i7;
        nqe nqeVar;
        boolean zContains;
        boolean z6;
        boolean zC2;
        java.lang.Object objS2;
        defpackage.bys bysVarL;
        nqm nqmVar;
        java.lang.Object obj;
        boolean zE;
        java.lang.Object objS3;
        nlh nlhVarD;
        defpackage.cgf cgfVar5;
        kjqVar.getClass();
        int i8 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1134718824);
        int i9 = 4;
        boolean z7 = true;
        if (i8 == 0) {
            i3 = (true != bveVarC.E(kjqVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != bveVarC.D(z)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                int i11 = i3 >> 3;
                int i12 = i3 << 21;
                if (i10 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z5 = z2 & z;
                kkfVar = kjqVar.a;
                zC = bveVarC.C(kkfVar);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                aferVar = null;
                if (zC || objS == defpackage.bvd.a) {
                    npuVarA = defpackage.npu.a.a();
                    klxVar = kkfVar.a;
                    if (defpackage.a.X(klxVar.a, 627081341)) {
                        nqeVarA = (nqe) npuVarA.a(new npt("hmgTemperatureControl", klxVar.b), new defpackage.niw(klxVar, 18));
                    } else {
                        nqeVarA = npuVarA.a(new npt("standardTemperatureControl", klxVar.b), new defpackage.nma(npuVarA, klxVar, i9, null == true ? 1 : 0));
                    }
                    objS = nqeVarA;
                    bwcVar.ad(objS);
                }
                i6 = i12 & 1879048192;
                i7 = i11 & 14;
                nqeVar = (nqe) objS;
                zContains = kjqVar.d.contains(1);
                if (nqeVar == null) {
                    bveVarC.v(1279484845);
                    cgfVar5 = cgfVar4;
                    o(zContains, null, nqm.a, null, false, false, null, false, null, z5, cgfVar5, bveVarC, i6 | 115040688, i7);
                    bwcVar.Y(false);
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        return;
                    } else {
                        nlxVar = new nlx(kjqVar, cgfVar5, z5, i, i2, 3);
                    }
                } else {
                    defpackage.cgf cgfVar6 = cgfVar4;
                    z6 = false;
                    bveVarC.v(1279850986);
                    bwcVar.Y(false);
                    defpackage.bys bysVarM = defpackage.bxi.m(nqeVar.d(), kkk.a, bveVarC);
                    defpackage.bys bysVarM2 = defpackage.bxi.m(nqeVar.e(), null, bveVarC);
                    defpackage.eqp eqpVarB = nqeVar.b();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    defpackage.bys bysVarM3 = defpackage.bxi.m(eqpVarB, bool, bveVarC);
                    defpackage.bys bysVarM4 = defpackage.bxi.m(nqeVar.c(), bool, bveVarC);
                    zC2 = bveVarC.C(kjqVar);
                    objS2 = bwcVar.S();
                    if (zC2 || objS2 == defpackage.bvd.a) {
                        objS2 = defpackage.lvs.F(kjqVar);
                        bwcVar.ad(objS2);
                    }
                    bysVarL = defpackage.bxi.l((defpackage.eqp) objS2, bveVarC);
                    if (D(bysVarL) != null || (E(bysVarM2) == null && ((nlhVarD = D(bysVarL)) == null || !nlhVarD.i))) {
                        z7 = false;
                    }
                    nqi nqiVarE = E(bysVarM2);
                    nqmVar = (nqm) kkm.b(defpackage.tna.ay(bysVarM));
                    if (nqmVar == null) {
                        nqmVar = nqm.a;
                    }
                    boolean zBooleanValue = ((java.lang.Boolean) bysVarM3.a()).booleanValue();
                    boolean zBooleanValue2 = ((java.lang.Boolean) bysVarM4.a()).booleanValue();
                    nlh nlhVarD2 = D(bysVarL);
                    obj = kjqVar.b;
                    if (obj == null) {
                        bveVarC.v(1280733834);
                    } else {
                        bveVarC.v(1280733835);
                        zE = bveVarC.E(obj);
                        objS3 = bwcVar.S();
                        if (zE || objS3 == defpackage.bvd.a) {
                            objS3 = new defpackage.niw(obj, 11);
                            bwcVar.ad(objS3);
                        }
                        aferVar = (defpackage.afer) objS3;
                        z6 = false;
                    }
                    bwcVar.Y(z6);
                    o(zContains, nqiVarE, nqmVar, nqeVar, zBooleanValue2, zBooleanValue, nlhVarD2, z7, aferVar, z5, cgfVar6, bveVarC, i6, i7);
                    cgfVar3 = cgfVar6;
                    z4 = z5;
                }
                bxlVarJ.c = nlxVar;
            }
            bveVarC.s();
            z4 = z;
            cgfVar3 = cgfVar2;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                nlxVar = new nlx(kjqVar, cgfVar3, z4, i, i2, 4);
                bxlVarJ.c = nlxVar;
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != bveVarC.D(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i3 & 1)) {
            int i13 = i3 >> 3;
            int i14 = i3 << 21;
            if (i10 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            z5 = z2 & z;
            kkfVar = kjqVar.a;
            zC = bveVarC.C(kkfVar);
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            aferVar = null;
            if (zC) {
                npuVarA = defpackage.npu.a.a();
                klxVar = kkfVar.a;
                if (defpackage.a.X(klxVar.a, 627081341)) {
                    nqeVarA = (nqe) npuVarA.a(new npt("hmgTemperatureControl", klxVar.b), new defpackage.niw(klxVar, 18));
                } else {
                    nqeVarA = npuVarA.a(new npt("standardTemperatureControl", klxVar.b), new defpackage.nma(npuVarA, klxVar, i9, null == true ? 1 : 0));
                }
                objS = nqeVarA;
                bwcVar.ad(objS);
            } else {
                npuVarA = defpackage.npu.a.a();
                klxVar = kkfVar.a;
                if (defpackage.a.X(klxVar.a, 627081341)) {
                    nqeVarA = (nqe) npuVarA.a(new npt("hmgTemperatureControl", klxVar.b), new defpackage.niw(klxVar, 18));
                } else {
                    nqeVarA = npuVarA.a(new npt("standardTemperatureControl", klxVar.b), new defpackage.nma(npuVarA, klxVar, i9, null == true ? 1 : 0));
                }
                objS = nqeVarA;
                bwcVar.ad(objS);
            }
            i6 = i14 & 1879048192;
            i7 = i13 & 14;
            nqeVar = (nqe) objS;
            zContains = kjqVar.d.contains(1);
            if (nqeVar == null) {
                bveVarC.v(1279484845);
                cgfVar5 = cgfVar4;
                o(zContains, null, nqm.a, null, false, false, null, false, null, z5, cgfVar5, bveVarC, i6 | 115040688, i7);
                bwcVar.Y(false);
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    return;
                } else {
                    nlxVar = new nlx(kjqVar, cgfVar5, z5, i, i2, 3);
                }
            } else {
                defpackage.cgf cgfVar7 = cgfVar4;
                z6 = false;
                bveVarC.v(1279850986);
                bwcVar.Y(false);
                defpackage.bys bysVarM5 = defpackage.bxi.m(nqeVar.d(), kkk.a, bveVarC);
                defpackage.bys bysVarM6 = defpackage.bxi.m(nqeVar.e(), null, bveVarC);
                defpackage.eqp eqpVarB2 = nqeVar.b();
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                defpackage.bys bysVarM7 = defpackage.bxi.m(eqpVarB2, bool2, bveVarC);
                defpackage.bys bysVarM8 = defpackage.bxi.m(nqeVar.c(), bool2, bveVarC);
                zC2 = bveVarC.C(kjqVar);
                objS2 = bwcVar.S();
                if (zC2) {
                    objS2 = defpackage.lvs.F(kjqVar);
                    bwcVar.ad(objS2);
                } else {
                    objS2 = defpackage.lvs.F(kjqVar);
                    bwcVar.ad(objS2);
                }
                bysVarL = defpackage.bxi.l((defpackage.eqp) objS2, bveVarC);
                if (D(bysVarL) != null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                nqi nqiVarE2 = E(bysVarM6);
                nqmVar = (nqm) kkm.b(defpackage.tna.ay(bysVarM5));
                if (nqmVar == null) {
                    nqmVar = nqm.a;
                }
                boolean zBooleanValue3 = ((java.lang.Boolean) bysVarM7.a()).booleanValue();
                boolean zBooleanValue4 = ((java.lang.Boolean) bysVarM8.a()).booleanValue();
                nlh nlhVarD3 = D(bysVarL);
                obj = kjqVar.b;
                if (obj == null) {
                    bveVarC.v(1280733834);
                } else {
                    bveVarC.v(1280733835);
                    zE = bveVarC.E(obj);
                    objS3 = bwcVar.S();
                    if (zE) {
                        objS3 = new defpackage.niw(obj, 11);
                        bwcVar.ad(objS3);
                    } else {
                        objS3 = new defpackage.niw(obj, 11);
                        bwcVar.ad(objS3);
                    }
                    aferVar = (defpackage.afer) objS3;
                    z6 = false;
                }
                bwcVar.Y(z6);
                o(zContains, nqiVarE2, nqmVar, nqeVar, zBooleanValue4, zBooleanValue3, nlhVarD3, z7, aferVar, z5, cgfVar7, bveVarC, i6, i7);
                cgfVar3 = cgfVar7;
                z4 = z5;
            }
            bxlVarJ.c = nlxVar;
        }
        bveVarC.s();
        z4 = z;
        cgfVar3 = cgfVar2;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            nlxVar = new nlx(kjqVar, cgfVar3, z4, i, i2, 4);
            bxlVarJ.c = nlxVar;
        }
    }

    public static final void m(nqi nqiVar, nqm nqmVar, nlh nlhVar, boolean z, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVarX;
        boolean z2;
        defpackage.bve bveVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1208169932);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(nqiVar) : bveVarC.E(nqiVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.A(nqmVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.A(nlhVar == null ? -1 : nlhVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 65536 : 131072;
        }
        int i4 = i2;
        if (bveVarC.I((i4 & 74899) != 74898, i4 & 1)) {
            bveVarC.v(-1410125719);
            defpackage.cgf cgfVarY = defpackage.dai.y(cgfVar, "compact_action");
            if (aferVar != null) {
                z2 = false;
                bveVar2 = bveVarC;
                cgfVarX = defpackage.afw.x(defpackage.kvi.a(cgfVarY, defpackage.bxi.o(bveVarC).b, 0L, 0L, null, null, null, true, true, bveVarC, 113246208, 62), true, null, null, aferVar);
            } else {
                cgfVarX = cgfVarY;
                z2 = false;
                bveVar2 = bveVarC;
            }
            defpackage.bwc bwcVar = (defpackage.bwc) bveVar2;
            bwcVar.Y(z2);
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.e, defpackage.cfs.k, bveVar2, 54);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarX);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVar2.w();
            if (bwcVar.t) {
                bveVar2.j(aferVar2);
            } else {
                bveVar2.y();
            }
            defpackage.byw.c(bveVar2, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVar2, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVar2, defpackage.cwl.g);
            defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
            bveVarC = bveVar2;
            p(nqiVar, nqmVar, z, null, bveVarC, ((i4 >> 3) & 896) | (i4 & 126));
            k(nlhVar, z, bveVarC, (i4 >> 6) & 126);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bof(nqiVar, nqmVar, nlhVar, z, aferVar, cgfVar, i, 8);
        }
    }

    public static final void n(nqi nqiVar, nqm nqmVar, defpackage.afer aferVar, defpackage.afer aferVar2, boolean z, boolean z2, nlh nlhVar, boolean z3, defpackage.afer aferVar3, defpackage.cgf cgfVar, boolean z4, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z5;
        defpackage.afer aferVar4;
        defpackage.cgf cgfVar2;
        boolean z6;
        int i4;
        nqm nqmVar2;
        defpackage.bve bveVar2;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(951667278);
        if (i5 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(nqiVar) : bveVarC.E(nqiVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.A(nqmVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.E(aferVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.D(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z5 = z2;
            i3 |= true != bveVarC.D(z5) ? 65536 : 131072;
        } else {
            z5 = z2;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != bveVarC.A(nlhVar == null ? -1 : nlhVar.ordinal()) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != bveVarC.D(z3) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            aferVar4 = aferVar3;
            i3 |= true != bveVarC.E(aferVar4) ? 33554432 : 67108864;
        } else {
            aferVar4 = aferVar3;
        }
        if ((805306368 & i) == 0) {
            cgfVar2 = cgfVar;
            i3 |= true != bveVarC.C(cgfVar2) ? 268435456 : 536870912;
        } else {
            cgfVar2 = cgfVar;
        }
        if ((i2 & 6) == 0) {
            z6 = z4;
            i4 = i2 | (true != bveVarC.D(z6) ? 2 : 4);
        } else {
            z6 = z4;
            i4 = i2;
        }
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i6 = i3;
            nqmVar2 = nqmVar;
            int i7 = i6 >> 6;
            int i8 = i6 >> 12;
            bveVar2 = bveVarC;
            boolean z7 = z5;
            defpackage.afer aferVar5 = aferVar4;
            defpackage.cgf cgfVar3 = cgfVar2;
            defpackage.lxy.D(aferVar, aferVar2, z, z7, aferVar5, cgfVar3, z6, defpackage.dai.as(-1879577190, true, new gug(nlhVar, z3, 5), bveVarC), null, null, new defpackage.ckd(defpackage.kfp.i(bveVarC).C()), new defpackage.ckd(defpackage.kfp.i(bveVarC).b()), defpackage.dai.as(2893320, true, new gqn(nqiVar, nqmVar2, z3, 2), bveVarC), bveVar2, (i7 & 7168) | (i7 & 14) | 12582912 | (i7 & 112) | (i7 & 896) | (57344 & i8) | (458752 & i8) | (3670016 & (i4 << 18)), 384, 768);
        } else {
            nqmVar2 = nqmVar;
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nmc(nqiVar, nqmVar2, aferVar, aferVar2, z, z2, nlhVar, z3, aferVar3, cgfVar, z4, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(boolean z, nqi nqiVar, nqm nqmVar, nqe nqeVar, boolean z2, boolean z3, nlh nlhVar, boolean z4, defpackage.afer aferVar, boolean z5, defpackage.cgf cgfVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z6;
        defpackage.afer aferVar2;
        boolean z7;
        int i4;
        int i5;
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1923140042);
        if (i6 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? bveVarC.C(nqiVar) : bveVarC.E(nqiVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.A(nqmVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? bveVarC.C(nqeVar) : bveVarC.E(nqeVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.D(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != bveVarC.A(nlhVar == null ? -1 : nlhVar.ordinal()) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            z6 = z4;
            i3 |= true != bveVarC.D(z6) ? 4194304 : 8388608;
        } else {
            z6 = z4;
        }
        if ((100663296 & i) == 0) {
            aferVar2 = aferVar;
            i3 |= true != bveVarC.E(aferVar2) ? 33554432 : 67108864;
        } else {
            aferVar2 = aferVar;
        }
        if ((805306368 & i) == 0) {
            z7 = z5;
            i3 |= true != bveVarC.D(z7) ? 268435456 : 536870912;
        } else {
            z7 = z5;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != bveVarC.C(cgfVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i7 = (i3 >> 3) & 126;
            if (z) {
                bveVarC.v(1696608049);
                defpackage.ktf ktfVar = nmt.a;
                float f = nmt.a.h;
                int i8 = i3 >> 12;
                m(nqiVar, nqmVar, nlhVar, z6, aferVar2, defpackage.awj.l(cgfVar, f, f, Float.NaN, Float.NaN), bveVarC, (57344 & i8) | (i8 & 896) | i7 | (i8 & 7168));
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(1696941950);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                java.lang.Object obj = defpackage.bvd.a;
                if (objS == obj) {
                    objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                    bwcVar.ad(objS);
                }
                int i9 = i3 & 7168;
                aiuw aiuwVar = (aiuw) objS;
                boolean zE = (i9 == 2048 || ((i3 & 4096) != 0 && bveVarC.E(nqeVar))) | bveVarC.E(aiuwVar);
                java.lang.Object objS2 = bwcVar.S();
                if (zE || objS2 == obj) {
                    objS2 = new defpackage.nma(nqeVar, aiuwVar, 2);
                    bwcVar.ad(objS2);
                }
                defpackage.afer aferVar3 = (defpackage.afer) objS2;
                boolean zE2 = (i9 == 2048 || ((i3 & 4096) != 0 && bveVarC.E(nqeVar))) | bveVarC.E(aiuwVar);
                java.lang.Object objS3 = bwcVar.S();
                if (zE2 || objS3 == obj) {
                    i5 = 0;
                    objS3 = new defpackage.nma(nqeVar, aiuwVar, i5);
                    bwcVar.ad(objS3);
                } else {
                    i5 = 0;
                }
                int i10 = i3 & 3670016;
                int i11 = i3 & 29360128;
                int i12 = i3 & 234881024;
                int i13 = (i4 << 27) & 1879048192;
                n(nqiVar, nqmVar, aferVar3, (defpackage.afer) objS3, z2, z3, nlhVar, z4, aferVar, cgfVar, z7, bveVarC, i13 | (i3 & 57344) | i7 | (458752 & i3) | i10 | i11 | i12, (i3 >> 27) & 14);
                bveVarC = bveVarC;
                bwcVar.Y(i5);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nmb(z, nqiVar, nqmVar, nqeVar, z2, z3, nlhVar, z4, aferVar, z5, cgfVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x0209  */
    public static final void p(nqi nqiVar, nqm nqmVar, boolean z, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVar2;
        defpackage.dfb dfbVarB;
        defpackage.cgf cgfVarD;
        long jC;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2051442503);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(nqiVar) : bveVarC.E(nqiVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.A(nqmVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        int i4 = i2 | 3072;
        if (bveVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            if (nqiVar == null) {
                bveVarC.v(46264698);
                dfbVarB = defpackage.rox.l(defpackage.vm.e(2132083817, bveVarC));
                ((defpackage.bwc) bveVarC).Y(false);
            } else if (nqiVar instanceof nqf) {
                bveVarC.v(46268218);
                dfbVarB = defpackage.rox.l(defpackage.vm.e(2132083815, bveVarC));
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                if (nqiVar instanceof nqg) {
                    bveVarC.v(46271738);
                    dfbVarB = defpackage.rox.l(defpackage.vm.e(2132083816, bveVarC));
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    if (!(nqiVar instanceof nqh)) {
                        bveVarC.v(46262975);
                        ((defpackage.bwc) bveVarC).Y(false);
                        throw new defpackage.afas();
                    }
                    bveVarC.v(1434499923);
                    float f = ((nqh) nqiVar).a;
                    if (nqmVar == nqm.b) {
                        bveVarC.v(1434588149);
                        ((defpackage.bwc) bveVarC).Y(false);
                        java.lang.String str = java.lang.String.format("%.0f°", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f)}, 1));
                        str.getClass();
                        dfbVarB = defpackage.rox.l(str);
                    } else {
                        bveVarC.v(1434674577);
                        java.lang.String str2 = java.lang.String.format(java.util.Locale.US, "%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f)}, 1));
                        str2.getClass();
                        java.util.List listL = afzh.L(str2, new java.lang.String[]{"."}, 2);
                        java.lang.String str3 = (java.lang.String) listL.get(0);
                        java.lang.String str4 = (java.lang.String) listL.get(1);
                        bveVarC.v(46287429);
                        defpackage.dez dezVar = new defpackage.dez();
                        dezVar.f(str3);
                        java.lang.String str5 = "." + str4 + "°";
                        defpackage.dft dftVar = new defpackage.dft(0L, defpackage.kgu.k(24.0f, bveVarC), null, null, null, null, null, 0L, null, null, 0L, null, null, 65533);
                        int length = str5.length();
                        defpackage.dfb dfbVar = defpackage.dfc.a;
                        java.util.List listSingletonList = java.util.Collections.singletonList(new defpackage.dfa(dftVar, 0, length, ""));
                        listSingletonList.getClass();
                        dezVar.e(new defpackage.dfb(str5, listSingletonList, null));
                        dfbVarB = dezVar.b();
                        defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                        bwcVar.Y(false);
                        bwcVar.Y(false);
                    }
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                defpackage.dfb dfbVar2 = dfbVarB;
                defpackage.ktf ktfVar = nmt.a;
                defpackage.cgf cgfVarM = defpackage.awj.m(cgcVar, 74.0f);
                if (z) {
                    cgfVarD = defpackage.awj.d(cgcVar, 37.0f);
                } else {
                    cgfVarD = cgcVar;
                }
                defpackage.cgf cgfVarA = cgfVarM.a(cgfVarD);
                defpackage.dgd dgdVar = defpackage.bxi.p(bveVarC).b;
                long jK = defpackage.kgu.k(33.0f, bveVarC);
                long jK2 = defpackage.kgu.k(33.0f, bveVarC);
                defpackage.dkz.a(0.0f);
                defpackage.dgd dgdVarW = defpackage.dgd.w(dgdVar, 0L, jK, null, null, null, null, 0L, null, 0, 0, jK2, null, new defpackage.dla(0.0f, 17), 15597565);
                if (nqiVar == null) {
                    bveVarC.v(1435873471);
                    jC = defpackage.ckd.h(defpackage.ksx.j(defpackage.kry.w, bveVarC), 0.38f);
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(1435968920);
                    ((defpackage.bwc) bveVarC).Y(false);
                    jC = defpackage.cjv.c();
                }
                defpackage.brv.c(dfbVar2, cgfVarA, jC, 0L, null, 0L, null, new defpackage.dlb(3), 0L, 0, false, 1, 0, null, null, dgdVarW, bveVarC, 0, 24576, 244728);
                cgfVar2 = cgcVar;
            }
            defpackage.dfb dfbVar3 = dfbVarB;
            defpackage.ktf ktfVar2 = nmt.a;
            defpackage.cgf cgfVarM2 = defpackage.awj.m(cgcVar, 74.0f);
            if (z) {
                cgfVarD = defpackage.awj.d(cgcVar, 37.0f);
            } else {
                cgfVarD = cgcVar;
            }
            defpackage.cgf cgfVarA2 = cgfVarM2.a(cgfVarD);
            defpackage.dgd dgdVar2 = defpackage.bxi.p(bveVarC).b;
            long jK3 = defpackage.kgu.k(33.0f, bveVarC);
            long jK4 = defpackage.kgu.k(33.0f, bveVarC);
            defpackage.dkz.a(0.0f);
            defpackage.dgd dgdVarW2 = defpackage.dgd.w(dgdVar2, 0L, jK3, null, null, null, null, 0L, null, 0, 0, jK4, null, new defpackage.dla(0.0f, 17), 15597565);
            if (nqiVar == null) {
                bveVarC.v(1435873471);
                jC = defpackage.ckd.h(defpackage.ksx.j(defpackage.kry.w, bveVarC), 0.38f);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(1435968920);
                ((defpackage.bwc) bveVarC).Y(false);
                jC = defpackage.cjv.c();
            }
            defpackage.brv.c(dfbVar3, cgfVarA2, jC, 0L, null, 0L, null, new defpackage.dlb(3), 0L, 0, false, 1, 0, null, null, dgdVarW2, bveVarC, 0, 24576, 244728);
            cgfVar2 = cgcVar;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hdd(nqiVar, nqmVar, z, cgfVar2, i, 9);
        }
    }

    public static final void q(kjq kjqVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVar2;
        defpackage.bxl bxlVarJ;
        defpackage.nau nauVar;
        kjqVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-418051028);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(kjqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (bveVarC.I((i4 & 19) != 18, i4 & 1)) {
            kkf kkfVar = kjqVar.a;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            boolean zC = bveVarC.C(kkfVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = defpackage.npu.a.a().b(kkfVar.a.b);
                bwcVar.ad(objS);
            }
            nqr nqrVar = (nqr) objS;
            java.lang.String strE = defpackage.vm.e(2132083814, bveVarC);
            if (nqrVar == null) {
                bveVarC.v(1247277258);
                java.lang.Object objS2 = bwcVar.S();
                if (objS2 == defpackage.bvd.a) {
                    objS2 = new nli(4);
                    bwcVar.ad(objS2);
                }
                defpackage.lxy.z(strE, null, false, (defpackage.affc) objS2, null, false, null, bveVarC, 200064, 82);
                bwcVar.Y(false);
                bxlVarJ = bveVarC.J();
                if (bxlVarJ == null) {
                    return;
                } else {
                    nauVar = new defpackage.nau(kjqVar, cgcVar, i, 16);
                }
            } else {
                bveVarC.v(1247381046);
                bwcVar.Y(false);
                java.lang.Object objS3 = bwcVar.S();
                java.lang.Object obj = defpackage.bvd.a;
                if (objS3 == obj) {
                    objS3 = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                    bwcVar.ad(objS3);
                }
                aiuw aiuwVar = (aiuw) objS3;
                defpackage.bys bysVarM = defpackage.bxi.m(nqrVar.a, kkk.a, bveVarC);
                com.google.android.gms.car.control.CarAction carAction = kjqVar.b;
                java.lang.Boolean bool = (java.lang.Boolean) kkm.b(defpackage.tna.ay(bysVarM));
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                boolean z = defpackage.tna.ay(bysVarM) instanceof kki;
                boolean zE = bveVarC.E(aiuwVar) | bveVarC.E(carAction) | bveVarC.E(nqrVar);
                java.lang.Object objS4 = bwcVar.S();
                if (zE || objS4 == obj) {
                    objS4 = new defpackage.nkc(aiuwVar, carAction, nqrVar, 5);
                    bwcVar.ad(objS4);
                }
                cgfVar2 = cgcVar;
                defpackage.lxy.z(strE, null, zBooleanValue, (defpackage.affc) objS4, cgfVar2, z, null, bveVarC, (i4 << 9) & 57344, 66);
            }
            bxlVarJ.c = nauVar;
        }
        bveVarC.s();
        cgfVar2 = cgfVar;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            nauVar = new defpackage.nau(kjqVar, cgfVar2, i, 17);
            bxlVarJ.c = nauVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0180  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void r(kjq kjqVar, defpackage.cgf cgfVar, boolean z, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        boolean z2;
        boolean z3;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        boolean z4;
        kkf kkfVar;
        boolean zC;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        int i4;
        npw npwVar;
        defpackage.bys bysVarM;
        java.lang.Object objS2;
        java.lang.Object obj;
        aiuw aiuwVar;
        int i5;
        boolean zA;
        java.lang.Object objS3;
        java.lang.Object objS4;
        defpackage.bxl bxlVarJ2;
        kjqVar.getClass();
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1801292376);
        if (i6 == 0) {
            i3 = i | (true != bveVarC.E(kjqVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            if ((i3 & 19) != 18) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i3 & 1)) {
                int i8 = i3 << 9;
                if (i7 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z4 = ((i2 & 4) == 0) & z;
                kkfVar = kjqVar.a;
                zC = bveVarC.C(kkfVar);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (zC || objS == defpackage.bvd.a) {
                    defpackage.npu npuVarA = defpackage.npu.a.a();
                    kls klsVar = kkfVar.a.b;
                    objS = (npw) npuVarA.a(new npt("steeringWheelHeatControl", klsVar), new defpackage.niw(klsVar, 17));
                    bwcVar.ad(objS);
                }
                i4 = i8 & 57344;
                npwVar = (npw) objS;
                if (npwVar == null) {
                    bveVarC.v(-979451039);
                    defpackage.cne cneVarH = defpackage.day.h(2131231808, bveVarC, 0);
                    objS4 = bwcVar.S();
                    if (objS4 == defpackage.bvd.a) {
                        objS4 = new defpackage.niq(12);
                        bwcVar.ad(objS4);
                    }
                    defpackage.lxy.G(cneVarH, 0, 0, (defpackage.afer) objS4, cgfVar4, false, false, null, bveVarC, i4 | 1576376, 160);
                    bwcVar.Y(false);
                    bxlVarJ2 = bveVarC.J();
                    if (bxlVarJ2 != null) {
                        bxlVarJ2.c = new nlx(kjqVar, cgfVar4, z4, i, i2, 0);
                        return;
                    }
                    return;
                }
                defpackage.cgf cgfVar5 = cgfVar4;
                bveVarC.v(-979211750);
                bwcVar.Y(false);
                bysVarM = defpackage.bxi.m(npwVar.c, kkk.a, bveVarC);
                objS2 = bwcVar.S();
                obj = defpackage.bvd.a;
                if (objS2 == obj) {
                    objS2 = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                    bwcVar.ad(objS2);
                }
                aiuwVar = (aiuw) objS2;
                defpackage.cne cneVarH2 = defpackage.day.h(2131231808, bveVarC, 0);
                java.lang.Integer num = (java.lang.Integer) kkm.b(defpackage.tna.ay(bysVarM));
                int iIntValue = num != null ? num.intValue() : 0;
                defpackage.afia afiaVar = npwVar.a;
                boolean z5 = defpackage.tna.ay(bysVarM) instanceof kki;
                defpackage.afar afarVar = defpackage.ktz.a;
                int i9 = iIntValue;
                defpackage.ktz ktzVarG = defpackage.jxh.g(0L, defpackage.ksx.j(defpackage.kry.E, bveVarC), defpackage.ksx.j(defpackage.kry.F, bveVarC), defpackage.ksx.k(defpackage.krz.a, bveVarC), bveVarC, 29951);
                boolean zE = bveVarC.E(aiuwVar) | bveVarC.E(kjqVar) | bveVarC.C(bysVarM) | bveVarC.E(npwVar);
                i5 = afiaVar.b;
                zA = zE | bveVarC.A(i5);
                objS3 = bwcVar.S();
                if (zA || objS3 == obj) {
                    nly nlyVar = new nly(aiuwVar, kjqVar, npwVar, i5, bysVarM, 0);
                    bwcVar.ad(nlyVar);
                    objS3 = nlyVar;
                }
                defpackage.lxy.G(cneVarH2, i9, i5, (defpackage.afer) objS3, cgfVar5, false, z5, ktzVarG, bveVarC, i4 | 8, 32);
                cgfVar3 = cgfVar5;
                z3 = z4;
            } else {
                bveVarC.s();
                z3 = z;
                cgfVar3 = cgfVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nlx(kjqVar, cgfVar3, z3, i, i2, 2);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bveVarC.I(z2, i3 & 1)) {
            int i10 = i3 << 9;
            if (i7 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            z4 = ((i2 & 4) == 0) & z;
            kkfVar = kjqVar.a;
            zC = bveVarC.C(kkfVar);
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (zC) {
                defpackage.npu npuVarA2 = defpackage.npu.a.a();
                kls klsVar2 = kkfVar.a.b;
                objS = (npw) npuVarA2.a(new npt("steeringWheelHeatControl", klsVar2), new defpackage.niw(klsVar2, 17));
                bwcVar.ad(objS);
            } else {
                defpackage.npu npuVarA3 = defpackage.npu.a.a();
                kls klsVar3 = kkfVar.a.b;
                objS = (npw) npuVarA3.a(new npt("steeringWheelHeatControl", klsVar3), new defpackage.niw(klsVar3, 17));
                bwcVar.ad(objS);
            }
            i4 = i10 & 57344;
            npwVar = (npw) objS;
            if (npwVar == null) {
                bveVarC.v(-979451039);
                defpackage.cne cneVarH3 = defpackage.day.h(2131231808, bveVarC, 0);
                objS4 = bwcVar.S();
                if (objS4 == defpackage.bvd.a) {
                    objS4 = new defpackage.niq(12);
                    bwcVar.ad(objS4);
                }
                defpackage.lxy.G(cneVarH3, 0, 0, (defpackage.afer) objS4, cgfVar4, false, false, null, bveVarC, i4 | 1576376, 160);
                bwcVar.Y(false);
                bxlVarJ2 = bveVarC.J();
                if (bxlVarJ2 != null) {
                    bxlVarJ2.c = new nlx(kjqVar, cgfVar4, z4, i, i2, 0);
                    return;
                }
                return;
            }
            defpackage.cgf cgfVar6 = cgfVar4;
            bveVarC.v(-979211750);
            bwcVar.Y(false);
            bysVarM = defpackage.bxi.m(npwVar.c, kkk.a, bveVarC);
            objS2 = bwcVar.S();
            obj = defpackage.bvd.a;
            if (objS2 == obj) {
                objS2 = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar.ad(objS2);
            }
            aiuwVar = (aiuw) objS2;
            defpackage.cne cneVarH4 = defpackage.day.h(2131231808, bveVarC, 0);
            java.lang.Integer num2 = (java.lang.Integer) kkm.b(defpackage.tna.ay(bysVarM));
            if (num2 != null) {
            }
            defpackage.afia afiaVar2 = npwVar.a;
            boolean z6 = defpackage.tna.ay(bysVarM) instanceof kki;
            defpackage.afar afarVar2 = defpackage.ktz.a;
            int i11 = iIntValue;
            defpackage.ktz ktzVarG2 = defpackage.jxh.g(0L, defpackage.ksx.j(defpackage.kry.E, bveVarC), defpackage.ksx.j(defpackage.kry.F, bveVarC), defpackage.ksx.k(defpackage.krz.a, bveVarC), bveVarC, 29951);
            boolean zE2 = bveVarC.E(aiuwVar) | bveVarC.E(kjqVar) | bveVarC.C(bysVarM) | bveVarC.E(npwVar);
            i5 = afiaVar2.b;
            zA = zE2 | bveVarC.A(i5);
            objS3 = bwcVar.S();
            if (zA) {
                nly nlyVar2 = new nly(aiuwVar, kjqVar, npwVar, i5, bysVarM, 0);
                bwcVar.ad(nlyVar2);
                objS3 = nlyVar2;
            } else {
                nly nlyVar3 = new nly(aiuwVar, kjqVar, npwVar, i5, bysVarM, 0);
                bwcVar.ad(nlyVar3);
                objS3 = nlyVar3;
            }
            defpackage.lxy.G(cneVarH4, i11, i5, (defpackage.afer) objS3, cgfVar6, false, z6, ktzVarG2, bveVarC, i4 | 8, 32);
            cgfVar3 = cgfVar6;
            z3 = z4;
        } else {
            bveVarC.s();
            z3 = z;
            cgfVar3 = cgfVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlx(kjqVar, cgfVar3, z3, i, i2, 2);
        }
    }

    public static final void s(kjq kjqVar, npw npwVar, npw npwVar2, boolean z, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        npw npwVar3;
        npw npwVar4;
        boolean z2;
        defpackage.bve bveVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1692219267);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(kjqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            npwVar3 = npwVar;
            i2 |= true != bveVarC.E(npwVar3) ? 16 : 32;
        } else {
            npwVar3 = npwVar;
        }
        if ((i & 384) == 0) {
            npwVar4 = npwVar2;
            i2 |= true != bveVarC.E(npwVar4) ? 128 : 256;
        } else {
            npwVar4 = npwVar2;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != bveVarC.D(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            kkf kkfVar = kjqVar.a;
            boolean zC = bveVarC.C(kkfVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                klq klqVarG = defpackage.kjx.a.a().g();
                objS = aizq.a(new jyh(klqVarG.c.b(), klqVarG, kkfVar.a, 3));
                bwcVar.ad(objS);
            }
            int i4 = i2 >> 6;
            boolean zBooleanValue = ((java.lang.Boolean) defpackage.dai.av((aizj) objS, java.lang.Boolean.TRUE, null, null, bveVarC, 6).a()).booleanValue();
            int i5 = i4 & 896;
            int i6 = i4 & 112;
            if (zBooleanValue) {
                bveVarC.v(1422372834);
                u(npwVar3, z2, cgfVar, kjqVar.b, null, bveVarC, ((i2 >> 3) & 14) | i6 | i5, 16);
                bveVar2 = bveVarC;
                bwcVar.Y(false);
            } else {
                bveVarC.v(1422476994);
                t(npwVar4, z, cgfVar, kjqVar.b, null, bveVarC, i4 & 1022, 16);
                bveVar2 = bveVarC;
                bwcVar.Y(false);
            }
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mco(kjqVar, npwVar, npwVar2, z, cgfVar, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void t(npw npwVar, boolean z, defpackage.cgf cgfVar, com.google.android.gms.car.control.CarAction carAction, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        com.google.android.gms.car.control.CarAction carAction2;
        defpackage.cgf cgfVar2;
        defpackage.affc affcVar2;
        defpackage.bxl bxlVarJ;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar3;
        boolean zE;
        java.lang.Object objS;
        defpackage.affc affcVar3;
        int i4;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(506378365);
        if (i5 == 0) {
            i3 = (true != bveVarC.E(npwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.D(z) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                i3 |= true != bveVarC.C(cgfVar) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                carAction2 = carAction;
                if (true != bveVarC.E(carAction2)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                carAction2 = carAction;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                int i7 = (-57345) & i3;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i6 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    zE = bveVarC.E(npwVar);
                    objS = bwcVar.S();
                    if (zE || objS == defpackage.bvd.a) {
                        objS = new efd(npwVar, (defpackage.afdk) null, 5);
                        bwcVar.ad(objS);
                    }
                    cgfVar = cgfVar3;
                    affcVar3 = (defpackage.affc) objS;
                } else {
                    bveVarC.s();
                    affcVar3 = affcVar;
                }
                bveVarC.l();
                z(npwVar, z, false, carAction2, affcVar3, cgfVar, bveVarC, (i3 & 7168) | (i3 & 14) | 384 | (i3 & 112) | ((i7 << 9) & 458752));
                cgfVar2 = cgfVar;
                affcVar2 = affcVar3;
            } else {
                bveVarC.s();
                cgfVar2 = cgfVar;
                affcVar2 = affcVar;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gwe(npwVar, z, cgfVar2, carAction, affcVar2, i, i2, 4);
            }
        }
        i3 |= 384;
        if ((i & 3072) == 0) {
            carAction2 = carAction;
            if (true != bveVarC.E(carAction2)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i3 |= i4;
        } else {
            carAction2 = carAction;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            int i8 = (-57345) & i3;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                zE = bveVarC.E(npwVar);
                objS = bwcVar.S();
                if (zE) {
                    objS = new efd(npwVar, (defpackage.afdk) null, 5);
                    bwcVar.ad(objS);
                } else {
                    objS = new efd(npwVar, (defpackage.afdk) null, 5);
                    bwcVar.ad(objS);
                }
                cgfVar = cgfVar3;
                affcVar3 = (defpackage.affc) objS;
            } else {
                if (i6 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                zE = bveVarC.E(npwVar);
                objS = bwcVar.S();
                if (zE) {
                    objS = new efd(npwVar, (defpackage.afdk) null, 5);
                    bwcVar.ad(objS);
                } else {
                    objS = new efd(npwVar, (defpackage.afdk) null, 5);
                    bwcVar.ad(objS);
                }
                cgfVar = cgfVar3;
                affcVar3 = (defpackage.affc) objS;
            }
            bveVarC.l();
            z(npwVar, z, false, carAction2, affcVar3, cgfVar, bveVarC, (i3 & 7168) | (i3 & 14) | 384 | (i3 & 112) | ((i8 << 9) & 458752));
            cgfVar2 = cgfVar;
            affcVar2 = affcVar3;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
            affcVar2 = affcVar;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gwe(npwVar, z, cgfVar2, carAction, affcVar2, i, i2, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void u(npw npwVar, boolean z, defpackage.cgf cgfVar, com.google.android.gms.car.control.CarAction carAction, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        com.google.android.gms.car.control.CarAction carAction2;
        defpackage.cgf cgfVar2;
        defpackage.affc affcVar2;
        defpackage.bxl bxlVarJ;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar3;
        boolean zE;
        java.lang.Object objS;
        defpackage.affc affcVar3;
        int i4;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-162134154);
        if (i5 == 0) {
            i3 = (true != bveVarC.E(npwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.D(z) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                i3 |= true != bveVarC.C(cgfVar) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                carAction2 = carAction;
                if (true != bveVarC.E(carAction2)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                carAction2 = carAction;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                int i7 = (-57345) & i3;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i6 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    zE = bveVarC.E(npwVar);
                    objS = bwcVar.S();
                    if (zE || objS == defpackage.bvd.a) {
                        objS = new efd(npwVar, (defpackage.afdk) null, 6, (byte[]) null);
                        bwcVar.ad(objS);
                    }
                    cgfVar = cgfVar3;
                    affcVar3 = (defpackage.affc) objS;
                } else {
                    bveVarC.s();
                    affcVar3 = affcVar;
                }
                bveVarC.l();
                z(npwVar, z, true, carAction2, affcVar3, cgfVar, bveVarC, (i3 & 7168) | (i3 & 14) | 384 | (i3 & 112) | ((i7 << 9) & 458752));
                cgfVar2 = cgfVar;
                affcVar2 = affcVar3;
            } else {
                bveVarC.s();
                cgfVar2 = cgfVar;
                affcVar2 = affcVar;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gwe(npwVar, z, cgfVar2, carAction, affcVar2, i, i2, 5);
            }
        }
        i3 |= 384;
        if ((i & 3072) == 0) {
            carAction2 = carAction;
            if (true != bveVarC.E(carAction2)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i3 |= i4;
        } else {
            carAction2 = carAction;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            int i8 = (-57345) & i3;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                zE = bveVarC.E(npwVar);
                objS = bwcVar.S();
                if (zE) {
                    objS = new efd(npwVar, (defpackage.afdk) null, 6, (byte[]) null);
                    bwcVar.ad(objS);
                } else {
                    objS = new efd(npwVar, (defpackage.afdk) null, 6, (byte[]) null);
                    bwcVar.ad(objS);
                }
                cgfVar = cgfVar3;
                affcVar3 = (defpackage.affc) objS;
            } else {
                if (i6 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                zE = bveVarC.E(npwVar);
                objS = bwcVar.S();
                if (zE) {
                    objS = new efd(npwVar, (defpackage.afdk) null, 6, (byte[]) null);
                    bwcVar.ad(objS);
                } else {
                    objS = new efd(npwVar, (defpackage.afdk) null, 6, (byte[]) null);
                    bwcVar.ad(objS);
                }
                cgfVar = cgfVar3;
                affcVar3 = (defpackage.affc) objS;
            }
            bveVarC.l();
            z(npwVar, z, true, carAction2, affcVar3, cgfVar, bveVarC, (i3 & 7168) | (i3 & 14) | 384 | (i3 & 112) | ((i8 << 9) & 458752));
            cgfVar2 = cgfVar;
            affcVar2 = affcVar3;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
            affcVar2 = affcVar;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gwe(npwVar, z, cgfVar2, carAction, affcVar2, i, i2, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void v(kjq kjqVar, defpackage.cgf cgfVar, boolean z, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        boolean z4;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        boolean z5;
        kkf kkfVar;
        boolean zC;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        npw npwVar;
        boolean zC2;
        java.lang.Object objS2;
        npw npwVar2;
        boolean zG;
        boolean z6;
        defpackage.bwc bwcVar2;
        boolean z7;
        kjqVar.getClass();
        int i7 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1376260814);
        if (i7 == 0) {
            i3 = (true != bveVarC.E(kjqVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            i5 = 0;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 128;
                } else {
                    i6 = 256;
                }
                i3 |= i6;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                if (i8 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z5 = z2 & z;
                kkfVar = kjqVar.a;
                zC = bveVarC.C(kkfVar);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (zC || objS == defpackage.bvd.a) {
                    defpackage.npu npuVarA = defpackage.npu.a.a();
                    kls klsVar = kkfVar.a.b;
                    objS = (npw) npuVarA.a(new npt("seatCoolerControl", klsVar), new defpackage.npq(klsVar, i5));
                    bwcVar.ad(objS);
                }
                npwVar = (npw) objS;
                zC2 = bveVarC.C(kkfVar);
                objS2 = bwcVar.S();
                if (zC2 || objS2 == defpackage.bvd.a) {
                    defpackage.npu npuVarA2 = defpackage.npu.a.a();
                    kls klsVar2 = kkfVar.a.b;
                    objS2 = (npw) npuVarA2.a(new npt("seatHeaterControl", klsVar2), new defpackage.niw(klsVar2, 19));
                    bwcVar.ad(objS2);
                }
                npwVar2 = (npw) objS2;
                if (npwVar == null || npwVar2 != null) {
                    bveVarC.v(428585519);
                    w(kjqVar, bveVarC, i3 & 14);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(428621076);
                    bwcVar.Y(false);
                }
                boolean zContains = kjqVar.d.contains(1);
                zG = juq.g(kkfVar.a.b.a);
                if (npwVar2 != null || npwVar == null) {
                    z6 = z5;
                    if (npwVar2 != null) {
                        bveVarC.v(-263245113);
                        u(npwVar2, zG, cgfVar4, kjqVar.b, null, bveVarC, (i3 << 3) & 896, 16);
                        bwcVar.Y(false);
                    } else if (npwVar != null) {
                        bveVarC.v(-263240953);
                        t(npwVar, zG, cgfVar4, kjqVar.b, null, bveVarC, (i3 << 3) & 896, 16);
                        bwcVar.Y(false);
                    } else {
                        bveVarC.v(-263237717);
                        A(zG, bveVarC, 48);
                        bwcVar.Y(false);
                    }
                } else {
                    int i9 = i3 << 9;
                    bveVarC.v(428894806);
                    if (zContains) {
                        bveVarC.v(428908167);
                        s(kjqVar, npwVar2, npwVar, zG, cgfVar4, bveVarC, (i3 & 14) | (57344 & i9));
                        bwcVar.Y(false);
                        z7 = false;
                        z6 = z5;
                        bwcVar2 = bwcVar;
                    } else {
                        bveVarC.v(429086820);
                        bwcVar2 = bwcVar;
                        defpackage.cgf cgfVar5 = cgfVar4;
                        z7 = false;
                        x(npwVar2, npwVar, zG, cgfVar5, kjqVar.b, z5, bveVarC, ((i3 << 6) & 7168) | (i9 & 458752));
                        cgfVar4 = cgfVar5;
                        z6 = z5;
                        bveVarC = bveVarC;
                        bwcVar2.Y(false);
                    }
                    bwcVar2.Y(z7);
                }
                z4 = z6;
                cgfVar3 = cgfVar4;
            } else {
                bveVarC.s();
                z4 = z;
                cgfVar3 = cgfVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nlx(kjqVar, cgfVar3, z4, i, i2, 1);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        i5 = 0;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i3 & 1)) {
            if (i8 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            z5 = z2 & z;
            kkfVar = kjqVar.a;
            zC = bveVarC.C(kkfVar);
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (zC) {
                defpackage.npu npuVarA3 = defpackage.npu.a.a();
                kls klsVar3 = kkfVar.a.b;
                objS = (npw) npuVarA3.a(new npt("seatCoolerControl", klsVar3), new defpackage.npq(klsVar3, i5));
                bwcVar.ad(objS);
            } else {
                defpackage.npu npuVarA4 = defpackage.npu.a.a();
                kls klsVar4 = kkfVar.a.b;
                objS = (npw) npuVarA4.a(new npt("seatCoolerControl", klsVar4), new defpackage.npq(klsVar4, i5));
                bwcVar.ad(objS);
            }
            npwVar = (npw) objS;
            zC2 = bveVarC.C(kkfVar);
            objS2 = bwcVar.S();
            if (zC2) {
                defpackage.npu npuVarA5 = defpackage.npu.a.a();
                kls klsVar5 = kkfVar.a.b;
                objS2 = (npw) npuVarA5.a(new npt("seatHeaterControl", klsVar5), new defpackage.niw(klsVar5, 19));
                bwcVar.ad(objS2);
            } else {
                defpackage.npu npuVarA6 = defpackage.npu.a.a();
                kls klsVar6 = kkfVar.a.b;
                objS2 = (npw) npuVarA6.a(new npt("seatHeaterControl", klsVar6), new defpackage.niw(klsVar6, 19));
                bwcVar.ad(objS2);
            }
            npwVar2 = (npw) objS2;
            if (npwVar == null) {
                bveVarC.v(428585519);
                w(kjqVar, bveVarC, i3 & 14);
                bwcVar.Y(false);
            } else {
                bveVarC.v(428585519);
                w(kjqVar, bveVarC, i3 & 14);
                bwcVar.Y(false);
            }
            boolean zContains2 = kjqVar.d.contains(1);
            zG = juq.g(kkfVar.a.b.a);
            if (npwVar2 != null) {
                z6 = z5;
                if (npwVar2 != null) {
                    bveVarC.v(-263245113);
                    u(npwVar2, zG, cgfVar4, kjqVar.b, null, bveVarC, (i3 << 3) & 896, 16);
                    bwcVar.Y(false);
                } else if (npwVar != null) {
                    bveVarC.v(-263240953);
                    t(npwVar, zG, cgfVar4, kjqVar.b, null, bveVarC, (i3 << 3) & 896, 16);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-263237717);
                    A(zG, bveVarC, 48);
                    bwcVar.Y(false);
                }
            } else {
                z6 = z5;
                if (npwVar2 != null) {
                    bveVarC.v(-263245113);
                    u(npwVar2, zG, cgfVar4, kjqVar.b, null, bveVarC, (i3 << 3) & 896, 16);
                    bwcVar.Y(false);
                } else if (npwVar != null) {
                    bveVarC.v(-263240953);
                    t(npwVar, zG, cgfVar4, kjqVar.b, null, bveVarC, (i3 << 3) & 896, 16);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-263237717);
                    A(zG, bveVarC, 48);
                    bwcVar.Y(false);
                }
            }
            z4 = z6;
            cgfVar3 = cgfVar4;
        } else {
            bveVarC.s();
            z4 = z;
            cgfVar3 = cgfVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlx(kjqVar, cgfVar3, z4, i, i2, 1);
        }
    }

    public static final void w(kjq kjqVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-811767406);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(kjqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            java.lang.Integer num = (java.lang.Integer) kkm.b(defpackage.tna.ay(defpackage.bxi.m(jub.d(kjqVar.a), kkk.a, bveVarC)));
            boolean zC = bveVarC.C(num) | bveVarC.E(kjqVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new defpackage.nle(num, kjqVar, (defpackage.afdk) null, 6);
                bwcVar.ad(objS);
            }
            defpackage.bvx.g(num, (defpackage.affg) objS, bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlu(kjqVar, i, 0);
        }
    }

    public static final void x(npw npwVar, npw npwVar2, boolean z, defpackage.cgf cgfVar, com.google.android.gms.car.control.CarAction carAction, boolean z2, defpackage.bve bveVar, int i) {
        npw npwVar3;
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(473712318);
        if (i3 == 0) {
            npwVar3 = npwVar;
            i2 = (true != bveVarC.E(npwVar3) ? 2 : 4) | i;
        } else {
            npwVar3 = npwVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(npwVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(carAction) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.D(z2) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            int i4 = i2 >> 3;
            int i5 = i2 & 1022;
            int i6 = i4 & 7168;
            if (z2) {
                bveVarC.v(-898618512);
                defpackage.ktf ktfVar = nmt.a;
                defpackage.cty ctyVarA = defpackage.atu.a(new defpackage.ate(15.0f, false, null), defpackage.cfs.j, bveVarC, 0);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                int iF = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh = bwcVar.ah();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
                defpackage.afer aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                y(npwVar3, npwVar2, z, carAction, bveVarC, i5 | i6);
                bwcVar.Y(true);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-898370543);
                defpackage.ktf ktfVar2 = nmt.a;
                defpackage.cty ctyVarA2 = defpackage.awb.a(new defpackage.ate(15.0f, false, null), defpackage.cfs.m, bveVarC, 0);
                defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
                int iF2 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh2 = bwcVar2.ah();
                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVar);
                defpackage.afer aferVar2 = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar2.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA2, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                y(npwVar, npwVar2, z, carAction, bveVarC, i5 | i6);
                bwcVar2.Y(true);
                bwcVar2.Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mxz(npwVar, npwVar2, z, cgfVar, carAction, z2, i, 2);
        }
    }

    public static final void y(npw npwVar, npw npwVar2, boolean z, com.google.android.gms.car.control.CarAction carAction, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1712607033);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(npwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(npwVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(carAction) ? 1024 : 2048;
        }
        if (bveVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 & 7168;
            int i5 = (i2 & 14) | 48;
            int i6 = ((i2 >> 3) & 14) | 48;
            int i7 = i5 | i4;
            if (z) {
                bveVarC.v(-359414036);
                t(npwVar2, true, null, carAction, null, bveVarC, i6 | i4, 20);
                u(npwVar, true, null, carAction, null, bveVarC, i7, 20);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(-359234422);
                u(npwVar, false, null, carAction, null, bveVarC, i7, 20);
                t(npwVar2, false, null, carAction, null, bveVarC, i6 | i4, 20);
                ((defpackage.bwc) bveVarC).Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hdd(npwVar, npwVar2, z, carAction, i, 8);
        }
    }

    public static final void z(npw npwVar, boolean z, boolean z2, com.google.android.gms.car.control.CarAction carAction, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        defpackage.kry kryVar;
        defpackage.kry kryVar2;
        int i3;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2083464972);
        if (i4 == 0) {
            i2 = (true != bveVarC.E(npwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(carAction) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? bveVarC.C(affcVar) : bveVarC.E(affcVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 65536 : 131072;
        }
        int i5 = i2;
        if (bveVarC.I((i5 & 74899) != 74898, i5 & 1)) {
            defpackage.afia afiaVar = npwVar.a;
            defpackage.bys bysVarM = defpackage.bxi.m(npwVar.c, kkk.a, bveVarC);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar.ad(objS);
            }
            aiuw aiuwVar = (aiuw) objS;
            defpackage.cne cneVarH = defpackage.day.h(F(z, z2), bveVarC, 0);
            java.lang.Integer num = (java.lang.Integer) kkm.b(defpackage.tna.ay(bysVarM));
            int iIntValue = num != null ? num.intValue() : 0;
            boolean z3 = defpackage.tna.ay(bysVarM) instanceof kki;
            defpackage.afar afarVar = defpackage.ktz.a;
            if (z2) {
                bveVarC.v(755115701);
                kryVar = defpackage.kry.E;
            } else {
                bveVarC.v(755116693);
                kryVar = defpackage.kry.M;
            }
            long j = defpackage.ksx.j(kryVar, bveVarC);
            bwcVar.Y(false);
            if (z2) {
                bveVarC.v(755119253);
                kryVar2 = defpackage.kry.F;
            } else {
                bveVarC.v(755120309);
                kryVar2 = defpackage.kry.N;
            }
            long j2 = defpackage.ksx.j(kryVar2, bveVarC);
            bwcVar.Y(false);
            boolean z4 = false;
            defpackage.ktz ktzVarG = defpackage.jxh.g(0L, j, j2, defpackage.ksx.k(defpackage.krz.a, bveVarC), bveVarC, 29951);
            boolean zE = bveVarC.E(aiuwVar) | bveVarC.E(carAction) | bveVarC.C(bysVarM);
            if ((i5 & 57344) == 16384 || ((i5 & 32768) != 0 && bveVarC.E(affcVar))) {
                z4 = true;
            }
            int i6 = afiaVar.b;
            boolean zE2 = zE | z4 | bveVarC.E(npwVar) | bveVarC.A(i6);
            java.lang.Object objS2 = bwcVar.S();
            if (zE2 || objS2 == obj) {
                i3 = i6;
                nlv nlvVar = new nlv(aiuwVar, carAction, affcVar, npwVar, i3, bysVarM, 0);
                bwcVar.ad(nlvVar);
                objS2 = nlvVar;
            } else {
                i3 = i6;
            }
            bveVar2 = bveVarC;
            defpackage.lxy.G(cneVarH, iIntValue, i3, (defpackage.afer) objS2, cgfVar, false, z3, ktzVarG, bveVar2, ((i5 >> 3) & 57344) | 8, 32);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mxz(npwVar, z, z2, carAction, affcVar, cgfVar, i, 3);
        }
    }
}
