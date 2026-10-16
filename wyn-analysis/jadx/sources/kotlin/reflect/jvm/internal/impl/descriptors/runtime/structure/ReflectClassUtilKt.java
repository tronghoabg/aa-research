package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import Fe.b;
import Va.M6;
import ef.C2527k;
import ef.InterfaceC2521e;
import ff.AbstractC2640A;
import ff.p;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.a;
import tf.c;
import tf.d;
import tf.e;
import tf.f;
import tf.g;
import tf.h;
import tf.i;
import tf.j;
import tf.k;
import tf.l;
import tf.m;
import tf.n;
import tf.o;
import tf.q;
import tf.r;
import tf.s;
import tf.t;
import tf.u;
import tf.v;
import tf.w;

/* loaded from: classes5.dex */
public final class ReflectClassUtilKt {

    @NotNull
    private static final Map<Class<? extends InterfaceC2521e>, Integer> FUNCTION_CLASSES;

    @NotNull
    private static final List<KClass<? extends Object>> PRIMITIVE_CLASSES;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> PRIMITIVE_TO_WRAPPER;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> WRAPPER_TO_PRIMITIVE;

    static {
        int i5 = 0;
        I i10 = H.f39741a;
        List<KClass<? extends Object>> listD = AbstractC3935e.D(i10.getOrCreateKotlinClass(Boolean.TYPE), i10.getOrCreateKotlinClass(Byte.TYPE), i10.getOrCreateKotlinClass(Character.TYPE), i10.getOrCreateKotlinClass(Double.TYPE), i10.getOrCreateKotlinClass(Float.TYPE), i10.getOrCreateKotlinClass(Integer.TYPE), i10.getOrCreateKotlinClass(Long.TYPE), i10.getOrCreateKotlinClass(Short.TYPE));
        PRIMITIVE_CLASSES = listD;
        List<KClass<? extends Object>> list = listD;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(new C2527k(b.z(kClass), b.A(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = AbstractC2640A.X(arrayList);
        List<KClass<? extends Object>> list2 = PRIMITIVE_CLASSES;
        ArrayList arrayList2 = new ArrayList(p.a0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(new C2527k(b.A(kClass2), b.z(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = AbstractC2640A.X(arrayList2);
        List listD2 = AbstractC3935e.D(a.class, l.class, tf.p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, tf.b.class, c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList3 = new ArrayList(p.a0(listD2, 10));
        for (Object obj : listD2) {
            int i11 = i5 + 1;
            if (i5 < 0) {
                AbstractC3935e.P();
                throw null;
            }
            arrayList3.add(new C2527k((Class) obj, Integer.valueOf(i5)));
            i5 = i11;
        }
        FUNCTION_CLASSES = AbstractC2640A.X(arrayList3);
    }

    @NotNull
    public static final ClassId getClassId(@NotNull Class<?> cls) {
        ClassId classIdCreateNestedClassId;
        ClassId classId;
        AbstractC3340k.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(M6.n(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(M6.n(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.parent(), FqName.topLevel(fqName.shortName()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null || (classId = getClassId(declaringClass)) == null || (classIdCreateNestedClassId = classId.createNestedClassId(Name.identifier(cls.getSimpleName()))) == null) {
            classIdCreateNestedClassId = ClassId.topLevel(new FqName(cls.getName()));
        }
        AbstractC3340k.b(classIdCreateNestedClassId);
        return classIdCreateNestedClassId;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @NotNull
    public static final String getDesc(@NotNull Class<?> cls) {
        AbstractC3340k.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return Bf.r.i0(cls.getName(), '.', '/');
            }
            return "L" + Bf.r.i0(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(M6.n(cls, "Unsupported primitive type: "));
    }

    @Nullable
    public static final Integer getFunctionClassArity(@NotNull Class<?> cls) {
        AbstractC3340k.e(cls, "<this>");
        return FUNCTION_CLASSES.get(cls);
    }

    @NotNull
    public static final List<Type> getParameterizedTypeArguments(@NotNull Type type) {
        AbstractC3340k.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return ff.v.f35432a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return Af.n.e0(Af.n.Y(Af.n.a0(type, ReflectClassUtilKt$parameterizedTypeArguments$1.INSTANCE), ReflectClassUtilKt$parameterizedTypeArguments$2.INSTANCE));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC3340k.d(actualTypeArguments, "getActualTypeArguments(...)");
        return ff.m.L0(actualTypeArguments);
    }

    @Nullable
    public static final Class<?> getPrimitiveByWrapper(@NotNull Class<?> cls) {
        AbstractC3340k.e(cls, "<this>");
        return WRAPPER_TO_PRIMITIVE.get(cls);
    }

    @NotNull
    public static final ClassLoader getSafeClassLoader(@NotNull Class<?> cls) {
        AbstractC3340k.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC3340k.d(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    @Nullable
    public static final Class<?> getWrapperByPrimitive(@NotNull Class<?> cls) {
        AbstractC3340k.e(cls, "<this>");
        return PRIMITIVE_TO_WRAPPER.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(@NotNull Class<?> cls) {
        AbstractC3340k.e(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
