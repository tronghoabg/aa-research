package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
final class yjr extends yjc {
    public final ReferenceQueue g;

    public yjr(ykc ykcVar, int i) {
        super(ykcVar, i);
        this.g = new ReferenceQueue();
    }

    @Override // defpackage.yjc
    public final void g() {
        n(this.g);
    }

    @Override // defpackage.yjc
    public final void h() {
        e(this.g);
    }
}
