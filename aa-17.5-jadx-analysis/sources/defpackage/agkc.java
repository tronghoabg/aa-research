package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class agkc {
    private static final Map<Class<? extends aezn<?>>, Integer> FUNCTION_CLASSES;
    private static final List<afhe<?>> PRIMITIVE_CLASSES;
    private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER;
    private static final Map<Class<?>, Class<?>> WRAPPER_TO_PRIMITIVE;

    static {
        int i = 0;
        List<afhe<?>> listBi = woy.bi(affw.b(Boolean.TYPE), affw.b(Byte.TYPE), affw.b(Character.TYPE), affw.b(Double.TYPE), affw.b(Float.TYPE), affw.b(Integer.TYPE), affw.b(Long.TYPE), affw.b(Short.TYPE));
        PRIMITIVE_CLASSES = listBi;
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(listBi, 10)), 16));
        Iterator<T> it = listBi.iterator();
        while (it.hasNext()) {
            afhe afheVar = (afhe) it.next();
            aezu aezuVar = new aezu(affa.i(afheVar), affa.j(afheVar));
            linkedHashMap.put(aezuVar.a, aezuVar.b);
        }
        WRAPPER_TO_PRIMITIVE = linkedHashMap;
        List<afhe<?>> list = PRIMITIVE_CLASSES;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(afpt.e(woy.aV(woy.bp(list, 10)), 16));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            afhe afheVar2 = (afhe) it2.next();
            aezu aezuVar2 = new aezu(affa.j(afheVar2), affa.i(afheVar2));
            linkedHashMap2.put(aezuVar2.a, aezuVar2.b);
        }
        PRIMITIVE_TO_WRAPPER = linkedHashMap2;
        List listBi2 = woy.bi(afdr.class, afec.class, afeg.class, afeh.class, afei.class, afej.class, afek.class, afel.class, afem.class, afen.class, afds.class, afdt.class, afdu.class, afdv.class, afdw.class, afdx.class, afdy.class, afdz.class, afea.class, afeb.class, afed.class, afee.class, afef.class);
        ArrayList arrayList = new ArrayList(woy.bp(listBi2, 10));
        for (Object obj : listBi2) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            arrayList.add(new aezu((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        FUNCTION_CLASSES = woy.bc(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType _get_parameterizedTypeArguments_$lambda$0(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final airp _get_parameterizedTypeArguments_$lambda$1(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return woy.dk(actualTypeArguments);
    }

    public static final ahnd getClassId(Class<?> cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            Objects.toString(cls);
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: ".concat(cls.toString()));
        }
        if (cls.isArray()) {
            Objects.toString(cls);
            throw new IllegalArgumentException("Can't compute ClassId for array type: ".concat(cls.toString()));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            simpleName.getClass();
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null) {
                    return getClassId(declaringClass).createNestedClassId(ahnj.identifier(cls.getSimpleName()));
                }
                ahnc ahncVar = ahnd.Companion;
                String name = cls.getName();
                name.getClass();
                return ahncVar.topLevel(new ahnf(name));
            }
        }
        String name2 = cls.getName();
        name2.getClass();
        ahnf ahnfVar = new ahnf(name2);
        return new ahnd(ahnfVar.parent(), ahnf.Companion.topLevel(ahnfVar.shortName()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String getDesc(Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                name.getClass();
                return afyh.I(name, '.', '/');
            }
            StringBuilder sb = new StringBuilder("L");
            String name2 = cls.getName();
            name2.getClass();
            sb.append(afyh.I(name2, '.', '/'));
            sb.append(';');
            return sb.toString();
        }
        String name3 = cls.getName();
        if (name3 != null) {
            switch (name3.hashCode()) {
                case -1325958191:
                    if (name3.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name3.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name3.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name3.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name3.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name3.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name3.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name3.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name3.equals("short")) {
                        return "S";
                    }
                    break;
            }
        }
        Objects.toString(cls);
        throw new IllegalArgumentException("Unsupported primitive type: ".concat(cls.toString()));
    }

    public static final Integer getFunctionClassArity(Class<?> cls) {
        cls.getClass();
        return FUNCTION_CLASSES.get(cls);
    }

    public static final List<Type> getParameterizedTypeArguments(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return afbe.a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return afrg.j(afrg.o(afrg.f(type, agka.INSTANCE), agkb.INSTANCE));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return woy.df(actualTypeArguments);
    }

    public static final Class<?> getPrimitiveByWrapper(Class<?> cls) {
        cls.getClass();
        return WRAPPER_TO_PRIMITIVE.get(cls);
    }

    public static final ClassLoader getSafeClassLoader(Class<?> cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    public static final Class<?> getWrapperByPrimitive(Class<?> cls) {
        cls.getClass();
        return PRIMITIVE_TO_WRAPPER.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(Class<?> cls) {
        cls.getClass();
        return Enum.class.isAssignableFrom(cls);
    }
}
