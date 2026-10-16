package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class wfw implements wfv {
    protected Uri a(Uri uri) throws IOException {
        throw null;
    }

    protected abstract wfv b();

    @Override // defpackage.wfv
    public /* synthetic */ File c(Uri uri) {
        throw null;
    }

    @Override // defpackage.wfv
    public InputStream d(Uri uri) throws IOException {
        throw null;
    }

    @Override // defpackage.wfv
    public boolean f(Uri uri) throws IOException {
        throw null;
    }

    @Override // defpackage.wfv
    public final void g(Uri uri) throws IOException {
        b().g(a(uri));
    }

    @Override // defpackage.wfv
    public final void h(Uri uri, Uri uri2) throws IOException {
        b().h(a(uri), a(uri2));
    }

    @Override // defpackage.wfv
    public final wfg k() throws IOException {
        return ((wfa) b()).a;
    }

    @Override // defpackage.wfv
    public final OutputStream l(Uri uri) throws IOException {
        return b().l(a(uri));
    }
}
