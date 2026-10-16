package defpackage;

import java.net.Socket;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ahef {
    public static final boolean a(String str) {
        str.getClass();
        return (affa.f(str, "GET") || affa.f(str, "HEAD")) ? false : true;
    }

    public static final ajiy b(Socket socket) {
        socket.getClass();
        return new ajiy(new ajol(socket));
    }

    public static final String computeInternalName(agba agbaVar, ahfu<?> ahfuVar) {
        agbaVar.getClass();
        ahfuVar.getClass();
        String predefinedFullInternalNameForClass = ahfuVar.getPredefinedFullInternalNameForClass(agbaVar);
        if (predefinedFullInternalNameForClass != null) {
            return predefinedFullInternalNameForClass;
        }
        agbi containingDeclaration = agbaVar.getContainingDeclaration();
        containingDeclaration.getClass();
        String identifier = ahnm.safeIdentifier(agbaVar.getName()).getIdentifier();
        identifier.getClass();
        if (containingDeclaration instanceof agdc) {
            ahnf fqName = ((agdc) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            return afyh.I(fqName.asString(), '.', '/') + '/' + identifier;
        }
        agba agbaVar2 = containingDeclaration instanceof agba ? (agba) containingDeclaration : null;
        if (agbaVar2 == null) {
            throw new IllegalArgumentException(a.bt(agbaVar, containingDeclaration, "Unexpected container: ", " for "));
        }
        String predefinedInternalNameForClass = ahfuVar.getPredefinedInternalNameForClass(agbaVar2);
        if (predefinedInternalNameForClass == null) {
            predefinedInternalNameForClass = computeInternalName(agbaVar2, ahfuVar);
        }
        return predefinedInternalNameForClass + '$' + identifier;
    }

    public static /* synthetic */ String computeInternalName$default(agba agbaVar, ahfu ahfuVar, int i, Object obj) {
        if ((i & 2) != 0) {
            ahfuVar = ahfv.INSTANCE;
        }
        return computeInternalName(agbaVar, ahfuVar);
    }

    public static final boolean hasVoidReturnType(agav agavVar) {
        agavVar.getClass();
        if (agavVar instanceof agbh) {
            return true;
        }
        aigl returnType = agavVar.getReturnType();
        returnType.getClass();
        if (!afye.isUnit(returnType)) {
            return false;
        }
        aigl returnType2 = agavVar.getReturnType();
        returnType2.getClass();
        return (aijc.isNullableType(returnType2) || (agavVar instanceof agdo)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v28, types: [T, java.lang.Object] */
    public static final <T> T mapType(aigl aiglVar, ahex<T> ahexVar, ahfx ahfxVar, ahfu<? extends T> ahfuVar, aheq<T> aheqVar, afeh<? super aigl, ? super T, ? super ahfx, afak> afehVar) {
        T t;
        aigl aiglVar2;
        aheq aheqVar2;
        Object objMapType;
        aiglVar.getClass();
        ahexVar.getClass();
        ahfxVar.getClass();
        ahfuVar.getClass();
        afehVar.getClass();
        aigl aiglVarPreprocessType = ahfuVar.preprocessType(aiglVar);
        if (aiglVarPreprocessType != null) {
            return (T) mapType(aiglVarPreprocessType, ahexVar, ahfxVar, ahfuVar, aheqVar, afehVar);
        }
        aheq aheqVar3 = aheqVar;
        if (afxy.isSuspendFunctionType(aiglVar)) {
            return (T) mapType(afyp.transformSuspendFunctionToRuntimeFunctionType(aiglVar), ahexVar, ahfxVar, ahfuVar, aheqVar3, afehVar);
        }
        Object objMapBuiltInType = ahfy.mapBuiltInType(aikj.INSTANCE, aiglVar, ahexVar, ahfxVar);
        if (objMapBuiltInType != null) {
            ?? r7 = (Object) ahfy.boxTypeIfNeeded(ahexVar, objMapBuiltInType, ahfxVar.getNeedPrimitiveBoxing());
            afehVar.invoke(aiglVar, r7, ahfxVar);
            return r7;
        }
        aiid constructor = aiglVar.getConstructor();
        if (constructor instanceof aigk) {
            aigk aigkVar = (aigk) constructor;
            aigl alternativeType = aigkVar.getAlternativeType();
            if (alternativeType == null) {
                alternativeType = ahfuVar.commonSupertype(aigkVar.mo89getSupertypes());
            }
            return (T) mapType(aimr.replaceArgumentsWithStarProjections(alternativeType), ahexVar, ahfxVar, ahfuVar, aheqVar3, afehVar);
        }
        agbd declarationDescriptor = constructor.getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            Objects.toString(aiglVar);
            throw new UnsupportedOperationException("no descriptor for type constructor of ".concat(aiglVar.toString()));
        }
        if (ailm.isError(declarationDescriptor)) {
            T t2 = (T) ahexVar.createObjectType("error/NonExistentClass");
            ahfuVar.processErrorType(aiglVar, (agba) declarationDescriptor);
            if (aheqVar3 != 0) {
                aheqVar3.writeClass(t2);
            }
            return t2;
        }
        boolean z = declarationDescriptor instanceof agba;
        if (z && afye.isArray(aiglVar)) {
            if (aiglVar.getArguments().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            aiin aiinVar = aiglVar.getArguments().get(0);
            aigl type = aiinVar.getType();
            type.getClass();
            if (aiinVar.getProjectionKind() == aijg.IN_VARIANCE) {
                objMapType = ahexVar.createObjectType("java/lang/Object");
                if (aheqVar3 != 0) {
                    aheqVar3.writeArrayType();
                    aheqVar3.writeClass(objMapType);
                    aheqVar3.writeArrayEnd();
                }
            } else {
                if (aheqVar3 != 0) {
                    aheqVar3.writeArrayType();
                    aheqVar2 = aheqVar3;
                } else {
                    aheqVar2 = null;
                }
                aijg projectionKind = aiinVar.getProjectionKind();
                projectionKind.getClass();
                objMapType = mapType(type, ahexVar, ahfxVar.toGenericArgumentMode(projectionKind, true), ahfuVar, aheqVar2, afehVar);
                if (aheqVar2 != null) {
                    aheqVar2.writeArrayEnd();
                }
            }
            return (T) ahexVar.createFromString("[" + ahexVar.toString(objMapType));
        }
        if (!z) {
            if (!(declarationDescriptor instanceof agee)) {
                if ((declarationDescriptor instanceof aged) && ahfxVar.getMapTypeAliases()) {
                    return (T) mapType(((aged) declarationDescriptor).getExpandedType(), ahexVar, ahfxVar, ahfuVar, aheqVar3, afehVar);
                }
                Objects.toString(aiglVar);
                throw new UnsupportedOperationException("Unknown type ".concat(aiglVar.toString()));
            }
            aigl representativeUpperBound = aimr.getRepresentativeUpperBound((agee) declarationDescriptor);
            if (aiglVar.isMarkedNullable()) {
                representativeUpperBound = aimr.makeNullable(representativeUpperBound);
            }
            T t3 = (T) mapType(representativeUpperBound, ahexVar, ahfxVar, ahfuVar, null, aipl.getDO_NOTHING_3());
            if (aheqVar3 != 0) {
                ahnj name = declarationDescriptor.getName();
                name.getClass();
                aheqVar3.writeTypeVariable(name, t3);
            }
            return t3;
        }
        if (ahsw.isInlineClass(declarationDescriptor) && !ahfxVar.getNeedInlineClassWrapping() && (aiglVar2 = (aigl) aifz.computeExpandedTypeForInlineClass(aikj.INSTANCE, aiglVar)) != null) {
            return (T) mapType(aiglVar2, ahexVar, ahfxVar.wrapInlineClassesMode(), ahfuVar, aheqVar3, afehVar);
        }
        if (ahfxVar.isForAnnotationParameter() && afye.isKClass((agba) declarationDescriptor)) {
            t = (Object) ahexVar.getJavaLangClassType();
        } else {
            agba agbaVar = (agba) declarationDescriptor;
            agba original = agbaVar.getOriginal();
            original.getClass();
            T predefinedTypeForClass = ahfuVar.getPredefinedTypeForClass(original);
            if (predefinedTypeForClass == null) {
                if (agbaVar.getKind() == agbb.ENUM_ENTRY) {
                    agbi containingDeclaration = agbaVar.getContainingDeclaration();
                    containingDeclaration.getClass();
                    agbaVar = (agba) containingDeclaration;
                }
                agba original2 = agbaVar.getOriginal();
                original2.getClass();
                t = (Object) ahexVar.createObjectType(computeInternalName(original2, ahfuVar));
            } else {
                t = (Object) predefinedTypeForClass;
            }
        }
        afehVar.invoke(aiglVar, t, ahfxVar);
        return t;
    }

    public static /* synthetic */ Object mapType$default(aigl aiglVar, ahex ahexVar, ahfx ahfxVar, ahfu ahfuVar, aheq aheqVar, afeh afehVar, int i, Object obj) {
        if ((i & 32) != 0) {
            afehVar = aipl.getDO_NOTHING_3();
        }
        return mapType(aiglVar, ahexVar, ahfxVar, ahfuVar, aheqVar, afehVar);
    }
}
