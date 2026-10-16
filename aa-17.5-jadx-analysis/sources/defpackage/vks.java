package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.projection.gearhead.GhCrashHandler;
import j$.util.Comparator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class vks implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vks(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.lang.Object, xyc] */
    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.b) {
            case 0:
                return ((Context) this.a).getSharedPreferences("primes", 0);
            case 1:
                ypf ypfVar = rxy.a;
                return Boolean.valueOf(rxr.a((Context) this.a).f());
            case 2:
                return Long.valueOf(Double.valueOf((String) ((vps) this.a).a.gu()).longValue());
            case 3:
                return (Boolean) this.a.a();
            case 4:
                if (Build.VERSION.SDK_INT < 30) {
                    return xvy.a;
                }
                Context context = (Context) this.a;
                try {
                    return xxh.g(context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName());
                } catch (PackageManager.NameNotFoundException unused) {
                    return xvy.a;
                }
            case 5:
                Comparator comparatorComparing = Comparator.CC.comparing(new kqm(19), Comparator.CC.reverseOrder());
                Iterable iterable = (Iterable) this.a.a();
                int i = yfq.d;
                comparatorComparing.getClass();
                Object[] array = yrm.aq(iterable).toArray();
                int length = array.length;
                yrm.B(array, length);
                Arrays.sort(array, comparatorComparing);
                return yfq.l(array, length);
            case 6:
                return Long.valueOf(((vsb) this.a).e.a().getTotalSpace() / 1024);
            case 7:
                return vqs.d(((vvp) this.a).b);
            case 8:
                return (vuz) this.a.a();
            case 9:
                AtomicReference atomicReference = wae.a;
                weu weuVar = new weu();
                weuVar.f = this.a;
                return weuVar.a();
            case 10:
                AtomicReference atomicReference2 = wae.a;
                return new six(new suq((Context) this.a));
            case 11:
                AtomicReference atomicReference3 = wae.a;
                return new nfh((List) this.a);
            case 12:
                AtomicReference atomicReference4 = wae.a;
                return (wdg) ((xxh) this.a.gu()).e();
            case 13:
                Object obj = ((weu) this.a).f;
                AtomicReference atomicReference5 = wae.a;
                try {
                    return xxh.h(((Context) obj).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (PackageManager.NameNotFoundException unused2) {
                    return xvy.a;
                }
            case 14:
                return this.a;
            case 15:
                boolean z = war.b;
                return waa.a((Context) this.a);
            case 16:
                Object obj2 = this.a;
                wdq wdqVar = (wdq) obj2;
                zgt zgtVar = (zgt) wdqVar.e.gu();
                zgtVar.getClass();
                six sixVar = (six) wdqVar.d.gu();
                sixVar.getClass();
                int i2 = 20;
                zgj zgjVarW = zgj.v(six.f(((suq) sixVar.a).c())).u(way.class, new txa(i2), zgtVar).w(new rgf(obj2, 15), zgtVar);
                zgjVarW.c(new upk(zgjVarW, i2), zgtVar);
                return zgjVarW;
            case 17:
                zgt zgtVar2 = (zgt) this.a.gu();
                zgtVar2.getClass();
                return zgtVar2.schedule(new wdd(2), 10000L, TimeUnit.MILLISECONDS);
            default:
                yph yphVar = GhCrashHandler.a;
                return rqb.a((Context) this.a);
        }
    }
}
