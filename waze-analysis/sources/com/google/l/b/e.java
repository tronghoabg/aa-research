package com.google.l.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12363a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12364b;

    public e(Map map, List list) {
        this.f12363a = map;
        this.f12364b = list;
    }

    static /* synthetic */ Object b(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw com.google.l.b.b.d.b(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + com.google.l.b.b.d.c(constructor) + "' with no args", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + com.google.l.b.b.d.c(constructor) + "' with no args", e4.getCause());
        }
    }

    static String c(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(String.valueOf(cls.getName()));
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + ac.a("r8-abstract-class");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.l.b.w a(com.google.l.c.a r10, boolean r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.b.e.a(com.google.l.c.a, boolean):com.google.l.b.w");
    }

    public final String toString() {
        return this.f12363a.toString();
    }
}
