package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
final class xzz implements yac {
    final Object a;

    public xzz(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.yac
    public final int a() {
        return 1;
    }

    @Override // defpackage.yac
    public final yao c() {
        return null;
    }

    @Override // defpackage.yac
    public final Object d() {
        return this.a;
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
    public final Object get() {
        return this.a;
    }

    @Override // defpackage.yac
    public final void e(Object obj) {
    }

    @Override // defpackage.yac
    public final yac b(ReferenceQueue referenceQueue, Object obj, yao yaoVar) {
        return this;
    }
}
