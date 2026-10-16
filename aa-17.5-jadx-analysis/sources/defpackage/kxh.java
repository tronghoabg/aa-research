package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class kxh implements kxe {
    private final lah c = lah.a();
    private final kxg d;

    public kxh(Context context, rny rnyVar, Looper looper) {
        this.d = new kxg(context, rnyVar, looper);
    }

    @Override // defpackage.kxe
    public final ParcelFileDescriptor a() throws IOException {
        this.c.h(401, null);
        return this.d.a();
    }

    @Override // defpackage.kxe
    public final void b() {
        this.c.h(405, null);
        this.d.b();
    }

    @Override // defpackage.kxe
    public final void c() {
        b();
        kxg kxgVar = this.d;
        kxgVar.getLooper().quitSafely();
        kxgVar.a.shutdown();
    }

    @Override // defpackage.kxe
    public final boolean d() {
        return this.d.b != null;
    }
}
