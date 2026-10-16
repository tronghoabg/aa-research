package android.support.v4.media;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class g extends f {
    @Override // android.support.v4.media.e
    public final void e(String str, k kVar) {
        if (this.f454g == null || this.f452e < 2) {
            this.f449b.subscribe(str, kVar.f460a);
        } else {
            super.e(str, kVar);
        }
    }

    @Override // android.support.v4.media.e
    public final void f(String str) {
        if (this.f454g == null || this.f452e < 2) {
            this.f449b.unsubscribe(str);
        } else {
            super.f(str);
        }
    }
}
