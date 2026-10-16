package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ahdm<A, C> extends ahdv<A, ahdx<? extends A, ? extends C>> implements ahyi<A, C> {
    private final aiea<ahfj, ahdx<A, C>> storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdm(aiei aieiVar, ahfc ahfcVar) {
        super(ahfcVar);
        aieiVar.getClass();
        ahfcVar.getClass();
        this.storage = aieiVar.createMemoizedFunction(new ahdg(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAnnotationDefaultValue$lambda$0(ahdx ahdxVar, ahfn ahfnVar) {
        ahdxVar.getClass();
        ahfnVar.getClass();
        return ahdxVar.getAnnotationParametersDefaultValues().get(ahfnVar);
    }

    private final ahdx<A, C> loadAnnotationsAndInitializers(ahfj ahfjVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ahfjVar.visitMembers(new ahdl(this, map, ahfjVar, map3, map2), getCachedFileContent(ahfjVar));
        return new ahdx<>(map, map2, map3);
    }

    private final C loadConstantFromProperty(aiad aiadVar, ahis ahisVar, ahyh ahyhVar, aigl aiglVar, afeg<? super ahdx<? extends A, ? extends C>, ? super ahfn, ? extends C> afegVar) throws IOException {
        C cInvoke;
        ahfj ahfjVarFindClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(aiadVar, ahdv.Companion.getSpecialCaseContainerClass(aiadVar, true, true, ahla.IS_CONST.get(ahisVar.getFlags()), ahmt.isMovedFromInterfaceCompanion(ahisVar), getKotlinClassFinder(), getMetadataVersion()));
        if (ahfjVarFindClassWithAnnotationsAndInitializers == null) {
            return null;
        }
        ahfn callableSignature = getCallableSignature(ahisVar, aiadVar.getNameResolver(), aiadVar.getTypeTable(), ahyhVar, ahfjVarFindClassWithAnnotationsAndInitializers.getClassHeader().getMetadataVersion().isAtLeast(ahen.Companion.getKOTLIN_1_3_RC_METADATA_VERSION$org_jetbrains_kotlin_descriptors_jvm()));
        if (callableSignature == null || (cInvoke = afegVar.invoke(this.storage.invoke(ahfjVarFindClassWithAnnotationsAndInitializers), callableSignature)) == null) {
            return null;
        }
        return afys.isUnsignedType(aiglVar) ? transformToUnsignedConstant(cInvoke) : cInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadPropertyConstant$lambda$0(ahdx ahdxVar, ahfn ahfnVar) {
        ahdxVar.getClass();
        ahfnVar.getClass();
        return ahdxVar.getPropertyConstants().get(ahfnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahdx storage$lambda$0(ahdm ahdmVar, ahfj ahfjVar) {
        ahfjVar.getClass();
        return ahdmVar.loadAnnotationsAndInitializers(ahfjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahdv
    public ahdx<A, C> getAnnotationsContainer(ahfj ahfjVar) {
        ahfjVar.getClass();
        return this.storage.invoke(ahfjVar);
    }

    protected final boolean isRepeatableWithImplicitContainer(ahnd ahndVar, Map<ahnj, ? extends ahuh<?>> map) {
        ahndVar.getClass();
        map.getClass();
        if (!affa.f(ahndVar, afxo.INSTANCE.getJAVA_LANG_ANNOTATION_REPEATABLE())) {
            return false;
        }
        ahuh<?> ahuhVar = map.get(ahnj.identifier("value"));
        ahvc ahvcVar = ahuhVar instanceof ahvc ? (ahvc) ahuhVar : null;
        if (ahvcVar == null) {
            return false;
        }
        Object value = ahvcVar.getValue();
        ahva ahvaVar = value instanceof ahva ? (ahva) value : null;
        if (ahvaVar != null) {
            return isImplicitRepeatableContainer(ahvaVar.getClassId());
        }
        return false;
    }

    @Override // defpackage.ahyi
    public C loadAnnotationDefaultValue(aiad aiadVar, ahis ahisVar, aigl aiglVar) {
        aiadVar.getClass();
        ahisVar.getClass();
        aiglVar.getClass();
        return loadConstantFromProperty(aiadVar, ahisVar, ahyh.PROPERTY_GETTER, aiglVar, ahdh.INSTANCE);
    }

    protected abstract C loadConstant(String str, Object obj);

    @Override // defpackage.ahyi
    public C loadPropertyConstant(aiad aiadVar, ahis ahisVar, aigl aiglVar) {
        aiadVar.getClass();
        ahisVar.getClass();
        aiglVar.getClass();
        return loadConstantFromProperty(aiadVar, ahisVar, ahyh.PROPERTY, aiglVar, ahdi.INSTANCE);
    }

    protected abstract C transformToUnsignedConstant(C c);
}
