package defpackage;

import android.net.Uri;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface wfv {
    File c(Uri uri) throws IOException;

    InputStream d(Uri uri) throws IOException;

    String e();

    @ResultIgnorabilityUnspecified
    boolean f(Uri uri) throws IOException;

    void g(Uri uri) throws IOException;

    void h(Uri uri, Uri uri2) throws IOException;

    wfg k() throws IOException;

    OutputStream l(Uri uri) throws IOException;
}
