package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
class yjt extends yit implements yiy {
    public volatile Object b;

    public yjt(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = null;
    }

    @Override // defpackage.yiy
    public final Object d() {
        return this.b;
    }
}
