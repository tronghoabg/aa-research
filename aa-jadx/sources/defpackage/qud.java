package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qud extends java.lang.ClassLoader {
    private final java.lang.ClassLoader a;
    private final java.lang.ClassLoader b = java.lang.ClassLoader.getSystemClassLoader();

    public qud(android.content.Context context) {
        this.a = context.getClassLoader();
    }

    @Override // java.lang.ClassLoader
    protected final java.lang.Class loadClass(java.lang.String str, boolean z) throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass = com.google.android.gms.car.DynamicApiFactory.isApiInterface(str) ? this.a.loadClass(str) : this.b.loadClass(str);
        if (z) {
            resolveClass(clsLoadClass);
        }
        return clsLoadClass;
    }
}
