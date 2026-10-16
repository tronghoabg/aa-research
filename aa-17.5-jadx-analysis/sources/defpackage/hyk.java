package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hyk implements hzi {
    private final /* synthetic */ int a;

    public hyk(int i) {
        this.a = i;
    }

    @Override // defpackage.hzi
    public final hzh b(hzm hzmVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new hyw(hzmVar.a(Uri.class, InputStream.class), 3) : new hyw(hzmVar.a(Uri.class, ParcelFileDescriptor.class), 3) : new hyw(hzmVar.a(Uri.class, AssetFileDescriptor.class), 3) : new hym() : new hyw(new hyj(1), 1) : new hyw(new hyj(0), 1);
    }
}
