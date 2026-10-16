package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {
    public static j$.nio.file.attribute.r a(java.nio.file.attribute.FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        if (d(fileAttribute.value())) {
            return new j$.nio.file.attribute.s(fileAttribute);
        }
        return fileAttribute instanceof j$.nio.file.attribute.q ? ((j$.nio.file.attribute.q) fileAttribute).a : new j$.nio.file.attribute.p(fileAttribute);
    }

    public static j$.nio.file.attribute.FileTime b(java.nio.file.attribute.FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return new j$.nio.file.attribute.FileTime(fileTime.toMillis());
    }

    public static java.nio.file.attribute.FileTime c(j$.nio.file.attribute.FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return java.nio.file.attribute.FileTime.fromMillis(fileTime.toMillis());
    }

    public static boolean d(java.lang.Object obj) {
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        java.lang.Object next = set.iterator().next();
        return (next instanceof j$.nio.file.attribute.o0) || (next instanceof java.nio.file.attribute.PosixFilePermission);
    }
}
