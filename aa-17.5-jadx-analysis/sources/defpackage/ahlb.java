package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.impl.CronetManifest;

/* loaded from: classes3.dex */
public final class ahlb {
    private ahlb() {
    }

    public static UploadDataProvider a(byte[] bArr, int i, int i2) {
        return new akbp(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static erb b(Context context) throws ClassNotFoundException {
        boolean z = false;
        try {
            Class.forName("org.chromium.net.impl.NativeCronetEngineBuilderImpl", false, CronetManifest.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        return akbw.a(context, true, CronetManifest.a(context).getBoolean("android.net.http.EnableTelemetry", !z));
    }

    public /* synthetic */ ahlb(afeu afeuVar) {
        this();
    }
}
