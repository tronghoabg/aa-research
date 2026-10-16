package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class eig implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eig(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [fbw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15, types: [esa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [aivn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v66, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v75, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v77, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        java.util.List list;
        boolean z = false;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object objInvoke = this.a.invoke();
                java.io.File file = (java.io.File) objInvoke;
                if (!defpackage.afga.f(defpackage.affz.d(file), "preferences_pb")) {
                    throw new java.lang.IllegalStateException(defpackage.a.bl(objInvoke, "File extension for file: ", " does not match required extension for Preferences file: preferences_pb"));
                }
                java.io.File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 1:
                this.a.gK();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.epk) this.a).a = null;
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.Map map = ((defpackage.erz) ((defpackage.ndd) this.a).c).a;
                java.lang.Object esmVar = map.get("androidx.navigation.NavControllerViewModel");
                if (esmVar == null) {
                    esmVar = new esm();
                    map.put("androidx.navigation.NavControllerViewModel", esmVar);
                }
                return (defpackage.ers) esmVar;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ?? r14 = this.a;
                defpackage.euw euwVar = (defpackage.euw) r14;
                if (!euwVar.f) {
                    throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (euwVar.g.e != defpackage.epx.a) {
                    return defpackage.ebq.e(r14, (defpackage.erw) euwVar.h.a(), defpackage.edd.f(r14)).b(defpackage.afgw.b(evz.class)).a;
                }
                throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.eva evaVar = (defpackage.eva) this.a;
                if (evaVar.f) {
                    defpackage.afbz afbzVar = evaVar.b.e;
                    if (!afbzVar.isEmpty()) {
                        java.util.Iterator<E> it = afbzVar.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            if (!(((defpackage.euw) it.next()).a instanceof defpackage.evg) && (i = i + 1) < 0) {
                                defpackage.afga.ah();
                            }
                        }
                        if (i > 1) {
                            z = true;
                        }
                    }
                }
                evaVar.e.f(z);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.eva evaVar2 = (defpackage.eva) this.a;
                return new defpackage.evi(evaVar2.a, evaVar2.b.k);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String str = ((evc) this.a).f;
                if (str != null) {
                    return new aito(str, (byte[]) null);
                }
                return null;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String str2 = ((evc) this.a).c;
                if (str2 != null && evc.b.f(str2)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                evc evcVar = (evc) this.a;
                if (evcVar.h()) {
                    java.lang.String str3 = evcVar.c;
                    str3.getClass();
                    android.net.Uri uriF = defpackage.ebs.f(str3);
                    for (java.lang.String str4 : uriF.getQueryParameterNames()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.util.List<java.lang.String> queryParameters = uriF.getQueryParameters(str4);
                        if (queryParameters.size() > 1) {
                            throw new java.lang.IllegalArgumentException(defpackage.a.bB(str3, str4, "Query parameter ", " must only be present once in ", ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                        }
                        java.lang.String str5 = (java.lang.String) defpackage.afga.aB(queryParameters);
                        if (str5 == null) {
                            evcVar.g = true;
                            str5 = str4;
                        }
                        gih gihVar = new gih();
                        int i2 = 0;
                        for (aiti aitiVarG = evc.a.g(str5); aitiVarG != null; aitiVarG = aitiVarG.c()) {
                            aith aithVarB = ((aitl) aitiVarG).b.b(1);
                            aithVarB.getClass();
                            gihVar.a.add(aithVarB.a);
                            if (aitiVarG.b().a > i2) {
                                java.lang.String strSubstring = str5.substring(i2, aitiVarG.b().a);
                                strSubstring.getClass();
                                sb.append(afvs.a(strSubstring));
                            }
                            sb.append("([\\s\\S]+?)?");
                            i2 = aitiVarG.b().b + 1;
                        }
                        if (i2 < str5.length()) {
                            java.lang.String strSubstring2 = str5.substring(i2);
                            strSubstring2.getClass();
                            sb.append(afvs.a(strSubstring2));
                        }
                        sb.append("$");
                        gihVar.b = evc.k(sb.toString());
                        linkedHashMap.put(str4, gihVar);
                    }
                }
                return linkedHashMap;
            case 10:
                java.lang.String str6 = ((evc) this.a).c;
                if (str6 == null || defpackage.ebs.f(str6).getFragment() == null) {
                    return null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String fragment = defpackage.ebs.f(str6).getFragment();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                fragment.getClass();
                evc.j(fragment, arrayList, sb2);
                return new defpackage.afau(arrayList, sb2.toString());
            case 11:
                defpackage.afau afauVarC = ((evc) this.a).c();
                return (afauVarC == null || (list = (java.util.List) afauVarC.a) == null) ? new java.util.ArrayList() : list;
            case 12:
                defpackage.afau afauVarC2 = ((evc) this.a).c();
                if (afauVarC2 != null) {
                    return (java.lang.String) afauVarC2.b;
                }
                return null;
            case 13:
                java.lang.String str7 = (java.lang.String) ((evc) this.a).h.a();
                if (str7 != null) {
                    return new aito(str7, (byte[]) null);
                }
                return null;
            case 14:
                java.lang.String str8 = ((evc) this.a).j;
                if (str8 != null) {
                    return new aito(str8);
                }
                return null;
            case 15:
                this.a.invoke();
                return defpackage.afbk.a;
            case 16:
                return new evc((java.lang.String) this.a, (java.lang.String) null, (java.lang.String) null);
            case 17:
                ezi eziVar = ((eyy) this.a).a;
                return java.lang.Boolean.valueOf(!eziVar.o() || eziVar.q());
            case 18:
                this.a.run();
                return defpackage.afbk.a;
            case 19:
                return this.a.call();
            default:
                fan fanVar = (fan) this.a;
                ?? r0 = fanVar.d.a;
                java.lang.String strC = r0.c();
                java.lang.String str9 = fanVar.a;
                if (strC == null) {
                    if (!defpackage.afga.f(str9, ":memory:")) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bp(str9, "This driver is configured to open an in-memory database but a file-based named '", "' was requested."));
                    }
                } else if (!defpackage.afga.f(strC, str9) && !defpackage.afga.f(afzh.p(strC, '/', strC), afzh.p(str9, '/', str9))) {
                    throw new java.lang.IllegalArgumentException("This driver is configured to open a database named '" + r0.c() + "' but '" + str9 + "' was requested.");
                }
                return new fch(r0.b());
        }
    }
}
