package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class lhd implements lgw {
    private static final yph a = yph.c("GH.AvailableAppFinder");
    private static final ygr b = new ymp(nyi.c);
    private final Context c;
    private final yfy f;
    private boolean g;
    private tgw i;
    private final lhc d = new lhc();
    private final List e = new CopyOnWriteArrayList();
    private ygr h = yly.a;

    public lhd(Context context) {
        this.c = context;
        mqc mqcVar = new mqc(mkn.A, mpz.b);
        mqc mqcVar2 = new mqc(mkn.s, mpz.f);
        this.f = yfy.l(mqcVar.a, mqcVar, mqcVar2.a, mqcVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final yfy j(qrn qrnVar, nyj nyjVar) {
        yfy yfyVarD;
        lhd lhdVar = this;
        nyj nyjVar2 = nyjVar;
        int i = 4;
        yfu yfuVar = new yfu(4);
        nyj nyjVarC = nyjVar2.c(b);
        nrz nrzVarE = nrz.e();
        HashSet hashSet = new HashSet();
        for (nyh nyhVar : lhdVar.e) {
            lhc lhcVar = lhdVar.d;
            String strL = nyhVar.l(nyjVarC);
            Map map = lhcVar.a;
            yfy yfyVar = (yfy) map.get(strL);
            if (yfyVar == null || nyjVar2.a.contains(nyi.c)) {
                yfq yfqVarB = nyhVar.b(qrnVar, nyjVarC);
                yfu yfuVar2 = new yfu(i);
                int size = yfqVarB.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mqc mqcVar = (mqc) yfqVarB.get(i2);
                    if (mqcVar.e) {
                        if (hashSet.contains(mqcVar.a().getPackageName())) {
                            ((ype) ((ype) a.f()).ai((char) 3918)).y("Skipping %s due to a conflicting driving optimized app", mqcVar);
                        }
                    } else {
                        hashSet.add(mqcVar.a().getPackageName());
                    }
                    if (!nyjVar.f() || nrzVarE.g(mqcVar.a())) {
                        yfuVar2.e(mqcVar.a, mqcVar);
                    }
                }
                yfyVarD = yfuVar2.d(false);
                ((ype) a.l().ai((char) 3917)).M("App provider %s found available apps %s", nyhVar, yfyVarD);
                map.put(nyhVar.l(nyjVarC), yfyVarD);
            } else {
                yfyVarD = yfyVar;
            }
            yfuVar.h(yfyVarD);
            lhdVar = this;
            nyjVar2 = nyjVar;
            i = 4;
        }
        return yfuVar.d(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lgw
    public final mqc a(qrn qrnVar, mqb mqbVar) {
        mqc mqcVar = (mqc) j(qrnVar, nyj.b()).get(mqbVar);
        if (mqcVar != null) {
            return mqcVar;
        }
        if (acpf.k() && lzf.b(qrnVar, false)) {
            mda mdaVarA = mda.a();
            qrnVar.getClass();
            mqbVar.getClass();
            if (mdaVarA.d == null) {
                mdc mdcVarA = mdc.a();
                yfu yfuVar = new yfu(4);
                yfq yfqVarB = mdcVarA.b(qrnVar, nyj.a());
                int size = yfqVarB.size();
                for (int i = 0; i < size; i++) {
                    mqc mqcVar2 = (mqc) yfqVarB.get(i);
                    yfuVar.e(mqcVar2.a(), mqcVar2);
                }
                yfq yfqVarD = mdc.d(qrnVar);
                int size2 = yfqVarD.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    mqc mqcVar3 = (mqc) yfqVarD.get(i2);
                    yfuVar.e(mqcVar3.a(), mqcVar3);
                }
                mdaVarA.d = yfuVar.d(false);
            }
            Map map = mdaVarA.d;
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            mqc mqcVar4 = (mqc) map.get(mqbVar.a);
            if (mqcVar4 != null) {
                return mqcVar4;
            }
        }
        return (mqc) this.f.get(mqbVar);
    }

    @Override // defpackage.lgw
    public final ygr b(qrn qrnVar, nyj nyjVar) {
        ygp ygpVar = new ygp();
        ygpVar.k(e(qrnVar, nyjVar));
        ygpVar.k(this.f.values());
        return ygpVar.g();
    }

    @Override // defpackage.lhg
    public final void c() {
        this.g = true;
        j(kio.b().e(), nyj.d(nyi.c, nyi.a, nyi.b));
        mnc.a().b(mnb.f, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        this.i = null;
        mnc.a().d(mnb.f);
        f();
        this.g = false;
    }

    @Override // defpackage.lgw
    public final ygr e(qrn qrnVar, nyj nyjVar) {
        ygr ygrVarN = ygr.n(j(qrnVar, nyjVar).values());
        this.h = ygrVarN;
        return ygrVarN;
    }

    @Override // defpackage.lgw
    public final void f() {
        this.d.a.clear();
    }

    @Override // defpackage.lgw
    public final void g(nyh nyhVar) {
        woy.ad(!this.g, "Can't register %s. AppProviders must be registered before service is started.", nyhVar);
        this.e.add(nyhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        int i;
        Process processStart;
        try {
            printWriter.println("Last returned launcher components:");
            mnf mnfVarL = mnk.l();
            mng mngVarA = mnh.a();
            mngVarA.a = "Category";
            mngVarA.b();
            mngVarA.c('|');
            boolean z = true;
            mngVarA.d(true);
            mnfVarL.b(mngVarA.a());
            mng mngVarA2 = mnh.a();
            mngVarA2.a = "Component name";
            mngVarA2.b();
            mngVarA2.c('|');
            mngVarA2.d(true);
            mnfVarL.b(mngVarA2.a());
            yno it = this.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                mqc mqcVar = (mqc) it.next();
                mnfVarL.c(mqcVar.b, mqcVar);
            }
            mnfVarL.a().m(printWriter);
            List list = this.e;
            printWriter.printf("\n%d app providers:\n\n", Integer.valueOf(list.size()));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((nyh) it2.next()).h(printWriter);
            }
            Context context = this.c;
            String[] strArr = lhe.a;
            String str = Build.TAGS;
            if (str == null || !str.contains("test-keys")) {
                String[] strArr2 = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                int i2 = 0;
                while (true) {
                    if (i2 >= 10) {
                        String[] strArr3 = {"/system/xbin/which", "/system/bin/which", "which"};
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 3) {
                                z = false;
                                break;
                            }
                            try {
                                processStart = new ProcessBuilder(strArr3[i3], "su").start();
                            } catch (Throwable unused) {
                                processStart = null;
                            }
                            try {
                            } catch (Throwable unused2) {
                                if (processStart != null) {
                                    processStart.destroy();
                                    i3++;
                                } else {
                                    i3++;
                                }
                            }
                            if (new BufferedReader(new InputStreamReader(processStart.getInputStream())).readLine() == null) {
                                if (processStart != null) {
                                    processStart.destroy();
                                }
                                i3++;
                            } else if (processStart != null) {
                                processStart.destroy();
                            }
                        }
                    } else if (new File(strArr2[i2]).exists()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            String[] strArr4 = lhe.a;
            for (int i4 = 0; i4 < 4; i4++) {
                String str2 = strArr4[i4];
                try {
                    packageManager.getPackageInfo(str2, 0);
                    arrayList.add(str2);
                } catch (PackageManager.NameNotFoundException unused3) {
                }
            }
            if (z || !arrayList.isEmpty()) {
                printWriter.println();
                printWriter.println("== Possible tampering detected ==");
                if (z) {
                    printWriter.println("Root detected");
                }
                if (!arrayList.isEmpty()) {
                    printWriter.println("Mod packages detected:");
                    int size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        printWriter.println("  ".concat(String.valueOf((String) arrayList.get(i))));
                    }
                }
                printWriter.println();
            }
        } catch (Throwable th) {
            ((ype) ((ype) ((ype) a.g()).p(th)).ai((char) 3919)).u("Failed to produce report status for AvailableAppFinder");
        }
    }

    @Override // defpackage.lgw
    public final boolean i(mqb mqbVar) {
        if (mqbVar == null) {
            return false;
        }
        if (this.i == null) {
            this.i = new tgw(this.c, acpc.a.gu().l());
        }
        ComponentName componentName = mqbVar.a;
        boolean z = map.e(componentName) && map.d(componentName);
        if (this.i.a(componentName.getPackageName()) || z) {
            return true;
        }
        return (map.c(componentName.getPackageName()) || map.e(componentName) || componentName.getPackageName().equals("com.locnall.KimGiSa")) ? false : true;
    }
}
