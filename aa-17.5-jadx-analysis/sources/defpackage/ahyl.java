package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public interface ahyl<A> {
    A loadAnnotation(ahgx ahgxVar, ahld ahldVar);

    List<A> loadCallableAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar);

    List<A> loadClassAnnotations(aiab aiabVar);

    List<A> loadContextParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i, ahkb ahkbVar);

    List<A> loadEnumEntryAnnotations(aiad aiadVar, ahhx ahhxVar);

    List<A> loadExtensionReceiverParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar);

    List<A> loadPropertyBackingFieldAnnotations(aiad aiadVar, ahis ahisVar);

    List<A> loadPropertyDelegateFieldAnnotations(aiad aiadVar, ahis ahisVar);

    List<A> loadTypeAnnotations(ahjn ahjnVar, ahld ahldVar);

    List<A> loadTypeParameterAnnotations(ahjv ahjvVar, ahld ahldVar);

    List<A> loadValueParameterAnnotations(aiad aiadVar, ahpg ahpgVar, ahyh ahyhVar, int i, ahkb ahkbVar);
}
