package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class yah extends WeakReference implements yac {
    final yao a;

    public yah(ReferenceQueue referenceQueue, Object obj, yao yaoVar) {
        super(obj, referenceQueue);
        this.a = yaoVar;
    }

    @Override // defpackage.yac
    public final int a() {
        return 1;
    }

    @Override // defpackage.yac
    public final yac b(ReferenceQueue referenceQueue, Object obj, yao yaoVar) {
        return new yah(referenceQueue, obj, yaoVar);
    }

    @Override // defpackage.yac
    public final yao c() {
        return this.a;
    }

    @Override // defpackage.yac
    public final Object d() {
        return get();
    }

    @Override // defpackage.yac
    public final boolean f() {
        return true;
    }

    @Override // defpackage.yac
    public final boolean g() {
        return false;
    }

    @Override // defpackage.yac
    public final void e(Object obj) {
    }
}
