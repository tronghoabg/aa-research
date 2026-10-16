package U3;

import p8.p;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final j f12255a;

    /* renamed from: b, reason: collision with root package name */
    public final p f12256b;

    public e(j jVar, p pVar) {
        this.f12255a = jVar;
        this.f12256b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12255a.f12264a != this) {
            return;
        }
        if (h.f12262f.n(this.f12255a, this, h.e(this.f12256b))) {
            h.b(this.f12255a);
        }
    }
}
