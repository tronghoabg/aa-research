package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class wex extends wfw {
    private final Context a;
    private final wfv b;
    private final Object c = new Object();
    private volatile String d;

    public wex(rju rjuVar) {
        this.b = new wfa((wfg) rjuVar.b);
        this.a = (Context) rjuVar.a;
    }

    private final boolean i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    private static final void j() throws wfd {
        throw new wfd("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.wfw
    protected final Uri a(Uri uri) throws IOException {
        if (i(uri)) {
            throw new wfh("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        builderPath.path(fileC.getAbsolutePath());
        return builderPath.encodedFragment(wfp.a(yflVar.g())).build();
    }

    @Override // defpackage.wfw
    protected final wfv b() {
        return this.b;
    }

    @Override // defpackage.wfw, defpackage.wfv
    public final File c(Uri uri) throws IOException {
        if (i(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.a;
        File fileG = new kwp(context, (byte[]) null).g(uri);
        if (!tmz.e(context)) {
            String str = this.d;
            if (str == null) {
                synchronized (this.c) {
                    str = this.d;
                    if (str == null) {
                        String absolutePath = woy.aC(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                        this.d = absolutePath;
                        str = absolutePath;
                    }
                }
            }
            if (!fileG.getAbsolutePath().startsWith(str)) {
                throw new wfd("Cannot access credential-protected data from direct boot");
            }
        }
        return fileG;
    }

    @Override // defpackage.wfw, defpackage.wfv
    public final InputStream d(Uri uri) throws IOException {
        if (!i(uri)) {
            return this.b.d(a(uri));
        }
        j();
        throw null;
    }

    @Override // defpackage.wfv
    public final String e() {
        return "android";
    }

    @Override // defpackage.wfw, defpackage.wfv
    public final boolean f(Uri uri) throws IOException {
        if (!i(uri)) {
            return this.b.f(a(uri));
        }
        j();
        throw null;
    }
}
