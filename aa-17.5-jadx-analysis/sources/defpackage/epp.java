package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class epp implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ epp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v12, types: [eru, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v63, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v72, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v74, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.afdr
    public final Object invoke() {
        List list;
        fbv fbvVar;
        switch (this.b) {
            case 0:
                ept eptVar = (ept) this.a;
                ajab ajabVarA = ajac.a(eptVar.a());
                eptVar.c(new erc(ajabVarA, 1));
                return new aizl(ajabVarA, null);
            case 1:
                ((epe) this.a).a = null;
                return afak.a;
            case 2:
                Map map = ((ert) ((ncp) this.a).c).a;
                Object esgVar = map.get("androidx.navigation.NavControllerViewModel");
                if (esgVar == null) {
                    esgVar = new esg();
                    map.put("androidx.navigation.NavControllerViewModel", esgVar);
                }
                return (esg) ((erm) esgVar);
            case 3:
                ?? r14 = this.a;
                euq euqVar = (euq) r14;
                if (!euqVar.f) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (euqVar.g.e != eps.a) {
                    return ((evt) ebj.h(r14, (erq) euqVar.h.a(), ecw.g(r14)).b(affw.b(evt.class))).a;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            case 4:
                euu euuVar = (euu) this.a;
                if (euuVar.f) {
                    afaz afazVar = euuVar.b.e;
                    if (!afazVar.isEmpty()) {
                        Iterator<E> it = afazVar.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            if (!(((euq) it.next()).a instanceof eva) && (i = i + 1) < 0) {
                                woy.bn();
                            }
                        }
                        if (i > 1) {
                            z = true;
                        }
                    }
                }
                euuVar.e.f(z);
                return afak.a;
            case 5:
                euu euuVar2 = (euu) this.a;
                return new evc(euuVar2.a, euuVar2.b.k);
            case 6:
                String str = ((euw) this.a).f;
                if (str != null) {
                    return new aisp(str, null);
                }
                return null;
            case 7:
                String str2 = ((euw) this.a).c;
                if (str2 != null && euw.b.f(str2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                euw euwVar = (euw) this.a;
                if (euwVar.h()) {
                    String str3 = euwVar.c;
                    str3.getClass();
                    Uri uriL = ebk.l(str3);
                    for (String str4 : uriL.getQueryParameterNames()) {
                        StringBuilder sb = new StringBuilder();
                        List<String> queryParameters = uriL.getQueryParameters(str4);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(a.bC(str3, str4, "Query parameter ", " must only be present once in ", ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                        }
                        String str5 = (String) woy.bH(queryParameters);
                        if (str5 == null) {
                            euwVar.g = true;
                            str5 = str4;
                        }
                        gib gibVar = new gib();
                        int i2 = 0;
                        for (aisj aisjVarG = euw.a.g(str5); aisjVarG != null; aisjVarG = aisjVarG.c()) {
                            aisi aisiVarB = ((aism) aisjVarG).b.b(1);
                            aisiVarB.getClass();
                            gibVar.a.add(aisiVarB.a);
                            if (aisjVarG.b().a > i2) {
                                String strSubstring = str5.substring(i2, aisjVarG.b().a);
                                strSubstring.getClass();
                                sb.append(afus.a(strSubstring));
                            }
                            sb.append("([\\s\\S]+?)?");
                            i2 = aisjVarG.b().b + 1;
                        }
                        if (i2 < str5.length()) {
                            String strSubstring2 = str5.substring(i2);
                            strSubstring2.getClass();
                            sb.append(afus.a(strSubstring2));
                        }
                        sb.append("$");
                        gibVar.b = euw.k(sb.toString());
                        linkedHashMap.put(str4, gibVar);
                    }
                }
                return linkedHashMap;
            case 9:
                String str6 = ((euw) this.a).c;
                if (str6 == null || ebk.l(str6).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = ebk.l(str6).getFragment();
                StringBuilder sb2 = new StringBuilder();
                fragment.getClass();
                euw.j(fragment, arrayList, sb2);
                return new aezu(arrayList, sb2.toString());
            case 10:
                aezu aezuVarC = ((euw) this.a).c();
                return (aezuVarC == null || (list = (List) aezuVarC.a) == null) ? new ArrayList() : list;
            case 11:
                aezu aezuVarC2 = ((euw) this.a).c();
                if (aezuVarC2 != null) {
                    return (String) aezuVarC2.b;
                }
                return null;
            case 12:
                String str7 = (String) ((euw) this.a).h.a();
                if (str7 != null) {
                    return new aisp(str7, null);
                }
                return null;
            case 13:
                String str8 = ((euw) this.a).j;
                if (str8 != null) {
                    return new aisp(str8);
                }
                return null;
            case 14:
                this.a.invoke();
                return afak.a;
            case 15:
                return new euw((String) this.a, null, null);
            case 16:
                ezc ezcVar = ((eys) this.a).a;
                return Boolean.valueOf(!ezcVar.o() || ezcVar.q());
            case 17:
                this.a.run();
                return afak.a;
            case 18:
                return this.a.call();
            case 19:
                fah fahVar = (fah) this.a;
                ?? r0 = fahVar.d.a;
                String strC = r0.c();
                String str9 = fahVar.a;
                if (strC == null) {
                    if (!affa.f(str9, ":memory:")) {
                        throw new IllegalArgumentException(a.bq(str9, "This driver is configured to open an in-memory database but a file-based named '", "' was requested."));
                    }
                } else if (!affa.f(strC, str9) && !affa.f(afyh.p(strC, '/', strC), afyh.p(str9, '/', str9))) {
                    throw new IllegalArgumentException("This driver is configured to open a database named '" + r0.c() + "' but '" + str9 + "' was requested.");
                }
                return new fca(r0.b());
            default:
                fbw fbwVar = (fbw) this.a;
                String str10 = fbwVar.b;
                if (str10 == null || !fbwVar.d) {
                    fbvVar = new fbv(fbwVar.a, str10, new vw(), fbwVar.c, fbwVar.e);
                } else {
                    Context context = fbwVar.a;
                    fbvVar = new fbv(context, new File(context.getNoBackupFilesDir(), str10).getAbsolutePath(), new vw(), fbwVar.c, fbwVar.e);
                }
                fbvVar.setWriteAheadLoggingEnabled(fbwVar.f);
                return fbvVar;
        }
    }
}
