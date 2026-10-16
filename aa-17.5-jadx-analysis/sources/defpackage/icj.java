package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class icj implements huo {
    private final /* synthetic */ int a;

    public icj(int i) {
        this.a = i;
    }

    @Override // defpackage.huo
    public final /* synthetic */ hwx a(Object obj, int i, int i2, hum humVar) throws IOException {
        int i3 = this.a;
        return i3 != 0 ? i3 != 1 ? new iaa((File) obj) : new icc((Bitmap) obj, 1) : ich.g((Drawable) obj);
    }

    @Override // defpackage.huo
    public final /* synthetic */ boolean b(Object obj, hum humVar) throws IOException {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return true;
        }
        return true;
    }
}
