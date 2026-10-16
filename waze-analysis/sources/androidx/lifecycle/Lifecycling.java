package androidx.lifecycle;

import h.g.b.x;
import h.n.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            GeneratedAdapter generatedAdapterNewInstance = constructor.newInstance(obj);
            x.c(generatedAdapterNewInstance);
            return generatedAdapterNewInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Package r4 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r4 != null ? r4.getName() : "";
            if (name == null) {
                x.g();
            }
            String str = name;
            if (str.length() != 0) {
                if (canonicalName == null) {
                    x.g();
                }
                canonicalName = canonicalName.substring(name.length() + 1);
                x.e(canonicalName, "substring(...)");
            }
            if (canonicalName == null) {
                x.g();
            }
            String adapterName = getAdapterName(canonicalName);
            if (str.length() != 0) {
                adapterName = name + "." + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            x.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final String getAdapterName(String str) {
        x.f(str, "className");
        return String.valueOf(o.ac(str, ".", "_")).concat("_LifecycleAdapter");
    }

    private final int getObserverConstructorType(Class<?> cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object obj) {
        x.f(obj, "object");
        boolean z = obj instanceof LifecycleEventObserver;
        boolean z2 = obj instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (LifecycleEventObserver) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, null);
        }
        if (z) {
            return (LifecycleEventObserver) obj;
        }
        Class<?> cls = obj.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
        if (list == null) {
            x.g();
        }
        List<Constructor<? extends GeneratedAdapter>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), obj));
        }
        int size = list2.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i2 = 0; i2 < size; i2++) {
            generatedAdapterArr[i2] = INSTANCE.createGeneratedAdapter(list2.get(i2), obj);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    private final int resolveObserverCallbackType(Class<?> cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (cls.getCanonicalName() != null) {
            Constructor<? extends GeneratedAdapter> constructorGeneratedConstructor = generatedConstructor(cls);
            if (constructorGeneratedConstructor != null) {
                Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> map = classToAdapters;
                List<Constructor<? extends GeneratedAdapter>> listSingletonList = Collections.singletonList(constructorGeneratedConstructor);
                x.e(listSingletonList, "singletonList(...)");
                map.put(cls, listSingletonList);
                return 2;
            }
            if (!ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (isLifecycleParent(superclass)) {
                    if (superclass == null) {
                        x.g();
                    }
                    if (getObserverConstructorType(superclass) != 1) {
                        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
                        if (list == null) {
                            x.g();
                        }
                        arrayList = new ArrayList(list);
                    }
                } else {
                    arrayList = null;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                x.e(interfaces, "getInterfaces(...)");
                int length = interfaces.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Class<?> cls2 = interfaces[i2];
                        if (isLifecycleParent(cls2)) {
                            if (cls2 == null) {
                                x.g();
                            }
                            if (getObserverConstructorType(cls2) == 1) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(cls2);
                            if (list2 == null) {
                                x.g();
                            }
                            arrayList.addAll(list2);
                        }
                        i2++;
                    } else if (arrayList != null) {
                        classToAdapters.put(cls, arrayList);
                        return 2;
                    }
                }
            }
        }
        return 1;
    }
}
