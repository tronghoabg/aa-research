package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ek extends android.os.Handler {
    private final java.lang.ref.WeakReference a;

    public ek(android.content.DialogInterface dialogInterface) {
        this.a = new java.lang.ref.WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((android.content.DialogInterface.OnClickListener) message.obj).onClick((android.content.DialogInterface) this.a.get(), message.what);
        } else {
            if (i != 1) {
                return;
            }
            ((android.content.DialogInterface) message.obj).dismiss();
        }
    }
}
