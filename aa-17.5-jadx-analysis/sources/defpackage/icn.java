package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class icn implements hup {
    @Override // defpackage.htz
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hum humVar) throws Throwable {
        try {
            ifl.c(((icm) ((hwx) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.hup
    public final int b() {
        return 1;
    }
}
