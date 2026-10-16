package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class ahye<A> implements ahyl<A> {
    private final ahyd protocol;

    public ahye(ahyd ahydVar) {
        ahydVar.getClass();
        this.protocol = ahydVar;
    }

    private final List<A> loadAnnotations(List<ahgx> list, List<ahgx> list2, ahld ahldVar) {
        if (list.isEmpty()) {
            list = list2 == null ? afbe.a : list2;
        }
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ahgx) it.next(), ahldVar));
        }
        return arrayList;
    }

    protected final ahyd getProtocol() {
        return this.protocol;
    }

    @Override // defpackage.ahyl
    public List<A> loadCallableAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar) {
        aiadVar.getClass();
        ahpgVar.getClass();
        ahyhVar.getClass();
        if (ahpgVar instanceof ahhi) {
            ahhi ahhiVar = (ahhi) ahpgVar;
            List<ahgx> annotationList = ahhiVar.getAnnotationList();
            annotationList.getClass();
            return loadAnnotations(annotationList, (List) ahhiVar.getExtension(this.protocol.getConstructorAnnotation()), aiadVar.getNameResolver());
        }
        if (ahpgVar instanceof ahif) {
            ahif ahifVar = (ahif) ahpgVar;
            List<ahgx> annotationList2 = ahifVar.getAnnotationList();
            annotationList2.getClass();
            return loadAnnotations(annotationList2, (List) ahifVar.getExtension(this.protocol.getFunctionAnnotation()), aiadVar.getNameResolver());
        }
        if (!(ahpgVar instanceof ahis)) {
            Objects.toString(ahpgVar);
            throw new IllegalStateException("Unknown message: ".concat(ahpgVar.toString()));
        }
        int iOrdinal = ahyhVar.ordinal();
        if (iOrdinal == 1) {
            ahis ahisVar = (ahis) ahpgVar;
            List<ahgx> annotationList3 = ahisVar.getAnnotationList();
            annotationList3.getClass();
            return loadAnnotations(annotationList3, (List) ahisVar.getExtension(this.protocol.getPropertyAnnotation()), aiadVar.getNameResolver());
        }
        if (iOrdinal == 2) {
            ahis ahisVar2 = (ahis) ahpgVar;
            List<ahgx> getterAnnotationList = ahisVar2.getGetterAnnotationList();
            getterAnnotationList.getClass();
            return loadAnnotations(getterAnnotationList, (List) ahisVar2.getExtension(this.protocol.getPropertyGetterAnnotation()), aiadVar.getNameResolver());
        }
        if (iOrdinal != 3) {
            throw new IllegalStateException("Unsupported callable kind with property proto");
        }
        ahis ahisVar3 = (ahis) ahpgVar;
        List<ahgx> setterAnnotationList = ahisVar3.getSetterAnnotationList();
        setterAnnotationList.getClass();
        return loadAnnotations(setterAnnotationList, (List) ahisVar3.getExtension(this.protocol.getPropertySetterAnnotation()), aiadVar.getNameResolver());
    }

    @Override // defpackage.ahyl
    public List<A> loadClassAnnotations(aiab aiabVar) {
        aiabVar.getClass();
        List<ahgx> annotationList = aiabVar.getClassProto().getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) aiabVar.getClassProto().getExtension(this.protocol.getClassAnnotation()), aiabVar.getNameResolver());
    }

    @Override // defpackage.ahyl
    public List<A> loadContextParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i, ahkb ahkbVar) {
        aiadVar.getClass();
        ahpgVar.getClass();
        ahyhVar.getClass();
        List<A> listLoadValueParameterAnnotations = ahkbVar != null ? loadValueParameterAnnotations(aiadVar, ahpgVar, ahyhVar, i, ahkbVar) : null;
        return listLoadValueParameterAnnotations == null ? afbe.a : listLoadValueParameterAnnotations;
    }

    @Override // defpackage.ahyl
    public List<A> loadEnumEntryAnnotations(aiad aiadVar, ahhx ahhxVar) {
        aiadVar.getClass();
        ahhxVar.getClass();
        List<ahgx> annotationList = ahhxVar.getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) ahhxVar.getExtension(this.protocol.getEnumEntryAnnotation()), aiadVar.getNameResolver());
    }

    @Override // defpackage.ahyl
    public List<A> loadExtensionReceiverParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar) {
        aiadVar.getClass();
        ahpgVar.getClass();
        ahyhVar.getClass();
        if (ahpgVar instanceof ahif) {
            ahif ahifVar = (ahif) ahpgVar;
            List<ahgx> extensionReceiverAnnotationList = ahifVar.getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            ahop<ahif, List<ahgx>> functionExtensionReceiverAnnotation = this.protocol.getFunctionExtensionReceiverAnnotation();
            return loadAnnotations(extensionReceiverAnnotationList, functionExtensionReceiverAnnotation != null ? (List) ahifVar.getExtension(functionExtensionReceiverAnnotation) : null, aiadVar.getNameResolver());
        }
        if (!(ahpgVar instanceof ahis)) {
            Objects.toString(ahpgVar);
            throw new IllegalStateException("Unknown message: ".concat(ahpgVar.toString()));
        }
        int iOrdinal = ahyhVar.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            Objects.toString(ahyhVar);
            throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(ahyhVar.toString()));
        }
        ahis ahisVar = (ahis) ahpgVar;
        List<ahgx> extensionReceiverAnnotationList2 = ahisVar.getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList2.getClass();
        ahop<ahis, List<ahgx>> propertyExtensionReceiverAnnotation = this.protocol.getPropertyExtensionReceiverAnnotation();
        return loadAnnotations(extensionReceiverAnnotationList2, propertyExtensionReceiverAnnotation != null ? (List) ahisVar.getExtension(propertyExtensionReceiverAnnotation) : null, aiadVar.getNameResolver());
    }

    @Override // defpackage.ahyl
    public List<A> loadPropertyBackingFieldAnnotations(aiad aiadVar, ahis ahisVar) {
        aiadVar.getClass();
        ahisVar.getClass();
        List<ahgx> backingFieldAnnotationList = ahisVar.getBackingFieldAnnotationList();
        backingFieldAnnotationList.getClass();
        ahop<ahis, List<ahgx>> propertyBackingFieldAnnotation = this.protocol.getPropertyBackingFieldAnnotation();
        return loadAnnotations(backingFieldAnnotationList, propertyBackingFieldAnnotation != null ? (List) ahisVar.getExtension(propertyBackingFieldAnnotation) : null, aiadVar.getNameResolver());
    }

    @Override // defpackage.ahyl
    public List<A> loadPropertyDelegateFieldAnnotations(aiad aiadVar, ahis ahisVar) {
        aiadVar.getClass();
        ahisVar.getClass();
        List<ahgx> delegateFieldAnnotationList = ahisVar.getDelegateFieldAnnotationList();
        delegateFieldAnnotationList.getClass();
        ahop<ahis, List<ahgx>> propertyDelegatedFieldAnnotation = this.protocol.getPropertyDelegatedFieldAnnotation();
        return loadAnnotations(delegateFieldAnnotationList, propertyDelegatedFieldAnnotation != null ? (List) ahisVar.getExtension(propertyDelegatedFieldAnnotation) : null, aiadVar.getNameResolver());
    }

    @Override // defpackage.ahyl
    public List<A> loadTypeAnnotations(ahjn ahjnVar, ahld ahldVar) {
        ahjnVar.getClass();
        ahldVar.getClass();
        List<ahgx> annotationList = ahjnVar.getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) ahjnVar.getExtension(this.protocol.getTypeAnnotation()), ahldVar);
    }

    @Override // defpackage.ahyl
    public List<A> loadTypeParameterAnnotations(ahjv ahjvVar, ahld ahldVar) {
        ahjvVar.getClass();
        ahldVar.getClass();
        List<ahgx> annotationList = ahjvVar.getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) ahjvVar.getExtension(this.protocol.getTypeParameterAnnotation()), ahldVar);
    }

    @Override // defpackage.ahyl
    public List<A> loadValueParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i, ahkb ahkbVar) {
        aiadVar.getClass();
        ahpgVar.getClass();
        ahyhVar.getClass();
        ahkbVar.getClass();
        List<ahgx> annotationList = ahkbVar.getAnnotationList();
        annotationList.getClass();
        return loadAnnotations(annotationList, (List) ahkbVar.getExtension(this.protocol.getParameterAnnotation()), aiadVar.getNameResolver());
    }
}
