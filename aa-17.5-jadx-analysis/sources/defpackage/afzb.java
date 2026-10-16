package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afzb extends agio {
    public static final afza Factory = new afza(null);

    private afzb(agbi agbiVar, afzb afzbVar, agaw agawVar, boolean z) {
        super(agbiVar, afzbVar, agfk.Companion.getEMPTY(), aiof.INVOKE, agawVar, agdx.NO_SOURCE);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(false);
    }

    private final agcj replaceParameterNames(List<ahnj> list) {
        ahnj ahnjVar;
        int size = getValueParameters().size() - list.size();
        boolean z = true;
        if (size != 0 && size == 1) {
            size = 1;
        }
        if (size == 0) {
            List<agel> valueParameters = getValueParameters();
            valueParameters.getClass();
            List<aezu> listCi = woy.ci(list, valueParameters);
            if (!listCi.isEmpty()) {
                for (aezu aezuVar : listCi) {
                    if (!affa.f((ahnj) aezuVar.a, ((agel) aezuVar.b).getName())) {
                        size = 0;
                    }
                }
            }
            return this;
        }
        List<agel> valueParameters2 = getValueParameters();
        valueParameters2.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(valueParameters2, 10));
        for (agel agelVar : valueParameters2) {
            ahnj name = agelVar.getName();
            name.getClass();
            int index = agelVar.getIndex();
            int i = index - size;
            if (i >= 0 && (ahnjVar = list.get(i)) != null) {
                name = ahnjVar;
            }
            arrayList.add(agelVar.copy(this, name, index));
        }
        aghl aghlVarNewCopyBuilder = newCopyBuilder(aiiy.EMPTY);
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ahnj) it.next()) == null) {
                    break;
                }
            }
            z = false;
        }
        aghlVarNewCopyBuilder.setHasSynthesizedParameterNames(z);
        aghlVarNewCopyBuilder.setValueParameters((List<agel>) arrayList);
        aghlVarNewCopyBuilder.setOriginal((agax) getOriginal());
        agcj agcjVarDoSubstitute = super.doSubstitute(aghlVarNewCopyBuilder);
        agcjVarDoSubstitute.getClass();
        return agcjVarDoSubstitute;
    }

    @Override // defpackage.agio, defpackage.aghm
    protected aghm createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar) {
        agbiVar.getClass();
        agawVar.getClass();
        agfkVar.getClass();
        agdxVar.getClass();
        return new afzb(agbiVar, (afzb) agcjVar, agawVar, isSuspend());
    }

    @Override // defpackage.aghm
    protected agcj doSubstitute(aghl aghlVar) {
        aghlVar.getClass();
        afzb afzbVar = (afzb) super.doSubstitute(aghlVar);
        if (afzbVar == null) {
            return null;
        }
        List<agel> valueParameters = afzbVar.getValueParameters();
        valueParameters.getClass();
        if (valueParameters.isEmpty()) {
            return afzbVar;
        }
        Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            aigl type = ((agel) it.next()).getType();
            type.getClass();
            if (afxy.extractParameterNameFromFunctionTypeArgument(type) != null) {
                List<agel> valueParameters2 = afzbVar.getValueParameters();
                valueParameters2.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(valueParameters2, 10));
                Iterator<T> it2 = valueParameters2.iterator();
                while (it2.hasNext()) {
                    aigl type2 = ((agel) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(afxy.extractParameterNameFromFunctionTypeArgument(type2));
                }
                return afzbVar.replaceParameterNames(arrayList);
            }
        }
        return afzbVar;
    }

    @Override // defpackage.aghm, defpackage.agco
    public boolean isExternal() {
        return false;
    }

    @Override // defpackage.aghm, defpackage.agcj
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.aghm, defpackage.agcj
    public boolean isTailrec() {
        return false;
    }

    public /* synthetic */ afzb(agbi agbiVar, afzb afzbVar, agaw agawVar, boolean z, afeu afeuVar) {
        this(agbiVar, afzbVar, agawVar, z);
    }
}
