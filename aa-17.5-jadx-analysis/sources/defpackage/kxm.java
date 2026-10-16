package defpackage;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class kxm implements kxe {
    public final kxr c;
    private final lah d = lah.a();
    private final kxl e;
    private final kwv f;
    private final kww g;

    public kxm(Context context, AudioRecord audioRecord, kxr kxrVar, Looper looper) {
        kwv kwvVarH = kfl.h();
        this.f = kwvVarH;
        kxj kxjVar = new kxj(this);
        this.g = kxjVar;
        this.e = new kxl(context, audioRecord, looper);
        this.c = kxrVar;
        kwvVarH.r(kxjVar);
    }

    @Override // defpackage.kxe
    public final ParcelFileDescriptor a() throws IOException {
        this.d.h(401, null);
        return this.e.a();
    }

    @Override // defpackage.kxe
    public final void b() {
        this.d.h(405, null);
        this.e.b();
    }

    @Override // defpackage.kxe
    public final void c() {
        b();
        this.f.I(this.g);
        this.c.b();
        kxl kxlVar = this.e;
        kxlVar.getLooper().quitSafely();
        kxlVar.a.shutdown();
    }

    @Override // defpackage.kxe
    public final boolean d() {
        return this.e.b != null;
    }
}
