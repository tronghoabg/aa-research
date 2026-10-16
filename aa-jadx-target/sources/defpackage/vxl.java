package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxl extends defpackage.sqs implements defpackage.vqw, defpackage.vsw {
    public static final long a;
    public final defpackage.vsu b;
    public final android.content.Context c;
    public final defpackage.aclm d;
    public final defpackage.vyt e;
    private final defpackage.vra f;
    private final java.util.concurrent.Executor g;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        a = 43200000L;
    }

    public vxl(defpackage.wde wdeVar, android.content.Context context, defpackage.vra vraVar, java.util.concurrent.Executor executor, defpackage.aclm aclmVar, defpackage.vyt vytVar, defpackage.afak afakVar) {
        super(null, null);
        this.b = wdeVar.d(executor, aclmVar, afakVar);
        this.g = executor;
        this.c = context;
        this.d = aclmVar;
        this.e = vytVar;
        this.f = vraVar;
    }

    @Override // defpackage.vqw
    public final void g(defpackage.vlu vluVar) {
        this.f.b(this);
        defpackage.ysr.cu(new defpackage.zgm() { // from class: vxk
            /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
            @Override // defpackage.zgm
            public final defpackage.zhs a() throws wfo {
                java.util.UUID uuidM;
                defpackage.vxl vxlVar = this.a;
                android.content.Context context = vxlVar.c;
                if (!defpackage.tnx.f(context)) {
                    ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9902)).u("Device locked.");
                    return defpackage.zho.a;
                }
                defpackage.wfp.b();
                defpackage.vyt vytVar = vxlVar.e;
                long j = defpackage.vxl.a;
                defpackage.wfp.b();
                android.content.Context context2 = vytVar.a;
                if (defpackage.tnx.f(context2)) {
                    long j2 = defpackage.tnx.f(context2) ? ((android.content.SharedPreferences) vytVar.c.a()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                    long jA = vytVar.b.a();
                    if (jA < j2) {
                        if (!((android.content.SharedPreferences) vytVar.c.a()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                            ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9910)).u("Failure storing timestamp to SharedPreferences");
                        }
                        j2 = -1;
                    }
                    if (j2 != -1 && jA <= j2 + j) {
                        ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9901)).u("Ignoring storage metric request, storage metric collection occurred too recently.");
                        return defpackage.zho.a;
                    }
                }
                android.content.pm.PackageStats packageStats = null;
                if (!vxlVar.b.b(null)) {
                    return defpackage.zho.a;
                }
                defpackage.wfp.b();
                defpackage.wfp.b();
                android.os.storage.StorageManager storageManager = (android.os.storage.StorageManager) context.getSystemService(android.os.storage.StorageManager.class);
                if (storageManager == null) {
                    ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9897)).u("StorageManager is not available");
                } else {
                    android.app.usage.StorageStatsManager storageStatsManagerM = xi$.ExternalSyntheticApiModelOutline0.m(context.getSystemService(xi$.ExternalSyntheticApiModelOutline0.m()));
                    if (storageStatsManagerM == null) {
                        ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9896)).u("StorageStatsManager is not available");
                    } else {
                        java.lang.String packageName = context.getPackageName();
                        android.content.pm.PackageStats packageStats2 = new android.content.pm.PackageStats(packageName);
                        java.util.Iterator it = ll$.ExternalSyntheticApiModelOutline0.m(storageManager).iterator();
                        while (it.hasNext()) {
                            android.os.storage.StorageVolume storageVolumeM = ll$.ExternalSyntheticApiModelOutline0.m(it.next());
                            if (ll$.ExternalSyntheticApiModelOutline0.m$1(storageVolumeM).equals("mounted")) {
                                java.lang.String strM = ll$.ExternalSyntheticApiModelOutline0.m(storageVolumeM);
                                if ("1AEF-1A1E".equals(strM)) {
                                    uuidM = null;
                                } else {
                                    try {
                                        ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai(9898)).y("UUID for %s", strM);
                                        uuidM = strM == null ? xi$.ExternalSyntheticApiModelOutline0.m() : java.util.UUID.fromString(strM);
                                    } catch (java.lang.IllegalArgumentException e) {
                                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9899)).y("Invalid UUID format: '%s'", strM);
                                        uuidM = null;
                                    }
                                }
                                if (uuidM != null) {
                                    try {
                                        android.app.usage.StorageStats storageStatsM = xi$.ExternalSyntheticApiModelOutline0.m(storageStatsManagerM, uuidM, packageName, android.os.Process.myUserHandle());
                                        if (xi$.ExternalSyntheticApiModelOutline0.m().equals(uuidM)) {
                                            packageStats2.codeSize += xi$.ExternalSyntheticApiModelOutline0.m$1(storageStatsM);
                                            packageStats2.dataSize += xi$.ExternalSyntheticApiModelOutline0.m$2(storageStatsM) - xi$.ExternalSyntheticApiModelOutline0.m(storageStatsM);
                                            packageStats2.cacheSize += xi$.ExternalSyntheticApiModelOutline0.m(storageStatsM);
                                        } else {
                                            packageStats2.externalCodeSize += xi$.ExternalSyntheticApiModelOutline0.m$1(storageStatsM);
                                            packageStats2.externalDataSize += xi$.ExternalSyntheticApiModelOutline0.m$2(storageStatsM) - xi$.ExternalSyntheticApiModelOutline0.m(storageStatsM);
                                            packageStats2.externalCacheSize += xi$.ExternalSyntheticApiModelOutline0.m(storageStatsM);
                                        }
                                    } catch (android.content.pm.PackageManager.NameNotFoundException | java.io.IOException | java.lang.RuntimeException e2) {
                                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e2)).ai((char) 9895)).u("queryStatsForPackage() call failed");
                                    }
                                }
                            }
                        }
                        packageStats = packageStats2;
                    }
                }
                if (packageStats == null) {
                    return new defpackage.zif(new java.lang.IllegalStateException("PackageStats capture failed."));
                }
                defpackage.abor aborVarN = ajht.a.n();
                defpackage.abor aborVarN2 = ajhn.a.n();
                long j3 = packageStats.cacheSize;
                aborVarN2.t();
                ajhn ajhnVar = aborVarN2.b;
                ajhnVar.b |= 1;
                ajhnVar.c = j3;
                long j4 = packageStats.codeSize;
                aborVarN2.t();
                ajhn ajhnVar2 = aborVarN2.b;
                ajhnVar2.b |= 2;
                ajhnVar2.d = j4;
                long j5 = packageStats.dataSize;
                aborVarN2.t();
                ajhn ajhnVar3 = aborVarN2.b;
                ajhnVar3.b |= 4;
                ajhnVar3.e = j5;
                long j6 = packageStats.externalCacheSize;
                aborVarN2.t();
                ajhn ajhnVar4 = aborVarN2.b;
                ajhnVar4.b |= 8;
                ajhnVar4.f = j6;
                long j7 = packageStats.externalCodeSize;
                aborVarN2.t();
                ajhn ajhnVar5 = aborVarN2.b;
                ajhnVar5.b |= 16;
                ajhnVar5.g = j7;
                long j8 = packageStats.externalDataSize;
                aborVarN2.t();
                ajhn ajhnVar6 = aborVarN2.b;
                ajhnVar6.b |= 32;
                ajhnVar6.h = j8;
                long j9 = packageStats.externalMediaSize;
                aborVarN2.t();
                ajhn ajhnVar7 = aborVarN2.b;
                ajhnVar7.b |= 64;
                ajhnVar7.i = j9;
                long j10 = packageStats.externalObbSize;
                aborVarN2.t();
                ajhn ajhnVar8 = aborVarN2.b;
                ajhnVar8.b |= 128;
                ajhnVar8.j = j10;
                defpackage.abor aborVarK = aborVarN2.q().K();
                defpackage.xyn xynVar = ((defpackage.vxj) vxlVar.d.a()).a;
                aborVarN.t();
                ajht ajhtVar = aborVarN.b;
                ajhn ajhnVarQ = aborVarK.q();
                ajhnVarQ.getClass();
                ajhtVar.j = ajhnVarQ;
                ajhtVar.b |= 128;
                defpackage.vyt vytVar2 = vxlVar.e;
                if (!defpackage.tnx.f(vytVar2.a) || !((android.content.SharedPreferences) vytVar2.c.a()).edit().putLong("primes.packageMetric.lastSendTime", vytVar2.b.a()).commit()) {
                    ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9900)).u("Failure storing timestamp persistently");
                }
                defpackage.vsu vsuVar = vxlVar.b;
                defpackage.vsp vspVarA = defpackage.vsq.a();
                vspVarA.g((ajht) aborVarN.q());
                return vsuVar.a(vspVarA.a());
            }
        }, this.g);
    }

    @Override // defpackage.vsw
    public final void k() {
        this.f.a(this);
    }

    @Override // defpackage.vqw
    public final /* synthetic */ void j(defpackage.vlu vluVar) {
    }
}
