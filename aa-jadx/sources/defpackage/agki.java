package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agki {
    public static final java.lang.Class<?> tryLoadClass(java.lang.ClassLoader classLoader, java.lang.String str) {
        classLoader.getClass();
        str.getClass();
        try {
            return java.lang.Class.forName(str, false, classLoader);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
