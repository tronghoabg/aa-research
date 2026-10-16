package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class n4 implements java.lang.Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ n4(java.lang.Object obj, java.lang.Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.c;
        switch (b) {
            case 0:
                java.lang.Runnable runnable = (java.lang.Runnable) obj2;
                try {
                    ((java.lang.Runnable) obj).run();
                    runnable.run();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        runnable.run();
                        break;
                    } catch (java.lang.Throwable th2) {
                        try {
                            th.addSuppressed(th2);
                            break;
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    throw th;
                }
            default:
                j$.util.stream.Stream stream = (j$.util.stream.Stream) obj2;
                try {
                    ((j$.util.stream.Stream) obj).close();
                    stream.close();
                    return;
                } catch (java.lang.Throwable th3) {
                    try {
                        stream.close();
                        break;
                    } catch (java.lang.Throwable th4) {
                        try {
                            th3.addSuppressed(th4);
                            break;
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                    throw th3;
                }
        }
    }
}
