package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class yvi implements Serializable, yvj, yvk, ywf {
    public static final /* synthetic */ int b = 0;
    private static final HashMap t = new HashMap();
    private static final HashMap u = new HashMap();
    private static boolean v = false;
    public final int a;

    public yvi(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yvi) && this.a == ((yvi) obj).a;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        HashMap map = t;
        synchronized (map) {
            if (!v) {
                for (Field field : yvi.class.getFields()) {
                    int modifiers = field.getModifiers();
                    if (yvi.class.equals(field.getType()) && Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                        try {
                            yvi yviVar = (yvi) field.get(null);
                            map.put(Integer.valueOf(yviVar.a), yviVar);
                            u.put(yviVar, field);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                v = true;
            }
        }
        Field field2 = (Field) u.get(this);
        field2.getClass();
        return field2.getName();
    }
}
