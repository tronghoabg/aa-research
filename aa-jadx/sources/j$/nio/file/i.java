package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements java.io.Closeable {
    public java.lang.Iterable a() {
        throw new java.lang.UnsupportedOperationException("");
    }

    public abstract j$.nio.file.Path b(java.lang.String str, java.lang.String... strArr);

    public abstract j$.nio.file.f0 c(java.lang.String str);

    public abstract java.lang.Iterable d();

    public java.lang.String e() {
        return "/";
    }

    public j$.desugar.sun.nio.fs.g f() {
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean g() {
        return false;
    }

    public j$.nio.file.x0 h() {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract j$.nio.file.spi.c i();

    public boolean isOpen() {
        return true;
    }

    public java.util.Set j() {
        return j$.desugar.sun.nio.fs.g.B(new java.lang.Object[]{"basic"});
    }
}
