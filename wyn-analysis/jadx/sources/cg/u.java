package cg;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class u extends m {
    @Override // cg.m
    public final void a(y path) throws IOException {
        AbstractC3340k.e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = path.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // cg.m
    public final List d(y dir) throws IOException {
        AbstractC3340k.e(dir, "dir");
        File fileE = dir.e();
        String[] list = fileE.list();
        if (list == null) {
            if (fileE.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC3340k.b(str);
            arrayList.add(dir.d(str));
        }
        ff.s.c0(arrayList);
        return arrayList;
    }

    @Override // cg.m
    public R0.e f(y path) {
        AbstractC3340k.e(path, "path");
        File fileE = path.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !fileE.exists()) {
            return null;
        }
        return new R0.e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // cg.m
    public final t g(y yVar) {
        return new t(new RandomAccessFile(yVar.e(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ));
    }

    @Override // cg.m
    public final F h(y file) {
        AbstractC3340k.e(file, "file");
        return AbstractC1613b.k(file.e());
    }

    @Override // cg.m
    public final H i(y file) {
        AbstractC3340k.e(file, "file");
        return AbstractC1613b.l(file.e());
    }

    public void j(y source, y target) throws IOException {
        AbstractC3340k.e(source, "source");
        AbstractC3340k.e(target, "target");
        if (source.e().renameTo(target.e())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
