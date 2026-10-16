package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gq implements android.view.MenuItem.OnMenuItemClickListener {
    private static final java.lang.Class[] a = {android.view.MenuItem.class};
    private final java.lang.Object b;
    private java.lang.reflect.Method c;

    public gq(java.lang.Object obj, java.lang.String str) {
        this.b = obj;
        java.lang.Class<?> cls = obj.getClass();
        try {
            this.c = cls.getMethod(str, a);
        } catch (java.lang.Exception e) {
            android.view.InflateException inflateException = new android.view.InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        try {
            java.lang.Class<?> returnType = this.c.getReturnType();
            java.lang.Class<?> cls = java.lang.Boolean.TYPE;
            java.lang.reflect.Method method = this.c;
            if (returnType == cls) {
                return ((java.lang.Boolean) method.invoke(this.b, menuItem)).booleanValue();
            }
            method.invoke(this.b, menuItem);
            return true;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
