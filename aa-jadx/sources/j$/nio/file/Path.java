package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface Path extends java.lang.Comparable<j$.nio.file.Path>, java.lang.Iterable<j$.nio.file.Path>, j$.nio.file.a1 {
    j$.nio.file.u0 c(j$.nio.file.x0 x0Var, j$.nio.file.l0[] l0VarArr, j$.nio.file.o0... o0VarArr);

    boolean endsWith(java.lang.String str);

    boolean equals(java.lang.Object obj);

    j$.nio.file.u0 f(j$.nio.file.x0 x0Var, j$.nio.file.l0... l0VarArr);

    j$.nio.file.Path getFileName();

    j$.nio.file.i getFileSystem();

    j$.nio.file.Path getName(int i);

    int getNameCount();

    j$.nio.file.Path getParent();

    j$.nio.file.Path getRoot();

    j$.nio.file.Path i(j$.nio.file.Path path);

    boolean isAbsolute();

    java.util.Iterator iterator();

    j$.nio.file.Path j(j$.nio.file.LinkOption... linkOptionArr);

    int m(j$.nio.file.Path path);

    boolean n(j$.nio.file.Path path);

    j$.nio.file.Path normalize();

    boolean o(j$.nio.file.Path path);

    j$.nio.file.Path q(j$.nio.file.Path path);

    j$.nio.file.Path resolve(java.lang.String str);

    j$.nio.file.Path resolveSibling(java.lang.String str);

    boolean startsWith(java.lang.String str);

    j$.nio.file.Path subpath(int i, int i2);

    j$.nio.file.Path toAbsolutePath();

    java.io.File toFile();

    java.lang.String toString();

    java.net.URI toUri();

    j$.nio.file.Path u(j$.nio.file.Path path);
}
