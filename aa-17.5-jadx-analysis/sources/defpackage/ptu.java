package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import j$.util.Optional;

/* loaded from: classes.dex */
public final /* synthetic */ class ptu implements xxj {
    private final /* synthetic */ int a;

    public /* synthetic */ ptu(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xxj
    public final boolean a(Object obj) {
        int iOrdinal;
        abdz abdzVar;
        switch (this.a) {
            case 0:
                Exception exc = (Exception) obj;
                return (exc == null || (iOrdinal = pwu.c(exc).q.ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2 || (iOrdinal != 9 && (iOrdinal == 12 || iOrdinal == 15))) ? false : true;
            case 1:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                int i = mam.a;
                return resolveInfo.serviceInfo != null && kmo.c(actz.g(), new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name).flattenToString());
            case 2:
                ResolveInfo resolveInfo2 = (ResolveInfo) obj;
                int i2 = qho.a;
                if (resolveInfo2.filter == null) {
                    return true;
                }
                return (resolveInfo2.filter.hasCategory("com.google.android.gms.car.category.CATEGORY_AUXILIARY_DISPLAY") || resolveInfo2.filter.hasCategory("com.google.android.gms.car.category.CATEGORY_CLUSTER_DISPLAY") || resolveInfo2.filter.hasCategory("com.google.android.gms.car.category.CATEGORY_SECONDARY_REGION")) ? false : true;
            case 3:
                return ((tqo) obj).b() != null;
            case 4:
                return false;
            case 5:
                abcs abcsVar = (abcs) obj;
                return ((abcsVar.b & 8) == 0 || uxa.b(abcsVar)) ? false : true;
            case 6:
                abcs abcsVar2 = (abcs) obj;
                if ((abcsVar2.b & 8) != 0 && !uxa.b(abcsVar2)) {
                    abnh abnhVar = aazp.b;
                    abcsVar2.j(abnhVar);
                    if (!abcsVar2.w.m(abnhVar.d)) {
                        return true;
                    }
                }
                return false;
            case 7:
                abcs abcsVar3 = (abcs) obj;
                abcd abcdVarA = uxa.a(abcsVar3);
                if ((!abcdVarA.equals(abbf.V.b) && abcdVarA.m) || wox.ao(aclh.p(abcsVar3).c) == 17 || wox.ao(aclh.p(abcsVar3).c) == 20) {
                    return false;
                }
                abnh abnhVar2 = abbf.E;
                abcsVar3.j(abnhVar2);
                Object objJ = abcsVar3.w.j(abnhVar2.d);
                if (((abkq) (objJ == null ? abnhVar2.b : abnhVar2.c(objJ))).equals(abkq.a)) {
                    abnh abnhVar3 = abbf.O;
                    abcsVar3.j(abnhVar3);
                    abnl abnlVar = abcsVar3.w;
                    abnu abnuVar = abnhVar3.d;
                    if (abnlVar.m(abnuVar)) {
                        abcsVar3.j(abnhVar3);
                        Object objJ2 = abcsVar3.w.j(abnuVar);
                        abdzVar = (abdz) (objJ2 == null ? abnhVar3.b : abnhVar3.c(objJ2));
                    } else {
                        abdzVar = null;
                    }
                    if (abdzVar != null || wox.ao(aclh.p(abcsVar3).c) == 6 || uxa.b(abcsVar3) || (abcsVar3.h & 1) != 0) {
                        return false;
                    }
                    abco abcoVar = abcsVar3.c;
                    if (abcoVar == null) {
                        abcoVar = abco.a;
                    }
                    aboh abohVar = abcoVar.c;
                    abco abcoVar2 = abcsVar3.d;
                    if (abcoVar2 == null) {
                        abcoVar2 = abco.a;
                    }
                    aboh abohVar2 = abcoVar2.c;
                    if ((abcsVar3.b & 8) != 0 && !abohVar.isEmpty() && (((abcn) abohVar.get(0)).b & 1) == 0 && !abohVar2.isEmpty() && (((abcn) abohVar2.get(0)).b & 1) != 0) {
                        return true;
                    }
                }
                return false;
            case 8:
                yob yobVar = udq.a;
                return false;
            default:
                return ((Optional) obj).isPresent();
        }
    }
}
