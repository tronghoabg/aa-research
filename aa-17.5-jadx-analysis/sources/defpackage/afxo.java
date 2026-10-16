package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class afxo {
    public static final afxo INSTANCE = new afxo();
    private static final ahnd JAVA_LANG_ANNOTATION_REPEATABLE;
    private static final Set<ahnd> SPECIAL_ANNOTATIONS;

    static {
        List listBi = woy.bi(agti.METADATA_FQ_NAME, agti.JETBRAINS_NOT_NULL_ANNOTATION, agti.JETBRAINS_NULLABLE_ANNOTATION, agti.TARGET_ANNOTATION, agti.RETENTION_ANNOTATION, agti.DOCUMENTED_ANNOTATION);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ahnc ahncVar = ahnd.Companion;
        Iterator it = listBi.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ahncVar.topLevel((ahnf) it.next()));
        }
        SPECIAL_ANNOTATIONS = linkedHashSet;
        ahnc ahncVar2 = ahnd.Companion;
        ahnf ahnfVar = agti.REPEATABLE_ANNOTATION;
        ahnfVar.getClass();
        JAVA_LANG_ANNOTATION_REPEATABLE = ahncVar2.topLevel(ahnfVar);
    }

    private afxo() {
    }

    public final ahnd getJAVA_LANG_ANNOTATION_REPEATABLE() {
        return JAVA_LANG_ANNOTATION_REPEATABLE;
    }

    public final Set<ahnd> getSPECIAL_ANNOTATIONS() {
        return SPECIAL_ANNOTATIONS;
    }

    public final boolean isAnnotatedWithContainerMetaAnnotation(ahfj ahfjVar) {
        ahfjVar.getClass();
        affq affqVar = new affq();
        ahfjVar.loadClassAnnotations(new afxn(affqVar), null);
        return affqVar.a;
    }
}
