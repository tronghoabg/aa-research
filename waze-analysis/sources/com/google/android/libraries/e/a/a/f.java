package com.google.android.libraries.e.a.a;

import android.net.Uri;
import com.google.android.gms.o.ag;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements com.google.android.libraries.e.a.d.a {
    public f() {
        new ConcurrentHashMap();
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final File d(Uri uri) {
        return ag.j(uri);
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final InputStream e(Uri uri) {
        return com.google.android.libraries.e.a.b.a.a.b(ag.j(uri));
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final String f() {
        return "file";
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final boolean g(Uri uri) {
        return ag.j(uri).exists();
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final OutputStream j(Uri uri) throws IOException {
        File fileJ = ag.j(uri);
        com.google.d.f.c.a.g(fileJ);
        return new com.google.android.libraries.e.a.b.a.b(new FileOutputStream(fileJ), fileJ);
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final void k(Uri uri) throws IOException {
        File fileJ = ag.j(uri);
        if (fileJ.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileJ.delete()) {
            return;
        }
        if (!fileJ.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final void l(Uri uri, Uri uri2) throws IOException {
        File fileJ = ag.j(uri);
        File fileJ2 = ag.j(uri2);
        com.google.d.f.c.a.g(fileJ2);
        if (!fileJ.renameTo(fileJ2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    public f(byte[] bArr) {
    }
}
