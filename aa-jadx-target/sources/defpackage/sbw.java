package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbw extends defpackage.sdd {
    private final java.io.Closeable a;

    public sbw(java.io.Closeable closeable) {
        this.a = closeable;
    }

    @Override // defpackage.sde
    public final void a() {
        try {
            this.a.close();
        } catch (java.io.IOException e) {
            com.google.android.gms.carsetup.CarSetupServiceImpl.a.h().p(e).ai(8649).u("Failed to close connection.");
        }
    }
}
