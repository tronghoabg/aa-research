package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class az implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f46634a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f46635b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f46636c;

    az(e eVar, int i2, int i3) {
        this.f46636c = i3;
        this.f46634a = i2;
        Objects.requireNonNull(eVar);
        this.f46635b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f46636c == 0) {
            ((bh) this.f46635b).f46663h.c(this.f46634a);
            return;
        }
        try {
            int i2 = e.b.b.f47862a;
            ((e) this.f46635b).q.c(this.f46634a);
        } catch (Throwable th) {
            ((e) this.f46635b).B(th);
        }
    }

    az(bh bhVar, int i2, int i3) {
        this.f46636c = i3;
        this.f46634a = i2;
        Objects.requireNonNull(bhVar);
        this.f46635b = bhVar;
    }
}
