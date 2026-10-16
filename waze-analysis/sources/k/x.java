package k;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class x extends w {
    protected static final o i(Path path) {
        h.g.b.x.f(path, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = ab.f50788a;
                h.g.b.x.f(symbolicLink, "<this>");
                aq.c(symbolicLink.toString(), false);
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lJ = fileTimeCreationTime != null ? j(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lJ2 = fileTimeLastModifiedTime != null ? j(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new o(zIsRegularFile, zIsDirectory, lValueOf, lJ, lJ2, fileTimeLastAccessTime != null ? j(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    private static final Long j(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // k.w, k.p
    public final o b(ab abVar) {
        h.g.b.x.f(abVar, "path");
        return i(abVar.a());
    }

    @Override // k.w, k.p
    public final void d(ab abVar, ab abVar2) throws IOException {
        h.g.b.x.f(abVar, "source");
        h.g.b.x.f(abVar2, TypedValues.AttributesType.S_TARGET);
        try {
            Files.move(abVar.a(), abVar2.a(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    @Override // k.w
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
