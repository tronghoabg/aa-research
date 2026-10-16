package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class airf {
    public static final int a(String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ') {
                z2 = cCharAt < 127 || (cCharAt >= '0' && cCharAt < ':') || ((cCharAt >= 'a' && cCharAt < '{') || ((cCharAt >= 'A' && cCharAt < '[') || cCharAt == ':'));
            } else {
                if (cCharAt == '\t') {
                    cCharAt = '\t';
                    if (cCharAt < 127) {
                    }
                }
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final afib createMutableCollectionKType(afib afibVar) {
        String qualifiedName;
        afibVar.getClass();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!afvn.getUseK1Implementation()) {
            aire aireVar = (aire) afibVar;
            afhf classifier = aireVar.getClassifier();
            afhe afheVar = classifier instanceof afhe ? (afhe) classifier : null;
            if (afheVar == null || (qualifiedName = afheVar.getQualifiedName()) == null) {
                Objects.toString(afibVar);
                throw new aftw("Non-class type cannot be a mutable collection type: ".concat(afibVar.toString()));
            }
            ahnf onlyToMutable = afzq.INSTANCE.readOnlyToMutable(new ahnh(qualifiedName));
            if (onlyToMutable != null) {
                return new aire(aireVar.getClassifier(), aireVar.getArguments(), aireVar.isMarkedNullable(), aireVar.getAnnotations(), aireVar.getAbbreviation(), aireVar.isDefinitelyNotNullType(), aireVar.isNothingType(), aireVar.isSuspendFunctionType(), aira.getMutableCollectionKClass(onlyToMutable, (afhe) classifier), null, sk.AUDIO_CONTENT_BUFFER_SIZE, null);
            }
            Objects.toString(afibVar);
            throw new IllegalArgumentException("Not a readonly collection: ".concat(afibVar.toString()));
        }
        aigl type = ((aiqp) afibVar).getType();
        if (!(type instanceof aigw)) {
            Objects.toString(afibVar);
            throw new IllegalArgumentException("Non-simple type cannot be a mutable collection type: ".concat(afibVar.toString()));
        }
        agbd declarationDescriptor = type.getConstructor().getDeclarationDescriptor();
        agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
        if (agbaVar == null) {
            Objects.toString(afibVar);
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: ".concat(afibVar.toString()));
        }
        aigw aigwVar = (aigw) type;
        aiid typeConstructor = readOnlyToMutable(agbaVar).getTypeConstructor();
        typeConstructor.getClass();
        return new aiqp(aigq.simpleType$default(aigwVar, (aihr) null, typeConstructor, (List) null, false, 26, (Object) null), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final afib createNothingType(afib afibVar) {
        afibVar.getClass();
        if (!afvn.getUseK1Implementation()) {
            aire aireVar = (aire) afibVar;
            if (!affa.f(aireVar.getClassifier(), affw.b(Void.class))) {
                Objects.toString(afibVar);
                throw new IllegalArgumentException("Nothing type's classifier must be Void::class: ".concat(afibVar.toString()));
            }
            return new aire(aireVar.getClassifier(), aireVar.getArguments(), aireVar.isMarkedNullable(), aireVar.getAnnotations(), aireVar.getAbbreviation(), aireVar.isDefinitelyNotNullType(), true, aireVar.isSuspendFunctionType(), aireVar.getMutableCollectionClass(), null, sk.AUDIO_CONTENT_BUFFER_SIZE, null);
        }
        aigl type = ((aiqp) afibVar).getType();
        if (!(type instanceof aigw)) {
            Objects.toString(afibVar);
            throw new IllegalArgumentException("Non-simple type cannot be a Nothing type: ".concat(afibVar.toString()));
        }
        aiid typeConstructor = aimr.getBuiltIns(type).getNothing().getTypeConstructor();
        typeConstructor.getClass();
        return new aiqp(aigq.simpleType$default((aigw) type, (aihr) null, typeConstructor, (List) null, false, 26, (Object) null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final afib createPlatformKType(afib afibVar, afib afibVar2, boolean z) {
        afibVar.getClass();
        afibVar2.getClass();
        if (!afvn.getUseK1Implementation()) {
            return aiqq.create$default(aiqr.Companion, (aiqc) afibVar, (aiqc) afibVar2, z, null, 8, null);
        }
        aigl type = ((aiqp) afibVar).getType();
        type.getClass();
        aigw aigwVar = (aigw) type;
        aigl type2 = ((aiqp) afibVar2).getType();
        type2.getClass();
        aigw aigwVar2 = (aigw) type2;
        return new aiqp(z ? new agzc(aigwVar, aigwVar2) : aigq.flexibleType(aigwVar, aigwVar2), null, 2, 0 == true ? 1 : 0);
    }

    private static final agba readOnlyToMutable(agba agbaVar) {
        ahnf onlyToMutable = afzq.INSTANCE.readOnlyToMutable(ahvz.getFqNameUnsafe(agbaVar));
        if (onlyToMutable == null) {
            Objects.toString(agbaVar);
            throw new IllegalArgumentException("Not a readonly collection: ".concat(String.valueOf(agbaVar)));
        }
        agba builtInClassByFqName = ahvz.getBuiltIns(agbaVar).getBuiltInClassByFqName(onlyToMutable);
        builtInClassByFqName.getClass();
        return builtInClassByFqName;
    }
}
