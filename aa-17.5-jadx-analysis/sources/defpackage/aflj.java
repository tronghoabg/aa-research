package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class aflj extends aful {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aflj.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new affn(aflj.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    private final afup annotations$delegate;
    private final afko<?> callable;
    private final afup descriptor$delegate;
    private final int index;
    private final afhq kind;

    public aflj(afko<?> afkoVar, int i, afhq afhqVar, afdr<? extends agdk> afdrVar) {
        afkoVar.getClass();
        afhqVar.getClass();
        afdrVar.getClass();
        this.callable = afkoVar;
        this.index = i;
        this.kind = afhqVar;
        this.descriptor$delegate = afus.lazySoft(afdrVar);
        this.annotations$delegate = afus.lazySoft(new aflh(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type _get_type_$lambda$0(aflj afljVar) {
        agdk descriptor = afljVar.getDescriptor();
        if (!(descriptor instanceof agdq) || !affa.f(afvu.getInstanceReceiverParameter(afljVar.getCallable()), descriptor) || (!afljVar.getCallable().getOverriddenStorage().isFakeOverride() && afljVar.getCallable().getDescriptor().getKind() != agaw.FAKE_OVERRIDE)) {
            return afljVar.getCallable().getCaller().getParameterTypes().get(afljVar.getIndex());
        }
        afrj container = afljVar.getCallable().getContainer();
        afqw afqwVar = container instanceof afqw ? (afqw) container : null;
        if (afqwVar != null) {
            return affa.h(afqwVar);
        }
        Objects.toString(descriptor);
        throw new aftw("Cannot determine receiver Java type of inherited declaration: ".concat(descriptor.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List annotations_delegate$lambda$0(aflj afljVar) {
        return afvu.computeAnnotations(afljVar.getDescriptor());
    }

    private final agdk getDescriptor() {
        T value = this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (agdk) value;
    }

    @Override // defpackage.aful, defpackage.afhc
    public List<Annotation> getAnnotations() {
        T value = this.annotations$delegate.getValue(this, $$delegatedProperties[1]);
        value.getClass();
        return (List) value;
    }

    @Override // defpackage.aful
    public boolean getDeclaresDefaultValue() {
        agdk descriptor = getDescriptor();
        agel agelVar = descriptor instanceof agel ? (agel) descriptor : null;
        return agelVar != null && agelVar.declaresDefaultValue();
    }

    @Override // defpackage.afhr
    public int getIndex() {
        return this.index;
    }

    @Override // defpackage.afhr
    public afhq getKind() {
        return this.kind;
    }

    @Override // defpackage.afhr
    public String getName() {
        agdk descriptor = getDescriptor();
        agel agelVar = descriptor instanceof agel ? (agel) descriptor : null;
        if (agelVar != null && !agelVar.getContainingDeclaration().hasSynthesizedParameterNames()) {
            ahnj name = agelVar.getName();
            name.getClass();
            if (!name.isSpecial()) {
                return name.asString();
            }
        }
        return null;
    }

    @Override // defpackage.afhr
    public afib getType() {
        aigl type = getDescriptor().getType();
        type.getClass();
        aiqp aiqpVar = new aiqp(type, new afli(this));
        if (getKind().ordinal() == 0) {
            return aiqpVar;
        }
        afib afibVar = aiqu.substitute$default(getCallable().getOverriddenStorage().getTypeSubstitutor(getCallable().getTypeParameters(), getCallable().getName()), aiqpVar, null, 2, null).c;
        if (afibVar != null) {
            return afibVar;
        }
        afmz.starProjectionInTopLevelTypeIsNotPossible(getCallable().getName());
        throw new aezp();
    }

    @Override // defpackage.afhr
    public boolean isOptional() {
        agdk descriptor = getDescriptor();
        agel agelVar = descriptor instanceof agel ? (agel) descriptor : null;
        if (agelVar != null) {
            return ahvz.declaresOrInheritsDefaultValue(agelVar);
        }
        return false;
    }

    @Override // defpackage.afhr
    public boolean isVararg() {
        agdk descriptor = getDescriptor();
        return (descriptor instanceof agel) && ((agel) descriptor).getVarargElementType() != null;
    }

    @Override // defpackage.aful
    public afko<?> getCallable() {
        return this.callable;
    }
}
