package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
class yjw extends yit implements yjy {
    public volatile yjz b;

    public yjw(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = ykc.a;
    }

    @Override // defpackage.yiy
    public final Object d() {
        return this.b.get();
    }

    @Override // defpackage.yjy
    public final yjz e() {
        return this.b;
    }
}
