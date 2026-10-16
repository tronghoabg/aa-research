package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class xvo implements zge {
    private final adus a;

    public xvo(adus adusVar) {
        this.a = adusVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        if (th instanceof ExecutionException) {
            th = th.getCause();
        }
        adus adusVar = this.a;
        if ((th instanceof xvj) && ((xvj) th).a()) {
            ((adit) adusVar.a).a(adnq.m.e("Credentials failed to obtain metadata").d(th));
        } else {
            ((adit) adusVar.a).a(adnq.h.e("Failed computing credential metadata").d(th));
        }
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        admc admcVar;
        Map map = ((xvp) obj).b;
        adus adusVar = this.a;
        try {
            Object obj2 = adusVar.b;
            synchronized (obj2) {
                Map map2 = ((adoc) obj2).e;
                if (map2 == null || map2 != map) {
                    admc admcVar2 = new admc();
                    for (String str : map.keySet()) {
                        if (str.endsWith("-bin")) {
                            adqs adqsVar = admc.f;
                            int i = adlx.d;
                            adlv adlvVar = new adlv(str, adqsVar);
                            Iterator it = ((List) map.get(str)).iterator();
                            while (it.hasNext()) {
                                admcVar2.f(adlvVar, ytq.d.j((String) it.next()));
                            }
                        } else {
                            adlu adluVar = admc.b;
                            int i2 = adlx.d;
                            adlt adltVar = new adlt(str, adluVar);
                            Iterator it2 = ((List) map.get(str)).iterator();
                            while (it2.hasNext()) {
                                admcVar2.f(adltVar, (String) it2.next());
                            }
                        }
                    }
                    ((adoc) obj2).d = admcVar2;
                    ((adoc) obj2).e = map;
                }
                admcVar = ((adoc) obj2).d;
            }
            Object obj3 = adusVar.a;
            adit aditVar = (adit) obj3;
            woy.aa(!aditVar.i, "apply() or fail() already called");
            admcVar.getClass();
            admc admcVar3 = aditVar.c;
            admcVar3.e(admcVar);
            adjq adjqVarA = aditVar.e.a();
            try {
                adsh adshVarB = ((adit) obj3).a.b(((adit) obj3).b, admcVar3, ((adit) obj3).d, ((adit) obj3).f);
                aditVar.e.f(adjqVarA);
                aditVar.b(adshVarB);
            } catch (Throwable th) {
                aditVar.e.f(adjqVarA);
                throw th;
            }
        } catch (Throwable th2) {
            ((adit) adusVar.a).a(adnq.h.e("Failed to convert credential metadata").d(th2));
        }
    }
}
