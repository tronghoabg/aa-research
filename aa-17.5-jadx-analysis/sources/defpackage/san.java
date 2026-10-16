package defpackage;

import android.opengl.GLES32;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final /* synthetic */ class san implements Closeable {
    private final /* synthetic */ int a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i == 0) {
            ypf ypfVar = CarSetupServiceImpl.a;
        } else if (i == 2 && vao.a()) {
            GLES32.glPopDebugGroup();
        }
    }

    public san(byte[] bArr, int i) {
        this.a = i;
    }
}
