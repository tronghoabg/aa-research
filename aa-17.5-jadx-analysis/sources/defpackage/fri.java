package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class fri implements frl {
    private final /* synthetic */ int a;

    public fri(int i) {
        this.a = i;
    }

    @Override // defpackage.frl
    public final /* synthetic */ frm a(Object obj, ftc ftcVar) {
        int i = this.a;
        if (i == 0) {
            return new frj((Bitmap) obj, ftcVar, 0);
        }
        if (i == 1) {
            Uri uri = (Uri) obj;
            if (ftw.d(uri)) {
                return new frj(uri, ftcVar, 1);
            }
            return null;
        }
        if (i == 2) {
            return new frj((ByteBuffer) obj, ftcVar, 2);
        }
        if (i == 3) {
            Uri uri2 = (Uri) obj;
            if (affa.f(uri2.getScheme(), "content")) {
                return new frj(uri2, ftcVar, 3);
            }
            return null;
        }
        if (i == 4) {
            return new frj((Drawable) obj, ftcVar, 4);
        }
        if (i == 5) {
            return new frn((File) obj);
        }
        Uri uri3 = (Uri) obj;
        if (affa.f(uri3.getScheme(), "android.resource")) {
            return new frj(uri3, ftcVar, 5);
        }
        return null;
    }
}
