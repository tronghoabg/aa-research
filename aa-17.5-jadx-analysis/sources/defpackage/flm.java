package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.work.Worker;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class flm implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ flm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v22, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v69, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v71, types: [bwq, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        int largeMemoryClass;
        switch (this.b) {
            case 0:
                return new fom((ezc) this.a);
            case 1:
                return ((Worker) this.a).c();
            case 2:
                return new fnm((ezc) this.a);
            case 3:
                return new fop((ezc) this.a);
            case 4:
                return new fnx((ezc) this.a);
            case 5:
                return new foa((ezc) this.a);
            case 6:
                return new foc((ezc) this.a);
            case 7:
                return new fnq((ezc) this.a);
            case 8:
                flo floVar = (flo) this.a;
                Context context = floVar.b;
                String str = fmf.a;
                if (Build.VERSION.SDK_INT >= 34) {
                    fmd.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                List listE = fmf.e(context, jobScheduler);
                if (listE != null && !listE.isEmpty()) {
                    Iterator it = listE.iterator();
                    while (it.hasNext()) {
                        fmf.f(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                floVar.d.x().t();
                fkq.a(floVar.c, floVar.d, floVar.e);
                return afak.a;
            case 9:
                this.a.invoke();
                return afak.a;
            case 10:
                Bitmap.Config[] configArr = ftw.a;
                Object obj = ((ncp) this.a).a;
                double d = 0.2d;
                try {
                    Object systemService = ((Context) obj).getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (true == ((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                ajju ajjuVar = new ajju((byte[]) null, (byte[]) null, (byte[]) null);
                try {
                    Object systemService2 = ((Context) obj).getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (((Context) obj).getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                int i = (int) (d * largeMemoryClass * 1024.0d * 1024.0d);
                return new ieb(i > 0 ? new fsi(i, ajjuVar) : new fsf(ajjuVar), ajjuVar);
            case 11:
                return fty.a.a((Context) ((ncp) this.a).a);
            case 12:
                return ((fqd) this.a).g();
            case 13:
                ajhg ajhgVar = ajhg.a;
                return aiqw.a(((fsk) this.a).d);
            case 14:
                String strB = ((fsk) this.a).d.b("Content-Type");
                if (strB == null) {
                    return null;
                }
                aisp aispVar = ajhz.a;
                return ahde.a(strB);
            case 15:
                ((geu) this.a).g().a();
                return afak.a;
            case 16:
                geu geuVar = (geu) this.a;
                gsd gsdVar = (gsd) geuVar.l(gsd.class);
                if (gsdVar != null) {
                    gsdVar.a(geuVar);
                }
                return afak.a;
            case 17:
                ((geu) this.a).g().a();
                return afak.a;
            case 18:
                geu geuVar2 = (geu) this.a;
                gsd gsdVar2 = (gsd) geuVar2.l(gsd.class);
                if (gsdVar2 != null) {
                    gsdVar2.a(geuVar2);
                }
                return afak.a;
            case 19:
                yos yosVar = ypi.a;
                this.a.invoke();
                return afak.a;
            default:
                return Boolean.valueOf(afyh.v(gbt.a(this.a).a()));
        }
    }
}
