package defpackage;

import android.net.Uri;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class wfa implements wfv {
    public final wfg a;

    public wfa(wfg wfgVar) {
        this.a = wfgVar;
    }

    @Override // defpackage.wfv
    public final File c(Uri uri) throws IOException {
        return woy.aB(uri);
    }

    @Override // defpackage.wfv
    public final InputStream d(Uri uri) throws IOException {
        File fileAB = woy.aB(uri);
        return new wfk(new FileInputStream(fileAB), fileAB);
    }

    @Override // defpackage.wfv
    public final String e() {
        return "file";
    }

    @Override // defpackage.wfv
    public final boolean f(Uri uri) throws IOException {
        return woy.aB(uri).exists();
    }

    @Override // defpackage.wfv
    public final void g(Uri uri) throws IOException {
        File fileAB = woy.aB(uri);
        if (fileAB.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileAB.delete()) {
            return;
        }
        if (!fileAB.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.wfv
    public final void h(Uri uri, Uri uri2) throws IOException {
        File fileAB = woy.aB(uri);
        File fileAB2 = woy.aB(uri2);
        yrm.g(fileAB2);
        if (!fileAB.renameTo(fileAB2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.wfv
    public final wfg k() throws IOException {
        return this.a;
    }

    @Override // defpackage.wfv
    @ResultIgnorabilityUnspecified
    public final OutputStream l(Uri uri) throws IOException {
        File fileAB = woy.aB(uri);
        yrm.g(fileAB);
        return new wfl(new FileOutputStream(fileAB), fileAB);
    }
}
