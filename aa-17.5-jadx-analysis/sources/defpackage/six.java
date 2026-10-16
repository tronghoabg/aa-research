package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.Feature;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class six {
    private static volatile six b;
    public final Object a;

    private six() {
        this.a = new CopyOnWriteArrayList();
    }

    public static six a() {
        if (b == null) {
            synchronized (six.class) {
                if (b == null) {
                    b = new six();
                }
            }
        }
        return b;
    }

    public static zgp f(svz svzVar) {
        zgp zgpVarAK = spu.aK(svzVar);
        wgi wgiVar = new wgi(1);
        zfq zfqVar = zfq.a;
        int i = zet.d;
        zer zerVar = new zer(zgpVarAK, skw.class, wgiVar);
        zgpVarAK.c(zerVar, yrm.aK(zfqVar, zerVar));
        return zerVar;
    }

    public final int b(String str) {
        return ((Context) this.a).checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    public final ApplicationInfo c(String str, int i) throws PackageManager.NameNotFoundException {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    @ResultIgnorabilityUnspecified
    public final PackageInfo d(String str, int i) throws PackageManager.NameNotFoundException {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public final zgp e(String str) {
        str.getClass();
        return f(((suq) this.a).a(str));
    }

    public final zgp g(wda wdaVar) {
        String str;
        sla slaVar = (sla) this.a;
        smr smrVarS = slaVar.s(wdaVar, "suu");
        String strA = spt.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + "|" + System.identityHashCode(suu.class);
        }
        qoq qoqVar = new qoq(str, smrVarS, 10);
        qpz qpzVar = new qpz(11);
        smx smxVar = new smx();
        smxVar.c = smrVarS;
        smxVar.a = qoqVar;
        smxVar.b = qpzVar;
        smxVar.d = new Feature[]{sui.d};
        smxVar.e = false;
        return f(slaVar.x(smxVar.a()));
    }

    public six(Object obj) {
        this.a = obj;
    }
}
