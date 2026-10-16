package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class slj {
    private static defpackage.slj a;
    private static volatile java.util.HashSet b;
    private static volatile java.util.HashSet c;
    private final android.content.Context d;
    private volatile java.lang.String e;

    public slj(android.content.Context context) {
        this.d = context.getApplicationContext();
    }

    public static defpackage.slj a(android.content.Context context) {
        defpackage.slj sljVar;
        if (context == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        synchronized (defpackage.slj.class) {
            sljVar = a;
            if (sljVar == null) {
                defpackage.sld.a(context);
                sljVar = new defpackage.slj(context);
                a = sljVar;
            }
        }
        return sljVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    static final boolean d(android.content.pm.PackageInfo packageInfo, boolean z) {
        defpackage.ygw ygwVarG;
        if (packageInfo == null) {
            return false;
        }
        if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            defpackage.ygw ygwVar = z ? defpackage.slc.b : defpackage.slc.a;
            int i = defpackage.sqh.a;
            android.content.pm.SigningInfo signingInfoM = hh$.ExternalSyntheticApiModelOutline0.m(packageInfo);
            if (signingInfoM == null || hh$.ExternalSyntheticApiModelOutline0.m(signingInfoM) || hh$.ExternalSyntheticApiModelOutline0.m(signingInfoM) == null) {
                int i2 = defpackage.ygw.d;
                ygwVarG = defpackage.ymx.a;
            } else {
                int i3 = defpackage.ygw.d;
                defpackage.ygr ygrVar = new defpackage.ygr(4);
                for (android.content.pm.Signature signature : hh$.ExternalSyntheticApiModelOutline0.m(signingInfoM)) {
                    ygrVar.i(signature.toByteArray());
                }
                ygwVarG = ygrVar.g();
            }
            if (ygwVarG.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Unable to obtain package certificate history.");
            }
            defpackage.ygw ygwVarH = ygwVarG.h();
            int size = ygwVarH.size();
            int i4 = 0;
            while (i4 < size) {
                byte[] bArr = (byte[]) ygwVarH.get(i4);
                defpackage.you youVarListIterator = ygwVar.listIterator(0);
                do {
                    int i5 = i4 + 1;
                    if (!youVarListIterator.hasNext()) {
                        i4 = i5;
                    }
                } while (!java.util.Arrays.equals(bArr, (byte[]) youVarListIterator.next()));
                return true;
            }
            return false;
        } catch (java.lang.IllegalArgumentException unused) {
            android.util.Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z ? e(packageInfo, defpackage.slc.c) : e(packageInfo, defpackage.slc.c[0])) != null;
        }
    }

    private static defpackage.spe e(android.content.pm.PackageInfo packageInfo, defpackage.spe... speVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            sla slaVar = new sla(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < speVarArr.length; i++) {
                if (speVarArr[i].equals(slaVar)) {
                    return speVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private final defpackage.slf f(java.lang.String str) {
        defpackage.slf slfVar;
        defpackage.slf slfVar2;
        if (str == null) {
            return new defpackage.slf(false, "null pkg", null);
        }
        int i = defpackage.sqe.a;
        if (str.equals(this.e)) {
            return defpackage.slf.a;
        }
        android.content.Context context = defpackage.sld.c;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                defpackage.sld.b();
                defpackage.spi spiVar = defpackage.sld.d;
                android.os.Parcel parcelFq = spiVar.fq(7, spiVar.fp());
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                int i2 = parcelFq.readInt();
                parcelFq.recycle();
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (i2 != 0) {
                    boolean zD = defpackage.sli.d(this.d);
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zD);
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    boolValueOf.getClass();
                    bool.booleanValue();
                    android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        if (defpackage.sld.c == null) {
                            throw new java.lang.NullPointerException("null reference");
                        }
                        try {
                            defpackage.sld.b();
                            android.content.Context context2 = defpackage.sld.c;
                            if (context2 == null) {
                                throw new java.lang.NullPointerException("null reference");
                            }
                            com.google.android.gms.common.GoogleCertificatesLookupQuery googleCertificatesLookupQuery = new com.google.android.gms.common.GoogleCertificatesLookupQuery(str, zD, false, new defpackage.srg(context2), false, true, false);
                            try {
                                defpackage.spi spiVar2 = defpackage.sld.d;
                                android.os.Parcel parcelFp = spiVar2.fp();
                                defpackage.ijx.g(parcelFp, googleCertificatesLookupQuery);
                                android.os.Parcel parcelFq2 = spiVar2.fq(6, parcelFp);
                                com.google.android.gms.common.GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (com.google.android.gms.common.GoogleCertificatesLookupResponse) defpackage.ijx.a(parcelFq2, com.google.android.gms.common.GoogleCertificatesLookupResponse.CREATOR);
                                parcelFq2.recycle();
                                if (googleCertificatesLookupResponse.a) {
                                    googleCertificatesLookupResponse.b();
                                    long j = googleCertificatesLookupResponse.e;
                                    slfVar = new defpackage.slf(true, null, null);
                                } else {
                                    java.lang.String str2 = googleCertificatesLookupResponse.b;
                                    android.content.pm.PackageManager.NameNotFoundException nameNotFoundException = googleCertificatesLookupResponse.a() == 4 ? new android.content.pm.PackageManager.NameNotFoundException() : null;
                                    if (str2 == null) {
                                        str2 = "error checking package certificate";
                                    }
                                    googleCertificatesLookupResponse.b();
                                    googleCertificatesLookupResponse.a();
                                    slfVar = new defpackage.slf(false, str2, nameNotFoundException);
                                }
                            } catch (android.os.RemoteException e) {
                                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                slfVar2 = new defpackage.slf(false, "module call", e);
                                slfVar = slfVar2;
                            }
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        } catch (defpackage.srq e2) {
                            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                            slfVar2 = new defpackage.slf(false, "module init: ".concat(java.lang.String.valueOf(e2.getMessage())), e2);
                        }
                    } catch (java.lang.Throwable th) {
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        throw th;
                    }
                } else {
                    try {
                        threadPolicyAllowThreadDiskReads = 134217792;
                        android.content.pm.PackageInfo packageInfo = this.d.getPackageManager().getPackageInfo(str, 134217792);
                        boolean zD2 = defpackage.sli.d(this.d);
                        if (packageInfo == null) {
                            slfVar = new defpackage.slf(false, "null pkg", null);
                        } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                            slfVar = new defpackage.slf(false, "single cert required", null);
                        } else {
                            sla slaVar = new sla(packageInfo.signatures[0].toByteArray());
                            java.lang.String str3 = packageInfo.packageName;
                            defpackage.slf slfVarC = defpackage.sld.c(str3, slaVar, zD2, false);
                            slfVar = (!slfVarC.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !defpackage.sld.c(str3, slaVar, false, true).b) ? slfVarC : new defpackage.slf(false, "debuggable release cert app rejected", null);
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                        return new defpackage.slf(false, "no pkg ".concat(str), e3);
                    }
                }
            } catch (java.lang.Throwable th2) {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        } catch (android.os.RemoteException | defpackage.srq e4) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        if (slfVar.b) {
            this.e = str;
        }
        return slfVar;
    }

    public final boolean b(java.lang.String str) {
        defpackage.slf slfVarF = f(str);
        slfVarF.b();
        return slfVarF.b;
    }

    public final boolean c(int i) {
        java.lang.String[] packagesForUid = this.d.getPackageManager().getPackagesForUid(i);
        defpackage.slf slfVar = null;
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            slfVar = new defpackage.slf(false, "no pkgs", null);
        } else {
            for (java.lang.String str : packagesForUid) {
                slfVar = f(str);
                if (!slfVar.b) {
                }
            }
            defpackage.sqs.aA(slfVar);
        }
        slfVar.b();
        return slfVar.b;
    }
}
