package androidx.compose.runtime.reflect;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.aj;
import h.a.i;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    public static final ComposableMethod asComposableMethod(Method method) {
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i2, int i3) {
        if (i2 == 0) {
            return 1;
        }
        return (int) Math.ceil((i2 + i3) / 10.0d);
    }

    private static final int defaultParamCount(int i2) {
        return (int) Math.ceil(i2 / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T t, int i2) {
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

    private static final ComposableInfo getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (x.n(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int iChangedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i3 = length + 1 + iChangedParamCount;
        int length2 = method.getParameterTypes().length;
        int iDefaultParamCount = length2 != i3 ? defaultParamCount(length) : 0;
        return new ComposableInfo(i3 + iDefaultParamCount == length2, length, iChangedParamCount, iDefaultParamCount);
    }

    public static final ComposableMethod getDeclaredComposableMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        int iChangedParamCount = changedParamCount(clsArr.length, 0);
        try {
            ArrayList arrayList = new ArrayList(3);
            x.q(clsArr, arrayList);
            arrayList.add(Composer.class);
            Class cls2 = Integer.TYPE;
            j jVarU = n.u(0, iChangedParamCount);
            ArrayList arrayList2 = new ArrayList(i.q(jVarU, 10));
            Iterator<Integer> it = jVarU.iterator();
            while (it.hasNext()) {
                ((aj) it).nextInt();
                arrayList2.add(cls2);
            }
            x.q(arrayList2.toArray(new Class[0]), arrayList);
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) arrayList.toArray(new Class[arrayList.size()]));
        } catch (ReflectiveOperationException unused) {
            int iDefaultParamCount = defaultParamCount(clsArr.length);
            try {
                ArrayList arrayList3 = new ArrayList(4);
                x.q(clsArr, arrayList3);
                arrayList3.add(Composer.class);
                Class cls3 = Integer.TYPE;
                j jVarU2 = n.u(0, iChangedParamCount);
                ArrayList arrayList4 = new ArrayList(i.q(jVarU2, 10));
                Iterator<Integer> it2 = jVarU2.iterator();
                while (it2.hasNext()) {
                    ((aj) it2).nextInt();
                    arrayList4.add(cls3);
                }
                x.q(arrayList4.toArray(new Class[0]), arrayList3);
                Class cls4 = Integer.TYPE;
                j jVarU3 = n.u(0, iDefaultParamCount);
                ArrayList arrayList5 = new ArrayList(i.q(jVarU3, 10));
                Iterator<Integer> it3 = jVarU3.iterator();
                while (it3.hasNext()) {
                    ((aj) it3).nextInt();
                    arrayList5.add(cls4);
                }
                x.q(arrayList5.toArray(new Class[0]), arrayList3);
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            ComposableMethod composableMethodAsComposableMethod = asComposableMethod(declaredMethod);
            x.c(composableMethodAsComposableMethod);
            return composableMethodAsComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDefaultValue(Class<?> cls) {
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
}
