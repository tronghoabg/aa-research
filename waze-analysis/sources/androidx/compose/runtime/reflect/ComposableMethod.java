package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import h.a.aj;
import h.a.c;
import h.a.i;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposableMethod {
    public static final int $stable = 8;
    private final ComposableInfo composableInfo;
    private final Method method;

    public ComposableMethod(Method method, ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    public final Method asMethod() {
        return this.method;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComposableMethod) {
            return x.n(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Class<?>[] getParameterTypes() {
        return (Class[]) c.u(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Parameter[] getParameters() {
        return (Parameter[]) c.u(this.method.getParameters(), 0, this.composableInfo.getRealParamsCount());
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public final Object invoke(Composer composer, Object obj, Object... objArr) {
        Object defaultValue;
        Method method = this.method;
        ComposableInfo composableInfo = this.composableInfo;
        int iComponent2 = composableInfo.component2();
        int iComponent3 = composableInfo.component3();
        int iComponent4 = composableInfo.component4();
        int length = method.getParameterTypes().length;
        int i2 = iComponent2 + 1;
        int i3 = iComponent3 + i2;
        Object[] objArr2 = new Integer[iComponent4];
        int i4 = 0;
        for (int i5 = 0; i5 < iComponent4; i5++) {
            int i6 = i5 * 31;
            j jVarU = n.u(i6, Math.min(i6 + 31, iComponent2));
            ArrayList arrayList = new ArrayList(i.q(jVarU, 10));
            Iterator<Integer> it = jVarU.iterator();
            while (it.hasNext()) {
                int iNextInt = ((aj) it).nextInt();
                int i7 = 1;
                if (iNextInt < objArr.length && objArr[iNextInt] != null) {
                    i7 = 0;
                }
                arrayList.add(Integer.valueOf(i7));
            }
            int iIntValue = 0;
            int i8 = 0;
            for (Object obj2 : arrayList) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    i.p();
                }
                iIntValue |= ((Number) obj2).intValue() << i8;
                i8 = i9;
            }
            objArr2[i5] = Integer.valueOf(iIntValue);
        }
        Object[] objArr3 = new Object[length];
        while (i4 < length) {
            if (i4 >= 0 && i4 < iComponent2) {
                defaultValue = (i4 < 0 || i4 >= objArr.length) ? ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i4]) : objArr[i4];
            } else if (i4 == iComponent2) {
                defaultValue = composer;
            } else if (i4 == i2 || (iComponent2 + 2 <= i4 && i4 < i3)) {
                defaultValue = 0;
            } else {
                if (i3 > i4 || i4 >= length) {
                    throw new IllegalStateException("Unexpected index");
                }
                defaultValue = objArr2[i4 - i3];
            }
            objArr3[i4] = defaultValue;
            i4++;
        }
        return this.method.invoke(obj, Arrays.copyOf(objArr3, length));
    }
}
