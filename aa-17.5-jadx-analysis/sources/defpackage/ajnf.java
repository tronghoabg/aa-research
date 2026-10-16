package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class ajnf implements Closeable {
    public static final ajnf a;
    public static final ajnf b;

    static {
        ajnf ajnnVar;
        try {
            Class.forName("java.nio.file.Files");
            ajnnVar = new ajno();
        } catch (ClassNotFoundException unused) {
            ajnnVar = new ajnn();
        }
        a = ajnnVar;
        String str = ajnr.a;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        ahfo.a(property);
        ClassLoader classLoader = ajon.class.getClassLoader();
        classLoader.getClass();
        b = new ajon(classLoader, ajnnVar);
    }

    public abstract ajoa a(ajnr ajnrVar) throws IOException;

    public abstract List b(ajnr ajnrVar) throws IOException;

    public abstract ajnd c(ajnr ajnrVar) throws IOException;

    public final ajne d(ajnr ajnrVar) throws IOException {
        ajnrVar.getClass();
        ajne ajneVarE = e(ajnrVar);
        if (ajneVarE != null) {
            return ajneVarE;
        }
        Objects.toString(ajnrVar);
        throw new FileNotFoundException("no such file: ".concat(ajnrVar.toString()));
    }

    public abstract ajne e(ajnr ajnrVar) throws IOException;

    public abstract ajoc f(ajnr ajnrVar) throws IOException;

    public abstract void g(ajnr ajnrVar, ajnr ajnrVar2) throws IOException;

    public final void h(ajnr ajnrVar) throws IOException {
        ajnrVar.getClass();
        l(ajnrVar);
    }

    public final boolean i(ajnr ajnrVar) throws IOException {
        ajnrVar.getClass();
        return e(ajnrVar) != null;
    }

    public abstract ajoa j(ajnr ajnrVar) throws IOException;

    public abstract void k(ajnr ajnrVar) throws IOException;

    public abstract void l(ajnr ajnrVar) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
