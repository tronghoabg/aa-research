package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agrw extends agru {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agrw(agtd agtdVar) {
        super(agtdVar);
        agtdVar.getClass();
    }

    private final List<String> toEnumNames(ahuh<?> ahuhVar) {
        if (!(ahuhVar instanceof ahuc)) {
            return ahuhVar instanceof ahul ? woy.bg(((ahul) ahuhVar).getEnumEntryName().getIdentifier()) : afbe.a;
        }
        List<? extends ahuh<?>> value = ((ahuc) ahuhVar).getValue();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, toEnumNames((ahuh) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agru
    public Iterable<String> enumArguments(agfc agfcVar, boolean z) {
        agfcVar.getClass();
        Map<ahnj, ahuh<?>> allValueArguments = agfcVar.getAllValueArguments();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ahnj, ahuh<?>> entry : allValueArguments.entrySet()) {
            woy.cq(arrayList, (!z || affa.f(entry.getKey(), agti.DEFAULT_ANNOTATION_MEMBER_NAME)) ? toEnumNames(entry.getValue()) : afbe.a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agru
    public ahnf getFqName(agfc agfcVar) {
        agfcVar.getClass();
        return agfcVar.getFqName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agru
    public Object getKey(agfc agfcVar) {
        agfcVar.getClass();
        agba annotationClass = ahvz.getAnnotationClass(agfcVar);
        annotationClass.getClass();
        return annotationClass;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agru
    public Iterable<agfc> getMetaAnnotations(agfc agfcVar) {
        agfk annotations;
        agfcVar.getClass();
        agba annotationClass = ahvz.getAnnotationClass(agfcVar);
        return (annotationClass == null || (annotations = annotationClass.getAnnotations()) == null) ? afbe.a : annotations;
    }

    @Override // defpackage.agru
    public boolean isK2() {
        return false;
    }
}
