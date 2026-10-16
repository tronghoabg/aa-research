package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface Path extends Comparable<Path>, Iterable<Path>, s0 {
    m0 e(p0 p0Var, d0[] d0VarArr, g0... g0VarArr);

    boolean endsWith(String str);

    boolean equals(Object obj);

    m0 g(p0 p0Var, d0... d0VarArr);

    Path getFileName();

    i getFileSystem();

    Path getName(int i2);

    int getNameCount();

    Path getParent();

    Path getRoot();

    Path i(Path path);

    boolean isAbsolute();

    Iterator iterator();

    Path j(LinkOption... linkOptionArr);

    int n(Path path);

    Path normalize();

    boolean p(Path path);

    boolean q(Path path);

    Path r(Path path);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i2, int i3);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    Path v(Path path);
}
