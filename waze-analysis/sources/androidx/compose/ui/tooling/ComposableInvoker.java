package androidx.compose.ui.tooling;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.tooling.PreviewLogger;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.aj;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ComposableInvoker {
    public static final int $stable = 0;
    private static final int BITS_PER_INT = 31;
    public static final ComposableInvoker INSTANCE = new ComposableInvoker();
    private static final int SLOTS_PER_INT = 10;

    private ComposableInvoker() {
    }

    private final boolean areParameterTypesCompatible(Class<?>[] clsArr, Class<?>[] clsArr2) {
        int length = clsArr.length;
        if (length != clsArr2.length) {
            return false;
        }
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= length) {
                break;
            }
            Class<?> cls = clsArr[i2];
            int i4 = i3 + 1;
            Class<?> cls2 = clsArr2[i3];
            if (!x.n(o.y(cls), o.y(cls2)) && !cls.isAssignableFrom(cls2)) {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
            i2++;
            i3 = i4;
        }
        ArrayList arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return true;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    private final int changedParamCount(int i2, int i3) {
        if (i2 == 0) {
            return 1;
        }
        return (int) Math.ceil((i2 + i3) / 10.0d);
    }

    private final int defaultParamCount(int i2) {
        return (int) Math.ceil(i2 / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T[] dup(T t, int i2) {
        j jVarU = n.u(0, i2);
        ArrayList arrayList = new ArrayList(i.q(jVarU, 10));
        Iterator<Integer> it = jVarU.iterator();
        while (it.hasNext()) {
            ((aj) it).nextInt();
            arrayList.add(t);
        }
        x.i();
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private final Method findCompatibleComposeMethod(Method[] methodArr, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methodArr[i2];
            if (!x.n(str, method.getName())) {
                if (!h.n.o.ah(method.getName(), str + '-')) {
                    continue;
                }
                i2++;
            }
            if (INSTANCE.areParameterTypesCompatible(method.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                break;
            }
            i2++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(String.valueOf(str).concat(" not found"));
    }

    private final Method findComposableMethod(Class<?> cls, String str, Object... objArr) throws SecurityException {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i2++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iChangedParamCount = changedParamCount(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                j jVarU = n.u(0, iChangedParamCount);
                ArrayList arrayList2 = new ArrayList(i.q(jVarU, 10));
                Iterator<Integer> it = jVarU.iterator();
                while (it.hasNext()) {
                    ((aj) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                ArrayList arrayList3 = new ArrayList(3);
                x.q(clsArr, arrayList3);
                arrayList3.add(Composer.class);
                x.q(clsArr2, arrayList3);
                return findCompatibleComposeMethod(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!x.n(method.getName(), str)) {
                    if (!h.n.o.ah(method.getName(), str + '-')) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    private final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        if (name == null) {
            return null;
        }
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
                }
                return null;
            case 104431:
                return name.equals("int") ? 0 : null;
            case 3039496:
                return name.equals("byte") ? (byte) 0 : null;
            case 3052374:
                return name.equals("char") ? (char) 0 : null;
            case 3327612:
                return name.equals("long") ? 0L : null;
            case 64711720:
                return name.equals(TypedValues.Custom.S_BOOLEAN) ? false : null;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return name.equals("short") ? (short) 0 : null;
            default:
                return null;
        }
    }

    private final Object invokeComposableMethod(Method method, Object obj, Composer composer, Object... objArr) {
        Object defaultValue;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i2 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (x.n(parameterTypes[length], Composer.class)) {
                    i2 = length;
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                length = i3;
            }
        }
        int i4 = i2 + 1;
        int iChangedParamCount = changedParamCount(i2, obj != null ? 1 : 0) + i4;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iChangedParamCount ? defaultParamCount(i2) : 0) + iChangedParamCount != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        int i5 = 0;
        while (i5 < length2) {
            if (i5 >= 0 && i5 < i2) {
                defaultValue = i5 < objArr.length ? objArr[i5] : INSTANCE.getDefaultValue(method.getParameterTypes()[i5]);
            } else if (i5 == i2) {
                defaultValue = composer;
            } else if (i4 <= i5 && i5 < iChangedParamCount) {
                defaultValue = 0;
            } else {
                if (iChangedParamCount > i5 || i5 >= length2) {
                    throw new IllegalStateException("Unexpected index");
                }
                defaultValue = 2097151;
            }
            objArr2[i5] = defaultValue;
            i5++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public final void invokeComposable(String str, String str2, Composer composer, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            int length = objArr.length;
            Method methodFindComposableMethod = findComposableMethod(cls, str2, Arrays.copyOf(objArr, length));
            if (methodFindComposableMethod != null) {
                methodFindComposableMethod.setAccessible(true);
                if (Modifier.isStatic(methodFindComposableMethod.getModifiers())) {
                    invokeComposableMethod(methodFindComposableMethod, null, composer, Arrays.copyOf(objArr, length));
                    return;
                } else {
                    invokeComposableMethod(methodFindComposableMethod, cls.getConstructor(null).newInstance(null), composer, Arrays.copyOf(objArr, length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e2) {
            PreviewLogger.Companion.logWarning$ui_tooling$default(PreviewLogger.Companion, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null, 2, null);
            throw e2;
        }
    }
}
