package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public interface aiiz extends aimg {
    aily arrayType(ailw ailwVar);

    ahnh getClassFqNameUnsafe(aimd aimdVar);

    afyi getPrimitiveArrayType(aimd aimdVar);

    afyi getPrimitiveType(aimd aimdVar);

    ailw getRepresentativeUpperBound(aime aimeVar);

    ailw getUnsubstitutedUnderlyingType(ailw ailwVar);

    boolean hasAnnotation(ailw ailwVar, ahnf ahnfVar);

    boolean isArrayOrNullableArray(ailw ailwVar);

    boolean isInlineClass(aimd aimdVar);

    boolean isUnderKotlinPackage(aimd aimdVar);

    ailw makeNullable(ailw ailwVar);

    aily nullableAnyType();

    aimf typeSubstitutorForUnderlyingType(Map<aimd, ? extends ailw> map);
}
