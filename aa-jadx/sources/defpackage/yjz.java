package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class yjz extends java.lang.ref.WeakReference implements defpackage.yke {
    final int a;

    public yjz(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, int i) {
        super(obj, referenceQueue);
        this.a = i;
    }

    @Override // defpackage.yke
    public final int a() {
        return this.a;
    }

    @Override // defpackage.yke
    public defpackage.yke b() {
        return null;
    }

    @Override // defpackage.yke
    public final java.lang.Object c() {
        return get();
    }
}
