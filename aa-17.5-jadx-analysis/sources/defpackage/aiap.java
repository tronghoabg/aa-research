package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aiap {
    public static final <T extends ailx> agej<T> loadValueClassRepresentation(ahhc ahhcVar, boolean z, ahld ahldVar, ahlh ahlhVar, afec<? super ahjn, ? extends T> afecVar, afec<? super ahnj, ? extends T> afecVar2) {
        T tInvoke;
        ahhcVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        afecVar.getClass();
        afecVar2.getClass();
        if (ahhcVar.hasInlineClassUnderlyingPropertyName()) {
            ahnj name = ahzz.getName(ahldVar, ahhcVar.getInlineClassUnderlyingPropertyName());
            ahjn ahjnVarInlineClassUnderlyingType = ahlg.inlineClassUnderlyingType(ahhcVar, ahlhVar);
            if ((ahjnVarInlineClassUnderlyingType != null && (tInvoke = afecVar.invoke(ahjnVarInlineClassUnderlyingType)) != null) || (tInvoke = afecVar2.invoke(name)) != null) {
                return new agck(name, tInvoke);
            }
            throw new IllegalStateException("cannot determine underlying type for value class " + ahzz.getName(ahldVar, ahhcVar.getFqName()) + " with property " + name);
        }
        if (z && ahla.IS_VALUE_CLASS.get(ahhcVar.getFlags()).booleanValue()) {
            List<ahhi> constructorList = ahhcVar.getConstructorList();
            constructorList.getClass();
            Iterator<T> it = constructorList.iterator();
            boolean z2 = false;
            Object obj = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (!ahla.IS_SECONDARY.get(((ahhi) next).getFlags()).booleanValue()) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        obj = next;
                    }
                } else if (!z2) {
                    break;
                }
            }
            obj = null;
            ahhi ahhiVar = (ahhi) obj;
            if (ahhiVar != null) {
                List<ahkb> valueParameterList = ahhiVar.getValueParameterList();
                valueParameterList.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(valueParameterList, 10));
                for (ahkb ahkbVar : valueParameterList) {
                    ahnj name2 = ahzz.getName(ahldVar, ahkbVar.getName());
                    ahkbVar.getClass();
                    arrayList.add(new aezu(name2, afecVar.invoke(ahlg.type(ahkbVar, ahlhVar))));
                }
                return new agcv(arrayList);
            }
        }
        return null;
    }
}
