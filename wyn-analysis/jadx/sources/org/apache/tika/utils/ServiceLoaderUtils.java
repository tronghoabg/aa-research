package org.apache.tika.utils;

import A0.f;
import j$.util.List;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.apache.tika.config.ServiceLoader;

/* loaded from: classes5.dex */
public class ServiceLoaderUtils {
    public static <T> T newInstance(String str) {
        return (T) newInstance(str, ServiceLoader.class.getClassLoader());
    }

    public static <T> void sortLoadedClasses(List<T> list) {
        List.EL.sort(list, new f(29));
    }

    public static <T> T newInstance(String str, ClassLoader classLoader) {
        try {
            return (T) Class.forName(str, true, classLoader).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static <T> T newInstance(Class cls, ServiceLoader serviceLoader) {
        try {
            try {
                try {
                    return cls.getDeclaredConstructor(ServiceLoader.class).newInstance(serviceLoader);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
                    e = e7;
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException e10) {
                e = e10;
                throw new RuntimeException(e);
            }
        } catch (NoSuchMethodException unused) {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
