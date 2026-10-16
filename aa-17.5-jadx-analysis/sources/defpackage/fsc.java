package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class fsc implements fsb {
    private final /* synthetic */ int a;

    public fsc(int i) {
        this.a = i;
    }

    @Override // defpackage.fsb
    public final /* synthetic */ String a(Object obj, ftc ftcVar) {
        if (this.a != 0) {
            File file = (File) obj;
            return file.getPath() + ":" + file.lastModified();
        }
        Uri uri = (Uri) obj;
        if (!affa.f(uri.getScheme(), "android.resource")) {
            String string = uri.toString();
            string.getClass();
            return string;
        }
        Configuration configuration = ftcVar.a.getResources().getConfiguration();
        configuration.getClass();
        Bitmap.Config[] configArr = ftw.a;
        return uri + "-" + (configuration.uiMode & 48);
    }
}
