package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class ahss {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static agdq createContextReceiverParameterForCallable(agav agavVar, aigl aiglVar, ahnj ahnjVar, agfk agfkVar, int i) {
        if (agavVar == null) {
            $$$reportNull$$$0(32);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(33);
        }
        if (aiglVar == null) {
            return null;
        }
        return new agin(agavVar, new ahxw(agavVar, aiglVar, ahnjVar, null), agfkVar, ahnl.contextReceiverName(i));
    }

    public static agdq createContextReceiverParameterForClass(agba agbaVar, aigl aiglVar, ahnj ahnjVar, agfk agfkVar, int i) {
        if (agbaVar == null) {
            $$$reportNull$$$0(34);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(35);
        }
        if (aiglVar == null) {
            return null;
        }
        return new agin(agbaVar, new ahxv(agbaVar, aiglVar, ahnjVar, null), agfkVar, ahnl.contextReceiverName(i));
    }

    public static agil createDefaultGetter(agdn agdnVar, agfk agfkVar) {
        if (agdnVar == null) {
            $$$reportNull$$$0(13);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(14);
        }
        return createGetter(agdnVar, agfkVar, true, false, false);
    }

    public static agim createDefaultSetter(agdn agdnVar, agfk agfkVar, agfk agfkVar2) {
        if (agdnVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agfkVar2 == null) {
            $$$reportNull$$$0(2);
        }
        return createSetter(agdnVar, agfkVar, agfkVar2, true, false, false, agdnVar.getSource());
    }

    public static agdn createEnumEntriesProperty(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(26);
        }
        agcu containingModule = ahst.getContainingModule(agbaVar);
        agba agbaVarFindEnumEntriesClass = ahtt.getStdlibClassFinder(containingModule).findEnumEntriesClass(containingModule);
        if (agbaVarFindEnumEntriesClass == null) {
            return null;
        }
        agik agikVarCreate = agik.create(agbaVar, agfk.Companion.getEMPTY(), agcq.FINAL, agcb.PUBLIC, false, afyo.ENUM_ENTRIES, agaw.SYNTHESIZED, agbaVar.getSource(), false, false, false, false, false, false);
        agil agilVar = new agil(agikVarCreate, agfk.Companion.getEMPTY(), agcq.FINAL, agcb.PUBLIC, false, false, false, agaw.SYNTHESIZED, null, agbaVar.getSource());
        agikVarCreate.initialize(agilVar, null);
        agikVarCreate.setType(aigq.simpleType(aihr.Companion.getEmpty(), agbaVarFindEnumEntriesClass.getTypeConstructor(), Collections.singletonList(new aiip(agbaVar.getDefaultType())), false), Collections.EMPTY_LIST, null, null, Collections.EMPTY_LIST);
        agilVar.initialize(agikVarCreate.getReturnType());
        return agikVarCreate;
    }

    public static agdv createEnumValueOfMethod(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(24);
        }
        agio agioVarCreate = agio.create(agbaVar, agfk.Companion.getEMPTY(), afyo.ENUM_VALUE_OF, agaw.SYNTHESIZED, agbaVar.getSource());
        agio agioVarInitialize = agioVarCreate.initialize((agdq) null, (agdq) null, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.singletonList(new agiy(agioVarCreate, null, 0, agfk.Companion.getEMPTY(), ahnj.identifier("value"), ahvz.getBuiltIns(agbaVar).getStringType(), false, false, false, null, agbaVar.getSource())), (aigl) agbaVar.getDefaultType(), agcq.FINAL, agcb.PUBLIC);
        if (agioVarInitialize == null) {
            $$$reportNull$$$0(25);
        }
        return agioVarInitialize;
    }

    public static agdv createEnumValuesMethod(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(22);
        }
        agio agioVarInitialize = agio.create(agbaVar, agfk.Companion.getEMPTY(), afyo.ENUM_VALUES, agaw.SYNTHESIZED, agbaVar.getSource()).initialize((agdq) null, (agdq) null, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, (aigl) ahvz.getBuiltIns(agbaVar).getArrayType(aijg.INVARIANT, agbaVar.getDefaultType()), agcq.FINAL, agcb.PUBLIC);
        if (agioVarInitialize == null) {
            $$$reportNull$$$0(23);
        }
        return agioVarInitialize;
    }

    public static agdq createExtensionReceiverParameterForCallable(agav agavVar, aigl aiglVar, agfk agfkVar) {
        if (agavVar == null) {
            $$$reportNull$$$0(30);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(31);
        }
        if (aiglVar == null) {
            return null;
        }
        return new agin(agavVar, new ahxx(agavVar, aiglVar, null), agfkVar);
    }

    public static agil createGetter(agdn agdnVar, agfk agfkVar, boolean z, boolean z2, boolean z3, agdx agdxVar) {
        if (agdnVar == null) {
            $$$reportNull$$$0(17);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(18);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(19);
        }
        return new agil(agdnVar, agfkVar, agdnVar.getModality(), agdnVar.getVisibility(), z, z2, z3, agaw.DECLARATION, null, agdxVar);
    }

    public static aggu createPrimaryConstructorForObject(agba agbaVar, agdx agdxVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(20);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(21);
        }
        return new ahsr(agbaVar, agdxVar, false);
    }

    public static agim createSetter(agdn agdnVar, agfk agfkVar, agfk agfkVar2, boolean z, boolean z2, boolean z3, agcc agccVar, agdx agdxVar) {
        if (agdnVar == null) {
            $$$reportNull$$$0(7);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(8);
        }
        if (agfkVar2 == null) {
            $$$reportNull$$$0(9);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(10);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(11);
        }
        agim agimVar = new agim(agdnVar, agfkVar, agdnVar.getModality(), agccVar, z, z2, z3, agaw.DECLARATION, null, agdxVar);
        agimVar.initialize(agim.createSetterParameter(agimVar, agdnVar.getType(), agfkVar2));
        return agimVar;
    }

    public static agil createGetter(agdn agdnVar, agfk agfkVar, boolean z, boolean z2, boolean z3) {
        if (agdnVar == null) {
            $$$reportNull$$$0(15);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(16);
        }
        return createGetter(agdnVar, agfkVar, z, z2, z3, agdnVar.getSource());
    }

    public static agim createSetter(agdn agdnVar, agfk agfkVar, agfk agfkVar2, boolean z, boolean z2, boolean z3, agdx agdxVar) {
        if (agdnVar == null) {
            $$$reportNull$$$0(3);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agfkVar2 == null) {
            $$$reportNull$$$0(5);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(6);
        }
        return createSetter(agdnVar, agfkVar, agfkVar2, z, z2, z3, agdnVar.getVisibility(), agdxVar);
    }
}
