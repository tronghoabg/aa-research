package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* loaded from: classes3.dex */
public final class afmj {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.afwf<?> computeCallerForAccessor(defpackage.afln<?, ?> r6, boolean r7) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmj.computeCallerForAccessor(afln, boolean):afwf");
    }

    private static final afxe<Field> computeCallerForAccessor$computeFieldCaller(afln<?, ?> aflnVar, boolean z, Field field) {
        return (isJvmFieldPropertyInCompanionObject(aflnVar.getProperty().getDescriptor()) || !Modifier.isStatic(field.getModifiers())) ? z ? afuh.isBound(aflnVar) ? new afwl(field, getBoundReceiver(aflnVar)) : new afwn(field) : afuh.isBound(aflnVar) ? new afwr(field, computeCallerForAccessor$isNotNullProperty(aflnVar), getBoundReceiver(aflnVar)) : new afwt(field, computeCallerForAccessor$isNotNullProperty(aflnVar)) : computeCallerForAccessor$isJvmStaticProperty(aflnVar) ? z ? afuh.isBound(aflnVar) ? new afwm(field) : new afwo(field) : afuh.isBound(aflnVar) ? new afws(field, computeCallerForAccessor$isNotNullProperty(aflnVar)) : new afwu(field, computeCallerForAccessor$isNotNullProperty(aflnVar)) : z ? new afwp(field) : new afwv(field, computeCallerForAccessor$isNotNullProperty(aflnVar));
    }

    private static final boolean computeCallerForAccessor$isJvmStaticProperty(afln<?, ?> aflnVar) {
        return aflnVar.getProperty().getDescriptor().getAnnotations().hasAnnotation(afvu.getJVM_STATIC());
    }

    private static final boolean computeCallerForAccessor$isNotNullProperty(afln<?, ?> aflnVar) {
        return !aijc.isNullableType(aflnVar.getProperty().getDescriptor().getType());
    }

    public static final Object getBoundReceiver(afln<?, ?> aflnVar) {
        aflnVar.getClass();
        return afuh.getBoundReceiver(aflnVar.getProperty());
    }

    private static final boolean isJvmFieldPropertyInCompanionObject(agdn agdnVar) {
        agbi containingDeclaration = agdnVar.getContainingDeclaration();
        containingDeclaration.getClass();
        if (!ahst.isCompanionObject(containingDeclaration)) {
            return false;
        }
        agbi containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        if (ahst.isInterface(containingDeclaration2) || ahst.isAnnotationClass(containingDeclaration2)) {
            return (agdnVar instanceof aicu) && ahmt.isMovedFromInterfaceCompanion(((aicu) agdnVar).getProto());
        }
        return true;
    }

    private static final Class<?> toInlineClass(agbi agbiVar) {
        if (!(agbiVar instanceof agba) || !ahsw.isInlineClass(agbiVar)) {
            return null;
        }
        agba agbaVar = (agba) agbiVar;
        Class<?> javaClass = afvu.toJavaClass(agbaVar);
        if (javaClass != null) {
            return javaClass;
        }
        throw new aftw("Class object for the class " + agbaVar.getName() + " cannot be found (classId=" + ahvz.getClassId((agbd) agbiVar) + ')');
    }
}
