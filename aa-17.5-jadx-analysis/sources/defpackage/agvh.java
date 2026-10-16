package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class agvh {
    public static final List<agel> copyValueParameters(Collection<? extends aigl> collection, Collection<? extends agel> collection2, agav agavVar) {
        collection.getClass();
        collection2.getClass();
        agavVar.getClass();
        collection.size();
        collection2.size();
        List<aezu> listCi = woy.ci(collection, collection2);
        ArrayList arrayList = new ArrayList(woy.bp(listCi, 10));
        for (aezu aezuVar : listCi) {
            aigl aiglVar = (aigl) aezuVar.a;
            agel agelVar = (agel) aezuVar.b;
            int index = agelVar.getIndex();
            agfk annotations = agelVar.getAnnotations();
            ahnj name = agelVar.getName();
            name.getClass();
            boolean zDeclaresDefaultValue = agelVar.declaresDefaultValue();
            boolean zIsCrossinline = agelVar.isCrossinline();
            boolean zIsNoinline = agelVar.isNoinline();
            aigl arrayElementType = agelVar.getVarargElementType() != null ? ahvz.getModule(agavVar).getBuiltIns().getArrayElementType(aiglVar) : null;
            agdx source = agelVar.getSource();
            source.getClass();
            arrayList.add(new agiy(agavVar, null, index, annotations, name, aiglVar, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, arrayElementType, source));
        }
        return arrayList;
    }

    public static final agyo getParentJavaStaticClassScope(agba agbaVar) {
        agbaVar.getClass();
        agba superClassNotAny = ahvz.getSuperClassNotAny(agbaVar);
        if (superClassNotAny == null) {
            return null;
        }
        ahxe staticScope = superClassNotAny.getStaticScope();
        agyo agyoVar = staticScope instanceof agyo ? (agyo) staticScope : null;
        return agyoVar == null ? getParentJavaStaticClassScope(superClassNotAny) : agyoVar;
    }
}
