package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nog implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ nog(int i) {
        this.a = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        int i2 = 3;
        int i3 = 2;
        boolean z = false;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.mqj mqjVar = (defpackage.mqj) obj2;
                defpackage.yqm yqmVar = defpackage.non.a;
                componentName.getClass();
                return java.lang.Boolean.valueOf(!defpackage.afga.f(componentName, mqjVar != null ? mqjVar.a() : null));
            case 1:
                defpackage.nod nodVar = (defpackage.nod) obj;
                defpackage.nod nodVar2 = (defpackage.nod) obj2;
                defpackage.yqm yqmVar2 = defpackage.non.a;
                nodVar.getClass();
                if (!defpackage.afga.f(defpackage.nod.a, nodVar) && nodVar2 != null) {
                    android.content.ComponentName componentName2 = nodVar.r;
                    if (!defpackage.afga.f(nodVar2.r, componentName2)) {
                        int size = defpackage.afga.bU(new defpackage.noc[]{nodVar.o, nodVar.p, nodVar.q}).size();
                        int i4 = nodVar.u - 1;
                        if (i4 == 0) {
                            i = 4;
                        } else if (i4 != 1) {
                            i = i4 != 2 ? -1 : 1;
                        } else {
                            i = 2;
                        }
                        ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).p(defpackage.zbe.RAIL_WIDGET, defpackage.zbd.kV, componentName2, i, size);
                    }
                }
                return nodVar;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                defpackage.lmk lmkVar2 = (defpackage.lmk) obj2;
                defpackage.yqm yqmVar3 = defpackage.non.a;
                lmkVar.getClass();
                return java.lang.Boolean.valueOf(!lka.c(lmkVar.h(), lmkVar2 != null ? lmkVar2.h() : null));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Boolean bool = (java.lang.Boolean) obj2;
                defpackage.yqm yqmVar4 = defpackage.non.a;
                if (zBooleanValue && defpackage.afga.f(bool, java.lang.Boolean.FALSE)) {
                    i2 = 2;
                } else if (zBooleanValue || !defpackage.afga.f(bool, java.lang.Boolean.TRUE)) {
                    i2 = 1;
                }
                return new noj(zBooleanValue, i2);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                int iIntValue = num.intValue();
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (iIntValue != 102) {
                    if (iIntValue2 != 2) {
                        i3 = iIntValue2;
                    }
                    defpackage.ypu ypuVarL = defpackage.non.a.l();
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                    ypuVarL.R("isMainActionDisabled: %b (gear=%s, overlay=%d)", boolValueOf, num, java.lang.Integer.valueOf(i3));
                    return boolValueOf;
                }
                i3 = iIntValue2;
                z = true;
                defpackage.ypu ypuVarL2 = defpackage.non.a.l();
                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z);
                ypuVarL2.R("isMainActionDisabled: %b (gear=%s, overlay=%d)", boolValueOf2, num, java.lang.Integer.valueOf(i3));
                return boolValueOf2;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                defpackage.ygw ygwVar = (defpackage.ygw) obj2;
                defpackage.yqm yqmVar5 = defpackage.nyk.a;
                int size2 = ygwVar.size();
                int i5 = 0;
                boolean z2 = false;
                for (int i6 = 0; i6 < size2; i6++) {
                    nyg nygVar = (nyg) ygwVar.get(i6);
                    if (nygVar.b) {
                        nuv nuvVar = nygVar.a;
                        if (nuvVar.f() && !nuvVar.g) {
                            i5++;
                        }
                    }
                    z2 |= !(nygVar.a.c.x != defpackage.nve.k);
                }
                defpackage.nxm nxmVar = new defpackage.nxm();
                nxmVar.c(bool2.booleanValue());
                nxmVar.d(ygwVar.size());
                nxmVar.b(i5);
                nxmVar.a = z2;
                nxmVar.b = (byte) (nxmVar.b | 8);
                return nxmVar.a();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.ca.F(100, 200, null, 4);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                java.lang.Boolean bool4 = (java.lang.Boolean) obj2;
                defpackage.afdo afdoVar = defpackage.tcu.a;
                if (bool3 == null && bool4 != null && bool4.booleanValue()) {
                    return java.lang.Boolean.TRUE;
                }
                if (bool3 == null) {
                    return null;
                }
                return !bool3.booleanValue() ? bool4 : java.lang.Boolean.TRUE;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                return obj == null ? obj2 : obj;
            case 9:
                defpackage.afdo afdoVar3 = defpackage.tcu.a;
                return new defpackage.dzp(obj, obj2);
            case 10:
                java.lang.Boolean bool5 = (java.lang.Boolean) obj;
                java.lang.Boolean bool6 = (java.lang.Boolean) obj2;
                defpackage.afdo afdoVar4 = defpackage.tcu.a;
                if (bool5 == null && bool6 != null && !bool6.booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                if (bool5 == null) {
                    return null;
                }
                return bool5.booleanValue() ? bool6 : java.lang.Boolean.FALSE;
            case 11:
                return java.lang.Boolean.TRUE;
            case 12:
                defpackage.afdo afdoVar5 = (defpackage.afdo) obj;
                defpackage.afdm afdmVar = (defpackage.afdm) obj2;
                afdoVar5.getClass();
                afdmVar.getClass();
                defpackage.afdo afdoVarMinusKey = afdoVar5.minusKey(afdmVar.getKey());
                defpackage.afdp afdpVar = defpackage.afdp.a;
                if (afdoVarMinusKey == afdpVar) {
                    return afdmVar;
                }
                defpackage.bwp bwpVar = defpackage.afdl.k;
                defpackage.afdl afdlVar = (defpackage.afdl) afdoVarMinusKey.get(bwpVar);
                if (afdlVar == null) {
                    return new defpackage.afdj(afdoVarMinusKey, afdmVar);
                }
                defpackage.afdo afdoVarMinusKey2 = afdoVarMinusKey.minusKey(bwpVar);
                return afdoVarMinusKey2 == afdpVar ? new defpackage.afdj(afdmVar, afdlVar) : new defpackage.afdj(new defpackage.afdj(afdoVarMinusKey2, afdmVar), afdlVar);
            case 13:
                return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue() || (((defpackage.afdm) obj2) instanceof aiuq));
            case 14:
                return java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() + 1);
            case 15:
                defpackage.afdm afdmVar2 = (defpackage.afdm) obj2;
                if (afdmVar2 instanceof aixh) {
                    lmj lmjVar = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                    int iIntValue3 = lmjVar != null ? lmjVar.intValue() : 1;
                    return iIntValue3 == 0 ? afdmVar2 : java.lang.Integer.valueOf(iIntValue3 + 1);
                }
            case 16:
                aixh aixhVar = (aixh) obj;
                aixh aixhVar2 = (defpackage.afdm) obj2;
                if (aixhVar != null) {
                    return aixhVar;
                }
                if (aixhVar2 instanceof aixh) {
                    return aixhVar2;
                }
                return null;
            default:
                ajeg ajegVar = (ajeg) obj;
                aixh aixhVar3 = (defpackage.afdm) obj2;
                if (!(aixhVar3 instanceof aixh)) {
                    return ajegVar;
                }
                aixh aixhVar4 = aixhVar3;
                java.lang.Object objGO = aixhVar4.gO(ajegVar.a);
                java.lang.Object[] objArr = ajegVar.b;
                int i7 = ajegVar.d;
                objArr[i7] = objGO;
                aixh[] aixhVarArr = ajegVar.c;
                ajegVar.d = i7 + 1;
                aixhVar4.getClass();
                aixhVarArr[i7] = aixhVar4;
                return ajegVar;
        }
    }
}
