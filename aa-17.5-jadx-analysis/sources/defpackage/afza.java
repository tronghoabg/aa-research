package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class afza {
    private afza() {
    }

    private final agel createValueParameter(afzb afzbVar, int i, agee ageeVar) {
        String lowerCase;
        String strAsString = ageeVar.getName().asString();
        strAsString.getClass();
        if (affa.f(strAsString, "T")) {
            lowerCase = "instance";
        } else if (affa.f(strAsString, "E")) {
            lowerCase = "receiver";
        } else {
            lowerCase = strAsString.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        agfk empty = agfk.Companion.getEMPTY();
        ahnj ahnjVarIdentifier = ahnj.identifier(lowerCase);
        aigw defaultType = ageeVar.getDefaultType();
        defaultType.getClass();
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        return new agiy(afzbVar, null, i, empty, ahnjVarIdentifier, defaultType, false, false, false, null, agdxVar);
    }

    public final afzb create(afyw afywVar, boolean z) {
        afywVar.getClass();
        List<agee> declaredTypeParameters = afywVar.getDeclaredTypeParameters();
        afzb afzbVar = new afzb(afywVar, null, agaw.DECLARATION, z, null);
        agdq thisAsReceiverParameter = afywVar.getThisAsReceiverParameter();
        afbe afbeVar = afbe.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredTypeParameters) {
            if (((agee) obj).getVariance() != aijg.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        Iterable<afbh> iterableBD = woy.bD(arrayList);
        ArrayList arrayList2 = new ArrayList(woy.bp(iterableBD, 10));
        for (afbh afbhVar : iterableBD) {
            arrayList2.add(afzb.Factory.createValueParameter(afzbVar, afbhVar.a, (agee) afbhVar.b));
        }
        afzbVar.initialize((agdq) null, thisAsReceiverParameter, (List<agdq>) afbeVar, (List<? extends agee>) afbeVar, (List<agel>) arrayList2, (aigl) ((agee) woy.bK(declaredTypeParameters)).getDefaultType(), agcq.ABSTRACT, agcb.PUBLIC);
        afzbVar.setHasSynthesizedParameterNames(true);
        return afzbVar;
    }

    public /* synthetic */ afza(afeu afeuVar) {
        this();
    }
}
