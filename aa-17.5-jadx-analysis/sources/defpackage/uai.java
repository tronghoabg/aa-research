package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.DisplayMetrics;
import j$.time.Duration;

/* loaded from: classes3.dex */
public final /* synthetic */ class uai implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uai(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v46, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v49, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v52, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v55, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v60, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v65, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v70, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v75, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v84, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v87, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v90, types: [aezk, java.lang.Object] */
    @Override // defpackage.xyc
    public final Object gu() {
        float f;
        switch (this.b) {
            case 0:
                ((zwm) this.a.a()).g();
                return false;
            case 1:
                ((zwm) this.a.a()).g();
                return false;
            case 2:
                ((zwm) this.a.a()).g();
                return false;
            case 3:
                return Boolean.valueOf(((zwm) this.a.a()).c().L);
            case 4:
                ActivityManager activityManager = (ActivityManager) ((Context) this.a).getSystemService("activity");
                activityManager.getClass();
                return Integer.valueOf(activityManager.getMemoryClass());
            case 5:
                return (ukz) this.a.a();
            case 6:
                vaq.d();
                Object obj = this.a;
                float f2 = ((Context) obj).getResources().getDisplayMetrics().densityDpi;
                DisplayMetrics displayMetrics = ((Context) obj).getResources().getDisplayMetrics();
                if (Math.abs(displayMetrics.xdpi - f2) / f2 > 0.25d || Math.abs(displayMetrics.ydpi - f2) / f2 > 0.25d) {
                    f = f2;
                } else {
                    f2 = displayMetrics.xdpi;
                    f = displayMetrics.ydpi;
                }
                float f3 = displayMetrics.widthPixels / f2;
                float f4 = displayMetrics.heightPixels / f;
                return Boolean.valueOf((f3 * f3) + (f4 * f4) >= 49.0f);
            case 7:
                Object obj2 = this.a;
                abnh abnhVar = abhn.c;
                abns abnsVar = (abns) obj2;
                abnsVar.j(abnhVar);
                Object objJ = abnsVar.w.j(abnhVar.d);
                abod abodVar = ((abhn) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b;
                int size = abodVar.size() / 2;
                yfl yflVarJ = yfq.j(size);
                for (int i = 0; i < size; i++) {
                    int i2 = i + i;
                    yflVarJ.i(new too(((Integer) abodVar.get(i2)).intValue(), ((Integer) abodVar.get(i2 + 1)).intValue()));
                }
                return yflVarJ.g();
            case 8:
                return false;
            case 9:
                ((zwm) this.a.a()).b();
                return false;
            case 10:
                ((zwm) this.a.a()).b();
                return false;
            case 11:
                yob yobVar = umn.a;
                return Boolean.valueOf(((aaxq) this.a.a()).n);
            case 12:
                yob yobVar2 = umn.a;
                return Integer.valueOf(((aaxq) this.a.a()).o);
            case 13:
                yob yobVar3 = umn.a;
                return Duration.ofMillis(((aaxq) this.a.a()).p);
            case 14:
                yob yobVar4 = umn.a;
                return Boolean.valueOf(((aaxq) this.a.a()).q);
            case 15:
                yob yobVar5 = umn.a;
                return Boolean.valueOf(((aaxq) this.a.a()).r);
            case 16:
                uod uodVar = (uod) this.a;
                return new uog(uodVar.n, uodVar, uodVar.l.r());
            case 17:
                uod uodVar2 = (uod) this.a;
                return new uoh(uodVar2.n, uodVar2.c, uodVar2, uodVar2.l.r());
            case 18:
                yob yobVar6 = upm.a;
                return new plb(32, pkz.RESOURCE_MANAGER_SOFT_RESOURCE, (pkx) this.a.a(), null);
            case 19:
                ((zwm) this.a.a()).b();
                return false;
            default:
                return Boolean.valueOf(((zwm) this.a.a()).c().X);
        }
    }
}
