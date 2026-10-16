package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class u {
    public static r a(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return d(fileAttribute.value()) ? new s(fileAttribute) : fileAttribute instanceof q ? ((q) fileAttribute).f49727a : new p(fileAttribute);
    }

    public static FileTime b(java.nio.file.attribute.FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return new FileTime(fileTime.toMillis());
    }

    public static java.nio.file.attribute.FileTime c(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return java.nio.file.attribute.FileTime.fromMillis(fileTime.toMillis());
    }

    public static boolean d(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof o0) || (next instanceof PosixFilePermission);
    }
}
