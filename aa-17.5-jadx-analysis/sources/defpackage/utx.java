package defpackage;

/* loaded from: classes3.dex */
public final class utx {
    public boolean a;
    public boolean b;
    public boolean c;

    private final boolean e() {
        return (this.c || this.b) && this.a;
    }

    public final synchronized void a() {
        this.b = false;
        this.a = false;
        this.c = false;
    }

    public final synchronized boolean b() {
        this.b = true;
        return e();
    }

    public final synchronized boolean c() {
        this.c = true;
        return e();
    }

    public final synchronized boolean d() {
        this.a = true;
        return e();
    }
}
