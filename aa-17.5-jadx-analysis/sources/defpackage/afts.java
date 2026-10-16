package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afts {
    public static final afwf<?> computeCallerForAccessor(aftd<?, ?> aftdVar, boolean z) {
        afwf afwzVar;
        aftdVar.getClass();
        aftr<?> property = aftdVar.getProperty();
        if (afuo.isLocalDelegated(property)) {
            return afxj.INSTANCE;
        }
        agoj kmProperty = property.getKmProperty();
        agqp getterSignature = z ? agqk.getGetterSignature(kmProperty) : agqk.getSetterSignature(kmProperty);
        Method methodFindMethodBySignature = getterSignature != null ? property.getContainer().findMethodBySignature(getterSignature.getName(), getterSignature.getDescriptor()) : null;
        if (methodFindMethodBySignature == null) {
            if (afxm.isUnderlyingPropertyOfValueClass(property) && property.getVisibility() == afif.c) {
                Class<?> inlineClass = afxm.toInlineClass(((afhr) woy.bN(property.getParameters())).getType());
                if (inlineClass == null) {
                    throw new aftw(a.bm(property, "Underlying property of inline class ", " should have a field"));
                }
                Method inlineClassUnboxMethod = afxm.getInlineClassUnboxMethod(inlineClass, property);
                afwzVar = afuh.isBound(aftdVar) ? new afxg(inlineClassUnboxMethod, getBoundReceiver(aftdVar)) : new afxh(inlineClassUnboxMethod);
            } else {
                Field javaField = property.getJavaField();
                if (javaField == null) {
                    Objects.toString(property);
                    throw new aftw("No accessors or field is found for property ".concat(String.valueOf(property)));
                }
                afwzVar = computeCallerForAccessor$computeFieldCaller(property, z, aftdVar, javaField);
            }
        } else if (Modifier.isStatic(methodFindMethodBySignature.getModifiers())) {
            computeCallerForAccessor$isJvmStaticProperty(aftdVar);
            afwzVar = afuh.isBound(aftdVar) ? new afwz(methodFindMethodBySignature, false, getBoundReceiver(aftdVar)) : new afxc(methodFindMethodBySignature);
        } else {
            afwzVar = afuh.isBound(aftdVar) ? new afwx(methodFindMethodBySignature, getBoundReceiver(aftdVar)) : new afxa(methodFindMethodBySignature);
        }
        return afxm.createValueClassAwareCallerIfNeeded(afwzVar, aftdVar, false, afbe.a);
    }

    private static final afxe<Field> computeCallerForAccessor$computeFieldCaller(aftr<? extends Object> aftrVar, boolean z, aftd<?, ?> aftdVar, Field field) {
        if (isJvmFieldPropertyInCompanionObject(aftrVar) || !Modifier.isStatic(field.getModifiers())) {
            return z ? afuh.isBound(aftdVar) ? new afwl(field, getBoundReceiver(aftdVar)) : new afwn(field) : afuh.isBound(aftdVar) ? new afwr(field, computeCallerForAccessor$isNotNullProperty(aftrVar), getBoundReceiver(aftdVar)) : new afwt(field, computeCallerForAccessor$isNotNullProperty(aftrVar));
        }
        computeCallerForAccessor$isJvmStaticProperty(aftdVar);
        return z ? new afwp(field) : new afwv(field, computeCallerForAccessor$isNotNullProperty(aftrVar));
    }

    private static final boolean computeCallerForAccessor$isJvmStaticProperty(aftd<?, ?> aftdVar) {
        if (aftdVar.getContainer() instanceof afrt) {
            return false;
        }
        throw new IllegalArgumentException("Only top-level properties are supported for now: " + aftdVar.getContainer() + '/' + aftdVar.getName());
    }

    private static final boolean computeCallerForAccessor$isNotNullProperty(aftr<? extends Object> aftrVar) {
        return !afvu.isNullableType(aftrVar.getReturnType());
    }

    public static final Object getBoundReceiver(aftd<?, ?> aftdVar) {
        aftdVar.getClass();
        return afuh.getBoundReceiver(aftdVar.getProperty());
    }

    private static final boolean isJvmFieldPropertyInCompanionObject(aftr<?> aftrVar) {
        afhg container = aftrVar.getContainer();
        if (!(container instanceof afqw) || ((afqw) container).getClassKind$kotlin_reflection() != agmp.COMPANION_OBJECT) {
            return false;
        }
        Class<?> enclosingClass = affa.h((afhe) container).getEnclosingClass();
        enclosingClass.getClass();
        afhe afheVarL = affa.l(enclosingClass);
        afqw afqwVar = afheVarL instanceof afqw ? (afqw) afheVarL : null;
        if (afqwVar == null) {
            return false;
        }
        if (afqwVar.getClassKind$kotlin_reflection() == agmp.INTERFACE || afqwVar.getClassKind$kotlin_reflection() == agmp.ANNOTATION_CLASS) {
            return agqj.isMovedFromInterfaceCompanion(aftrVar.getKmProperty());
        }
        return true;
    }
}
