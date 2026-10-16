package j$.util.stream;

/* loaded from: classes2.dex */
final class M3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f38040a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f38041b;

    M3(Runnable runnable, Runnable runnable2) {
        this.f38040a = runnable;
        this.f38041b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f38041b;
        try {
            this.f38040a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
