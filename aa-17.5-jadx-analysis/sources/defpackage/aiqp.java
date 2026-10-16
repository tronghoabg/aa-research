package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aiqp extends aiqc {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aiqp.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new affn(aiqp.class, "arguments", "getArguments()Ljava/util/List;", 0)};
    public static final /* synthetic */ int a = 0;
    private final afup arguments$delegate;
    private final afup classifier$delegate;
    private final boolean isAbbreviation;
    private final aigl type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiqp(aigl aiglVar, afdr<? extends Type> afdrVar, boolean z) {
        super(afdrVar);
        aiglVar.getClass();
        this.type = aiglVar;
        this.isAbbreviation = z;
        this.classifier$delegate = afus.lazySoft(new aiqk(this));
        this.arguments$delegate = afus.lazySoft(new aiql(this, afdrVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _get_mutableCollectionClass_$lambda$0(agba agbaVar, aiqx aiqxVar) {
        aiqxVar.getClass();
        List<agee> declaredTypeParameters = agbaVar.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(declaredTypeParameters, 10));
        for (agee ageeVar : declaredTypeParameters) {
            ageeVar.getClass();
            arrayList.add(new afrv(aiqxVar, ageeVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List _get_mutableCollectionClass_$lambda$1(agba agbaVar, aiqx aiqxVar) {
        aiqxVar.getClass();
        Collection<aigl> collectionMo89getSupertypes = agbaVar.getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(collectionMo89getSupertypes, 10));
        Iterator<T> it = collectionMo89getSupertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(new aiqp((aigl) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List arguments_delegate$lambda$0(aiqp aiqpVar, afdr afdrVar) {
        List<aiin> arguments = aiqpVar.type.getArguments();
        if (arguments.isEmpty()) {
            return afbe.a;
        }
        ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
        int i = 0;
        for (Object obj : arguments) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            arrayList.add(aiqpVar.toKTypeProjection((aiin) obj, afdrVar == null ? null : afjz.convertTypeArgumentToJavaType(new aiqo(aiqpVar), i)));
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afhf classifier_delegate$lambda$0(aiqp aiqpVar) {
        return aiqpVar.convert(aiqpVar.type);
    }

    private final afhf convert(aigl aiglVar) {
        aigl type;
        if (this.isAbbreviation) {
            agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
            agda agdaVar = declarationDescriptor instanceof agda ? (agda) declarationDescriptor : null;
            if (agdaVar != null) {
                return new afru(ahvz.getFqNameSafe(agdaVar));
            }
        }
        agbd declarationDescriptor2 = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor2 instanceof agba) {
            Class<?> javaClass = afvu.toJavaClass((agba) declarationDescriptor2);
            if (javaClass != null) {
                if (!afye.isArray(aiglVar)) {
                    if (aijc.isNullableType(aiglVar)) {
                        return new afqw(javaClass);
                    }
                    Class<?> primitiveByWrapper = agkc.getPrimitiveByWrapper(javaClass);
                    if (primitiveByWrapper != null) {
                        javaClass = primitiveByWrapper;
                    }
                    return new afqw(javaClass);
                }
                aiin aiinVar = (aiin) woy.bP(aiglVar.getArguments());
                if (aiinVar == null || (type = aiinVar.getType()) == null) {
                    return new afqw(javaClass);
                }
                afhf afhfVarConvert = convert(aimr.makeNullable(type));
                if (afhfVarConvert != null) {
                    return new afqw(afvu.createArrayType(affa.i(afir.e(afhfVarConvert))));
                }
                toString();
                throw new aftw("Cannot determine classifier for array element type: ".concat(toString()));
            }
        } else if (declarationDescriptor2 instanceof agee) {
            agee ageeVar = (agee) declarationDescriptor2;
            return new afrv(afrw.toContainer(ageeVar), ageeVar);
        }
        return null;
    }

    private final afid toKTypeProjection(aiin aiinVar, afdr<? extends Type> afdrVar) {
        if (aiinVar.isStarProjection()) {
            return afid.a;
        }
        aigl type = aiinVar.getType();
        type.getClass();
        aiqp aiqpVar = new aiqp(type, afdrVar);
        aijg projectionKind = aiinVar.getProjectionKind();
        aijg aijgVar = aijg.INVARIANT;
        int iOrdinal = projectionKind.ordinal();
        if (iOrdinal == 0) {
            afid afidVar = afid.a;
            return afik.f(aiqpVar);
        }
        if (iOrdinal == 1) {
            afid afidVar2 = afid.a;
            return afik.d(aiqpVar);
        }
        if (iOrdinal != 2) {
            throw new aezs();
        }
        afid afidVar3 = afid.a;
        return afik.e(aiqpVar);
    }

    @Override // defpackage.aiqc
    public boolean equals(Object obj) {
        if (!afvn.getUseK1Implementation()) {
            return super.equals(obj);
        }
        if (obj instanceof aiqp) {
            aiqp aiqpVar = (aiqp) obj;
            return affa.f(this.type, aiqpVar.type) && affa.f(getClassifier(), aiqpVar.getClassifier()) && affa.f(getArguments(), aiqpVar.getArguments());
        }
        return false;
    }

    @Override // defpackage.aiqc
    public afib getAbbreviation() {
        aigw abbreviation = aiha.getAbbreviation(this.type);
        if (abbreviation != null) {
            return new aiqp(abbreviation, getComputeJavaType(), true);
        }
        return null;
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return afvu.computeAnnotations(this.type);
    }

    @Override // defpackage.afib
    public List<afid> getArguments() {
        T value = this.arguments$delegate.getValue(this, $$delegatedProperties[1]);
        value.getClass();
        return (List) value;
    }

    @Override // defpackage.afib
    public afhf getClassifier() {
        return (afhf) this.classifier$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // defpackage.aiqc
    public afhe<?> getMutableCollectionClass() {
        agbd declarationDescriptor = this.type.getConstructor().getDeclarationDescriptor();
        agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
        if (agbaVar == null || !afzr.INSTANCE.isMutable(agbaVar)) {
            return null;
        }
        if (afvn.getUseK1Implementation()) {
            afhf classifier = getClassifier();
            classifier.getClass();
            return new aiqx((afhe) classifier, ahvz.getFqNameSafe(agbaVar).asString(), new aiqm(agbaVar), new aiqn(agbaVar));
        }
        ahnf fqNameSafe = ahvz.getFqNameSafe(agbaVar);
        afhf classifier2 = getClassifier();
        classifier2.getClass();
        return aira.getMutableCollectionKClass(fqNameSafe, (afhe) classifier2);
    }

    public final aigl getType() {
        return this.type;
    }

    @Override // defpackage.aiqc
    public int hashCode() {
        if (!afvn.getUseK1Implementation()) {
            return super.hashCode();
        }
        int iHashCode = this.type.hashCode() * 31;
        afhf classifier = getClassifier();
        return ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31) + getArguments().hashCode();
    }

    @Override // defpackage.aiqc
    public boolean isDefinitelyNotNullType() {
        return aiha.isDefinitelyNotNullType(this.type);
    }

    @Override // defpackage.afib
    public boolean isMarkedNullable() {
        return this.type.isMarkedNullable();
    }

    @Override // defpackage.aiqc
    public boolean isNothingType() {
        return afye.isNothingOrNullableNothing(this.type);
    }

    @Override // defpackage.aiqc
    public boolean isRawType() {
        return this.type instanceof agzc;
    }

    @Override // defpackage.aiqc
    public boolean isSuspendFunctionType() {
        return afxy.isSuspendFunctionType(this.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiqc
    public aiqc lowerBoundIfFlexible() {
        aijf aijfVarUnwrap = this.type.unwrap();
        afdr afdrVar = null;
        Object[] objArr = 0;
        if (aijfVarUnwrap instanceof aiga) {
            return new aiqp(((aiga) aijfVarUnwrap).getLowerBound(), afdrVar, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiqc
    public aiqc makeDefinitelyNotNullAsSpecified(boolean z) {
        aigw original;
        aigl aiglVar = this.type;
        afdr afdrVar = null;
        Object[] objArr = 0;
        if (z) {
            original = aifo.Companion.makeDefinitelyNotNull(aiglVar.unwrap(), true & ((4 & 2) == 0), false & ((4 & 4) == 0));
            if (original == null) {
                return this;
            }
        } else {
            aifo aifoVar = aiglVar instanceof aifo ? (aifo) aiglVar : null;
            if (aifoVar == null || (original = aifoVar.getOriginal()) == null) {
                return this;
            }
        }
        return new aiqp(original, afdrVar, 2, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiqc
    public aiqc makeNullableAsSpecified(boolean z) {
        if (!aige.isFlexible(this.type) && isMarkedNullable() == z) {
            return this;
        }
        aigl aiglVarMakeNullableAsSpecified = aijc.makeNullableAsSpecified(this.type, z);
        aiglVarMakeNullableAsSpecified.getClass();
        return new aiqp(aiglVarMakeNullableAsSpecified, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiqc
    public aiqc upperBoundIfFlexible() {
        aijf aijfVarUnwrap = this.type.unwrap();
        afdr afdrVar = null;
        Object[] objArr = 0;
        if (aijfVarUnwrap instanceof aiga) {
            return new aiqp(((aiga) aijfVarUnwrap).getUpperBound(), afdrVar, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    static /* synthetic */ aiqc accessor$DescriptorKType$lambda4(aiqp aiqpVar) {
        return aiqpVar;
    }

    private static final aiqc arguments_delegate$lambda$0$0$0(aiqp aiqpVar) {
        return aiqpVar;
    }

    public /* synthetic */ aiqp(aigl aiglVar, afdr afdrVar, int i, afeu afeuVar) {
        this(aiglVar, (i & 2) != 0 ? null : afdrVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aiqp(aigl aiglVar, afdr<? extends Type> afdrVar) {
        this(aiglVar, afdrVar, false);
        aiglVar.getClass();
    }
}
