package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* loaded from: classes2.dex */
final class ibq implements iay {
    private final ibp a;
    private final ifo b;

    public ibq(ibp ibpVar, ifo ifoVar) {
        this.a = ibpVar;
        this.b = ifoVar;
    }

    @Override // defpackage.iay
    public final void a(hxe hxeVar, Bitmap bitmap) throws IOException {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            hxeVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.iay
    public final void b() {
        this.a.a();
    }
}
