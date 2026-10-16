package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import j$.util.Spliterators;
import j$.util.c1;
import j$.util.o1;
import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class q implements java.nio.file.Path {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Path f49765a;

    public /* synthetic */ q(Path path) {
        this.f49765a = path;
    }

    public static /* synthetic */ java.nio.file.Path f(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof p ? ((p) path).f49764a : new q(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.f49765a.compareTo(a.g(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.f49765a.q(p.f(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.f49765a;
        if (obj instanceof q) {
            obj = ((q) obj).f49765a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super java.nio.file.Path> consumer) {
        Iterable$EL.forEach(this.f49765a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return f(this.f49765a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return h.e(this.f49765a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i2) {
        return f(this.f49765a.getName(i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f49765a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return f(this.f49765a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return f(this.f49765a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.f49765a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f49765a.isAbsolute();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.f49765a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return f(this.f49765a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return l0.a(this.f49765a.e(n0.e(watchService), a0.i(kindArr), a0.j(modifierArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return f(this.f49765a.v(p.f(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return f(this.f49765a.i(p.f(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return f(this.f49765a.r(p.f(path)));
    }

    @Override // java.lang.Iterable
    public final Spliterator<java.nio.file.Path> spliterator() {
        j$.util.Spliterator o1Var;
        j$.util.Spliterator spliterator$default$spliterator;
        Iterable iterable = this.f49765a;
        if (iterable instanceof j$.lang.a) {
            spliterator$default$spliterator = ((j$.lang.a) iterable).spliterator();
        } else if (iterable instanceof LinkedHashSet) {
            spliterator$default$spliterator = Spliterators.spliterator((LinkedHashSet) iterable, 17);
        } else {
            if (iterable instanceof SortedSet) {
                SortedSet sortedSet = (SortedSet) iterable;
                o1Var = new j$.util.p0(sortedSet, sortedSet);
            } else if (iterable instanceof Set) {
                spliterator$default$spliterator = Spliterators.spliterator((Set) iterable, 1);
            } else if (iterable instanceof List) {
                spliterator$default$spliterator = List.CC.$default$spliterator((java.util.List) iterable);
            } else if (iterable instanceof Collection) {
                spliterator$default$spliterator = Collection.CC.$default$spliterator((java.util.Collection) iterable);
            } else {
                o1Var = new o1((Iterator) Objects.requireNonNull(iterable.iterator()));
            }
            spliterator$default$spliterator = o1Var;
        }
        return c1.a(spliterator$default$spliterator);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.f49765a.p(p.f(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i2, int i3) {
        return f(this.f49765a.subpath(i2, i3));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return f(this.f49765a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f49765a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(java.nio.file.LinkOption[] linkOptionArr) {
        return f(this.f49765a.j(a0.h(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f49765a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f49765a.toUri();
    }

    @Override // java.nio.file.Path
    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.f49765a.compareTo(p.f(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f49765a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f49765a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(String str) {
        return f(this.f49765a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(String str) {
        return f(this.f49765a.resolveSibling(str));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return l0.a(this.f49765a.g(n0.e(watchService), a0.i(kindArr)));
    }
}
