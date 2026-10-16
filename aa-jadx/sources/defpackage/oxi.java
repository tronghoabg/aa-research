package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oxi implements android.view.LayoutInflater.Factory {
    private static final java.util.HashMap a = new java.util.HashMap();
    private static final java.lang.ClassLoader b = android.view.LayoutInflater.class.getClassLoader();
    private static final java.lang.Class[] c = {android.content.Context.class, android.util.AttributeSet.class};

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        java.lang.ClassLoader classLoader;
        if (!str.startsWith("com.google.android.gms.car.support") && !str.startsWith("android.support") && !str.startsWith("com.google.android.apps.auto.sdk.ui")) {
            return null;
        }
        if (android.util.Log.isLoggable("CSL.SupportLibViewLoade", 2)) {
            android.util.Log.v("CSL.SupportLibViewLoade", java.lang.String.format("createView %s with context %s", str, context));
        }
        java.util.HashMap map = a;
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) map.get(str);
        if (constructor != null && (classLoader = constructor.getDeclaringClass().getClassLoader()) != b) {
            java.lang.ClassLoader classLoader2 = context.getClassLoader();
            while (classLoader != classLoader2) {
                classLoader2 = classLoader2.getParent();
                if (classLoader2 == null) {
                    map.remove(str);
                    constructor = null;
                    break;
                }
            }
        }
        if (constructor == null) {
            if (android.util.Log.isLoggable("CSL.SupportLibViewLoade", 2)) {
                android.util.Log.v("CSL.SupportLibViewLoade", "No cached constructor");
            }
            try {
                constructor = context.getClassLoader().loadClass(str).asSubclass(android.view.View.class).getConstructor(c);
                constructor.setAccessible(true);
                a.put(str, constructor);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
                android.util.Log.w("CSL.SupportLibViewLoade", "Error creating view", e);
                return null;
            }
        }
        try {
            return (android.view.View) constructor.newInstance(context, attributeSet);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w("CSL.SupportLibViewLoade", "Error creating view: ".concat(e2.toString()));
            return null;
        }
    }
}
