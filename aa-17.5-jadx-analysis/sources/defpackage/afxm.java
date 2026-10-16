package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afxm {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean acceptsBoxedReceiverParameter(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        return (declaringClass == null || affa.l(declaringClass).isValue()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkParametersSize(afwf<?> afwfVar, int i, afue<?> afueVar, boolean z) {
        if (afxf.getArity(afwfVar) == i) {
            return;
        }
        throw new aftw("Inconsistent number of parameters in the descriptor and Java reflection object: " + afxf.getArity(afwfVar) + " != " + i + "\nCalling: " + afueVar + "\nParameter types: " + afwfVar.getParameterTypes() + ")\nDefault: " + z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <M extends java.lang.reflect.Member> defpackage.afwf<M> createValueClassAwareCallerIfNeeded(defpackage.afwf<? extends M> r2, defpackage.afue r3, boolean r4, java.util.List<java.lang.Integer> r5) {
        /*
            r2.getClass()
            r3.getClass()
            r5.getClass()
            java.util.List r0 = r3.getParameters()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L18
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L18
            goto L33
        L18:
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            afhr r1 = (defpackage.afhr) r1
            afib r1 = r1.getType()
            boolean r1 = defpackage.afvu.isInlineClassType(r1)
            if (r1 == 0) goto L1c
            goto L3d
        L33:
            afib r0 = r3.getReturnType()
            boolean r0 = defpackage.afvu.isInlineClassType(r0)
            if (r0 == 0) goto L43
        L3d:
            afxl r0 = new afxl
            r0.<init>(r3, r2, r4, r5)
            return r0
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxm.createValueClassAwareCallerIfNeeded(afwf, afue, boolean, java.util.List):afwf");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getBoxMethod(Class<?> cls, afue<?> afueVar) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", getInlineClassUnboxMethod(cls, afueVar).getReturnType());
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new aftw(a.cj((byte) 41, afueVar, cls, "No box method found in inline class: ", " (calling "));
        }
    }

    public static final Method getInlineClassUnboxMethod(Class<?> cls, afue<?> afueVar) {
        cls.getClass();
        afueVar.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new aftw(a.cj((byte) 41, afueVar, cls, "No unbox method found in inline class: ", " (calling "));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isGetterOfUnderlyingPropertyOfValueClass(afue<?> afueVar) {
        if (!(afueVar instanceof afht)) {
            return false;
        }
        afia property = ((afht) afueVar).getProperty();
        property.getClass();
        return isUnderlyingPropertyOfValueClass((afun) property);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isPrimitiveType(afib afibVar) {
        if (afibVar.isMarkedNullable()) {
            return false;
        }
        afhf classifier = afibVar.getClassifier();
        afhe afheVar = classifier instanceof afhe ? (afhe) classifier : null;
        Class clsJ = afheVar != null ? affa.j(afheVar) : null;
        return (clsJ == null || affa.f(clsJ, Void.TYPE)) ? false : true;
    }

    public static final boolean isUnderlyingPropertyOfValueClass(afun<?> afunVar) {
        afunVar.getClass();
        List<afhr> allParameters = afunVar.getAllParameters();
        if (!(allParameters instanceof Collection) || !allParameters.isEmpty()) {
            Iterator<T> it = allParameters.iterator();
            while (it.hasNext()) {
                if (((afhr) it.next()).getKind() != afhq.a) {
                    return false;
                }
            }
        }
        String name = afunVar.getName();
        afrj container = afunVar.getContainer();
        afqw afqwVar = container instanceof afqw ? (afqw) container : null;
        return affa.f(name, afqwVar != null ? afqwVar.getInlineClassUnderlyingPropertyName$kotlin_reflection() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<afib> makeKotlinParameterTypes(afue<?> afueVar, Member member) {
        ArrayList arrayList = new ArrayList();
        afhg container = afueVar.getContainer();
        if (!afuh.isConstructor(afueVar) && (container instanceof afhe)) {
            afhe afheVar = (afhe) container;
            if (afheVar.isValue()) {
                arrayList.add(afir.b(afheVar));
            }
        }
        boolean z = false;
        if (afuh.isConstructor(afueVar)) {
            afhe afheVar2 = container instanceof afhe ? (afhe) container : null;
            if (afheVar2 != null && afheVar2.isInner()) {
                z = true;
            }
        }
        for (afhr afhrVar : afueVar.getAllParameters()) {
            if (afhrVar.getKind() != afhq.a || z) {
                arrayList.add(afhrVar.getType());
            }
        }
        return arrayList;
    }

    public static final Class<?> toInlineClass(afib afibVar) {
        afhf classifier = afibVar != null ? afibVar.getClassifier() : null;
        afhe afheVar = classifier instanceof afhe ? (afhe) classifier : null;
        if (afheVar != null && afheVar.isValue()) {
            if (!afvu.isNullableType(afibVar)) {
                return affa.h(afheVar);
            }
            afib afibVarUnsubstitutedUnderlyingType = afvu.unsubstitutedUnderlyingType(afibVar);
            if (afibVarUnsubstitutedUnderlyingType != null && !afvu.isNullableType(afibVarUnsubstitutedUnderlyingType) && !isPrimitiveType(afibVarUnsubstitutedUnderlyingType)) {
                return affa.h(afheVar);
            }
        }
        return null;
    }
}
