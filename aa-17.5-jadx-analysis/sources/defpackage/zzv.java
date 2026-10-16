package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
final class zzv implements hqx {
    @Override // defpackage.hqx
    public final void a(hrc hrcVar) {
        if (hrcVar.getCause() instanceof OutOfMemoryError) {
            throw new OutOfMemoryError("Rethrowing Volley OOM error: ".concat(String.valueOf(String.valueOf(hrcVar.getCause()))));
        }
        if (ysi.R(hrcVar.getMessage())) {
            return;
        }
        String str = zzz.a;
        if (zrn.e(str, 6)) {
            Log.e(str, hrcVar.getMessage());
        }
    }
}
