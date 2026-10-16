package Ef;

/* renamed from: Ef.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0481c0 extends A {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3720e = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f3721b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3722c;

    /* renamed from: d, reason: collision with root package name */
    public ff.l f3723d;

    public final void B(P p10) {
        ff.l lVar = this.f3723d;
        if (lVar == null) {
            lVar = new ff.l();
            this.f3723d = lVar;
        }
        lVar.addLast(p10);
    }

    public abstract Thread D();

    public final void J(boolean z2) {
        this.f3721b = (z2 ? 4294967296L : 1L) + this.f3721b;
        if (z2) {
            return;
        }
        this.f3722c = true;
    }

    public abstract long P();

    public final boolean Q() {
        ff.l lVar = this.f3723d;
        if (lVar == null) {
            return false;
        }
        P p10 = (P) (lVar.isEmpty() ? null : lVar.removeFirst());
        if (p10 == null) {
            return false;
        }
        p10.run();
        return true;
    }

    public void V(long j8, Z z2) {
        I.f3678i.a0(j8, z2);
    }

    public abstract void shutdown();

    public final void z(boolean z2) {
        long j8 = this.f3721b - (z2 ? 4294967296L : 1L);
        this.f3721b = j8;
        if (j8 <= 0 && this.f3722c) {
            shutdown();
        }
    }
}
