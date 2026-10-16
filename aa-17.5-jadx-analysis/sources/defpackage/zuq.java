package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.telephony.TelephonyManager;
import android.util.Log;
import j$.util.Optional;
import java.io.File;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
public final class zuq {
    public static final /* synthetic */ int d = 0;
    public final Context a;
    public final xyc b;
    public final xyc c;
    private hqw e;

    public zuq(final Context context, final zyx zyxVar, final zsl zslVar, final zhe zheVar, final kex kexVar) {
        this.a = context;
        this.c = wub.L(new zvu(context, 1));
        new zup(this);
        this.b = wub.L(new xyc() { // from class: zum
            @Override // defpackage.xyc
            public final Object gu() {
                Context context2 = context;
                String packageName = context2.getPackageName();
                zta ztaVar = zta.a;
                String strValueOf = String.valueOf(ztaVar.a(context2, packageName).versionCode);
                String strC = ztaVar.c(zkt.c);
                hqw hqwVarA = this.a.a();
                int i = zyxVar.c;
                Integer numValueOf = Integer.valueOf(i);
                sjv sjvVar = sjv.a;
                int iA = skm.a(context2);
                Integer numValueOf2 = Integer.valueOf(iA);
                String str = zss.a;
                zkt.n(context2, "Context");
                String str2 = zss.a;
                if (zrn.e(str2, 4)) {
                    Log.i(str2, "Using GMM server: ".concat(aden.c()));
                }
                String strC2 = aden.c();
                xyc xycVarL = wub.L(new vdv(context2, 20));
                StrictMode.ThreadPolicy threadPolicyB = zrr.a.b();
                try {
                    SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
                    zrr.a.d(threadPolicyB);
                    int i2 = zkt.j;
                    zkt.n(context2, "context");
                    zkt.n(packageName, "applicationName");
                    abnp abnpVarN = acbv.a.n();
                    abnpVarN.t();
                    acbv acbvVar = (acbv) abnpVarN.b;
                    packageName.getClass();
                    acbvVar.b |= 1024;
                    acbvVar.i = packageName;
                    abnpVarN.t();
                    acbv acbvVar2 = (acbv) abnpVarN.b;
                    acbvVar2.H = 3;
                    acbvVar2.c |= 134217728;
                    numValueOf.getClass();
                    abnpVarN.t();
                    acbv acbvVar3 = (acbv) abnpVarN.b;
                    acbvVar3.c |= 8192;
                    acbvVar3.E = i;
                    numValueOf2.getClass();
                    abnpVarN.t();
                    acbv acbvVar4 = (acbv) abnpVarN.b;
                    acbvVar4.c |= 16384;
                    acbvVar4.F = iA;
                    if (strValueOf != null) {
                        abnpVarN.t();
                        acbv acbvVar5 = (acbv) abnpVarN.b;
                        acbvVar5.c |= 64;
                        acbvVar5.y = strValueOf;
                    }
                    abnpVarN.t();
                    acbv acbvVar6 = (acbv) abnpVarN.b;
                    String str3 = Build.VERSION.SDK;
                    str3.getClass();
                    acbvVar6.b |= 33554432;
                    acbvVar6.s = str3;
                    abnpVarN.t();
                    acbv acbvVar7 = (acbv) abnpVarN.b;
                    acbvVar7.b |= 134217728;
                    acbvVar7.t = false;
                    abnpVarN.t();
                    acbv acbvVar8 = (acbv) abnpVarN.b;
                    acbvVar8.b |= 256;
                    acbvVar8.h = true;
                    abnpVarN.t();
                    acbv acbvVar9 = (acbv) abnpVarN.b;
                    acbvVar9.b |= 65536;
                    acbvVar9.m = "SYSTEM";
                    abnpVarN.t();
                    acbv acbvVar10 = (acbv) abnpVarN.b;
                    acbvVar10.c |= 128;
                    acbvVar10.z = "9.0.0";
                    abnpVarN.t();
                    acbv acbvVar11 = (acbv) abnpVarN.b;
                    acbvVar11.b |= 2048;
                    acbvVar11.j = true;
                    if (i2 > 200) {
                        abnpVarN.t();
                        acbv acbvVar12 = (acbv) abnpVarN.b;
                        acbvVar12.p = 3;
                        acbvVar12.b |= 2097152;
                    } else {
                        abnpVarN.t();
                        acbv acbvVar13 = (acbv) abnpVarN.b;
                        acbvVar13.p = 1;
                        acbvVar13.b |= 2097152;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                    if (telephonyManager != null) {
                        String simCountryIso = telephonyManager.getSimCountryIso();
                        if (!ysi.R(simCountryIso)) {
                            abnpVarN.t();
                            acbv acbvVar14 = (acbv) abnpVarN.b;
                            simCountryIso.getClass();
                            acbvVar14.b |= 16;
                            acbvVar14.g = simCountryIso;
                        }
                    }
                    kex kexVar2 = kexVar;
                    zss zssVar = new zss(context2, strC2, strC, xycVarL, (acbv) abnpVarN.q(), sharedPreferences, hqwVarA, zslVar, zrc.a, new Random(), zrz.f("DataRequestDispatcher"), zheVar, kexVar2);
                    zssVar.m();
                    zssVar.d.addIfAbsent(new aacq((byte[]) null));
                    return zssVar;
                } catch (Throwable th) {
                    zrr.a.d(threadPolicyB);
                    throw th;
                }
            }
        });
        synchronized (this) {
            new HashSet();
            this.e = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xyc] */
    public final synchronized hqw a() {
        if (this.e == null) {
            Context context = this.a;
            ieb iebVar = new ieb(new hdk());
            StrictMode.ThreadPolicy threadPolicyA = zrr.a.a();
            try {
                zsp zspVar = new zsp(new tsu(new File(context.getCacheDir(), "com.google.android.libraries.maps.volley")), iebVar, new zsn(((Integer) Optional.ofNullable((Integer) zre.a(context).c.gu()).orElse(20971520)).intValue()), new hqm(new Handler(Looper.getMainLooper())));
                zrr.a.d(threadPolicyA);
                this.e = zspVar;
                hqi hqiVar = zspVar.g;
                if (hqiVar != null) {
                    hqiVar.a();
                }
                hqo[] hqoVarArr = zspVar.f;
                for (int i = 0; i < 4; i++) {
                    hqo hqoVar = hqoVarArr[i];
                    if (hqoVar != null) {
                        hqoVar.a = true;
                        hqoVar.interrupt();
                    }
                }
                PriorityBlockingQueue priorityBlockingQueue = zspVar.c;
                PriorityBlockingQueue priorityBlockingQueue2 = zspVar.d;
                tsu tsuVar = zspVar.i;
                hqz hqzVar = zspVar.e;
                zspVar.g = new hqi(priorityBlockingQueue, priorityBlockingQueue2, tsuVar, hqzVar);
                zspVar.g.start();
                for (int i2 = 0; i2 < 4; i2++) {
                    hqo hqoVar2 = new hqo(priorityBlockingQueue2, zspVar.j, tsuVar, hqzVar);
                    hqoVarArr[i2] = hqoVar2;
                    hqoVar2.start();
                }
            } catch (Throwable th) {
                zrr.a.d(threadPolicyA);
                throw th;
            }
        }
        return this.e;
    }
}
