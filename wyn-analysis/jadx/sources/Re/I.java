package Re;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public abstract class I extends Ye.a implements He.f, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final He.l f10654a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10655b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10656c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f10657d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public ug.b f10658e;

    /* renamed from: f, reason: collision with root package name */
    public Oe.h f10659f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f10660g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10661h;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f10662i;

    /* renamed from: j, reason: collision with root package name */
    public int f10663j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10664l;

    public I(He.l lVar, int i5) {
        this.f10654a = lVar;
        this.f10655b = i5;
        this.f10656c = i5 - (i5 >> 2);
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f10661h) {
            return;
        }
        if (this.f10663j == 2) {
            j();
            return;
        }
        if (!this.f10659f.offer(obj)) {
            this.f10658e.cancel();
            this.f10662i = new Ke.c("Queue is full?!");
            this.f10661h = true;
        }
        j();
    }

    @Override // Oe.d
    public final int c(int i5) {
        this.f10664l = true;
        return 2;
    }

    @Override // ug.b
    public final void cancel() {
        if (this.f10660g) {
            return;
        }
        this.f10660g = true;
        this.f10658e.cancel();
        this.f10654a.dispose();
        if (getAndIncrement() == 0) {
            this.f10659f.clear();
        }
    }

    @Override // Oe.h
    public final void clear() {
        this.f10659f.clear();
    }

    public final boolean f(boolean z2, boolean z10, He.f fVar) {
        if (this.f10660g) {
            clear();
            return true;
        }
        if (!z2) {
            return false;
        }
        Throwable th = this.f10662i;
        if (th != null) {
            clear();
            fVar.onError(th);
            this.f10654a.dispose();
            return true;
        }
        if (!z10) {
            return false;
        }
        fVar.onComplete();
        this.f10654a.dispose();
        return true;
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.f10659f.isEmpty();
    }

    public final void j() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f10654a.b(this);
    }

    @Override // He.f
    public final void onComplete() {
        if (this.f10661h) {
            return;
        }
        this.f10661h = true;
        j();
    }

    @Override // He.f
    public final void onError(Throwable th) {
        if (this.f10661h) {
            S3.f.A(th);
            return;
        }
        this.f10662i = th;
        this.f10661h = true;
        j();
    }

    @Override // ug.b
    public final void request(long j8) {
        if (Ye.f.c(j8)) {
            Fe.e.f(this.f10657d, j8);
            j();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10664l) {
            h();
        } else if (this.f10663j == 1) {
            i();
        } else {
            g();
        }
    }
}
