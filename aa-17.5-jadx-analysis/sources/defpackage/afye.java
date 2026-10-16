package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

/* loaded from: classes3.dex */
public class afye {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ahnj BUILTINS_MODULE_NAME = ahnj.special("<built-ins module>");
    private final aiea<ahnj, agba> builtInClassesByName;
    private final aiec<Collection<agdj>> builtInPackagesImportedByDefault;
    private agic builtInsModule;
    private aiec<agic> postponedBuiltInsModule;
    private final aiec<afyd> primitives;
    private final aiei storageManager;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r23) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afye.$$$reportNull$$$0(int):void");
    }

    protected afye(aiei aieiVar) {
        if (aieiVar == null) {
            $$$reportNull$$$0(0);
        }
        this.storageManager = aieiVar;
        this.builtInPackagesImportedByDefault = aieiVar.createLazyValue(new afxz(this));
        this.primitives = aieiVar.createLazyValue(new afya(this));
        this.builtInClassesByName = aieiVar.createMemoizedFunction(new afyb(this));
    }

    private static boolean classFqNameEquals(agbd agbdVar, ahnh ahnhVar) {
        if (agbdVar == null) {
            $$$reportNull$$$0(103);
        }
        if (ahnhVar == null) {
            $$$reportNull$$$0(104);
        }
        return agbdVar.getName().equals(ahnhVar.shortName()) && ahnhVar.equals(ahst.getFqName(agbdVar));
    }

    private agba getBuiltInClassByName(String str) {
        if (str == null) {
            $$$reportNull$$$0(14);
        }
        agba agbaVarInvoke = this.builtInClassesByName.invoke(ahnj.identifier(str));
        if (agbaVarInvoke == null) {
            $$$reportNull$$$0(15);
        }
        return agbaVarInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aigw getBuiltInTypeByClassName(String str) {
        if (str == null) {
            $$$reportNull$$$0(47);
        }
        aigw defaultType = getBuiltInClassByName(str).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(48);
        }
        return defaultType;
    }

    private static aigl getElementTypeForUnsignedArray(aigl aiglVar, agcu agcuVar) {
        ahnd classId;
        ahnd unsignedClassIdByArrayClassId;
        agba agbaVarFindClassAcrossModuleDependencies;
        if (aiglVar == null) {
            $$$reportNull$$$0(71);
        }
        if (agcuVar == null) {
            $$$reportNull$$$0(72);
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null || !afys.INSTANCE.isShortNameOfUnsignedArray(declarationDescriptor.getName()) || (classId = ahvz.getClassId(declarationDescriptor)) == null || (unsignedClassIdByArrayClassId = afys.INSTANCE.getUnsignedClassIdByArrayClassId(classId)) == null || (agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(agcuVar, unsignedClassIdByArrayClassId)) == null) {
            return null;
        }
        return agbaVarFindClassAcrossModuleDependencies.getDefaultType();
    }

    public static afyi getPrimitiveArrayElementType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(92);
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return null;
        }
        return getPrimitiveArrayType(declarationDescriptor);
    }

    public static afyi getPrimitiveArrayType(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(77);
        }
        if (afyn.primitiveArrayTypeShortNames.contains(agbiVar.getName())) {
            return afyn.arrayClassFqNameToPrimitiveType.get(ahst.getFqName(agbiVar));
        }
        return null;
    }

    private agba getPrimitiveClassDescriptor(afyi afyiVar) {
        if (afyiVar == null) {
            $$$reportNull$$$0(16);
        }
        return getBuiltInClassByName(afyiVar.getTypeName().asString());
    }

    public static afyi getPrimitiveType(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(76);
        }
        if (afyn.primitiveTypeShortNames.contains(agbiVar.getName())) {
            return afyn.fqNameToPrimitiveType.get(ahst.getFqName(agbiVar));
        }
        return null;
    }

    public static boolean isAny(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(108);
        }
        return classFqNameEquals(agbaVar, afyn.any);
    }

    public static boolean isAnyOrNullableAny(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(139);
        }
        return isConstructedFromGivenClass(aiglVar, afyn.any);
    }

    public static boolean isArray(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(88);
        }
        return isConstructedFromGivenClass(aiglVar, afyn.array);
    }

    public static boolean isArrayOrPrimitiveArray(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(89);
        }
        return classFqNameEquals(agbaVar, afyn.array) || getPrimitiveArrayType(agbaVar) != null;
    }

    public static boolean isBoolean(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(110);
        }
        return isConstructedFromGivenClassAndNotNullable(aiglVar, afyn._boolean);
    }

    public static boolean isBuiltIn(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(9);
        }
        return ahst.getParentOfType(agbiVar, afxr.class, false) != null;
    }

    private static boolean isConstructedFromGivenClass(aigl aiglVar, ahnh ahnhVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(97);
        }
        if (ahnhVar == null) {
            $$$reportNull$$$0(98);
        }
        return isTypeConstructorForGivenClass(aiglVar.getConstructor(), ahnhVar);
    }

    private static boolean isConstructedFromGivenClassAndNotNullable(aigl aiglVar, ahnh ahnhVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(134);
        }
        if (ahnhVar == null) {
            $$$reportNull$$$0(135);
        }
        return isConstructedFromGivenClass(aiglVar, ahnhVar) && !aiglVar.isMarkedNullable();
    }

    public static boolean isDefaultBound(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(141);
        }
        return isNullableAny(aiglVar);
    }

    public static boolean isDeprecated(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(160);
        }
        if (agbiVar.getOriginal().getAnnotations().hasAnnotation(afyn.deprecated)) {
            return true;
        }
        if (agbiVar instanceof agdn) {
            agdn agdnVar = (agdn) agbiVar;
            boolean zIsVar = agdnVar.isVar();
            agdo getter = agdnVar.getGetter();
            agdp setter = agdnVar.getSetter();
            if (getter != null && isDeprecated(getter)) {
                if (zIsVar) {
                    return setter != null && isDeprecated(setter);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isKClass(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(158);
        }
        return classFqNameEquals(agbaVar, afyn.kClass);
    }

    private static boolean isNotNullConstructedFromGivenClass(aigl aiglVar, ahnh ahnhVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(105);
        }
        if (ahnhVar == null) {
            $$$reportNull$$$0(106);
        }
        return !aiglVar.isMarkedNullable() && isConstructedFromGivenClass(aiglVar, ahnhVar);
    }

    public static boolean isNothing(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(136);
        }
        return isNothingOrNullableNothing(aiglVar) && !aijc.isNullableType(aiglVar);
    }

    public static boolean isNothingOrNullableNothing(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(138);
        }
        return isConstructedFromGivenClass(aiglVar, afyn.nothing);
    }

    public static boolean isNullableAny(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(140);
        }
        return isAnyOrNullableAny(aiglVar) && aiglVar.isMarkedNullable();
    }

    public static boolean isPrimitiveArray(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(91);
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor == null || getPrimitiveArrayType(declarationDescriptor) == null) ? false : true;
    }

    public static boolean isPrimitiveClass(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(96);
        }
        return getPrimitiveType(agbaVar) != null;
    }

    public static boolean isPrimitiveType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(94);
        }
        return !aiglVar.isMarkedNullable() && isPrimitiveTypeOrNullablePrimitiveType(aiglVar);
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(95);
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor instanceof agba) && isPrimitiveClass((agba) declarationDescriptor);
    }

    public static boolean isSpecialClassWithNoSupertypes(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(107);
        }
        return classFqNameEquals(agbaVar, afyn.any) || classFqNameEquals(agbaVar, afyn.nothing);
    }

    public static boolean isString(aigl aiglVar) {
        return aiglVar != null && isNotNullConstructedFromGivenClass(aiglVar, afyn.string);
    }

    public static boolean isTypeConstructorForGivenClass(aiid aiidVar, ahnh ahnhVar) {
        if (aiidVar == null) {
            $$$reportNull$$$0(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (ahnhVar == null) {
            $$$reportNull$$$0(102);
        }
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        return (declarationDescriptor instanceof agba) && classFqNameEquals(declarationDescriptor, ahnhVar);
    }

    public static boolean isUByteArray(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(128);
        }
        return isConstructedFromGivenClassAndNotNullable(aiglVar, afyn.uByteArrayFqName.toUnsafe());
    }

    public static boolean isUIntArray(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(130);
        }
        return isConstructedFromGivenClassAndNotNullable(aiglVar, afyn.uIntArrayFqName.toUnsafe());
    }

    public static boolean isULongArray(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(131);
        }
        return isConstructedFromGivenClassAndNotNullable(aiglVar, afyn.uLongArrayFqName.toUnsafe());
    }

    public static boolean isUShortArray(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(129);
        }
        return isConstructedFromGivenClassAndNotNullable(aiglVar, afyn.uShortArrayFqName.toUnsafe());
    }

    public static boolean isUnderKotlinPackage(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(10);
        }
        while (agbiVar != null) {
            if (agbiVar instanceof agdc) {
                return ((agdc) agbiVar).getFqName().startsWith(afyo.BUILT_INS_PACKAGE_NAME);
            }
            agbiVar = agbiVar.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isUnit(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(142);
        }
        return isNotNullConstructedFromGivenClass(aiglVar, afyn.unit);
    }

    public static boolean isUnsignedArrayType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(132);
        }
        return isUByteArray(aiglVar) || isUShortArray(aiglVar) || isUIntArray(aiglVar) || isULongArray(aiglVar);
    }

    protected void createBuiltInsModule(boolean z) {
        agic agicVar = new agic(BUILTINS_MODULE_NAME, this.storageManager, this, null);
        this.builtInsModule = agicVar;
        agicVar.initialize(BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.storageManager, this.builtInsModule, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider(), z));
        agic agicVar2 = this.builtInsModule;
        agicVar2.setDependencies(agicVar2);
    }

    protected agfx getAdditionalClassPartsProvider() {
        agfw agfwVar = agfw.INSTANCE;
        if (agfwVar == null) {
            $$$reportNull$$$0(3);
        }
        return agfwVar;
    }

    public agba getAny() {
        return getBuiltInClassByName("Any");
    }

    public aigw getAnyType() {
        aigw defaultType = getAny().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(51);
        }
        return defaultType;
    }

    public agba getArray() {
        return getBuiltInClassByName("Array");
    }

    public aigl getArrayElementType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(68);
        }
        aigl arrayElementTypeOrNull = getArrayElementTypeOrNull(aiglVar);
        if (arrayElementTypeOrNull != null) {
            return arrayElementTypeOrNull;
        }
        Objects.toString(aiglVar);
        throw new IllegalStateException("not array: ".concat(String.valueOf(aiglVar)));
    }

    public aigl getArrayElementTypeOrNull(aigl aiglVar) {
        aigl elementTypeForUnsignedArray;
        if (aiglVar == null) {
            $$$reportNull$$$0(70);
        }
        if (isArray(aiglVar)) {
            if (aiglVar.getArguments().size() != 1) {
                return null;
            }
            return aiglVar.getArguments().get(0).getType();
        }
        aigl aiglVarMakeNotNullable = aijc.makeNotNullable(aiglVar);
        aigw aigwVar = this.primitives.invoke().kotlinArrayTypeToPrimitiveKotlinType.get(aiglVarMakeNotNullable);
        if (aigwVar != null) {
            return aigwVar;
        }
        agcu containingModuleOrNull = ahst.getContainingModuleOrNull(aiglVarMakeNotNullable);
        if (containingModuleOrNull == null || (elementTypeForUnsignedArray = getElementTypeForUnsignedArray(aiglVarMakeNotNullable, containingModuleOrNull)) == null) {
            return null;
        }
        return elementTypeForUnsignedArray;
    }

    public aigw getArrayType(aijg aijgVar, aigl aiglVar, agfk agfkVar) {
        if (aijgVar == null) {
            $$$reportNull$$$0(78);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(79);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(80);
        }
        return aigq.simpleNotNullType(aihs.toDefaultAttributes(agfkVar), getArray(), Collections.singletonList(new aiip(aijgVar, aiglVar)));
    }

    public aigw getBooleanType() {
        aigw primitiveKotlinType = getPrimitiveKotlinType(afyi.BOOLEAN);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(64);
        }
        return primitiveKotlinType;
    }

    public agba getBuiltInClassByFqName(ahnf ahnfVar) {
        if (ahnfVar == null) {
            $$$reportNull$$$0(12);
        }
        agba agbaVarResolveClassByFqName = agbo.resolveClassByFqName(getBuiltInsModule(), ahnfVar, aglr.FROM_BUILTINS);
        if (agbaVarResolveClassByFqName == null) {
            $$$reportNull$$$0(13);
        }
        return agbaVarResolveClassByFqName;
    }

    public agic getBuiltInsModule() {
        agic agicVarInvoke = this.builtInsModule;
        if (agicVarInvoke == null) {
            agicVarInvoke = this.postponedBuiltInsModule.invoke();
            this.builtInsModule = agicVarInvoke;
        }
        if (agicVarInvoke == null) {
            $$$reportNull$$$0(7);
        }
        return agicVarInvoke;
    }

    public ahxe getBuiltInsPackageScope() {
        ahxe memberScope = getBuiltInsModule().getPackage(afyo.BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope == null) {
            $$$reportNull$$$0(11);
        }
        return memberScope;
    }

    public aigw getByteType() {
        aigw primitiveKotlinType = getPrimitiveKotlinType(afyi.BYTE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(57);
        }
        return primitiveKotlinType;
    }

    public aigw getCharType() {
        aigw primitiveKotlinType = getPrimitiveKotlinType(afyi.CHAR);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(63);
        }
        return primitiveKotlinType;
    }

    protected Iterable<agfy> getClassDescriptorFactories() {
        List listSingletonList = Collections.singletonList(new afyt(this.storageManager, getBuiltInsModule()));
        if (listSingletonList == null) {
            $$$reportNull$$$0(5);
        }
        return listSingletonList;
    }

    public agba getCollection() {
        agba builtInClassByFqName = getBuiltInClassByFqName(afyn.collection);
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(35);
        }
        return builtInClassByFqName;
    }

    public agba getComparable() {
        return getBuiltInClassByName("Comparable");
    }

    public aigw getDefaultBound() {
        aigw nullableAnyType = getNullableAnyType();
        if (nullableAnyType == null) {
            $$$reportNull$$$0(53);
        }
        return nullableAnyType;
    }

    public aigw getDoubleType() {
        aigw primitiveKotlinType = getPrimitiveKotlinType(afyi.DOUBLE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(62);
        }
        return primitiveKotlinType;
    }

    public aigw getFloatType() {
        aigw primitiveKotlinType = getPrimitiveKotlinType(afyi.FLOAT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(61);
        }
        return primitiveKotlinType;
    }

    public agba getFunction(int i) {
        return getBuiltInClassByName(afyo.getFunctionName(i));
    }

    public aigw getIntType() {
        aigw primitiveKotlinType = getPrimitiveKotlinType(afyi.INT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(59);
        }
        return primitiveKotlinType;
    }

    public agba getKClass() {
        agba builtInClassByFqName = getBuiltInClassByFqName(afyn.kClass.toSafe());
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(21);
        }
        return builtInClassByFqName;
    }

    public aigw getLongType() {
        aigw primitiveKotlinType = getPrimitiveKotlinType(afyi.LONG);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(60);
        }
        return primitiveKotlinType;
    }

    public agba getNothing() {
        return getBuiltInClassByName("Nothing");
    }

    public aigw getNothingType() {
        aigw defaultType = getNothing().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(49);
        }
        return defaultType;
    }

    public aigw getNullableAnyType() {
        aigw aigwVarMakeNullableAsSpecified = getAnyType().makeNullableAsSpecified(true);
        if (aigwVarMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(52);
        }
        return aigwVarMakeNullableAsSpecified;
    }

    public aigw getNullableNothingType() {
        aigw aigwVarMakeNullableAsSpecified = getNothingType().makeNullableAsSpecified(true);
        if (aigwVarMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(50);
        }
        return aigwVarMakeNullableAsSpecified;
    }

    public agba getNumber() {
        return getBuiltInClassByName("Number");
    }

    public aigw getNumberType() {
        aigw defaultType = getNumber().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(56);
        }
        return defaultType;
    }

    protected aggb getPlatformDependentDeclarationFilter() {
        agga aggaVar = agga.INSTANCE;
        if (aggaVar == null) {
            $$$reportNull$$$0(4);
        }
        return aggaVar;
    }

    public aigw getPrimitiveArrayKotlinType(afyi afyiVar) {
        if (afyiVar == null) {
            $$$reportNull$$$0(73);
        }
        aigw aigwVar = this.primitives.invoke().primitiveTypeToArrayKotlinType.get(afyiVar);
        if (aigwVar == null) {
            $$$reportNull$$$0(74);
        }
        return aigwVar;
    }

    public aigw getPrimitiveKotlinType(afyi afyiVar) {
        if (afyiVar == null) {
            $$$reportNull$$$0(54);
        }
        aigw defaultType = getPrimitiveClassDescriptor(afyiVar).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(55);
        }
        return defaultType;
    }

    public aigw getShortType() {
        aigw primitiveKotlinType = getPrimitiveKotlinType(afyi.SHORT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(58);
        }
        return primitiveKotlinType;
    }

    protected aiei getStorageManager() {
        aiei aieiVar = this.storageManager;
        if (aieiVar == null) {
            $$$reportNull$$$0(6);
        }
        return aieiVar;
    }

    public agba getString() {
        return getBuiltInClassByName("String");
    }

    public aigw getStringType() {
        aigw defaultType = getString().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(66);
        }
        return defaultType;
    }

    public agba getSuspendFunction(int i) {
        agba builtInClassByFqName = getBuiltInClassByFqName(afyo.COROUTINES_PACKAGE_FQ_NAME.child(ahnj.identifier(afyo.getSuspendFunctionName(i))));
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(18);
        }
        return builtInClassByFqName;
    }

    public agba getUnit() {
        return getBuiltInClassByName("Unit");
    }

    public aigw getUnitType() {
        aigw defaultType = getUnit().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(65);
        }
        return defaultType;
    }

    public void setBuiltInsModule(agic agicVar) {
        if (agicVar == null) {
            $$$reportNull$$$0(1);
        }
        this.storageManager.compute(new afyc(this, agicVar));
    }

    public static boolean isArrayOrPrimitiveArray(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(90);
        }
        return isArray(aiglVar) || isPrimitiveArray(aiglVar);
    }

    public aigw getArrayType(aijg aijgVar, aigl aiglVar) {
        if (aijgVar == null) {
            $$$reportNull$$$0(82);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(83);
        }
        aigw arrayType = getArrayType(aijgVar, aiglVar, agfk.Companion.getEMPTY());
        if (arrayType == null) {
            $$$reportNull$$$0(84);
        }
        return arrayType;
    }
}
