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

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ b a(AccessMode accessMode) {
        if (accessMode == null) {
            return null;
        }
        return accessMode == AccessMode.READ ? b.READ : accessMode == AccessMode.WRITE ? b.WRITE : b.EXECUTE;
    }

    public static d0 b(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        return kind == StandardWatchEventKinds.ENTRY_CREATE ? a0.f49699b : kind == StandardWatchEventKinds.ENTRY_DELETE ? a0.f49700c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? a0.f49701d : kind == StandardWatchEventKinds.OVERFLOW ? a0.f49698a : kind instanceof c0 ? ((c0) kind).f49743a : new b0(kind);
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

    public static /* synthetic */ StandardOpenOption e(y yVar) {
        return yVar == y.READ ? StandardOpenOption.READ : yVar == y.WRITE ? StandardOpenOption.WRITE : yVar == y.APPEND ? StandardOpenOption.APPEND : yVar == y.TRUNCATE_EXISTING ? StandardOpenOption.TRUNCATE_EXISTING : yVar == y.CREATE ? StandardOpenOption.CREATE : yVar == y.CREATE_NEW ? StandardOpenOption.CREATE_NEW : yVar == y.DELETE_ON_CLOSE ? StandardOpenOption.DELETE_ON_CLOSE : yVar == y.SPARSE ? StandardOpenOption.SPARSE : yVar == y.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static WatchEvent.Kind f(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        return d0Var == a0.f49699b ? StandardWatchEventKinds.ENTRY_CREATE : d0Var == a0.f49700c ? StandardWatchEventKinds.ENTRY_DELETE : d0Var == a0.f49701d ? StandardWatchEventKinds.ENTRY_MODIFY : d0Var == a0.f49698a ? StandardWatchEventKinds.OVERFLOW : d0Var instanceof b0 ? ((b0) d0Var).f49741a : new c0(d0Var);
    }

    public static Object g(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Path ? q.f((Path) obj) : obj instanceof java.nio.file.Path ? p.f((java.nio.file.Path) obj) : obj;
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
        j$.util.e.a("java.nio.file.attribute.FileAttributeView", cls);
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
        j$.util.e.a("java.nio.file.attribute.BasicFileAttributes", cls);
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
            } catch (ClassCastException e2) {
                j$.util.e.a("java.nio.file.attribute.FileTime", e2);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.FileTime)) {
            return obj;
        }
        try {
            return j$.nio.file.attribute.u.c((j$.nio.file.attribute.FileTime) obj);
        } catch (ClassCastException e3) {
            j$.util.e.a("java.nio.file.attribute.FileTime", e3);
            throw null;
        }
    }

    public static Set l(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof n) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(m.a((n) it.next()));
                } catch (ClassCastException e2) {
                    j$.util.e.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                j$.util.e.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(l.a((OpenOption) it2.next()));
                } catch (ClassCastException e3) {
                    j$.util.e.a("java.nio.file.OpenOption", e3);
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
                } catch (ClassCastException e2) {
                    j$.util.e.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                j$.util.e.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission = (PosixFilePermission) it2.next();
                    hashSet.add(posixFilePermission == null ? null : posixFilePermission == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.o0.OWNER_READ : posixFilePermission == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.o0.OWNER_WRITE : posixFilePermission == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.o0.OWNER_EXECUTE : posixFilePermission == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.o0.GROUP_READ : posixFilePermission == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.o0.GROUP_WRITE : posixFilePermission == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.o0.GROUP_EXECUTE : posixFilePermission == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.o0.OTHERS_READ : posixFilePermission == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.o0.OTHERS_WRITE : j$.nio.file.attribute.o0.OTHERS_EXECUTE);
                } catch (ClassCastException e3) {
                    j$.util.e.a("java.nio.file.attribute.PosixFilePermission", e3);
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
        if (obj instanceof j0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    j0 j0Var = (j0) it.next();
                    arrayList.add(j0Var == null ? null : j0Var instanceof h0 ? ((h0) j0Var).f49752a : new i0(j0Var));
                } catch (ClassCastException e2) {
                    j$.util.e.a("java.nio.file.WatchEvent", e2);
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                j$.util.e.a("java.nio.file.WatchEvent", obj.getClass());
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    arrayList.add(watchEvent == null ? null : watchEvent instanceof i0 ? ((i0) watchEvent).f49753a : new h0(watchEvent));
                } catch (ClassCastException e3) {
                    j$.util.e.a("java.nio.file.WatchEvent", e3);
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
