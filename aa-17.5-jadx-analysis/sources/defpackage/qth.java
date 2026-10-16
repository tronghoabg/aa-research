package defpackage;

import android.content.Context;
import com.google.android.gms.car.DynamicApiFactory;

/* loaded from: classes2.dex */
public final class qth extends ClassLoader {
    private final ClassLoader a;
    private final ClassLoader b = ClassLoader.getSystemClassLoader();

    public qth(Context context) {
        this.a = context.getClassLoader();
    }

    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        Class<?> clsLoadClass = DynamicApiFactory.isApiInterface(str) ? this.a.loadClass(str) : this.b.loadClass(str);
        if (z) {
            resolveClass(clsLoadClass);
        }
        return clsLoadClass;
    }
}
