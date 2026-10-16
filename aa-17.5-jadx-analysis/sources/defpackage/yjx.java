package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
final class yjx extends yjc {
    public final ReferenceQueue g;
    public final ReferenceQueue h;

    public yjx(ykc ykcVar, int i) {
        super(ykcVar, i);
        this.g = new ReferenceQueue();
        this.h = new ReferenceQueue();
    }

    @Override // defpackage.yjc
    public final void g() {
        n(this.g);
    }

    @Override // defpackage.yjc
    public final void h() {
        e(this.g);
        f(this.h);
    }
}
