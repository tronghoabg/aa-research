package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class afuj {
    public static final Type extractContinuationArgument(afui afuiVar) {
        Type[] lowerBounds;
        afuiVar.getClass();
        if (afuiVar.isSuspend()) {
            Object objBL = woy.bL(afuiVar.getCaller().getParameterTypes());
            ParameterizedType parameterizedType = objBL instanceof ParameterizedType ? (ParameterizedType) objBL : null;
            if (affa.f(parameterizedType != null ? parameterizedType.getRawType() : null, afck.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objCY = woy.cY(actualTypeArguments);
                WildcardType wildcardType = objCY instanceof WildcardType ? (WildcardType) objCY : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) woy.cU(lowerBounds);
                }
            }
        }
        return null;
    }

    public static final afmn patchJvmDescriptorByExtraBoxing(afui afuiVar, String str) {
        afuiVar.getClass();
        str.getClass();
        afna jvmDescriptor = afvu.parseJvmDescriptor(str);
        boolean zF = affa.f(woy.bL(jvmDescriptor.getParameters()), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = afir.d(afuiVar).size() + (zF ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(woy.cd(jvmDescriptor.getParameters(), jvmDescriptor.getParameters().size() - size));
        for (aezu aezuVar : woy.ci(afir.d(afuiVar), woy.ce(jvmDescriptor.getParameters(), size))) {
            afhr afhrVar = (afhr) aezuVar.a;
            String str2 = (String) aezuVar.b;
            if (afvu.isAlwaysBoxedByCompiler(afhrVar)) {
                linkedHashSet.add(Integer.valueOf(arrayList.size()));
                afhf classifier = afhrVar.getType().getClassifier();
                classifier.getClass();
                arrayList.add(afvu.toJvmDescriptor((afhe) classifier));
            } else {
                arrayList.add(str2);
            }
        }
        if (zF) {
            arrayList.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        return linkedHashSet.isEmpty() ? new afmn(str, afbg.a) : new afmn(woy.cu(arrayList, "", "(", ")", null, 56).concat(String.valueOf(jvmDescriptor.getReturnType())), linkedHashSet);
    }
}
