package kotlin.reflect;

import Af.k;
import Af.n;
import Bf.r;
import E5.Q;
import Fe.b;
import com.applovin.shadow.okhttp3.HttpUrl;
import ff.o;
import ff.p;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.InterfaceC3341l;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0083\u0080\u0004\u001a$\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0083\u0080\u0004\u001a\u0012\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0082\u0080\u0004\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u000f8BX\u0083\u0084\b¢\u0006\f\u0012\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "computeJavaType", "forceWrapper", "", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "typeToString", "", "type", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypesJVMKt {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r9v9, types: [ef.i, java.lang.Object] */
    public static final Type computeJavaType(KType kType, boolean z2) {
        KClassifier classifier = kType.getClassifier();
        TypeVariable<?> typeVariable = null;
        if (classifier instanceof KTypeParameter) {
            if (!(classifier instanceof M)) {
                return new ObsoleteFallbackTypeVariableImpl((KTypeParameter) classifier);
            }
            M m10 = (M) classifier;
            GenericDeclaration genericDeclaration = (GenericDeclaration) m10.f39745b.getValue();
            if (genericDeclaration == null) {
                throw new UnsupportedOperationException("javaType is not supported for this type: " + kType);
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            AbstractC3340k.d(typeParameters, "getTypeParameters(...)");
            boolean z10 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (AbstractC3340k.a(typeVariable2.getName(), m10.f39746c)) {
                    if (z10) {
                        throw new IllegalArgumentException("Array contains more than one matching element.");
                    }
                    z10 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (!z10) {
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            AbstractC3340k.d(typeVariable, "single(...)");
            return typeVariable;
        }
        if (!(classifier instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) classifier;
        Class clsZ = z2 ? b.z(kClass) : b.y(kClass);
        List<KTypeProjection> arguments = kType.getArguments();
        if (arguments.isEmpty()) {
            return clsZ;
        }
        if (!clsZ.isArray()) {
            return createPossiblyInnerType(clsZ, arguments);
        }
        if (clsZ.getComponentType().isPrimitive()) {
            return clsZ;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) o.K0(arguments);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        KVariance variance = kTypeProjection.getVariance();
        KType type = kTypeProjection.getType();
        int i5 = variance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i5 == -1 || i5 == 1) {
            return clsZ;
        }
        if (i5 != 2 && i5 != 3) {
            throw new Q((byte) 0, 9);
        }
        AbstractC3340k.b(type);
        Type typeComputeJavaType$default = computeJavaType$default(type, false, 1, null);
        return typeComputeJavaType$default instanceof Class ? clsZ : new GenericArrayTypeImpl(typeComputeJavaType$default);
    }

    public static /* synthetic */ Type computeJavaType$default(KType kType, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z2 = false;
        }
        return computeJavaType(kType, z2);
    }

    private static final Type createPossiblyInnerType(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(p.a0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(p.a0(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeCreatePossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(p.a0(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeCreatePossiblyInnerType, arrayList3);
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType) {
        Type javaType;
        AbstractC3340k.e(kType, "<this>");
        return (!(kType instanceof InterfaceC3341l) || (javaType = ((InterfaceC3341l) kType).getJavaType()) == null) ? computeJavaType$default(kType, false, 1, null) : javaType;
    }

    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        k kVarA0 = n.a0(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = kVarA0.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb2.append(((Class) next).getName());
        sb2.append(r.g0(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, n.T(kVarA0)));
        return sb2.toString();
    }

    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }

    private static final Type getJavaType(KTypeProjection kTypeProjection) {
        KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KType type = kTypeProjection.getType();
        AbstractC3340k.b(type);
        int i5 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i5 == 1) {
            return new WildcardTypeImpl(null, computeJavaType(type, true));
        }
        if (i5 == 2) {
            return computeJavaType(type, true);
        }
        if (i5 == 3) {
            return new WildcardTypeImpl(computeJavaType(type, true), null);
        }
        throw new Q((byte) 0, 9);
    }
}
