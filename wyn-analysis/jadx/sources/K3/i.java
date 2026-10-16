package K3;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6484a = J3.r.f("Schedulers");

    public static void a(J3.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        S3.q qVarU = workDatabase.u();
        workDatabase.c();
        try {
            int i5 = Build.VERSION.SDK_INT;
            int i10 = bVar.f5551h;
            if (i5 == 23) {
                i10 /= 2;
            }
            ArrayList arrayListB = qVarU.b(i10);
            ArrayList arrayListA = qVarU.a();
            if (arrayListB.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    qVarU.i(jCurrentTimeMillis, ((S3.p) it.next()).f10977a);
                }
            }
            workDatabase.n();
            workDatabase.j();
            if (arrayListB.size() > 0) {
                S3.p[] pVarArr = (S3.p[]) arrayListB.toArray(new S3.p[arrayListB.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar = (h) it2.next();
                    if (hVar.e()) {
                        hVar.c(pVarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                S3.p[] pVarArr2 = (S3.p[]) arrayListA.toArray(new S3.p[arrayListA.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    h hVar2 = (h) it3.next();
                    if (!hVar2.e()) {
                        hVar2.c(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
