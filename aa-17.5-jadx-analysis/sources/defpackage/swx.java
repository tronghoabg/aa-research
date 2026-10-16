package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class swx extends swu {
    @Override // defpackage.swu
    public final void c(Status status) {
        if (status.c()) {
            return;
        }
        Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
    }
}
