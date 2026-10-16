package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class evf {
    public static final /* synthetic */ int g = 0;
    private java.lang.CharSequence a;
    public final java.lang.String c;
    public final eww d;
    public defpackage.evg e;
    public final defpackage.abb f;

    static {
        new java.util.LinkedHashMap();
    }

    public evf(defpackage.evv evvVar) {
        java.util.Map map = defpackage.evw.a;
        this.c = defpackage.ebo.k(evvVar.getClass());
        this.d = new eww(this);
        this.f = new defpackage.abb(null);
    }

    private final java.util.List j() {
        return this.d.c;
    }

    public void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, defpackage.ewe.e);
        typedArrayObtainAttributes.getClass();
        java.lang.String string = typedArrayObtainAttributes.getString(2);
        eww ewwVar = this.d;
        if (string == null) {
            ewwVar.a(0);
        } else {
            if (afzh.v(string)) {
                throw new java.lang.IllegalArgumentException("Cannot have an empty route");
            }
            java.lang.String strConcat = "android-app://androidx.navigation/".concat(string);
            java.util.List listI = defpackage.ebr.i(ewwVar.d, new ewr(new evc(strConcat, (java.lang.String) null, (java.lang.String) null), 4));
            if (!listI.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot set route \"" + string + "\" for destination " + ewwVar.a + ". Following required arguments are missing: " + listI);
            }
            ewwVar.g = new defpackage.afay(new defpackage.eig(strConcat, 16));
            ewwVar.a(strConcat.hashCode());
        }
        ewwVar.f = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            ewwVar.a(typedArrayObtainAttributes.getResourceId(1, 0));
            ewwVar.b = defpackage.ebm.g(new defpackage.erh(context), c());
        }
        this.a = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public boolean b() {
        return true;
    }

    public final int c() {
        return this.d.e;
    }

    public final android.os.Bundle d(android.os.Bundle bundle) {
        eww ewwVar = this.d;
        if (bundle == null && ewwVar.d.isEmpty()) {
            return null;
        }
        android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
        java.util.Map map = ewwVar.d;
        for (java.util.Map.Entry entry : map.entrySet()) {
            ((defpackage.euu) entry.getValue()).a((java.lang.String) entry.getKey(), bundleU);
        }
        if (bundle != null) {
            bundleU.putAll(bundle);
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                defpackage.euu euuVar = (defpackage.euu) entry2.getValue();
                str.getClass();
                if (euuVar.b || !bundleU.containsKey(str) || !defpackage.fbh.g(bundleU, str)) {
                    try {
                        euuVar.a.b(bundleU, str);
                    } catch (java.lang.IllegalStateException unused) {
                    }
                }
                throw new java.lang.IllegalArgumentException("Wrong argument type for '" + str + "' in argument savedState. " + euuVar.a.e() + " expected.");
            }
        }
        return bundleU;
    }

    public final defpackage.eut e(int i) {
        defpackage.abb abbVar = this.f;
        defpackage.eut eutVar = abbVar.c() == 0 ? null : (defpackage.eut) defpackage.abc.a(abbVar, i);
        if (eutVar != null) {
            return eutVar;
        }
        defpackage.evg evgVar = this.e;
        if (evgVar == null) {
            return null;
        }
        return evgVar.e(i);
    }

    public boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.evf)) {
            defpackage.evf evfVar = (defpackage.evf) obj;
            boolean zF = defpackage.afga.f(j(), evfVar.j());
            defpackage.abb abbVar = this.f;
            if (abbVar.c() != evfVar.f.c()) {
                z = false;
                break;
            }
            abbVar.getClass();
            java.util.Iterator itA = afsg.b(new defpackage.abd(abbVar)).a();
            while (true) {
                if (!itA.hasNext()) {
                    z = true;
                    break;
                }
                int iIntValue = ((java.lang.Number) itA.next()).intValue();
                if (!defpackage.afga.f(defpackage.abc.a(abbVar, iIntValue), defpackage.abc.a(evfVar.f, iIntValue))) {
                    z = false;
                    break;
                }
            }
            if (i().size() != evfVar.i().size()) {
                z2 = false;
                break;
            }
            java.util.Iterator itA2 = defpackage.afga.bg(i().entrySet()).a();
            while (true) {
                if (!itA2.hasNext()) {
                    z2 = true;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) itA2.next();
                if (!evfVar.i().containsKey(entry.getKey()) || !defpackage.afga.f(evfVar.i().get(entry.getKey()), entry.getValue())) {
                    z2 = false;
                    break;
                }
            }
            if (c() == evfVar.c() && defpackage.afga.f(h(), evfVar.h()) && zF && z && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123  */
    public defpackage.eve f(defpackage.evd evdVar) {
        boolean zF;
        boolean zF2;
        android.os.Bundle bundle;
        defpackage.eve eveVar;
        aito aitoVarE;
        aiti aitiVarD;
        java.lang.String str;
        java.lang.String str2;
        aitl aitlVarD;
        eww ewwVar = this.d;
        java.util.List<evc> list = ewwVar.c;
        android.os.Bundle bundle2 = null;
        if (list.isEmpty()) {
            return null;
        }
        defpackage.eve eveVar2 = null;
        for (evc evcVar : list) {
            android.net.Uri uri = evdVar.a;
            if (evcVar.e() == null) {
                zF = true;
            } else if (uri == null) {
                zF = false;
            } else {
                aito aitoVarE2 = evcVar.e();
                aitoVarE2.getClass();
                zF = aitoVarE2.f(uri.toString());
            }
            if (zF) {
                java.lang.String str3 = evdVar.b;
                java.lang.String str4 = evcVar.d;
                if (str4 == null ? true : str3 == null ? false : defpackage.afga.f(str4, str3)) {
                    java.lang.String str5 = evdVar.c;
                    if (evcVar.e == null) {
                        zF2 = true;
                    } else if (str5 == null) {
                        zF2 = false;
                    } else {
                        aito aitoVarD = evcVar.d();
                        aitoVarD.getClass();
                        zF2 = aitoVarD.f(str5);
                    }
                    if (zF2) {
                        if (uri != null) {
                            java.util.Map map = ewwVar.d;
                            aito aitoVarE3 = evcVar.e();
                            if (aitoVarE3 == null) {
                                bundle = null;
                            } else {
                                aiti aitiVarD2 = aitoVarE3.d(uri.toString());
                                if (aitiVarD2 == null) {
                                    bundle = bundle2;
                                } else {
                                    android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
                                    if (evcVar.f(aitiVarD2, bundleU, map) && (!evcVar.h() || evcVar.g(uri, bundleU, map))) {
                                        java.lang.String fragment = uri.getFragment();
                                        aito aitoVar = (aito) evcVar.i.a();
                                        if (aitoVar != null && (aitlVarD = aitoVar.d(java.lang.String.valueOf(fragment))) != null) {
                                            java.util.List listB = evcVar.b();
                                            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(listB, 10));
                                            int i = 0;
                                            for (java.lang.Object obj : listB) {
                                                int i2 = i + 1;
                                                if (i < 0) {
                                                    defpackage.afga.ai();
                                                }
                                                java.lang.String str6 = (java.lang.String) obj;
                                                aith aithVarB = aitlVarD.b.b(i2);
                                                java.lang.String strE = aithVarB != null ? defpackage.ebs.e(aithVarB.a) : null;
                                                defpackage.euu euuVar = (defpackage.euu) map.get(str6);
                                                if (strE == null) {
                                                    strE = "";
                                                }
                                                try {
                                                    evc.i(bundleU, str6, strE, euuVar);
                                                    arrayList.add(defpackage.afbk.a);
                                                    i = i2;
                                                } catch (java.lang.IllegalArgumentException unused) {
                                                }
                                            }
                                        }
                                        if (defpackage.ebr.i(map, new defpackage.deh(bundleU, 19)).isEmpty()) {
                                            bundle = bundleU;
                                        } else {
                                            bundle = null;
                                        }
                                    } else {
                                        bundle = bundle2;
                                    }
                                }
                            }
                        } else {
                            bundle = null;
                        }
                        int size = (uri == null || (str2 = evcVar.c) == null) ? 0 : defpackage.afga.bd(uri.getPathSegments(), defpackage.ebs.f(str2).getPathSegments()).size();
                        java.lang.String str7 = evdVar.b;
                        boolean z = str7 != null && defpackage.afga.f(str7, evcVar.d);
                        java.lang.String str8 = evdVar.c;
                        int iA = -1;
                        if (str8 != null && (str = evcVar.e) != null) {
                            aito aitoVarD2 = evcVar.d();
                            aitoVarD2.getClass();
                            if (aitoVarD2.f(str8)) {
                                iA = new evb(str).a(new evb(str8));
                            }
                        }
                        int i3 = iA;
                        if (bundle != null) {
                            eveVar = new defpackage.eve(ewwVar.a, bundle, evcVar.k, size, z, i3);
                            if (eveVar2 != null || eveVar.compareTo(eveVar2) > 0) {
                                eveVar2 = eveVar;
                            }
                        } else if (z || i3 >= 0) {
                            java.util.Map map2 = ewwVar.d;
                            android.os.Bundle bundleU2 = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
                            if (uri != null && (aitoVarE = evcVar.e()) != null && (aitiVarD = aitoVarE.d(uri.toString())) != null) {
                                evcVar.f(aitiVarD, bundleU2, map2);
                                if (evcVar.h()) {
                                    evcVar.g(uri, bundleU2, map2);
                                }
                            }
                            if (defpackage.ebr.i(map2, new ewr(bundleU2, 5)).isEmpty()) {
                                eveVar = new defpackage.eve(ewwVar.a, bundle, evcVar.k, size, z, i3);
                                if (eveVar2 != null) {
                                    eveVar2 = eveVar;
                                } else {
                                    eveVar2 = eveVar;
                                }
                            }
                        }
                    }
                }
            }
            bundle2 = null;
        }
        return eveVar2;
    }

    public final java.lang.String g() {
        return this.d.b;
    }

    public final java.lang.String h() {
        return this.d.f;
    }

    public int hashCode() {
        int iC = c() * 31;
        java.lang.String strH = h();
        int iHashCode = iC + (strH != null ? strH.hashCode() : 0);
        for (evc evcVar : j()) {
            int i = iHashCode * 31;
            java.lang.String str = evcVar.c;
            int iHashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = evcVar.d;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            java.lang.String str3 = evcVar.e;
            iHashCode = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
        java.util.Iterator itAc = defpackage.ca.ac(this.f);
        while (itAc.hasNext()) {
            defpackage.eut eutVar = (defpackage.eut) itAc.next();
            int i2 = ((iHashCode * 31) + eutVar.a) * 31;
            defpackage.evk evkVar = eutVar.b;
            iHashCode = i2 + (evkVar != null ? evkVar.hashCode() : 0);
            android.os.Bundle bundle = eutVar.c;
            if (bundle != null) {
                iHashCode = (iHashCode * 31) + defpackage.ckn.i(bundle);
            }
        }
        for (java.lang.String str4 : i().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str4.hashCode()) * 31;
            java.lang.Object obj = i().get(str4);
            iHashCode = iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final java.util.Map i() {
        return defpackage.afga.X(this.d.d);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (g() == null) {
            sb.append("0x");
            sb.append(java.lang.Integer.toHexString(c()));
        } else {
            sb.append(g());
        }
        sb.append(")");
        java.lang.String strH = h();
        if (strH != null && !afzh.v(strH)) {
            sb.append(" route=");
            sb.append(h());
        }
        if (this.a != null) {
            sb.append(" label=");
            sb.append(this.a);
        }
        return sb.toString();
    }
}
