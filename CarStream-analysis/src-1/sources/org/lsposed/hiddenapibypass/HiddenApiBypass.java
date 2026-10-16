package org.lsposed.hiddenapibypass;

import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.lsposed.hiddenapibypass.Helper;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class HiddenApiBypass {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "HiddenApiBypass";
    private static final long artFieldBias;
    private static final long artFieldSize;
    private static final long artMethodBias;
    private static final long artMethodSize;
    private static final long artOffset;
    private static final long classOffset;
    private static final long iFieldOffset;
    private static final long methodOffset;
    private static final long methodsOffset;
    private static final long sFieldOffset;
    private static final Unsafe unsafe;

    static {
        long jObjectFieldOffset;
        long jObjectFieldOffset2;
        try {
            Unsafe unsafe2 = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            unsafe = unsafe2;
            CoreOjClassLoader coreOjClassLoader = new CoreOjClassLoader();
            Class<?> clsLoadClass = coreOjClassLoader.loadClass(Executable.class.getName());
            Class<?> clsLoadClass2 = coreOjClassLoader.loadClass(MethodHandle.class.getName());
            Class<?> clsLoadClass3 = coreOjClassLoader.loadClass(Class.class.getName());
            methodOffset = unsafe2.objectFieldOffset(clsLoadClass.getDeclaredField("artMethod"));
            classOffset = unsafe2.objectFieldOffset(clsLoadClass.getDeclaredField("declaringClass"));
            artOffset = unsafe2.objectFieldOffset(clsLoadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                jObjectFieldOffset = unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("fields"));
                jObjectFieldOffset2 = jObjectFieldOffset;
            } catch (NoSuchFieldException unused) {
                Unsafe unsafe3 = unsafe;
                jObjectFieldOffset = unsafe3.objectFieldOffset(clsLoadClass3.getDeclaredField("iFields"));
                jObjectFieldOffset2 = unsafe3.objectFieldOffset(clsLoadClass3.getDeclaredField("sFields"));
            }
            iFieldOffset = jObjectFieldOffset;
            sFieldOffset = jObjectFieldOffset2;
            Unsafe unsafe4 = unsafe;
            long jObjectFieldOffset3 = unsafe4.objectFieldOffset(clsLoadClass3.getDeclaredField("methods"));
            methodsOffset = jObjectFieldOffset3;
            Method declaredMethod = Helper.NeverCall.class.getDeclaredMethod("a", null);
            Method declaredMethod2 = Helper.NeverCall.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = artOffset;
            long j2 = unsafe4.getLong(methodHandleUnreflect, j);
            long j3 = unsafe4.getLong(methodHandleUnreflect2, j);
            long j4 = unsafe4.getLong(Helper.NeverCall.class, jObjectFieldOffset3);
            long j5 = j3 - j2;
            artMethodSize = j5;
            artMethodBias = (j2 - j4) - j5;
            Field declaredField = Helper.NeverCall.class.getDeclaredField("i");
            Field declaredField2 = Helper.NeverCall.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j6 = unsafe4.getLong(methodHandleUnreflectGetter, j);
            long j7 = unsafe4.getLong(methodHandleUnreflectGetter2, j);
            long j8 = unsafe4.getLong(Helper.NeverCall.class, jObjectFieldOffset);
            artFieldSize = j7 - j6;
            artFieldBias = j6 - j8;
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static boolean addHiddenApiExemptions(String... strArr) {
        Set<String> set = Helper.signaturePrefixes;
        set.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[set.size()];
        set.toArray(strArr2);
        return setHiddenApiExemptions(strArr2);
    }

    public static boolean clearHiddenApiExemptions() {
        Helper.signaturePrefixes.clear();
        return setHiddenApiExemptions(new String[0]);
    }

    public static Constructor<?> getDeclaredConstructor(Class<?> cls, Class<?>... clsArr) throws NoSuchMethodException {
        for (Executable executable : getDeclaredMethods(cls)) {
            if (executable instanceof Constructor) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i = 0; i < clsArr.length; i++) {
                        if (clsArr[i] != parameterTypes[i]) {
                            break;
                        }
                    }
                    return (Constructor) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static Method getDeclaredMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Executable executable : getDeclaredMethods(cls)) {
            if (executable.getName().equals(str) && (executable instanceof Method)) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i = 0; i < clsArr.length; i++) {
                        if (clsArr[i] != parameterTypes[i]) {
                            break;
                        }
                    }
                    return (Method) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static List<Executable> getDeclaredMethods(Class<?> cls) throws IllegalAccessException, NoSuchMethodException, SecurityException {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.EMPTY_LIST;
        }
        try {
            Method declaredMethod = Helper.NeverCall.class.getDeclaredMethod("a", null);
            declaredMethod.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            Unsafe unsafe2 = unsafe;
            long j = unsafe2.getLong(cls, methodsOffset);
            if (j == 0) {
                return Collections.EMPTY_LIST;
            }
            int i = unsafe2.getInt(j);
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                unsafe.putLong(methodHandleUnreflect, artOffset, artMethodBias + (i2 * artMethodSize) + j);
                arrayList.add((Executable) MethodHandles.reflectAs(Executable.class, methodHandleUnreflect));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public static List<Field> getInstanceFields(Class<?> cls) throws IllegalAccessException, NoSuchFieldException, SecurityException {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.EMPTY_LIST;
        }
        try {
            Field declaredField = Helper.NeverCall.class.getDeclaredField("i");
            declaredField.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            Unsafe unsafe2 = unsafe;
            long j = unsafe2.getLong(cls, iFieldOffset);
            if (j == 0) {
                return Collections.EMPTY_LIST;
            }
            int i = unsafe2.getInt(j);
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                unsafe.putLong(methodHandleUnreflectGetter, artOffset, artFieldBias + (i2 * artFieldSize) + j);
                Field field = (Field) MethodHandles.reflectAs(Field.class, methodHandleUnreflectGetter);
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public static List<Field> getStaticFields(Class<?> cls) throws IllegalAccessException, NoSuchFieldException, SecurityException {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.EMPTY_LIST;
        }
        try {
            Field declaredField = Helper.NeverCall.class.getDeclaredField("s");
            declaredField.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            Unsafe unsafe2 = unsafe;
            long j = unsafe2.getLong(cls, sFieldOffset);
            if (j == 0) {
                return Collections.EMPTY_LIST;
            }
            int i = unsafe2.getInt(j);
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                unsafe.putLong(methodHandleUnreflectGetter, artOffset, artFieldBias + (i2 * artFieldSize) + j);
                Field field = (Field) MethodHandles.reflectAs(Field.class, methodHandleUnreflectGetter);
                if (Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public static Object invoke(Class<?> cls, Object obj, String str, Object... objArr) throws NoSuchMethodException, SecurityException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = Helper.InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe2 = unsafe;
        long j = unsafe2.getLong(cls, methodsOffset);
        if (j == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i = unsafe2.getInt(j);
        for (int i2 = 0; i2 < i; i2++) {
            unsafe.putLong(declaredMethod, methodOffset, artMethodBias + (i2 * artMethodSize) + j);
            if (str.equals(declaredMethod.getName()) && Helper.checkArgsForInvokeMethod(declaredMethod.getParameterTypes(), objArr)) {
                return declaredMethod.invoke(obj, objArr);
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static Object newInstance(Class<?> cls, Object... objArr) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        Method declaredMethod = Helper.InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        Constructor declaredConstructor = Helper.InvokeStub.class.getDeclaredConstructor(Object[].class);
        declaredConstructor.setAccessible(true);
        Unsafe unsafe2 = unsafe;
        long j = unsafe2.getLong(cls, methodsOffset);
        if (j == 0) {
            throw new NoSuchMethodException("Cannot find matching constructor");
        }
        int i = unsafe2.getInt(j);
        int i2 = 0;
        while (i2 < i) {
            long j2 = artMethodBias + (i2 * artMethodSize) + j;
            Unsafe unsafe3 = unsafe;
            long j3 = methodOffset;
            unsafe3.putLong(declaredMethod, j3, j2);
            if ("<init>".equals(declaredMethod.getName())) {
                constructor = declaredConstructor;
                unsafe3.putLong(constructor, j3, j2);
                unsafe3.putObject(constructor, classOffset, cls);
                if (Helper.checkArgsForInvokeMethod(constructor.getParameterTypes(), objArr)) {
                    return constructor.newInstance(objArr);
                }
            } else {
                constructor = declaredConstructor;
            }
            i2++;
            declaredConstructor = constructor;
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static boolean setHiddenApiExemptions(String... strArr) throws SecurityException {
        try {
            invoke(VMRuntime.class, invoke(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (ReflectiveOperationException unused) {
            return false;
        }
    }
}
