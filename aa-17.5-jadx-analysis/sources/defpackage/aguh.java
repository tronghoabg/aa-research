package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class aguh {
    public static final aguh INSTANCE = new aguh();
    private static final ahnj DEPRECATED_ANNOTATION_MESSAGE = ahnj.identifier("message");
    private static final ahnj TARGET_ANNOTATION_ALLOWED_TARGETS = ahnj.identifier("allowedTargets");
    private static final ahnj RETENTION_ANNOTATION_VALUE = ahnj.identifier("value");
    private static final Map<ahnf, ahnf> kotlinToJavaNameMap = woy.ba(new aezu(afyn.target, agti.TARGET_ANNOTATION), new aezu(afyn.retention, agti.RETENTION_ANNOTATION), new aezu(afyn.mustBeDocumented, agti.DOCUMENTED_ANNOTATION));

    private aguh() {
    }

    public static /* synthetic */ agfc mapOrResolveJavaAnnotation$default(aguh aguhVar, agzf agzfVar, agvu agvuVar, boolean z, int i, Object obj) {
        return aguhVar.mapOrResolveJavaAnnotation(agzfVar, agvuVar, z & ((i & 4) == 0));
    }

    public final agfc findMappedJavaAnnotation(ahnf ahnfVar, agzh agzhVar, agvu agvuVar) {
        agzf agzfVarFindAnnotation;
        ahnfVar.getClass();
        agzhVar.getClass();
        agvuVar.getClass();
        if (affa.f(ahnfVar, afyn.deprecated)) {
            ahnf ahnfVar2 = agti.DEPRECATED_ANNOTATION;
            ahnfVar2.getClass();
            agzf agzfVarFindAnnotation2 = agzhVar.findAnnotation(ahnfVar2);
            if (agzfVarFindAnnotation2 != null || agzhVar.isDeprecatedInJavaDoc()) {
                return new agul(agzfVarFindAnnotation2, agvuVar);
            }
        }
        ahnf ahnfVar3 = kotlinToJavaNameMap.get(ahnfVar);
        if (ahnfVar3 == null || (agzfVarFindAnnotation = agzhVar.findAnnotation(ahnfVar3)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(INSTANCE, agzfVarFindAnnotation, agvuVar, false, 4, null);
    }

    public final ahnj getDEPRECATED_ANNOTATION_MESSAGE$org_jetbrains_kotlin_descriptors_jvm() {
        return DEPRECATED_ANNOTATION_MESSAGE;
    }

    public final ahnj getRETENTION_ANNOTATION_VALUE$org_jetbrains_kotlin_descriptors_jvm() {
        return RETENTION_ANNOTATION_VALUE;
    }

    public final ahnj getTARGET_ANNOTATION_ALLOWED_TARGETS$org_jetbrains_kotlin_descriptors_jvm() {
        return TARGET_ANNOTATION_ALLOWED_TARGETS;
    }

    public final agfc mapOrResolveJavaAnnotation(agzf agzfVar, agvu agvuVar, boolean z) {
        agzfVar.getClass();
        agvuVar.getClass();
        ahnd classId = agzfVar.getClassId();
        ahnc ahncVar = ahnd.Companion;
        ahnf ahnfVar = agti.TARGET_ANNOTATION;
        ahnfVar.getClass();
        if (affa.f(classId, ahncVar.topLevel(ahnfVar))) {
            return new agut(agzfVar, agvuVar);
        }
        ahnc ahncVar2 = ahnd.Companion;
        ahnf ahnfVar2 = agti.RETENTION_ANNOTATION;
        ahnfVar2.getClass();
        if (affa.f(classId, ahncVar2.topLevel(ahnfVar2))) {
            return new agur(agzfVar, agvuVar);
        }
        ahnc ahncVar3 = ahnd.Companion;
        ahnf ahnfVar3 = agti.DOCUMENTED_ANNOTATION;
        ahnfVar3.getClass();
        if (affa.f(classId, ahncVar3.topLevel(ahnfVar3))) {
            return new agug(agvuVar, agzfVar, afyn.mustBeDocumented);
        }
        ahnc ahncVar4 = ahnd.Companion;
        ahnf ahnfVar4 = agti.DEPRECATED_ANNOTATION;
        ahnfVar4.getClass();
        if (affa.f(classId, ahncVar4.topLevel(ahnfVar4))) {
            return null;
        }
        return new agwl(agvuVar, agzfVar, z);
    }
}
