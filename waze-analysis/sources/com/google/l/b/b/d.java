package com.google.l.b.b;

import com.google.l.b.ac;
import com.google.l.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final a f12345a;

    static {
        a bVar;
        try {
            bVar = new c();
        } catch (ReflectiveOperationException unused) {
            bVar = new b();
        }
        f12345a = bVar;
    }

    static /* bridge */ /* synthetic */ RuntimeException a(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException b(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String c(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        n(constructor, sb);
        return sb.toString();
    }

    public static String d(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String e(AccessibleObject accessibleObject, boolean z) {
        String strConcat;
        if (accessibleObject instanceof Field) {
            strConcat = "field '" + d((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            n(method, sb);
            String string = sb.toString();
            strConcat = "method '" + method.getDeclaringClass().getName() + "#" + string + "'";
        } else if (accessibleObject instanceof Constructor) {
            strConcat = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            strConcat = "<unknown AccessibleObject> ".concat(String.valueOf(accessibleObject.toString()));
        }
        if (!z || !Character.isLowerCase(strConcat.charAt(0))) {
            return strConcat;
        }
        return Character.toUpperCase(strConcat.charAt(0)) + strConcat.substring(1);
    }

    public static String f(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e2) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e2.getMessage() + m(e2);
        }
    }

    public static Constructor g(Class cls) {
        return f12345a.a(cls);
    }

    public static Method h(Class cls, Field field) {
        return f12345a.b(cls, field);
    }

    public static void i(AccessibleObject accessibleObject) throws SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            throw new j("Failed making " + e(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + m(e2), e2);
        }
    }

    public static boolean j(Class cls) {
        if (Modifier.isStatic(cls.getModifiers())) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean k(Class cls) {
        return f12345a.c(cls);
    }

    public static String[] l(Class cls) {
        return f12345a.d(cls);
    }

    private static String m(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee ".concat(ac.a((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson"));
    }

    private static void n(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i2].getSimpleName());
        }
        sb.append(')');
    }
}
