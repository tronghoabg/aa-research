package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ay implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f46631a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f46632b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f46633c;

    ay(bh bhVar, e.a.ee eeVar, int i2) {
        this.f46633c = i2;
        this.f46632b = eeVar;
        Objects.requireNonNull(bhVar);
        this.f46631a = bhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f46633c == 0) {
            ((bh) this.f46632b).f46663h.d(this.f46631a);
            return;
        }
        e.a.k kVar = ((bh) this.f46631a).f46663h;
        e.a.ee eeVar = (e.a.ee) this.f46632b;
        kVar.a(eeVar.i(), eeVar.j());
    }

    ay(bh bhVar, Object obj, int i2) {
        this.f46633c = i2;
        this.f46631a = obj;
        Objects.requireNonNull(bhVar);
        this.f46632b = bhVar;
    }
}
