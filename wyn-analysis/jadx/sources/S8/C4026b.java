package s8;

/* renamed from: s8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4026b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45321a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45322b;

    private final synchronized void c() {
        this.f45322b = false;
    }

    private final synchronized void d() {
        this.f45322b = false;
    }

    private final synchronized boolean f() {
        if (this.f45322b) {
            return false;
        }
        this.f45322b = true;
        notifyAll();
        return true;
    }

    private final synchronized boolean g() {
        if (this.f45322b) {
            return false;
        }
        this.f45322b = true;
        notifyAll();
        return true;
    }

    public synchronized void a() {
        while (!this.f45322b) {
            wait();
        }
    }

    public synchronized void b() {
        switch (this.f45321a) {
            case 3:
                c();
                break;
            default:
                d();
                break;
        }
    }

    public synchronized boolean e() {
        switch (this.f45321a) {
            case 3:
                return f();
            default:
                return g();
        }
    }

    public /* synthetic */ C4026b(boolean z2, int i5) {
        this.f45321a = i5;
        this.f45322b = z2;
    }
}
