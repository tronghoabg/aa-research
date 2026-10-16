package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sxv extends defpackage.sxs {
    @Override // defpackage.sxs
    public final void c(com.google.android.gms.common.api.Status status) {
        if (status.c()) {
            return;
        }
        android.util.Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(java.lang.String.valueOf(java.lang.String.valueOf(status))));
    }
}
