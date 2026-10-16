package org.lsposed.hiddenapibypass;

import dalvik.system.PathClassLoader;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Executable;
import org.lsposed.hiddenapibypass.Helper;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
final class CoreOjClassLoader extends PathClassLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public CoreOjClassLoader() {
        super(getCoreOjPath(), null);
    }

    private static String getCoreOjPath() {
        return System.getProperty("java.boot.class.path", "").split(":", 2)[0];
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) {
        if (Object.class.getName().equals(str)) {
            return Object.class;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused) {
            return Executable.class.getName().equals(str) ? Helper.Executable.class : MethodHandle.class.getName().equals(str) ? Helper.MethodHandle.class : Class.class.getName().equals(str) ? Helper.Class.class : super.loadClass(str);
        }
    }
}
