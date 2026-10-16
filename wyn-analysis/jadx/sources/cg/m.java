package cg;

import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final u f19913a;

    static {
        u uVar;
        try {
            Class.forName("java.nio.file.Files");
            uVar = new v();
        } catch (ClassNotFoundException unused) {
            uVar = new u();
        }
        f19913a = uVar;
        String str = y.f19937b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC3340k.d(property, "getProperty(...)");
        ad.r.g(property);
        ClassLoader classLoader = dg.e.class.getClassLoader();
        AbstractC3340k.d(classLoader, "getClassLoader(...)");
        new dg.e(classLoader);
    }

    public abstract void a(y yVar);

    public final void b(y path) {
        AbstractC3340k.e(path, "path");
        a(path);
    }

    public final boolean c(y path) {
        AbstractC3340k.e(path, "path");
        return f(path) != null;
    }

    public abstract List d(y yVar);

    public final R0.e e(y path) throws FileNotFoundException {
        AbstractC3340k.e(path, "path");
        R0.e eVarF = f(path);
        if (eVarF != null) {
            return eVarF;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract R0.e f(y yVar);

    public abstract t g(y yVar);

    public abstract F h(y yVar);

    public abstract H i(y yVar);
}
