package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wem {
    public static final java.lang.Object a = new java.lang.Object();
    public static final java.lang.Object b = new java.lang.Object();
    public final android.content.Context c;
    public final defpackage.xzi d;
    public final defpackage.xzi e;
    public final defpackage.xzi f;
    public final defpackage.xzi g;
    public volatile defpackage.wcf h;
    public final defpackage.xzi i;
    public volatile wch j;
    private final defpackage.xzi k;

    public wem(android.content.Context context, defpackage.xzi xziVar, defpackage.xzi xziVar2) {
        this.c = context;
        this.e = xziVar;
        this.d = xziVar2;
        int i = 13;
        byte[] bArr = null;
        this.g = defpackage.ysr.aQ(new defpackage.jbr(context, "storage-info.pb", i, bArr));
        int i2 = defpackage.tnx.a;
        this.i = defpackage.ysr.aQ(new defpackage.jbr(a$.ExternalSyntheticApiModelOutline2.m(context) ? context : a$.ExternalSyntheticApiModelOutline2.m(context), "device-encrypted-storage-info.pb", i, bArr));
        this.f = defpackage.ysr.aQ(new defpackage.ryo(this, 17));
        this.k = defpackage.ysr.aQ(new defpackage.ryo(xziVar, 18));
    }

    public static void e(java.lang.String str, defpackage.abpy abpyVar, java.lang.String str2) throws java.io.IOException {
        java.io.File file = new java.io.File(str);
        defpackage.ysr.h(file);
        java.io.File fileCreateTempFile = java.io.File.createTempFile(str2, ".pb", file.getParentFile());
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
            try {
                abpyVar.g(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new java.io.IOException(java.lang.String.valueOf(fileCreateTempFile) + " could not be renamed to " + file.toString());
            } catch (java.lang.Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            fileCreateTempFile.delete();
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    public final defpackage.wcf a() {
        defpackage.wcf wcfVar;
        defpackage.wcf wcfVar2;
        defpackage.wcf wcfVar3 = this.h;
        if (wcfVar3 != null) {
            return wcfVar3;
        }
        synchronized (a) {
            wcfVar = this.h;
            if (wcfVar == null) {
                android.os.StrictMode.ThreadPolicy threadPolicyE = defpackage.tnx.e(this.c);
                if (threadPolicyE != 0) {
                    try {
                        threadPolicyE = android.os.StrictMode.allowThreadDiskWrites();
                        try {
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.lang.String) this.g.fF());
                            try {
                                defpackage.abol abolVar = defpackage.abol.a;
                                defpackage.wcf wcfVar4 = defpackage.wcf.b;
                                int i = defpackage.abny.l;
                                defpackage.abox aboxVarC = defpackage.abox.C(wcfVar4, new defpackage.abnx(fileInputStream), abolVar);
                                defpackage.abox.U(aboxVarC);
                                wcfVar2 = (defpackage.wcf) aboxVarC;
                                fileInputStream.close();
                                android.os.StrictMode.setThreadPolicy(threadPolicyE);
                                wcfVar = wcfVar2;
                                this.h = wcfVar;
                            } catch (java.lang.Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (java.io.IOException | java.lang.IllegalStateException unused) {
                            wcfVar2 = defpackage.wcf.b;
                        }
                    } catch (java.lang.Throwable th3) {
                        android.os.StrictMode.setThreadPolicy(threadPolicyE);
                        throw th3;
                    }
                } else {
                    wcfVar = defpackage.wcf.b;
                }
            }
        }
        return wcfVar;
    }

    public final wch b() {
        wch wchVar;
        wch wchVar2;
        wch wchVar3 = this.j;
        if (wchVar3 != null) {
            return wchVar3;
        }
        synchronized (b) {
            wchVar = this.j;
            if (wchVar == null) {
                android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.lang.String) this.i.fF());
                        try {
                            wchVar2 = (wch) defpackage.abox.z(wch.b, fileInputStream, defpackage.abol.a);
                            fileInputStream.close();
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            wchVar = wchVar2;
                            this.j = wchVar;
                        } catch (java.lang.Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (java.io.IOException | java.lang.IllegalStateException unused) {
                        wchVar2 = wch.b;
                    }
                } catch (java.lang.Throwable th3) {
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th3;
                }
            }
        }
        return wchVar;
    }

    public final defpackage.wed c(boolean z) {
        boolean z2;
        defpackage.ygw ygwVarO;
        defpackage.abnv abnvVar;
        java.lang.String str;
        defpackage.ygw ygwVarO2;
        defpackage.ygw ygwVarO3;
        int i;
        boolean z3;
        boolean z4;
        defpackage.wce wceVar;
        java.lang.String str2 = "";
        if (z) {
            wch wchVarB = b();
            z2 = wchVarB.e;
            ygwVarO = defpackage.ygw.o(new defpackage.abph(wchVarB.i, wch.a));
            abnvVar = wchVarB.d;
            str = wchVarB.f;
            ygwVarO2 = defpackage.ygw.o(wchVarB.g);
            ygwVarO3 = defpackage.ygw.o(wchVarB.h);
            if ((wchVarB.c & 8) != 0) {
                defpackage.wci wciVar = wchVarB.j;
                if (wciVar == null) {
                    wciVar = defpackage.wci.a;
                }
                if (wciVar.c == android.os.Build.VERSION.SDK_INT) {
                    defpackage.wci wciVar2 = wchVarB.j;
                    if (wciVar2 == null) {
                        wciVar2 = defpackage.wci.a;
                    }
                    str2 = wciVar2.b;
                }
            }
            i = wchVarB.c & 1;
            z3 = wchVarB.l;
            z4 = wchVarB.k;
            wceVar = wchVarB.m;
            if (wceVar == null) {
                wceVar = defpackage.wce.a;
            }
        } else {
            defpackage.wcf wcfVarA = a();
            z2 = wcfVarA.e;
            ygwVarO = defpackage.ygw.o(new defpackage.abph(wcfVarA.j, defpackage.wcf.a));
            abnvVar = wcfVarA.d;
            str = wcfVarA.f;
            ygwVarO2 = defpackage.ygw.o(wcfVarA.h);
            ygwVarO3 = defpackage.ygw.o(wcfVarA.i);
            if ((wcfVarA.c & 16) != 0) {
                defpackage.wci wciVar3 = wcfVarA.k;
                if (wciVar3 == null) {
                    wciVar3 = defpackage.wci.a;
                }
                if (wciVar3.c == android.os.Build.VERSION.SDK_INT) {
                    defpackage.wci wciVar4 = wcfVarA.k;
                    if (wciVar4 == null) {
                        wciVar4 = defpackage.wci.a;
                    }
                    str2 = wciVar4.b;
                }
            }
            i = wcfVarA.c & 1;
            z3 = wcfVarA.m;
            z4 = wcfVarA.l;
            wceVar = wcfVarA.n;
            if (wceVar == null) {
                wceVar = defpackage.wce.a;
            }
        }
        return new defpackage.wed(z2, ygwVarO, abnvVar, str, str2, ygwVarO2, ygwVarO3, 1 == i, z3, z4, wceVar);
    }

    public final defpackage.zhs d(boolean z) {
        defpackage.zhw zhwVar = (defpackage.zhw) this.e.fF();
        zhwVar.getClass();
        return defpackage.zgh.g(defpackage.zhm.v(z ? defpackage.ysr.cq((defpackage.zhs) this.k.fF()) : defpackage.zho.a), new defpackage.key(this, 9), zhwVar);
    }
}
