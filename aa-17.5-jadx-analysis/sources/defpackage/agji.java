package defpackage;

/* loaded from: classes3.dex */
public final class agji {
    public static final Class<?> tryLoadClass(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
