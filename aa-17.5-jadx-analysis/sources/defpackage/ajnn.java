package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ajnn extends ajnf {
    @Override // defpackage.ajnf
    public final ajoa a(ajnr ajnrVar) {
        return ahfm.d(ajnrVar.b(), false);
    }

    @Override // defpackage.ajnf
    public final List b(ajnr ajnrVar) throws IOException {
        File fileB = ajnrVar.b();
        String[] list = fileB.list();
        if (list == null) {
            if (fileB.exists()) {
                Objects.toString(ajnrVar);
                throw new IOException("failed to list ".concat(ajnrVar.toString()));
            }
            Objects.toString(ajnrVar);
            throw new FileNotFoundException("no such file: ".concat(ajnrVar.toString()));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(ajnrVar.h(str));
        }
        woy.br(arrayList);
        return arrayList;
    }

    @Override // defpackage.ajnf
    public final ajnd c(ajnr ajnrVar) {
        return new ajnd(new RandomAccessFile(ajnrVar.b(), "r"));
    }

    @Override // defpackage.ajnf
    public ajne e(ajnr ajnrVar) {
        File fileB = ajnrVar.b();
        boolean zIsFile = fileB.isFile();
        boolean zIsDirectory = fileB.isDirectory();
        long jLastModified = fileB.lastModified();
        long length = fileB.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0) {
            if (length != 0) {
                jLastModified = 0;
            } else {
                if (!fileB.exists()) {
                    return null;
                }
                jLastModified = 0;
                length = 0;
            }
        }
        return new ajne(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // defpackage.ajnf
    public final ajoc f(ajnr ajnrVar) {
        return new ajnm(new FileInputStream(ajnrVar.b()), ajoe.k);
    }

    @Override // defpackage.ajnf
    public void g(ajnr ajnrVar, ajnr ajnrVar2) throws IOException {
        if (!ajnrVar.b().renameTo(ajnrVar2.b())) {
            throw new IOException(a.bt(ajnrVar2, ajnrVar, "failed to move ", " to "));
        }
    }

    @Override // defpackage.ajnf
    public final ajoa j(ajnr ajnrVar) {
        return ahfm.d(ajnrVar.b(), true);
    }

    @Override // defpackage.ajnf
    public final void k(ajnr ajnrVar) throws IOException {
        if (ajnrVar.b().mkdir()) {
            return;
        }
        ajne ajneVarE = e(ajnrVar);
        if (ajneVarE == null || !ajneVarE.b) {
            Objects.toString(ajnrVar);
            throw new IOException("failed to create directory: ".concat(ajnrVar.toString()));
        }
    }

    @Override // defpackage.ajnf
    public final void l(ajnr ajnrVar) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileB = ajnrVar.b();
        if (fileB.delete() || !fileB.exists()) {
            return;
        }
        Objects.toString(ajnrVar);
        throw new IOException("failed to delete ".concat(ajnrVar.toString()));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
