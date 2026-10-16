package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wej {
    public final defpackage.wba a;
    public final defpackage.xzi b;
    public final java.lang.String c;
    public final boolean d;
    private final java.lang.String e;

    public wej(final defpackage.wba wbaVar, final java.lang.String str, final java.lang.String str2, final boolean z) {
        this.a = wbaVar;
        this.c = str;
        this.e = str2;
        this.d = z;
        this.b = defpackage.ysr.aQ(new defpackage.xzi() { // from class: wef
            @Override // defpackage.xzi
            public final java.lang.Object fF() {
                boolean z2 = z;
                defpackage.wba wbaVar2 = wbaVar;
                android.content.Context contextA = z2 ? defpackage.tnx.a(wbaVar2.c) : wbaVar2.c;
                java.lang.String str3 = str2;
                return java.lang.String.valueOf(defpackage.way.b(contextA)) + java.io.File.separator + "phenotype" + java.io.File.separator + "shared" + java.io.File.separator + (str3.isEmpty() ? "" : java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(java.io.File.separator))) + str + ".pb";
            }
        });
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, xzi] */
    public final defpackage.wei a() {
        java.lang.String strSubstring;
        int i;
        defpackage.weg wegVar;
        defpackage.weg wegVar2;
        byte[] bArrG;
        defpackage.wcc wccVarA;
        boolean z = this.d;
        if (!z && !defpackage.tnx.e(this.a.c)) {
            return new defpackage.wei(wek.a, new defpackage.weh(3, 17, false));
        }
        if (defpackage.way.c()) {
            return new defpackage.wei(wek.a, new defpackage.weh(3, 18, false));
        }
        defpackage.wba wbaVar = this.a;
        defpackage.wed wedVarC = wbaVar.f.c(z);
        java.lang.String str = this.c;
        defpackage.zir zirVar = defpackage.zir.FILE;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                throw new java.lang.IllegalArgumentException("Invalid package name: ".concat(java.lang.String.valueOf(str)));
            }
            strSubstring = str;
        }
        strSubstring.getClass();
        if (!wedVarC.h) {
            i = 14;
        } else if (!wedVarC.a || !wedVarC.b.contains(zirVar)) {
            i = 3;
        } else if (wedVarC.c.B()) {
            i = 4;
        } else {
            java.util.List list = wedVarC.f;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = wedVarC.g.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        }
        if (i != 0) {
            wegVar2 = new defpackage.weg(null, new defpackage.weh(i, true));
        } else {
            try {
                java.lang.String strM = wedVarC.e;
                if (strM.isEmpty()) {
                    defpackage.xyn xynVar = (defpackage.xyn) wbaVar.g.fF();
                    if (!xynVar.f()) {
                        defpackage.sqs.bL(java.util.logging.Level.WARNING, wbaVar.b(), null, "Unable to get GMS application info, using defaults.", new java.lang.Object[0]);
                        wegVar = new defpackage.weg(defpackage.wcd.a, new defpackage.weh(3, 7, false));
                        wegVar2 = wegVar;
                    } else if (z) {
                        int i2 = defpackage.tnx.a;
                        strM = a$.ExternalSyntheticApiModelOutline2.m((android.content.pm.ApplicationInfo) xynVar.b());
                    } else {
                        strM = ((android.content.pm.ApplicationInfo) xynVar.b()).dataDir;
                    }
                }
                defpackage.ngb ngbVar = new defpackage.ngb(wedVarC.c, str, this.e);
                try {
                    try {
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(strM + java.io.File.separator + wedVarC.d + java.io.File.separator + new java.io.File(((java.lang.String) ngbVar.a.fF()) + "/" + ((java.lang.String) ngbVar.c.fF()) + ".pb").toString());
                        try {
                            int i3 = defpackage.abny.l;
                            defpackage.abnx abnxVar = new defpackage.abnx(fileInputStream);
                            boolean z2 = wedVarC.k.b;
                            defpackage.wcd wcdVar = defpackage.wcd.a;
                            int iJ = abnxVar.j();
                            if (iJ > 1) {
                                throw new defpackage.abpp("Unsupported version: " + iJ + ". Current version is: 1");
                            }
                            abnxVar.j();
                            int iF = abnxVar.f(abnxVar.k());
                            defpackage.abox aboxVarC = defpackage.abox.C(defpackage.wbx.a, abnxVar, defpackage.abol.a);
                            defpackage.abox.U(aboxVarC);
                            defpackage.wbx wbxVar = (defpackage.wbx) aboxVarC;
                            abnxVar.A(iF);
                            defpackage.wca wcaVar = new defpackage.wca();
                            try {
                                int iK = abnxVar.k();
                                if (!z2 || iK <= 12288) {
                                    int i4 = abnxVar.d;
                                    if (iK > abnxVar.c - i4 || iK <= 0) {
                                        bArrG = abnxVar.G(iK);
                                    } else {
                                        int i5 = iK + i4;
                                        abnxVar.d = i5;
                                        bArrG = java.util.Arrays.copyOfRange(abnxVar.b, i4, i5);
                                    }
                                    wcaVar.a.setInput(bArrG);
                                    try {
                                        wccVarA = defpackage.wcc.a(new defpackage.abnx(new defpackage.wby(wcaVar)));
                                        wcaVar.a.reset();
                                    } catch (java.lang.Throwable th) {
                                        wcaVar.a.reset();
                                        throw th;
                                    }
                                } else {
                                    int iF2 = abnxVar.f(iK);
                                    try {
                                        wccVarA = defpackage.wcc.a(new defpackage.abnx(new java.util.zip.InflaterInputStream(new wbz(abnxVar), wcaVar.a, 4096)));
                                        wcaVar.a.reset();
                                        int iD = abnxVar.d();
                                        if (iD > 0) {
                                            abnxVar.B(iD);
                                        }
                                        abnxVar.A(iF2);
                                    } catch (java.lang.Throwable th2) {
                                        wcaVar.a.reset();
                                        throw th2;
                                    }
                                }
                                wcaVar.close();
                                defpackage.weg wegVar3 = new defpackage.weg(new defpackage.wcd(wccVarA, wbxVar), new defpackage.weh(5, 2, false));
                                fileInputStream.close();
                                wegVar2 = wegVar3;
                            } catch (java.lang.Throwable th3) {
                                try {
                                    wcaVar.close();
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (java.lang.Throwable th5) {
                            try {
                                fileInputStream.close();
                                throw th5;
                            } catch (java.lang.Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (java.io.FileNotFoundException unused) {
                        defpackage.sqs.bL(java.util.logging.Level.INFO, this.a.b(), null, "Shared storage file not found for %s", this.c);
                        wegVar2 = new defpackage.weg(null, new defpackage.weh(8, false));
                    }
                } catch (defpackage.abpp e) {
                    defpackage.sqs.bL(java.util.logging.Level.SEVERE, this.a.b(), e, "Failed to parse snapshot from shared storage for %s", this.c);
                    wegVar2 = new defpackage.weg(null, new defpackage.weh(9, false));
                }
            } catch (java.lang.Exception e2) {
                defpackage.sqs.bL(java.util.logging.Level.WARNING, this.a.b(), e2, "Failed to read shared file for %s", this.c);
                wegVar = new defpackage.weg(defpackage.wcd.a, new defpackage.weh(3, 10, false));
            }
        }
        if (wegVar2.a != null) {
            defpackage.wcd wcdVar2 = wegVar2.a;
            wcdVar2.getClass();
            return new defpackage.wei(wcdVar2, wegVar2.b);
        }
        defpackage.weh wehVar = wegVar2.b;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream((java.lang.String) this.b.fF());
            try {
                defpackage.abol abolVar = defpackage.abol.a;
                wek wekVar = wek.a;
                int i6 = defpackage.abny.l;
                wek wekVarC = defpackage.abox.C(wekVar, new defpackage.abnx(fileInputStream2), abolVar);
                defpackage.abox.U(wekVarC);
                defpackage.wei weiVar = new defpackage.wei(wekVarC, new defpackage.weh(4, wehVar.c, wehVar.a));
                fileInputStream2.close();
                return weiVar;
            } catch (java.lang.Throwable th7) {
                try {
                    fileInputStream2.close();
                    throw th7;
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (java.io.IOException | java.lang.RuntimeException unused2) {
            defpackage.sqs.bL(java.util.logging.Level.INFO, this.a.b(), null, "Unable to retrieve flag snapshot for %s, using defaults.", this.c);
            return wehVar.a ? new defpackage.wei(wek.a, new defpackage.weh(3, 11, true)) : new defpackage.wei(defpackage.wcd.a, new defpackage.weh(3, 16, false));
        }
    }

    public final defpackage.zhs b(java.lang.String str) {
        defpackage.wba wbaVar = this.a;
        defpackage.roy royVarE = wbaVar.e();
        java.lang.String str2 = this.c;
        str2.getClass();
        str.getClass();
        return defpackage.zgh.f(defpackage.roy.c(((defpackage.svo) royVarE.a).g(str2, str).a(defpackage.zgt.INSTANCE, new wbv())), new wee(), wbaVar.b());
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.zhs c(wek wekVar) {
        return defpackage.ysr.ct(new pgj(this, wekVar, 9), this.a.b());
    }

    public final boolean d() {
        defpackage.wem wemVar = this.a.f;
        boolean z = this.d;
        defpackage.zir zirVar = defpackage.zir.FILE;
        if (z) {
            wch wchVarB = wemVar.b();
            return wchVarB.e && new defpackage.abph(wchVarB.i, wch.a).contains(zirVar);
        }
        defpackage.wcf wcfVarA = wemVar.a();
        return wcfVarA.e && new defpackage.abph(wcfVarA.j, defpackage.wcf.a).contains(zirVar);
    }
}
