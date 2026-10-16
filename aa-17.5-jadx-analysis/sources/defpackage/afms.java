package defpackage;

import defpackage.afmr;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afms<T extends afmr> {
    private final T equalityMode;
    private final boolean isStatic;
    private final List<Type> javaGenericParameterTypesIfFunction;
    private final List<Class<?>> javaParameterTypesIfFunction;
    private final String jvmNameIfFunction;
    private final afvk kind;
    private final List<afib> kotlinParameterTypes;
    private final String name;
    private final List<afic> typeParameters;

    /* JADX WARN: Multi-variable type inference failed */
    public afms(afvk afvkVar, String str, String str2, List<? extends afic> list, List<? extends afib> list2, List<? extends Class<?>> list3, List<? extends Type> list4, boolean z, T t) {
        afvkVar.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        t.getClass();
        this.kind = afvkVar;
        this.name = str;
        this.jvmNameIfFunction = str2;
        this.typeParameters = list;
        this.kotlinParameterTypes = list2;
        this.javaParameterTypesIfFunction = list3;
        this.javaGenericParameterTypesIfFunction = list4;
        this.isStatic = z;
        this.equalityMode = t;
        if (afvkVar != afvk.FIELD_IN_JAVA_CLASS || (list2.isEmpty() && list.isEmpty() && list3.isEmpty())) {
            if (list3.size() == list4.size()) {
                return;
            }
            throw new IllegalStateException("javaParameterTypesIfFunction.size (" + list3.size() + ") and javaGenericParameterTypesIfFunction.size (" + list4.size() + ") must be equal. For member: '" + str + '\'');
        }
        throw new IllegalStateException("Inconsistent combination of EquatableCallableSignature values. kind: " + afvkVar + ", kotlinParameterTypes.isEmpty(): " + list2.isEmpty() + ",typeParameters.isEmpty(): " + list.isEmpty() + ", javaParameterTypesIfFunction.isEmpty(): " + list3.isEmpty() + ".For member: '" + str + '\'');
    }

    public boolean equals(Object obj) {
        aiqu aiquVarSubstitutedWith;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afms)) {
            return false;
        }
        afms afmsVar = (afms) obj;
        if (!affa.f(this.equalityMode, afmsVar.equalityMode)) {
            throw new IllegalStateException("Equality modes must be the same for member '" + this.name + "'. Please recreate signatures on inheritance");
        }
        if (this.kind != afmsVar.kind || this.isStatic != afmsVar.isStatic || this.kotlinParameterTypes.size() != afmsVar.kotlinParameterTypes.size()) {
            return false;
        }
        if (affa.f(this.equalityMode, afmp.INSTANCE) && this.kind == afvk.FUNCTION) {
            if (!affa.f(this.jvmNameIfFunction, afmsVar.jvmNameIfFunction) || this.javaParameterTypesIfFunction.size() != afmsVar.javaParameterTypesIfFunction.size()) {
                return false;
            }
            List<Class<?>> list = this.javaParameterTypesIfFunction;
            List<afib> list2 = this.kotlinParameterTypes;
            int size = list.size();
            int size2 = list2.size();
            List<Class<?>> list3 = this.javaParameterTypesIfFunction;
            if (size != size2) {
                throw new IllegalStateException("javaParameterTypesIfFunction.size (" + list3.size() + ") and kotlinParameterTypes.size (" + this.kotlinParameterTypes.size() + ") must be equal for member '" + this.name + '\'');
            }
            int size3 = list3.size();
            for (int i = 0; i < size3; i++) {
                Type type = this.javaGenericParameterTypesIfFunction.get(i);
                Class<?> cls = this.javaParameterTypesIfFunction.get(i);
                Type type2 = afmsVar.javaGenericParameterTypesIfFunction.get(i);
                Class<?> cls2 = afmsVar.javaParameterTypesIfFunction.get(i);
                TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                boolean z = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                boolean z2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                if (z || z2) {
                    if (cls.isPrimitive() != cls2.isPrimitive() || !afmz.areEqualKTypes(afmz.coerceFlexibleTypesAndMutabilityRecursive(this.kotlinParameterTypes.get(i), this.name), afmz.coerceFlexibleTypesAndMutabilityRecursive(afmsVar.kotlinParameterTypes.get(i), afmsVar.name))) {
                        return false;
                    }
                } else if (!affa.f(cls, cls2)) {
                    return false;
                }
            }
        } else {
            if (!affa.f(this.name, afmsVar.name) || (aiquVarSubstitutedWith = afmz.substitutedWith(this.typeParameters, afmsVar.typeParameters)) == null) {
                return false;
            }
            int size4 = this.typeParameters.size();
            for (int i2 = 0; i2 < size4; i2++) {
                afic aficVar = this.typeParameters.get(i2);
                afic aficVar2 = afmsVar.typeParameters.get(i2);
                if (aficVar.getUpperBounds().size() != aficVar2.getUpperBounds().size()) {
                    return false;
                }
                List<afib> upperBounds = aficVar.getUpperBounds();
                ArrayList arrayList = new ArrayList(woy.bp(upperBounds, 10));
                Iterator<T> it = upperBounds.iterator();
                while (it.hasNext()) {
                    afib afibVar = aiqu.substitute$default(aiquVarSubstitutedWith, (afib) it.next(), null, 2, null).c;
                    if (afibVar == null) {
                        afmz.starProjectionInTopLevelTypeIsNotPossible(this.name);
                        throw new aezp();
                    }
                    arrayList.add(afibVar);
                }
                List<aezu> listCi = woy.ci(afmz.sortedUpperBounds(arrayList, this.name), afmz.sortedUpperBounds(aficVar2.getUpperBounds(), afmsVar.name));
                if (!listCi.isEmpty()) {
                    for (aezu aezuVar : listCi) {
                        if (!afmz.areEqualKTypes((afib) aezuVar.a, (afib) aezuVar.b)) {
                            return false;
                        }
                    }
                }
            }
            int size5 = this.kotlinParameterTypes.size();
            for (int i3 = 0; i3 < size5; i3++) {
                afib afibVar2 = aiqu.substitute$default(aiquVarSubstitutedWith, this.kotlinParameterTypes.get(i3), null, 2, null).c;
                if (afibVar2 == null) {
                    afmz.starProjectionInTopLevelTypeIsNotPossible(this.name);
                    throw new aezp();
                }
                if (!afmz.areEqualKTypes(afibVar2, afmsVar.kotlinParameterTypes.get(i3))) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        if (!affa.f(this.equalityMode, afmp.INSTANCE) || this.kind != afvk.FUNCTION) {
            return Arrays.hashCode(new Object[]{this.kind, Integer.valueOf(this.kotlinParameterTypes.size()), Boolean.valueOf(this.isStatic), this.name});
        }
        afvk afvkVar = this.kind;
        Integer numValueOf = Integer.valueOf(this.kotlinParameterTypes.size());
        Boolean boolValueOf = Boolean.valueOf(this.isStatic);
        String str = this.jvmNameIfFunction;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{afvkVar, numValueOf, boolValueOf, str});
    }

    public String toString() {
        return "EquatableCallableSignature(kind=" + this.kind + ", name=" + this.name + ", jvmNameIfFunction=" + this.jvmNameIfFunction + ", typeParameters=" + this.typeParameters + ", kotlinParameterTypes=" + this.kotlinParameterTypes + ", javaParameterTypesIfFunction=" + this.javaParameterTypesIfFunction + ", javaGenericParameterTypesIfFunction=" + this.javaGenericParameterTypesIfFunction + ", isStatic=" + this.isStatic + ", equalityMode=" + this.equalityMode + ')';
    }

    public final <T extends afmr> afms<T> withEqualityMode(T t) {
        t.getClass();
        return new afms<>(this.kind, this.name, this.jvmNameIfFunction, this.typeParameters, this.kotlinParameterTypes, this.javaParameterTypesIfFunction, this.javaGenericParameterTypesIfFunction, this.isStatic, t);
    }
}
