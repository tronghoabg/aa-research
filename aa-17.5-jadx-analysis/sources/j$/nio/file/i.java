package j$.nio.file;

import java.io.Closeable;
import java.util.Set;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class i implements Closeable {
    public Iterable a() {
        throw new UnsupportedOperationException("");
    }

    public abstract Path b(String str, String... strArr);

    public abstract f0 c(String str);

    public abstract Iterable d();

    public String e() {
        return "/";
    }

    public j$.desugar.sun.nio.fs.g f() {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return false;
    }

    public x0 h() {
        throw new UnsupportedOperationException();
    }

    public abstract j$.nio.file.spi.c i();

    public boolean isOpen() {
        return true;
    }

    public Set j() {
        return j$.desugar.sun.nio.fs.g.B(new Object[]{"basic"});
    }
}
