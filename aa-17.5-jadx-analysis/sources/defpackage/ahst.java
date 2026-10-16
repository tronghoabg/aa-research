package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahst {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ahnf JVM_NAME = new ahnf("kotlin.jvm.JvmName");

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "subClass";
                break;
            case 27:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case 66:
                objArr[0] = RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                objArr[1] = "getSuperClassType";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[2] = "isSubtypeOfClass";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[2] = "isAnonymousObject";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private ahst() {
    }

    public static boolean areInSameModule(agbi agbiVar, agbi agbiVar2) {
        if (agbiVar == null) {
            $$$reportNull$$$0(16);
        }
        if (agbiVar2 == null) {
            $$$reportNull$$$0(17);
        }
        return getContainingModule(agbiVar).equals(getContainingModule(agbiVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends agav> void collectAllOverriddenDescriptors(D d, Set<D> set) {
        if (d == null) {
            $$$reportNull$$$0(72);
        }
        if (set == 0) {
            $$$reportNull$$$0(73);
        }
        if (set.contains(d)) {
            return;
        }
        Iterator<? extends agav> it = d.getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            agav original = it.next().getOriginal();
            collectAllOverriddenDescriptors(original, set);
            set.add(original);
        }
    }

    public static <D extends agav> Set<D> getAllOverriddenDescriptors(D d) {
        if (d == null) {
            $$$reportNull$$$0(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        collectAllOverriddenDescriptors(d.getOriginal(), linkedHashSet);
        return linkedHashSet;
    }

    public static agba getClassDescriptorForType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(45);
        }
        return getClassDescriptorForTypeConstructor(aiglVar.getConstructor());
    }

    public static agba getClassDescriptorForTypeConstructor(aiid aiidVar) {
        if (aiidVar == null) {
            $$$reportNull$$$0(46);
        }
        agba agbaVar = (agba) aiidVar.getDeclarationDescriptor();
        if (agbaVar == null) {
            $$$reportNull$$$0(47);
        }
        return agbaVar;
    }

    public static agcu getContainingModule(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(21);
        }
        agcu containingModuleOrNull = getContainingModuleOrNull(agbiVar);
        if (containingModuleOrNull == null) {
            $$$reportNull$$$0(22);
        }
        return containingModuleOrNull;
    }

    public static agcu getContainingModuleOrNull(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(23);
        }
        while (agbiVar != null) {
            if (agbiVar instanceof agcu) {
                return (agcu) agbiVar;
            }
            if (agbiVar instanceof agdj) {
                return ((agdj) agbiVar).getModule();
            }
            agbiVar = agbiVar.getContainingDeclaration();
        }
        return null;
    }

    public static agdz getContainingSourceFile(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(81);
        }
        if (agbiVar instanceof agdp) {
            agbiVar = ((agdp) agbiVar).getCorrespondingProperty();
        }
        if (agbiVar instanceof agbl) {
            agdz containingFile = ((agbl) agbiVar).getSource().getContainingFile();
            if (containingFile == null) {
                $$$reportNull$$$0(82);
            }
            return containingFile;
        }
        agdz agdzVar = agdz.NO_SOURCE_FILE;
        if (agdzVar == null) {
            $$$reportNull$$$0(83);
        }
        return agdzVar;
    }

    public static agcc getDefaultConstructorVisibility(agba agbaVar, boolean z) {
        if (agbaVar == null) {
            $$$reportNull$$$0(48);
        }
        agbb kind = agbaVar.getKind();
        if (kind == agbb.ENUM_CLASS || kind.isSingleton()) {
            agcc agccVar = agcb.PRIVATE;
            if (agccVar == null) {
                $$$reportNull$$$0(49);
            }
            return agccVar;
        }
        if (isSealedClass(agbaVar)) {
            if (z) {
                agcc agccVar2 = agcb.PROTECTED;
                if (agccVar2 == null) {
                    $$$reportNull$$$0(50);
                }
                return agccVar2;
            }
            agcc agccVar3 = agcb.PRIVATE;
            if (agccVar3 == null) {
                $$$reportNull$$$0(51);
            }
            return agccVar3;
        }
        if (isAnonymousObject(agbaVar)) {
            agcc agccVar4 = agcb.DEFAULT_VISIBILITY;
            if (agccVar4 == null) {
                $$$reportNull$$$0(52);
            }
            return agccVar4;
        }
        agcc agccVar5 = agcb.PUBLIC;
        if (agccVar5 == null) {
            $$$reportNull$$$0(53);
        }
        return agccVar5;
    }

    public static agdq getDispatchReceiverParameterIfNeeded(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar instanceof agba) {
            return ((agba) agbiVar).getThisAsReceiverParameter();
        }
        return null;
    }

    public static ahnh getFqName(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(2);
        }
        ahnf fqNameSafeIfPossible = getFqNameSafeIfPossible(agbiVar);
        return fqNameSafeIfPossible != null ? fqNameSafeIfPossible.toUnsafe() : getFqNameUnsafe(agbiVar);
    }

    public static ahnf getFqNameSafe(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(3);
        }
        ahnf fqNameSafeIfPossible = getFqNameSafeIfPossible(agbiVar);
        return fqNameSafeIfPossible != null ? fqNameSafeIfPossible : getFqNameUnsafe(agbiVar).toSafe();
    }

    private static ahnf getFqNameSafeIfPossible(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(5);
        }
        if ((agbiVar instanceof agcu) || ailm.isError(agbiVar)) {
            return ahnf.ROOT;
        }
        if (agbiVar instanceof agdj) {
            return ((agdj) agbiVar).getFqName();
        }
        if (agbiVar instanceof agdc) {
            return ((agdc) agbiVar).getFqName();
        }
        return null;
    }

    private static ahnh getFqNameUnsafe(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(6);
        }
        return getFqName(agbiVar.getContainingDeclaration()).child(agbiVar.getName());
    }

    public static <D extends agbi> D getParentOfType(agbi agbiVar, Class<D> cls, boolean z) {
        if (cls == null) {
            $$$reportNull$$$0(19);
        }
        if (agbiVar == null) {
            return null;
        }
        if (z) {
            agbiVar = (D) agbiVar.getContainingDeclaration();
        }
        while (agbiVar != null) {
            if (cls.isInstance(agbiVar)) {
                return (D) agbiVar;
            }
            agbiVar = (D) agbiVar.getContainingDeclaration();
        }
        return null;
    }

    public static agba getSuperClassDescriptor(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(44);
        }
        Iterator<aigl> it = agbaVar.getTypeConstructor().mo89getSupertypes().iterator();
        while (it.hasNext()) {
            agba classDescriptorForType = getClassDescriptorForType(it.next());
            if (classDescriptorForType.getKind() != agbb.INTERFACE) {
                return classDescriptorForType;
            }
        }
        return null;
    }

    public static boolean isAnnotationClass(agbi agbiVar) {
        return isKindOf(agbiVar, agbb.ANNOTATION_CLASS);
    }

    public static boolean isAnonymousObject(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(34);
        }
        return isClass(agbiVar) && agbiVar.getName().equals(ahnm.NO_NAME_PROVIDED);
    }

    public static boolean isClass(agbi agbiVar) {
        return isKindOf(agbiVar, agbb.CLASS);
    }

    public static boolean isClassOrEnumClass(agbi agbiVar) {
        return isClass(agbiVar) || isEnumClass(agbiVar);
    }

    public static boolean isCompanionObject(agbi agbiVar) {
        return isKindOf(agbiVar, agbb.OBJECT) && ((agba) agbiVar).isCompanionObject();
    }

    public static boolean isDescriptorWithLocalVisibility(agbi agbiVar) {
        return (agbiVar instanceof agbm) && ((agbm) agbiVar).getVisibility() == agcb.LOCAL;
    }

    public static boolean isDirectSubclass(agba agbaVar, agba agbaVar2) {
        if (agbaVar == null) {
            $$$reportNull$$$0(26);
        }
        if (agbaVar2 == null) {
            $$$reportNull$$$0(27);
        }
        Iterator<aigl> it = agbaVar.getTypeConstructor().mo89getSupertypes().iterator();
        while (it.hasNext()) {
            if (isSameClass(it.next(), agbaVar2.getOriginal())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEnumClass(agbi agbiVar) {
        return isKindOf(agbiVar, agbb.ENUM_CLASS);
    }

    public static boolean isEnumEntry(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(36);
        }
        return isKindOf(agbiVar, agbb.ENUM_ENTRY);
    }

    public static boolean isInterface(agbi agbiVar) {
        return isKindOf(agbiVar, agbb.INTERFACE);
    }

    private static boolean isKindOf(agbi agbiVar, agbb agbbVar) {
        if (agbbVar == null) {
            $$$reportNull$$$0(37);
        }
        return (agbiVar instanceof agba) && ((agba) agbiVar).getKind() == agbbVar;
    }

    public static boolean isLocal(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        while (agbiVar != null) {
            if (isAnonymousObject(agbiVar) || isDescriptorWithLocalVisibility(agbiVar)) {
                return true;
            }
            agbiVar = agbiVar.getContainingDeclaration();
        }
        return false;
    }

    private static boolean isSameClass(aigl aiglVar, agbi agbiVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(30);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(31);
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return false;
        }
        agbi original = declarationDescriptor.getOriginal();
        return (original instanceof agbd) && (agbiVar instanceof agbd) && ((agbd) agbiVar).getTypeConstructor().equals(((agbd) original).getTypeConstructor());
    }

    public static boolean isSealedClass(agbi agbiVar) {
        return (isKindOf(agbiVar, agbb.CLASS) || isKindOf(agbiVar, agbb.INTERFACE)) && ((agba) agbiVar).getModality() == agcq.SEALED;
    }

    public static boolean isSubclass(agba agbaVar, agba agbaVar2) {
        if (agbaVar == null) {
            $$$reportNull$$$0(28);
        }
        if (agbaVar2 == null) {
            $$$reportNull$$$0(29);
        }
        return isSubtypeOfClass(agbaVar.getDefaultType(), agbaVar2.getOriginal());
    }

    public static boolean isSubtypeOfClass(aigl aiglVar, agbi agbiVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(32);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(33);
        }
        if (isSameClass(aiglVar, agbiVar)) {
            return true;
        }
        Iterator<aigl> it = aiglVar.getConstructor().mo89getSupertypes().iterator();
        while (it.hasNext()) {
            if (isSubtypeOfClass(it.next(), agbiVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTopLevelDeclaration(agbi agbiVar) {
        return agbiVar != null && (agbiVar.getContainingDeclaration() instanceof agdc);
    }

    public static boolean shouldRecordInitializerForProperty(agem agemVar, aigl aiglVar) {
        if (agemVar == null) {
            $$$reportNull$$$0(65);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(66);
        }
        if (agemVar.isVar() || aigr.isError(aiglVar)) {
            return false;
        }
        if (aijc.acceptsNullable(aiglVar)) {
            return true;
        }
        afye builtIns = ahvz.getBuiltIns(agemVar);
        if (!afye.isPrimitiveType(aiglVar) && !aijp.DEFAULT.equalTypes(builtIns.getStringType(), aiglVar) && !aijp.DEFAULT.equalTypes(builtIns.getNumber().getDefaultType(), aiglVar) && !aijp.DEFAULT.equalTypes(builtIns.getAnyType(), aiglVar)) {
            afys afysVar = afys.INSTANCE;
            if (!afys.isUnsignedType(aiglVar)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends agax> D unwrapFakeOverride(D d) {
        if (d == null) {
            $$$reportNull$$$0(58);
        }
        while (d.getKind() == agaw.FAKE_OVERRIDE) {
            Collection<? extends agax> overriddenDescriptors = d.getOverriddenDescriptors();
            if (overriddenDescriptors.isEmpty()) {
                Objects.toString(d);
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: ".concat(String.valueOf(d)));
            }
            d = (D) overriddenDescriptors.iterator().next();
        }
        if (d == null) {
            $$$reportNull$$$0(59);
        }
        return d;
    }

    public static <D extends agbm> D unwrapFakeOverrideToAnyDeclaration(D d) {
        if (d == null) {
            $$$reportNull$$$0(63);
        }
        if (d instanceof agax) {
            return unwrapFakeOverride((agax) d);
        }
        if (d == null) {
            $$$reportNull$$$0(64);
        }
        return d;
    }

    public static <D extends agbi> D getParentOfType(agbi agbiVar, Class<D> cls) {
        if (cls == null) {
            $$$reportNull$$$0(18);
        }
        return (D) getParentOfType(agbiVar, cls, true);
    }

    public static agcu getContainingModuleOrNull(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(20);
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return null;
        }
        return getContainingModuleOrNull(declarationDescriptor);
    }
}
