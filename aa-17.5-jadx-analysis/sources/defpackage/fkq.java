package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class fkq {
    public static final String a = fjo.b("Schedulers");

    public static void a(fiy fiyVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        foe foeVarX = workDatabase.x();
        new ArrayList();
        workDatabase.k();
        try {
            List listD = foeVarX.d();
            dsy dsyVar = fiyVar.g;
            c(foeVarX, listD);
            List listQ = foeVarX.q();
            int i = fiyVar.e;
            List listX = foeVarX.x();
            c(foeVarX, listX);
            if (listD != null) {
                listX.addAll(listD);
            }
            workDatabase.n();
            workDatabase.l();
            b(listX, list, true);
            b(listQ, list, false);
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }

    private static void b(List list, List list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        fod[] fodVarArr = (fod[]) list.toArray(new fod[list.size()]);
        ListIterator listIterator = ((afbt) list2).listIterator(0);
        while (listIterator.hasNext()) {
            fko fkoVar = (fko) listIterator.next();
            if (fkoVar.d() == z) {
                fkoVar.c(fodVarArr);
            }
        }
    }

    private static void c(foe foeVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                foeVar.s(((fod) it.next()).a, jCurrentTimeMillis);
            }
        }
    }
}
