package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aguj {
    public static final aguj INSTANCE = new aguj();
    private static final Map<String, EnumSet<agfv>> targetNameLists = woy.ba(new aezu("PACKAGE", EnumSet.noneOf(agfv.class)), new aezu("TYPE", EnumSet.of(agfv.CLASS, agfv.FILE)), new aezu("ANNOTATION_TYPE", EnumSet.of(agfv.ANNOTATION_CLASS)), new aezu("TYPE_PARAMETER", EnumSet.of(agfv.TYPE_PARAMETER)), new aezu("FIELD", EnumSet.of(agfv.FIELD)), new aezu("LOCAL_VARIABLE", EnumSet.of(agfv.LOCAL_VARIABLE)), new aezu("PARAMETER", EnumSet.of(agfv.VALUE_PARAMETER)), new aezu("CONSTRUCTOR", EnumSet.of(agfv.CONSTRUCTOR)), new aezu("METHOD", EnumSet.of(agfv.FUNCTION, agfv.PROPERTY_GETTER, agfv.PROPERTY_SETTER)), new aezu("TYPE_USE", EnumSet.of(agfv.TYPE)));
    private static final Map<String, agft> retentionNameList = woy.ba(new aezu("RUNTIME", agft.RUNTIME), new aezu("CLASS", agft.BINARY), new aezu("SOURCE", agft.SOURCE));

    private aguj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl mapJavaTargetArguments$lambda$2(agcu agcuVar) {
        aigl type;
        agcuVar.getClass();
        agel annotationParameterByName = ague.getAnnotationParameterByName(aguh.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$org_jetbrains_kotlin_descriptors_jvm(), agcuVar.getBuiltIns().getBuiltInClassByFqName(afyn.target));
        return (annotationParameterByName == null || (type = annotationParameterByName.getType()) == null) ? ailm.createErrorType(aill.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }

    public final ahuh<?> mapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm(agzg agzgVar) {
        agft agftVar;
        agky agkyVar = agzgVar instanceof agky ? (agky) agzgVar : null;
        if (agkyVar == null || (agftVar = retentionNameList.get(agkyVar.getEntryName().asString())) == null) {
            return null;
        }
        return new ahul(ahnd.Companion.topLevel(afyn.annotationRetention), ahnj.identifier(agftVar.name()));
    }

    public final Set<agfv> mapJavaTargetArgumentByName(String str) {
        EnumSet<agfv> enumSet = targetNameLists.get(str);
        return enumSet != null ? enumSet : afbg.a;
    }

    public final ahuh<?> mapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm(List<? extends agzg> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof agky) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList2, INSTANCE.mapJavaTargetArgumentByName(((agky) it.next()).getEntryName().asString()));
        }
        ArrayList arrayList3 = new ArrayList(woy.bp(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new ahul(ahnd.Companion.topLevel(afyn.annotationTarget), ahnj.identifier(((agfv) it2.next()).name())));
        }
        return new ahuc(arrayList3, agui.INSTANCE);
    }
}
