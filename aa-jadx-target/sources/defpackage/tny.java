package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tny {
    private final android.content.Context a;
    private final java.lang.Object b = new java.lang.Object();
    private java.io.File c;

    public tny(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public final java.io.File a() {
        java.io.File fileM;
        synchronized (this.b) {
            fileM = this.c;
            if (fileM == null) {
                fileM = ll$.ExternalSyntheticApiModelOutline0.m(this.a);
                this.c = fileM;
            }
        }
        return fileM;
    }
}
