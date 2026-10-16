package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class bdd {
    private static Boolean a;
    private static final bvf b = new byo(new acf(15));

    public static final boolean a(int i) {
        if (i >= 8 && i < 1000) {
            Boolean boolValueOf = a;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                a = boolValueOf;
            }
            boolValueOf.getClass();
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void b(final deu deuVar, final dfw dfwVar, final wci wciVar, final List list, final boolean z, bux buxVar) {
        Executor executor = (Executor) buxVar.f(b);
        if (executor == null || !a(deuVar.a())) {
            buxVar.v(317137883);
            ((bvv) buxVar).Y(false);
            return;
        }
        buxVar.v(315439796);
        final dlr dlrVar = (dlr) buxVar.f(dbc.i);
        final dlg dlgVar = (dlg) buxVar.f(dbc.d);
        try {
            executor.execute(new Runnable() { // from class: bdb
                @Override // java.lang.Runnable
                public final void run() {
                    dlg dlgVar2 = dlgVar;
                    wci wciVar2 = wciVar;
                    deu deuVar2 = deuVar;
                    dfw dfwVar2 = dfwVar;
                    dlr dlrVar2 = dlrVar;
                    cdw cdwVarN = byx.n(null, null);
                    try {
                        cec cecVarW = cdwVarN.w();
                        try {
                            dfw dfwVarG = dao.g(dfwVar2, dlrVar2);
                            List list2 = list;
                            if (list2 == null) {
                                list2 = afbe.a;
                            }
                            dfc dfcVar = new dfc(deuVar2, dfwVarG, list2, dlgVar2, wciVar2);
                            dfcVar.a();
                            dfcVar.b();
                            cek.i.k(cecVarW);
                            cdwVarN.c().a();
                        } catch (Throwable th) {
                            cek.i.k(cecVarW);
                            throw th;
                        }
                    } finally {
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        ((bvv) buxVar).Y(false);
    }

    public static final void c(final String str, final dfw dfwVar, final wci wciVar, boolean z, bux buxVar) {
        Executor executor = (Executor) buxVar.f(b);
        if (executor == null || !a(str.length())) {
            buxVar.v(-1248455541);
            ((bvv) buxVar).Y(false);
            return;
        }
        buxVar.v(-1250263182);
        final dlr dlrVar = (dlr) buxVar.f(dbc.i);
        final dlg dlgVar = (dlg) buxVar.f(dbc.d);
        try {
            executor.execute(new Runnable() { // from class: bdc
                @Override // java.lang.Runnable
                public final void run() {
                    wci wciVar2 = wciVar;
                    dlg dlgVar2 = dlgVar;
                    String str2 = str;
                    dfw dfwVar2 = dfwVar;
                    dlr dlrVar2 = dlrVar;
                    cdw cdwVarN = byx.n(null, null);
                    try {
                        cec cecVarW = cdwVarN.w();
                        try {
                            dfw dfwVarG = dao.g(dfwVar2, dlrVar2);
                            afbe afbeVar = afbe.a;
                            dep depVar = new dep(str2, dfwVarG, afbeVar, afbeVar, wciVar2, dlgVar2);
                            depVar.a();
                            depVar.b();
                            cek.i.k(cecVarW);
                            cdwVarN.c().a();
                        } catch (Throwable th) {
                            cek.i.k(cecVarW);
                            throw th;
                        }
                    } finally {
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        ((bvv) buxVar).Y(false);
    }
}
