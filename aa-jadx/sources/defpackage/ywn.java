package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ywn implements java.io.Serializable, defpackage.ywo, defpackage.ywp, defpackage.yxk {
    public static final /* synthetic */ int b = 0;
    private static final java.util.HashMap w = new java.util.HashMap();
    private static final java.util.HashMap x = new java.util.HashMap();
    private static boolean y = false;
    public final int a;

    public ywn(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ywn) && this.a == ((defpackage.ywn) obj).a;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final java.lang.String toString() {
        java.util.HashMap map = w;
        synchronized (map) {
            if (!y) {
                for (java.lang.reflect.Field field : defpackage.ywn.class.getFields()) {
                    int modifiers = field.getModifiers();
                    if (defpackage.ywn.class.equals(field.getType()) && java.lang.reflect.Modifier.isPublic(modifiers) && java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers)) {
                        try {
                            defpackage.ywn ywnVar = (defpackage.ywn) field.get(null);
                            map.put(java.lang.Integer.valueOf(ywnVar.a), ywnVar);
                            x.put(ywnVar, field);
                        } catch (java.lang.IllegalAccessException e) {
                            throw new java.lang.RuntimeException(e);
                        }
                    }
                }
                y = true;
            }
        }
        java.lang.reflect.Field field2 = (java.lang.reflect.Field) x.get(this);
        field2.getClass();
        return field2.getName();
    }
}
