package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class smv extends defpackage.stq {
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.wtf("BasePendingResult", defpackage.a.cb(message, "Don't know how to handle message: "), new java.lang.Exception());
                return;
            } else {
                ((com.google.android.gms.common.api.internal.BasePendingResult) message.obj).h(com.google.android.gms.common.api.Status.d);
                return;
            }
        }
        android.util.Pair pair = (android.util.Pair) message.obj;
        defpackage.sme smeVar = (defpackage.sme) pair.second;
        try {
            throw null;
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.common.api.internal.BasePendingResult.i(smeVar);
            throw e;
        }
    }
}
