package r7;

import dalvik.system.PathClassLoader;

/* renamed from: r7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3936f extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z2) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z2);
    }
}
