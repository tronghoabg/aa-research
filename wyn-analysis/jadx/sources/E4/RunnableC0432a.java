package E4;

import android.os.Process;

/* renamed from: E4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0432a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2862a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f2863b;

    public /* synthetic */ RunnableC0432a(int i5, Runnable runnable) {
        this.f2862a = i5;
        this.f2863b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f2862a) {
            case 0:
                Process.setThreadPriority(10);
                this.f2863b.run();
                break;
            case 1:
                this.f2863b.run();
                break;
            case 2:
                Process.setThreadPriority(0);
                this.f2863b.run();
                break;
            default:
                try {
                    this.f2863b.run();
                    break;
                } catch (Exception e7) {
                    ic.d.s(e7, "Executor", "Background execution failure.");
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f2862a) {
            case 1:
                return this.f2863b.toString();
            default:
                return super.toString();
        }
    }
}
