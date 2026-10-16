package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yba extends java.lang.ref.SoftReference implements defpackage.ybi {
    final defpackage.ybu a;

    public yba(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, defpackage.ybu ybuVar) {
        super(obj, referenceQueue);
        this.a = ybuVar;
    }

    @Override // defpackage.ybi
    public final int a() {
        return 1;
    }

    @Override // defpackage.ybi
    public final defpackage.ybi b(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, defpackage.ybu ybuVar) {
        return new defpackage.yba(referenceQueue, obj, ybuVar);
    }

    @Override // defpackage.ybi
    public final defpackage.ybu c() {
        return this.a;
    }

    @Override // defpackage.ybi
    public final java.lang.Object d() {
        return get();
    }

    @Override // defpackage.ybi
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ybi
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ybi
    public final void e(java.lang.Object obj) {
    }
}
