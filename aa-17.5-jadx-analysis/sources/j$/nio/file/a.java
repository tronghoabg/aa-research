package j$.nio.file;

import java.nio.file.AccessMode;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ b a(AccessMode accessMode) {
        if (accessMode == null) {
            return null;
        }
        return accessMode == AccessMode.READ ? b.READ : accessMode == AccessMode.WRITE ? b.WRITE : b.EXECUTE;
    }

    public static l0 b(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        return kind == StandardWatchEventKinds.ENTRY_CREATE ? i0.b : kind == StandardWatchEventKinds.ENTRY_DELETE ? i0.c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? i0.d : kind == StandardWatchEventKinds.OVERFLOW ? i0.a : kind instanceof k0 ? ((k0) kind).a : new j0(kind);
    }

    public static /* synthetic */ java.nio.file.LinkOption c(LinkOption linkOption) {
        if (linkOption == null) {
            return null;
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public static /* synthetic */ java.nio.file.StandardCopyOption d(StandardCopyOption standardCopyOption) {
        return standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
    }

    public static /* synthetic */ StandardOpenOption e(g0 g0Var) {
        return g0Var == g0.READ ? StandardOpenOption.READ : g0Var == g0.WRITE ? StandardOpenOption.WRITE : g0Var == g0.APPEND ? StandardOpenOption.APPEND : g0Var == g0.TRUNCATE_EXISTING ? StandardOpenOption.TRUNCATE_EXISTING : g0Var == g0.CREATE ? StandardOpenOption.CREATE : g0Var == g0.CREATE_NEW ? StandardOpenOption.CREATE_NEW : g0Var == g0.DELETE_ON_CLOSE ? StandardOpenOption.DELETE_ON_CLOSE : g0Var == g0.SPARSE ? StandardOpenOption.SPARSE : g0Var == g0.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static WatchEvent.Kind f(l0 l0Var) {
        if (l0Var == null) {
            return null;
        }
        return l0Var == i0.b ? StandardWatchEventKinds.ENTRY_CREATE : l0Var == i0.c ? StandardWatchEventKinds.ENTRY_DELETE : l0Var == i0.d ? StandardWatchEventKinds.ENTRY_MODIFY : l0Var == i0.a ? StandardWatchEventKinds.OVERFLOW : l0Var instanceof j0 ? ((j0) l0Var).a : new k0(l0Var);
    }

    public static Object g(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Path ? y.h((Path) obj) : obj instanceof java.nio.file.Path ? x.h((java.nio.file.Path) obj) : obj;
    }

    public static Class h(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return j$.nio.file.attribute.g.class;
        }
        if (cls == j$.nio.file.attribute.g.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return j$.nio.file.attribute.k0.class;
        }
        if (cls == j$.nio.file.attribute.k0.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return j$.nio.file.attribute.a0.class;
        }
        if (cls == j$.nio.file.attribute.a0.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == j$.nio.file.attribute.l.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return j$.nio.file.attribute.l.class;
        }
        if (cls == j$.nio.file.attribute.r0.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return j$.nio.file.attribute.r0.class;
        }
        if (cls == j$.nio.file.attribute.c.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return j$.nio.file.attribute.c.class;
        }
        j$.util.f.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class i(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return j$.nio.file.attribute.BasicFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.BasicFileAttributes.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return j$.nio.file.attribute.n0.class;
        }
        if (cls == j$.nio.file.attribute.n0.class) {
            return PosixFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.o.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return j$.nio.file.attribute.o.class;
        }
        j$.util.f.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map j(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, k(map.get(str)));
        }
        return map2;
    }

    public static Object k(Object obj) {
        if (obj instanceof FileTime) {
            try {
                return j$.nio.file.attribute.u.b((FileTime) obj);
            } catch (ClassCastException e) {
                j$.util.f.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.FileTime)) {
            return obj;
        }
        try {
            return j$.nio.file.attribute.u.c((j$.nio.file.attribute.FileTime) obj);
        } catch (ClassCastException e2) {
            j$.util.f.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set l(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof v) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(u.a((v) it.next()));
                } catch (ClassCastException e) {
                    j$.util.f.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                j$.util.f.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(t.a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    j$.util.f.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Set m(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.o0) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.o0 o0Var = (j$.nio.file.attribute.o0) it.next();
                    hashSet.add(o0Var == null ? null : o0Var == j$.nio.file.attribute.o0.OWNER_READ ? PosixFilePermission.OWNER_READ : o0Var == j$.nio.file.attribute.o0.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : o0Var == j$.nio.file.attribute.o0.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : o0Var == j$.nio.file.attribute.o0.GROUP_READ ? PosixFilePermission.GROUP_READ : o0Var == j$.nio.file.attribute.o0.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : o0Var == j$.nio.file.attribute.o0.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : o0Var == j$.nio.file.attribute.o0.OTHERS_READ ? PosixFilePermission.OTHERS_READ : o0Var == j$.nio.file.attribute.o0.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e) {
                    j$.util.f.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                j$.util.f.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission = (PosixFilePermission) it2.next();
                    hashSet.add(posixFilePermission == null ? null : posixFilePermission == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.o0.OWNER_READ : posixFilePermission == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.o0.OWNER_WRITE : posixFilePermission == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.o0.OWNER_EXECUTE : posixFilePermission == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.o0.GROUP_READ : posixFilePermission == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.o0.GROUP_WRITE : posixFilePermission == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.o0.GROUP_EXECUTE : posixFilePermission == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.o0.OTHERS_READ : posixFilePermission == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.o0.OTHERS_WRITE : j$.nio.file.attribute.o0.OTHERS_EXECUTE);
                } catch (ClassCastException e2) {
                    j$.util.f.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static List n(List list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = list.get(0);
        if (obj instanceof r0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    r0 r0Var = (r0) it.next();
                    arrayList.add(r0Var == null ? null : r0Var instanceof p0 ? ((p0) r0Var).a : new q0(r0Var));
                } catch (ClassCastException e) {
                    j$.util.f.a("java.nio.file.WatchEvent", e);
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                j$.util.f.a("java.nio.file.WatchEvent", obj.getClass());
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    arrayList.add(watchEvent == null ? null : watchEvent instanceof q0 ? ((q0) watchEvent).a : new p0(watchEvent));
                } catch (ClassCastException e2) {
                    j$.util.f.a("java.nio.file.WatchEvent", e2);
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
