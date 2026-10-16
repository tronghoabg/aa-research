package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
final class vst implements xyc {
    private final Context a;

    public vst(Context context) {
        this.a = context;
    }

    @Override // defpackage.xyc
    public final /* bridge */ /* synthetic */ Object gu() {
        Context context = this.a;
        return !tmz.e(context) ? xvy.a : xxh.h(new File(context.getFilesDir(), "primes/crash"));
    }
}
