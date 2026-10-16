package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final /* synthetic */ class nno implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ nno(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                lmd lmdVar = (lmd) obj2;
                yph yphVar = nnu.a;
                ((lmd) obj).getClass();
                return Boolean.valueOf(!ljt.c(r9.h(), lmdVar != null ? lmdVar.h() : null));
            case 1:
                mqc mqcVar = (mqc) obj2;
                yph yphVar2 = nnu.a;
                ((ComponentName) obj).getClass();
                return Boolean.valueOf(!affa.f(r9, mqcVar != null ? mqcVar.a() : null));
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Boolean bool = (Boolean) obj2;
                yph yphVar3 = nnu.a;
                return new nnq(zBooleanValue, (zBooleanValue && affa.f(bool, false)) ? 2 : (zBooleanValue || !affa.f(bool, true)) ? 1 : 3);
            case 3:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                if (iIntValue != 102) {
                    if (iIntValue2 != 2) {
                        i = iIntValue2;
                    }
                    yop yopVarL = nnu.a.l();
                    Boolean boolValueOf = Boolean.valueOf(z);
                    yopVarL.R("isMainActionDisabled: %b (gear=%s, overlay=%d)", boolValueOf, num, Integer.valueOf(i));
                    return boolValueOf;
                }
                i = iIntValue2;
                z = true;
                yop yopVarL2 = nnu.a.l();
                Boolean boolValueOf2 = Boolean.valueOf(z);
                yopVarL2.R("isMainActionDisabled: %b (gear=%s, overlay=%d)", boolValueOf2, num, Integer.valueOf(i));
                return boolValueOf2;
            case 4:
                Boolean bool2 = (Boolean) obj;
                yfq yfqVar = (yfq) obj2;
                yph yphVar4 = nxu.a;
                int size = yfqVar.size();
                int i = 0;
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    nxq nxqVar = (nxq) yfqVar.get(i2);
                    if (nxqVar.b) {
                        nuh nuhVar = nxqVar.a;
                        if (nuhVar.f() && !nuhVar.g) {
                            i++;
                        }
                    }
                    z |= !(nxqVar.a.c.x != nuo.k);
                }
                nww nwwVar = new nww();
                nwwVar.c(bool2.booleanValue());
                nwwVar.d(yfqVar.size());
                nwwVar.b(i);
                nwwVar.a = z;
                nwwVar.b = (byte) (nwwVar.b | 8);
                return nwwVar.a();
            case 5:
                return ca.F(100, 200, null, 4);
            case 6:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                afco afcoVar = tby.a;
                if (bool3 == null && bool4 != null && bool4.booleanValue()) {
                    return true;
                }
                if (bool3 == null) {
                    return null;
                }
                if (bool3.booleanValue()) {
                    return true;
                }
                return bool4;
            case 7:
                afco afcoVar2 = tby.a;
                return obj == null ? obj2 : obj;
            case 8:
                afco afcoVar3 = tby.a;
                return new dzi(obj, obj2);
            case 9:
                Boolean bool5 = (Boolean) obj;
                Boolean bool6 = (Boolean) obj2;
                afco afcoVar4 = tby.a;
                if (bool5 == null && bool6 != null && !bool6.booleanValue()) {
                    return false;
                }
                if (bool5 == null) {
                    return null;
                }
                if (bool5.booleanValue()) {
                    return bool6;
                }
                return false;
            case 10:
                return true;
            case 11:
                afco afcoVar5 = (afco) obj;
                afcm afcmVar = (afcm) obj2;
                afcoVar5.getClass();
                afcmVar.getClass();
                afco afcoVarMinusKey = afcoVar5.minusKey(afcmVar.getKey());
                afcp afcpVar = afcp.a;
                if (afcoVarMinusKey == afcpVar) {
                    return afcmVar;
                }
                bwi bwiVar = afcl.k;
                afcl afclVar = (afcl) afcoVarMinusKey.get(bwiVar);
                if (afclVar == null) {
                    return new afcj(afcoVarMinusKey, afcmVar);
                }
                afco afcoVarMinusKey2 = afcoVarMinusKey.minusKey(bwiVar);
                return afcoVarMinusKey2 == afcpVar ? new afcj(afcmVar, afclVar) : new afcj(new afcj(afcoVarMinusKey2, afcmVar), afclVar);
            case 12:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((afcm) obj2) instanceof aitq));
            case 13:
                afcm afcmVar2 = (afcm) obj2;
                if (afcmVar2 instanceof aiwi) {
                    Integer num2 = obj instanceof Integer ? (Integer) obj : null;
                    int iIntValue3 = num2 != null ? num2.intValue() : 1;
                    return iIntValue3 == 0 ? afcmVar2 : Integer.valueOf(iIntValue3 + 1);
                }
            case 14:
                aiwi aiwiVar = (aiwi) obj;
                afcm afcmVar3 = (afcm) obj2;
                if (aiwiVar != null) {
                    return aiwiVar;
                }
                if (afcmVar3 instanceof aiwi) {
                    return (aiwi) afcmVar3;
                }
                return null;
            default:
                ajdg ajdgVar = (ajdg) obj;
                afcm afcmVar4 = (afcm) obj2;
                if (!(afcmVar4 instanceof aiwi)) {
                    return ajdgVar;
                }
                aiwi aiwiVar2 = (aiwi) afcmVar4;
                Object objHC = aiwiVar2.hC(ajdgVar.a);
                Object[] objArr = ajdgVar.b;
                int i3 = ajdgVar.d;
                objArr[i3] = objHC;
                aiwi[] aiwiVarArr = ajdgVar.c;
                ajdgVar.d = i3 + 1;
                aiwiVar2.getClass();
                aiwiVarArr[i3] = aiwiVar2;
                return ajdgVar;
        }
    }
}
