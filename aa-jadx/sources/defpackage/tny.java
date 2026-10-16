package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tny {
    private final android.content.Context a;
    private final java.lang.Object b = new java.lang.Object();
    private java.io.File c;

    public tny(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public final java.io.File a() {
        java.io.File dataDir;
        synchronized (this.b) {
            dataDir = this.c;
            if (dataDir == null) {
                dataDir = this.a.getDataDir();
                this.c = dataDir;
            }
        }
        return dataDir;
    }
}
