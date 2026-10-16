package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class hyl implements htz {
    @Override // defpackage.htz
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hum humVar) throws Throwable {
        try {
            ifl.c((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}
