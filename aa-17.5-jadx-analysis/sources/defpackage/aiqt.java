package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class aiqt {
    private aiqt() {
    }

    public static int a(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            default:
                return 0;
        }
    }

    public final aiqu create(afib afibVar) {
        afibVar.getClass();
        aiqc aiqcVar = afibVar instanceof aiqc ? (aiqc) afibVar : null;
        boolean z = aiqcVar != null && aiqcVar.isRawType();
        if (z) {
            afibVar = aiqw.eraseToUpperBoundsAndMakeItRawRecursively$default(afibVar, null, 1, null);
        }
        aird airdVar = aird.INSTANCE;
        afibVar.getClass();
        aimd aimdVarTypeConstructor = airdVar.typeConstructor((ailx) afibVar);
        int iParametersCount = airdVar.parametersCount(aimdVarTypeConstructor);
        ArrayList arrayList = new ArrayList(iParametersCount);
        for (int i = 0; i < iParametersCount; i++) {
            arrayList.add(airdVar.getParameter(aimdVarTypeConstructor, i));
        }
        if (arrayList.size() == afibVar.getArguments().size()) {
            return arrayList.isEmpty() ? getEMPTY().copy(z) : new aiqu(woy.bc(woy.ci(arrayList, afibVar.getArguments())), z);
        }
        throw new IllegalStateException("Params vs args count mismatch (" + arrayList.size() + " != " + afibVar.getArguments().size() + ") for type '" + afibVar + '\'');
    }

    public final aiqu getEMPTY() {
        return aiqu.EMPTY;
    }

    public /* synthetic */ aiqt(afeu afeuVar) {
        this();
    }

    public final aiqu create(afhe<?> afheVar, List<afid> list, boolean z, boolean z2) {
        afheVar.getClass();
        list.getClass();
        List<afic> listAllTypeParameters = aiqj.allTypeParameters(afheVar);
        if (z) {
            listAllTypeParameters = woy.bR(listAllTypeParameters, 1);
        }
        if (listAllTypeParameters.size() == list.size()) {
            if (listAllTypeParameters.isEmpty()) {
                return getEMPTY().copy(z2);
            }
            return new aiqu(woy.bc(woy.ci(listAllTypeParameters, list)), z2);
        }
        throw new IllegalStateException("Params vs args count mismatch (" + listAllTypeParameters.size() + " != " + list.size() + ") for class '" + afheVar + "' with args: " + woy.cu(list, null, null, null, null, 63));
    }
}
