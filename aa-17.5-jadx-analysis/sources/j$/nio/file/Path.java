package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface Path extends Comparable<Path>, Iterable<Path>, a1 {
    u0 c(x0 x0Var, l0[] l0VarArr, o0... o0VarArr);

    boolean endsWith(String str);

    boolean equals(Object obj);

    u0 f(x0 x0Var, l0... l0VarArr);

    Path getFileName();

    i getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    Path i(Path path);

    boolean isAbsolute();

    Iterator iterator();

    Path j(LinkOption... linkOptionArr);

    int m(Path path);

    boolean n(Path path);

    Path normalize();

    boolean o(Path path);

    Path q(Path path);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    Path u(Path path);
}
