package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class sld {
    static final defpackage.slb a;
    static final defpackage.slb b;
    public static android.content.Context c;
    static volatile defpackage.spi d;
    private static final java.lang.Object e;

    static {
        new defpackage.sku(defpackage.spe.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new defpackage.skv(defpackage.spe.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new defpackage.skw(defpackage.spe.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new defpackage.skx(defpackage.spe.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new defpackage.sky(defpackage.spe.d("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new defpackage.skz(defpackage.spe.d("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        e = new java.lang.Object();
    }

    static synchronized void a(android.content.Context context) {
        if (c == null) {
            c = context.getApplicationContext();
        } else {
            android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    static void b() throws defpackage.srq {
        defpackage.spi spiVar;
        if (d != null) {
            return;
        }
        if (c == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        synchronized (e) {
            if (d == null) {
                android.os.IBinder iBinderC = com.google.android.gms.dynamite.DynamiteModule.b(c, com.google.android.gms.dynamite.DynamiteModule.b, "com.google.android.gms.googlecertificates").c();
                if (iBinderC == null) {
                    spiVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    spiVar = iInterfaceQueryLocalInterface instanceof defpackage.spi ? (defpackage.spi) iInterfaceQueryLocalInterface : new defpackage.spi(iBinderC);
                }
                d = spiVar;
            }
        }
    }

    @java.lang.Deprecated
    static defpackage.slf c(java.lang.String str, defpackage.spe speVar, boolean z, boolean z2) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return d(str, speVar, z, z2);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @java.lang.Deprecated
    public static defpackage.slf d(java.lang.String str, defpackage.spe speVar, boolean z, boolean z2) {
        try {
            b();
            defpackage.sqs.aA(c);
            com.google.android.gms.common.GoogleCertificatesQuery googleCertificatesQuery = new com.google.android.gms.common.GoogleCertificatesQuery(str, speVar, z, z2);
            try {
                defpackage.spi spiVar = d;
                defpackage.srg srgVar = new defpackage.srg(c.getPackageManager());
                android.os.Parcel parcelFp = spiVar.fp();
                defpackage.ijx.g(parcelFp, googleCertificatesQuery);
                defpackage.ijx.i(parcelFp, srgVar);
                android.os.Parcel parcelFq = spiVar.fq(5, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ ? defpackage.slf.a : new sle(new skt(z, str, speVar));
            } catch (android.os.RemoteException e2) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new defpackage.slf(false, "module call", e2);
            }
        } catch (defpackage.srq e3) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new defpackage.slf(false, "module init: ".concat(java.lang.String.valueOf(e3.getMessage())), e3);
        }
    }
}
