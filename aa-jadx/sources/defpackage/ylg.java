package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ylg extends java.lang.ref.WeakReference implements defpackage.ylf {
    final defpackage.yke a;

    public ylg(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, defpackage.yke ykeVar) {
        super(obj, referenceQueue);
        this.a = ykeVar;
    }

    @Override // defpackage.ylf
    public final defpackage.yke a() {
        return this.a;
    }

    @Override // defpackage.ylf
    public final defpackage.ylf b(java.lang.ref.ReferenceQueue referenceQueue, defpackage.yke ykeVar) {
        return new defpackage.ylg(referenceQueue, get(), ykeVar);
    }
}
