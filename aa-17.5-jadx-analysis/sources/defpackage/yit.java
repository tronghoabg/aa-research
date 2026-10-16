package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
abstract class yit extends WeakReference implements yiy {
    final int a;

    public yit(ReferenceQueue referenceQueue, Object obj, int i) {
        super(obj, referenceQueue);
        this.a = i;
    }

    @Override // defpackage.yiy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.yiy
    public yiy b() {
        return null;
    }

    @Override // defpackage.yiy
    public final Object c() {
        return get();
    }
}
