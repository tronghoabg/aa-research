package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.a.c;
import h.b.a;
import h.g.b.x;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Actual_jvmAndAndroidKt {
    public static final boolean areObjectsOfSameType(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final Object classKeyForObject(Object obj) {
        return obj.getClass();
    }

    public static final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static final void tryPopulateReflectively(InspectorInfo inspectorInfo, ModifierNodeElement<?> modifierNodeElement) {
        Object[] declaredFields = modifierNodeElement.getClass().getDeclaredFields();
        Comparator comparator = new Comparator() { // from class: androidx.compose.ui.Actual_jvmAndAndroidKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a(((Field) t).getName(), ((Field) t2).getName());
            }
        };
        x.f(declaredFields, "<this>");
        x.f(comparator, "comparator");
        x.f(declaredFields, "<this>");
        x.f(comparator, "comparator");
        int length = declaredFields.length;
        if (length != 0) {
            declaredFields = Arrays.copyOf(declaredFields, length);
            x.e(declaredFields, "copyOf(...)");
            c.k(declaredFields, comparator);
        }
        List listI = c.i(declaredFields);
        int size = listI.size();
        for (int i2 = 0; i2 < size; i2++) {
            Field field = (Field) listI.get(i2);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    inspectorInfo.getProperties().set(field.getName(), field.get(modifierNodeElement));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
