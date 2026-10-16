package androidx.car.app.managers;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ManagerCache {
    private final Map<Class<?>, Manager> mValues = new HashMap();
    private final Map<Class<?>, RuntimeException> mExceptions = new HashMap();
    private final Map<Class<?>, ManagerFactory<? extends Manager>> mFactories = new HashMap();
    private final Map<String, Class<?>> mClassByName = new HashMap();
    private final Map<Class<?>, String> mNameByClass = new HashMap();

    public <T extends Manager> void addFactory(Class<T> cls, String str, ManagerFactory<T> managerFactory) {
        this.mFactories.put(cls, managerFactory);
        if (str != null) {
            this.mClassByName.put(str, cls);
            this.mNameByClass.put(cls, str);
        }
    }

    public String getName(Class<?> cls) {
        String str = this.mNameByClass.get(cls);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("The class does not correspond to a car service");
    }

    public <T> T getOrCreate(Class<T> cls) {
        RuntimeException runtimeException = this.mExceptions.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        T t = (T) this.mValues.get(cls);
        if (t != null) {
            return t;
        }
        ManagerFactory<? extends Manager> managerFactory = this.mFactories.get(cls);
        if (managerFactory == null) {
            throw new IllegalArgumentException("The class '" + cls + "' does not correspond to a car service");
        }
        try {
            T t2 = (T) managerFactory.create();
            this.mValues.put(cls, t2);
            return t2;
        } catch (RuntimeException e2) {
            this.mExceptions.put(cls, e2);
            throw e2;
        }
    }

    public Object getOrCreate(String str) {
        Class<?> cls = this.mClassByName.get(str);
        if (cls != null) {
            return getOrCreate(cls);
        }
        throw new IllegalArgumentException("The name '" + str + "' does not correspond to a car service");
    }
}
